public class LoopDemo1 {
    public static void main(String[] args) {
		//定义变量ge、shi、bai，用于存放个位、十位、百位上的数字
        int ge = 0, shi = 0, bai = 0;
		//使用for循环
        for(int n = 200;n <= 300;n++) {
			//取出百位数
		    bai = n / 100;
			//取出十位数
			shi = (n / 10) % 10;
			//取出个位数
		    ge = n % 100 % 10;
			//计算三个数字之积
            int multi = ge * shi * bai;
			//计算三个数字之和
			int plu = ge + shi + bai;
            //如果积等于42并且和为12，则将满足条件的数输出
            if (multi == 42 && plu == 12) {
                System.out.println(n);
            }
        }
	}
}

// 编写一个程序，求出200到300之间的数，且满足条件：它们三个数字之积为42，三个数字之和为12。

// 任务

// 1、 循环遍历200到300之间的整数

// 2、 分别取出个位、十位和百位上的数

// 3、 求三个数字的和与积

// 4、 判断三个数字的积是否为42，三个数字的和是否为12，如果满足条件则输出该数