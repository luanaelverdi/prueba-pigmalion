import java.util.HashSet;

public class PruebaTecnica {
    public static void main(String[] args) {
        int[] arreglo = { 5, 2, 1, 4, 4 };
        System.out.println(sumaConDosElementosv1(arreglo, 8));

    }

    public static boolean sumaConDosElementosv1(int[] numeros, int objetivo) {
        int suma = 0;
        // voy hasta numeros.length - 1 para no pasarme de rango
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 1; j < numeros.length; j++) {
                suma = numeros[i] + numeros[j];
                if (suma == objetivo) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean sumaConDosElementosv2(int[] numeros, int objetivo) {
        HashSet<Integer> losQueSirven = new HashSet<>();
        //recorro el arreglo
        for (int n : numeros) {
            //pregunto si la resta entre el objetivo y el elemento esta en el set pues seria la otra parte que me faltaria
            if (losQueSirven.contains(objetivo - n)) {
                return true;
            } else {
                losQueSirven.add(n);
            }
        }
        return false;
    }

}
