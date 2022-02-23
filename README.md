a. Tenemos dos implementaciones de la misma interfaz en una capa de la app.
b. Una la nombramos:

	@Repository	                  
	@Qualifier("persona1")
	
	Otra
	
	@Repository	                  
	@Qualifier("persona2")	

c. En el servicio para usar por ejemplo la implementación "persona2", accedemos a esta implementación que está en el contenedor de Spring
   Usando:
   
		@Autowired
		@Qualifier("persona2")
		private IPersonaRepo iPersonaRepo;
		

IMPORTANCIA, imaginemos esta situación.

Tenemos:

	Una interfaz que define unas operaciones.
	Una clase antigua que la implementa con una tecnología_1.
	
	Ahora: 
	Se crea una clase nueva que la implementa con una tecnología_2
	
	Para usar esta nueva implementación bastará con cambiar el @Qualifier("---") para apuntar a la nueva implementación.
	De esta manera cuando se haga uso de iPersonaRepo ya estará apuntando a las nuevas implemtaciones de la interfaz.
	
