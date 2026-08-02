package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vz2 extends tw2 implements in0 {

    /* JADX INFO: renamed from: l */
    public int f12235l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ b03 f12236m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz2(b03 b03Var, t00 t00Var) {
        super(1, t00Var);
        this.f12236m = b03Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        return new vz2(this.f12236m, (t00) obj).mo7r(a83.f116a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r13 == r6) goto L28;
     */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) throws Throwable {
        Object objM3762R;
        int i = this.f12235l;
        a83 a83Var = a83.f116a;
        b03 b03Var = this.f12236m;
        k20 k20Var = k20.f5323h;
        if (i == 0) {
            fg1.m1627T(obj);
            this.f12235l = 1;
            if (b03Var.m355s(this) != k20Var) {
            }
            return k20Var;
        }
        if (i != 1) {
            if (i != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            b03Var.f479B = true;
            return a83Var;
        }
        fg1.m1627T(obj);
        ow1 ow1VarM337a = b03.m337a(b03Var);
        if (ow1VarM337a != null) {
            String str = (String) ow1VarM337a.f7862h;
            long j = ((f13) ow1VarM337a.f7863i).f2739a;
            p02 p02Var = b03Var.f489j;
            if (p02Var != null) {
                this.f12235l = 2;
                if (str.length() == 0 || f13.m1494c(j)) {
                    objM3762R = a83Var;
                } else {
                    objM3762R = AbstractC0570p7.m3762R(p02Var.f7907a, new C0379k9(p02Var, new C0188f2(j, null, p02Var, str), null, 7), this);
                }
                if (objM3762R != k20Var) {
                    objM3762R = a83Var;
                }
            }
        }
        b03Var.f479B = true;
        return a83Var;
    }
}
