public class CharDemo {
    public static void main(String[] args) {
		//定义一个字符变量并初始化
        String s = "i";
        String S = s.toUpperCase();
		//使用switch结构判断是否为元音字母，并输出对应的信息
		switch (S) {
            case "A":
                System.out.println("元音字母 "+s);
                break;
            case "E":
                System.out.println("元音字母 "+s);
                break;
            case "I":
                System.out.println("元音字母 "+s);
                break;
            case "O":
                System.out.println("元音字母 "+s);
                break;
            case "U":
                System.out.println("元音字母 "+s);
                break;
            default:
            System.out.println("不是元音字母");
                break;
        }
	}
}

// 给定一个字符变量，判断该变量是否为元音字母并输出。
// 1、定义一个字符变量ch并初始化

// 2、使用switch结构判断是否为元音字母，如果是元音字母则输出如效果图所示的内容，如果不是元音字母则输出：不是元音字母

// 提示：

// 元音字母为a、e、i、o、u