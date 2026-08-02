package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nl2 implements bm2 {

    /* JADX INFO: renamed from: j */
    public static final dq1 f7215j = new dq1(10, new yc2(24), new ml2(0));

    /* JADX INFO: renamed from: a */
    public final kx1 f7216a;

    /* JADX INFO: renamed from: f */
    public float f7221f;

    /* JADX INFO: renamed from: h */
    public final n70 f7223h;

    /* JADX INFO: renamed from: i */
    public final n70 f7224i;

    /* JADX INFO: renamed from: b */
    public final kx1 f7217b = new kx1(0);

    /* JADX INFO: renamed from: c */
    public final kx1 f7218c = new kx1(0);

    /* JADX INFO: renamed from: d */
    public final bk1 f7219d = new bk1();

    /* JADX INFO: renamed from: e */
    public final kx1 f7220e = new kx1(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g */
    public final e60 f7222g = new e60(new C0792v(27, this));

    public nl2(int i) {
        this.f7216a = new kx1(i);
        final int i2 = 0;
        this.f7223h = op0.m3590m(new xm0(this) { // from class: ll2

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ nl2 f6189i;

            {
                this.f6189i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int i3 = i2;
                nl2 nl2Var = this.f6189i;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(nl2Var.f7216a.m2759g() < nl2Var.f7220e.m2759g());
                    default:
                        return Boolean.valueOf(nl2Var.f7216a.m2759g() > 0);
                }
            }
        });
        final int i3 = 1;
        this.f7224i = op0.m3590m(new xm0(this) { // from class: ll2

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ nl2 f6189i;

            {
                this.f6189i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int i32 = i3;
                nl2 nl2Var = this.f6189i;
                switch (i32) {
                    case 0:
                        return Boolean.valueOf(nl2Var.f7216a.m2759g() < nl2Var.f7220e.m2759g());
                    default:
                        return Boolean.valueOf(nl2Var.f7216a.m2759g() > 0);
                }
            }
        });
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: a */
    public final boolean mo567a() {
        return ((Boolean) this.f7224i.getValue()).booleanValue();
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: b */
    public final boolean mo568b() {
        return this.f7222g.mo568b();
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: c */
    public final boolean mo569c() {
        return ((Boolean) this.f7223h.getValue()).booleanValue();
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: d */
    public final Object mo570d(bl1 bl1Var, mn0 mn0Var, u00 u00Var) {
        Object objMo570d = this.f7222g.mo570d(bl1Var, mn0Var, u00Var);
        return objMo570d == k20.f5323h ? objMo570d : a83.f116a;
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: e */
    public final float mo571e(float f) {
        return this.f7222g.mo571e(f);
    }
}
