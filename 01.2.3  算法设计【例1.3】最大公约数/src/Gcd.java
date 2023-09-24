//�����ݽṹ���㷨��Java�棩����5�棩�������ߣ�Ҷ���ǣ�2019��6��23��
//��1.2.3  �㷨���
//����1.3�����������������Լ����

public class Gcd
{
    public static int gcd1(int x, int y)         //����x��y���������
    {
        while(y!=0)
        {
            int temp = x%y;
            x = y;
            y = temp; 
        }
        return x;
    }
    
    //��˼����1-1��
    public static int recGcd(int x, int y)       //����x,y������������ݹ鷽��
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
�������н������:
gcd1(12,18,24)=6

*/
//author��Yeheya��2014-7-3��2019��6��23�գ�2020��1��27��