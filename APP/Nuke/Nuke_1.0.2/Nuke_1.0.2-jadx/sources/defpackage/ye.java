package defpackage;

import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ye implements mn0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ci0.<clinit>():void, eu.<clinit>():void, i0.j(java.lang.Object):java.lang.Object, mq.a(ak0, t00):java.lang.Object, p7.R(a20, mn0, t00):java.lang.Object, rg3.w(a20, a20, boolean):a20, sp0.<clinit>():void, tp0.<clinit>():void, up0.<clinit>():void, xe1.f0(y10, a20):a20] */
    public /* synthetic */ ye(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        cv cvVar;
        int i = this.h;
        rh1 rh1Var = rh1.a;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                se.h(pp0.N(1), (px) obj);
                return a83Var;
            case 1:
                ((Integer) obj).intValue();
                zq zqVar = (zq) obj2;
                zqVar.getClass();
                return zqVar.a;
            case 2:
                String str = (String) obj;
                y10 y10Var = (y10) obj2;
                str.getClass();
                y10Var.getClass();
                if (str.length() == 0) {
                    return y10Var.toString();
                }
                return str + ", " + y10Var;
            case 3:
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ci0.l(pp0.v(), null, 0L, go0Var, 0, 6);
                } else {
                    go0Var.R();
                }
                return a83Var;
            case 4:
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sp0.g(rg3.P(R.string.home_settings_update_checking, go0Var2), null, rg3.P(R.string.home_settings_update_checking_description, go0Var2), ci0.i, ci0.j, null, false, null, null, go0Var2, 27648, 482);
                } else {
                    go0Var2.R();
                }
                return a83Var;
            case 5:
                px pxVar3 = (px) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) pxVar3;
                if (go0Var3.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ci0.l(p7.u(), null, 0L, go0Var3, 0, 6);
                } else {
                    go0Var3.R();
                }
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                px pxVar4 = (px) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                go0 go0Var4 = (go0) pxVar4;
                if (go0Var4.O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ci0.l(s11.K(), null, 0L, go0Var4, 0, 6);
                } else {
                    go0Var4.R();
                }
                return a83Var;
            case 7:
                px pxVar5 = (px) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                go0 go0Var5 = (go0) pxVar5;
                if (go0Var5.O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ci0.l(rg3.y(), null, 0L, go0Var5, 0, 6);
                } else {
                    go0Var5.R();
                }
                return a83Var;
            case 8:
                px pxVar6 = (px) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                go0 go0Var6 = (go0) pxVar6;
                if (go0Var6.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    sx0 sx0VarB = ic3.a;
                    if (sx0VarB == null) {
                        rx0 rx0Var = new rx0("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = s93.a;
                        ft2 ft2Var = new ft2(ju.b);
                        ye0 ye0Var = new ye0(3);
                        ye0Var.k(1.0f, 21.0f);
                        ye0Var.h(22.0f);
                        ye0Var.i(12.0f, 2.0f);
                        ye0Var.i(1.0f, 21.0f);
                        ye0Var.c();
                        ye0Var.k(13.0f, 18.0f);
                        ye0Var.h(-2.0f);
                        ye0Var.o(-2.0f);
                        ye0Var.h(2.0f);
                        ye0Var.o(2.0f);
                        ye0Var.c();
                        ye0Var.k(13.0f, 14.0f);
                        ye0Var.h(-2.0f);
                        ye0Var.o(-4.0f);
                        ye0Var.h(2.0f);
                        ye0Var.o(4.0f);
                        ye0Var.c();
                        rx0.a(rx0Var, ye0Var.a, ft2Var);
                        sx0VarB = rx0Var.b();
                        ic3.a = sx0VarB;
                    }
                    ci0.l(sx0VarB, null, 0L, go0Var6, 0, 6);
                } else {
                    go0Var6.R();
                }
                return a83Var;
            case 9:
                px pxVar7 = (px) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                go0 go0Var7 = (go0) pxVar7;
                if (go0Var7.O(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ci0.l(pp0.v(), null, 0L, go0Var7, 0, 6);
                } else {
                    go0Var7.R();
                }
                return a83Var;
            case 10:
                px pxVar8 = (px) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                go0 go0Var8 = (go0) pxVar8;
                if (go0Var8.O(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ci0.l(rg3.y(), null, 0L, go0Var8, 0, 6);
                } else {
                    go0Var8.R();
                }
                return a83Var;
            case 11:
                px pxVar9 = (px) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                go0 go0Var9 = (go0) pxVar9;
                if (go0Var9.O(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ci0.l(s11.K(), null, 0L, go0Var9, 0, 6);
                } else {
                    go0Var9.R();
                }
                return a83Var;
            case 12:
                px pxVar10 = (px) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                go0 go0Var10 = (go0) pxVar10;
                if (go0Var10.O(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    sx0 sx0VarB2 = gf1.d;
                    if (sx0VarB2 == null) {
                        rx0 rx0Var2 = new rx0("Filled.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = s93.a;
                        ft2 ft2Var2 = new ft2(ju.b);
                        ye0 ye0Var2 = new ye0(3);
                        ye0Var2.k(11.0f, 15.0f);
                        ye0Var2.h(2.0f);
                        ye0Var2.o(2.0f);
                        ye0Var2.h(-2.0f);
                        ye0Var2.c();
                        ye0Var2.k(11.0f, 7.0f);
                        ye0Var2.h(2.0f);
                        ye0Var2.o(6.0f);
                        ye0Var2.h(-2.0f);
                        ye0Var2.c();
                        ye0Var2.k(11.99f, 2.0f);
                        ye0Var2.d(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        ye0Var2.m(4.47f, 10.0f, 9.99f, 10.0f);
                        ye0Var2.d(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                        ye0Var2.l(17.52f, 2.0f, 11.99f, 2.0f);
                        ye0Var2.c();
                        ye0Var2.k(12.0f, 20.0f);
                        ye0Var2.e(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                        ye0Var2.m(3.58f, -8.0f, 8.0f, -8.0f);
                        ye0Var2.m(8.0f, 3.58f, 8.0f, 8.0f);
                        ye0Var2.m(-3.58f, 8.0f, -8.0f, 8.0f);
                        ye0Var2.c();
                        rx0.a(rx0Var2, ye0Var2.a, ft2Var2);
                        sx0VarB2 = rx0Var2.b();
                        gf1.d = sx0VarB2;
                    }
                    ci0.l(sx0VarB2, null, 0L, go0Var10, 0, 6);
                } else {
                    go0Var10.R();
                }
                return a83Var;
            case 13:
                px pxVar11 = (px) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                go0 go0Var11 = (go0) pxVar11;
                if (go0Var11.O(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ci0.l(s11.K(), null, 0L, go0Var11, 0, 6);
                } else {
                    go0Var11.R();
                }
                return a83Var;
            case 14:
                px pxVar12 = (px) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                go0 go0Var12 = (go0) pxVar12;
                if (go0Var12.O(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    sp0.g(BuildConfig.VERSION_NAME, null, rg3.Q(R.string.home_settings_update_version_code, new Object[]{Integer.valueOf(BuildConfig.VERSION_CODE)}, go0Var12), ci0.f, null, null, false, null, null, go0Var12, 3078, 498);
                } else {
                    go0Var12.R();
                }
                return a83Var;
            case 15:
                px pxVar13 = (px) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                go0 go0Var13 = (go0) pxVar13;
                if (go0Var13.O(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ci0.l(s11.K(), null, 0L, go0Var13, 0, 6);
                } else {
                    go0Var13.R();
                }
                return a83Var;
            case 16:
                px pxVar14 = (px) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                go0 go0Var14 = (go0) pxVar14;
                if (go0Var14.O(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x32.a(te.g0(rh1Var, 22.0f), ((lp1) go0Var14.j(ur1.a)).g, 2.0f, 0L, 0, 0.0f, go0Var14, 390);
                } else {
                    go0Var14.R();
                }
                return a83Var;
            case 17:
                px pxVar15 = (px) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                go0 go0Var15 = (go0) pxVar15;
                if (go0Var15.O(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    fx0.a(se.H(), te.g0(rh1Var, 18.0f), ((lp1) go0Var15.j(ur1.a)).f, go0Var15, 432);
                } else {
                    go0Var15.R();
                }
                return a83Var;
            case 18:
                px pxVar16 = (px) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                go0 go0Var16 = (go0) pxVar16;
                if (go0Var16.O(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ci0.e(null, go0Var16, 0);
                } else {
                    go0Var16.R();
                }
                return a83Var;
            case 19:
                px pxVar17 = (px) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                go0 go0Var17 = (go0) pxVar17;
                if (go0Var17.O(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ci0.l(pp0.v(), null, 0L, go0Var17, 0, 6);
                } else {
                    go0Var17.R();
                }
                return a83Var;
            case AIChatConfig.MaxContextRounds /* 20 */:
                px pxVar18 = (px) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                go0 go0Var18 = (go0) pxVar18;
                if (go0Var18.O(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ci0.l(s11.K(), null, 0L, go0Var18, 0, 6);
                } else {
                    go0Var18.R();
                }
                return a83Var;
            case 21:
                px pxVar19 = (px) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                go0 go0Var19 = (go0) pxVar19;
                if (go0Var19.O(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    String strP = rg3.P(R.string.home_settings_hooker_debug_restart_host, go0Var19);
                    String strP2 = rg3.P(R.string.home_settings_hooker_debug_restart_host_description, go0Var19);
                    kw kwVar = tp0.g;
                    Object objL = go0Var19.L();
                    if (objL == nx.a) {
                        objL = new c0(28);
                        go0Var19.f0(objL);
                    }
                    sp0.g(strP, null, strP2, kwVar, null, null, false, (xm0) objL, null, go0Var19, 12585984, 370);
                } else {
                    go0Var19.R();
                }
                return a83Var;
            case 22:
                px pxVar20 = (px) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                go0 go0Var20 = (go0) pxVar20;
                if (go0Var20.O(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    rp0.H(0, go0Var20);
                } else {
                    go0Var20.R();
                }
                return a83Var;
            case 23:
                px pxVar21 = (px) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                go0 go0Var21 = (go0) pxVar21;
                if (go0Var21.O(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ur1.b(false, 0L, false, go0Var21, 3072);
                } else {
                    go0Var21.R();
                }
                return a83Var;
            case 24:
                a20 a20Var = (a20) obj;
                y10 y10Var2 = (y10) obj2;
                a20Var.getClass();
                y10Var2.getClass();
                a20 a20VarU = a20Var.u(y10Var2.getKey());
                zd0 zd0Var = zd0.h;
                if (a20VarU == zd0Var) {
                    return y10Var2;
                }
                gd3 gd3Var = gd3.p;
                c20 c20Var = (c20) a20VarU.o(gd3Var);
                if (c20Var == null) {
                    cvVar = new cv(y10Var2, a20VarU);
                } else {
                    a20 a20VarU2 = a20VarU.u(gd3Var);
                    if (a20VarU2 == zd0Var) {
                        return new cv(c20Var, y10Var2);
                    }
                    cvVar = new cv(c20Var, new cv(y10Var2, a20VarU2));
                }
                return cvVar;
            case 25:
                return ((a20) obj).k((y10) obj2);
            case 26:
                return ((a20) obj).k((y10) obj2);
            case 27:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 28:
                ((Integer) obj2).getClass();
                s11.g(pp0.N(1), (px) obj);
                return a83Var;
            default:
                ((Integer) obj).getClass();
                xt0 xt0Var = (xt0) obj2;
                xt0Var.getClass();
                return xt0Var.a.d();
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [s11.g(int, px):void, se.h(int, px):void] */
    public /* synthetic */ ye(int i, int i2) {
        this.h = i2;
    }
}
