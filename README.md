# CarSelector Java Program

The `CarSelector` program allows the user to choose a car brand from a list by entering an index. If the user enters
invalid input, the program will display an error message and prompt them to try again. The program continues to run
until a valid selection is made or the user chooses to exit.

## Features

- The program displays a list of car brands.
- The user must enter an index corresponding to a car brand (between 0 and 4).
- The program allows the user to exit by entering "e".
- User input is validated, and the program will show an error message for invalid input.

## How to Use

1. Run the program.
2. Enter the index of the car brand from the list (between 0 and 4).
3. If you want to exit the program, enter "e".
4. If the input is invalid, the program will ask the user to try again.

### Example Output:

Enter "e" to exit. 0 - VOLVO 1 - MERCEDES 2 - BMW 3 - LADA 4 - TOYOTA

Enter index of value (number must be between 0 and 4): 2 You chose: BMW. Good choice!

## Technical Details

- Language: Java
- Library used: `Scanner` for user input.
- Error handling: The program checks the input for validity and catches exceptions related to invalid input formats.

## Running the Program

1. Download the file `CarSelector.java`.
2. Compile the program with the following command:
   ```bash
   javac CarSelector.java
   ```
3. Run the program:
    ```bash
    java CarSelector
    ```

## Author

**[Guluzade Gulu](https://github.com/GuluzadeGulu)**