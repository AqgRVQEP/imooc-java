public class IfDemo {
    public static void main(String[] args) {
		// 定义整型变量x和y，值分别为-2和0
		int x = -2, y = 0;
		//如果x大于0，则y的值为2*x+1
		//否则y的值为x+5
		if(x > 0){
            y = 2 * x + 1;
        }
        else{
            y = x + 5;
        }

		//分别输出x和y的值
		System.out.println("x=" + x);
        System.out.println("y=" + y);

	}
}
// 任务

// 1、定义整型变量x和y，并进行赋值

// 2、如果x>0,则y=2*x+1，否则y=x+5

// 3、输出x和y的值

// x=-2
// y=3