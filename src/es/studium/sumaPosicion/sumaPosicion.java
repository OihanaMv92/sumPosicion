package es.studium.sumaPosicion;



public class sumaPosicion
{

	public static void main(String[] args)
	{

	                final int FILAS = 10;
	                final int COLUMNAS = 10;
	                int tabla[][] = new int[FILAS][COLUMNAS];
	                int i,j;
	                for(i=0;i<FILAS;i++)
	                {
	                        for(j=0;j<COLUMNAS;j++)
	                        {
	                                tabla[i][j] = i+j;
	                                
	                        }
	                }
	                for(i=0;i<FILAS;i++)
	                {
	                        for(j=0;j<COLUMNAS;j++)
	                        {
	                                System.out.print(tabla[i][j]+"\t");
	                        }
	                        System.out.println();
	                }
	        }
	}
