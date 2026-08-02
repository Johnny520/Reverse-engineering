package p000;

/* JADX INFO: renamed from: h2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0262h2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f3783l;

    /* JADX INFO: renamed from: m */
    public int f3784m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ bk1 f3785n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ z22 f3786o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0399kt f3787p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0262h2(bk1 bk1Var, z22 z22Var, C0399kt c0399kt, t00 t00Var, int i) {
        super(2, t00Var);
        this.f3783l = i;
        this.f3785n = bk1Var;
        this.f3786o = z22Var;
        this.f3787p = c0399kt;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f3783l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((C0262h2) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f3783l) {
            case 0:
                return new C0262h2(this.f3785n, this.f3786o, this.f3787p, t00Var, 0);
            default:
                return new C0262h2(this.f3785n, this.f3786o, this.f3787p, t00Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.m554a(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.m554a(r9, r10) == r6) goto L31;
     */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        int i = this.f3783l;
        a83 a83Var = a83.f116a;
        C0399kt c0399kt = this.f3787p;
        bk1 bk1Var = this.f3785n;
        k20 k20Var = k20.f5323h;
        z22 z22Var = this.f3786o;
        switch (i) {
            case 0:
                int i2 = this.f3784m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    long j = AbstractC0436lt.f6295a;
                    this.f3784m = 1;
                    if (AbstractC0179eu.m1425F(j, this) != k20Var) {
                    }
                } else if (i2 == 1) {
                    fg1.m1627T(obj);
                } else if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                    c0399kt.f5754K = z22Var;
                }
                this.f3784m = 2;
                break;
            default:
                int i3 = this.f3784m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    long j2 = AbstractC0436lt.f6295a;
                    this.f3784m = 1;
                    if (AbstractC0179eu.m1425F(j2, this) != k20Var) {
                    }
                } else if (i3 == 1) {
                    fg1.m1627T(obj);
                } else if (i3 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                    c0399kt.f5750G = z22Var;
                }
                this.f3784m = 2;
                break;
        }
        return a83Var;
    }
}
