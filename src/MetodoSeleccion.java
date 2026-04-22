public class MetodoSeleccion {

    public void sort(int[] arr){
        int tam = arr.length;

        for(int i = 0; i < tam - 1; i++){
            int indiceDelMenor = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[indiceDelMenor] > arr[j]){
                    indiceDelMenor = j;
                }
            }

            if(i != indiceDelMenor){
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;
            }
        }
    }

    public void imprimirArreglo(int[] arr){ // 👈 aquí el cambio
        for(int num : arr){
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    public void printArreglo(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printArreglo'");
    }
}