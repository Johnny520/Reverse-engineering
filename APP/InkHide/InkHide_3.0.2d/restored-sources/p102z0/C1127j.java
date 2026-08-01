package p102z0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: z0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1127j {

    /* JADX INFO: renamed from: a */
    public final String f3796a;

    /* JADX INFO: renamed from: b */
    public final String f3797b;

    /* JADX INFO: renamed from: c */
    public final String f3798c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1127j(String str, String str2, String str3) {
        AbstractC0223g.m418e(str, "className");
        AbstractC0223g.m418e(str2, "methodName");
        AbstractC0223g.m418e(str3, "methodSign");
        this.f3796a = str;
        this.f3797b = str2;
        this.f3798c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1127j)) {
            return false;
        }
        C1127j c1127j = (C1127j) obj;
        return AbstractC0223g.m414a(this.f3796a, c1127j.f3796a) && AbstractC0223g.m414a(this.f3797b, c1127j.f3797b) && AbstractC0223g.m414a(this.f3798c, c1127j.f3798c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3798c.hashCode() + AbstractC0174d.m347c(this.f3797b, this.f3796a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarHookMethodSpec(className=");
        sb.append(this.f3796a);
        sb.append(", methodName=");
        sb.append(this.f3797b);
        sb.append(", methodSign=");
        return AbstractC0174d.m356l(sb, this.f3798c, ")");
    }
}
