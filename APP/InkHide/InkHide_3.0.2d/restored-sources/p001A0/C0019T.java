package p001A0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0019T {

    /* JADX INFO: renamed from: a */
    public final String f154a;

    /* JADX INFO: renamed from: b */
    public final String f155b;

    /* JADX INFO: renamed from: c */
    public final String f156c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0019T(String str, String str2, String str3) {
        AbstractC0223g.m418e(str, "className");
        AbstractC0223g.m418e(str2, "methodName");
        AbstractC0223g.m418e(str3, "methodSign");
        this.f154a = str;
        this.f155b = str2;
        this.f156c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0019T)) {
            return false;
        }
        C0019T c0019t = (C0019T) obj;
        return AbstractC0223g.m414a(this.f154a, c0019t.f154a) && AbstractC0223g.m414a(this.f155b, c0019t.f155b) && AbstractC0223g.m414a(this.f156c, c0019t.f156c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f156c.hashCode() + AbstractC0174d.m347c(this.f155b, this.f154a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("MethodSpec(className=");
        sb.append(this.f154a);
        sb.append(", methodName=");
        sb.append(this.f155b);
        sb.append(", methodSign=");
        return AbstractC0174d.m356l(sb, this.f156c, ")");
    }
}
