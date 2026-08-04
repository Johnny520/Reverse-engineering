package yyds;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: yyds.ᛲᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0379 implements Closeable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0261 f1953;

    static {
        C1507 c1507 = new C1507();
        c1507.m3016(C2534.f12475);
        f1953 = new C0261(r1.f12477.length, c1507);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC1429.m2918(mo908());
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InputStream m1079() {
        return mo908().mo2135();
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public abstract InterfaceC0981 mo908();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public abstract long mo909();

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public abstract C0811 mo910();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final String m1080() {
        Charset charsetM1865;
        InterfaceC0981 interfaceC0981Mo908 = mo908();
        String th = null;
        try {
            C0811 c0811Mo910 = mo910();
            if (c0811Mo910 == null || (charsetM1865 = C0811.m1865(c0811Mo910)) == null) {
                charsetM1865 = AbstractC0347.f1806;
            }
            String strMo2132 = interfaceC0981Mo908.mo2132(AbstractC0795.m1809(interfaceC0981Mo908, charsetM1865));
            try {
                interfaceC0981Mo908.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strMo2132;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (interfaceC0981Mo908 != null) {
                try {
                    interfaceC0981Mo908.close();
                } catch (Throwable th4) {
                    AbstractC1579.m3235(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final byte[] m1081() throws IOException {
        long jMo909 = mo909();
        if (jMo909 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jMo909);
        }
        InterfaceC0981 interfaceC0981Mo908 = mo908();
        byte[] th = null;
        try {
            byte[] bArrMo2133 = interfaceC0981Mo908.mo2133();
            try {
                interfaceC0981Mo908.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = bArrMo2133;
        } catch (Throwable th3) {
            th = th3;
            if (interfaceC0981Mo908 != null) {
                try {
                    interfaceC0981Mo908.close();
                } catch (Throwable th4) {
                    AbstractC1579.m3235(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jMo909 == -1 || jMo909 == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jMo909 + ") and stream length (" + length + ") disagree");
    }
}
