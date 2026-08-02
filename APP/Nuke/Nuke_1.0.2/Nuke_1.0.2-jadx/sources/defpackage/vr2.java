package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vr2 {
    public bs2 a;
    public long b;
    public boolean c;
    public int d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vr2(long j, bs2 bs2Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = bs2Var;
        this.b = j;
        ml2 ml2Var = ds2.a;
        if (j != 0) {
            bs2 bs2VarD = d();
            long j2 = bs2VarD.j;
            long[] jArr = bs2VarD.k;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = bs2VarD.i;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = bs2VarD.h;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (ds2.c) {
                iA = ds2.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(vr2 vr2Var) {
        ds2.b.A(vr2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        synchronized (ds2.c) {
            b();
            p();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        ds2.d = ds2.d.b(g());
    }

    public abstract void c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bs2 d() {
        return this.a;
    }

    public abstract in0 e();

    public abstract boolean f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long g() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int h() {
        return 0;
    }

    public abstract in0 i();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final vr2 j() {
        b5 b5Var = ds2.b;
        vr2 vr2Var = (vr2) b5Var.p();
        b5Var.A(this);
        return vr2Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(pu2 pu2Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        int i = this.d;
        if (i >= 0) {
            ds2.u(i);
            this.d = -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void p() {
        o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(bs2 bs2Var) {
        this.a = bs2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void s(long j) {
        this.b = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract vr2 u(in0 in0Var);
}
