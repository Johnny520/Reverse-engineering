package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class y81 implements w31 {

    /* JADX INFO: renamed from: d */
    public final q91 f7569d;

    /* JADX INFO: renamed from: e */
    public final gp0 f7570e;

    /* JADX INFO: renamed from: f */
    public final gp0 f7571f;

    /* JADX INFO: renamed from: g */
    public final gp0 f7572g;

    /* JADX INFO: renamed from: h */
    public final gp0 f7573h;

    /* JADX INFO: renamed from: i */
    public final cp0 f7574i;

    /* JADX INFO: renamed from: j */
    public boolean f7575j;

    /* JADX INFO: renamed from: k */
    public final gp0 f7576k;

    /* JADX INFO: renamed from: l */
    public AbstractC0046b8 f7577l;

    /* JADX INFO: renamed from: m */
    public final ep0 f7578m;

    /* JADX INFO: renamed from: n */
    public boolean f7579n;

    /* JADX INFO: renamed from: o */
    public final o31 f7580o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ b91 f7581p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y81(b91 b91Var, Object obj, AbstractC0046b8 abstractC0046b8, q91 q91Var) {
        this.f7581p = b91Var;
        this.f7569d = q91Var;
        gp0 gp0VarM3419u = r60.m3419u(obj);
        this.f7570e = gp0VarM3419u;
        Object objInvoke = null;
        this.f7571f = r60.m3419u(s91.m4028O(0.0f, 0.0f, null, 7));
        this.f7572g = r60.m3419u(new n61(m5218b(), q91Var, obj, gp0VarM3419u.getValue(), abstractC0046b8));
        this.f7573h = r60.m3419u(Boolean.TRUE);
        this.f7574i = new cp0(-1.0f);
        this.f7576k = r60.m3419u(obj);
        this.f7577l = abstractC0046b8;
        this.f7578m = new ep0(m5217a().mo2025c());
        Float f = (Float) xc1.f7330a.get(q91Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            AbstractC0046b8 abstractC0046b82 = (AbstractC0046b8) q91Var.f5089a.invoke(obj);
            int iMo27b = abstractC0046b82.mo27b();
            for (int i = 0; i < iMo27b; i++) {
                abstractC0046b82.mo30e(fFloatValue, i);
            }
            objInvoke = this.f7569d.f5090b.invoke(abstractC0046b82);
        }
        this.f7580o = s91.m4028O(0.0f, 0.0f, objInvoke, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final n61 m5217a() {
        return (n61) this.f7572g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final InterfaceC0778tt m5218b() {
        return (InterfaceC0778tt) this.f7571f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5219c() {
        if (this.f7574i.m596g() == -1.0f) {
            this.f7579n = true;
            boolean zM3002l = p30.m3002l(m5217a().f4188c, m5217a().f4189d);
            gp0 gp0Var = this.f7576k;
            if (zM3002l) {
                gp0Var.setValue(m5217a().f4188c);
            } else {
                gp0Var.setValue(m5217a().mo2024b(0L));
                this.f7577l = m5217a().mo2028f(0L);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5220e(Object obj, boolean z) {
        b91 b91Var = this.f7581p;
        gp0 gp0Var = b91Var.f466h;
        gp0 gp0Var2 = this.f7570e;
        boolean zM3002l = p30.m3002l(null, gp0Var2.getValue());
        ep0 ep0Var = this.f7578m;
        gp0 gp0Var3 = this.f7572g;
        q91 q91Var = this.f7569d;
        if (zM3002l) {
            gp0Var3.setValue(new n61(this.f7580o, q91Var, obj, obj, this.f7577l.mo28c()));
            this.f7575j = true;
            ep0Var.m952h(m5217a().mo2025c());
            return;
        }
        InterfaceC0778tt interfaceC0778ttM5218b = (!z || this.f7579n || (m5218b() instanceof o31)) ? m5218b() : this.f7580o;
        long jMax = 0;
        gp0Var3.setValue(new n61(b91Var.m330e() <= 0 ? interfaceC0778ttM5218b : new s31(interfaceC0778ttM5218b, b91Var.m330e()), q91Var, obj, gp0Var2.getValue(), this.f7577l));
        ep0Var.m952h(m5217a().mo2025c());
        this.f7575j = false;
        gp0Var.setValue(Boolean.TRUE);
        if (b91Var.m332g()) {
            c31 c31Var = b91Var.f467i;
            int size = c31Var.size();
            for (int i = 0; i < size; i++) {
                y81 y81Var = (y81) c31Var.get(i);
                jMax = Math.max(jMax, y81Var.f7578m.m951g());
                y81Var.m5219c();
            }
            gp0Var.setValue(Boolean.FALSE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5221f(Object obj, Object obj2, InterfaceC0778tt interfaceC0778tt) {
        this.f7570e.setValue(obj2);
        this.f7571f.setValue(interfaceC0778tt);
        if (p30.m3002l(m5217a().f4189d, obj) && p30.m3002l(m5217a().f4188c, obj2)) {
            return;
        }
        m5220e(obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.w31
    public final Object getValue() {
        return this.f7576k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "current value: " + this.f7576k.getValue() + ", target: " + this.f7570e.getValue() + ", spec: " + m5218b();
    }
}
