package p065f1;

import p009E0.C0106f;
import p011F0.C0113a;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p063e1.AbstractC0553a;

/* JADX INFO: renamed from: f1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0558b {

    /* JADX INFO: renamed from: a */
    public final String f1864a;

    /* JADX INFO: renamed from: b */
    public final String f1865b;

    /* JADX INFO: renamed from: c */
    public final String f1866c;

    /* JADX INFO: renamed from: d */
    public final C0106f f1867d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0558b(String str) {
        AbstractC0223g.m418e(str, "descriptor");
        this.f1867d = new C0106f(new C0113a(9, this));
        int iM518p0 = AbstractC0299i.m518p0(str, "->", 0, false, 6);
        int iM518p02 = AbstractC0299i.m518p0(str, ":", iM518p0 + 1, false, 4);
        if (iM518p0 == -1 || iM518p02 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        String strSubstring = str.substring(0, iM518p0);
        AbstractC0223g.m417d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f1864a = AbstractC0553a.m1127a(strSubstring);
        String strSubstring2 = str.substring(iM518p0 + 2, iM518p02);
        AbstractC0223g.m417d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.f1865b = strSubstring2;
        String strSubstring3 = str.substring(iM518p02 + 1);
        AbstractC0223g.m417d(strSubstring3, "(this as java.lang.String).substring(startIndex)");
        this.f1866c = AbstractC0553a.m1127a(strSubstring3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0558b)) {
            return false;
        }
        C0558b c0558b = (C0558b) obj;
        return AbstractC0223g.m414a(this.f1864a, c0558b.f1864a) && AbstractC0223g.m414a(this.f1865b, c0558b.f1865b) && AbstractC0223g.m414a(this.f1866c, c0558b.f1866c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1866c.hashCode() + (this.f1865b.hashCode() * 31) + (this.f1864a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = AbstractC0553a.m1128b(this.f1864a) + "->" + this.f1865b + ":" + ((String) this.f1867d.m247a());
        AbstractC0223g.m417d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
