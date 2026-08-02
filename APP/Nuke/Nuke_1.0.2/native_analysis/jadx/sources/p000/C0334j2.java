package p000;

/* JADX INFO: renamed from: j2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0334j2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f4881l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0399kt f4882m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0334j2(C0399kt c0399kt, t00 t00Var, int i) {
        super(2, t00Var);
        this.f4881l = i;
        this.f4882m = c0399kt;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f4881l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                ((C0334j2) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
            default:
                ((C0334j2) mo13p(t00Var, j20Var)).mo7r(a83Var);
                break;
        }
        return a83Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f4881l;
        C0399kt c0399kt = this.f4882m;
        switch (i) {
            case 0:
                return new C0334j2(c0399kt, t00Var, 0);
            default:
                return new C0334j2(c0399kt, t00Var, 1);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f4881l;
        a83 a83Var = a83.f116a;
        C0399kt c0399kt = this.f4882m;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                if (c0399kt.f5751H == null) {
                    xu0 xu0Var = new xu0();
                    bk1 bk1Var = c0399kt.f5761x;
                    if (bk1Var != null) {
                        AbstractC0570p7.m3745A(c0399kt.m5255A0(), null, new C0003a2(bk1Var, xu0Var, null, 1), 3);
                    }
                    c0399kt.f5751H = xu0Var;
                }
                break;
            default:
                fg1.m1627T(obj);
                xu0 xu0Var2 = c0399kt.f5751H;
                if (xu0Var2 != null) {
                    yu0 yu0Var = new yu0(xu0Var2);
                    bk1 bk1Var2 = c0399kt.f5761x;
                    if (bk1Var2 != null) {
                        AbstractC0570p7.m3745A(c0399kt.m5255A0(), null, new C0003a2(bk1Var2, yu0Var, null, 2), 3);
                    }
                    c0399kt.f5751H = null;
                }
                break;
        }
        return a83Var;
    }
}
