object cipher {

  def main(args: Array[String]): Unit = {

    print("Please enter a string:")
    val inputString = scala.io.StdIn.readLine()
    print("Please enter the shifting key:")
    val key = scala.io.StdIn.readInt()
    print("For encrypt press 'e'...For decrypt press 'd'... :")
    val option = scala.io.StdIn.readChar()

    if(option=='e'){
      print("Encrypted message: ")
      for (ch <- inputString) {
        print(encrytion.encryptFunc(ch,key))
      }
    }else if(option=='d'){
      print("Decrypted message: ")
      for (ch <- inputString) {
        print(decryption.decryptFunc(ch, key))
      }
    }else{
      println("The input option is not valid.")
    }
  }
}
