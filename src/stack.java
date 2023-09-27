public class stack {
    node topganjil;
    node topgenap;
    int numberganjil;
    int numbergenap;

    public stack(){
        topganjil = null;
        topgenap = null;
        numberganjil = 0;
        numbergenap = 0;
    }

    public boolean ganjilisEmpty(){
        return topganjil == null;
    }

    public boolean genapisEmpty(){
        return topgenap == null;
    }
    public void push(Integer d){
        if(d % 2 != 0){
            topganjil = new node(d, topganjil);
            numberganjil++;
        } else {
            topgenap = new node(d, topgenap);
            numbergenap++;
        }
    }

    public void popganjil(){
        if(ganjilisEmpty()){
            System.out.println("Tumpukan Ganjil kosong");
        } else {
            node tmp = topganjil;
            topganjil = tmp.getPointer().getPointer();
            numberganjil = numberganjil-2;
        }
    }

    public void popgenap(){
        if(genapisEmpty()){
            System.out.println("Tumpukan Genap kosong");
        } else {
            node tmp = topgenap;
            topgenap = tmp.getPointer();
            numbergenap--;
        }
    }
    public void getTopGanjil() {
        if (ganjilisEmpty()) {
            System.out.println("Stack Ganjil Kosong");
        } else {
            System.out.println("Top Ganjil Sekarang:" + topganjil.getData());
        }
    }

    public void getTopGenap(){
        if(genapisEmpty()){
            System.out.println("Stack Genap Kosong");
        } else {
            System.out.println("Top Genap Sekarang:" + topgenap.getData());
        }
    }

    public void cetakNode(){
        node tmp = topganjil;
        node tmp2 = topgenap;
        System.out.println("Isi dari kedua stack sekarang:");
        System.out.println("Isi dari stack Ganjil:");
        for (int i = 0;i<numberganjil;i++){
            System.out.println(tmp.getData());
            tmp = tmp.getPointer();
        }
        System.out.println("Isi dari stack Genap:");
        for (int i = 0;i<numbergenap;i++){
            System.out.println(tmp2.getData());
            tmp2 = tmp2.getPointer();
        }
    }
}
