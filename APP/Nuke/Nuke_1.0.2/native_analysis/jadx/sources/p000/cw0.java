package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cw0 extends tw2 implements in0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f1752l;

    /* JADX INFO: renamed from: m */
    public int f1753m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1754n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f1755o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f1756p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f1757q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cw0(Object obj, Object obj2, Object obj3, Object obj4, t00 t00Var, int i) {
        super(1, t00Var);
        this.f1752l = i;
        this.f1754n = obj;
        this.f1755o = obj2;
        this.f1756p = obj3;
        this.f1757q = obj4;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f1752l;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f1757q;
        Object obj3 = this.f1756p;
        Object obj4 = this.f1755o;
        Object obj5 = this.f1754n;
        switch (i) {
            case 0:
                return new cw0((jw0) obj5, (k82) obj4, (tw0) obj3, (hg2) obj2, (t00) obj, 0).mo7r(a83Var);
            default:
                return new cw0((vn1) obj5, (ih2) obj4, (String) obj3, (ArrayList) obj2, (t00) obj, 1).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f1752l;
        Object obj2 = this.f1757q;
        Object obj3 = this.f1756p;
        Object obj4 = this.f1754n;
        k20 k20Var = k20.f5323h;
        Object obj5 = this.f1755o;
        switch (i) {
            case 0:
                int i2 = this.f1753m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    jw0 jw0Var = (jw0) obj4;
                    tw0 tw0Var = (tw0) obj3;
                    bw0 bw0Var = new bw0(jw0Var, tw0Var, (hg2) obj2, null);
                    this.f1753m = 1;
                    Object objM2582a = jw0.m2582a(jw0Var, (k82) obj5, tw0Var, bw0Var, this);
                    if (objM2582a == k20Var) {
                    }
                } else if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                }
                break;
            default:
                ih2 ih2Var = (ih2) obj5;
                int i3 = this.f1753m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    vn1 vn1Var = (vn1) obj4;
                    gh2 gh2Var = ((df2) vn1Var.f12033d).f2030h;
                    String str = ih2Var.f4620b;
                    th2 th2Var = ((u22) vn1Var.f12031b).f11075a;
                    hh2 hh2Var = new hh2(th2Var.f10774c, th2Var.f10775d, str);
                    Object obj6 = ih2Var.f4619a;
                    String str2 = (String) obj3;
                    rp0.m4532R(str2, "method");
                    this.f1753m = 1;
                    Object objMo1924a = gh2Var.mo1924a(hh2Var, obj6, str2, (ArrayList) obj2, this);
                    if (objMo1924a == k20Var) {
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
