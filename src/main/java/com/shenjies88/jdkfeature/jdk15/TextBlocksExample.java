package com.shenjies88.jdkfeature.jdk15;

/**
 * @author shenjies88
 * @since 2020/10/29-2:28 PM
 */
public class TextBlocksExample {
    public static void main(String[] args) {
        String html = """
                <html>
                    <body>
                        <p>Hi, Java技术栈</p>
                        <p>欢迎关注，分享更多干货</p>
                    </body>
                </html>
                """;
        System.err.println(html);
    }
}
