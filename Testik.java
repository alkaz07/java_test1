public class Testik {
    public static void main(String[] args)
    {
        //������������ (�� �������� ���������) ����������, ��� ������� ��� �������� ����
        int a=2, b=14, c = 0;
        for (c = c + a; c>a - b; c = c - 1)        {
            System.out.println("a="+a+", b="+b+", c="+c);
            do  {
                b = 14;
                a = a * 4;
                while (b>a - 2)  {
                    b = b / 2;
                    b = b + 1;
                    System.out.println("a="+a+", b="+b+", c="+c);
                }
            } while (a<25);
        }
        System.out.println("a="+a+", b="+b+", c="+c);
    }
}
