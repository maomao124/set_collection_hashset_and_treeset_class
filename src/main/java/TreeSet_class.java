import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Project name(项目名称)：Set集合 HashSet和TreeSet类
 * Package(包名): PACKAGE_NAME
 * Class(类名): TreeSet_class
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/19
 * Time(创建时间)： 21:41
 * Version(版本): 1.0
 * Description(描述)： TreeSet 类同时实现了 Set 接口和 SortedSet 接口。SortedSet 接口是 Set 接口的子接口，
 * 可以实现对集合进行自然排序，因此使用 TreeSet 类实现的 Set 接口默认情况下是自然排序的，这里的自然排序指的是升序排序。
 * TreeSet 只能对实现了 Comparable 接口的类对象进行排序，因为 Comparable 接口中有一个 compareTo(Object o) 方法用于比较两个对象的大小。
 * 例如 a.compareTo(b)，如果 a 和 b 相等，则该方法返回 0；如果 a 大于 b，则该方法返回大于 0 的值；如果 a 小于 b，则该方法返回小于 0 的值。
 * 表 1 列举了 JDK 类库中实现 Comparable 接口的类，以及这些类对象的比较方式。
 * 表 1 实现Comparable接口类对象的比较方式
 * 类	               比较方式
 * 包装类（BigDecimal、Biglnteger、 Byte、Double、
 * Float、Integer、Long 及 Short)	按数字大小比较
 * Character	按字符的 Unicode 值的数字大小比较
 * String	按字符串中字符的 Unicode 值的数字大小比较
 * TreeSet 类除了实现 Collection 接口的所有方法之外，还提供了如表 2 所示的方法。
 * 表 2 TreeSet类的常用方法
 * 方法名称	说明
 * E first()	返回此集合中的第一个元素。其中，E 表示集合中元素的数据类型
 * E last()	返回此集合中的最后一个元素
 * E poolFirst()	获取并移除此集合中的第一个元素
 * E poolLast()	获取并移除此集合中的最后一个元素
 * SortedSet<E> subSet(E fromElement,E toElement)	返回一个新的集合，新集合包含原集合中 fromElement 对象与 toElement
 * 对象之间的所有对象。包含 fromElement 对象，不包含 toElement 对象
 * SortedSet<E> headSet<E toElement〉	返回一个新的集合，新集合包含原集合中 toElement 对象之前的所有对象。
 * 不包含 toElement 对象
 * SortedSet<E> tailSet(E fromElement)	返回一个新的集合，新集合包含原集合中 fromElement 对象之后的所有对象。
 * 包含 fromElement 对象注意：表面上看起来这些方法很多，其实很简单。因为 TreeSet 中的元素是有序的，
 * 所以增加了访问第一个、前一个、后一个、最后一个元素的方法，并提供了 3 个从 TreeSet 中截取子 TreeSet 的方法。
 */

public class TreeSet_class
{
    public static void main(String... args)
    {
        TreeSet<Double> ts = new TreeSet<Double>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
            double val = input.nextDouble();
            ts.add(val);
        }
        System.out.println();
        System.out.println("数量：" + ts.size());
        System.out.println("成绩从低到高排序：");
        for (Double d : ts)
        {
            System.out.print(d + "  ");
        }
        System.out.println();
        System.out.println("最低分：" + ts.first());
        System.out.println("最高分：" + ts.last());
        System.out.println("去掉最高分和最低分：");
        ts.pollFirst();
        ts.pollLast();
        System.out.println("成绩从低到高排序：");
        for (Double d : ts)
        {
            System.out.print(d + "  ");
        }
        System.out.println();
        System.out.println("求和和平均分：");
        Double count = 0.0;
        Double average;
        for (Double d : ts)
        {
            count += d;
        }
        System.out.println("和：" + count);
        average = count / ts.size();
        System.out.println("平均分：" + average);
        SortedSet<Double> score1 = ts.headSet(60.0);
        System.out.println("不及格的成绩有：");
        for (int i = 0; i < score1.toArray().length; i++)
        {
            System.out.print(score1.toArray()[i] + "\t");
        }
        SortedSet<Double> score2 = ts.tailSet(90.0);
        System.out.println();
        System.out.println("90 分以上的成绩有：");
        for (int i = 0; i < score2.toArray().length; i++)
        {
            System.out.print(score2.toArray()[i] + "\t");
        }
    }
}

