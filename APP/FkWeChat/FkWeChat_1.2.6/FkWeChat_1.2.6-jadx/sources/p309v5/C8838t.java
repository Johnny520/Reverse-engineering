package p309v5;

import bsh.C1259t2;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import okhttp3.C5750e;
import p280t5.C8130u;
import p376zd.C9987e;

/* JADX INFO: renamed from: v5.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8838t {

    /* JADX INFO: renamed from: a */
    public final Writer f29370a;

    /* JADX INFO: renamed from: b */
    public final int f29371b;

    /* JADX INFO: renamed from: c */
    public final StringBuffer f29372c;

    /* JADX INFO: renamed from: d */
    public final StringBuffer f29373d;

    /* JADX INFO: renamed from: e */
    public final C8827i f29374e;

    /* JADX INFO: renamed from: f */
    public final C8827i f29375f;

    public C8838t(Writer writer, int i10, int i11, String str) {
        if (writer == null) {
            C1259t2.m5095a("out == null");
            throw null;
        }
        if (i10 < 1) {
            C9987e.m38645a("leftWidth < 1");
            throw null;
        }
        if (i11 < 1) {
            C9987e.m38645a("rightWidth < 1");
            throw null;
        }
        if (str == null) {
            C1259t2.m5095a("spacer == null");
            throw null;
        }
        StringWriter stringWriter = new StringWriter(1000);
        StringWriter stringWriter2 = new StringWriter(1000);
        this.f29370a = writer;
        this.f29371b = i10;
        this.f29372c = stringWriter.getBuffer();
        this.f29373d = stringWriter2.getBuffer();
        this.f29374e = new C8827i(stringWriter, i10);
        this.f29375f = new C8827i(stringWriter2, i11, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m33931a(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    /* JADX INFO: renamed from: h */
    public static String m33932h(String str, int i10, String str2, String str3, int i11) {
        StringWriter stringWriter = new StringWriter((str.length() + str3.length()) * 3);
        C8838t c8838t = new C8838t(stringWriter, i10, i11, str2);
        try {
            c8838t.m33937e().write(str);
            c8838t.m33938f().write(str3);
            c8838t.m33934b();
            return stringWriter.toString();
        } catch (IOException e10) {
            C8130u.m31512a("shouldn't happen", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m33933i(Writer writer, int i10) throws IOException {
        while (i10 > 0) {
            writer.write(32);
            i10--;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m33934b() {
        try {
            m33931a(this.f29372c, this.f29374e);
            m33931a(this.f29373d, this.f29375f);
            m33939g();
            m33935c();
            m33936d();
        } catch (IOException e10) {
            C5750e.m23251a(e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m33935c() throws IOException {
        m33931a(this.f29372c, this.f29374e);
        while (this.f29372c.length() != 0) {
            this.f29375f.write(10);
            m33939g();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m33936d() throws IOException {
        m33931a(this.f29373d, this.f29375f);
        while (this.f29373d.length() != 0) {
            this.f29374e.write(10);
            m33939g();
        }
    }

    /* JADX INFO: renamed from: e */
    public Writer m33937e() {
        return this.f29374e;
    }

    /* JADX INFO: renamed from: f */
    public Writer m33938f() {
        return this.f29375f;
    }

    /* JADX INFO: renamed from: g */
    public final void m33939g() throws IOException {
        int iIndexOf;
        while (true) {
            int iIndexOf2 = this.f29372c.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = this.f29373d.indexOf("\n")) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                this.f29370a.write(this.f29372c.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                m33933i(this.f29370a, this.f29371b - iIndexOf2);
                this.f29370a.write(this.f29373d.substring(0, iIndexOf));
            }
            this.f29370a.write(10);
            this.f29372c.delete(0, iIndexOf2 + 1);
            this.f29373d.delete(0, iIndexOf + 1);
        }
    }
}
