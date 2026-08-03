package p305uh;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: uh.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4354c {

    /* JADX INFO: renamed from: a */
    public final float f14545a;

    /* JADX INFO: renamed from: b */
    public final float f14546b;

    /* JADX INFO: renamed from: c */
    public final float f14547c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4354c(float f3, float f10, float f11) {
        this.f14545a = f3;
        this.f14546b = f10;
        this.f14547c = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4354c)) {
            return false;
        }
        C4354c c4354c = (C4354c) obj;
        return Float.compare(this.f14545a, c4354c.f14545a) == 0 && Float.compare(this.f14546b, c4354c.f14546b) == 0 && Float.compare(this.f14547c, c4354c.f14547c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f14547c) + AbstractC0921a.m2241d(this.f14546b, Float.hashCode(this.f14545a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LightPosition(x=" + this.f14545a + ", y=" + this.f14546b + ", z=" + this.f14547c + ")";
    }
}
