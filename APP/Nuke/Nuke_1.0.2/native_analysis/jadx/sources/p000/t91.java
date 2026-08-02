package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t91 {

    /* JADX INFO: renamed from: A */
    public final nx1 f10620A;

    /* JADX INFO: renamed from: B */
    public final nx1 f10621B;

    /* JADX INFO: renamed from: a */
    public iz2 f10622a;

    /* JADX INFO: renamed from: b */
    public final b62 f10623b;

    /* JADX INFO: renamed from: c */
    public final bt2 f10624c;

    /* JADX INFO: renamed from: d */
    public final sz0 f10625d;

    /* JADX INFO: renamed from: e */
    public t03 f10626e;

    /* JADX INFO: renamed from: f */
    public final nx1 f10627f;

    /* JADX INFO: renamed from: g */
    public final nx1 f10628g;

    /* JADX INFO: renamed from: h */
    public c61 f10629h;

    /* JADX INFO: renamed from: i */
    public final nx1 f10630i;

    /* JADX INFO: renamed from: j */
    public C0690sd f10631j;

    /* JADX INFO: renamed from: k */
    public final nx1 f10632k;

    /* JADX INFO: renamed from: l */
    public final nx1 f10633l;

    /* JADX INFO: renamed from: m */
    public final nx1 f10634m;

    /* JADX INFO: renamed from: n */
    public final nx1 f10635n;

    /* JADX INFO: renamed from: o */
    public final nx1 f10636o;

    /* JADX INFO: renamed from: p */
    public boolean f10637p;

    /* JADX INFO: renamed from: q */
    public final nx1 f10638q;

    /* JADX INFO: renamed from: r */
    public final C0043b5 f10639r;

    /* JADX INFO: renamed from: s */
    public final nx1 f10640s;

    /* JADX INFO: renamed from: t */
    public final nx1 f10641t;

    /* JADX INFO: renamed from: u */
    public in0 f10642u;

    /* JADX INFO: renamed from: v */
    public final n10 f10643v;

    /* JADX INFO: renamed from: w */
    public final n10 f10644w;

    /* JADX INFO: renamed from: x */
    public final n10 f10645x;

    /* JADX INFO: renamed from: y */
    public final C0611q9 f10646y;

    /* JADX INFO: renamed from: z */
    public long f10647z;

    public t91(iz2 iz2Var, b62 b62Var, bt2 bt2Var) {
        this.f10622a = iz2Var;
        this.f10623b = b62Var;
        this.f10624c = bt2Var;
        sz0 sz0Var = new sz0(16, false);
        C0690sd c0690sd = AbstractC0730td.f10680a;
        long j = f13.f2737b;
        k03 k03Var = new k03(c0690sd, j, (f13) null);
        sz0Var.f10436i = k03Var;
        sz0Var.f10437j = new sd0(c0690sd, k03Var.f5297b);
        this.f10625d = sz0Var;
        Boolean bool = Boolean.FALSE;
        this.f10627f = op0.m3598u(bool);
        this.f10628g = op0.m3598u(new za0(0.0f));
        this.f10630i = op0.m3598u(null);
        this.f10632k = op0.m3598u(tr0.f10906h);
        this.f10633l = op0.m3598u(bool);
        this.f10634m = op0.m3598u(bool);
        this.f10635n = op0.m3598u(bool);
        this.f10636o = op0.m3598u(bool);
        this.f10637p = true;
        this.f10638q = op0.m3598u(Boolean.TRUE);
        this.f10639r = new C0043b5(bt2Var);
        this.f10640s = op0.m3598u(bool);
        this.f10641t = op0.m3598u(bool);
        this.f10642u = new nx0(15);
        this.f10643v = new n10(this, 1);
        this.f10644w = new n10(this, 2);
        this.f10645x = new n10(this, 3);
        this.f10646y = pp0.m3911i();
        this.f10647z = C0363ju.f5217g;
        this.f10620A = op0.m3598u(new f13(j));
        this.f10621B = op0.m3598u(new f13(j));
    }

    /* JADX INFO: renamed from: a */
    public final tr0 m5143a() {
        return (tr0) this.f10632k.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5144b() {
        return ((Boolean) this.f10627f.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final c61 m5145c() {
        c61 c61Var = this.f10629h;
        if (c61Var == null || !c61Var.mo653w()) {
            return null;
        }
        return c61Var;
    }

    /* JADX INFO: renamed from: d */
    public final z03 m5146d() {
        return (z03) this.f10630i.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m5147e(long j) {
        this.f10621B.setValue(new f13(j));
    }

    /* JADX INFO: renamed from: f */
    public final void m5148f(long j) {
        this.f10620A.setValue(new f13(j));
    }
}
