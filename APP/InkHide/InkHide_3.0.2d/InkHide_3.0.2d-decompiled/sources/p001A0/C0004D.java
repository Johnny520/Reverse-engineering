package p001A0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p102z0.AbstractC1135r;

/* JADX INFO: renamed from: A0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0004D {

    /* JADX INFO: renamed from: a */
    public final String f30a;

    /* JADX INFO: renamed from: b */
    public final String f31b;

    /* JADX INFO: renamed from: c */
    public final String f32c;

    /* JADX INFO: renamed from: d */
    public final int f33d;

    /* JADX INFO: renamed from: e */
    public final String f34e;

    /* JADX INFO: renamed from: f */
    public final long f35f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0004D(String str, String str2, String str3, int i2, String str4, long j2) {
        this.f30a = str;
        this.f31b = str2;
        this.f32c = str3;
        this.f33d = i2;
        this.f34e = str4;
        this.f35f = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m0a() {
        if (this.f33d == AbstractC1135r.m2494p()) {
            return this.f34e.equals(AbstractC1135r.m2495q());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0004D)) {
            return false;
        }
        C0004D c0004d = (C0004D) obj;
        return AbstractC0223g.m414a(this.f30a, c0004d.f30a) && AbstractC0223g.m414a(this.f31b, c0004d.f31b) && AbstractC0223g.m414a(this.f32c, c0004d.f32c) && this.f33d == c0004d.f33d && AbstractC0223g.m414a(this.f34e, c0004d.f34e) && this.f35f == c0004d.f35f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f35f) + AbstractC0174d.m347c(this.f34e, AbstractC0174d.m345a(this.f33d, AbstractC0174d.m347c(this.f32c, AbstractC0174d.m347c(this.f31b, this.f30a.hashCode() * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CachedHookPoint(className=" + this.f30a + ", methodName=" + this.f31b + ", methodSign=" + this.f32c + ", versionCode=" + this.f33d + ", versionName=" + this.f34e + ", updatedAt=" + this.f35f + ")";
    }
}
