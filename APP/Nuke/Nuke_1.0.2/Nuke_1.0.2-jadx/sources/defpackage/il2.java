package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class il2 extends th1 implements j61, on2 {
    public nl2 v;
    public boolean w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int D(kd1 kd1Var, if1 if1Var, int i) {
        if (!this.w) {
            i = Integer.MAX_VALUE;
        }
        return if1Var.X(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int U(kd1 kd1Var, if1 if1Var, int i) {
        if (this.w) {
            i = Integer.MAX_VALUE;
        }
        return if1Var.N(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        te.p(j, this.w ? qv1.h : qv1.i);
        sz1 sz1VarE = if1Var.e(fz.a(j, 0, this.w ? fz.h(j) : Integer.MAX_VALUE, 0, this.w ? Integer.MAX_VALUE : fz.g(j), 5));
        int i = sz1VarE.h;
        int iH = fz.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = sz1VarE.i;
        int iG = fz.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = sz1VarE.i - i2;
        int i4 = sz1VarE.h - i;
        if (!this.w) {
            i3 = i4;
        }
        nl2 nl2Var = this.v;
        kx1 kx1Var = nl2Var.e;
        kx1 kx1Var2 = nl2Var.a;
        kx1Var.h(i3);
        vr2 vr2VarB = tl.B();
        in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
        vr2 vr2VarK = tl.K(vr2VarB);
        try {
            if (kx1Var2.g() > i3) {
                kx1Var2.h(i3);
            }
            tl.U(vr2VarB, vr2VarK, in0VarE);
            this.v.b.h(this.w ? i2 : i);
            this.v.c.h(this.w ? sz1VarE.i : sz1VarE.h);
            return pf1Var.j0(i, i2, ce0.h, new a62(i3, 1, this, sz1VarE));
        } catch (Throwable th) {
            tl.U(vr2VarB, vr2VarK, in0VarE);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int g(kd1 kd1Var, if1 if1Var, int i) {
        if (this.w) {
            i = Integer.MAX_VALUE;
        }
        return if1Var.W(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
        v41[] v41VarArr = xn2.a;
        yn2 yn2Var = vn2.n;
        v41[] v41VarArr2 = xn2.a;
        v41 v41Var = v41VarArr2[6];
        zn2Var.a(yn2Var, Boolean.TRUE);
        final int i = 0;
        final int i2 = 1;
        el2 el2Var = new el2(new xm0(this) { // from class: hl2
            public final /* synthetic */ il2 i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int iG;
                int i3 = i;
                il2 il2Var = this.i;
                switch (i3) {
                    case 0:
                        iG = il2Var.v.a.g();
                        break;
                    default:
                        iG = il2Var.v.e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        }, new xm0(this) { // from class: hl2
            public final /* synthetic */ il2 i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int iG;
                int i3 = i2;
                il2 il2Var = this.i;
                switch (i3) {
                    case 0:
                        iG = il2Var.v.a.g();
                        break;
                    default:
                        iG = il2Var.v.e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        });
        if (this.w) {
            yn2 yn2Var2 = vn2.w;
            v41 v41Var2 = v41VarArr2[13];
            zn2Var.a(yn2Var2, el2Var);
        } else {
            yn2 yn2Var3 = vn2.v;
            v41 v41Var3 = v41VarArr2[12];
            zn2Var.a(yn2Var3, el2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int p(kd1 kd1Var, if1 if1Var, int i) {
        if (!this.w) {
            i = Integer.MAX_VALUE;
        }
        return if1Var.f(i);
    }
}
