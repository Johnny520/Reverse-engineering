package p001A0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0023X {

    /* JADX INFO: renamed from: a */
    public final String f180a;

    /* JADX INFO: renamed from: b */
    public final String f181b;

    /* JADX INFO: renamed from: c */
    public final String f182c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0023X(String str, String str2, String str3) {
        AbstractC0223g.m418e(str, "className");
        AbstractC0223g.m418e(str2, "methodName");
        AbstractC0223g.m418e(str3, "methodSign");
        this.f180a = str;
        this.f181b = str2;
        this.f182c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0023X)) {
            return false;
        }
        C0023X c0023x = (C0023X) obj;
        return AbstractC0223g.m414a(this.f180a, c0023x.f180a) && AbstractC0223g.m414a(this.f181b, c0023x.f181b) && AbstractC0223g.m414a(this.f182c, c0023x.f182c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f182c.hashCode() + AbstractC0174d.m347c(this.f181b, this.f180a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("MethodSpec(className=");
        sb.append(this.f180a);
        sb.append(", methodName=");
        sb.append(this.f181b);
        sb.append(", methodSign=");
        return AbstractC0174d.m356l(sb, this.f182c, ")");
    }
}
