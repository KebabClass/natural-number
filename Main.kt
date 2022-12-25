fun main() {

    var input = readln().toInt()
    print("$input ")

    
    do {
        // If user enters 1 the program stops
        if (input == 1) {
            break
            
        // If user enters 0 the program stops
        } else if (input == 0) {
            break

        // If a user enters a negative number the program stops
        } else if (input < 0) {
            println()
            println("Please enter a positive number.")
            break

        // If user enters a positive number their input is halved
        } else if (input % 2 == 0){
            input = input / 2
            print(" $input ")

        // If user enters a negative number it is multiplied by 3 and then 1 is added to that number.
        } else {
            input = input * 3 + 1
            print(" $input ")
        }

    // The program finishes when the users input is = to 1
    } while (input != 1)

}
