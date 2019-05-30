package cn.huang.sax.handler;

import org.xml.sax.helpers.AttributesImpl;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * @Author: Yaking
 * @Date: 2019/5/27 10:40
 */
public class BulidXMLMain {
    public static void main(String[] args) throws Exception {
        //创建保存XML的结果流对象
        Result resultXMl = new StreamResult(new File("E:\\IDEA\\SAXParse\\Xml\\firstxml1.xml"));
        //获取sax生成处理者对象实例
        SAXTransformerFactory saxTransformerFactory = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        //获取SAX生成处理者对象实例
        TransformerHandler transformerHandler = saxTransformerFactory.newTransformerHandler();
        transformerHandler.setResult(resultXMl);
        //获取SAX生成器
        Transformer transformer = transformerHandler.getTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        //生成文档的开始
        transformerHandler.startDocument();
        AttributesImpl attrImpl = new AttributesImpl();
        /*
         * 添加属性的方法、
         * attrImpl.addAttribute();
         * */
        transformerHandler.startElement("", "", "书籍列表", attrImpl);
        //第一本书
        transformerHandler.startElement("", "", "计算机书籍", attrImpl);

        transformerHandler.startElement("", "", "书名", attrImpl);
        transformerHandler.characters("java思想".toCharArray(), 0, "java思想".length());
        transformerHandler.endElement("", "", "书名");

        transformerHandler.startElement("", "", "作者", attrImpl);
        transformerHandler.characters("小黄".toCharArray(), 0, "小黄".length());
        transformerHandler.endElement("", "", "作者");

        transformerHandler.startElement("", "", "价格", attrImpl);
        transformerHandler.characters("79.00".toCharArray(), 0, "79.00".length());
        transformerHandler.endElement("", "", "价格");

        transformerHandler.endElement("", "", "计算机书籍");

        //第二本书
        transformerHandler.startElement("", "", "计算机书籍", attrImpl);

        transformerHandler.startElement("", "", "书名", attrImpl);
        transformerHandler.characters("spring指南".toCharArray(), 0, "spring指南".length());
        transformerHandler.endElement("", "", "书名");

        transformerHandler.startElement("", "", "作者", attrImpl);
        transformerHandler.characters("小李".toCharArray(), 0, "小李".length());
        transformerHandler.endElement("", "", "作者");

        transformerHandler.startElement("", "", "价格", attrImpl);
        transformerHandler.characters("89.00".toCharArray(), 0, "89.00".length());
        transformerHandler.endElement("", "", "价格");

        transformerHandler.endElement("", "", "计算机书籍");

        transformerHandler.endElement("", "", "书籍列表");
        //告诉hander文档生成已经结束
        transformerHandler.endDocument();

        System.out.println("XML文档生成成功！");
    }
}
