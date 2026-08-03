package na;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: na.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2920h {

    /* JADX INFO: renamed from: a */
    public final String f9488a;

    /* JADX INFO: renamed from: b */
    public final int f9489b;

    /* JADX INFO: renamed from: c */
    public final String f9490c;

    /* JADX INFO: renamed from: d */
    public final long f9491d;

    /* JADX INFO: renamed from: e */
    public final boolean f9492e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2920h(String str, int i9, String str2, long j3, boolean z9) {
        str.getClass();
        str2.getClass();
        this.f9488a = str;
        this.f9489b = i9;
        this.f9490c = str2;
        this.f9491d = j3;
        this.f9492e = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2920h m6337a(C2920h c2920h, String str, int i9, String str2, long j3, boolean z9, int i10) {
        if ((i10 & 1) != 0) {
            str = c2920h.f9488a;
        }
        String str3 = str;
        if ((i10 & 2) != 0) {
            i9 = c2920h.f9489b;
        }
        int i11 = i9;
        if ((i10 & 4) != 0) {
            str2 = c2920h.f9490c;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            j3 = c2920h.f9491d;
        }
        long j4 = j3;
        if ((i10 & 16) != 0) {
            z9 = c2920h.f9492e;
        }
        c2920h.getClass();
        str3.getClass();
        str4.getClass();
        return new C2920h(str3, i11, str4, j4, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2920h)) {
            return false;
        }
        C2920h c2920h = (C2920h) obj;
        return AbstractC1416l.m3825a(this.f9488a, c2920h.f9488a) && this.f9489b == c2920h.f9489b && AbstractC1416l.m3825a(this.f9490c, c2920h.f9490c) && this.f9491d == c2920h.f9491d && this.f9492e == c2920h.f9492e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f9492e) + AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f9489b, this.f9488a.hashCode() * 31, 31), 31, this.f9490c), 31, this.f9491d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2258u = AbstractC0921a.m2258u(this.f9489b, "RedPacketReplyStep(id=", this.f9488a, ", mode=", ", content=");
        sbM2258u.append(this.f9490c);
        sbM2258u.append(", delayMs=");
        sbM2258u.append(this.f9491d);
        sbM2258u.append(", random=");
        sbM2258u.append(this.f9492e);
        sbM2258u.append(")");
        return sbM2258u.toString();
    }
}
