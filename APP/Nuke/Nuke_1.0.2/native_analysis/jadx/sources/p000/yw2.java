package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yw2 implements e70, t00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ zw2 f13653h;

    /* JADX INFO: renamed from: i */
    public final C0469mp f13654i;

    /* JADX INFO: renamed from: j */
    public C0469mp f13655j;

    /* JADX INFO: renamed from: k */
    public i12 f13656k = i12.f4217i;

    /* JADX INFO: renamed from: l */
    public final zd0 f13657l = zd0.f13837h;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ zw2 f13658m;

    public yw2(zw2 zw2Var, C0469mp c0469mp) {
        this.f13658m = zw2Var;
        this.f13653h = zw2Var;
        this.f13654i = c0469mp;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: A */
    public final float mo689A(float f) {
        return this.f13653h.mo693b() * f;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: K */
    public final float mo690K(long j) {
        return this.f13653h.mo690K(j);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: T */
    public final int mo692T(float f) {
        return this.f13653h.mo692T(f);
    }

    /* JADX INFO: renamed from: a */
    public final Object m6363a(i12 i12Var, AbstractC0658rj abstractC0658rj) {
        C0469mp c0469mp = new C0469mp(1, gf1.m1908z(abstractC0658rj));
        c0469mp.m3151u();
        this.f13656k = i12Var;
        this.f13655j = c0469mp;
        return c0469mp.m3150t();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f13653h.mo693b();
    }

    /* JADX INFO: renamed from: c */
    public final long m6364c() {
        zw2 zw2Var = this.f13658m;
        long jMo694d0 = zw2Var.mo694d0(sp0.m4933c0(zw2Var).f9367H.mo3036g());
        long j = zw2Var.f14130E;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo694d0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo694d0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: d0 */
    public final long mo694d0(long j) {
        return this.f13653h.mo694d0(j);
    }

    /* JADX INFO: renamed from: e */
    public final za3 m6365e() {
        return sp0.m4933c0(this.f13658m).f9367H;
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: f */
    public final a20 mo2508f() {
        return this.f13657l;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6366g(long j, mn0 mn0Var, u00 u00Var) {
        ww2 ww2Var;
        Throwable th;
        zt2 zt2Var;
        C0469mp c0469mp;
        if (u00Var instanceof ww2) {
            ww2Var = (ww2) u00Var;
            int i = ww2Var.f12703n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ww2Var.f12703n = i - Integer.MIN_VALUE;
            } else {
                ww2Var = new ww2(this, u00Var);
            }
        }
        Object objMo12g = ww2Var.f12701l;
        int i2 = ww2Var.f12703n;
        if (i2 != 0) {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zt2Var = ww2Var.f12700k;
            try {
                fg1.m1627T(objMo12g);
                zt2Var.mo1704c(C0395kp.f5698i);
                return objMo12g;
            } catch (Throwable th2) {
                th = th2;
                zt2Var.mo1704c(C0395kp.f5698i);
                throw th;
            }
        }
        fg1.m1627T(objMo12g);
        if (j <= 0 && (c0469mp = this.f13655j) != null) {
            c0469mp.mo2509h(new x92(new j12(j)));
        }
        zt2 zt2VarM3745A = AbstractC0570p7.m3745A(this.f13658m.m5255A0(), null, new C0235gc(j, this, null), 3);
        try {
            ww2Var.f12700k = zt2VarM3745A;
            ww2Var.f12703n = 1;
            objMo12g = mn0Var.mo12g(this, ww2Var);
            Object obj = k20.f5323h;
            if (objMo12g == obj) {
                return obj;
            }
            zt2Var = zt2VarM3745A;
            zt2Var.mo1704c(C0395kp.f5698i);
            return objMo12g;
        } catch (Throwable th3) {
            th = th3;
            zt2Var = zt2VarM3745A;
            zt2Var.mo1704c(C0395kp.f5698i);
            throw th;
        }
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: h */
    public final void mo2509h(Object obj) {
        zw2 zw2Var = this.f13658m;
        synchronized (zw2Var.f14127B) {
            zw2Var.f14126A.m6431j(this);
        }
        this.f13654i.mo2509h(obj);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: h0 */
    public final float mo695h0(long j) {
        return this.f13653h.mo695h0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6367j(long j, mn0 mn0Var, u00 u00Var) {
        xw2 xw2Var;
        if (u00Var instanceof xw2) {
            xw2Var = (xw2) u00Var;
            int i = xw2Var.f13212m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xw2Var.f13212m = i - Integer.MIN_VALUE;
            } else {
                xw2Var = new xw2(this, u00Var);
            }
        }
        Object obj = xw2Var.f13210k;
        int i2 = xw2Var.f13212m;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    fg1.m1627T(obj);
                    return obj;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            xw2Var.f13212m = 1;
            Object objM6366g = m6366g(j, mn0Var, xw2Var);
            Object obj2 = k20.f5323h;
            return objM6366g == obj2 ? obj2 : objM6366g;
        } catch (j12 unused) {
            return null;
        }
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f13653h.mo697m();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: p0 */
    public final long mo698p0(float f) {
        return this.f13653h.mo698p0(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: u0 */
    public final float mo700u0(int i) {
        return this.f13653h.mo700u0(i);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: x */
    public final long mo701x(float f) {
        return this.f13653h.mo701x(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: x0 */
    public final float mo702x0(float f) {
        return f / this.f13653h.mo693b();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: y */
    public final long mo703y(long j) {
        return this.f13653h.mo703y(j);
    }
}
