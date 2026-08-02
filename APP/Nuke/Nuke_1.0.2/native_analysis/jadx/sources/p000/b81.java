package p000;

import android.content.Context;
import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b81 implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f731h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f732i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f733j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f734k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f735l;

    public /* synthetic */ b81(mn0 mn0Var, n00 n00Var, nn0 nn0Var, xm0 xm0Var) {
        this.f731h = 4;
        this.f733j = mn0Var;
        this.f734k = n00Var;
        this.f735l = nn0Var;
        this.f732i = xm0Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        uh1 uh1VarMo4491c;
        Object objM4266u;
        int i = this.f731h;
        C0160eb c0160eb = C0520nx.f7360a;
        a83 a83Var = a83.f116a;
        Object obj4 = this.f732i;
        Object obj5 = this.f735l;
        Object obj6 = this.f734k;
        Object obj7 = this.f733j;
        switch (i) {
            case 0:
                j81 j81Var = (j81) obj7;
                uh1 uh1Var = (uh1) obj6;
                w81 w81Var = (w81) obj5;
                xk1 xk1Var = (xk1) obj4;
                cc2 cc2Var = (cc2) obj;
                ((Integer) obj3).getClass();
                go0 go0Var = (go0) ((InterfaceC0596px) obj2);
                Object objM1956L = go0Var.m1956L();
                Object obj8 = objM1956L;
                if (objM1956L == c0160eb) {
                    z71 z71Var = new z71(cc2Var, new C0186f0(xk1Var, 27));
                    go0Var.m1981f0(z71Var);
                    obj8 = z71Var;
                }
                z71 z71Var2 = (z71) obj8;
                Object objM1956L2 = go0Var.m1956L();
                Object obj9 = objM1956L2;
                if (objM1956L2 == c0160eb) {
                    hw2 hw2Var = new hw2(new sz0(z71Var2));
                    go0Var.m1981f0(hw2Var);
                    obj9 = hw2Var;
                }
                hw2 hw2Var2 = (hw2) obj9;
                if (j81Var != null) {
                    go0Var.m1966W(1743490539);
                    go0Var.m1966W(887527095);
                    Object obj10 = s22.f9880a;
                    if (obj10 != null) {
                        go0Var.m1966W(1345554384);
                    } else {
                        go0Var.m1966W(1345603457);
                        View view = (View) go0Var.m1988j(AbstractC0646r7.f9415f);
                        boolean zM1980f = go0Var.m1980f(view);
                        Object objM1956L3 = go0Var.m1956L();
                        if (zM1980f || objM1956L3 == c0160eb) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            q22 viewOnAttachStateChangeListenerC0687sa = tag instanceof q22 ? (q22) tag : null;
                            if (viewOnAttachStateChangeListenerC0687sa == null) {
                                viewOnAttachStateChangeListenerC0687sa = new ViewOnAttachStateChangeListenerC0687sa(view);
                                view.setTag(R.id.compose_prefetch_scheduler, viewOnAttachStateChangeListenerC0687sa);
                            }
                            objM1956L3 = viewOnAttachStateChangeListenerC0687sa;
                            go0Var.m1981f0(objM1956L3);
                        }
                        obj10 = (q22) objM1956L3;
                    }
                    go0Var.m1994p(false);
                    go0Var.m1994p(false);
                    Object[] objArr = {j81Var, z71Var2, hw2Var2, obj10};
                    boolean zM1980f2 = go0Var.m1980f(j81Var) | go0Var.m1984h(z71Var2) | go0Var.m1984h(hw2Var2) | go0Var.m1984h(obj10);
                    Object objM1956L4 = go0Var.m1956L();
                    if (zM1980f2 || objM1956L4 == c0160eb) {
                        C0575pc c0575pc = new C0575pc(j81Var, z71Var2, hw2Var2, obj10, 5);
                        go0Var.m1981f0(c0575pc);
                        objM1956L4 = c0575pc;
                    }
                    in0 in0Var = (in0) objM1956L4;
                    boolean zM1980f3 = false;
                    for (Object obj11 : Arrays.copyOf(objArr, 4)) {
                        zM1980f3 |= go0Var.m1980f(obj11);
                    }
                    Object objM1956L5 = go0Var.m1956L();
                    if (zM1980f3 || objM1956L5 == c0160eb) {
                        go0Var.m1981f0(new z90(in0Var));
                    }
                    go0Var.m1994p(false);
                } else {
                    go0Var.m1966W(1744076749);
                    go0Var.m1994p(false);
                }
                int i2 = k81.f5389a;
                if (j81Var != null && (uh1VarMo4491c = uh1Var.mo4491c(new e43(j81Var))) != null) {
                    uh1Var = uh1VarMo4491c;
                }
                boolean zM1980f4 = go0Var.m1980f(z71Var2) | go0Var.m1980f(w81Var);
                Object objM1956L6 = go0Var.m1956L();
                Object obj12 = objM1956L6;
                if (zM1980f4 || objM1956L6 == c0160eb) {
                    C0016af c0016af = new C0016af(14, z71Var2, w81Var);
                    go0Var.m1981f0(c0016af);
                    obj12 = c0016af;
                }
                rp0.m4530P(hw2Var2, uh1Var, (mn0) obj12, go0Var, 8);
                return a83Var;
            case 1:
                Context context = (Context) obj7;
                kx1 kx1Var = (kx1) obj6;
                xk1 xk1Var2 = (xk1) obj4;
                xk1 xk1Var3 = (xk1) obj5;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var2 = (go0) interfaceC0596px;
                if (go0Var2.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC0201ff interfaceC0201ff = (InterfaceC0201ff) xk1Var2.getValue();
                    if (t11.m5086l(interfaceC0201ff, C0089cf.f1497a)) {
                        go0Var2.m1966W(1634972818);
                        AbstractC0691se.m4837h(0, go0Var2);
                        go0Var2.m1994p(false);
                    } else if (interfaceC0201ff instanceof C0128df) {
                        go0Var2.m1966W(1634975687);
                        C0473mt c0473mt = ((C0128df) interfaceC0201ff).f2014a;
                        boolean zM1984h = go0Var2.m1984h(context);
                        Object objM1956L7 = go0Var2.m1956L();
                        if (zM1984h || objM1956L7 == c0160eb) {
                            objM1956L7 = new C0115d2(1, context, xk1Var3);
                            go0Var2.m1981f0(objM1956L7);
                        }
                        in0 in0Var2 = (in0) objM1956L7;
                        boolean zM1980f5 = go0Var2.m1980f(kx1Var);
                        Object objM1956L8 = go0Var2.m1956L();
                        if (zM1980f5 || objM1956L8 == c0160eb) {
                            objM1956L8 = new C0600q0(kx1Var, 1);
                            go0Var2.m1981f0(objM1956L8);
                        }
                        AbstractC0691se.m4849t(c0473mt, in0Var2, (xm0) objM1956L8, go0Var2, C0473mt.$stable);
                        go0Var2.m1994p(false);
                    } else {
                        if (!t11.m5086l(interfaceC0201ff, C0164ef.f2421a)) {
                            go0Var2.m1966W(1634970845);
                            go0Var2.m1994p(false);
                            c80.m675s();
                            return null;
                        }
                        go0Var2.m1966W(1634989609);
                        boolean zM1980f6 = go0Var2.m1980f(kx1Var);
                        Object objM1956L9 = go0Var2.m1956L();
                        if (zM1980f6 || objM1956L9 == c0160eb) {
                            objM1956L9 = new C0600q0(kx1Var, 2);
                            go0Var2.m1981f0(objM1956L9);
                        }
                        AbstractC0691se.m4843n((xm0) objM1956L9, go0Var2, 0);
                        go0Var2.m1994p(false);
                    }
                } else {
                    go0Var2.m1961R();
                }
                return a83Var;
            case 2:
                EnumC0578pf enumC0578pf = (EnumC0578pf) obj7;
                in0 in0Var3 = (in0) obj6;
                c73 c73Var = (c73) obj5;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj4;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var3 = (go0) interfaceC0596px2;
                if (go0Var3.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_theme, go0Var3), xe1.m6126i0(1061929687, new C0794v1((Enum) enumC0578pf, in0Var3, c73Var, linkedHashMap, 1), go0Var3), go0Var3, 384, 1);
                } else {
                    go0Var3.m1961R();
                }
                return a83Var;
            case 3:
                x51 x51Var = (x51) obj7;
                in0 in0Var4 = (in0) obj6;
                c73 c73Var2 = (c73) obj5;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj4;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var4 = (go0) interfaceC0596px3;
                if (go0Var4.m1958O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.home_settings_language, go0Var4), xe1.m6126i0(-410152320, new C0794v1((Enum) x51Var, in0Var4, c73Var2, linkedHashMap2, 2), go0Var4), go0Var4, 384, 1);
                } else {
                    go0Var4.m1961R();
                }
                return a83Var;
            case 4:
                mn0 mn0Var = (mn0) obj7;
                n00 n00Var = (n00) obj6;
                nn0 nn0Var = (nn0) obj5;
                xm0 xm0Var = (xm0) obj4;
                m00 m00Var = (m00) obj;
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((go0) interfaceC0596px4).m1980f(m00Var) ? 4 : 2;
                }
                go0 go0Var5 = (go0) interfaceC0596px4;
                if (go0Var5.m1958O(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    String str = (String) mn0Var.mo12g(go0Var5, 0);
                    if (pv2.m4006s0(str)) {
                        nz0.m3458c("Label must not be blank");
                    }
                    n00Var.getClass();
                    qp0.f9067i.mo2744b(str, Boolean.TRUE, m00Var, nn0Var, xm0Var, go0Var5, Integer.valueOf((iIntValue4 << 9) & 7168));
                } else {
                    go0Var5.m1961R();
                }
                return a83Var;
            case 5:
                List list = (List) obj7;
                View view2 = (View) obj6;
                rs2 rs2Var = (rs2) obj5;
                mn0 mn0Var2 = (mn0) obj4;
                InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var6 = (go0) interfaceC0596px5;
                if (!go0Var6.m1958O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    go0Var6.m1961R();
                } else if (list.isEmpty()) {
                    go0Var6.m1966W(1385941195);
                    ci0.m806g(null, rg3.m4462P(R.string.home_settings_search_empty_title, go0Var6), rg3.m4462P(R.string.home_settings_search_empty_message, go0Var6), go0Var6, 0, 1);
                    go0Var6.m1994p(false);
                } else {
                    go0Var6.m1966W(1386284303);
                    String strM4462P = rg3.m4462P(R.string.home_settings_search_results, go0Var6);
                    boolean zM1984h2 = go0Var6.m1984h(view2);
                    Object objM1956L10 = go0Var6.m1956L();
                    if (zM1984h2 || objM1956L10 == c0160eb) {
                        objM1956L10 = new kt0(view2, false ? 1 : 0);
                        go0Var6.m1981f0(objM1956L10);
                    }
                    ci0.m809j(list, (mn0) objM1956L10, rs2Var, mn0Var2, strM4462P, go0Var6, 0);
                    go0Var6.m1994p(false);
                }
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                String str2 = (String) obj7;
                xm0 xm0Var2 = (xm0) obj6;
                String str3 = (String) obj5;
                xm0 xm0Var3 = (xm0) obj4;
                pb2 pb2Var = (pb2) obj;
                InterfaceC0596px interfaceC0596px6 = (InterfaceC0596px) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((go0) interfaceC0596px6).m1980f(pb2Var) ? 4 : 2;
                }
                go0 go0Var7 = (go0) interfaceC0596px6;
                if (go0Var7.m1958O(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    if (str2 != null) {
                        go0Var7.m1966W(-1125892705);
                        AbstractC0691se.m4847r(str2, xm0Var2, pb2.m3843a(pb2Var), false, 0, go0Var7, 0, 56);
                        go0Var7.m1994p(false);
                    } else {
                        go0Var7.m1966W(-1125685129);
                        go0Var7.m1994p(false);
                    }
                    AbstractC0691se.m4846q(str3, xm0Var3, pb2.m3843a(pb2Var), false, 0, go0Var7, 0, 56);
                } else {
                    go0Var7.m1961R();
                }
                return a83Var;
            default:
                ft2 ft2Var = (ft2) obj7;
                t91 t91Var = (t91) obj6;
                k03 k03Var = (k03) obj5;
                long j = k03Var.f5297b;
                us1 us1Var = (us1) obj4;
                uh1 uh1Var2 = (uh1) obj;
                ((Integer) obj3).getClass();
                go0 go0Var8 = (go0) ((InterfaceC0596px) obj2);
                go0Var8.m1966W(-84507373);
                boolean zBooleanValue = ((Boolean) go0Var8.m1988j(AbstractC0441ly.f6398x)).booleanValue();
                boolean zM1982g = go0Var8.m1982g(zBooleanValue);
                Object objM1956L11 = go0Var8.m1956L();
                Object obj13 = objM1956L11;
                if (zM1982g || objM1956L11 == c0160eb) {
                    v30 v30Var = new v30(zBooleanValue);
                    go0Var8.m1981f0(v30Var);
                    obj13 = v30Var;
                }
                v30 v30Var2 = (v30) obj13;
                boolean z = ft2Var.f3140a != 16;
                if (((Boolean) ((k91) ((td3) go0Var8.m1988j(AbstractC0441ly.f6395u))).f5408a.getValue()).booleanValue() && t91Var.m5144b() && f13.m1494c(j) && z) {
                    go0Var8.m1966W(-707487962);
                    C0690sd c0690sd = k03Var.f5296a;
                    f13 f13Var = new f13(j);
                    boolean zM1984h3 = go0Var8.m1984h(v30Var2);
                    Object objM1956L12 = go0Var8.m1956L();
                    Object obj14 = objM1956L12;
                    if (zM1984h3 || objM1956L12 == c0160eb) {
                        h50 h50Var = new h50((Object) v30Var2, (t00) (false ? 1 : 0), 10);
                        go0Var8.m1981f0(h50Var);
                        obj14 = h50Var;
                    }
                    AbstractC0179eu.m1457g(c0690sd, f13Var, (mn0) obj14, go0Var8);
                    boolean zM1984h4 = go0Var8.m1984h(v30Var2) | go0Var8.m1984h(us1Var) | go0Var8.m1980f(k03Var) | go0Var8.m1984h(t91Var) | go0Var8.m1980f(ft2Var);
                    Object objM1956L13 = go0Var8.m1956L();
                    if (zM1984h4 || objM1956L13 == c0160eb) {
                        C0269h9 c0269h9 = new C0269h9(v30Var2, us1Var, k03Var, t91Var, ft2Var);
                        go0Var8.m1981f0(c0269h9);
                        objM1956L13 = c0269h9;
                    }
                    objM4266u = qp0.m4266u(uh1Var2, (in0) objM1956L13);
                    go0Var8.m1994p(false);
                } else {
                    go0Var8.m1966W(-705473241);
                    go0Var8.m1994p(false);
                    objM4266u = rh1.f9587a;
                }
                go0Var8.m1994p(false);
                return objM4266u;
        }
    }

    public /* synthetic */ b81(Context context, kx1 kx1Var, xk1 xk1Var, xk1 xk1Var2) {
        this.f731h = 1;
        this.f733j = context;
        this.f734k = kx1Var;
        this.f732i = xk1Var;
        this.f735l = xk1Var2;
    }

    public /* synthetic */ b81(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f731h = i;
        this.f733j = obj;
        this.f734k = obj2;
        this.f735l = obj3;
        this.f732i = obj4;
    }
}
