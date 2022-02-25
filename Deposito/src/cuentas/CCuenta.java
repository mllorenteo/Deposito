package cuentas;

	/**
	 * La clase CCuenta almacena los datos de una cuenta bancaria: 
	 * nombre del titular, IBAN, saldo inicial y tipo de inter�s
	 */
	public class CCuenta {
		 private String nombre; //Cadena de caracteres que almacena el nombre del titula de la cuente
		 private String cuenta; //Cadena de caracteres que almacena el IBAN de la cuenta 
		 private double saldo; //N�mero real que almacena el saldo inicial de la cuenta
		 private double tipoInteres; //N�mero real que almacena el tipo de inter�s de la cuenta
		 
		 /**
		  * M�todo getNombre(): M�todo que devuelve el nombre del titular de la cuenta
		  * @return String: Devuelve una cadena de caracteres que almacena el nombre del titular de la cuenta
		  */
		    public String getNombre() {
			return nombre;
		}
		    
		/**
		 * M�todo setNombre: Este m�todo establece el nombre del titular de la cuenta
		 * @param nombre: Utiliza como par�metro una cadena de caracteres
		 * No devuelve ning�n valor
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		/**
		 * M�todo getCuenta(): M�todo que devuelve el  c�digo IBAN de la cuenta
		  * @return String: Devuelve una cadena de caracteres que almacena el IBAN de la cuenta
		 */
		public String getCuenta() {
			return cuenta;
		}
		
		/**
		 * M�todo setCuenta: Este m�todo establece el c�digo IBAN de la cuenta
		 * @param cuenta: Utiliza como par�metro una cadena de caracteres 
		 * No devuelve ning�n valor
		 */
		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}
		
		/**
		 * M�todo getSaldo: M�todo que devuelve el saldo actual de la cuenta
		 * @return double: Devuelve un n�mero real que almacena el saldo actual de la cuenta
		 */
		public double getSaldo() {
			return saldo;
		}
		
		/**
		 * M�todo setSaldo: Este m�todo establece el saldo inicial de la cuenta
		 * @param saldo: Utiliza como par�metro de entrada un n�mero real
		 */
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		/**
		 * M�todo getTipoInteres: M�todo que devuelve el tipo de inter�s de la cuenta
		 * @return: Devuelve un n�mero real que almacena el tipo de inter�s de la cuenta
		 */
		public double getTipoInteres() {
			return tipoInteres;
		}
		
		/**
		 * M�todo setTipoInteres: Este m�todo establece el tipo de inter�s de la cuenta
		 * @param tipoInteres: Utiliza como par�metro de entrada un n�mero real
		 */
		public void setTipoInteres(double tipoInteres) {
			this.tipoInteres = tipoInteres;
		}
			
			/**
			 * M�todo constructor sin par�metros
			 * No hace nada. Se crea una instancia por defecto
			 */
		    public CCuenta()
		    {
		    }
		    
		    /**
		     * M�todo constructor con par�metros
		     * @param nom: Cadena de caracteres que representa el nombre del titular
		     * @param cue: Cadenta de caracteres que representa el c�digo IBAN de la cuenta
		     * @param sal: N�mero real que representa el saldo inicial de la cuenta
		     * @param tipo: N�mero real que representa el tipo de inter�s de la cuenta
		     */
		    public CCuenta(String nom, String cue, double sal, double tipo)
		    {
		        nombre =nom;
		        cuenta=cue;
		        saldo=sal;
		    }
		   
		    /**
		     * M�todo ingresar: Este m�todo ingresa o a�ade una cantidad al saldo actual
		     * @param cantidad: Utiliza como par�metro un n�mero real
		     * @throws Exception: Se lanza una excepci�n si la cantidad que se introduce es menor de 0.
		     */
		    public void ingresar(double cantidad) throws Exception
		    {
		        if (cantidad<0)
		            throw new Exception("No se puede ingresar una cantidad negativa");
		        saldo = saldo + cantidad;
		    }
		    
		    /**
		     * M�todo retirar: Este m�todo retira o resta una cantidad al saldo actual
		     * @param cantidad: tiliza como par�metro un n�mero real
		     * @throws Exception: Se lanza una excepci�n si la cantidad que se introduce es menor o igual a 0.
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