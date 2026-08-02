package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t61 implements nc0 {
    public final sp h = new sp();
    public mc0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float A(float f) {
        return this.h.b() * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final b5 E() {
        return this.h.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void G(y9 y9Var, an anVar, float f, op0 op0Var, int i) {
        this.h.G(y9Var, anVar, f, op0Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float K(long j) {
        return this.h.K(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void R(d9 d9Var, long j, long j2, long j3, float f, cl clVar, int i) {
        this.h.R(d9Var, j, j2, j3, f, clVar, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final int T(float f) {
        return this.h.T(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void Y(long j, long j2, long j3, float f, int i) {
        this.h.Y(j, j2, j3, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        sp spVar = this.h;
        qp qpVarQ = spVar.i.q();
        t60 t60Var = this.i;
        if (t60Var == null) {
            throw vi0.e("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        th1 th1Var = (th1) t60Var;
        th1 th1VarM = th1Var.h.m;
        if (th1VarM == null || (th1VarM.k & 4) == 0) {
            th1VarM = null;
        } else {
            while (th1VarM != null) {
                int i = th1VarM.j;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    th1VarM = th1VarM.m;
                }
            }
            th1VarM = null;
        }
        if (th1VarM == null) {
            zn1 zn1VarZ = sp0.Z(t60Var, 4);
            if (zn1VarZ.S0() == th1Var.h) {
                zn1VarZ = zn1VarZ.w;
                zn1VarZ.getClass();
            }
            zn1VarZ.h1(qpVarQ, (pq0) spVar.i.j);
            return;
        }
        zk1 zk1Var = null;
        while (th1VarM != null) {
            if (th1VarM instanceof mc0) {
                mc0 mc0Var = (mc0) th1VarM;
                pq0 pq0Var = (pq0) spVar.i.j;
                zn1 zn1VarZ2 = sp0.Z(mc0Var, 4);
                long jQ0 = s11.q0(zn1VarZ2.j);
                r61 r61Var = zn1VarZ2.v;
                r61Var.getClass();
                ((b7) u61.a(r61Var)).getSharedDrawScope().c(qpVarQ, jQ0, zn1VarZ2, mc0Var, pq0Var);
            } else if ((th1VarM.j & 4) != 0 && (th1VarM instanceof u60)) {
                int i2 = 0;
                for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                    if ((th1Var2.j & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            th1VarM = th1Var2;
                        } else {
                            if (zk1Var == null) {
                                zk1Var = new zk1(new th1[16]);
                            }
                            if (th1VarM != null) {
                                zk1Var.b(th1VarM);
                                th1VarM = null;
                            }
                            zk1Var.b(th1Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            th1VarM = sp0.m(zk1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final long a0() {
        return this.h.a0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return this.h.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(qp qpVar, long j, zn1 zn1Var, mc0 mc0Var, pq0 pq0Var) {
        mc0 mc0Var2 = this.i;
        this.i = mc0Var;
        d61 d61Var = zn1Var.v.G;
        sp spVar = this.h;
        b5 b5Var = spVar.i;
        rp rpVar = ((sp) b5Var.k).h;
        e70 e70Var = rpVar.a;
        d61 d61Var2 = rpVar.b;
        qp qpVarQ = b5Var.q();
        b5 b5Var2 = spVar.i;
        long jU = b5Var2.u();
        pq0 pq0Var2 = (pq0) b5Var2.j;
        b5Var2.C(zn1Var);
        b5Var2.D(d61Var);
        b5Var2.B(qpVar);
        b5Var2.E(j);
        b5Var2.j = pq0Var;
        qpVar.l();
        try {
            mc0Var.P(this);
            qpVar.i();
            b5Var2.C(e70Var);
            b5Var2.D(d61Var2);
            b5Var2.B(qpVarQ);
            b5Var2.E(jU);
            b5Var2.j = pq0Var2;
            this.i = mc0Var2;
        } catch (Throwable th) {
            qpVar.i();
            b5Var2.C(e70Var);
            b5Var2.D(d61Var2);
            b5Var2.B(qpVarQ);
            b5Var2.E(jU);
            b5Var2.j = pq0Var2;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void c0(long j, long j2, long j3, op0 op0Var, int i) {
        this.h.c0(j, j2, j3, op0Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final long d() {
        return this.h.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final long d0(long j) {
        return this.h.d0(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final d61 getLayoutDirection() {
        return this.h.h.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float h0(long j) {
        return this.h.h0(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        return this.h.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void o(long j, float f, long j2, op0 op0Var) {
        this.h.o(j, f, j2, op0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final long p0(float f) {
        return this.h.p0(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void t(y9 y9Var, long j, op0 op0Var) {
        this.h.t(y9Var, j, op0Var);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void z(an anVar, long j, long j2, long j3, float f, op0 op0Var) {
        this.h.z(anVar, j, j2, j3, f, op0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nc0
    public final void z0(long j, float f, float f2, long j2, long j3, op0 op0Var) {
        this.h.z0(j, f, f2, j2, j3, op0Var);
    }
}
