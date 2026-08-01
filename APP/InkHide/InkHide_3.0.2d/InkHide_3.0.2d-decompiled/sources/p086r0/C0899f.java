package p086r0;

import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0899f {

    /* JADX INFO: renamed from: a */
    public final String f3163a;

    /* JADX INFO: renamed from: b */
    public final String f3164b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0899f(String str, String str2) {
        AbstractC0223g.m418e(str, "className");
        AbstractC0223g.m418e(str2, "methodName");
        this.f3163a = str;
        this.f3164b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0899f)) {
            return false;
        }
        C0899f c0899f = (C0899f) obj;
        return AbstractC0223g.m414a(this.f3163a, c0899f.f3163a) && AbstractC0223g.m414a(this.f3164b, c0899f.f3164b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3164b.hashCode() + (this.f3163a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RevokeHookPoint(className=" + this.f3163a + ", methodName=" + this.f3164b + ")";
    }
}
