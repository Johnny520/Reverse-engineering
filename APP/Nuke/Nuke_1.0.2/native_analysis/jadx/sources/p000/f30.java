package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f30 extends ij0 {

    /* JADX INFO: renamed from: e */
    public final AbstractC0147dz f2751e;

    /* JADX INFO: renamed from: f */
    public int f2752f;

    /* JADX INFO: renamed from: g */
    public int f2753g;

    public f30(oa0 oa0Var, kt2 kt2Var, s72 s72Var, AbstractC0147dz abstractC0147dz) {
        super(oa0Var, kt2Var, s72Var);
        if (abstractC0147dz == null) {
            um2.m5516f("constant == null");
            throw null;
        }
        this.f2751e = abstractC0147dz;
        this.f2752f = -1;
        this.f2753g = -1;
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: a */
    public final String mo57a() {
        return this.f2751e.mo23b();
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: c */
    public final String mo59c() {
        if (this.f2752f < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f2751e.mo24f());
        sb.append('@');
        int i = this.f2752f;
        if (i < 65536) {
            sb.append(pp0.m3898J(i));
        } else {
            sb.append(pp0.m3899K(i));
        }
        return sb.toString();
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: d */
    public final String mo60d() {
        AbstractC0147dz abstractC0147dz = this.f2751e;
        return abstractC0147dz instanceof q30 ? ((q30) abstractC0147dz).m4048g() : abstractC0147dz.mo23b();
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: i */
    public final a40 mo64i(oa0 oa0Var) {
        f30 f30Var = new f30(oa0Var, this.f47c, this.f48d, this.f2751e);
        int i = this.f2752f;
        if (i >= 0) {
            f30Var.m1503o(i);
        }
        int i2 = this.f2753g;
        if (i2 >= 0) {
            f30Var.m1502n(i2);
        }
        return f30Var;
    }

    @Override // p000.a40
    /* JADX INFO: renamed from: k */
    public final a40 mo66k(s72 s72Var) {
        f30 f30Var = new f30(this.f46b, this.f47c, s72Var, this.f2751e);
        int i = this.f2752f;
        if (i >= 0) {
            f30Var.m1503o(i);
        }
        int i2 = this.f2753g;
        if (i2 >= 0) {
            f30Var.m1502n(i2);
        }
        return f30Var;
    }

    /* JADX INFO: renamed from: m */
    public final int m1501m() {
        int i = this.f2752f;
        if (i >= 0) {
            return i;
        }
        C0676s.m4655n("index not yet set for ", this.f2751e);
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m1502n(int i) {
        if (i < 0) {
            C0676s.m4651j("index < 0");
        } else if (this.f2753g < 0) {
            this.f2753g = i;
        } else {
            C0676s.m4653l("class index already set");
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1503o(int i) {
        if (i < 0) {
            C0676s.m4651j("index < 0");
        } else if (this.f2752f < 0) {
            this.f2752f = i;
        } else {
            C0676s.m4653l("index already set");
        }
    }
}
