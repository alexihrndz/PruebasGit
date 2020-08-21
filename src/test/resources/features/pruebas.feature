Feature: Pruebas GIT

  Scenario: Realizar pruebas para colaboracion de git
    Given que somos un equipo
    When trabajemos en el mismo proyecto
    Then podemos integrar los cambios


  Scenario: se agrega un cambio para la rama nuevosCambios1
    Given que somos un equipo
    When trabajemos en el mismo proyecto
    Then podemos integrar los cambios

  Scenario: Otros cambios para otra rama nuevosCambios2
    Given que somos un equipo
    When trabajemos en el mismo proyecto
    Then podemos integrar los cambios

    #nuevo comentario para commit
    #se actualiza el .gitignore
    #comentario en master
    #nuevo cambio para probar merge
  #otro comentario