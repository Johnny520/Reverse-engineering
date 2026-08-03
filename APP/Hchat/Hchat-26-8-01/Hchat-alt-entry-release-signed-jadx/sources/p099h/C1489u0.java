package p099h;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: h.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1489u0 {

    /* JADX INFO: renamed from: a */
    public final float f4941a;

    /* JADX INFO: renamed from: b */
    public final float f4942b;

    /* JADX INFO: renamed from: c */
    public final long f4943c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1489u0(float f3, float f10, long j3) {
        this.f4941a = f3;
        this.f4942b = f10;
        this.f4943c = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1489u0)) {
            return false;
        }
        C1489u0 c1489u0 = (C1489u0) obj;
        return Float.compare(this.f4941a, c1489u0.f4941a) == 0 && Float.compare(this.f4942b, c1489u0.f4942b) == 0 && this.f4943c == c1489u0.f4943c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f4943c) + AbstractC0921a.m2241d(this.f4942b, Float.hashCode(this.f4941a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f4941a + ", distance=" + this.f4942b + ", duration=" + this.f4943c + ')';
    }
}
