package com.android.dx.util;

import androidx.collection.C0276;
import bsh.C2633;
import com.google.protobuf.DescriptorProtos$Edition;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class TwoColumnOutput {
    private final StringBuffer leftBuf;
    private final IndentingWriter leftColumn;
    private final int leftWidth;
    private final Writer out;
    private final StringBuffer rightBuf;
    private final IndentingWriter rightColumn;

    public TwoColumnOutput(Writer writer, int i, int i2, String str) {
        if (writer == null) {
            C2633.m5343("out == null");
            throw null;
        }
        if (i < 1) {
            C5925.m11310("leftWidth < 1");
            throw null;
        }
        if (i2 < 1) {
            C5925.m11310("rightWidth < 1");
            throw null;
        }
        if (str == null) {
            C2633.m5343("spacer == null");
            throw null;
        }
        StringWriter stringWriter = new StringWriter(DescriptorProtos$Edition.EDITION_2023_VALUE);
        StringWriter stringWriter2 = new StringWriter(DescriptorProtos$Edition.EDITION_2023_VALUE);
        this.out = writer;
        this.leftWidth = i;
        this.leftBuf = stringWriter.getBuffer();
        this.rightBuf = stringWriter2.getBuffer();
        this.leftColumn = new IndentingWriter(stringWriter, i);
        this.rightColumn = new IndentingWriter(stringWriter2, i2, str);
    }

    private static void appendNewlineIfNecessary(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    private void flushLeft() throws IOException {
        appendNewlineIfNecessary(this.leftBuf, this.leftColumn);
        while (this.leftBuf.length() != 0) {
            this.rightColumn.write(10);
            outputFullLines();
        }
    }

    private void flushRight() throws IOException {
        appendNewlineIfNecessary(this.rightBuf, this.rightColumn);
        while (this.rightBuf.length() != 0) {
            this.leftColumn.write(10);
            outputFullLines();
        }
    }

    private void outputFullLines() throws IOException {
        int iIndexOf;
        while (true) {
            int iIndexOf2 = this.leftBuf.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = this.rightBuf.indexOf("\n")) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                this.out.write(this.leftBuf.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                writeSpaces(this.out, this.leftWidth - iIndexOf2);
                this.out.write(this.rightBuf.substring(0, iIndexOf));
            }
            this.out.write(10);
            this.leftBuf.delete(0, iIndexOf2 + 1);
            this.rightBuf.delete(0, iIndexOf + 1);
        }
    }

    public static String toString(String str, int i, String str2, String str3, int i2) {
        StringWriter stringWriter = new StringWriter((str.length() + str3.length()) * 3);
        TwoColumnOutput twoColumnOutput = new TwoColumnOutput(stringWriter, i, i2, str2);
        try {
            twoColumnOutput.getLeft().write(str);
            twoColumnOutput.getRight().write(str3);
            twoColumnOutput.flush();
            return stringWriter.toString();
        } catch (IOException e) {
            C0276.m848("shouldn't happen", e);
            return null;
        }
    }

    private static void writeSpaces(Writer writer, int i) throws IOException {
        while (i > 0) {
            writer.write(32);
            i--;
        }
    }

    public void flush() {
        try {
            appendNewlineIfNecessary(this.leftBuf, this.leftColumn);
            appendNewlineIfNecessary(this.rightBuf, this.rightColumn);
            outputFullLines();
            flushLeft();
            flushRight();
        } catch (IOException e) {
            C5925.m11313(e);
        }
    }

    public Writer getLeft() {
        return this.leftColumn;
    }

    public Writer getRight() {
        return this.rightColumn;
    }

    public TwoColumnOutput(OutputStream outputStream, int i, int i2, String str) {
        this(new OutputStreamWriter(outputStream), i, i2, str);
    }
}
