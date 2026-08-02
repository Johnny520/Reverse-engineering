package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w33 implements gu2 {

    /* JADX INFO: renamed from: h */
    public final n43 f12300h;

    /* JADX INFO: renamed from: i */
    public final nx1 f12301i;

    /* JADX INFO: renamed from: j */
    public final nx1 f12302j;

    /* JADX INFO: renamed from: k */
    public final nx1 f12303k;

    /* JADX INFO: renamed from: l */
    public final nx1 f12304l;

    /* JADX INFO: renamed from: m */
    public final jx1 f12305m;

    /* JADX INFO: renamed from: n */
    public boolean f12306n;

    /* JADX INFO: renamed from: o */
    public final nx1 f12307o;

    /* JADX INFO: renamed from: p */
    public AbstractC0494nd f12308p;

    /* JADX INFO: renamed from: q */
    public final lx1 f12309q;

    /* JADX INFO: renamed from: r */
    public boolean f12310r;

    /* JADX INFO: renamed from: s */
    public final qt2 f12311s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ y33 f12312t;

    public w33(y33 y33Var, Object obj, AbstractC0494nd abstractC0494nd, n43 n43Var) {
        this.f12312t = y33Var;
        this.f12300h = n43Var;
        nx1 nx1VarM3598u = op0.m3598u(obj);
        this.f12301i = nx1VarM3598u;
        Object objMo5j = null;
        this.f12302j = op0.m3598u(up0.m5528G(0.0f, 0.0f, null, 7));
        this.f12303k = op0.m3598u(new cy2(m5833b(), n43Var, obj, nx1VarM3598u.getValue(), abstractC0494nd));
        this.f12304l = op0.m3598u(Boolean.TRUE);
        this.f12305m = new jx1(-1.0f);
        this.f12307o = op0.m3598u(obj);
        this.f12308p = abstractC0494nd;
        this.f12309q = new lx1(m5832a().mo916c());
        Float f = (Float) vb3.f11894a.get(n43Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            AbstractC0494nd abstractC0494nd2 = (AbstractC0494nd) n43Var.f7004a.mo5j(obj);
            int iMo2478b = abstractC0494nd2.mo2478b();
            for (int i = 0; i < iMo2478b; i++) {
                abstractC0494nd2.mo2481e(fFloatValue, i);
            }
            objMo5j = this.f12300h.f7005b.mo5j(abstractC0494nd2);
        }
        this.f12311s = up0.m5528G(0.0f, 0.0f, objMo5j, 3);
    }

    /* JADX INFO: renamed from: a */
    public final cy2 m5832a() {
        return (cy2) this.f12303k.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final fj0 m5833b() {
        return (fj0) this.f12302j.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m5834c() {
        if (this.f12305m.m2591g() == -1.0f) {
            this.f12310r = true;
            boolean zM5086l = t11.m5086l(m5832a().f1779c, m5832a().f1780d);
            nx1 nx1Var = this.f12307o;
            if (zM5086l) {
                nx1Var.setValue(m5832a().f1779c);
            } else {
                nx1Var.setValue(m5832a().mo915b(0L));
                this.f12308p = m5832a().mo919f(0L);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5835e(Object obj, boolean z) {
        y33 y33Var = this.f12312t;
        nx1 nx1Var = y33Var.f13296h;
        nx1 nx1Var2 = this.f12301i;
        boolean zM5086l = t11.m5086l(null, nx1Var2.getValue());
        lx1 lx1Var = this.f12309q;
        nx1 nx1Var3 = this.f12303k;
        n43 n43Var = this.f12300h;
        if (zM5086l) {
            nx1Var3.setValue(new cy2(this.f12311s, n43Var, obj, obj, this.f12308p.mo2479c()));
            this.f12306n = true;
            lx1Var.m2985h(m5832a().mo916c());
            return;
        }
        fj0 fj0VarM5833b = (!z || this.f12310r || (m5833b() instanceof qt2)) ? m5833b() : this.f12311s;
        long jMax = 0;
        nx1Var3.setValue(new cy2(y33Var.m6215e() <= 0 ? fj0VarM5833b : new cu2(fj0VarM5833b, y33Var.m6215e()), n43Var, obj, nx1Var2.getValue(), this.f12308p));
        lx1Var.m2985h(m5832a().mo916c());
        this.f12306n = false;
        nx1Var.setValue(Boolean.TRUE);
        if (y33Var.m6217g()) {
            ps2 ps2Var = y33Var.f13297i;
            int size = ps2Var.size();
            for (int i = 0; i < size; i++) {
                w33 w33Var = (w33) ps2Var.get(i);
                jMax = Math.max(jMax, w33Var.f12309q.m2984g());
                w33Var.m5834c();
            }
            nx1Var.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5836f(Object obj, Object obj2, fj0 fj0Var) {
        this.f12301i.setValue(obj2);
        this.f12302j.setValue(fj0Var);
        if (t11.m5086l(m5832a().f1780d, obj) && t11.m5086l(m5832a().f1779c, obj2)) {
            return;
        }
        m5835e(obj, false);
    }

    @Override // p000.gu2
    public final Object getValue() {
        return this.f12307o.getValue();
    }

    public final String toString() {
        return "current value: " + this.f12307o.getValue() + ", target: " + this.f12301i.getValue() + ", spec: " + m5833b();
    }
}
