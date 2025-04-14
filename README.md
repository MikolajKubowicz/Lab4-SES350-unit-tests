# Lab4-SES350-unit-tests
For my object oriented programming class, I created a Rectangle class with length and width properties, and implemented a getArea() method to calculate the area of the rectangle. I then developed a corresponding JUnit 5 test class, RectangleTest, to verify the correctness of the getArea() method.

The test class includes both happy path and sad path test cases:

Happy path: Valid positive dimensions (e.g., 3 × 4 = 12)

Sad path: Edge cases including zero and negative values for length or width

Using the lecture's testing strategy, I applied input/output partitioning to ensure comprehensive coverage. Assertions such as assertEquals() were used to verify expected outcomes. This lab helped reinforce concepts of structured unit testing, assertion-based verification, and testing methodology using JUnit.
