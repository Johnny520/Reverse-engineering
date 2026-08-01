package p102z0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: z0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1133p {

    /* JADX INFO: renamed from: a */
    public final String f3819a;

    /* JADX INFO: renamed from: b */
    public final String f3820b;

    /* JADX INFO: renamed from: c */
    public final String f3821c;

    /* JADX INFO: renamed from: d */
    public final long f3822d;

    /* JADX INFO: renamed from: e */
    public final String f3823e;

    /* JADX INFO: renamed from: f */
    public final boolean f3824f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1133p(String str, String str2, String str3, long j2, String str4, boolean z2) {
        AbstractC0223g.m418e(str4, "lastSeen");
        this.f3819a = str;
        this.f3820b = str2;
        this.f3821c = str3;
        this.f3822d = j2;
        this.f3823e = str4;
        this.f3824f = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1133p)) {
            return false;
        }
        C1133p c1133p = (C1133p) obj;
        return AbstractC0223g.m414a(this.f3819a, c1133p.f3819a) && AbstractC0223g.m414a(this.f3820b, c1133p.f3820b) && AbstractC0223g.m414a(this.f3821c, c1133p.f3821c) && this.f3822d == c1133p.f3822d && AbstractC0223g.m414a(this.f3823e, c1133p.f3823e) && this.f3824f == c1133p.f3824f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3824f) + AbstractC0174d.m347c(this.f3823e, (Long.hashCode(this.f3822d) + AbstractC0174d.m347c(this.f3821c, AbstractC0174d.m347c(this.f3820b, this.f3819a.hashCode() * 31, 31), 31)) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Track(talker=" + this.f3819a + ", trackId=" + this.f3820b + ", summary=" + this.f3821c + ", sendTime=" + this.f3822d + ", lastSeen=" + this.f3823e + ", completed=" + this.f3824f + ")";
    }
}
