package p001A0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0030c {

    /* JADX INFO: renamed from: a */
    public final String f218a;

    /* JADX INFO: renamed from: b */
    public final String f219b;

    /* JADX INFO: renamed from: c */
    public final String f220c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0030c(String str, String str2, String str3) {
        AbstractC0223g.m418e(str, "className");
        AbstractC0223g.m418e(str2, "methodName");
        AbstractC0223g.m418e(str3, "methodSign");
        this.f218a = str;
        this.f219b = str2;
        this.f220c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0030c)) {
            return false;
        }
        C0030c c0030c = (C0030c) obj;
        return AbstractC0223g.m414a(this.f218a, c0030c.f218a) && AbstractC0223g.m414a(this.f219b, c0030c.f219b) && AbstractC0223g.m414a(this.f220c, c0030c.f220c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f220c.hashCode() + AbstractC0174d.m347c(this.f219b, this.f218a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageStorageHookPoint(className=");
        sb.append(this.f218a);
        sb.append(", methodName=");
        sb.append(this.f219b);
        sb.append(", methodSign=");
        return AbstractC0174d.m356l(sb, this.f220c, ")");
    }
}
