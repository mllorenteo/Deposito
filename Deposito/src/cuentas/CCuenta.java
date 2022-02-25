package cuentas;

	/**
	 * La clase CCuenta almacena los datos de una cuenta bancaria: 
	 * nombre del titular, IBAN, saldo inicial y tipo de interés
	 */
	public class CCuenta {
		 private String nombre; //Cadena de caracteres que almacena el nombre del titula de la cuente
		 private String cuenta; //Cadena de caracteres que almacena el IBAN de la cuenta 
		 private double saldo; //Número real que almacena el saldo inicial de la cuenta
		 private double tipoInteres; //Número real que almacena el tipo de interés de la cuenta
		 
		 /**
		  * Método getNombre(): Método que devuelve el nombre del titular de la cuenta
		  * @return String: Devuelve una cadena de caracteres que almacena el nombre del titular de la cuenta
		  */
		    public String getNombre() {
			return nombre;
		}
		    
		/**
		 * Método setNombre: Este método establece el nombre del titular de la cuenta
		 * @param nombre: Utiliza como parámetro una cadena de caracteres
		 * No devuelve ningún valor
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		/**
		 * Método getCuenta(): Método que devuelve el  código IBAN de la cuenta
		  * @return String: Devuelve una cadena de caracteres que almacena el IBAN de la cuenta
		 */
		public String getCuenta() {
			return cuenta;
		}
		
		/**
		 * Método setCuenta: Este método establece el código IBAN de la cuenta
		 * @param cuenta: Utiliza como parámetro una cadena de caracteres 
		 * No devuelve ningún valor
		 */
		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}
		
		/**
		 * Método getSaldo: Método que devuelve el saldo actual de la cuenta
		 * @return double: Devuelve un número real que almacena el saldo actual de la cuenta
		 */
		public double getSaldo() {
			return saldo;
		}
		
		/**
		 * Método setSaldo: Este método establece el saldo inicial de la cuenta
		 * @param saldo: Utiliza como parámetro de entrada un número real
		 */
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		/**
		 * Método getTipoInteres: Método que devuelve el tipo de interés de la cuenta
		 * @return: Devuelve un número real que almacena el tipo de interés de la cuenta
		 */
		public double getTipoInteres() {
			return tipoInteres;
		}
		
		/**
		 * Método setTipoInteres: Este método establece el tipo de interés de la cuenta
		 * @param tipoInteres: Utiliza como parámetro de entrada un número real
		 */
		public void setTipoInteres(double tipoInteres) {
			this.tipoInteres = tipoInteres;
		}
			
			/**
			 * Método constructor sin parámetros
			 * No hace nada. Se crea una instancia por defecto
			 */
		    public CCuenta()
		    {
		    }
		    
		    /**
		     * Método constructor con parámetros
		     * @param nom: Cadena de caracteres que representa el nombre del titular
		     * @param cue: Cadenta de caracteres que representa el código IBAN de la cuenta
		     * @param sal: Número real que representa el saldo inicial de la cuenta
		     * @param tipo: Número real que representa el tipo de interés de la cuenta
		     */
		    public CCuenta(String nom, String cue, double sal, double tipo)
		    {
		        nombre =nom;
		        cuenta=cue;
		        saldo=sal;
		    }
		   
		    /**
		     * Método ingresar: Este método ingresa o añade una cantidad al saldo actual
		     * @param cantidad: Utiliza como parámetro un número real
		     * @throws Exception: Se lanza una excepción si la cantidad que se introduce es menor de 0.
		     */
		    public void ingresar(double cantidad) throws Exception
		    {
		        if (cantidad<0)
		            throw new Exception("No se puede ingresar una cantidad negativa");
		        saldo = saldo + cantidad;
		    }
		    
		    /**
		     * Método retirar: Este método retira o resta una cantidad al saldo actual
		     * @param cantidad: tiliza como parámetro un número real
		     * @throws Exception: Se lanza una excepción si la cantidad que se introduce es menor o igual a 0.
		     */
		    public void retirar(double cantidad) throws Exception
		    {
		        if (cantidad <= 0)
		            throw new Exception ("No se puede retirar una cantidad negativa");
		        if (getSaldo()< cantidad)
		            throw new Exception ("No se hay suficiente saldo");
		        saldo = saldo - cantidad;
		    }

	}