package p000;

import java.util.List;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tt0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10958h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f10959i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f10960j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f10961k;

    public /* synthetic */ tt0(List list, String str, in0 in0Var, int i) {
        this.f10958h = 11;
        this.f10961k = list;
        this.f10959i = str;
        this.f10960j = in0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f10958h;
        C0160eb c0160eb = C0520nx.f7360a;
        int i2 = 2;
        a83 a83Var = a83.f116a;
        Object obj3 = this.f10960j;
        Object obj4 = this.f10959i;
        Object obj5 = this.f10961k;
        switch (i) {
            case 0:
                in0 in0Var = (in0) obj3;
                List list = (List) obj5;
                xk1 xk1Var = (xk1) obj4;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    yi0 yi0Var = AbstractC0731te.f10695g;
                    C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var, 0);
                    int iHashCode = Long.hashCode(go0Var.f3614T);
                    yy1 yy1VarM1990l = go0Var.m1990l();
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var, yi0Var);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy = C0256gx.f3727b;
                    go0Var.m1969Z();
                    if (go0Var.f3613S) {
                        go0Var.m1989k(c0367jy);
                    } else {
                        go0Var.m1987i0();
                    }
                    yf3.m6268c(go0Var, C0256gx.f3730e, c0032avM6346a);
                    yf3.m6268c(go0Var, C0256gx.f3729d, yy1VarM1990l);
                    yf3.m6268c(go0Var, C0256gx.f3731f, Integer.valueOf(iHashCode));
                    yf3.m6267b(go0Var, C0256gx.f3732g);
                    yf3.m6268c(go0Var, C0256gx.f3728c, uh1VarM5285M);
                    tp0.m5358c(rg3.m4462P(R.string.home_settings_hooker_debug_title, go0Var), null, null, in0Var, go0Var, 0, 30);
                    uh1 uh1VarMo4491c = AbstractC0731te.f10693e.mo4491c(new g71(1.0f, true));
                    jw1 jw1VarM1635h = fg1.m1635h();
                    C0884xf c0884xf = new C0884xf(12.0f, new C0676s(2));
                    boolean zM1984h = go0Var.m1984h(list);
                    Object objM1956L = go0Var.m1956L();
                    if (zM1984h || objM1956L == c0160eb) {
                        objM1956L = new C0543oh(list, xk1Var, i2);
                        go0Var.m1981f0(objM1956L);
                    }
                    rg3.m4468d(24960, 490, null, c0884xf, null, go0Var, null, (in0) objM1956L, null, uh1VarMo4491c, jw1VarM1635h, false);
                    go0Var.m1994p(true);
                }
                break;
            case 1:
                uh1 uh1Var = (uh1) obj3;
                xk1 xk1Var2 = (xk1) obj4;
                C0402kw c0402kw = (C0402kw) obj5;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.m1961R();
                } else {
                    Object objM1956L2 = go0Var2.m1956L();
                    if (objM1956L2 == c0160eb) {
                        objM1956L2 = new C0260h0(xk1Var2, 10);
                        go0Var2.m1981f0(objM1956L2);
                    }
                    uh1 uh1VarM5053E = t11.m5053E(uh1Var, (in0) objM1956L2);
                    nf1 nf1VarM1060d = AbstractC0135dm.m1060d(C0700sn.f10222j, true);
                    int iHashCode2 = Long.hashCode(go0Var2.f3614T);
                    yy1 yy1VarM1990l2 = go0Var2.m1990l();
                    uh1 uh1VarM5285M2 = AbstractC0738tl.m5285M(go0Var2, uh1VarM5053E);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy2 = C0256gx.f3727b;
                    go0Var2.m1969Z();
                    if (go0Var2.f3613S) {
                        go0Var2.m1989k(c0367jy2);
                    } else {
                        go0Var2.m1987i0();
                    }
                    yf3.m6268c(go0Var2, C0256gx.f3730e, nf1VarM1060d);
                    yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l2);
                    yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode2));
                    yf3.m6267b(go0Var2, C0256gx.f3732g);
                    yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M2);
                    c0402kw.mo12g(go0Var2, 0);
                    go0Var2.m1994p(true);
                }
                break;
            case 2:
                C0473mt c0473mt = (C0473mt) obj5;
                in0 in0Var2 = (in0) obj3;
                xm0 xm0Var = (xm0) obj4;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    go0Var3.m1961R();
                } else {
                    sp0.m4940g(c0473mt.m3206p(), null, rg3.m4463Q(R.string.home_settings_update_version_code, new Object[]{Integer.valueOf(c0473mt.m3205o())}, go0Var3), ci0.f1558n, null, null, false, null, null, go0Var3, 3072, 498);
                    if (c0473mt.m3203m()) {
                        go0Var3.m1966W(-2064419485);
                        ci0.m805f(0.0f, go0Var3, 0, 1);
                        sp0.m4940g(rg3.m4462P(R.string.home_settings_update_required, go0Var3), null, rg3.m4462P(R.string.home_settings_update_required_description, go0Var3), ci0.f1559o, null, null, false, null, null, go0Var3, 3072, 498);
                        go0Var3.m1994p(false);
                    } else {
                        go0Var3.m1966W(-2064107160);
                        go0Var3.m1994p(false);
                    }
                    if (pv2.m4006s0(c0473mt.m3208r())) {
                        go0Var3.m1966W(-2063777816);
                        go0Var3.m1994p(false);
                    } else {
                        go0Var3.m1966W(-2064050740);
                        ci0.m805f(0.0f, go0Var3, 0, 1);
                        sp0.m4940g(rg3.m4462P(R.string.home_settings_update_whats_new, go0Var3), null, pv2.m3993I0(c0473mt.m3208r()).toString(), ci0.f1560p, null, null, false, null, null, go0Var3, 3072, 498);
                        go0Var3.m1994p(false);
                    }
                    ci0.m805f(0.0f, go0Var3, 0, 1);
                    String strM4462P = rg3.m4462P(R.string.home_settings_update_download, go0Var3);
                    String strM4462P2 = rg3.m4462P(R.string.home_settings_update_download_description, go0Var3);
                    C0402kw c0402kw2 = ci0.f1561q;
                    boolean zM1980f = go0Var3.m1980f(in0Var2) | go0Var3.m1984h(c0473mt);
                    Object objM1956L3 = go0Var3.m1956L();
                    if (zM1980f || objM1956L3 == c0160eb) {
                        objM1956L3 = new C0640r1(3, in0Var2, c0473mt);
                        go0Var3.m1981f0(objM1956L3);
                    }
                    sp0.m4940g(strM4462P, null, strM4462P2, c0402kw2, null, null, false, (xm0) objM1956L3, null, go0Var3, 3072, 370);
                    ci0.m805f(0.0f, go0Var3, 0, 1);
                    sp0.m4940g(rg3.m4462P(R.string.home_settings_update_check_again, go0Var3), null, null, ci0.f1562r, null, null, false, xm0Var, null, go0Var3, 3072, 374);
                }
                break;
            case 3:
                xk1 xk1Var3 = (xk1) obj4;
                String str = (String) obj3;
                C0363ju c0363ju = (C0363ju) obj5;
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                go0 go0Var4 = (go0) interfaceC0596px4;
                if (!go0Var4.m1958O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    go0Var4.m1961R();
                } else {
                    String strM4462P3 = rg3.m4462P(R.string.home_settings_theme_color, go0Var4);
                    String strM4462P4 = rg3.m4462P(R.string.home_settings_theme_color_description, go0Var4);
                    boolean zM1980f2 = go0Var4.m1980f(xk1Var3);
                    Object objM1956L4 = go0Var4.m1956L();
                    if (zM1980f2 || objM1956L4 == c0160eb) {
                        objM1956L4 = new C0186f0(xk1Var3, 8);
                        go0Var4.m1981f0(objM1956L4);
                    }
                    qp0.m4253h(strM4462P3, (xm0) objM1956L4, null, strM4462P4, xe1.m6126i0(470001941, new C0686s9(1, c0363ju), go0Var4), str, null, false, null, go0Var4, 24576, 452);
                }
                break;
            case 4:
                lp1 lp1Var = (lp1) obj3;
                c73 c73Var = (c73) obj5;
                C0402kw c0402kw3 = (C0402kw) obj4;
                InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                go0 go0Var5 = (go0) interfaceC0596px5;
                if (!go0Var5.m1958O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    go0Var5.m1961R();
                } else {
                    ur1.m5571a(lp1Var, c73Var.f1223c, c0402kw3, go0Var5, 0);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                gf1.m1881b((uh1) obj3, (b03) obj5, (C0402kw) obj4, (InterfaceC0596px) obj, pp0.m3902N(385));
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((Integer) obj2).getClass();
                AbstractC0738tl.m5298a((sz0) obj3, (uh1) obj5, (String) obj4, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
            case 7:
                String str2 = (String) obj3;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                InterfaceC0596px interfaceC0596px6 = (InterfaceC0596px) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                go0 go0Var6 = (go0) interfaceC0596px6;
                if (!go0Var6.m1958O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    go0Var6.m1961R();
                } else {
                    sp0.m4940g(str2, null, str3, AbstractC0179eu.f2629c, xe1.m6126i0(1744893553, new C0481n0(str4, 9), go0Var6), null, false, null, null, go0Var6, 27648, 482);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                ci0.m813n((String) obj3, (List) obj5, (mn0) obj4, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                s11.m4700j((xt0) obj3, (xm0) obj5, (xm0) obj4, (InterfaceC0596px) obj, pp0.m3902N(49));
                break;
            case 10:
                z62 z62Var = (z62) obj3;
                im2 im2Var = (im2) obj5;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jM2371h = im2Var.m2371h(im2Var.m2367d(fFloatValue - z62Var.f13745h));
                im2 im2Var2 = ((gm2) obj4).f3582a;
                z62Var.f13745h += im2Var.m2367d(im2Var.m2370g(im2Var2.m2366c(im2Var2.f4697k, jM2371h, 1)));
                break;
            default:
                ((Integer) obj2).getClass();
                gf1.m1891i((List) obj5, (String) obj4, (in0) obj3, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ tt0(uh1 uh1Var, xk1 xk1Var, C0402kw c0402kw) {
        this.f10958h = 1;
        this.f10960j = uh1Var;
        this.f10959i = xk1Var;
        this.f10961k = c0402kw;
    }

    public /* synthetic */ tt0(xk1 xk1Var, String str, C0363ju c0363ju) {
        this.f10958h = 3;
        this.f10959i = xk1Var;
        this.f10960j = str;
        this.f10961k = c0363ju;
    }

    public /* synthetic */ tt0(Object obj, Object obj2, Object obj3, int i) {
        this.f10958h = i;
        this.f10960j = obj;
        this.f10961k = obj2;
        this.f10959i = obj3;
    }

    public /* synthetic */ tt0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f10958h = i2;
        this.f10960j = obj;
        this.f10961k = obj2;
        this.f10959i = obj3;
    }

    public /* synthetic */ tt0(C0473mt c0473mt, in0 in0Var, xm0 xm0Var) {
        this.f10958h = 2;
        this.f10961k = c0473mt;
        this.f10960j = in0Var;
        this.f10959i = xm0Var;
    }
}
