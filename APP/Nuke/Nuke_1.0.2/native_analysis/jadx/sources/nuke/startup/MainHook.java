package nuke.startup;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.util.Log;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p000.AbstractC0142du;
import p000.AbstractC0812vj;
import p000.C0676s;
import p000.C0792v;
import p000.a83;
import p000.d72;
import p000.kg3;
import p000.op0;
import p000.pp1;
import p000.sg1;
import p000.st0;
import p000.t11;
import p000.tb1;
import p000.up0;
import p000.vi0;
import p000.vi1;
import p000.vu0;
import p000.x92;
import p000.zg1;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class MainHook implements IXposedHookLoadPackage, IXposedHookZygoteInit {
    public static final int $stable = 8;
    private final String mTAG = "MainHook";
    private IXposedHookZygoteInit.StartupParam startupParam;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        vu0 vu0Var;
        Object x92Var;
        loadPackageParam.getClass();
        String str = loadPackageParam.packageName;
        str.getClass();
        if (requireRunningInTargetHost(str)) {
            String str2 = this.mTAG;
            String str3 = loadPackageParam.packageName;
            String str4 = loadPackageParam.processName;
            StringBuilder sbM5696o = vi0.m5696o("[", str2, "] Enter handleLoadPackage: ", str3, "/");
            sbM5696o.append(str4);
            XposedBridge.log(sbM5696o.toString());
            pp1 pp1Var = pp1.f8445a;
            String str5 = loadPackageParam.packageName;
            str5.getClass();
            String str6 = loadPackageParam.processName;
            str6.getClass();
            loadPackageParam.appInfo.sourceDir.getClass();
            IXposedHookZygoteInit.StartupParam startupParam = this.startupParam;
            if (startupParam == null) {
                t11.m5067S("startupParam");
                throw null;
            }
            String str7 = startupParam.modulePath;
            str7.getClass();
            if (1800795782422L < System.currentTimeMillis()) {
                return;
            }
            int iHashCode = str5.hashCode();
            if (iHashCode == -973170826) {
                if (str5.equals("com.tencent.mm")) {
                    vu0Var = vu0.f12174i;
                    pp1.f8446b = vu0Var;
                    up0.f11404l = str7;
                    up0.f11406n = str5;
                    up0.f11405m = str6;
                    if (str5.equals(str6)) {
                    }
                }
                C0676s.m4653l("Nuke is running on unsupported package: ".concat(str5));
            }
            if (iHashCode == 313184810) {
                if (str5.equals("com.ss.android.ugc.aweme")) {
                    vu0Var = vu0.f12175j;
                    pp1.f8446b = vu0Var;
                    up0.f11404l = str7;
                    up0.f11406n = str5;
                    up0.f11405m = str6;
                    if (str5.equals(str6)) {
                    }
                }
                C0676s.m4653l("Nuke is running on unsupported package: ".concat(str5));
            }
            if (iHashCode == 361910168 && str5.equals("com.tencent.mobileqq")) {
                vu0Var = vu0.f12173h;
                pp1.f8446b = vu0Var;
                up0.f11404l = str7;
                up0.f11406n = str5;
                up0.f11405m = str6;
                if (str5.equals(str6)) {
                    sg1 sg1VarM3244v = op0.m3602y(d72.m967a(Instrumentation.class)).m3244v();
                    sg1VarM3244v.f13871b = "callApplicationOnCreate";
                    sg1VarM3244v.m4864d(Application.class);
                    Method method = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j;
                    method.getClass();
                    XposedBridge.hookMethod(method, new kg3(null, new vi1(22), new vi1(23))).getClass();
                    sg1 sg1VarM3244v2 = op0.m3602y(d72.m967a(Activity.class)).m3244v();
                    sg1VarM3244v2.f13871b = "onResume";
                    Method method2 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v2.m4863c())).f13895j;
                    method2.getClass();
                    XposedBridge.hookMethod(method2, new kg3(null, new vi1(21), null)).getClass();
                    return;
                }
                AbstractC0812vj[] abstractC0812vjArrM3929a = pp1.m3929a();
                abstractC0812vjArrM3929a.getClass();
                for (AbstractC0812vj abstractC0812vj : abstractC0812vjArrM3929a) {
                    if (!(abstractC0812vj instanceof tb1)) {
                        ArrayList arrayList = st0.f10362a;
                        abstractC0812vj.getClass();
                        if (abstractC0812vj.mo5706f()) {
                            sg1 sg1VarM3244v3 = op0.m3602y(d72.m967a(Application.class)).m3244v();
                            sg1VarM3244v3.f13871b = "attach";
                            sg1VarM3244v3.m4864d(Context.class);
                            Method method3 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v3.m4863c())).f13895j;
                            method3.getClass();
                            XposedBridge.hookMethod(method3, new kg3(null, null, new C0792v(18, abstractC0812vjArrM3929a))).getClass();
                            return;
                        }
                    }
                }
                String string = ("Skip process " + str6 + ": no hookers target this process").toString();
                try {
                    XposedBridge.log("[NukeCore]" + string);
                    x92Var = a83.f116a;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                if (x92Var instanceof x92) {
                    Log.println(4, "NukeCore", string);
                    return;
                }
                return;
            }
            C0676s.m4653l("Nuke is running on unsupported package: ".concat(str5));
        }
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        startupParam.getClass();
        this.startupParam = startupParam;
    }

    public final boolean requireRunningInTargetHost(String str) {
        str.getClass();
        return str.equals("com.tencent.mm") || str.equals("com.tencent.mobileqq");
    }
}
