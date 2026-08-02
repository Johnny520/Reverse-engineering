package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 extends a40 {

    /* JADX INFO: renamed from: e */
    public wq2[] f10346e;

    public ss0(kt2 kt2Var, s72 s72Var) {
        super(pa0.f8145b, kt2Var, s72Var);
        if (s72Var.f5590i.length != 0) {
            this.f10346e = null;
        } else {
            C0676s.m4651j("registers.size() == 0");
            throw null;
        }
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: a */
    public final String mo57a() {
        return null;
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: b */
    public final int mo58b() {
        m4995m();
        int iMo58b = 0;
        for (wq2 wq2Var : this.f10346e) {
            iMo58b += wq2Var.mo58b();
        }
        return iMo58b;
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: g */
    public final String mo63g() {
        s72 s72Var = this.f48d;
        int length = s72Var.f5590i.length;
        StringBuilder sb = new StringBuilder(100);
        int iM4400d = 0;
        for (int i = 0; i < length; i++) {
            r72 r72Var = (r72) s72Var.m2693e(i);
            wq2 wq2VarM56h = a40.m56h(kt2.f5768a, r72.m4399e(iM4400d, r72Var.f9420i.mo22a()), r72Var);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(wq2VarM56h.mo63g());
            iM4400d += r72Var.m4400d();
        }
        return sb.toString();
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: i */
    public final a40 mo64i(oa0 oa0Var) {
        throw new RuntimeException("unsupported");
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: j */
    public final a40 mo65j(int i) {
        return mo66k(this.f48d.m4749k(i));
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: k */
    public final a40 mo66k(s72 s72Var) {
        return new ss0(this.f47c, s72Var);
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: l */
    public final void mo67l(C0929yn c0929yn) {
        m4995m();
        for (wq2 wq2Var : this.f10346e) {
            wq2Var.mo67l(c0929yn);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4995m() {
        if (this.f10346e != null) {
            return;
        }
        s72 s72Var = this.f48d;
        int length = s72Var.f5590i.length;
        this.f10346e = new wq2[length];
        int iM4400d = 0;
        for (int i = 0; i < length; i++) {
            r72 r72Var = (r72) s72Var.m2693e(i);
            this.f10346e[i] = a40.m56h(kt2.f5768a, r72.m4399e(iM4400d, r72Var.f9420i.mo22a()), r72Var);
            iM4400d += r72Var.m4400d();
        }
    }
}
