

# SOLID Principles Code Samples

This repository contains code samples that demonstrate the SOLID principles of object-oriented design. Each principle is illustrated with a simple example in the corresponding folder. The code is written in Java, but the concepts apply to any object-oriented programming language.

## SOLID Principles

SOLID is an acronym for five design principles that help developers create more maintainable and flexible software. Here's a brief overview of each principle:

- **Single Responsibility Principle (SRP)**: A class should have only one reason to change.
- **Open/Closed Principle (OCP)**: Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
- **Liskov Substitution Principle (LSP)**: Subtypes should be substitutable for their base types.
- **Interface Segregation Principle (ISP)**: Clients should not be forced to depend on interfaces they do not use.
- **Dependency Inversion Principle (DIP)**: High-level modules should not depend on low-level modules. Both should depend on abstractions.

## Code Samples

The following code samples are included in this repository:

- `srp`: demonstrates the Single Responsibility Principle by separating concerns into different classes.
- `ocp`: demonstrates the Open/Closed Principle by using abstraction and polymorphism to allow for easy extension without modification.
- `lsp`: demonstrates the Liskov Substitution Principle by ensuring that subtypes can be used in place of their base types.
- `isp`: demonstrates the Interface Segregation Principle by breaking down large interfaces into smaller, more specific ones.
- `dip`: demonstrates the Dependency Inversion Principle by using abstractions to decouple high-level modules from low-level modules.

Each folder contains a `README.md` file with more detailed explanations of the code and the principles being demonstrated.

## Getting Started

To run the code samples, you'll need to have Java installed on your machine. Clone the repository to your local machine, navigate to the folder for the principle you want to explore, and run the `Main` class. 

```
git clone https://github.com/<pranaykathale123>/solid-principles.git
cd solid-principles/srp
javac *.java
java Main
```

## Contributing

If you have ideas for additional SOLID principle examples or improvements to the existing code, feel free to contribute! Just fork the repository, make your changes, and submit a pull request. 

## License

This code is licensed under the MIT License. See the LICENSE file for details.
