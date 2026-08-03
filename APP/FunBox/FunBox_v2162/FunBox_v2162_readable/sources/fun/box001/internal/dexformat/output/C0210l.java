package fun.box001.internal.dexformat.output;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: renamed from: n.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0210l {

    /* JADX INFO: renamed from: a */
    private final Writer f812a;

    /* JADX INFO: renamed from: b */
    private final int f813b;

    /* JADX INFO: renamed from: c */
    private final StringBuffer f814c;

    /* JADX INFO: renamed from: d */
    private final StringBuffer f815d;

    /* JADX INFO: renamed from: e */
    private final C0204f f816e;

    /* JADX INFO: renamed from: f */
    private final C0204f f817f;

    public C0210l(StringWriter stringWriter, int i2, int i3, String str) {
        if (stringWriter == null) {
            throw new NullPointerException("out == null");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (i3 < 1) {
            throw new IllegalArgumentException("rightWidth < 1");
        }
        StringWriter stringWriter2 = new StringWriter(1000);
        StringWriter stringWriter3 = new StringWriter(1000);
        this.f812a = stringWriter;
        this.f813b = i2;
        this.f814c = stringWriter2.getBuffer();
        this.f815d = stringWriter3.getBuffer();
        this.f816e = new C0204f(stringWriter2, i2, "");
        this.f817f = new C0204f(stringWriter3, i3, str);
    }

    /* JADX INFO: renamed from: a */
    private static void m539a(StringBuffer stringBuffer, C0204f c0204f) {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        c0204f.write(10);
    }

    /* JADX INFO: renamed from: c */
    private void m540c() throws IOException {
        StringBuffer stringBuffer;
        int iIndexOf;
        while (true) {
            StringBuffer stringBuffer2 = this.f814c;
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = (stringBuffer = this.f815d).indexOf("\n")) < 0) {
                return;
            }
            Writer writer = this.f812a;
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i2 = this.f813b - iIndexOf2; i2 > 0; i2--) {
                    writer.write(32);
                }
                writer.write(stringBuffer.substring(0, iIndexOf));
            }
            writer.write(10);
            stringBuffer2.delete(0, iIndexOf2 + 1);
            stringBuffer.delete(0, iIndexOf + 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m541d(String str, int i2, String str2, int i3) {
        StringWriter stringWriter = new StringWriter((str.length() + str2.length()) * 3);
        C0210l c0210l = new C0210l(stringWriter, i2, i3, "");
        try {
            c0210l.f816e.write(str);
            c0210l.f817f.write(str2);
            c0210l.m542b();
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new RuntimeException("shouldn't happen", e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m542b() {
        StringBuffer stringBuffer = this.f815d;
        StringBuffer stringBuffer2 = this.f814c;
        C0204f c0204f = this.f817f;
        C0204f c0204f2 = this.f816e;
        try {
            m539a(stringBuffer2, c0204f2);
            m539a(stringBuffer, c0204f);
            m540c();
            m539a(stringBuffer2, c0204f2);
            while (stringBuffer2.length() != 0) {
                c0204f.write(10);
                m540c();
            }
            m539a(stringBuffer, c0204f);
            while (stringBuffer.length() != 0) {
                c0204f2.write(10);
                m540c();
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
