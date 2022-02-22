PASOS

  a. ARQUITECTURA: Se crea una interfaz y una implementación por capa.
  b. REGISTRAR BEAN: Se anota las implementaciones Service y Repository con la anotación: @Service y @Repository (De esta manera se DEFINEN ambas instancias en el contenedor de Spring)
  c. ACCEDER AL BEAN (Inyección de dependencias): Accedemos a las 2 instancias definidas (objetos=beans) DEFINIDAS en el contenedor de SPRING con: @Autowired (ámbito SINGLETON).   

TEORÍA
	  Los estereotipos b) sirven para registar un BEAN en el contenedor de Spring. Y se contextualiza su uso @Service @Repository, esto es una recomendación.
