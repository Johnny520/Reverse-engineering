package nuke.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.a83;
import defpackage.af;
import defpackage.at0;
import defpackage.c73;
import defpackage.ci0;
import defpackage.df3;
import defpackage.du;
import defpackage.dy;
import defpackage.eb;
import defpackage.ef3;
import defpackage.eu;
import defpackage.ew;
import defpackage.f0;
import defpackage.f42;
import defpackage.fd3;
import defpackage.fe0;
import defpackage.fg1;
import defpackage.gf1;
import defpackage.go0;
import defpackage.gw;
import defpackage.gx2;
import defpackage.h50;
import defpackage.hg3;
import defpackage.hh1;
import defpackage.in0;
import defpackage.ju;
import defpackage.kd0;
import defpackage.kk;
import defpackage.kw;
import defpackage.kx2;
import defpackage.ld0;
import defpackage.lg3;
import defpackage.lp1;
import defpackage.lx2;
import defpackage.md0;
import defpackage.mn0;
import defpackage.nd0;
import defpackage.np2;
import defpackage.nx;
import defpackage.od0;
import defpackage.op0;
import defpackage.op1;
import defpackage.p00;
import defpackage.p7;
import defpackage.pd0;
import defpackage.po0;
import defpackage.pp0;
import defpackage.pp1;
import defpackage.px;
import defpackage.qd0;
import defpackage.qj;
import defpackage.qp0;
import defpackage.r1;
import defpackage.r7;
import defpackage.rg3;
import defpackage.s1;
import defpackage.s9;
import defpackage.se;
import defpackage.sq1;
import defpackage.st0;
import defpackage.t00;
import defpackage.tp0;
import defpackage.ur1;
import defpackage.vj;
import defpackage.x92;
import defpackage.xe1;
import defpackage.xk1;
import defpackage.xm0;
import defpackage.y92;
import defpackage.z13;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class HomeActivity extends qj {
    public static final int $stable = qj.$stable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Context createLocalizedContext(c73 c73Var) {
        Locale localeLanguageLocale = languageLocale(c73Var);
        if (localeLanguageLocale == null) {
            return this;
        }
        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.setLocales(new LocaleList(localeLanguageLocale));
        configuration.setLocale(localeLanguageLocale);
        Context contextCreateConfigurationContext = createConfigurationContext(configuration);
        try {
            contextCreateConfigurationContext.getClass();
            lg3.a(contextCreateConfigurationContext);
        } catch (Throwable unused) {
        }
        contextCreateConfigurationContext.getClass();
        return contextCreateConfigurationContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void ensureHookersLoaded() {
        if (!(rg3.i.length == 0)) {
            if (!(rg3.j.length == 0)) {
                return;
            }
        }
        refreshHookers();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isSystemDarkTheme() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Locale languageLocale(c73 c73Var) {
        int i = c73Var.b;
        if (i == 1) {
            return Locale.SIMPLIFIED_CHINESE;
        }
        if (i == 2) {
            return Locale.TRADITIONAL_CHINESE;
        }
        if (i != 3) {
            return null;
        }
        return Locale.ENGLISH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0(HomeActivity homeActivity, px pxVar, int i) {
        boolean z = true;
        go0 go0Var = (go0) pxVar;
        if (go0Var.O(i & 1, (i & 3) != 2)) {
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (objL == ebVar) {
                objL = op0.u(homeActivity.readUIConfig());
                go0Var.f0(objL);
            }
            xk1 xk1Var = (xk1) objL;
            Object objL2 = go0Var.L();
            if (objL2 == ebVar) {
                pp1 pp1Var = pp1.a;
                objL2 = op0.u(Boolean.valueOf(pp1.f()));
                go0Var.f0(objL2);
            }
            xk1 xk1Var2 = (xk1) objL2;
            Object[] objArr = new Object[0];
            Object objL3 = go0Var.L();
            if (objL3 == ebVar) {
                objL3 = new dy(12);
                go0Var.f0(objL3);
            }
            xk1 xk1Var3 = (xk1) gf1.M(objArr, (xm0) objL3, go0Var, 48);
            Object objL4 = go0Var.L();
            if (objL4 == ebVar) {
                objL4 = op0.u(fe0.h);
                go0Var.f0(objL4);
            }
            xk1 xk1Var4 = (xk1) objL4;
            Object objL5 = go0Var.L();
            if (objL5 == ebVar) {
                gw[] gwVarArr = rg3.j;
                ArrayList arrayList = new ArrayList();
                for (gw gwVar : gwVarArr) {
                    if (gwVar instanceof gx2) {
                        arrayList.add(gwVar);
                    }
                }
                ArrayList arrayList2 = st0.a;
                ArrayList<gx2> arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    vj vjVar = (vj) obj;
                    vjVar.getClass();
                    if (vjVar.e() || !vjVar.f()) {
                        arrayList3.add(obj);
                    }
                }
                int iU = xe1.U(eu.B(arrayList3, 10));
                if (iU < 16) {
                    iU = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                for (gx2 gx2Var : arrayList3) {
                    linkedHashMap.put(gx2Var.d(), Boolean.valueOf(ci0.N(gx2Var)));
                }
                go0Var.f0(linkedHashMap);
                objL5 = linkedHashMap;
            }
            Map map = (Map) objL5;
            boolean zS = op0.s(go0Var);
            c73 c73VarOnCreate$lambda$0$1 = onCreate$lambda$0$1(xk1Var);
            c73VarOnCreate$lambda$0$1.getClass();
            int i2 = c73VarOnCreate$lambda$0$1.a;
            if (i2 == 1) {
                z = false;
            } else if (i2 != 2) {
                z = zS;
            }
            boolean zF = go0Var.f(onCreate$lambda$0$1(xk1Var).d) | go0Var.g(z);
            Object objL6 = go0Var.L();
            if (zF || objL6 == ebVar) {
                objL6 = p7.L(onCreate$lambda$0$1(xk1Var).d, z);
                go0Var.f0(objL6);
            }
            lp1 lp1Var = (lp1) objL6;
            boolean zD = go0Var.d(onCreate$lambda$0$1(xk1Var).b);
            Object objL7 = go0Var.L();
            if (zD || objL7 == ebVar) {
                objL7 = homeActivity.createLocalizedContext(onCreate$lambda$0$1(xk1Var));
                go0Var.f0(objL7);
            }
            Context context = (Context) objL7;
            boolean zF2 = go0Var.f(context);
            Object objL8 = go0Var.L();
            if (zF2 || objL8 == ebVar) {
                objL8 = new Configuration(context.getResources().getConfiguration());
                go0Var.f0(objL8);
            }
            Configuration configuration = (Configuration) objL8;
            boolean zH = go0Var.h(homeActivity) | go0Var.g(z);
            Object objL9 = go0Var.L();
            if (zH || objL9 == ebVar) {
                objL9 = new p00(homeActivity, z);
                go0Var.f0(objL9);
            }
            eu.r((xm0) objL9, go0Var);
            ci0.b(new f42[]{r7.b.a(context), r7.a.a(configuration)}, xe1.i0(1555950763, new at0(z, lp1Var, xk1Var, homeActivity, xk1Var3, map, xk1Var4, xk1Var2), go0Var), go0Var, 48);
        } else {
            go0Var.R();
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final c73 onCreate$lambda$0$1(xk1 xk1Var) {
        return (c73) xk1Var.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final Set<String> onCreate$lambda$0$10(xk1 xk1Var) {
        return (Set) xk1Var.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$16$0(HomeActivity homeActivity, boolean z) {
        homeActivity.updateSystemBarAppearance(z);
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17(boolean z, lp1 lp1Var, xk1 xk1Var, HomeActivity homeActivity, xk1 xk1Var2, Map map, xk1 xk1Var3, xk1 xk1Var4, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        if (go0Var.O(i & 1, (i & 3) != 2)) {
            z13.a(z, false, new ju(lp1Var.g), xe1.i0(547924073, new at0(lp1Var, xk1Var, homeActivity, xk1Var2, z, map, xk1Var3, xk1Var4), go0Var), go0Var, 3120);
        } else {
            go0Var.R();
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0(lp1 lp1Var, final xk1 xk1Var, final HomeActivity homeActivity, final xk1 xk1Var2, final boolean z, final Map map, final xk1 xk1Var3, final xk1 xk1Var4, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        if (go0Var.O(i & 1, (i & 3) != 2)) {
            ur1.a(lp1Var, onCreate$lambda$0$1(xk1Var).c, xe1.i0(-1245529180, new mn0() { // from class: ys0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeActivity.onCreate$lambda$0$17$0$0(this.h, xk1Var2, z, map, xk1Var3, xk1Var, xk1Var4, (px) obj, iIntValue);
                }
            }, go0Var), go0Var, 384);
        } else {
            go0Var.R();
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0(final HomeActivity homeActivity, xk1 xk1Var, boolean z, Map map, xk1 xk1Var2, final xk1 xk1Var3, final xk1 xk1Var4, px pxVar, int i) {
        final int i2 = 1;
        final int i3 = 0;
        go0 go0Var = (go0) pxVar;
        if (go0Var.O(i & 1, (i & 3) != 2)) {
            boolean zH = go0Var.h(homeActivity) | go0Var.f(xk1Var);
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (zH || objL == ebVar) {
                objL = new s1((Object) homeActivity, xk1Var2, xk1Var, 10);
                go0Var.f0(objL);
            }
            pp0.c(false, (xm0) objL, go0Var, 0, 1);
            c73 c73VarOnCreate$lambda$0$1 = onCreate$lambda$0$1(xk1Var3);
            boolean zOnCreate$lambda$0$4 = onCreate$lambda$0$4(xk1Var4);
            boolean zH2 = go0Var.h(homeActivity);
            Object objL2 = go0Var.L();
            if (zH2 || objL2 == ebVar) {
                objL2 = new in0(homeActivity) { // from class: zs0
                    public final /* synthetic */ HomeActivity i;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.i = homeActivity;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.in0
                    public final Object j(Object obj) {
                        switch (i3) {
                            case 0:
                                return HomeActivity.onCreate$lambda$0$17$0$0$1$0(this.i, xk1Var4, ((Boolean) obj).booleanValue());
                            default:
                                return HomeActivity.onCreate$lambda$0$17$0$0$3$0(this.i, xk1Var4, (c73) obj);
                        }
                    }
                };
                go0Var.f0(objL2);
            }
            in0 in0Var = (in0) objL2;
            boolean zH3 = go0Var.h(map);
            Object objL3 = go0Var.L();
            if (zH3 || objL3 == ebVar) {
                objL3 = new af(7, map, xk1Var2);
                go0Var.f0(objL3);
            }
            mn0 mn0Var = (mn0) objL3;
            boolean zH4 = go0Var.h(homeActivity);
            Object objL4 = go0Var.L();
            if (zH4 || objL4 == ebVar) {
                objL4 = new in0(homeActivity) { // from class: zs0
                    public final /* synthetic */ HomeActivity i;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.i = homeActivity;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.in0
                    public final Object j(Object obj) {
                        switch (i2) {
                            case 0:
                                return HomeActivity.onCreate$lambda$0$17$0$0$1$0(this.i, xk1Var3, ((Boolean) obj).booleanValue());
                            default:
                                return HomeActivity.onCreate$lambda$0$17$0$0$3$0(this.i, xk1Var3, (c73) obj);
                        }
                    }
                };
                go0Var.f0(objL4);
            }
            tp0.a(null, null, c73VarOnCreate$lambda$0$1, z, zOnCreate$lambda$0$4, in0Var, mn0Var, (in0) objL4, go0Var, AIChatConfig.DefaultMaxTokens);
            if (onCreate$lambda$0$7(xk1Var)) {
                go0Var.W(-1335578556);
                String strP = rg3.P(R.string.home_restart_wechat_title, go0Var);
                String strP2 = rg3.P(R.string.home_restart_wechat_message, go0Var);
                String strP3 = rg3.P(R.string.home_restart_wechat_confirm, go0Var);
                String strP4 = rg3.P(R.string.home_restart_wechat_leave, go0Var);
                boolean zF = go0Var.f(xk1Var) | go0Var.h(homeActivity);
                Object objL5 = go0Var.L();
                if (zF || objL5 == ebVar) {
                    objL5 = new r1(17, homeActivity, xk1Var);
                    go0Var.f0(objL5);
                }
                xm0 xm0Var = (xm0) objL5;
                boolean zF2 = go0Var.f(xk1Var);
                Object objL6 = go0Var.L();
                if (zF2 || objL6 == ebVar) {
                    objL6 = new f0(xk1Var, 23);
                    go0Var.f0(objL6);
                }
                qp0.c(xm0Var, strP, strP2, strP3, (xm0) objL6, null, strP4, null, go0Var, 0, 160);
                go0Var.p(false);
            } else {
                go0Var.W(-1334728226);
                go0Var.p(false);
            }
        } else {
            go0Var.R();
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$0$0(HomeActivity homeActivity, xk1 xk1Var, xk1 xk1Var2) {
        if (onCreate$lambda$0$10(xk1Var).isEmpty()) {
            homeActivity.finish();
        } else {
            onCreate$lambda$0$8(xk1Var2, true);
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$1$0(HomeActivity homeActivity, xk1 xk1Var, boolean z) {
        Object x92Var;
        a83 a83Var = a83.a;
        pp1 pp1Var = pp1.a;
        op1 op1VarC = pp1.c();
        op1VarC.getClass();
        op1VarC.e("security_mode", String.valueOf(z));
        sq1 sq1Var = sq1.a;
        if (z && sq1.f) {
            p7.A(sq1.b, null, new h50(2, (t00) null, 8), 3);
        }
        if (z) {
            List listF0 = du.F0(st0.a);
            ArrayList<vj> arrayList = new ArrayList();
            for (Object obj : listF0) {
                if (!((vj) obj).b()) {
                    arrayList.add(obj);
                }
            }
            for (vj vjVar : arrayList) {
                try {
                    st0.c(vjVar);
                    x92Var = a83Var;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Throwable thA = y92.a(x92Var);
                if (thA != null) {
                    pp1 pp1Var2 = pp1.a;
                    pp1.h(vjVar, "uninstall", thA, "Hooker uninstall failed");
                    hg3.d(vjVar.d(), "Hooker " + vjVar.d() + " uninstall failed: " + fg1.Q(thA));
                }
            }
        }
        pp1 pp1Var3 = pp1.a;
        onCreate$lambda$0$5(xk1Var, pp1.f());
        homeActivity.refreshHookers();
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$2$0(Map map, xk1 xk1Var, gx2 gx2Var, boolean z) {
        gx2Var.getClass();
        Boolean bool = (Boolean) map.get(gx2Var.d());
        if (bool != null) {
            xk1Var.setValue(Boolean.valueOf(z).equals(bool) ? np2.a0(onCreate$lambda$0$10(xk1Var), gx2Var.d()) : np2.d0(onCreate$lambda$0$10(xk1Var), gx2Var.d()));
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$3$0(HomeActivity homeActivity, xk1 xk1Var, c73 c73Var) {
        c73Var.getClass();
        xk1Var.setValue(c73Var);
        homeActivity.writeUIConfig(c73Var);
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$4$0(HomeActivity homeActivity, xk1 xk1Var) {
        onCreate$lambda$0$8(xk1Var, false);
        homeActivity.finish();
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$5$0(xk1 xk1Var) {
        onCreate$lambda$0$8(xk1Var, false);
        fd3.b();
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final boolean onCreate$lambda$0$4(xk1 xk1Var) {
        return ((Boolean) xk1Var.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final void onCreate$lambda$0$5(xk1 xk1Var, boolean z) {
        xk1Var.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final xk1 onCreate$lambda$0$6$0() {
        return op0.u(Boolean.FALSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final boolean onCreate$lambda$0$7(xk1 xk1Var) {
        return ((Boolean) xk1Var.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final void onCreate$lambda$0$8(xk1 xk1Var, boolean z) {
        xk1Var.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final c73 readUIConfig() {
        Object x92Var;
        try {
            pp1 pp1Var = pp1.a;
            x92Var = (c73) pp1.c().b(se.D(c73.Companion.serializer()), null, "ui_config");
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        c73 c73Var = (c73) (x92Var instanceof x92 ? null : x92Var);
        return c73Var == null ? new c73() : c73Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void refreshHookers() {
        vj[] vjVarArr = po0.g;
        vj[] vjVarArr2 = po0.g;
        vjVarArr2.getClass();
        rg3.i = vjVarArr2;
        ArrayList arrayList = new ArrayList();
        for (vj vjVar : vjVarArr2) {
            if (vjVar instanceof gw) {
                arrayList.add(vjVar);
            }
        }
        gw[] gwVarArr = (gw[]) arrayList.toArray(new gw[0]);
        gwVarArr.getClass();
        rg3.j = gwVarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void updateSystemBarAppearance(boolean z) {
        Window window = getWindow();
        hh1 hh1Var = new hh1(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        df3 ef3Var = i >= 35 ? new ef3(window, hh1Var, 1) : i >= 30 ? new df3(window, hh1Var, 1) : new df3(window, hh1Var, 0);
        boolean z2 = !z;
        ef3Var.c(z2);
        ef3Var.b(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void writeUIConfig(c73 c73Var) {
        try {
            pp1 pp1Var = pp1.a;
            pp1.c().d(c73.Companion.serializer(), c73Var, "ui_config");
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qj, defpackage.dw, defpackage.cw, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        ensureHookersLoaded();
        int i2 = 0;
        lx2 lx2Var = new lx2(0, 0, new kx2(i2));
        lx2 lx2Var2 = new lx2(ld0.a, ld0.b, new kx2(i2));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        md0 qd0Var = ld0.c;
        if (qd0Var == null) {
            int i3 = Build.VERSION.SDK_INT;
            qd0Var = i3 >= 35 ? new qd0() : i3 >= 30 ? new pd0() : i3 >= 29 ? new od0() : i3 >= 28 ? new nd0() : new md0();
            ld0.c = qd0Var;
        }
        md0 md0Var = qd0Var;
        kk kkVar = new kk(md0Var, lx2Var, lx2Var2, this, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (true) {
            i = 8;
            if (i2 >= viewGroup.getChildCount()) {
                kd0 kd0Var = new kd0(kkVar, viewGroup.getContext());
                kd0Var.setTag(md0Var);
                kd0Var.setVisibility(8);
                kd0Var.setWillNotDraw(true);
                viewGroup.addView(kd0Var);
                break;
            }
            int i4 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof md0) {
                break;
            } else {
                i2 = i4;
            }
        }
        kkVar.run();
        Window window = getWindow();
        window.getClass();
        md0Var.a(window);
        ew.a(this, new kw(708868459, true, new s9(i, this)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qj, android.app.Activity
    public void onResume() {
        super.onResume();
        c73 uIConfig = readUIConfig();
        boolean zIsSystemDarkTheme = isSystemDarkTheme();
        uIConfig.getClass();
        int i = uIConfig.a;
        if (i == 1) {
            zIsSystemDarkTheme = false;
        } else if (i == 2) {
            zIsSystemDarkTheme = true;
        }
        updateSystemBarAppearance(zIsSystemDarkTheme);
    }
}
