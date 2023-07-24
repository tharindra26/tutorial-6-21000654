object encrytion {
  def encryptFunc(ch:Char, shiftKey: Int):Char={

    val character = ch
    val unicodeValue = character.toInt
    val shiftedValue=unicodeValue+shiftKey

    if(unicodeValue>=65 && unicodeValue<=90){
      if (shiftedValue<=90){
        return shiftedValue.toChar
      }else{
        return (64+shiftedValue%90).toChar
      }
    }else if(unicodeValue>=97 && unicodeValue<=122){
      if (shiftedValue <= 122) {
        return shiftedValue.toChar
      } else {
        return (96 + shiftedValue % 122).toChar
      }
    }else{
      return ch
    }
  }
}
