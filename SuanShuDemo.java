public class SuanShuDemo {
    public static void main(String[] args) {
		//声明三个整型变量a、b、c

		//分别为a,b,c赋值为4,15,20
		int a = 4,b = 15,c = 20;
		//计算(b/a)+c的值 ，并赋值给变量m
		int m = (b / a) + c;
		//计算(c%b)*a-c的值，并赋值给变量n
		int n = (c % b) * a - c;
		//输出m和n的值
		System.out.println("m = " + m);
        System.out.println("n = " + n);
	}
}


// 任务

// 编写代码求下列表达式的结果，并输出m、n的值。

// m=(b/a)+c

// n=(c%b)*a-c;