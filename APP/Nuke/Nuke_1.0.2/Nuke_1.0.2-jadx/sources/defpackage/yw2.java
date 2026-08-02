package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yw2 implements e70, t00 {
    public final /* synthetic */ zw2 h;
    public final mp i;
    public mp j;
    public i12 k = i12.i;
    public final zd0 l = zd0.h;
    public final /* synthetic */ zw2 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yw2(zw2 zw2Var, mp mpVar) {
        this.m = zw2Var;
        this.h = zw2Var;
        this.i = mpVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float A(float f) {
        return this.h.b() * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float K(long j) {
        return this.h.K(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final int T(float f) {
        return this.h.T(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(i12 i12Var, rj rjVar) {
        mp mpVar = new mp(1, gf1.z(rjVar));
        mpVar.u();
        this.k = i12Var;
        this.j = mpVar;
        return mpVar.t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return this.h.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long c() {
        zw2 zw2Var = this.m;
        long jD0 = zw2Var.d0(sp0.c0(zw2Var).H.g());
        long j = zw2Var.E;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jD0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jD0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final long d0(long j) {
        return this.h.d0(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final za3 e() {
        return sp0.c0(this.m).H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final a20 f() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j, mn0 mn0Var, u00 u00Var) {
        ww2 ww2Var;
        Throwable th;
        zt2 zt2Var;
        mp mpVar;
        if (u00Var instanceof ww2) {
            ww2Var = (ww2) u00Var;
            int i = ww2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ww2Var.n = i - Integer.MIN_VALUE;
            } else {
                ww2Var = new ww2(this, u00Var);
            }
        }
        Object objG = ww2Var.l;
        int i2 = ww2Var.n;
        if (i2 != 0) {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zt2Var = ww2Var.k;
            try {
                fg1.T(objG);
                zt2Var.c(kp.i);
                return objG;
            } catch (Throwable th2) {
                th = th2;
                zt2Var.c(kp.i);
                throw th;
            }
        }
        fg1.T(objG);
        if (j <= 0 && (mpVar = this.j) != null) {
            mpVar.h(new x92(new j12(j)));
        }
        zt2 zt2VarA = p7.A(this.m.A0(), null, new gc(j, this, null), 3);
        try {
            ww2Var.k = zt2VarA;
            ww2Var.n = 1;
            objG = mn0Var.g(this, ww2Var);
            Object obj = k20.h;
            if (objG == obj) {
                return obj;
            }
            zt2Var = zt2VarA;
            zt2Var.c(kp.i);
            return objG;
        } catch (Throwable th3) {
            th = th3;
            zt2Var = zt2VarA;
            zt2Var.c(kp.i);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final void h(Object obj) {
        zw2 zw2Var = this.m;
        synchronized (zw2Var.B) {
            zw2Var.A.j(this);
        }
        this.i.h(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float h0(long j) {
        return this.h.h0(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j, mn0 mn0Var, u00 u00Var) {
        xw2 xw2Var;
        if (u00Var instanceof xw2) {
            xw2Var = (xw2) u00Var;
            int i = xw2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xw2Var.m = i - Integer.MIN_VALUE;
            } else {
                xw2Var = new xw2(this, u00Var);
            }
        }
        Object obj = xw2Var.k;
        int i2 = xw2Var.m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.T(obj);
                    return obj;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            xw2Var.m = 1;
            Object objG = g(j, mn0Var, xw2Var);
            Object obj2 = k20.h;
            return objG == obj2 ? obj2 : objG;
        } catch (j12 unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        return this.h.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final long p0(float f) {
        return this.h.p0(f);
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
