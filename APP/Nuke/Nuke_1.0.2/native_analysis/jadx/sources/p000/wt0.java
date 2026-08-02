package p000;

import android.app.Activity;
import android.content.Context;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wt0 implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12636h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f12637i;

    public /* synthetic */ wt0(kl1 kl1Var, jl1 jl1Var) {
        this.f12636h = 5;
        this.f12637i = kl1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0334  */
    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        int i;
        Object x92Var;
        Object x92Var2;
        String str;
        String name;
        String strName;
        String strM6338m;
        String strValueOf;
        wm0 wm0VarMo143n;
        ProtectionDomain protectionDomain;
        CodeSource codeSource;
        URL location;
        int i2 = this.f12636h;
        rh1 rh1Var = rh1.f9587a;
        C0160eb c0160eb = C0520nx.f7360a;
        int i3 = 16;
        Object x92Var3 = null;
        boolean z = true;
        a83 a83Var = a83.f116a;
        Object obj4 = this.f12637i;
        switch (i2) {
            case 0:
                xt0 xt0Var = (xt0) obj4;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var = (go0) interfaceC0596px;
                if (go0Var.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    uh1 uh1VarM1882b0 = gf1.m1882b0(AbstractC0731te.m5187P(AbstractC0731te.f10693e, 0.0f, 420.0f, 1), gf1.m1868P(go0Var));
                    Throwable th = xt0Var.f13173g;
                    AbstractC0812vj abstractC0812vj = xt0Var.f13167a;
                    yt0 yt0Var = xt0Var.f13172f;
                    String strM6341p = yt0Var != null ? yt0Var.m6341p() : null;
                    String strM6342q = yt0Var != null ? yt0Var.m6342q() : null;
                    String strM6340o = yt0Var != null ? yt0Var.m6340o() : null;
                    AbstractC0255gw abstractC0255gw = abstractC0812vj instanceof AbstractC0255gw ? (AbstractC0255gw) abstractC0812vj : null;
                    try {
                        String str2 = up0.f11405m;
                        if (str2 == null) {
                            t11.m5067S("hostProcess");
                            throw null;
                        }
                        i = 12;
                        x92Var = str2;
                    } catch (Throwable th2) {
                        i = 12;
                        x92Var = new x92(th2);
                    }
                    boolean z2 = x92Var instanceof x92;
                    Object obj5 = x92Var;
                    if (z2) {
                        obj5 = null;
                    }
                    String str3 = (String) obj5;
                    String str4 = str3 == null ? "" : str3;
                    try {
                        protectionDomain = abstractC0812vj.getClass().getProtectionDomain();
                    } catch (Throwable th3) {
                        x92Var3 = new x92(th3);
                    }
                    Object string = (protectionDomain != null && (codeSource = protectionDomain.getCodeSource()) != null && (location = codeSource.getLocation()) != null) ? location.toString() : x92Var3;
                    if (string instanceof x92) {
                        string = null;
                    }
                    String str5 = (String) string;
                    String str6 = str5 == null ? "" : str5;
                    try {
                        ClassLoader classLoader = abstractC0812vj.getClass().getClassLoader();
                        x92Var2 = classLoader != null ? classLoader.toString() : null;
                    } catch (Throwable th4) {
                        x92Var2 = new x92(th4);
                    }
                    if (x92Var2 instanceof x92) {
                        x92Var2 = null;
                    }
                    String str7 = (String) x92Var2;
                    String str8 = str7 != null ? str7 : "";
                    StringBuilder sb = new StringBuilder();
                    String str9 = str8;
                    sb.append("Name: " + xt0Var.f13168b);
                    sb.append('\n');
                    sb.append("ID: " + abstractC0812vj.mo9d());
                    sb.append('\n');
                    int iOrdinal = xt0Var.f13170d.ordinal();
                    if (iOrdinal == 0) {
                        str = hx0.NORMAL;
                    } else if (iOrdinal == 1) {
                        str = "UNAVAILABLE";
                    } else {
                        if (iOrdinal != 2) {
                            c80.m675s();
                            return null;
                        }
                        str = "LOCKED";
                    }
                    sb.append("Status: ".concat(str));
                    sb.append('\n');
                    sb.append("Reason: " + xt0Var.f13171e);
                    sb.append('\n');
                    if (yt0Var == null || (name = yt0Var.m6336k()) == null) {
                        name = abstractC0812vj.getClass().getName();
                    }
                    sb.append("Hooker class: ".concat(name));
                    sb.append('\n');
                    if (pv2.m4006s0(str6)) {
                        str6 = "N/A";
                    }
                    sb.append("Class location: " + ((Object) str6));
                    sb.append('\n');
                    sb.append("Class loader: " + ((Object) (pv2.m4006s0(str9) ? "N/A" : str9)));
                    sb.append('\n');
                    if (abstractC0255gw == null || (wm0VarMo143n = abstractC0255gw.mo143n()) == null || (strName = wm0VarMo143n.name()) == null) {
                        strName = "N/A";
                    }
                    sb.append("UI location: ".concat(strName));
                    sb.append('\n');
                    sb.append("Is target process: " + abstractC0812vj.mo5706f());
                    sb.append('\n');
                    if (pv2.m4006s0(str4)) {
                        str4 = "Unknown";
                    }
                    sb.append("Current process: " + ((Object) str4));
                    sb.append('\n');
                    sb.append("Default enabled: " + abstractC0812vj.f11985a);
                    sb.append('\n');
                    sb.append("Requires restart: " + abstractC0812vj.mo139e());
                    sb.append('\n');
                    sb.append("Available: " + abstractC0812vj.f11987c);
                    sb.append('\n');
                    sb.append("Ignore security mode: " + abstractC0812vj.mo1778b());
                    sb.append('\n');
                    if (yt0Var == null || (strM6338m = yt0Var.m6338m()) == null) {
                        strM6338m = "N/A";
                    }
                    sb.append("Phase: ".concat(strM6338m));
                    sb.append('\n');
                    if (yt0Var == null || (strValueOf = String.valueOf(yt0Var.m6343r())) == null) {
                        strValueOf = "N/A";
                    }
                    sb.append("Timestamp: ".concat(strValueOf));
                    sb.append('\n');
                    String str10 = xt0Var.f13169c;
                    if (str10 != null) {
                        sb.append("\nDescription:\n");
                        sb.append(str10);
                        sb.append('\n');
                    }
                    sb.append("\nThrowable:\n");
                    if (strM6341p == null) {
                        strM6341p = th != null ? th.getClass().getName() : null;
                        if (strM6341p == null) {
                            strM6341p = "N/A";
                        }
                    }
                    sb.append(strM6341p);
                    sb.append("\n\nMessage:\n");
                    if (strM6342q == null) {
                        strM6342q = th != null ? th.getMessage() : null;
                        if (strM6342q == null) {
                            strM6342q = "N/A";
                        }
                    }
                    sb.append(strM6342q);
                    sb.append("\n\nStack trace:\n");
                    if (strM6340o == null) {
                        String strM1624Q = th != null ? fg1.m1624Q(th) : null;
                        strM6340o = strM1624Q == null ? "N/A" : strM1624Q;
                    }
                    AbstractC0179eu.m1446a(hk1.m2210i(sb, strM6340o, '\n'), uh1VarM1882b0, new m13(((lp1) go0Var.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(i), im0.f4680j, 0L, 0, rg3.m4450D(17), null, null, 16646136), 0, false, 0, 0, go0Var, 0, 1016);
                    break;
                } else {
                    go0Var.m1961R();
                }
                return a83Var;
            case 1:
                C0402kw c0402kw = (C0402kw) obj4;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C0282hm) obj).getClass();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    yi0 yi0Var = AbstractC0731te.f10693e;
                    C0032av c0032avM6346a = AbstractC0938yu.m6346a(tp0.f10876c, C0700sn.f10233u, go0Var2, 0);
                    int iHashCode = Long.hashCode(go0Var2.f3614T);
                    yy1 yy1VarM1990l = go0Var2.m1990l();
                    uh1 uh1VarM5285M = AbstractC0738tl.m5285M(go0Var2, yi0Var);
                    InterfaceC0293hx.f4166c.getClass();
                    C0367jy c0367jy = C0256gx.f3727b;
                    go0Var2.m1969Z();
                    if (go0Var2.f3613S) {
                        go0Var2.m1989k(c0367jy);
                    } else {
                        go0Var2.m1987i0();
                    }
                    yf3.m6268c(go0Var2, C0256gx.f3730e, c0032avM6346a);
                    yf3.m6268c(go0Var2, C0256gx.f3729d, yy1VarM1990l);
                    yf3.m6268c(go0Var2, C0256gx.f3731f, Integer.valueOf(iHashCode));
                    yf3.m6267b(go0Var2, C0256gx.f3732g);
                    yf3.m6268c(go0Var2, C0256gx.f3728c, uh1VarM5285M);
                    c0402kw.mo12g(go0Var2, 0);
                    go0Var2.m1994p(true);
                } else {
                    go0Var2.m1961R();
                }
                return a83Var;
            case 2:
                ((C0792v) obj4).mo5j((Throwable) obj);
                return a83Var;
            case 3:
                w10 w10Var = (w10) obj4;
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue3 = w10Var.f12263D.mo2449n(iIntValue3);
                }
                if (!zBooleanValue) {
                    iIntValue4 = w10Var.f12263D.mo2449n(iIntValue4);
                }
                if (w10Var.f12261B) {
                    long j = w10Var.f12268y.f5297b;
                    int i4 = f13.f2738c;
                    if (iIntValue3 != ((int) (j >> 32)) || iIntValue4 != ((int) (j & 4294967295L))) {
                        int iMin = Math.min(iIntValue3, iIntValue4);
                        tr0 tr0Var = tr0.f10906h;
                        if (iMin < 0 || Math.max(iIntValue3, iIntValue4) > w10Var.f12268y.f5296a.f10051i.length()) {
                            b03 b03Var = w10Var.f12264E;
                            b03Var.m356t(false);
                            b03Var.m353q(tr0Var);
                            z = false;
                        } else {
                            if (zBooleanValue || iIntValue3 == iIntValue4) {
                                b03 b03Var2 = w10Var.f12264E;
                                b03Var2.m356t(false);
                                b03Var2.m353q(tr0Var);
                            } else {
                                w10Var.f12264E.m344h(true);
                            }
                            w10Var.f12269z.f10643v.mo5j(new k03(w10Var.f12268y.f5296a, fg1.m1636i(iIntValue3, iIntValue4), (f13) null));
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                ((cd1) obj4).f1488i.mo2777b(((o12) obj2).f7422c, gd3.f3421H);
                return a83Var;
            case 5:
                kl1 kl1Var = (kl1) obj4;
                kl1.f5630h.set(kl1Var, null);
                kl1Var.m2722f(null);
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                Activity activity = (Activity) obj4;
                xm0 xm0Var = (xm0) obj;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                xm0Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((go0) interfaceC0596px3).m1984h(xm0Var) ? 4 : 2;
                }
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (go0Var3.m1958O(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    int i5 = 14 & iIntValue5;
                    boolean zM1984h = go0Var3.m1984h(activity) | (i5 == 4);
                    Object objM1956L = go0Var3.m1956L();
                    if (zM1984h != 0 || objM1956L == c0160eb) {
                        objM1956L = new C0115d2(25, activity, xm0Var);
                        go0Var3.m1981f0(objM1956L);
                    }
                    fg1.m1633f(xm0Var, (in0) objM1956L, go0Var3, i5);
                } else {
                    go0Var3.m1961R();
                }
                return a83Var;
            case 7:
                vy1 vy1Var = (vy1) obj4;
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var4 = (go0) interfaceC0596px4;
                if (go0Var4.m1958O(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    qp0.m4250e(rg3.m4463Q(R.string.script_settings_authorization_request, new Object[]{vy1Var.f12225b}, go0Var4), null, go0Var4, 0, 2);
                    rp0.m4529O(go0Var4, AbstractC0731te.m5186O(rh1Var, 12.0f));
                    int i6 = 0;
                    for (Object obj6 : vy1Var.f12226c) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            AbstractC0179eu.m1447a0();
                            throw null;
                        }
                        gq1 gq1Var = (gq1) obj6;
                        if (i6 > 0) {
                            go0Var4.m1966W(878863508);
                            rp0.m4529O(go0Var4, AbstractC0731te.m5186O(rh1Var, 10.0f));
                        } else {
                            go0Var4.m1966W(1475004375);
                        }
                        go0Var4.m1994p(false);
                        String str11 = gq1Var.f3659b;
                        tu2 tu2Var = ur1.f11452a;
                        v03.m5601b(str11, null, ((lp1) go0Var4.m1988j(tu2Var)).f6237e, rg3.m4450D(14), im0.f4682l, 0L, rg3.m4450D(20), 0, false, 0, 0, null, go0Var4, 1597440, 48, 260010);
                        String strM4462P = gq1Var.f3660c;
                        if (strM4462P == null) {
                            go0Var4.m1966W(878876485);
                            strM4462P = rg3.m4462P(R.string.script_settings_no_request_reason, go0Var4);
                        } else {
                            go0Var4.m1966W(878875183);
                        }
                        go0Var4.m1994p(false);
                        v03.m5601b(strM4462P, null, ((lp1) go0Var4.m1988j(tu2Var)).f6238f, rg3.m4450D(12), null, 0L, rg3.m4450D(18), 0, false, 0, 0, null, go0Var4, 24576, 48, 260074);
                        i6 = i7;
                    }
                } else {
                    go0Var4.m1961R();
                }
                return a83Var;
            case 8:
                Context context = (Context) obj4;
                InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var5 = (go0) interfaceC0596px5;
                if (go0Var5.m1958O(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC0179eu.m1464n(null, rg3.m4462P(R.string.script_settings_scripts_section, go0Var5), xe1.m6126i0(-922399296, new C0686s9(i3, context), go0Var5), go0Var5, 384, 1);
                } else {
                    go0Var5.m1961R();
                }
                return a83Var;
            case 9:
                ((do2) obj4).m1064b();
                return a83Var;
            case 10:
                oz2 oz2Var = (oz2) obj4;
                ((Integer) obj3).getClass();
                go0 go0Var6 = (go0) ((InterfaceC0596px) obj2);
                go0Var6.m1966W(-102778667);
                Object objM1956L2 = go0Var6.m1956L();
                Object obj7 = objM1956L2;
                if (objM1956L2 == c0160eb) {
                    j20 j20VarM1422C = AbstractC0179eu.m1422C(go0Var6);
                    go0Var6.m1981f0(j20VarM1422C);
                    obj7 = j20VarM1422C;
                }
                j20 j20Var = (j20) obj7;
                Object objM1956L3 = go0Var6.m1956L();
                Object obj8 = objM1956L3;
                if (objM1956L3 == c0160eb) {
                    nx1 nx1VarM3598u = op0.m3598u(null);
                    go0Var6.m1981f0(nx1VarM3598u);
                    obj8 = nx1VarM3598u;
                }
                xk1 xk1Var = (xk1) obj8;
                xk1 xk1VarM3601x = op0.m3601x(oz2Var, go0Var6);
                boolean zM1980f = go0Var6.m1980f(null);
                Object objM1956L4 = go0Var6.m1956L();
                Object obj9 = objM1956L4;
                if (zM1980f || objM1956L4 == c0160eb) {
                    C0590pr c0590pr = new C0590pr(xk1Var, 23);
                    go0Var6.m1981f0(c0590pr);
                    obj9 = c0590pr;
                }
                AbstractC0179eu.m1450c(null, (in0) obj9, go0Var6);
                boolean zM1984h2 = go0Var6.m1984h(j20Var) | go0Var6.m1980f(null) | go0Var6.m1980f(xk1VarM3601x);
                Object objM1956L5 = go0Var6.m1956L();
                Object obj10 = objM1956L5;
                if (zM1984h2 || objM1956L5 == c0160eb) {
                    w13 w13Var = new w13(j20Var, xk1Var, xk1VarM3601x);
                    go0Var6.m1981f0(w13Var);
                    obj10 = w13Var;
                }
                uh1 uh1VarM5804a = vw2.m5804a(rh1Var, null, (PointerInputEventHandler) obj10);
                go0Var6.m1994p(false);
                return uh1VarM5804a;
            default:
                b03 b03Var3 = (b03) obj4;
                uh1 uh1Var = (uh1) obj;
                ((Integer) obj3).getClass();
                go0 go0Var7 = (go0) ((InterfaceC0596px) obj2);
                go0Var7.m1966W(1980580247);
                e70 e70Var = (e70) go0Var7.m1988j(AbstractC0441ly.f6382h);
                Object objM1956L6 = go0Var7.m1956L();
                Object obj11 = objM1956L6;
                if (objM1956L6 == c0160eb) {
                    nx1 nx1VarM3598u2 = op0.m3598u(new h11(0L));
                    go0Var7.m1981f0(nx1VarM3598u2);
                    obj11 = nx1VarM3598u2;
                }
                xk1 xk1Var2 = (xk1) obj11;
                boolean zM1984h3 = go0Var7.m1984h(b03Var3);
                Object objM1956L7 = go0Var7.m1956L();
                Object obj12 = objM1956L7;
                if (zM1984h3 || objM1956L7 == c0160eb) {
                    e03 e03Var = new e03(true ? 1 : 0, b03Var3, xk1Var2);
                    go0Var7.m1981f0(e03Var);
                    obj12 = e03Var;
                }
                xm0 xm0Var2 = (xm0) obj12;
                boolean zM1980f2 = go0Var7.m1980f(e70Var);
                Object objM1956L8 = go0Var7.m1956L();
                Object obj13 = objM1956L8;
                if (zM1980f2 || objM1956L8 == c0160eb) {
                    f03 f03Var = new f03(e70Var, xk1Var2, false ? 1 : 0);
                    go0Var7.m1981f0(f03Var);
                    obj13 = f03Var;
                }
                C0383kd c0383kd = in2.f4704a;
                uh1 uh1VarM5320s = AbstractC0738tl.m5320s(uh1Var, new C0866x(xm0Var2, (in0) obj13, 11));
                go0Var7.m1994p(false);
                return uh1VarM5320s;
        }
    }

    public /* synthetic */ wt0(int i, Object obj) {
        this.f12636h = i;
        this.f12637i = obj;
    }
}
