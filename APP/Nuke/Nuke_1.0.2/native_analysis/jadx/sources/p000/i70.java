package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i70 implements e70 {

    /* JADX INFO: renamed from: h */
    public final float f4467h;

    /* JADX INFO: renamed from: i */
    public final float f4468i;

    /* JADX INFO: renamed from: j */
    public final dm0 f4469j;

    public i70(float f, float f2, dm0 dm0Var) {
        this.f4467h = f;
        this.f4468i = f2;
        this.f4469j = dm0Var;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: K */
    public final float mo690K(long j) {
        if (q13.m4041a(p13.m3674b(j), 4294967296L)) {
            return this.f4469j.mo124b(p13.m3675c(j));
        }
        C0676s.m4653l("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f4467h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i70)) {
            return false;
        }
        i70 i70Var = (i70) obj;
        return Float.compare(this.f4467h, i70Var.f4467h) == 0 && Float.compare(this.f4468i, i70Var.f4468i) == 0 && this.f4469j.equals(i70Var.f4469j);
    }

    public final int hashCode() {
        return this.f4469j.hashCode() + vi0.m5684c(this.f4468i, Float.hashCode(this.f4467h) * 31, 31);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f4468i;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f4467h + ", fontScale=" + this.f4468i + ", converter=" + this.f4469j + ')';
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: x */
    public final long mo701x(float f) {
        return rg3.m4455I(this.f4469j.mo123a(f), 4294967296L);
    }
}
