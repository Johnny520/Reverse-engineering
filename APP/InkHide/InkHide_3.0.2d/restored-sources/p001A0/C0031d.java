package p001A0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0031d {

    /* JADX INFO: renamed from: a */
    public final String f221a;

    /* JADX INFO: renamed from: b */
    public final String f222b;

    /* JADX INFO: renamed from: c */
    public final String f223c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0031d(String str, String str2, String str3) {
        AbstractC0223g.m418e(str, "className");
        AbstractC0223g.m418e(str2, "methodName");
        AbstractC0223g.m418e(str3, "methodSign");
        this.f221a = str;
        this.f222b = str2;
        this.f223c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0031d)) {
            return false;
        }
        C0031d c0031d = (C0031d) obj;
        return AbstractC0223g.m414a(this.f221a, c0031d.f221a) && AbstractC0223g.m414a(this.f222b, c0031d.f222b) && AbstractC0223g.m414a(this.f223c, c0031d.f223c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f223c.hashCode() + AbstractC0174d.m347c(this.f222b, this.f221a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("XmlParserHookPoint(className=");
        sb.append(this.f221a);
        sb.append(", methodName=");
        sb.append(this.f222b);
        sb.append(", methodSign=");
        return AbstractC0174d.m356l(sb, this.f223c, ")");
    }
}
