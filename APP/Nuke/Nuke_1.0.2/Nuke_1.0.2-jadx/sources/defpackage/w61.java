package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w61 implements iw2, pf1 {
    public final /* synthetic */ z61 h;
    public final /* synthetic */ f71 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w61(f71 f71Var) {
        this.i = f71Var;
        this.h = f71Var.o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float A(float f) {
        return this.h.b() * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iw2
    public final List I(mn0 mn0Var, Object obj) {
        f71 f71Var = this.i;
        r61 r61Var = f71Var.h;
        rk1 rk1Var = f71Var.n;
        r61 r61Var2 = (r61) rk1Var.g(obj);
        if (r61Var2 != null && ((zk1) ((jk1) r61Var.o()).i).i(r61Var2) < f71Var.k) {
            return r61Var2.m();
        }
        rk1 rk1Var2 = f71Var.s;
        rk1 rk1Var3 = f71Var.q;
        zk1 zk1Var = f71Var.t;
        if (zk1Var.j < f71Var.l) {
            kz0.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        r61 r61Var3 = (r61) rk1Var.g(obj);
        int i = zk1Var.j;
        int i2 = f71Var.l;
        if (i == i2) {
            zk1Var.b(obj);
        } else {
            Object[] objArr = zk1Var.h;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        f71Var.l++;
        boolean zB = rk1Var3.b(obj);
        if (zB || r61Var3 != null) {
            if (!zB && r61Var3 != null) {
                f71Var.j(((zk1) ((jk1) r61Var.o()).i).i(r61Var3), ((zk1) ((jk1) r61Var.o()).i).j);
                f71Var.v++;
                rk1Var.k(obj);
                rk1Var3.m(obj, r61Var3);
                rk1Var2.m(obj, f71Var.f(obj));
                if (r61Var.H()) {
                    f71Var.h();
                }
            }
            r61 r61Var4 = (r61) rk1Var3.g(obj);
            x61 x61Var = r61Var4 != null ? (x61) f71Var.m.g(r61Var4) : null;
            if (x61Var != null && x61Var.d) {
                f71Var.m(r61Var4, obj, false, mn0Var);
            }
            if ((x61Var != null ? x61Var.f : null) != null) {
                f71Var.d(x61Var, true);
            }
        } else {
            f71Var.k(obj, mn0Var, false);
            rk1Var2.m(obj, f71Var.f(obj));
        }
        r61 r61Var5 = (r61) rk1Var3.g(obj);
        if (r61Var5 == null) {
            return be0.h;
        }
        List listL0 = r61Var5.N.p.l0();
        jk1 jk1Var = (jk1) listL0;
        int i3 = ((zk1) jk1Var.i).j;
        for (int i4 = 0; i4 < i3; i4++) {
            ((mf1) jk1Var.get(i4)).m.b = true;
        }
        return listL0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float K(long j) {
        return this.h.K(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pf1
    public final of1 S(int i, int i2, Map map, in0 in0Var, in0 in0Var2) {
        return this.h.S(i, i2, map, in0Var, in0Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final int T(float f) {
        return this.h.T(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return this.h.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final long d0(long j) {
        return this.h.d0(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m11
    public final d61 getLayoutDirection() {
        return this.h.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float h0(long j) {
        return this.h.h0(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pf1
    public final of1 j0(int i, int i2, Map map, in0 in0Var) {
        return this.h.S(i, i2, map, null, in0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        return this.h.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final long p0(float f) {
        return this.h.p0(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m11
    public final boolean u() {
        return this.h.u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float u0(int i) {
        return this.h.u0(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final long x(float f) {
        return this.h.x(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float x0(float f) {
        return f / this.h.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final long y(long j) {
        return this.h.y(j);
    }
}
