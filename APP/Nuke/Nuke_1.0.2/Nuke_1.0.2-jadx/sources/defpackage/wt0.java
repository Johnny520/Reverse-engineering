package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wt0 implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ wt0(kl1 kl1Var, jl1 jl1Var) {
        this.h = 5;
        this.i = kl1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0334  */
    @Override // defpackage.nn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i;
        Object x92Var;
        Object x92Var2;
        String str;
        String name;
        String strName;
        String strM;
        String strValueOf;
        wm0 wm0VarN;
        ProtectionDomain protectionDomain;
        CodeSource codeSource;
        URL location;
        int i2 = this.h;
        rh1 rh1Var = rh1.a;
        eb ebVar = nx.a;
        int i3 = 16;
        Object x92Var3 = null;
        boolean z = true;
        a83 a83Var = a83.a;
        Object obj4 = this.i;
        switch (i2) {
            case 0:
                xt0 xt0Var = (xt0) obj4;
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var = (go0) pxVar;
                if (go0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    uh1 uh1VarB0 = gf1.b0(te.P(te.e, 0.0f, 420.0f, 1), gf1.P(go0Var));
                    Throwable th = xt0Var.g;
                    vj vjVar = xt0Var.a;
                    yt0 yt0Var = xt0Var.f;
                    String strP = yt0Var != null ? yt0Var.p() : null;
                    String strQ = yt0Var != null ? yt0Var.q() : null;
                    String strO = yt0Var != null ? yt0Var.o() : null;
                    gw gwVar = vjVar instanceof gw ? (gw) vjVar : null;
                    try {
                        String str2 = up0.m;
                        if (str2 == null) {
                            t11.S("hostProcess");
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
                        protectionDomain = vjVar.getClass().getProtectionDomain();
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
                        ClassLoader classLoader = vjVar.getClass().getClassLoader();
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
                    sb.append("Name: " + xt0Var.b);
                    sb.append('\n');
                    sb.append("ID: " + vjVar.d());
                    sb.append('\n');
                    int iOrdinal = xt0Var.d.ordinal();
                    if (iOrdinal == 0) {
                        str = hx0.NORMAL;
                    } else if (iOrdinal == 1) {
                        str = "UNAVAILABLE";
                    } else {
                        if (iOrdinal != 2) {
                            c80.s();
                            return null;
                        }
                        str = "LOCKED";
                    }
                    sb.append("Status: ".concat(str));
                    sb.append('\n');
                    sb.append("Reason: " + xt0Var.e);
                    sb.append('\n');
                    if (yt0Var == null || (name = yt0Var.k()) == null) {
                        name = vjVar.getClass().getName();
                    }
                    sb.append("Hooker class: ".concat(name));
                    sb.append('\n');
                    if (pv2.s0(str6)) {
                        str6 = "N/A";
                    }
                    sb.append("Class location: " + ((Object) str6));
                    sb.append('\n');
                    sb.append("Class loader: " + ((Object) (pv2.s0(str9) ? "N/A" : str9)));
                    sb.append('\n');
                    if (gwVar == null || (wm0VarN = gwVar.n()) == null || (strName = wm0VarN.name()) == null) {
                        strName = "N/A";
                    }
                    sb.append("UI location: ".concat(strName));
                    sb.append('\n');
                    sb.append("Is target process: " + vjVar.f());
                    sb.append('\n');
                    if (pv2.s0(str4)) {
                        str4 = "Unknown";
                    }
                    sb.append("Current process: " + ((Object) str4));
                    sb.append('\n');
                    sb.append("Default enabled: " + vjVar.a);
                    sb.append('\n');
                    sb.append("Requires restart: " + vjVar.e());
                    sb.append('\n');
                    sb.append("Available: " + vjVar.c);
                    sb.append('\n');
                    sb.append("Ignore security mode: " + vjVar.b());
                    sb.append('\n');
                    if (yt0Var == null || (strM = yt0Var.m()) == null) {
                        strM = "N/A";
                    }
                    sb.append("Phase: ".concat(strM));
                    sb.append('\n');
                    if (yt0Var == null || (strValueOf = String.valueOf(yt0Var.r())) == null) {
                        strValueOf = "N/A";
                    }
                    sb.append("Timestamp: ".concat(strValueOf));
                    sb.append('\n');
                    String str10 = xt0Var.c;
                    if (str10 != null) {
                        sb.append("\nDescription:\n");
                        sb.append(str10);
                        sb.append('\n');
                    }
                    sb.append("\nThrowable:\n");
                    if (strP == null) {
                        strP = th != null ? th.getClass().getName() : null;
                        if (strP == null) {
                            strP = "N/A";
                        }
                    }
                    sb.append(strP);
                    sb.append("\n\nMessage:\n");
                    if (strQ == null) {
                        strQ = th != null ? th.getMessage() : null;
                        if (strQ == null) {
                            strQ = "N/A";
                        }
                    }
                    sb.append(strQ);
                    sb.append("\n\nStack trace:\n");
                    if (strO == null) {
                        String strQ2 = th != null ? fg1.Q(th) : null;
                        strO = strQ2 == null ? "N/A" : strQ2;
                    }
                    eu.a(hk1.i(sb, strO, '\n'), uh1VarB0, new m13(((lp1) go0Var.j(ur1.a)).f, rg3.D(i), im0.j, 0L, 0, rg3.D(17), null, null, 16646136), 0, false, 0, 0, go0Var, 0, 1016);
                    break;
                } else {
                    go0Var.R();
                }
                return a83Var;
            case 1:
                kw kwVar = (kw) obj4;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((hm) obj).getClass();
                go0 go0Var2 = (go0) pxVar2;
                if (go0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    yi0 yi0Var = te.e;
                    av avVarA = yu.a(tp0.c, sn.u, go0Var2, 0);
                    int iHashCode = Long.hashCode(go0Var2.T);
                    yy1 yy1VarL = go0Var2.l();
                    uh1 uh1VarM = tl.M(go0Var2, yi0Var);
                    hx.c.getClass();
                    jy jyVar = gx.b;
                    go0Var2.Z();
                    if (go0Var2.S) {
                        go0Var2.k(jyVar);
                    } else {
                        go0Var2.i0();
                    }
                    yf3.c(go0Var2, gx.e, avVarA);
                    yf3.c(go0Var2, gx.d, yy1VarL);
                    yf3.c(go0Var2, gx.f, Integer.valueOf(iHashCode));
                    yf3.b(go0Var2, gx.g);
                    yf3.c(go0Var2, gx.c, uh1VarM);
                    kwVar.g(go0Var2, 0);
                    go0Var2.p(true);
                } else {
                    go0Var2.R();
                }
                return a83Var;
            case 2:
                ((v) obj4).j((Throwable) obj);
                return a83Var;
            case 3:
                w10 w10Var = (w10) obj4;
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue3 = w10Var.D.n(iIntValue3);
                }
                if (!zBooleanValue) {
                    iIntValue4 = w10Var.D.n(iIntValue4);
                }
                if (w10Var.B) {
                    long j = w10Var.y.b;
                    int i4 = f13.c;
                    if (iIntValue3 != ((int) (j >> 32)) || iIntValue4 != ((int) (j & 4294967295L))) {
                        int iMin = Math.min(iIntValue3, iIntValue4);
                        tr0 tr0Var = tr0.h;
                        if (iMin < 0 || Math.max(iIntValue3, iIntValue4) > w10Var.y.a.i.length()) {
                            b03 b03Var = w10Var.E;
                            b03Var.t(false);
                            b03Var.q(tr0Var);
                            z = false;
                        } else {
                            if (zBooleanValue || iIntValue3 == iIntValue4) {
                                b03 b03Var2 = w10Var.E;
                                b03Var2.t(false);
                                b03Var2.q(tr0Var);
                            } else {
                                w10Var.E.h(true);
                            }
                            w10Var.z.v.j(new k03(w10Var.y.a, fg1.i(iIntValue3, iIntValue4), (f13) null));
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                ((cd1) obj4).i.b(((o12) obj2).c, gd3.H);
                return a83Var;
            case 5:
                kl1 kl1Var = (kl1) obj4;
                kl1.h.set(kl1Var, null);
                kl1Var.f(null);
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                Activity activity = (Activity) obj4;
                xm0 xm0Var = (xm0) obj;
                px pxVar3 = (px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                xm0Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((go0) pxVar3).h(xm0Var) ? 4 : 2;
                }
                go0 go0Var3 = (go0) pxVar3;
                if (go0Var3.O(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    int i5 = 14 & iIntValue5;
                    boolean zH = go0Var3.h(activity) | (i5 == 4);
                    Object objL = go0Var3.L();
                    if (zH != 0 || objL == ebVar) {
                        objL = new d2(25, activity, xm0Var);
                        go0Var3.f0(objL);
                    }
                    fg1.f(xm0Var, (in0) objL, go0Var3, i5);
                } else {
                    go0Var3.R();
                }
                return a83Var;
            case 7:
                vy1 vy1Var = (vy1) obj4;
                px pxVar4 = (px) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var4 = (go0) pxVar4;
                if (go0Var4.O(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    qp0.e(rg3.Q(R.string.script_settings_authorization_request, new Object[]{vy1Var.b}, go0Var4), null, go0Var4, 0, 2);
                    rp0.O(go0Var4, te.O(rh1Var, 12.0f));
                    int i6 = 0;
                    for (Object obj6 : vy1Var.c) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            eu.a0();
                            throw null;
                        }
                        gq1 gq1Var = (gq1) obj6;
                        if (i6 > 0) {
                            go0Var4.W(878863508);
                            rp0.O(go0Var4, te.O(rh1Var, 10.0f));
                        } else {
                            go0Var4.W(1475004375);
                        }
                        go0Var4.p(false);
                        String str11 = gq1Var.b;
                        tu2 tu2Var = ur1.a;
                        v03.b(str11, null, ((lp1) go0Var4.j(tu2Var)).e, rg3.D(14), im0.l, 0L, rg3.D(20), 0, false, 0, 0, null, go0Var4, 1597440, 48, 260010);
                        String strP2 = gq1Var.c;
                        if (strP2 == null) {
                            go0Var4.W(878876485);
                            strP2 = rg3.P(R.string.script_settings_no_request_reason, go0Var4);
                        } else {
                            go0Var4.W(878875183);
                        }
                        go0Var4.p(false);
                        v03.b(strP2, null, ((lp1) go0Var4.j(tu2Var)).f, rg3.D(12), null, 0L, rg3.D(18), 0, false, 0, 0, null, go0Var4, 24576, 48, 260074);
                        i6 = i7;
                    }
                } else {
                    go0Var4.R();
                }
                return a83Var;
            case 8:
                Context context = (Context) obj4;
                px pxVar5 = (px) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var5 = (go0) pxVar5;
                if (go0Var5.O(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    eu.n(null, rg3.P(R.string.script_settings_scripts_section, go0Var5), xe1.i0(-922399296, new s9(i3, context), go0Var5), go0Var5, 384, 1);
                } else {
                    go0Var5.R();
                }
                return a83Var;
            case 9:
                ((do2) obj4).b();
                return a83Var;
            case 10:
                oz2 oz2Var = (oz2) obj4;
                ((Integer) obj3).getClass();
                go0 go0Var6 = (go0) ((px) obj2);
                go0Var6.W(-102778667);
                Object objL2 = go0Var6.L();
                Object obj7 = objL2;
                if (objL2 == ebVar) {
                    j20 j20VarC = eu.C(go0Var6);
                    go0Var6.f0(j20VarC);
                    obj7 = j20VarC;
                }
                j20 j20Var = (j20) obj7;
                Object objL3 = go0Var6.L();
                Object obj8 = objL3;
                if (objL3 == ebVar) {
                    nx1 nx1VarU = op0.u(null);
                    go0Var6.f0(nx1VarU);
                    obj8 = nx1VarU;
                }
                xk1 xk1Var = (xk1) obj8;
                xk1 xk1VarX = op0.x(oz2Var, go0Var6);
                boolean zF = go0Var6.f(null);
                Object objL4 = go0Var6.L();
                Object obj9 = objL4;
                if (zF || objL4 == ebVar) {
                    pr prVar = new pr(xk1Var, 23);
                    go0Var6.f0(prVar);
                    obj9 = prVar;
                }
                eu.c(null, (in0) obj9, go0Var6);
                boolean zH2 = go0Var6.h(j20Var) | go0Var6.f(null) | go0Var6.f(xk1VarX);
                Object objL5 = go0Var6.L();
                Object obj10 = objL5;
                if (zH2 || objL5 == ebVar) {
                    w13 w13Var = new w13(j20Var, xk1Var, xk1VarX);
                    go0Var6.f0(w13Var);
                    obj10 = w13Var;
                }
                uh1 uh1VarA = vw2.a(rh1Var, null, (PointerInputEventHandler) obj10);
                go0Var6.p(false);
                return uh1VarA;
            default:
                b03 b03Var3 = (b03) obj4;
                uh1 uh1Var = (uh1) obj;
                ((Integer) obj3).getClass();
                go0 go0Var7 = (go0) ((px) obj2);
                go0Var7.W(1980580247);
                e70 e70Var = (e70) go0Var7.j(ly.h);
                Object objL6 = go0Var7.L();
                Object obj11 = objL6;
                if (objL6 == ebVar) {
                    nx1 nx1VarU2 = op0.u(new h11(0L));
                    go0Var7.f0(nx1VarU2);
                    obj11 = nx1VarU2;
                }
                xk1 xk1Var2 = (xk1) obj11;
                boolean zH3 = go0Var7.h(b03Var3);
                Object objL7 = go0Var7.L();
                Object obj12 = objL7;
                if (zH3 || objL7 == ebVar) {
                    e03 e03Var = new e03(true ? 1 : 0, b03Var3, xk1Var2);
                    go0Var7.f0(e03Var);
                    obj12 = e03Var;
                }
                xm0 xm0Var2 = (xm0) obj12;
                boolean zF2 = go0Var7.f(e70Var);
                Object objL8 = go0Var7.L();
                Object obj13 = objL8;
                if (zF2 || objL8 == ebVar) {
                    f03 f03Var = new f03(e70Var, xk1Var2, false ? 1 : 0);
                    go0Var7.f0(f03Var);
                    obj13 = f03Var;
                }
                kd kdVar = in2.a;
                uh1 uh1VarS = tl.s(uh1Var, new x(xm0Var2, (in0) obj13, 11));
                go0Var7.p(false);
                return uh1VarS;
        }
    }

    public /* synthetic */ wt0(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }
}
