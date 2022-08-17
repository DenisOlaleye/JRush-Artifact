/*Твоя задача — спроектировать класс Artifact.

Артефакты, которые хранятся в музее, бывают трех видов.
Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем 
(например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан 
(например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания 
(например: 212121, "Ацтеки", 12).

Создай класс Artifact, описывающий хранящиеся в музее древности, 
и напиши необходимое количество конструкторов для него. В методе main() создай по одному артефакту каждого вида.*/

public class Artifact 
{
	int number;
	static String culture;
	static int sentury;
	
	static int count = 212;
		
	
//	those who have only numbers
	public Artifact()
	{
		count++;
		this.number = count;
	}
//	numbers and culture
	public Artifact(String culture)
	{
		count++;
		this.number = count;
		this.culture = culture;
	}
//	number culture and sentury
	public Artifact(String culture, int sentury)
	{
		count++;
		this.number = count;
		this.culture = culture;
		this.sentury = sentury;
	}
	
	
	public static void main(String[] args) 
	{
		Artifact af = new Artifact();
		Artifact af1 = new Artifact("Aztec");
		Artifact af2 = new Artifact("Gimbo", 7);
		
		System.out.println("Number assigned by museum " +af.number+ "\nCulture that create this artifact " +af1.culture+ 
							"\nArtifact was created in " +af2.sentury+ " century");		
		
	}

}
