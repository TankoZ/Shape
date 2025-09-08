
# 📐 Java Shapes Calculator

This project is a **basic Java program** designed to understand and implement the **key features of Object-Oriented Programming (OOP)**. It demonstrates concepts like **abstraction, encapsulation, polymorphism, and modularity** through the calculation of areas, perimeters, surface areas, and volumes of different shapes.

---

## 📖 Overview

The program is **menu-driven**. Based on user input, it performs calculations for:

* **Circle** → area and perimeter
* **Sphere** → surface area and volume
* **Cylinder** → total surface area, curved surface area, and volume

It is structured using **interfaces** for 2D and 3D shapes:

* `Shape` → defines behavior for **2D shapes** (`area()`, `perimeter()`)
* `Shapetd` → defines behavior for **3D shapes** (`tsurfaceArea()`, `csurfaceArea()`, `volume()`)

---

## 🛠 Features

* Circle:

  * Area = π × r²
  * Perimeter = 2 × π × r
* Sphere:

  * Surface Area = 4 × π × r²
  * Volume = (4/3) × π × r³
* Cylinder:

  * Total Surface Area = 2πrh + 2πr²
  * Curved Surface Area = 2πrh
  * Volume = πr²h

---

## 🚀 How to Run

1. Clone or download the project.
2. Compile all `.java` files:

   ```bash
   javac *.java
   ```
3. Run the program:

   ```bash
   java Main
   ```

---

## 📂 Project Structure

```
.
├── Main.java       # Menu-driven main program
├── Circle.java     # Circle class (implements Shape)
├── Sphere.java     # Sphere class (implements Shapetd)
├── Cylinder.java   # Cylinder class (implements Shapetd)
├── Shape.java      # Interface for 2D shapes
├── Shapetd.java    # Interface for 3D shapes
```

---

## 🖥️ Example Run

```
1. Circle
2. Sphere
3. Cylinder
Enter choice of shape: 2
Enter radius of sphere: 5
Surface Area of sphere is: 314.1592653589793
Volume of sphere is: 523.5987755982989
```

---

## 🎯 OOP Concepts Demonstrated

* **Abstraction** → Defined general contracts using interfaces (`Shape`, `Shapetd`).
* **Encapsulation** → Private fields (`radius`, `height`) with getters and setters.
* **Polymorphism** → Different shapes implement interface methods in their own way.
* **Modularity** → Code is divided into multiple classes, making it reusable and extendable.
* **Inheritance (via Interfaces)** → Classes implement behavior from abstract interfaces.

---

## 👨‍💻 Author

* **Henil Shah**
* Roll No: *22070126102*
* AIML B1
