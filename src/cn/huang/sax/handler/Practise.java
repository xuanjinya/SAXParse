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
 * @Date: 2019/5/27 11:08
 */
public class Practise {
    public static void main(String[] args) throws Exception {
        //创建保存XML的结果流对象
        Result resultXML = new StreamResult(new File("E:\\IDEA\\SAXParse\\Xml\\test.xml"));
        //获取SAX生成处理者对象实例,需要进行强制类型转换
        SAXTransformerFactory saxTransformerFactory = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        //获取SAX生成处理者对象实例,需要抛出异常
        TransformerHandler transformerHandler = saxTransformerFactory.newTransformerHandler();
        transformerHandler.setResult(resultXML);
        //获取SAX生成器
        Transformer transformer = transformerHandler.getTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        //生成文档的开始
        transformerHandler.startDocument();
        AttributesImpl attrImpl = new AttributesImpl();

        transformerHandler.startElement("", "", "教学计划", attrImpl);

        transformerHandler.startElement("", "", "基础课程", attrImpl);

        transformerHandler.startElement("", "", "课程名", attrImpl);
        transformerHandler.characters("大学英语".toCharArray(), 0, "大学英语".length());
        transformerHandler.endElement("", "", "课程名");
        transformerHandler.startElement("", "", "课时", attrImpl);
        transformerHandler.characters("36".toCharArray(), 0, "36".length());
        transformerHandler.endElement("", "", "课时");
        transformerHandler.startElement("", "", "考核方式", attrImpl);
        transformerHandler.characters("考试".toCharArray(), 0, "考试".length());
        transformerHandler.endElement("", "", "考核方式");

        transformerHandler.startElement("", "", "课程名", attrImpl);
        transformerHandler.characters("高等数学".toCharArray(), 0, "高等数学".length());
        transformerHandler.endElement("", "", "课程名");
        transformerHandler.startElement("", "", "课时", attrImpl);
        transformerHandler.characters("70".toCharArray(), 0, "70".length());
        transformerHandler.endElement("", "", "课时");
        transformerHandler.startElement("", "", "考核方式", attrImpl);
        transformerHandler.characters("考试".toCharArray(), 0, "考试".length());
        transformerHandler.endElement("", "", "考核方式");

        transformerHandler.startElement("", "", "课程名", attrImpl);
        transformerHandler.characters("计算机应用基础".toCharArray(), 0, "计算机应用基础".length());
        transformerHandler.endElement("", "", "课程名");
        transformerHandler.startElement("", "", "课时", attrImpl);
        transformerHandler.characters("108".toCharArray(), 0, "108".length());
        transformerHandler.endElement("", "", "课时");
        transformerHandler.startElement("", "", "考核方式", attrImpl);
        transformerHandler.characters("上机操作".toCharArray(), 0, "上机操作".length());
        transformerHandler.endElement("", "", "考核方式");

        transformerHandler.startElement("", "", "课程名", attrImpl);
        transformerHandler.characters("工程制图".toCharArray(), 0, "工程制图".length());
        transformerHandler.endElement("", "", "课程名");
        transformerHandler.startElement("", "", "课时", attrImpl);
        transformerHandler.characters("60".toCharArray(), 0, "60".length());
        transformerHandler.endElement("", "", "课时");
        transformerHandler.startElement("", "", "考核方式", attrImpl);
        transformerHandler.characters("考察".toCharArray(), 0, "考察".length());
        transformerHandler.endElement("", "", "考核方式");

        transformerHandler.endElement("", "", "基础课程");

        transformerHandler.startElement("", "", "专业课程", attrImpl);

        transformerHandler.startElement("", "", "课程名", attrImpl);
        transformerHandler.characters("java基础入门".toCharArray(), 0, "java基础入门".length());
        transformerHandler.endElement("", "", "课程名");
        transformerHandler.startElement("", "", "课时", attrImpl);
        transformerHandler.characters("72".toCharArray(), 0, "72".length());
        transformerHandler.endElement("", "", "课时");
        transformerHandler.startElement("", "", "考核方式", attrImpl);
        transformerHandler.characters("考试".toCharArray(), 0, "考试".length());
        transformerHandler.endElement("", "", "考核方式");

        transformerHandler.startElement("", "", "课程名", attrImpl);
        transformerHandler.characters("mysql数据库入门".toCharArray(), 0, "mysql数据库入门".length());
        transformerHandler.endElement("", "", "课程名");
        transformerHandler.startElement("", "", "课时", attrImpl);
        transformerHandler.characters("108".toCharArray(), 0, "108".length());
        transformerHandler.endElement("", "", "课时");
        transformerHandler.startElement("", "", "考核方式", attrImpl);
        transformerHandler.characters("考试".toCharArray(), 0, "考试".length());
        transformerHandler.endElement("", "", "考核方式");

        transformerHandler.startElement("", "", "课程名", attrImpl);
        transformerHandler.characters("网页设计与制作".toCharArray(), 0, "网页设计与制作".length());
        transformerHandler.endElement("", "", "课程名");
        transformerHandler.startElement("", "", "课时", attrImpl);
        transformerHandler.characters("74".toCharArray(), 0, "74".length());
        transformerHandler.endElement("", "", "课时");
        transformerHandler.startElement("", "", "考核方式", attrImpl);
        transformerHandler.characters("考察".toCharArray(), 0, "考察".length());
        transformerHandler.endElement("", "", "考核方式");

        transformerHandler.endElement("", "", "专业课程");

        transformerHandler.endElement("", "", "教学计划");
        transformerHandler.endDocument();
        System.out.println("生成成功！");
    }
}

