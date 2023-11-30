public class Demo{
    public static int add(int a,int b){
        while(b>0){
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
        int answer=a;
        return answer;
    }
}