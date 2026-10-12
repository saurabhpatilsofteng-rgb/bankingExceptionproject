# bankingExceptionproject
Exception In java 
Java Exception Handling — Short Notes
Exception handling is used to handle runtime/compile-time problems so that the application can continue or fail gracefully.
1. Exception
An exception is an unwanted event that interrupts normal program execution.
Example:
int a = 10 / 0;  // ArithmeticException

2. try
Contains code that may cause an exception.
try {
    int x = 10 / 0;
}

3. catch
Handles the exception.
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}

4. finally
Executes whether an exception occurs or not. Commonly used for cleanup.
finally {
    System.out.println("Cleanup");
}

5. throw
Used to manually throw an exception.
throw new IllegalArgumentException("Invalid age");

6. throws
Declares that a method may throw exceptions.
void readFile() throws IOException {
    // code
}

7. Checked Exception
Checked at compile time.
Examples:
- IOException
- SQLException
- FileNotFoundException
Must be handled using try-catch or declared using throws.
8. Unchecked Exception
Occurs mainly at runtime.
Examples:
- NullPointerException
- ArithmeticException
- ArrayIndexOutOfBoundsException
- IllegalArgumentException
These extend RuntimeException.
9. Error
Serious JVM/system-level problem that applications normally don't handle.
Examples:
- OutOfMemoryError
- StackOverflowError
10. Exception Hierarchy
Throwable
├── Error
└── Exception
    ├── RuntimeException
    └── Other checked exceptions

11. Multiple Catch
try {
    // code
} catch (ArithmeticException e) {
    // handle
} catch (NullPointerException e) {
    // handle
}

12. Custom Exception
We can create our own exception:
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

Interview One-Line Answer
Exception handling in Java is a mechanism used to handle abnormal situations using try, catch, finally, throw, and throws so that program execution can be managed safely.
