package p169h0;

import p153e1.EnumC2017m;

/* JADX INFO: renamed from: h0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2196e implements InterfaceC2195d {

    /* JADX INFO: renamed from: a */
    public final float f7175a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2196e(float f2) {
        this.f7175a = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.InterfaceC2195d
    /* JADX INFO: renamed from: a */
    public final long mo4017a(long j5, long j6, EnumC2017m enumC2017m) {
        long j7 = (((long) (((int) (j6 >> 32)) - ((int) (j5 >> 32)))) << 32) | (((long) (((int) (j6 & 4294967295L)) - ((int) (j5 & 4294967295L)))) & 4294967295L);
        float f2 = 1;
        float f5 = (this.f7175a + f2) * (((int) (j7 >> 32)) / 2.0f);
        return (((long) Math.round((f2 - 1.0f) * (((int) (j7 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f5)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2196e) && Float.compare(this.f7175a, ((C2196e) obj).f7175a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f7175a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f7175a + ", verticalBias=-1.0)";
    }
}
