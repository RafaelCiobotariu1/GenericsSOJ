public class Ex1 {
    static <E> void positionSwap(E[] array , int a, int b){
        E aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }

    static int isPrime(int n)
    {
        if (n<2)
            return 0;
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }

    static <E> int countPrime(E[] array){
        int count = 0;

        for (E i : array) {
            int nr = Integer.parseInt(i.toString());
            if(isPrime(nr) == 1 ){
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        Integer[] ints = {1,4,5,6,11,13,232,32,55,76,982,1024};
        String[] strings = {"Ana", "Maria", "Gina", "Georgeta"};
        Double[] doubles = {1.4, 32.42, 22.36, 98.22, 72.550};


        System.out.println("The Integer array before swap: ");
        for (Integer i : ints) {
            System.out.print(i + " ");
        }
        positionSwap(ints, 3, 6);
        System.out.println("");
        System.out.println("The Integer array after swap: ");
        for (Integer i : ints) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Numarul de numere prime din array este: " + countPrime(ints));
    }
}
