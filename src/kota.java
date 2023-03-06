public class kota<E> {
    private E element;

    public kota(E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        kota<Integer> jumlahkota = new kota<Integer>(9);
        kota<String> namakota = new kota<String>("malang");
        System.out.println("jumalah kota dijawa timur : "+ jumlahkota.getElement() + " kota");
        System.out.println("salah satu kota dijawa timur : kota"+ namakota.getElement());
    }
}
