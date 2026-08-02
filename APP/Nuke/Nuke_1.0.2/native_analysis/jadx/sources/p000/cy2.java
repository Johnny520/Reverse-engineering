package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cy2 implements InterfaceC0162ed {

    /* JADX INFO: renamed from: a */
    public final x93 f1777a;

    /* JADX INFO: renamed from: b */
    public final n43 f1778b;

    /* JADX INFO: renamed from: c */
    public final Object f1779c;

    /* JADX INFO: renamed from: d */
    public final Object f1780d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0494nd f1781e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0494nd f1782f;

    /* JADX INFO: renamed from: g */
    public final AbstractC0494nd f1783g;

    /* JADX INFO: renamed from: h */
    public long f1784h;

    /* JADX INFO: renamed from: i */
    public AbstractC0494nd f1785i;

    public cy2(InterfaceC0273hd interfaceC0273hd, n43 n43Var, Object obj, Object obj2, AbstractC0494nd abstractC0494nd) {
        this.f1777a = interfaceC0273hd.mo512a(n43Var);
        this.f1778b = n43Var;
        this.f1779c = obj2;
        this.f1780d = obj;
        this.f1781e = (AbstractC0494nd) n43Var.f7004a.mo5j(obj);
        in0 in0Var = n43Var.f7004a;
        this.f1782f = (AbstractC0494nd) in0Var.mo5j(obj2);
        this.f1783g = abstractC0494nd != null ? t11.m5092r(abstractC0494nd) : ((AbstractC0494nd) in0Var.mo5j(obj)).mo2479c();
        this.f1784h = -1L;
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: a */
    public final boolean mo914a() {
        return this.f1777a.mo121a();
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: b */
    public final Object mo915b(long j) {
        if (m1335g(j)) {
            return this.f1779c;
        }
        AbstractC0494nd abstractC0494ndMo739s = this.f1777a.mo739s(j, this.f1781e, this.f1782f, this.f1783g);
        int iMo2478b = abstractC0494ndMo739s.mo2478b();
        for (int i = 0; i < iMo2478b; i++) {
            if (Float.isNaN(abstractC0494ndMo739s.mo2477a(i))) {
                l22.m2786b("AnimationVector cannot contain a NaN. " + abstractC0494ndMo739s + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f1778b.f7005b.mo5j(abstractC0494ndMo739s);
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: c */
    public final long mo916c() {
        if (this.f1784h < 0) {
            this.f1784h = this.f1777a.mo1171b(this.f1781e, this.f1782f, this.f1783g);
        }
        return this.f1784h;
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: d */
    public final n43 mo917d() {
        return this.f1778b;
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: e */
    public final Object mo918e() {
        return this.f1779c;
    }

    @Override // p000.InterfaceC0162ed
    /* JADX INFO: renamed from: f */
    public final AbstractC0494nd mo919f(long j) {
        if (!m1335g(j)) {
            return this.f1777a.mo737q(j, this.f1781e, this.f1782f, this.f1783g);
        }
        AbstractC0494nd abstractC0494nd = this.f1785i;
        if (abstractC0494nd != null) {
            return abstractC0494nd;
        }
        AbstractC0494nd abstractC0494ndMo2189t = this.f1777a.mo2189t(this.f1781e, this.f1782f, this.f1783g);
        this.f1785i = abstractC0494ndMo2189t;
        return abstractC0494ndMo2189t;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f1780d + " -> " + this.f1779c + ",initial velocity: " + this.f1783g + ", duration: " + (mo916c() / 1000000) + " ms,animationSpec: " + this.f1777a;
    }
}
