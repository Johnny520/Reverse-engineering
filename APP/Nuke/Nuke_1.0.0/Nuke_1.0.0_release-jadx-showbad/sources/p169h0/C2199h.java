package p169h0;

import p011B4.AbstractC0231b;
import p153e1.EnumC2017m;

/* JADX INFO: renamed from: h0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2199h implements InterfaceC2195d {

    /* JADX INFO: renamed from: a */
    public final float f7178a;

    /* JADX INFO: renamed from: b */
    public final float f7179b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2199h(float f2, float f5) {
        this.f7178a = f2;
        this.f7179b = f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.InterfaceC2195d
    /* JADX INFO: renamed from: a */
    public final long mo4017a(long j5, long j6, EnumC2017m enumC2017m) {
        float f2 = (((int) (j6 >> 32)) - ((int) (j5 >> 32))) / 2.0f;
        float f5 = (((int) (j6 & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f;
        EnumC2017m enumC2017m2 = EnumC2017m.f6742d;
        float f6 = this.f7178a;
        if (enumC2017m != enumC2017m2) {
            f6 *= -1;
        }
        float f7 = 1;
        float f8 = (f6 + f7) * f2;
        return (((long) Math.round((f7 + this.f7179b) * f5)) & 4294967295L) | (((long) Math.round(f8)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2199h)) {
            return false;
        }
        C2199h c2199h = (C2199h) obj;
        return Float.compare(this.f7178a, c2199h.f7178a) == 0 && Float.compare(this.f7179b, c2199h.f7179b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f7179b) + (Float.hashCode(this.f7178a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f7178a);
        sb.append(", verticalBias=");
        return AbstractC0231b.m401l(sb, this.f7179b, ')');
    }
}
