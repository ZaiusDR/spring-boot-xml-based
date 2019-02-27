# Spring Boot XML based config Notes

This are some notes while doing the tutorial.

## Beans

Simple Java objects created by Spring Container.

## Constructor Dependency Injection

Inject `myService` in `ObjectClass`'s constructor

`applicationContext.xml`

```
<bean id="myService"
    class="SampleService">
</bean>

<bean id="myObject"
    class="ObjectClass">
    <constructor-arg ref="myService">
</bean>
```

Behind the scenes

```
SampleService myService = new SampleService();
ObjectClass myObject = new ObjectClass(myService);

```

## Setter Injection

Same but instead of `constructor-arg` use `property` to indicate the setter method name. This looks for a Class 
property and a Setter Method for that property in order to inject the dependency.

## Reference Values from property files

It's possible to configure property files in a key-value format. The properties can then be mapped into the XML:

`application.properties`

```
user.email=sample@email.com
user.name=Mr Sample
```

`applicationContext.xml`

```
<context:property-placeholder location="classpath:application.properties">

<bean id=...
    <property name="emailAddress" value="${user.email}">
</bean>
```

## Beans Lifecycle

Most of the Beans in plain Boot Applications are instantiated as Singletons. This can be changed with:

```
<bean id=...
    ...
    scope="prototype">
</bean>
```

With `prototype` scope, a new instance of the Bean is instantiated when it's injected.

## Customizing Bean Init/Destroy

Useful for initial tasks such as connect to a DB, import data, etc... The methods can't accept any arguments.

```
<bean id=...
    ...
    init-method="myBeanInitLogicMethod">
</bean>
```


```
<bean id=...
    ...
    destroy-method="myBeanDestroyLogicMethod">
</bean>
```
