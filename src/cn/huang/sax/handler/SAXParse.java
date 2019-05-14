package cn.huang.sax.handler;

import cn.huang.sax.handler.MuKeHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SAXParse  {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        //创建SAX解析器工厂
        SAXParserFactory factory = SAXParserFactory.newInstance();
        //创建SAX解析器
        SAXParser parser = factory.newSAXParser();
        //开始解析Xml文档，（url为文档的路径）
        parser.parse("E:\\JavaWeb\\Xml\\demo.xml", new MuKeHandler());
    }
}
