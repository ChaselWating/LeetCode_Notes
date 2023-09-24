//《数据结构与算法（Java版）（第5版）》，作者：叶核亚，2019年6月23日
//§1.2.3  算法设计
//【例1.3】求两个整数的最大公约数。

public class Gcd
{
    public static int gcd1(int x, int y)         //返回x与y的最大公因数
    {
        while(y!=0)
        {
            int temp = x%y;
            x = y;
            y = temp; 
        }
        return x;
    }
    
    //【思考题1-1】
    public static int recGcd(int x, int y)       //返回x,y的最大公因数，递归方法
    {
        if(y==0)
            return x;
        if(x<0)
            return recGcd(-x, y);
        if(y<0)
            return recGcd(x, -y);
        return recGcd(y, x%y);
    }
    
    public static void main(String args[]) 
    {
        int x=12, y=18, z=24;
        System.out.println("gcd1("+x+","+y+","+z+")="+gcd1(recGcd(x,y), z));
    }
}
/*
程序运行结果如下:
gcd1(12,18,24)=6

*/
//author：Yeheya。2014-7-3，2019年6月23日，2020年1月27日