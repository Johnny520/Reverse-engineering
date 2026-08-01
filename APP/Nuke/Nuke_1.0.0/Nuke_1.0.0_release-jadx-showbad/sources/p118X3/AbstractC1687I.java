package p118X3;

import com.bumptech.glide.AbstractC1926h;
import java.io.Closeable;
import java.nio.charset.Charset;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p123Y3.AbstractC1774e;
import p149d3.AbstractC1973a;
import p208n4.C2706e;
import p208n4.C2709h;
import p208n4.InterfaceC2708g;

/* JADX INFO: renamed from: X3.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1687I implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final C1686H f5761e;

    /* JADX INFO: renamed from: d */
    public C1685G f5762d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2709h c2709h = C2709h.f8630g;
        AbstractC1665j.m2985e(c2709h, "<this>");
        C2706e c2706e = new C2706e();
        c2706e.m4703E(c2709h);
        f5761e = new C1686H(null, c2709h.f8631d.length, c2706e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Charset m3006b() {
        String str;
        C1711u c1711uMo506d = mo506d();
        if (c1711uMo506d != null) {
            C1675t c1675t = C1711u.f5877d;
            String[] strArr = c1711uMo506d.f5881c;
            int iM3576s = AbstractC1926h.m3576s(0, strArr.length - 1, 2);
            Charset charsetForName = null;
            if (iM3576s >= 0) {
                int i5 = 0;
                while (true) {
                    String str2 = strArr[i5];
                    if (!(str2 == null ? false : str2.equalsIgnoreCase("charset"))) {
                        if (i5 == iM3576s) {
                            break;
                        }
                        i5 += 2;
                    } else {
                        str = strArr[i5 + 1];
                        break;
                    }
                }
                str = null;
                if (str != null) {
                    try {
                        charsetForName = Charset.forName(str);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (charsetForName != null) {
                    return charsetForName;
                }
            } else {
                str = null;
                if (str != null) {
                }
                if (charsetForName != null) {
                }
            }
        }
        return AbstractC1973a.f6662a;
    }

    /* JADX INFO: renamed from: c */
    public abstract long mo505c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC1774e.m3161b(mo507f());
    }

    /* JADX INFO: renamed from: d */
    public abstract C1711u mo506d();

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC2708g mo507f();
}
