package cn.huang.sax.handler;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MuKeHandler extends DefaultHandler {
    //定义一个变量，保存当前正在处理的tag标签
    private String currentTag;
    //解析文档开始时触发
    @Override
    public void startDocument() throws SAXException {
        System.out.println("解析文档开始！");
    }
    //解析文档结束时触发
    @Override
    public void endDocument() throws SAXException {
        System.out.println("解析文档结束！");
    }
    //解析元素开始时触发
    @Override
    public void startElement(String s, String s1, String s2, Attributes attributes) throws SAXException {
        System.out.println("开始处理--"+s2+"--元素");
        currentTag = s2;
        if(attributes.getLength()>0){
            System.out.println("<"+currentTag+">元素属性如下：---");
            for(int i = 0;i<attributes.getLength();i++){
                System.out.println(attributes.getQName(i)+"--->"+attributes.getValue(i));
            }
        }
    }
    //解析元素结束时触发
    @Override
    public void endElement(String s, String s1, String s2) throws SAXException {
        System.out.println("解析--"+s2+"--元素结束！");
    }
    //每当处理文档数据将触发该方法
    @Override
    public void characters(char[] chars, int i, int i1) throws SAXException {
        String content  = new String(chars,i,i1);
        if(content.trim().length()>0){
            System.out.println("<"+currentTag+">元素的值是："+content.trim());
        }
    }
}
