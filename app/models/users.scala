package models

object Users {
  def get(): List[Map[Symbol,Any]] = {
    List(Map('name -> "Tom", 'message -> "I'm Tom."),
        Map('name -> "Ken", 'message -> "I'm Ken."),
        Map('name -> "John", 'message -> "I'm John."),
        Map('name -> "Mai", 'message -> "I'm Mai.")
        )
  }
}
