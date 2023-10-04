package stack;

public class node {

    Integer data;
    node pointer;

    public node () {
        data = null;
        pointer = null;
    }

    public node (Integer d, node e){
        data = d;
        pointer = e;
    }

    public void setData(Integer d){
        data = d;
    }

    public void setPointer(node e){
        pointer = e;
    }

    public Object getData(){
        return data;
    }

    public node getPointer() {
        return pointer;
    }
}
