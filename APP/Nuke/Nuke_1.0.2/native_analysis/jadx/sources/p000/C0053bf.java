package p000;

/* JADX INFO: renamed from: bf */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0053bf extends tw2 implements in0 {

    /* JADX INFO: renamed from: l */
    public int f828l;

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        return new C0053bf(1, (t00) obj).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws Throwable {
        int i = this.f828l;
        t00 t00Var = null;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                fg1.m1627T(obj);
                return obj;
            }
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.m1627T(obj);
        ir0 ir0Var = C0807ve.f11913a;
        this.f828l = 1;
        c60 c60Var = o90.f7590a;
        Object objM3762R = AbstractC0570p7.m3762R(t50.f10560j, new C0688sb(2, t00Var, i2), this);
        k20 k20Var = k20.f5323h;
        return objM3762R == k20Var ? k20Var : objM3762R;
    }
}
