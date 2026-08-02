package nuke.p003ui;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;
import nuke.p003ui.HomeActivity;
import p000.AbstractActivityC0621qj;
import p000.AbstractC0142du;
import p000.AbstractC0179eu;
import p000.AbstractC0181ew;
import p000.AbstractC0255gw;
import p000.AbstractC0570p7;
import p000.AbstractC0646r7;
import p000.AbstractC0691se;
import p000.AbstractC0812vj;
import p000.C0016af;
import p000.C0146dy;
import p000.C0160eb;
import p000.C0186f0;
import p000.C0363ju;
import p000.C0402kw;
import p000.C0520nx;
import p000.C0640r1;
import p000.C0678s1;
import p000.C0686s9;
import p000.InterfaceC0596px;
import p000.RunnableC0390kk;
import p000.a83;
import p000.at0;
import p000.c73;
import p000.ci0;
import p000.df3;
import p000.ef3;
import p000.f42;
import p000.fd3;
import p000.fe0;
import p000.fg1;
import p000.gf1;
import p000.go0;
import p000.gx2;
import p000.h50;
import p000.hg3;
import p000.hh1;
import p000.in0;
import p000.kd0;
import p000.kx2;
import p000.ld0;
import p000.lg3;
import p000.lp1;
import p000.lx2;
import p000.md0;
import p000.mn0;
import p000.nd0;
import p000.np2;
import p000.od0;
import p000.op0;
import p000.op1;
import p000.p00;
import p000.pd0;
import p000.po0;
import p000.pp0;
import p000.pp1;
import p000.qd0;
import p000.qp0;
import p000.rg3;
import p000.sq1;
import p000.st0;
import p000.t00;
import p000.tp0;
import p000.ur1;
import p000.x92;
import p000.xe1;
import p000.xk1;
import p000.xm0;
import p000.y92;
import p000.z13;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class HomeActivity extends AbstractActivityC0621qj {
    public static final int $stable = AbstractActivityC0621qj.$stable;

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
            lg3.m2909a(contextCreateConfigurationContext);
        } catch (Throwable unused) {
        }
        contextCreateConfigurationContext.getClass();
        return contextCreateConfigurationContext;
    }

    private final void ensureHookersLoaded() {
        if (!(rg3.f9567i.length == 0)) {
            if (!(rg3.f9568j.length == 0)) {
                return;
            }
        }
        refreshHookers();
    }

    private final boolean isSystemDarkTheme() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    private final Locale languageLocale(c73 c73Var) {
        int i = c73Var.f1222b;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0(HomeActivity homeActivity, InterfaceC0596px interfaceC0596px, int i) {
        boolean z = true;
        go0 go0Var = (go0) interfaceC0596px;
        if (go0Var.m1958O(i & 1, (i & 3) != 2)) {
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (objM1956L == c0160eb) {
                objM1956L = op0.m3598u(homeActivity.readUIConfig());
                go0Var.m1981f0(objM1956L);
            }
            xk1 xk1Var = (xk1) objM1956L;
            Object objM1956L2 = go0Var.m1956L();
            if (objM1956L2 == c0160eb) {
                pp1 pp1Var = pp1.f8445a;
                objM1956L2 = op0.m3598u(Boolean.valueOf(pp1.m3934f()));
                go0Var.m1981f0(objM1956L2);
            }
            xk1 xk1Var2 = (xk1) objM1956L2;
            Object[] objArr = new Object[0];
            Object objM1956L3 = go0Var.m1956L();
            if (objM1956L3 == c0160eb) {
                objM1956L3 = new C0146dy(12);
                go0Var.m1981f0(objM1956L3);
            }
            xk1 xk1Var3 = (xk1) gf1.m1865M(objArr, (xm0) objM1956L3, go0Var, 48);
            Object objM1956L4 = go0Var.m1956L();
            if (objM1956L4 == c0160eb) {
                objM1956L4 = op0.m3598u(fe0.f2918h);
                go0Var.m1981f0(objM1956L4);
            }
            xk1 xk1Var4 = (xk1) objM1956L4;
            Object objM1956L5 = go0Var.m1956L();
            if (objM1956L5 == c0160eb) {
                AbstractC0255gw[] abstractC0255gwArr = rg3.f9568j;
                ArrayList arrayList = new ArrayList();
                for (AbstractC0255gw abstractC0255gw : abstractC0255gwArr) {
                    if (abstractC0255gw instanceof gx2) {
                        arrayList.add(abstractC0255gw);
                    }
                }
                ArrayList arrayList2 = st0.f10362a;
                ArrayList<gx2> arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    AbstractC0812vj abstractC0812vj = (AbstractC0812vj) obj;
                    abstractC0812vj.getClass();
                    if (abstractC0812vj.mo139e() || !abstractC0812vj.mo5706f()) {
                        arrayList3.add(obj);
                    }
                }
                int iM6103U = xe1.m6103U(AbstractC0179eu.m1421B(arrayList3, 10));
                if (iM6103U < 16) {
                    iM6103U = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM6103U);
                for (gx2 gx2Var : arrayList3) {
                    linkedHashMap.put(gx2Var.mo9d(), Boolean.valueOf(ci0.m789N(gx2Var)));
                }
                go0Var.m1981f0(linkedHashMap);
                objM1956L5 = linkedHashMap;
            }
            Map map = (Map) objM1956L5;
            boolean zM3596s = op0.m3596s(go0Var);
            c73 c73VarOnCreate$lambda$0$1 = onCreate$lambda$0$1(xk1Var);
            c73VarOnCreate$lambda$0$1.getClass();
            int i2 = c73VarOnCreate$lambda$0$1.f1221a;
            if (i2 == 1) {
                z = false;
            } else if (i2 != 2) {
                z = zM3596s;
            }
            boolean zM1980f = go0Var.m1980f(onCreate$lambda$0$1(xk1Var).f1224d) | go0Var.m1982g(z);
            Object objM1956L6 = go0Var.m1956L();
            if (zM1980f || objM1956L6 == c0160eb) {
                objM1956L6 = AbstractC0570p7.m3756L(onCreate$lambda$0$1(xk1Var).f1224d, z);
                go0Var.m1981f0(objM1956L6);
            }
            lp1 lp1Var = (lp1) objM1956L6;
            boolean zM1976d = go0Var.m1976d(onCreate$lambda$0$1(xk1Var).f1222b);
            Object objM1956L7 = go0Var.m1956L();
            if (zM1976d || objM1956L7 == c0160eb) {
                objM1956L7 = homeActivity.createLocalizedContext(onCreate$lambda$0$1(xk1Var));
                go0Var.m1981f0(objM1956L7);
            }
            Context context = (Context) objM1956L7;
            boolean zM1980f2 = go0Var.m1980f(context);
            Object objM1956L8 = go0Var.m1956L();
            if (zM1980f2 || objM1956L8 == c0160eb) {
                objM1956L8 = new Configuration(context.getResources().getConfiguration());
                go0Var.m1981f0(objM1956L8);
            }
            Configuration configuration = (Configuration) objM1956L8;
            boolean zM1984h = go0Var.m1984h(homeActivity) | go0Var.m1982g(z);
            Object objM1956L9 = go0Var.m1956L();
            if (zM1984h || objM1956L9 == c0160eb) {
                objM1956L9 = new p00(homeActivity, z);
                go0Var.m1981f0(objM1956L9);
            }
            AbstractC0179eu.m1468r((xm0) objM1956L9, go0Var);
            ci0.m801b(new f42[]{AbstractC0646r7.f9411b.mo1251a(context), AbstractC0646r7.f9410a.mo1251a(configuration)}, xe1.m6126i0(1555950763, new at0(z, lp1Var, xk1Var, homeActivity, xk1Var3, map, xk1Var4, xk1Var2), go0Var), go0Var, 48);
        } else {
            go0Var.m1961R();
        }
        return a83.f116a;
    }

    private static final c73 onCreate$lambda$0$1(xk1 xk1Var) {
        return (c73) xk1Var.getValue();
    }

    private static final Set<String> onCreate$lambda$0$10(xk1 xk1Var) {
        return (Set) xk1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$16$0(HomeActivity homeActivity, boolean z) {
        homeActivity.updateSystemBarAppearance(z);
        return a83.f116a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17(boolean z, lp1 lp1Var, xk1 xk1Var, HomeActivity homeActivity, xk1 xk1Var2, Map map, xk1 xk1Var3, xk1 xk1Var4, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        if (go0Var.m1958O(i & 1, (i & 3) != 2)) {
            z13.m6380a(z, false, new C0363ju(lp1Var.f6239g), xe1.m6126i0(547924073, new at0(lp1Var, xk1Var, homeActivity, xk1Var2, z, map, xk1Var3, xk1Var4), go0Var), go0Var, 3120);
        } else {
            go0Var.m1961R();
        }
        return a83.f116a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0(lp1 lp1Var, final xk1 xk1Var, final HomeActivity homeActivity, final xk1 xk1Var2, final boolean z, final Map map, final xk1 xk1Var3, final xk1 xk1Var4, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        if (go0Var.m1958O(i & 1, (i & 3) != 2)) {
            ur1.m5571a(lp1Var, onCreate$lambda$0$1(xk1Var).f1223c, xe1.m6126i0(-1245529180, new mn0() { // from class: ys0
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeActivity.onCreate$lambda$0$17$0$0(this.f13603h, xk1Var2, z, map, xk1Var3, xk1Var, xk1Var4, (InterfaceC0596px) obj, iIntValue);
                }
            }, go0Var), go0Var, 384);
        } else {
            go0Var.m1961R();
        }
        return a83.f116a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0(final HomeActivity homeActivity, xk1 xk1Var, boolean z, Map map, xk1 xk1Var2, final xk1 xk1Var3, final xk1 xk1Var4, InterfaceC0596px interfaceC0596px, int i) {
        final int i2 = 1;
        final int i3 = 0;
        go0 go0Var = (go0) interfaceC0596px;
        if (go0Var.m1958O(i & 1, (i & 3) != 2)) {
            boolean zM1984h = go0Var.m1984h(homeActivity) | go0Var.m1980f(xk1Var);
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (zM1984h || objM1956L == c0160eb) {
                objM1956L = new C0678s1((Object) homeActivity, xk1Var2, xk1Var, 10);
                go0Var.m1981f0(objM1956L);
            }
            pp0.m3905c(false, (xm0) objM1956L, go0Var, 0, 1);
            c73 c73VarOnCreate$lambda$0$1 = onCreate$lambda$0$1(xk1Var3);
            boolean zOnCreate$lambda$0$4 = onCreate$lambda$0$4(xk1Var4);
            boolean zM1984h2 = go0Var.m1984h(homeActivity);
            Object objM1956L2 = go0Var.m1956L();
            if (zM1984h2 || objM1956L2 == c0160eb) {
                objM1956L2 = new in0(homeActivity) { // from class: zs0

                    /* JADX INFO: renamed from: i */
                    public final /* synthetic */ HomeActivity f14085i;

                    {
                        this.f14085i = homeActivity;
                    }

                    @Override // p000.in0
                    /* JADX INFO: renamed from: j */
                    public final Object mo5j(Object obj) {
                        switch (i3) {
                            case 0:
                                return HomeActivity.onCreate$lambda$0$17$0$0$1$0(this.f14085i, xk1Var4, ((Boolean) obj).booleanValue());
                            default:
                                return HomeActivity.onCreate$lambda$0$17$0$0$3$0(this.f14085i, xk1Var4, (c73) obj);
                        }
                    }
                };
                go0Var.m1981f0(objM1956L2);
            }
            in0 in0Var = (in0) objM1956L2;
            boolean zM1984h3 = go0Var.m1984h(map);
            Object objM1956L3 = go0Var.m1956L();
            if (zM1984h3 || objM1956L3 == c0160eb) {
                objM1956L3 = new C0016af(7, map, xk1Var2);
                go0Var.m1981f0(objM1956L3);
            }
            mn0 mn0Var = (mn0) objM1956L3;
            boolean zM1984h4 = go0Var.m1984h(homeActivity);
            Object objM1956L4 = go0Var.m1956L();
            if (zM1984h4 || objM1956L4 == c0160eb) {
                objM1956L4 = new in0(homeActivity) { // from class: zs0

                    /* JADX INFO: renamed from: i */
                    public final /* synthetic */ HomeActivity f14085i;

                    {
                        this.f14085i = homeActivity;
                    }

                    @Override // p000.in0
                    /* JADX INFO: renamed from: j */
                    public final Object mo5j(Object obj) {
                        switch (i2) {
                            case 0:
                                return HomeActivity.onCreate$lambda$0$17$0$0$1$0(this.f14085i, xk1Var3, ((Boolean) obj).booleanValue());
                            default:
                                return HomeActivity.onCreate$lambda$0$17$0$0$3$0(this.f14085i, xk1Var3, (c73) obj);
                        }
                    }
                };
                go0Var.m1981f0(objM1956L4);
            }
            tp0.m5356a(null, null, c73VarOnCreate$lambda$0$1, z, zOnCreate$lambda$0$4, in0Var, mn0Var, (in0) objM1956L4, go0Var, AIChatConfig.DefaultMaxTokens);
            if (onCreate$lambda$0$7(xk1Var)) {
                go0Var.m1966W(-1335578556);
                String strM4462P = rg3.m4462P(R.string.home_restart_wechat_title, go0Var);
                String strM4462P2 = rg3.m4462P(R.string.home_restart_wechat_message, go0Var);
                String strM4462P3 = rg3.m4462P(R.string.home_restart_wechat_confirm, go0Var);
                String strM4462P4 = rg3.m4462P(R.string.home_restart_wechat_leave, go0Var);
                boolean zM1980f = go0Var.m1980f(xk1Var) | go0Var.m1984h(homeActivity);
                Object objM1956L5 = go0Var.m1956L();
                if (zM1980f || objM1956L5 == c0160eb) {
                    objM1956L5 = new C0640r1(17, homeActivity, xk1Var);
                    go0Var.m1981f0(objM1956L5);
                }
                xm0 xm0Var = (xm0) objM1956L5;
                boolean zM1980f2 = go0Var.m1980f(xk1Var);
                Object objM1956L6 = go0Var.m1956L();
                if (zM1980f2 || objM1956L6 == c0160eb) {
                    objM1956L6 = new C0186f0(xk1Var, 23);
                    go0Var.m1981f0(objM1956L6);
                }
                qp0.m4248c(xm0Var, strM4462P, strM4462P2, strM4462P3, (xm0) objM1956L6, null, strM4462P4, null, go0Var, 0, 160);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-1334728226);
                go0Var.m1994p(false);
            }
        } else {
            go0Var.m1961R();
        }
        return a83.f116a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$0$0(HomeActivity homeActivity, xk1 xk1Var, xk1 xk1Var2) {
        if (onCreate$lambda$0$10(xk1Var).isEmpty()) {
            homeActivity.finish();
        } else {
            onCreate$lambda$0$8(xk1Var2, true);
        }
        return a83.f116a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$1$0(HomeActivity homeActivity, xk1 xk1Var, boolean z) {
        Object x92Var;
        a83 a83Var = a83.f116a;
        pp1 pp1Var = pp1.f8445a;
        op1 op1VarM3931c = pp1.m3931c();
        op1VarM3931c.getClass();
        op1VarM3931c.m3608e("security_mode", String.valueOf(z));
        sq1 sq1Var = sq1.f10305a;
        if (z && sq1.f10310f) {
            AbstractC0570p7.m3745A(sq1.f10306b, null, new h50(2, (t00) null, 8), 3);
        }
        if (z) {
            List listM1148F0 = AbstractC0142du.m1148F0(st0.f10362a);
            ArrayList<AbstractC0812vj> arrayList = new ArrayList();
            for (Object obj : listM1148F0) {
                if (!((AbstractC0812vj) obj).mo1778b()) {
                    arrayList.add(obj);
                }
            }
            for (AbstractC0812vj abstractC0812vj : arrayList) {
                try {
                    st0.m5002c(abstractC0812vj);
                    x92Var = a83Var;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Throwable thM6237a = y92.m6237a(x92Var);
                if (thM6237a != null) {
                    pp1 pp1Var2 = pp1.f8445a;
                    pp1.m3936h(abstractC0812vj, "uninstall", thM6237a, "Hooker uninstall failed");
                    hg3.m2166d(abstractC0812vj.mo9d(), "Hooker " + abstractC0812vj.mo9d() + " uninstall failed: " + fg1.m1624Q(thM6237a));
                }
            }
        }
        pp1 pp1Var3 = pp1.f8445a;
        onCreate$lambda$0$5(xk1Var, pp1.m3934f());
        homeActivity.refreshHookers();
        return a83Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$2$0(Map map, xk1 xk1Var, gx2 gx2Var, boolean z) {
        gx2Var.getClass();
        Boolean bool = (Boolean) map.get(gx2Var.mo9d());
        if (bool != null) {
            xk1Var.setValue(Boolean.valueOf(z).equals(bool) ? np2.m3352a0(onCreate$lambda$0$10(xk1Var), gx2Var.mo9d()) : np2.m3355d0(onCreate$lambda$0$10(xk1Var), gx2Var.mo9d()));
        }
        return a83.f116a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$3$0(HomeActivity homeActivity, xk1 xk1Var, c73 c73Var) {
        c73Var.getClass();
        xk1Var.setValue(c73Var);
        homeActivity.writeUIConfig(c73Var);
        return a83.f116a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$4$0(HomeActivity homeActivity, xk1 xk1Var) {
        onCreate$lambda$0$8(xk1Var, false);
        homeActivity.finish();
        return a83.f116a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a83 onCreate$lambda$0$17$0$0$5$0(xk1 xk1Var) {
        onCreate$lambda$0$8(xk1Var, false);
        fd3.m1599b();
        return a83.f116a;
    }

    private static final boolean onCreate$lambda$0$4(xk1 xk1Var) {
        return ((Boolean) xk1Var.getValue()).booleanValue();
    }

    private static final void onCreate$lambda$0$5(xk1 xk1Var, boolean z) {
        xk1Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xk1 onCreate$lambda$0$6$0() {
        return op0.m3598u(Boolean.FALSE);
    }

    private static final boolean onCreate$lambda$0$7(xk1 xk1Var) {
        return ((Boolean) xk1Var.getValue()).booleanValue();
    }

    private static final void onCreate$lambda$0$8(xk1 xk1Var, boolean z) {
        xk1Var.setValue(Boolean.valueOf(z));
    }

    private final c73 readUIConfig() {
        Object x92Var;
        try {
            pp1 pp1Var = pp1.f8445a;
            x92Var = (c73) pp1.m3931c().m3605b(AbstractC0691se.m4815D(c73.Companion.serializer()), null, "ui_config");
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        c73 c73Var = (c73) (x92Var instanceof x92 ? null : x92Var);
        return c73Var == null ? new c73() : c73Var;
    }

    private final void refreshHookers() {
        AbstractC0812vj[] abstractC0812vjArr = po0.f8421g;
        AbstractC0812vj[] abstractC0812vjArr2 = po0.f8421g;
        abstractC0812vjArr2.getClass();
        rg3.f9567i = abstractC0812vjArr2;
        ArrayList arrayList = new ArrayList();
        for (AbstractC0812vj abstractC0812vj : abstractC0812vjArr2) {
            if (abstractC0812vj instanceof AbstractC0255gw) {
                arrayList.add(abstractC0812vj);
            }
        }
        AbstractC0255gw[] abstractC0255gwArr = (AbstractC0255gw[]) arrayList.toArray(new AbstractC0255gw[0]);
        abstractC0255gwArr.getClass();
        rg3.f9568j = abstractC0255gwArr;
    }

    private final void updateSystemBarAppearance(boolean z) {
        Window window = getWindow();
        hh1 hh1Var = new hh1(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        df3 ef3Var = i >= 35 ? new ef3(window, hh1Var, 1) : i >= 30 ? new df3(window, hh1Var, 1) : new df3(window, hh1Var, 0);
        boolean z2 = !z;
        ef3Var.mo1014c(z2);
        ef3Var.mo1013b(z2);
    }

    private final void writeUIConfig(c73 c73Var) {
        try {
            pp1 pp1Var = pp1.f8445a;
            pp1.m3931c().m3607d(c73.Companion.serializer(), c73Var, "ui_config");
        } catch (Throwable unused) {
        }
    }

    @Override // p000.AbstractActivityC0621qj, p000.AbstractActivityC0144dw, p000.AbstractActivityC0108cw, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        ensureHookersLoaded();
        int i2 = 0;
        lx2 lx2Var = new lx2(0, 0, new kx2(i2));
        lx2 lx2Var2 = new lx2(ld0.f6066a, ld0.f6067b, new kx2(i2));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        md0 qd0Var = ld0.f6068c;
        if (qd0Var == null) {
            int i3 = Build.VERSION.SDK_INT;
            qd0Var = i3 >= 35 ? new qd0() : i3 >= 30 ? new pd0() : i3 >= 29 ? new od0() : i3 >= 28 ? new nd0() : new md0();
            ld0.f6068c = qd0Var;
        }
        md0 md0Var = qd0Var;
        RunnableC0390kk runnableC0390kk = new RunnableC0390kk(md0Var, lx2Var, lx2Var2, this, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (true) {
            i = 8;
            if (i2 >= viewGroup.getChildCount()) {
                kd0 kd0Var = new kd0(runnableC0390kk, viewGroup.getContext());
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
        runnableC0390kk.run();
        Window window = getWindow();
        window.getClass();
        md0Var.mo3059a(window);
        AbstractC0181ew.m1480a(this, new C0402kw(708868459, true, new C0686s9(i, this)));
    }

    @Override // p000.AbstractActivityC0621qj, android.app.Activity
    public void onResume() {
        super.onResume();
        c73 uIConfig = readUIConfig();
        boolean zIsSystemDarkTheme = isSystemDarkTheme();
        uIConfig.getClass();
        int i = uIConfig.f1221a;
        if (i == 1) {
            zIsSystemDarkTheme = false;
        } else if (i == 2) {
            zIsSystemDarkTheme = true;
        }
        updateSystemBarAppearance(zIsSystemDarkTheme);
    }
}
