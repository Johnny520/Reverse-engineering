package p356y0;

import p068eh.AbstractC0921a;
import p293u2.EnumC4243m;

/* JADX INFO: renamed from: y0.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5845g implements InterfaceC5841c {

    /* JADX INFO: renamed from: a */
    public final float f23780a;

    /* JADX INFO: renamed from: b */
    public final float f23781b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5845g(float f3, float f10) {
        this.f23780a = f3;
        this.f23781b = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.InterfaceC5841c
    /* JADX INFO: renamed from: a */
    public final long mo10544a(long j3, long j4, EnumC4243m enumC4243m) {
        float f3 = (((int) (j4 >> 32)) - ((int) (j3 >> 32))) / 2.0f;
        float f10 = (((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f;
        EnumC4243m enumC4243m2 = EnumC4243m.f13919g;
        float f11 = this.f23780a;
        if (enumC4243m != enumC4243m2) {
            f11 *= -1;
        }
        float f12 = 1;
        float f13 = (f11 + f12) * f3;
        return (((long) Math.round((f12 + this.f23781b) * f10)) & 4294967295L) | (((long) Math.round(f13)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5845g)) {
            return false;
        }
        C5845g c5845g = (C5845g) obj;
        return Float.compare(this.f23780a, c5845g.f23780a) == 0 && Float.compare(this.f23781b, c5845g.f23781b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f23781b) + (Float.hashCode(this.f23780a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f23780a);
        sb2.append(", verticalBias=");
        return AbstractC0921a.m2252o(sb2, this.f23781b, ')');
    }
}
