package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x22 implements e70 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ e70 f12776h;

    /* JADX INFO: renamed from: i */
    public boolean f12777i;

    /* JADX INFO: renamed from: j */
    public boolean f12778j;

    /* JADX INFO: renamed from: k */
    public final kl1 f12779k = new kl1();

    public x22(e70 e70Var) {
        this.f12776h = e70Var;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: A */
    public final float mo689A(float f) {
        return this.f12776h.mo689A(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: K */
    public final float mo690K(long j) {
        return this.f12776h.mo690K(j);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: T */
    public final int mo692T(float f) {
        return this.f12776h.mo692T(f);
    }

    /* JADX INFO: renamed from: a */
    public final void m6025a() {
        this.f12778j = true;
        kl1 kl1Var = this.f12779k;
        if (kl1Var.m2719c()) {
            kl1Var.m2722f(null);
        }
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f12776h.mo693b();
    }

    /* JADX INFO: renamed from: c */
    public final void m6026c() {
        this.f12777i = true;
        kl1 kl1Var = this.f12779k;
        if (kl1Var.m2719c()) {
            kl1Var.m2722f(null);
        }
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: d0 */
    public final long mo694d0(long j) {
        return this.f12776h.mo694d0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6027e(u00 u00Var) {
        v22 v22Var;
        if (u00Var instanceof v22) {
            v22Var = (v22) u00Var;
            int i = v22Var.f11617m;
            if ((i & Integer.MIN_VALUE) != 0) {
                v22Var.f11617m = i - Integer.MIN_VALUE;
            } else {
                v22Var = new v22(this, u00Var);
            }
        }
        Object obj = v22Var.f11615k;
        int i2 = v22Var.f11617m;
        if (i2 == 0) {
            fg1.m1627T(obj);
            v22Var.f11617m = 1;
            Object objM2720d = this.f12779k.m2720d(v22Var);
            k20 k20Var = k20.f5323h;
            if (objM2720d == k20Var) {
                return k20Var;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
        }
        this.f12777i = false;
        this.f12778j = false;
        return a83.f116a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6028f(u00 u00Var) {
        w22 w22Var;
        if (u00Var instanceof w22) {
            w22Var = (w22) u00Var;
            int i = w22Var.f12276m;
            if ((i & Integer.MIN_VALUE) != 0) {
                w22Var.f12276m = i - Integer.MIN_VALUE;
            } else {
                w22Var = new w22(this, u00Var);
            }
        }
        Object obj = w22Var.f12274k;
        int i2 = w22Var.f12276m;
        kl1 kl1Var = this.f12779k;
        if (i2 == 0) {
            fg1.m1627T(obj);
            if (!this.f12777i && !this.f12778j) {
                w22Var.f12276m = 1;
                Object objM2720d = kl1Var.m2720d(w22Var);
                k20 k20Var = k20.f5323h;
                if (objM2720d == k20Var) {
                    return k20Var;
                }
            }
            return Boolean.valueOf(this.f12777i);
        }
        if (i2 != 1) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.m1627T(obj);
        kl1Var.m2722f(null);
        return Boolean.valueOf(this.f12777i);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: h0 */
    public final float mo695h0(long j) {
        return this.f12776h.mo695h0(j);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f12776h.mo697m();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: p0 */
    public final long mo698p0(float f) {
        return this.f12776h.mo698p0(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: u0 */
    public final float mo700u0(int i) {
        return this.f12776h.mo700u0(i);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: x */
    public final long mo701x(float f) {
        return this.f12776h.mo701x(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: x0 */
    public final float mo702x0(float f) {
        return this.f12776h.mo702x0(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: y */
    public final long mo703y(long j) {
        return this.f12776h.mo703y(j);
    }
}
