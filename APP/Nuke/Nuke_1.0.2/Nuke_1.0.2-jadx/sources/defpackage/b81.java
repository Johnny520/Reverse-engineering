package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b81 implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b81(mn0 mn0Var, n00 n00Var, nn0 nn0Var, xm0 xm0Var) {
        this.h = 4;
        this.j = mn0Var;
        this.k = n00Var;
        this.l = nn0Var;
        this.i = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        uh1 uh1VarC;
        Object objU;
        int i = this.h;
        eb ebVar = nx.a;
        a83 a83Var = a83.a;
        Object obj4 = this.i;
        Object obj5 = this.l;
        Object obj6 = this.k;
        Object obj7 = this.j;
        switch (i) {
            case 0:
                j81 j81Var = (j81) obj7;
                uh1 uh1Var = (uh1) obj6;
                w81 w81Var = (w81) obj5;
                xk1 xk1Var = (xk1) obj4;
                cc2 cc2Var = (cc2) obj;
                ((Integer) obj3).getClass();
                go0 go0Var = (go0) ((px) obj2);
                Object objL = go0Var.L();
                Object obj8 = objL;
                if (objL == ebVar) {
                    z71 z71Var = new z71(cc2Var, new f0(xk1Var, 27));
                    go0Var.f0(z71Var);
                    obj8 = z71Var;
                }
                z71 z71Var2 = (z71) obj8;
                Object objL2 = go0Var.L();
                Object obj9 = objL2;
                if (objL2 == ebVar) {
                    hw2 hw2Var = new hw2(new sz0(z71Var2));
                    go0Var.f0(hw2Var);
                    obj9 = hw2Var;
                }
                hw2 hw2Var2 = (hw2) obj9;
                if (j81Var != null) {
                    go0Var.W(1743490539);
                    go0Var.W(887527095);
                    Object obj10 = s22.a;
                    if (obj10 != null) {
                        go0Var.W(1345554384);
                    } else {
                        go0Var.W(1345603457);
                        View view = (View) go0Var.j(r7.f);
                        boolean zF = go0Var.f(view);
                        Object objL3 = go0Var.L();
                        if (zF || objL3 == ebVar) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            q22 saVar = tag instanceof q22 ? (q22) tag : null;
                            if (saVar == null) {
                                saVar = new sa(view);
                                view.setTag(R.id.compose_prefetch_scheduler, saVar);
                            }
                            objL3 = saVar;
                            go0Var.f0(objL3);
                        }
                        obj10 = (q22) objL3;
                    }
                    go0Var.p(false);
                    go0Var.p(false);
                    Object[] objArr = {j81Var, z71Var2, hw2Var2, obj10};
                    boolean zF2 = go0Var.f(j81Var) | go0Var.h(z71Var2) | go0Var.h(hw2Var2) | go0Var.h(obj10);
                    Object objL4 = go0Var.L();
                    if (zF2 || objL4 == ebVar) {
                        pc pcVar = new pc(j81Var, z71Var2, hw2Var2, obj10, 5);
                        go0Var.f0(pcVar);
                        objL4 = pcVar;
                    }
                    in0 in0Var = (in0) objL4;
                    boolean zF3 = false;
                    for (Object obj11 : Arrays.copyOf(objArr, 4)) {
                        zF3 |= go0Var.f(obj11);
                    }
                    Object objL5 = go0Var.L();
                    if (zF3 || objL5 == ebVar) {
                        go0Var.f0(new z90(in0Var));
                    }
                    go0Var.p(false);
                } else {
                    go0Var.W(1744076749);
                    go0Var.p(false);
                }
                int i2 = k81.a;
                if (j81Var != null && (uh1VarC = uh1Var.c(new e43(j81Var))) != null) {
                    uh1Var = uh1VarC;
                }
                boolean zF4 = go0Var.f(z71Var2) | go0Var.f(w81Var);
                Object objL6 = go0Var.L();
                Object obj12 = objL6;
                if (zF4 || objL6 == ebVar) {
                    af afVar = new af(14, z71Var2, w81Var);
                    go0Var.f0(afVar);
                    obj12 = afVar;
                }
                rp0.P(hw2Var2, uh1Var, (mn0) obj12, go0Var, 8);
                return a83Var;
            case 1:
                Context context = (Context) obj7;
                kx1 kx1Var = (kx1) obj6;
                xk1 xk1Var2 = (xk1) obj4;
                xk1 xk1Var3 = (xk1) obj5;
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var2 = (go0) pxVar;
                if (go0Var2.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ff ffVar = (ff) xk1Var2.getValue();
                    if (t11.l(ffVar, cf.a)) {
                        go0Var2.W(1634972818);
                        se.h(0, go0Var2);
                        go0Var2.p(false);
                    } else if (ffVar instanceof df) {
                        go0Var2.W(1634975687);
                        mt mtVar = ((df) ffVar).a;
                        boolean zH = go0Var2.h(context);
                        Object objL7 = go0Var2.L();
                        if (zH || objL7 == ebVar) {
                            objL7 = new d2(1, context, xk1Var3);
                            go0Var2.f0(objL7);
                        }
                        in0 in0Var2 = (in0) objL7;
                        boolean zF5 = go0Var2.f(kx1Var);
                        Object objL8 = go0Var2.L();
                        if (zF5 || objL8 == ebVar) {
                            objL8 = new q0(kx1Var, 1);
                            go0Var2.f0(objL8);
                        }
                        se.t(mtVar, in0Var2, (xm0) objL8, go0Var2, mt.$stable);
                        go0Var2.p(false);
                    } else {
                        if (!t11.l(ffVar, ef.a)) {
                            go0Var2.W(1634970845);
                            go0Var2.p(false);
                            c80.s();
                            return null;
                        }
                        go0Var2.W(1634989609);
                        boolean zF6 = go0Var2.f(kx1Var);
                        Object objL9 = go0Var2.L();
                        if (zF6 || objL9 == ebVar) {
                            objL9 = new q0(kx1Var, 2);
                            go0Var2.f0(objL9);
                        }
                        se.n((xm0) objL9, go0Var2, 0);
                        go0Var2.p(false);
                    }
                } else {
                    go0Var2.R();
                }
                return a83Var;
            case 2:
                pf pfVar = (pf) obj7;
                in0 in0Var3 = (in0) obj6;
                c73 c73Var = (c73) obj5;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj4;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var3 = (go0) pxVar2;
                if (go0Var3.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    eu.n(null, rg3.P(R.string.home_settings_theme, go0Var3), xe1.i0(1061929687, new v1((Enum) pfVar, in0Var3, c73Var, linkedHashMap, 1), go0Var3), go0Var3, 384, 1);
                } else {
                    go0Var3.R();
                }
                return a83Var;
            case 3:
                x51 x51Var = (x51) obj7;
                in0 in0Var4 = (in0) obj6;
                c73 c73Var2 = (c73) obj5;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj4;
                px pxVar3 = (px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var4 = (go0) pxVar3;
                if (go0Var4.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    eu.n(null, rg3.P(R.string.home_settings_language, go0Var4), xe1.i0(-410152320, new v1((Enum) x51Var, in0Var4, c73Var2, linkedHashMap2, 2), go0Var4), go0Var4, 384, 1);
                } else {
                    go0Var4.R();
                }
                return a83Var;
            case 4:
                mn0 mn0Var = (mn0) obj7;
                n00 n00Var = (n00) obj6;
                nn0 nn0Var = (nn0) obj5;
                xm0 xm0Var = (xm0) obj4;
                m00 m00Var = (m00) obj;
                px pxVar4 = (px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((go0) pxVar4).f(m00Var) ? 4 : 2;
                }
                go0 go0Var5 = (go0) pxVar4;
                if (go0Var5.O(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    String str = (String) mn0Var.g(go0Var5, 0);
                    if (pv2.s0(str)) {
                        nz0.c("Label must not be blank");
                    }
                    n00Var.getClass();
                    qp0.i.b(str, Boolean.TRUE, m00Var, nn0Var, xm0Var, go0Var5, Integer.valueOf((iIntValue4 << 9) & 7168));
                } else {
                    go0Var5.R();
                }
                return a83Var;
            case 5:
                List list = (List) obj7;
                View view2 = (View) obj6;
                rs2 rs2Var = (rs2) obj5;
                mn0 mn0Var2 = (mn0) obj4;
                px pxVar5 = (px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var6 = (go0) pxVar5;
                if (!go0Var6.O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    go0Var6.R();
                } else if (list.isEmpty()) {
                    go0Var6.W(1385941195);
                    ci0.g(null, rg3.P(R.string.home_settings_search_empty_title, go0Var6), rg3.P(R.string.home_settings_search_empty_message, go0Var6), go0Var6, 0, 1);
                    go0Var6.p(false);
                } else {
                    go0Var6.W(1386284303);
                    String strP = rg3.P(R.string.home_settings_search_results, go0Var6);
                    boolean zH2 = go0Var6.h(view2);
                    Object objL10 = go0Var6.L();
                    if (zH2 || objL10 == ebVar) {
                        objL10 = new kt0(view2, false ? 1 : 0);
                        go0Var6.f0(objL10);
                    }
                    ci0.j(list, (mn0) objL10, rs2Var, mn0Var2, strP, go0Var6, 0);
                    go0Var6.p(false);
                }
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                String str2 = (String) obj7;
                xm0 xm0Var2 = (xm0) obj6;
                String str3 = (String) obj5;
                xm0 xm0Var3 = (xm0) obj4;
                pb2 pb2Var = (pb2) obj;
                px pxVar6 = (px) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((go0) pxVar6).f(pb2Var) ? 4 : 2;
                }
                go0 go0Var7 = (go0) pxVar6;
                if (go0Var7.O(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    if (str2 != null) {
                        go0Var7.W(-1125892705);
                        se.r(str2, xm0Var2, pb2.a(pb2Var), false, 0, go0Var7, 0, 56);
                        go0Var7.p(false);
                    } else {
                        go0Var7.W(-1125685129);
                        go0Var7.p(false);
                    }
                    se.q(str3, xm0Var3, pb2.a(pb2Var), false, 0, go0Var7, 0, 56);
                } else {
                    go0Var7.R();
                }
                return a83Var;
            default:
                ft2 ft2Var = (ft2) obj7;
                t91 t91Var = (t91) obj6;
                k03 k03Var = (k03) obj5;
                long j = k03Var.b;
                us1 us1Var = (us1) obj4;
                uh1 uh1Var2 = (uh1) obj;
                ((Integer) obj3).getClass();
                go0 go0Var8 = (go0) ((px) obj2);
                go0Var8.W(-84507373);
                boolean zBooleanValue = ((Boolean) go0Var8.j(ly.x)).booleanValue();
                boolean zG = go0Var8.g(zBooleanValue);
                Object objL11 = go0Var8.L();
                Object obj13 = objL11;
                if (zG || objL11 == ebVar) {
                    v30 v30Var = new v30(zBooleanValue);
                    go0Var8.f0(v30Var);
                    obj13 = v30Var;
                }
                v30 v30Var2 = (v30) obj13;
                boolean z = ft2Var.a != 16;
                if (((Boolean) ((k91) ((td3) go0Var8.j(ly.u))).a.getValue()).booleanValue() && t91Var.b() && f13.c(j) && z) {
                    go0Var8.W(-707487962);
                    sd sdVar = k03Var.a;
                    f13 f13Var = new f13(j);
                    boolean zH3 = go0Var8.h(v30Var2);
                    Object objL12 = go0Var8.L();
                    Object obj14 = objL12;
                    if (zH3 || objL12 == ebVar) {
                        h50 h50Var = new h50((Object) v30Var2, (t00) (false ? 1 : 0), 10);
                        go0Var8.f0(h50Var);
                        obj14 = h50Var;
                    }
                    eu.g(sdVar, f13Var, (mn0) obj14, go0Var8);
                    boolean zH4 = go0Var8.h(v30Var2) | go0Var8.h(us1Var) | go0Var8.f(k03Var) | go0Var8.h(t91Var) | go0Var8.f(ft2Var);
                    Object objL13 = go0Var8.L();
                    if (zH4 || objL13 == ebVar) {
                        h9 h9Var = new h9(v30Var2, us1Var, k03Var, t91Var, ft2Var);
                        go0Var8.f0(h9Var);
                        objL13 = h9Var;
                    }
                    objU = qp0.u(uh1Var2, (in0) objL13);
                    go0Var8.p(false);
                } else {
                    go0Var8.W(-705473241);
                    go0Var8.p(false);
                    objU = rh1.a;
                }
                go0Var8.p(false);
                return objU;
        }
    }

    public /* synthetic */ b81(Context context, kx1 kx1Var, xk1 xk1Var, xk1 xk1Var2) {
        this.h = 1;
        this.j = context;
        this.k = kx1Var;
        this.i = xk1Var;
        this.l = xk1Var2;
    }

    public /* synthetic */ b81(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.i = obj4;
    }
}
