package p000;

/* JADX INFO: renamed from: jq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0359jq extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f5150l = 0;

    /* JADX INFO: renamed from: m */
    public int f5151m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object f5152n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C0470mq f5153o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ ak0 f5154p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0359jq(C0470mq c0470mq, ak0 ak0Var, Object obj, t00 t00Var) {
        super(2, t00Var);
        this.f5153o = c0470mq;
        this.f5154p = ak0Var;
        this.f5152n = obj;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f5150l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((C0359jq) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f5150l;
        ak0 ak0Var = this.f5154p;
        C0470mq c0470mq = this.f5153o;
        switch (i) {
            case 0:
                return new C0359jq(c0470mq, ak0Var, this.f5152n, t00Var);
            default:
                C0359jq c0359jq = new C0359jq(c0470mq, ak0Var, t00Var);
                c0359jq.f5152n = obj;
                return c0359jq;
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f5150l;
        a83 a83Var = a83.f116a;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                int i2 = this.f5151m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    nn0 nn0Var = this.f5153o.f6764l;
                    Object obj2 = this.f5152n;
                    this.f5151m = 1;
                    if (nn0Var.mo489e(this.f5154p, obj2, this) == k20Var) {
                    }
                } else if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            default:
                j20 j20Var = (j20) this.f5152n;
                int i3 = this.f5151m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    o72 o72Var = new o72();
                    C0470mq c0470mq = this.f5153o;
                    zj0 zj0Var = c0470mq.f6763k;
                    C0433lq c0433lq = new C0433lq(o72Var, j20Var, c0470mq, this.f5154p, 0);
                    this.f5152n = null;
                    this.f5151m = 1;
                    if (zj0Var.mo1660a(c0433lq, this) == k20Var) {
                    }
                } else if (i3 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
        }
        return k20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0359jq(C0470mq c0470mq, ak0 ak0Var, t00 t00Var) {
        super(2, t00Var);
        this.f5153o = c0470mq;
        this.f5154p = ak0Var;
    }
}
