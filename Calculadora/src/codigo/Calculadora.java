package codigo;

public class Calculadora {
	public String sumarInt(String a, String b)
	{
		int respuesta = Integer.parseInt(a) + Integer.parseInt(b);
		return String.valueOf(respuesta);
	}
	public String sumarFloat(String a, String b)
	{
		float respuesta = Float.parseFloat(a) + Float.parseFloat(b);
		return String.valueOf(respuesta);
	}
	public String restarInt(String a, String b) 
	{
		int respuesta = Integer.parseInt(a) - Integer.parseInt(b);
		return String.valueOf(respuesta);
	}
	public String restarFloat(String a, String b)
	{
		float respuesta = Float.parseFloat(a) - Float.parseFloat(b);
		return String.valueOf(respuesta);
	}
	public String multiplicarInt(String a, String b) 
	{
		int respuesta = Integer.parseInt(a) * Integer.parseInt(b);
		return String.valueOf(respuesta);
	}
	public String multiplicarFloat(String a, String b)
	{
		float respuesta = Float.parseFloat(a) * Float.parseFloat(b);
		return String.valueOf(respuesta);
	}
	
	public String dividirFloat(String a, String b)
	{
		float respuesta = Float.parseFloat(a) / Float.parseFloat(b);
		return String.valueOf(respuesta);
	}
}
