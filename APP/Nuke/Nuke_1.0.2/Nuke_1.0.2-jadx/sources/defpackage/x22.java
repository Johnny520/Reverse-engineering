package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x22 implements e70 {
    public final /* synthetic */ e70 h;
    public boolean i;
    public boolean j;
    public final kl1 k = new kl1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x22(e70 e70Var) {
        this.h = e70Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float A(float f) {
        return this.h.A(f);
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
    public final void a() {
        this.j = true;
        kl1 kl1Var = this.k;
        if (kl1Var.c()) {
            kl1Var.f(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return this.h.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        this.i = true;
        kl1 kl1Var = this.k;
        if (kl1Var.c()) {
            kl1Var.f(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final long d0(long j) {
        return this.h.d0(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(u00 u00Var) {
        v22 v22Var;
        if (u00Var instanceof v22) {
            v22Var = (v22) u00Var;
            int i = v22Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                v22Var.m = i - Integer.MIN_VALUE;
            } else {
                v22Var = new v22(this, u00Var);
            }
        }
        Object obj = v22Var.k;
        int i2 = v22Var.m;
        if (i2 == 0) {
            fg1.T(obj);
            v22Var.m = 1;
            Object objD = this.k.d(v22Var);
            k20 k20Var = k20.h;
            if (objD == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
        }
        this.i = false;
        this.j = false;
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(u00 u00Var) {
        w22 w22Var;
        if (u00Var instanceof w22) {
            w22Var = (w22) u00Var;
            int i = w22Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                w22Var.m = i - Integer.MIN_VALUE;
            } else {
                w22Var = new w22(this, u00Var);
            }
        }
        Object obj = w22Var.k;
        int i2 = w22Var.m;
        kl1 kl1Var = this.k;
        if (i2 == 0) {
            fg1.T(obj);
            if (!this.i && !this.j) {
                w22Var.m = 1;
                Object objD = kl1Var.d(w22Var);
                k20 k20Var = k20.h;
                if (objD == k20Var) {
                    return k20Var;
                }
            }
            return Boolean.valueOf(this.i);
        }
        if (i2 != 1) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.T(obj);
        kl1Var.f(null);
        return Boolean.valueOf(this.i);
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
        return this.h.x0(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final long y(long j) {
        return this.h.y(j);
    }
}
