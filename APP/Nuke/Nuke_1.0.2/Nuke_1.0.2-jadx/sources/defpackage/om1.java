package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class om1 extends wk1 {
    public final wk1 o;
    public boolean p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public om1(long j, bs2 bs2Var, in0 in0Var, in0 in0Var2, wk1 wk1Var) {
        super(j, bs2Var, in0Var, in0Var2);
        this.o = wk1Var;
        wk1Var.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wk1, defpackage.vr2
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wk1
    public final p40 w() {
        om1 om1Var;
        wk1 wk1Var = this.o;
        if (wk1Var.m || wk1Var.c) {
            return new xr2(this);
        }
        sk1 sk1Var = this.h;
        long j = this.b;
        HashMap mapB = sk1Var != null ? ds2.b(wk1Var.g(), this, this.o.d()) : null;
        Object obj = ds2.c;
        synchronized (obj) {
            try {
                ds2.c(this);
                if (sk1Var == null || sk1Var.d == 0) {
                    om1Var = this;
                    om1Var.a();
                } else {
                    om1Var = this;
                    p40 p40VarZ = om1Var.z(this.o.g(), sk1Var, mapB, this.o.d());
                    if (!p40VarZ.equals(yr2.n)) {
                        return p40VarZ;
                    }
                    sk1 sk1VarX = om1Var.o.x();
                    if (sk1VarX != null) {
                        sk1VarX.j(sk1Var);
                    } else {
                        om1Var.o.B(sk1Var);
                        om1Var.h = null;
                    }
                }
                if (t11.p(om1Var.o.g(), j) < 0) {
                    om1Var.o.v();
                }
                wk1 wk1Var2 = om1Var.o;
                wk1Var2.r(wk1Var2.d().b(j).a(om1Var.j));
                om1Var.o.A(j);
                wk1 wk1Var3 = om1Var.o;
                int i = om1Var.d;
                om1Var.d = -1;
                if (i >= 0) {
                    int[] iArr = wk1Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    wk1Var3.k = iArrCopyOf;
                } else {
                    wk1Var3.getClass();
                }
                wk1 wk1Var4 = om1Var.o;
                bs2 bs2Var = om1Var.j;
                wk1Var4.getClass();
                synchronized (obj) {
                    wk1Var4.j = wk1Var4.j.d(bs2Var);
                    wk1 wk1Var5 = om1Var.o;
                    int[] iArr2 = om1Var.k;
                    wk1Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = wk1Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        wk1Var5.k = iArr2;
                    }
                }
                om1Var.m = true;
                if (!om1Var.p) {
                    om1Var.p = true;
                    om1Var.o.l();
                }
                return yr2.n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
