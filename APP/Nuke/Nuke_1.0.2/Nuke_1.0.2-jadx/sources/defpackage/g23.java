package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g23 {
    public final int a;
    public final yi b;
    public final d2 c;
    public g23 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ h23 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g23(h23 h23Var, int i, yi yiVar, d2 d2Var) {
        this.h = h23Var;
        this.a = i;
        this.b = yiVar;
        this.c = d2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        x72 x72Var;
        x72 x72Var2;
        long j5 = this.h.f;
        yi yiVar = this.b;
        zn1 zn1VarZ = sp0.Z(yiVar, 2);
        r61 r61VarC0 = sp0.c0(yiVar);
        boolean zI = r61VarC0.I();
        vn1 vn1Var = r61VarC0.M;
        if (zI) {
            if (((zn1) vn1Var.e) != zn1VarZ) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = zn1VarZ.j;
                zn1 zn1Var = (zn1) vn1Var.e;
                zn1Var.getClass();
                long J = tp0.J(zn1Var.D(zn1VarZ, jFloatToRawIntBits));
                x72Var = new x72(J, (4294967295L & ((long) (((int) (J & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (J >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, yiVar);
            } else {
                x72Var = new x72(j, j2, j3, j4, j5, fArr, yiVar);
            }
            x72Var2 = x72Var;
        } else {
            x72Var2 = null;
        }
        if (x72Var2 == null) {
            return;
        }
        this.c.j(x72Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        h23 h23Var = this.h;
        zj1 zj1Var = h23Var.a;
        int i = this.a;
        g23 g23Var = (g23) zj1Var.g(i);
        if (g23Var != null) {
            if (g23Var == this) {
                g23 g23Var2 = this.d;
                this.d = null;
                if (g23Var2 == null) {
                    r61 r61VarC0 = sp0.c0(this.b.h);
                    if (r61VarC0.n) {
                        ((b7) u61.a(r61VarC0)).getRectManager().b.t(r61VarC0.i, false);
                        return;
                    }
                    return;
                }
                int iD = zj1Var.d(i);
                Object[] objArr = zj1Var.c;
                Object obj = objArr[iD];
                zj1Var.b[iD] = i;
                objArr[iD] = g23Var2;
                return;
            }
            int iD2 = zj1Var.d(i);
            Object[] objArr2 = zj1Var.c;
            Object obj2 = objArr2[iD2];
            zj1Var.b[iD2] = i;
            objArr2[iD2] = g23Var;
            while (true) {
                g23 g23Var3 = g23Var.d;
                if (g23Var3 == null) {
                    break;
                }
                if (g23Var3 == this) {
                    g23Var.d = this.d;
                    this.d = null;
                    return;
                }
                g23Var = g23Var3;
            }
        }
        g23 g23Var4 = h23Var.b;
        if (g23Var4 == this) {
            h23Var.b = g23Var4.d;
            this.d = null;
            return;
        }
        g23 g23Var5 = g23Var4 != null ? g23Var4.d : null;
        while (true) {
            g23 g23Var6 = g23Var4;
            g23Var4 = g23Var5;
            if (g23Var4 == null) {
                return;
            }
            if (g23Var4 == this) {
                if (g23Var6 != null) {
                    g23Var6.d = g23Var4.d;
                }
                this.d = null;
                return;
            }
            g23Var5 = g23Var4.d;
        }
    }
}
