public class Numparells {
    public static void main(String[] args) {
        int[] numPares = new int[100]; 
        int contador = 0;
        int num = 2;

       
        while (contador < 100) {
            numPares[contador] = num;
            num += 2; 
            contador++;
        }

       
        for (int k = 0; k < numPares.length; k++) {
            System.out.println(numPares[k]);
        }
    }
}
