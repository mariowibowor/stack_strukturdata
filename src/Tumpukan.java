public class Tumpukan {
    public static void main(String[] args) {
        stack a = new stack();
        a.push(3);
        a.push(9);
        a.push(1);
        a.push(2);
        a.push(4);
        a.getTopGanjil();
        a.getTopGenap();
        a.cetakNode();
        a.popganjil();
        a.popgenap();
        a.getTopGanjil();
        a.getTopGenap();
        a.cetakNode();
    }
}
