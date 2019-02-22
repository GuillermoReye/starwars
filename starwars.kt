fun main(args: Array<String>){

    println("Welcome you are to the Star Wars Store - Yoda Voice")

    var i: Int= 1
    var total: Int=0
    var inventory = mapOf(
        "1. Blaster Rifle" to 700,
        "2. Lightsaber" to 1000,
        "3. RD-D2" to 10000,
        "4. X-Wing Fighter" to 500000)

    println(inventory)
    println("5. Exit Market")
    println("6. View Cart/Total")
    println("Please select options 1 - 6: ")

    var selection = -1
    var cart: MutableMap<String, Int> = mutableMapOf()


    while (selection !=5){
        var selection: Int = readLine()!!.toInt()
        if (selection == 1){
            cart.put("Blaster Rifle", 700)
            println("You selected Blaster Rifle")
            total+=700
            println("Total: $total")
            println("Please select options 1 - 6: ")
            continue
        }else if(selection == 2){
            cart.put("Lightsaber", 1000)
            println("You selected Lightsaber")
            total+=1000
            println("Total: $total")
            println("Please select options 1 - 6: ")
            continue
        }else if(selection == 3){
            cart.put("R2-D2", 10000)
            println("You selected RD-D2")
            total+=10000
            println("Total: $total")
            println("Please select options 1 - 6: ")
            continue
        }else if(selection == 4){
            cart.put("X-Wing Fighter", 500000)
            println("You selected X-Wing Fighter")
            total+=500000
            println("Total: $total")
            println("Please select options 1 - 6: ")
            continue
        }else if(selection == 5){
            println("Thank you for shopping, your total is: $total")
            break
        }else if(selection == 6)
            println("Your shopping cart: $cart")
            continue
    }



println("MTFBWY")









}
