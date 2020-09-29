# Java User Input Reader
A set of static functions to capture valid user inputs.
Here is an example of implementation:
```java
String name = InputReader.readLineWithMessage(
		"Enter a valid name: ", // Console message
		"[A-Za-z ]+$"); // Regex validation
int age = InputReader.readIntWithMessage(
        "Entera valid age: ", // Console message
        (int i) -> (i > 0)); // Integer must be greater than zero

System.out.printf("%s is %d years old", name, age);
```
The message is optional, as well as the validations. Here is the valid input types:
* int
* long
* double
* String
