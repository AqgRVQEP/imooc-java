public class StarDemo {
    public static void main(String[] args) {
		// 输出星号组成的梯形
		for(int i = 1;i <= 5;i++) {
            for(int j = 5 - i; j > 0; j--){
				System.out.print("  ");
			}
			for(int k = 2 * i + 1; k > 0; k--){
				System.out.print("* ");
			}
			System.out.println();
        }
	}
}

// 用星号输出一个梯形，如下图所示：（使用嵌套for循环完成）

// 任务

// 1、外重循环控制输出行数

// 2、第一个内重循环控制输出的空格数，依次递减。

//      注意：由于星号和空格在屏幕上所占的空间不同，所以可以适当调整空格的输出，比如每次循环都输出两个空格。这样输出来的图形会更加接近梯形

// 3、第二个内重循环控制每行输出的星号数

// 4、输出完一行的星号和空格后换行


