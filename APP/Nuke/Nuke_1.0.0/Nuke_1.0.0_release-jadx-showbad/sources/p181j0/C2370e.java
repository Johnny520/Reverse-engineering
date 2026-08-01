package p181j0;

import p000A.C0066i0;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: j0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2370e {

    /* JADX INFO: renamed from: a */
    public final int f7696a;

    /* JADX INFO: renamed from: b */
    public final long f7697b;

    /* JADX INFO: renamed from: c */
    public final EnumC2371f f7698c;

    /* JADX INFO: renamed from: d */
    public final C0066i0 f7699d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2370e(int i5, long j5, EnumC2371f enumC2371f, C0066i0 c0066i0) {
        this.f7696a = i5;
        this.f7697b = j5;
        this.f7698c = enumC2371f;
        this.f7699d = c0066i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2370e)) {
            return false;
        }
        C2370e c2370e = (C2370e) obj;
        return this.f7696a == c2370e.f7696a && this.f7697b == c2370e.f7697b && this.f7698c == c2370e.f7698c && AbstractC1665j.m2981a(this.f7699d, c2370e.f7699d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f7698c.hashCode() + AbstractC0231b.m392c(Integer.hashCode(this.f7696a) * 31, 31, this.f7697b)) * 31;
        C0066i0 c0066i0 = this.f7699d;
        return iHashCode + (c0066i0 == null ? 0 : c0066i0.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f7696a + ", timestamp=" + this.f7697b + ", type=" + this.f7698c + ", structureCompat=" + this.f7699d + ')';
    }
}
