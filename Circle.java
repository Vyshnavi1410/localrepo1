class Test

{

public static void main(String[] args)

{

try

{

for(int i=1;i<=10;i++)

{

System.out.println(i);

Thread.sleep(500);

}

}

catch(InterruptedException ie)

{

System.out.println(ie);

}

}

}
