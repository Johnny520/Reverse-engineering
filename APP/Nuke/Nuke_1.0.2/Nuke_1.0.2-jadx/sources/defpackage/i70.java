package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i70 implements e70 {
    public final float h;
    public final float i;
    public final dm0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i70(float f, float f2, dm0 dm0Var) {
        this.h = f;
        this.i = f2;
        this.j = dm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float K(long j) {
        if (q13.a(p13.b(j), 4294967296L)) {
            return this.j.b(p13.c(j));
        }
        s.l("Only Sp can convert to Px");
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i70)) {
            return false;
        }
        i70 i70Var = (i70) obj;
        return Float.compare(this.h, i70Var.h) == 0 && Float.compare(this.i, i70Var.i) == 0 && this.j.equals(i70Var.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.j.hashCode() + vi0.c(this.i, Float.hashCode(this.h) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DensityWithConverter(density=" + this.h + ", fontScale=" + this.i + ", converter=" + this.j + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final long x(float f) {
        return rg3.I(this.j.a(f), 4294967296L);
    }
}
