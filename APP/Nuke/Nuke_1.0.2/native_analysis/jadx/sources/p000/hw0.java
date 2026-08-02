package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hw0 extends tw2 implements in0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f4151l;

    /* JADX INFO: renamed from: m */
    public int f4152m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f4153n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f4154o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f4155p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hw0(Object obj, Object obj2, Object obj3, t00 t00Var, int i) {
        super(1, t00Var);
        this.f4151l = i;
        this.f4153n = obj;
        this.f4154o = obj2;
        this.f4155p = obj3;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f4151l;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f4155p;
        Object obj3 = this.f4154o;
        Object obj4 = this.f4153n;
        switch (i) {
            case 0:
                return new hw0((jw0) obj4, (k82) obj3, (tw0) obj2, (t00) obj, 0).mo7r(a83Var);
            default:
                return new hw0((vn1) obj4, (ih2) obj3, (String) obj2, (t00) obj, 1).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f4151l;
        Object obj2 = this.f4155p;
        Object obj3 = this.f4153n;
        k20 k20Var = k20.f5323h;
        Object obj4 = this.f4154o;
        switch (i) {
            case 0:
                int i2 = this.f4152m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    jw0 jw0Var = (jw0) obj3;
                    tw0 tw0Var = (tw0) obj2;
                    gw0 gw0Var = new gw0(jw0Var, tw0Var, null);
                    this.f4152m = 1;
                    Object objM2582a = jw0.m2582a(jw0Var, (k82) obj4, tw0Var, gw0Var, this);
                    if (objM2582a == k20Var) {
                    }
                } else if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            default:
                ih2 ih2Var = (ih2) obj4;
                int i3 = this.f4152m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    vn1 vn1Var = (vn1) obj3;
                    gh2 gh2Var = ((df2) vn1Var.f12033d).f2030h;
                    String str = ih2Var.f4620b;
                    th2 th2Var = ((u22) vn1Var.f12031b).f11075a;
                    hh2 hh2Var = new hh2(th2Var.f10774c, th2Var.f10775d, str);
                    Object obj5 = ih2Var.f4619a;
                    String str2 = (String) obj2;
                    rp0.m4532R(str2, "property");
                    this.f4152m = 1;
                    Object objMo1925j = gh2Var.mo1925j(hh2Var, obj5, str2, this);
                    if (objMo1925j == k20Var) {
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
}
