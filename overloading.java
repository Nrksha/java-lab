class method{
  void add(int a,int b){
      System.out.println("result="+(a+b));
  }
    void add(int a,int b,int c){
        System.out.println("result="+(a+b+c));
    }
    public static void main(String[] args){
      method m=new method();
      m.add(3,4);
      m.add(3,4,5);
    }
}
