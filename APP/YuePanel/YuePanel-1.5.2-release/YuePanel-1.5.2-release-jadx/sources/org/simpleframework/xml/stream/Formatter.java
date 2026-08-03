package org.simpleframework.xml.stream;

import Yue.C8039;
import java.io.BufferedWriter;
import java.io.Writer;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes2.dex */
class Formatter {
    private OutputBuffer buffer = new OutputBuffer();
    private Indenter indenter;
    private Tag last;
    private String prolog;
    private Writer result;
    private static final char[] NAMESPACE = {'x', Advice.OffsetMapping.ForOrigin.Renderer.ForMethodName.SYMBOL, 'l', 'n', Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL};
    private static final char[] LESS = {C8039.f23874, 'l', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER};
    private static final char[] GREATER = {C8039.f23874, 'g', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER};
    private static final char[] DOUBLE = {C8039.f23874, 'q', 'u', 'o', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER};
    private static final char[] SINGLE = {C8039.f23874, 'a', Advice.OffsetMapping.ForOrigin.Renderer.ForPropertyName.SYMBOL, 'o', Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER};
    private static final char[] AND = {C8039.f23874, 'a', Advice.OffsetMapping.ForOrigin.Renderer.ForMethodName.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForPropertyName.SYMBOL, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER};
    private static final char[] OPEN = {C8039.f23875, PublicSuffixDatabase.f30961, SignatureVisitor.SUPER, SignatureVisitor.SUPER, ' '};
    private static final char[] CLOSE = {' ', SignatureVisitor.SUPER, SignatureVisitor.SUPER, C8039.f23876};

    public enum Tag {
        COMMENT,
        START,
        TEXT,
        END
    }

    public Formatter(Writer writer, Format format) {
        this.result = new BufferedWriter(writer, 1024);
        this.indenter = new Indenter(format);
        this.prolog = format.getProlog();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void append(char c) throws Exception {
        this.buffer.append(c);
    }

    private void data(String str) throws Exception {
        write("<![CDATA[");
        write(str);
        write("]]>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void escape(String str) throws Exception {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            escape(str.charAt(i));
        }
    }

    private boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private boolean isText(char c) {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return true;
        }
        return c > ' ' && c <= '~' && c != 247;
    }

    private char[] symbol(char c) {
        if (c == '\"') {
            return DOUBLE;
        }
        if (c == '<') {
            return LESS;
        }
        if (c == '>') {
            return GREATER;
        }
        if (c == '&') {
            return AND;
        }
        if (c != '\'') {
            return null;
        }
        return SINGLE;
    }

    private String unicode(char c) {
        return Integer.toString(c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void write(char c) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(c);
    }

    public void flush() throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.flush();
    }

    public void writeAttribute(String str, String str2, String str3) throws Exception {
        if (this.last != Tag.START) {
            throw new NodeException("Start element required");
        }
        write(' ');
        write(str, str3);
        write(SignatureVisitor.INSTANCEOF);
        write(C8039.f3212);
        escape(str2);
        write(C8039.f3212);
    }

    public void writeComment(String str) throws Exception {
        String pVar = this.indenter.top();
        if (this.last == Tag.START) {
            append(C8039.f23876);
        }
        if (pVar != null) {
            append(pVar);
            append(OPEN);
            append(str);
            append(CLOSE);
        }
        this.last = Tag.COMMENT;
    }

    public void writeEnd(String str, String str2) throws Exception {
        String strPop = this.indenter.pop();
        Tag tag = this.last;
        Tag tag2 = Tag.START;
        if (tag == tag2) {
            write('/');
            write(C8039.f23876);
        } else {
            if (tag != Tag.TEXT) {
                write(strPop);
            }
            if (this.last != tag2) {
                write(C8039.f23875);
                write('/');
                write(str, str2);
                write(C8039.f23876);
            }
        }
        this.last = Tag.END;
    }

    public void writeNamespace(String str, String str2) throws Exception {
        if (this.last != Tag.START) {
            throw new NodeException("Start element required");
        }
        write(' ');
        write(NAMESPACE);
        if (!isEmpty(str2)) {
            write(':');
            write(str2);
        }
        write(SignatureVisitor.INSTANCEOF);
        write(C8039.f3212);
        escape(str);
        write(C8039.f3212);
    }

    public void writeProlog() throws Exception {
        String str = this.prolog;
        if (str != null) {
            write(str);
            write("\n");
        }
    }

    public void writeStart(String str, String str2) throws Exception {
        String strPush = this.indenter.push();
        Tag tag = this.last;
        Tag tag2 = Tag.START;
        if (tag == tag2) {
            append(C8039.f23876);
        }
        flush();
        append(strPush);
        append(C8039.f23875);
        if (!isEmpty(str2)) {
            append(str2);
            append(':');
        }
        append(str);
        this.last = tag2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeText(String str) throws Exception {
        writeText(str, Mode.ESCAPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private void append(char[] cArr) throws Exception {
        this.buffer.append(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void writeText(String str, Mode mode) throws Exception {
        if (this.last == Tag.START) {
            write(C8039.f23876);
        }
        if (mode == Mode.DATA) {
            data(str);
        } else {
            escape(str);
        }
        this.last = Tag.TEXT;
    }

    private void append(String str) throws Exception {
        this.buffer.append(str);
    }

    private void escape(char c) throws Exception {
        char[] cArrSymbol = symbol(c);
        if (cArrSymbol != null) {
            write(cArrSymbol);
        } else {
            write(c);
        }
    }

    private void write(char[] cArr) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(cArr);
    }

    private void write(String str) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(str);
    }

    private void write(String str, String str2) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        if (!isEmpty(str2)) {
            this.result.write(str2);
            this.result.write(58);
        }
        this.result.write(str);
    }
}
