

interface Addition{
    int check (int a,int b);
}
class examples{

    public static void main(String[] args) {
        Addition x =(a,b)-> (a+b);
        System.out.println(x.check(23, 56));


    }}

