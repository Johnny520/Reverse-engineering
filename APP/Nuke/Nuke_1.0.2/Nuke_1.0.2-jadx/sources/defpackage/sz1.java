package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sz1 {
    public int h;
    public int i;
    public long j = 0;
    public long k = tz1.a;
    public long l = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int Z() {
        return (int) (this.j & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int b0() {
        return (int) (this.j >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e0() {
        this.h = ci0.D((int) (this.j >> 32), fz.j(this.k), fz.h(this.k));
        int iD = ci0.D((int) (this.j & 4294967295L), fz.i(this.k), fz.g(this.k));
        this.i = iD;
        int i = this.h;
        long j = this.j;
        this.l = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iD - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void f0(long j, float f, in0 in0Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g0(long j) {
        if (h11.a(this.j, j)) {
            return;
        }
        this.j = j;
        e0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object i() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k0(long j) {
        if (fz.b(this.k, j)) {
            return;
        }
        this.k = j;
        e0();
    }
}
