package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dt0 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2191h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f2192i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2193j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2194k;

    public /* synthetic */ dt0(int i, Object obj, Object obj2, boolean z) {
        this.f2191h = i;
        this.f2192i = z;
        this.f2193j = obj;
        this.f2194k = obj2;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        Object x92Var;
        int i = this.f2191h;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f2194k;
        Object obj3 = this.f2193j;
        boolean z = this.f2192i;
        switch (i) {
            case 0:
                AbstractC0255gw abstractC0255gw = (AbstractC0255gw) obj3;
                mn0 mn0Var = (mn0) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if (z != zBooleanValue) {
                    pp1 pp1Var = pp1.f8445a;
                    op1 op1VarM3931c = pp1.m3931c();
                    String strMo9d = abstractC0255gw.mo9d();
                    op1VarM3931c.getClass();
                    strMo9d.getClass();
                    op1VarM3931c.m3608e(strMo9d, String.valueOf(zBooleanValue));
                    ArrayList arrayList = st0.f10362a;
                    if (!abstractC0255gw.mo139e() && abstractC0255gw.mo5706f()) {
                        try {
                            if (zBooleanValue) {
                                x92Var = Boolean.valueOf(st0.m5000a(abstractC0255gw));
                            } else {
                                st0.m5002c(abstractC0255gw);
                                x92Var = a83Var;
                            }
                        } catch (Throwable th) {
                            x92Var = new x92(th);
                        }
                        Throwable thM6237a = y92.m6237a(x92Var);
                        if (thM6237a != null) {
                            pp1 pp1Var2 = pp1.f8445a;
                            pp1.m3936h(abstractC0255gw, zBooleanValue ? "install" : "uninstall", thM6237a, zBooleanValue ? "Hooker switch install failed" : "Hooker switch uninstall failed");
                        }
                    }
                    mn0Var.mo12g(abstractC0255gw, bool);
                }
                break;
            case 1:
                in0 in0Var = (in0) obj3;
                xk1 xk1Var = (xk1) obj2;
                Boolean bool2 = (Boolean) obj;
                if (bool2.booleanValue() && !z) {
                    xk1Var.setValue(Boolean.TRUE);
                } else {
                    in0Var.mo5j(bool2);
                }
                break;
            default:
                gu2 gu2Var = (gu2) obj3;
                gu2 gu2Var2 = (gu2) obj2;
                ca2 ca2Var = (ca2) obj;
                ca2Var.getClass();
                ca2Var.m719c(z ? 1.0f : 0.62f);
                ca2Var.m726k(((Number) gu2Var.getValue()).floatValue());
                ca2Var.m727l(((Number) gu2Var2.getValue()).floatValue());
                break;
        }
        return a83Var;
    }
}
