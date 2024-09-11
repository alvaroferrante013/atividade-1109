public class Fila{
	private static Fila instance;
	
	private Fila() {}
		public static Fila RecebeInstancia() {
			if (instance == null) {
				instance = new Fila();
			}
		return instance;
		}
	public void ImprimirDocumento() {}
	public void RemoverDocumento() {}
	public void RemoverTodosDocumentos() {}
}

