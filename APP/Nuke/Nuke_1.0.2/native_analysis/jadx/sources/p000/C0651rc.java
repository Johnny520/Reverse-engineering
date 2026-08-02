package p000;

import com.dokar.quickjs.QuickJs;

/* JADX INFO: renamed from: rc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0651rc extends tw2 implements in0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f9500l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f9501m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f9502n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0651rc(Object obj, Object obj2, t00 t00Var, int i) {
        super(1, t00Var);
        this.f9500l = i;
        this.f9501m = obj;
        this.f9502n = obj2;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f9500l;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f9502n;
        Object obj3 = this.f9501m;
        t00 t00Var = (t00) obj;
        switch (i) {
            case 0:
                new C0651rc((C0689sc) obj3, obj2, t00Var, 0).mo7r(a83Var);
                return a83Var;
            default:
                return new C0651rc((QuickJs) obj3, (byte[]) obj2, t00Var, 1).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        int i = this.f9500l;
        Object obj2 = this.f9502n;
        Object obj3 = this.f9501m;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                C0689sc c0689sc = (C0689sc) obj3;
                C0689sc.m4786b(c0689sc);
                Object objM4785a = C0689sc.m4785a(c0689sc, obj2);
                c0689sc.f10024c.f4561i.setValue(objM4785a);
                c0689sc.f10026e.setValue(objM4785a);
                return a83.f116a;
            default:
                fg1.m1627T(obj);
                QuickJs quickJs = (QuickJs) obj3;
                return quickJs.evaluateBytecode(quickJs.context, quickJs.globals, (byte[]) obj2);
        }
    }
}
