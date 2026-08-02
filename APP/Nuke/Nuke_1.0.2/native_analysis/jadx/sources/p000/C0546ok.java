package p000;

/* JADX INFO: renamed from: ok */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0546ok implements InterfaceC0644r5 {

    /* JADX INFO: renamed from: a */
    public final float f7700a;

    public C0546ok(float f) {
        this.f7700a = f;
    }

    @Override // p000.InterfaceC0644r5
    /* JADX INFO: renamed from: a */
    public final long mo3571a(long j, long j2, d61 d61Var) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        return (((long) Math.round((((int) (j3 & 4294967295L)) / 2.0f) * 0.0f)) & 4294967295L) | (((long) Math.round((1.0f + this.f7700a) * (((int) (j3 >> 32)) / 2.0f))) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0546ok) && Float.compare(this.f7700a, ((C0546ok) obj).f7700a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f7700a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f7700a + ", verticalBias=-1.0)";
    }
}
