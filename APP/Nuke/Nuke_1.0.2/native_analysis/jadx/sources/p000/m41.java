package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m41 extends w92 implements nn0 {

    /* JADX INFO: renamed from: j */
    public int f6469j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ z40 f6470k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0133dk f6471l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(C0133dk c0133dk, t00 t00Var) {
        super(3, t00Var);
        this.f6471l = c0133dk;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        m41 m41Var = new m41(this.f6471l, (t00) obj3);
        m41Var.f6470k = (z40) obj;
        return m41Var.mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        C0133dk c0133dk = this.f6471l;
        qb2 qb2Var = (qb2) c0133dk.f2082j;
        z40 z40Var = this.f6470k;
        int i = this.f6469j;
        if (i == 0) {
            fg1.m1627T(obj);
            byte bM4128p = qb2Var.m4128p();
            if (bM4128p == 1) {
                return c0133dk.m1041o(true);
            }
            if (bM4128p == 0) {
                return c0133dk.m1041o(false);
            }
            if (bM4128p != 6) {
                if (bM4128p == 8) {
                    return c0133dk.m1040n();
                }
                qb2.m4114m(qb2Var, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f6470k = null;
            this.f6469j = 1;
            obj = C0133dk.m1031c(c0133dk, z40Var, this);
            k20 k20Var = k20.f5323h;
            if (obj == k20Var) {
                return k20Var;
            }
        } else {
            if (i != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
        }
        return (j31) obj;
    }
}
