package Archieve;

class Absclass {
    String str;
    Absclass(){
        System.out.println("this is default constrcutor");
    }
    Absclass(String str){
        this.str=str;
        System.out.println("this is param constrcutor "+ str);
    }
    public static void main(String[] args) {
        Absclass abs = new Absclass("hello");



    }


}
