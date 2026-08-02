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
import defpackage.a83;
import defpackage.d72;
import defpackage.du;
import defpackage.kg3;
import defpackage.op0;
import defpackage.pp1;
import defpackage.s;
import defpackage.sg1;
import defpackage.st0;
import defpackage.t11;
import defpackage.tb1;
import defpackage.up0;
import defpackage.v;
import defpackage.vi0;
import defpackage.vi1;
import defpackage.vj;
import defpackage.vu0;
import defpackage.x92;
import defpackage.zg1;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class MainHook implements IXposedHookLoadPackage, IXposedHookZygoteInit {
    public static final int $stable = 8;
    private final String mTAG = "MainHook";
    private IXposedHookZygoteInit.StartupParam startupParam;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            StringBuilder sbO = vi0.o("[", str2, "] Enter handleLoadPackage: ", str3, "/");
            sbO.append(str4);
            XposedBridge.log(sbO.toString());
            pp1 pp1Var = pp1.a;
            String str5 = loadPackageParam.packageName;
            str5.getClass();
            String str6 = loadPackageParam.processName;
            str6.getClass();
            loadPackageParam.appInfo.sourceDir.getClass();
            IXposedHookZygoteInit.StartupParam startupParam = this.startupParam;
            if (startupParam == null) {
                t11.S("startupParam");
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
                    vu0Var = vu0.i;
                    pp1.b = vu0Var;
                    up0.l = str7;
                    up0.n = str5;
                    up0.m = str6;
                    if (str5.equals(str6)) {
                    }
                }
                s.l("Nuke is running on unsupported package: ".concat(str5));
            }
            if (iHashCode == 313184810) {
                if (str5.equals("com.ss.android.ugc.aweme")) {
                    vu0Var = vu0.j;
                    pp1.b = vu0Var;
                    up0.l = str7;
                    up0.n = str5;
                    up0.m = str6;
                    if (str5.equals(str6)) {
                    }
                }
                s.l("Nuke is running on unsupported package: ".concat(str5));
            }
            if (iHashCode == 361910168 && str5.equals("com.tencent.mobileqq")) {
                vu0Var = vu0.h;
                pp1.b = vu0Var;
                up0.l = str7;
                up0.n = str5;
                up0.m = str6;
                if (str5.equals(str6)) {
                    sg1 sg1VarV = op0.y(d72.a(Instrumentation.class)).v();
                    sg1VarV.b = "callApplicationOnCreate";
                    sg1VarV.d(Application.class);
                    Method method = ((zg1) du.o0(sg1VarV.c())).j;
                    method.getClass();
                    XposedBridge.hookMethod(method, new kg3(null, new vi1(22), new vi1(23))).getClass();
                    sg1 sg1VarV2 = op0.y(d72.a(Activity.class)).v();
                    sg1VarV2.b = "onResume";
                    Method method2 = ((zg1) du.o0(sg1VarV2.c())).j;
                    method2.getClass();
                    XposedBridge.hookMethod(method2, new kg3(null, new vi1(21), null)).getClass();
                    return;
                }
                vj[] vjVarArrA = pp1.a();
                vjVarArrA.getClass();
                for (vj vjVar : vjVarArrA) {
                    if (!(vjVar instanceof tb1)) {
                        ArrayList arrayList = st0.a;
                        vjVar.getClass();
                        if (vjVar.f()) {
                            sg1 sg1VarV3 = op0.y(d72.a(Application.class)).v();
                            sg1VarV3.b = "attach";
                            sg1VarV3.d(Context.class);
                            Method method3 = ((zg1) du.o0(sg1VarV3.c())).j;
                            method3.getClass();
                            XposedBridge.hookMethod(method3, new kg3(null, null, new v(18, vjVarArrA))).getClass();
                            return;
                        }
                    }
                }
                String string = ("Skip process " + str6 + ": no hookers target this process").toString();
                try {
                    XposedBridge.log("[NukeCore]" + string);
                    x92Var = a83.a;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                if (x92Var instanceof x92) {
                    Log.println(4, "NukeCore", string);
                    return;
                }
                return;
            }
            s.l("Nuke is running on unsupported package: ".concat(str5));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        startupParam.getClass();
        this.startupParam = startupParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean requireRunningInTargetHost(String str) {
        str.getClass();
        return str.equals("com.tencent.mm") || str.equals("com.tencent.mobileqq");
    }
}
