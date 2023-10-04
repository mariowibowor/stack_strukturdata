package queue;

import stack.node;

import java.util.Scanner;

public class Queue {
    node head;
    node tail;
    int jumlah;

    public Queue(){
        head = null;
        tail = null;
        jumlah = 0;
    }

    public boolean queueIsEmpty(){
        return head == null && tail == null;
    }

    public void SistemQueue(){
        while(true){
            System.out.println("Ini Queue");
            System.out.println("Silahkan pilih");
            System.out.println("1. Enqueue \n2. Dequeue \n3. Cetak Queue \n4. Keluar");
            System.out.print("Pilihan: ");
            Scanner scan = new Scanner(System.in);
            int pilihan = scan.nextInt();
            switch(pilihan){
                case 1:
                    System.out.print("Silahkan masukkan angka yang ingin ditambahkan: ");
                    Scanner isi = new Scanner(System.in);
                    int input = isi.nextInt();
                    enqueue(input);
                    System.out.println("Berhasil menambahkan " + input + " ke dalam queue");
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    cetakHeadTail();
                    cetakQueue();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan salah, coba lagi");
                    break;

            }
        }
    }

    public void enqueue(Integer d){
        if (jumlah == 0){
            head = new node(d, head);
            tail = head;
            jumlah++;
        } else {
            tail = new node(d, tail);
            jumlah++;
        }
    }

    public void dequeue(){
        if(jumlah == 0 || queueIsEmpty()){
            System.out.println("Antrian kosong");
        } else if (jumlah == 1) {
            System.out.println("Berhasil mengeluarkan " + head.getData() + " dari queue");
            head = tail = null;
            jumlah--;
        } else {
            System.out.println("Berhasil mengeluarkan " + head.getData() + " dari queue");
            node tmp = tail;
            for(int i = 1; i < jumlah-1; i++){
                tmp = tmp.getPointer();
            }
            head = tmp;
            jumlah--;
        }
    }

    public void cetakHeadTail(){
        if(queueIsEmpty()){
            System.out.println("Queue kosong, tidak ada head dan tail");
        } else {
            System.out.println("Head Queue sekarang: " + head.getData());
            System.out.println("Tail Queue Sekarang: " + tail.getData());
        }
    }

    public void cetakQueue(){
        if (queueIsEmpty()){
            System.out.println("Queue kosong");
        } else {
            node tmp = tail;
            System.out.println("Data dalam queue (urutan dari tail ke head): ");
            for (int i = jumlah; i > 0; i--) {
                System.out.println(tmp.getData());
                tmp = tmp.getPointer();
            }
        }
    }
}
