package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rz1 implements e70 {
    public boolean h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: sz1 */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(rz1 rz1Var, sz1 sz1Var) {
        rz1Var.getClass();
        if (sz1Var instanceof ki1) {
            ((ki1) sz1Var).l(rz1Var.h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(rz1 rz1Var, sz1 sz1Var, int i, int i2) {
        rz1Var.getClass();
        a(rz1Var, sz1Var);
        sz1Var.f0(z01.c((((long) i2) & 4294967295L) | (((long) i) << 32), sz1Var.l), 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(rz1 rz1Var, sz1 sz1Var, long j) {
        rz1Var.getClass();
        a(rz1Var, sz1Var);
        sz1Var.f0(z01.c(j, sz1Var.l), 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(rz1 rz1Var, sz1 sz1Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (rz1Var.e() == d61.h || rz1Var.f() == 0) {
            a(rz1Var, sz1Var);
            sz1Var.f0(z01.c(j, sz1Var.l), 0.0f, null);
        } else {
            int iF = (rz1Var.f() - sz1Var.h) - ((int) (j >> 32));
            a(rz1Var, sz1Var);
            sz1Var.f0(z01.c((((long) iF) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), sz1Var.l), 0.0f, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(rz1 rz1Var, sz1 sz1Var, int i, int i2) {
        int i3 = tz1.b;
        oq0 oq0Var = oq0.w;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (rz1Var.e() == d61.h || rz1Var.f() == 0) {
            a(rz1Var, sz1Var);
            sz1Var.f0(z01.c(j, sz1Var.l), 0.0f, oq0Var);
        } else {
            int iF = (rz1Var.f() - sz1Var.h) - ((int) (j >> 32));
            a(rz1Var, sz1Var);
            sz1Var.f0(z01.c((((long) iF) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), sz1Var.l), 0.0f, oq0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(rz1 rz1Var, sz1 sz1Var, in0 in0Var) {
        rz1Var.getClass();
        a(rz1Var, sz1Var);
        sz1Var.f0(z01.c(0L, sz1Var.l), 0.0f, in0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float c(gu0 gu0Var) {
        return Float.NaN;
    }

    public abstract d61 e();

    public abstract int f();
}
