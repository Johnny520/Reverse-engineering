package p065f1;

import java.util.ArrayList;
import p009E0.C0106f;
import p011F0.C0113a;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p063e1.AbstractC0553a;

/* JADX INFO: renamed from: f1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0560d {

    /* JADX INFO: renamed from: a */
    public final String f1869a;

    /* JADX INFO: renamed from: b */
    public final String f1870b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1871c;

    /* JADX INFO: renamed from: d */
    public final String f1872d;

    /* JADX INFO: renamed from: e */
    public final C0106f f1873e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0560d(String str) {
        int i2;
        AbstractC0223g.m418e(str, "descriptor");
        this.f1873e = new C0106f(new C0113a(10, this));
        int iM517o0 = 0;
        int iM518p0 = AbstractC0299i.m518p0(str, "->", 0, false, 6);
        int iM518p02 = AbstractC0299i.m518p0(str, "(", iM518p0 + 1, false, 4);
        int i3 = iM518p02 + 1;
        int iM518p03 = AbstractC0299i.m518p0(str, ")", i3, false, 4);
        if (iM518p0 == -1 || iM518p02 == -1 || iM518p03 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        String strSubstring = str.substring(0, iM518p0);
        AbstractC0223g.m417d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f1869a = AbstractC0553a.m1127a(strSubstring);
        String strSubstring2 = str.substring(iM518p0 + 2, iM518p02);
        AbstractC0223g.m417d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f1870b = strSubstring2;
        String strSubstring3 = str.substring(i3, iM518p03);
        AbstractC0223g.m417d(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i2 = iM517o0;
            while (iM517o0 < strSubstring3.length()) {
                char cCharAt = strSubstring3.charAt(iM517o0);
                if (cCharAt == '[') {
                    iM517o0++;
                } else {
                    if (cCharAt == 'L') {
                        iM517o0 = AbstractC0299i.m517o0(strSubstring3, ';', iM517o0, 4);
                    }
                    iM517o0++;
                    String strSubstring4 = strSubstring3.substring(i2, iM517o0);
                    AbstractC0223g.m417d(strSubstring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(AbstractC0553a.m1127a(strSubstring4));
                }
            }
            break loop0;
        }
        if (i2 != iM517o0) {
            throw new IllegalStateException("Unknown signString: ".concat(strSubstring3));
        }
        this.f1871c = arrayList;
        String strSubstring5 = str.substring(iM518p03 + 1);
        AbstractC0223g.m417d(strSubstring5, "(this as java.lang.String).substring(startIndex)");
        this.f1872d = AbstractC0553a.m1127a(strSubstring5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0560d)) {
            return false;
        }
        C0560d c0560d = (C0560d) obj;
        return AbstractC0223g.m414a(this.f1869a, c0560d.f1869a) && AbstractC0223g.m414a(this.f1870b, c0560d.f1870b) && AbstractC0223g.m414a(this.f1871c, c0560d.f1871c) && AbstractC0223g.m414a(this.f1872d, c0560d.f1872d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1872d.hashCode() + (this.f1871c.hashCode() * 31) + (this.f1870b.hashCode() * 31) + (this.f1869a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = AbstractC0553a.m1128b(this.f1869a) + "->" + this.f1870b + ((String) this.f1873e.m247a());
        AbstractC0223g.m417d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
