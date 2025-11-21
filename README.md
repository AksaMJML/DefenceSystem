# DefenceSystem

A small Java desktop simulation that demonstrates defence vehicles (Helicopter, Tank, Submarine) and a control room using the Observer pattern.

## Features
- Simple simulation of multiple vehicle types (Helicopter, Tank, Submarine).
- Observer pattern for updates and control.
- Built with Java and Ant; NetBeans project files are included.

## Requirements
- Java 8 or newer
- Apache Ant (optional; NetBeans can build the project)

## Building
From PowerShell in the project root (where `build.xml` is located):

ant -f build.xml

This will compile sources into `build/classes`.

## Running
After building, run the main class. Example (PowerShell):

java -cp build/classes view.MainController

If you use NetBeans, open the project and run it from the IDE.

## Project structure (key folders)
- `src/` — Java source code
- `build/` — compiled classes and build outputs
- `nbproject/` — NetBeans project metadata

## Contributing
Feel free to open issues or submit pull requests. Add tests under the `test/` folder.

## License
This project is available under the terms of the `LICENSE` file.


(Replace any placeholder author/name in the `LICENSE` file with the correct information.)
