object decryption {
  def decryptFunc(ch: Char, shiftKey: Int): Char = {
    val character = ch
    val unicodeValue = character.toInt
    val shiftedValue = unicodeValue - shiftKey

    if (unicodeValue >= 65 && unicodeValue <= 90) {
      if (shiftedValue >= 65) {
        return shiftedValue.toChar
      } else {
        return (91 - (65-shiftedValue)).toChar
      }
    } else if(unicodeValue>=97 && unicodeValue<=122) {
      if (shiftedValue >= 97) {
        return shiftedValue.toChar
      } else {
        return (123 - (97 - shiftedValue)).toChar
      }
    }else{
      return ch
    }
  }
}
