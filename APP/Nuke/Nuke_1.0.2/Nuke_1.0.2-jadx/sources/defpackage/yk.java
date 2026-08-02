package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yk extends lw1 {
    public final d9 e;
    public final long f;
    public final int g;
    public final long h;
    public float i;
    public cl j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yk(d9 d9Var) {
        int i;
        long width = (((long) d9Var.a.getWidth()) << 32) | (((long) d9Var.a.getHeight()) & 4294967295L);
        this.e = d9Var;
        this.f = width;
        this.g = 1;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > d9Var.a.getWidth() || i > d9Var.a.getHeight()) {
            s.j("Failed requirement.");
            throw null;
        }
        this.h = width;
        this.i = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lw1
    public final void a(float f) {
        this.i = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lw1
    public final void b(cl clVar) {
        this.j = clVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lw1
    public final long d() {
        return s11.q0(this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lw1
    public final void e(t61 t61Var) {
        sp spVar = t61Var.h;
        nc0.V(t61Var, this.e, this.f, (((long) Math.round(Float.intBitsToFloat((int) (spVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (spVar.d() & 4294967295L)))) & 4294967295L), this.i, this.j, this.g, 328);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk)) {
            return false;
        }
        yk ykVar = (yk) obj;
        return t11.l(this.e, ykVar.e) && z01.a(0L, 0L) && h11.a(this.f, ykVar.f) && this.g == ykVar.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.g) + hk1.c(hk1.c(this.e.hashCode() * 31, 31, 0L), 31, this.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.e);
        sb.append(", srcOffset=");
        sb.append((Object) z01.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) h11.b(this.f));
        sb.append(", filterQuality=");
        int i = this.g;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
