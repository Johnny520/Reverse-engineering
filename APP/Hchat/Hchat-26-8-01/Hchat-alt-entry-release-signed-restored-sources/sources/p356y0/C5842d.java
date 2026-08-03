package p356y0;

import p293u2.EnumC4243m;

/* JADX INFO: renamed from: y0.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5842d implements InterfaceC5841c {

    /* JADX INFO: renamed from: a */
    public final float f23777a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5842d(float f3) {
        this.f23777a = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.InterfaceC5841c
    /* JADX INFO: renamed from: a */
    public final long mo10544a(long j3, long j4, EnumC4243m enumC4243m) {
        long j5 = (((long) (((int) (j4 >> 32)) - ((int) (j3 >> 32)))) << 32) | (((long) (((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L)))) & 4294967295L);
        float f3 = 1;
        float f10 = (this.f23777a + f3) * (((int) (j5 >> 32)) / 2.0f);
        return (((long) Math.round((f3 - 1.0f) * (((int) (j5 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f10)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5842d) && Float.compare(this.f23777a, ((C5842d) obj).f23777a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f23777a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f23777a + ", verticalBias=-1.0)";
    }
}
