package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fm2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public im2 f3059l;

    /* JADX INFO: renamed from: m */
    public b72 f3060m;

    /* JADX INFO: renamed from: n */
    public long f3061n;

    /* JADX INFO: renamed from: o */
    public int f3062o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f3063p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ im2 f3064q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ b72 f3065r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long f3066s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm2(im2 im2Var, b72 b72Var, long j, t00 t00Var) {
        super(2, t00Var);
        this.f3064q = im2Var;
        this.f3065r = b72Var;
        this.f3066s = j;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((fm2) mo13p((t00) obj2, (gm2) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        fm2 fm2Var = new fm2(this.f3064q, this.f3065r, this.f3066s, t00Var);
        fm2Var.f3063p = obj;
        return fm2Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws Throwable {
        im2 im2Var;
        b72 b72Var;
        im2 im2Var2;
        long j;
        int i = this.f3062o;
        qv1 qv1Var = qv1.f9206i;
        if (i == 0) {
            fg1.m1627T(obj);
            gm2 gm2Var = (gm2) this.f3063p;
            im2Var = this.f3064q;
            em2 em2Var = new em2(im2Var, gm2Var);
            n50 n50Var = im2Var.f4689c;
            b72Var = this.f3065r;
            long j2 = b72Var.f722h;
            qv1 qv1Var2 = im2Var.f4690d;
            long j3 = this.f3066s;
            float fM2367d = im2Var.m2367d(qv1Var2 == qv1Var ? da3.m985b(j3) : da3.m986c(j3));
            this.f3063p = im2Var;
            this.f3059l = im2Var;
            this.f3060m = b72Var;
            this.f3061n = j2;
            this.f3062o = 1;
            n50Var.getClass();
            obj = AbstractC0570p7.m3762R(n50Var.f7008b, new m50(fM2367d, n50Var, em2Var, null), this);
            k20 k20Var = k20.f5323h;
            if (obj == k20Var) {
                return k20Var;
            }
            im2Var2 = im2Var;
            j = j2;
        } else {
            if (i != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f3061n;
            b72Var = this.f3060m;
            im2Var = this.f3059l;
            im2Var2 = (im2) this.f3063p;
            fg1.m1627T(obj);
        }
        float fM2367d2 = im2Var2.m2367d(((Number) obj).floatValue());
        b72Var.f722h = im2Var.f4690d == qv1Var ? da3.m984a(j, fM2367d2, 0.0f, 2) : da3.m984a(j, 0.0f, fM2367d2, 1);
        return a83.f116a;
    }
}
