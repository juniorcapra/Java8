import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class ProjForParalelo {

	
	static int  MAX_LOOP = 10000;
	static float total = 0;
	static Float[] soma_parcial = new Float[5000];
	
	public static void main(String[] args) {


		/*
		Stopwatch timer = new Stopwatch();
		
		timer.start();     
		
		for(int i=0;i<MAX_LOOP;i++)
			System.out.println(i);
		
		timer.stop();  

	   System.out.println("Abordagem sequencial. Tempo:" + timer.getElapsed());
		
		
		timer = new Stopwatch();

		timer.start();     

		
		 Loop.withIndex(0, MAX_LOOP, new Loop.Each() {
	            public void run(int i) {
	                System.out.println(i);
	            }
	        });
		 
		 timer.stop();  

		 System.out.println("Abordagem paralela. Tempo:" + timer.getElapsed());
		*/ 
		
		
		// Testes de leitura do arquivo
			
		
		// Sequencial
	
		
		/*
		Stopwatch t1 = new Stopwatch();
		
		total = 0;
		
		t1.start();
		
		for(int i=0;i<5000;i++)
		{
			// total = total + SomaValor(i);
			soma_parcial[i] = SomaValor(i);
			
		}
			
		
		for(int i=0;i<5000;i++)
			total = total + soma_parcial[i];
		
		t1.stop();
		
		System.out.println("Total Soma:" + String.valueOf(total));

	   System.out.println("Leitura de arquivos. Abordagem sequencial. Tempo:" + t1.getElapsed());
	   

		// Paralelo 1
	   
	   t1 = new Stopwatch();
		
	   total = 0;
	   
	   t1.start();

	   Loop.withIndex(0, 5000, new Loop.Each() {
	            public void run(int i) {
	            	
	            	soma_parcial[i] = SomaValor(i);
	            }
	        });
		 
	   Loop.withIndex(0, 5000, new Loop.Each() {
           public void run(int i) {
           	
        		total = total + soma_parcial[i];
           }
       }); 
	   
	   t1.stop();
		 
		 System.out.println("Total Soma:" + String.valueOf(total));
		 
		 System.out.println("Leitura de arquivos. Abordagem paralela. Tempo:" + t1.getElapsed());

		*/	
   // Testes de gravação
		 
	// Sequencial
	
	/*
		
	total = (float) 5975.56;	
		
	Stopwatch  t1 = new Stopwatch();
	
	t1.start();
	
	for(int i=0;i<5000;i++)
	{
		ProjForParalelo.GravaValor(i,total);	
	}
		
	t1.stop();
	
   System.out.println("Gravação de arquivos. Abordagem sequencial. Tempo:" + t1.getElapsed());
   
	// Paralelo
	 
   t1 = new Stopwatch();
	
	t1.start();
	

	   Loop.withIndex(0, 5000, new Loop.Each() {
	            public void run(int i) {
	            	
	            	ProjForParalelo.GravaValor(i,total);
	            }
	        });
	   
	t1.stop();
	
  System.out.println("Gravação de arquivos. Abordagem paralela. Tempo:" + t1.getElapsed());
    
    */
			
		
	}
	
	
	
	// Soma os valores do arquivo
	static float SomaValor(int i)
	{

		float k = 0;
		
		BufferedReader br = null;
		 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("C:\\PocketVideos\\JavaForParalelo\\Files\\f_" + String.valueOf(i)  + ".txt"));
 
			
			
			while ((sCurrentLine = br.readLine()) != null) {
				k = k + Float.parseFloat(sCurrentLine);
				
				// System.out.println(sCurrentLine);
			}
 
			
			// System.out.println("Total:" + String.valueOf(k));
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return k;
		
	}
		
	// Grava um valor no arquivo
	static void GravaValor(int i, Float valor)
	{
		
		try {

		String content = "\n" + String.valueOf(valor) ;
		 
		File file = new File("C:\\PocketVideos\\JavaForParalelo\\Files\\f_" + String.valueOf(i)  + ".txt");

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();

	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	

}
