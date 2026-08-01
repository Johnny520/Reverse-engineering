package p001A0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0028b {

    /* JADX INFO: renamed from: a */
    public final String f207a;

    /* JADX INFO: renamed from: b */
    public final String f208b;

    /* JADX INFO: renamed from: c */
    public final String f209c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0028b(String str, String str2, String str3) {
        AbstractC0223g.m418e(str, "className");
        AbstractC0223g.m418e(str2, "methodName");
        AbstractC0223g.m418e(str3, "methodSign");
        this.f207a = str;
        this.f208b = str2;
        this.f209c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0028b)) {
            return false;
        }
        C0028b c0028b = (C0028b) obj;
        return AbstractC0223g.m414a(this.f207a, c0028b.f207a) && AbstractC0223g.m414a(this.f208b, c0028b.f208b) && AbstractC0223g.m414a(this.f209c, c0028b.f209c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f209c.hashCode() + AbstractC0174d.m347c(this.f208b, this.f207a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("HookPoint(className=");
        sb.append(this.f207a);
        sb.append(", methodName=");
        sb.append(this.f208b);
        sb.append(", methodSign=");
        return AbstractC0174d.m356l(sb, this.f209c, ")");
    }
}
