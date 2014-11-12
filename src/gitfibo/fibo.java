/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gitfibo;

/**
 *
 * @author usuario
 */
public class fibo {
    public int calcular(int numero)
    {
        if (numero <2)
        {
            return numero;
        }
        else
        {
<<<<<<< HEAD
            //Mejorar usando cache
            return calcular(numero-1)+calcular(numero-2);
=======
	    //comentario final
            return calcular(numero-1);
>>>>>>> 22abc1bf536ed3b6f07cc0f9425db21c4fdcbf89
        }
    }
}
