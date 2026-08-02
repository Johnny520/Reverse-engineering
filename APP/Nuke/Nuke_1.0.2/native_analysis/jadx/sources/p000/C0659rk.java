package p000;

/* JADX INFO: renamed from: rk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0659rk implements InterfaceC0644r5 {

    /* JADX INFO: renamed from: a */
    public final float f9614a;

    /* JADX INFO: renamed from: b */
    public final float f9615b;

    public C0659rk(float f, float f2) {
        this.f9614a = f;
        this.f9615b = f2;
    }

    @Override // p000.InterfaceC0644r5
    /* JADX INFO: renamed from: a */
    public final long mo3571a(long j, long j2, d61 d61Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        d61 d61Var2 = d61.f1885h;
        float f3 = this.f9614a;
        if (d61Var != d61Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.f9615b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0659rk)) {
            return false;
        }
        C0659rk c0659rk = (C0659rk) obj;
        return Float.compare(this.f9614a, c0659rk.f9614a) == 0 && Float.compare(this.f9615b, c0659rk.f9615b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9615b) + (Float.hashCode(this.f9614a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f9614a);
        sb.append(", verticalBias=");
        return vi0.m5693l(sb, this.f9615b, ')');
    }
}
