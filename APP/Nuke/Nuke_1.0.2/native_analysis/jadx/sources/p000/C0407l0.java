package p000;

import android.content.Context;
import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: l0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0407l0 implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5857h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xk1 f5858i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f5859j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5860k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f5861l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f5862m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ xk1 f5863n;

    public /* synthetic */ C0407l0(Object obj, Object obj2, Object obj3, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, int i) {
        this.f5857h = i;
        this.f5860k = obj;
        this.f5861l = obj2;
        this.f5862m = obj3;
        this.f5858i = xk1Var;
        this.f5859j = xk1Var2;
        this.f5863n = xk1Var3;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        String strM4462P;
        int i = this.f5857h;
        a83 a83Var = a83.f116a;
        C0160eb c0160eb = C0520nx.f7360a;
        Object obj4 = this.f5862m;
        Object obj5 = this.f5861l;
        Object obj6 = this.f5860k;
        int i2 = 1;
        switch (i) {
            case 0:
                List list = (List) obj6;
                String str = (String) obj5;
                in0 in0Var = (in0) obj4;
                kx1 kx1Var = (kx1) this.f5863n;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.m1961R();
                } else {
                    xk1 xk1Var = this.f5858i;
                    String str2 = (String) xk1Var.getValue();
                    Object objM1956L = go0Var.m1956L();
                    if (objM1956L == c0160eb) {
                        objM1956L = new C0260h0(xk1Var, 8);
                        go0Var.m1981f0(objM1956L);
                    }
                    String strM4462P2 = rg3.m4462P(R.string.ai_chat_model_list_search, go0Var);
                    xk1 xk1Var2 = this.f5859j;
                    tp0.m5357b(str2, (in0) objM1956L, null, strM4462P2, null, null, false, 0, 0, ((InterfaceC0482n1) xk1Var2.getValue()) instanceof C0408l1, false, null, null, null, go0Var, 48, 0, 15860);
                    rp0.m4529O(go0Var, AbstractC0731te.m5186O(rh1.f9587a, 10.0f));
                    InterfaceC0482n1 interfaceC0482n1 = (InterfaceC0482n1) xk1Var2.getValue();
                    if (t11.m5086l(interfaceC0482n1, C0445m1.f6429a)) {
                        go0Var.m1966W(-970546026);
                        AbstractC0691se.m4834e(p40.f7966b, go0Var, 6);
                        go0Var.m1994p(false);
                    } else if (interfaceC0482n1 instanceof C0371k1) {
                        go0Var.m1966W(-969987437);
                        AbstractC0691se.m4834e(xe1.m6126i0(1460439071, new C0866x(i2, (C0371k1) interfaceC0482n1, kx1Var), go0Var), go0Var, 6);
                        go0Var.m1994p(false);
                    } else if (!(interfaceC0482n1 instanceof C0408l1)) {
                        go0Var.m1966W(384333736);
                        go0Var.m1994p(false);
                        c80.m675s();
                    } else {
                        go0Var.m1966W(-969345520);
                        if (list.isEmpty()) {
                            go0Var.m1966W(-969328253);
                            AbstractC0691se.m4834e(p40.f7967c, go0Var, 6);
                            go0Var.m1994p(false);
                        } else {
                            go0Var.m1966W(-969056693);
                            uh1 uh1VarM5187P = AbstractC0731te.m5187P(AbstractC0731te.f10693e, 0.0f, 380.0f, 1);
                            boolean zM1984h = go0Var.m1984h(list) | go0Var.m1980f(str) | go0Var.m1980f(in0Var);
                            Object objM1956L2 = go0Var.m1956L();
                            if (zM1984h || objM1956L2 == c0160eb) {
                                objM1956L2 = new C0444m0(list, str, in0Var, 0);
                                go0Var.m1981f0(objM1956L2);
                            }
                            rg3.m4468d(6, 510, null, null, null, go0Var, null, (in0) objM1956L2, null, uh1VarM5187P, null, false);
                            go0Var.m1994p(false);
                        }
                        go0Var.m1994p(false);
                    }
                }
                break;
            case 1:
                vy1 vy1Var = (vy1) obj6;
                j20 j20Var = (j20) obj5;
                Context context = (Context) obj4;
                pb2 pb2Var = (pb2) obj;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((go0) interfaceC0596px2).m1980f(pb2Var) ? 4 : 2;
                }
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    go0Var2.m1961R();
                } else {
                    String strM4462P3 = rg3.m4462P(R.string.home_settings_cancel, go0Var2);
                    xk1 xk1Var3 = this.f5858i;
                    boolean z = !((Boolean) xk1Var3.getValue()).booleanValue();
                    uh1 uh1VarM3843a = pb2.m3843a(pb2Var);
                    Object objM1956L3 = go0Var2.m1956L();
                    xk1 xk1Var4 = this.f5859j;
                    if (objM1956L3 == c0160eb) {
                        objM1956L3 = new a02(xk1Var4, 2);
                        go0Var2.m1981f0(objM1956L3);
                    }
                    AbstractC0691se.m4847r(strM4462P3, (xm0) objM1956L3, uh1VarM3843a, z, 0, go0Var2, 48, 48);
                    if (vy1Var.f12227d) {
                        go0Var2.m1966W(-206257018);
                        strM4462P = rg3.m4462P(R.string.script_settings_authorize_and_enable, go0Var2);
                        go0Var2.m1994p(false);
                    } else {
                        go0Var2.m1966W(-206143279);
                        strM4462P = rg3.m4462P(R.string.script_settings_authorize, go0Var2);
                        go0Var2.m1994p(false);
                    }
                    String str3 = strM4462P;
                    boolean z2 = !((Boolean) xk1Var3.getValue()).booleanValue();
                    uh1 uh1VarM3843a2 = pb2.m3843a(pb2Var);
                    boolean zM1984h2 = go0Var2.m1984h(j20Var) | go0Var2.m1984h(vy1Var) | go0Var2.m1984h(context);
                    Object objM1956L4 = go0Var2.m1956L();
                    if (zM1984h2 || objM1956L4 == c0160eb) {
                        C0459mf c0459mf = new C0459mf(j20Var, xk1Var3, vy1Var, xk1Var4, this.f5863n, context, 3);
                        go0Var2.m1981f0(c0459mf);
                        objM1956L4 = c0459mf;
                    }
                    AbstractC0691se.m4846q(str3, (xm0) objM1956L4, uh1VarM3843a2, z2, 0, go0Var2, 0, 48);
                }
                break;
            default:
                j20 j20Var2 = (j20) obj6;
                cq1 cq1Var = (cq1) obj5;
                Context context2 = (Context) obj4;
                pb2 pb2Var2 = (pb2) obj;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                pb2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((go0) interfaceC0596px3).m1980f(pb2Var2) ? 4 : 2;
                }
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    go0Var3.m1961R();
                } else {
                    String strM4462P4 = rg3.m4462P(R.string.home_settings_cancel, go0Var3);
                    xk1 xk1Var5 = this.f5858i;
                    boolean z3 = !((Boolean) xk1Var5.getValue()).booleanValue();
                    uh1 uh1VarM3843a3 = pb2.m3843a(pb2Var2);
                    Object objM1956L5 = go0Var3.m1956L();
                    xk1 xk1Var6 = this.f5859j;
                    if (objM1956L5 == c0160eb) {
                        objM1956L5 = new a02(xk1Var6, 1);
                        go0Var3.m1981f0(objM1956L5);
                    }
                    AbstractC0691se.m4847r(strM4462P4, (xm0) objM1956L5, uh1VarM3843a3, z3, 0, go0Var3, 48, 48);
                    String strM4462P5 = rg3.m4462P(R.string.script_settings_revoke, go0Var3);
                    boolean z4 = !((Boolean) xk1Var5.getValue()).booleanValue();
                    uh1 uh1VarM3843a4 = pb2.m3843a(pb2Var2);
                    boolean zM1984h3 = go0Var3.m1984h(j20Var2) | go0Var3.m1984h(cq1Var) | go0Var3.m1984h(context2);
                    Object objM1956L6 = go0Var3.m1956L();
                    if (zM1984h3 || objM1956L6 == c0160eb) {
                        C0459mf c0459mf2 = new C0459mf(j20Var2, xk1Var5, cq1Var, xk1Var6, this.f5863n, context2, 2);
                        go0Var3.m1981f0(c0459mf2);
                        objM1956L6 = c0459mf2;
                    }
                    AbstractC0691se.m4846q(strM4462P5, (xm0) objM1956L6, uh1VarM3843a4, z4, 0, go0Var3, 0, 48);
                }
                break;
        }
        return a83Var;
    }
}
