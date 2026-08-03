package fun.box001.loader;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fun.box001.loader.utils.FileUtils;
import fun.box001.shared.Env;
import fun.box001.shared.hook.XHooker;
import java.io.File;
import java.io.IOException;
import p000a.AbstractC0001b;
import p015p.C0222k;

/* JADX INFO: loaded from: classes.dex */
public class XPEntry implements IXposedHookLoadPackage, IXposedHookZygoteInit {
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws IOException {
        if (loadPackageParam.isFirstApplication) {
            String str = loadPackageParam.processName;
            try {
                Integer.parseInt(str.substring(str.length() - 1));
            } catch (Throwable unused) {
                if ("LOADED".equals(System.getProperty("FunBoxLoadStatus"))) {
                    return;
                }
                System.setProperty("FunBoxLoadStatus", "LOADED");
                try {
                    getClass().getClassLoader().loadClass("org.lsposed.lspatch.share.PatchConfig");
                    Env.load_type = 2;
                } catch (Throwable unused2) {
                }
                if (Env.load_type == 0) {
                    try {
                        if (XposedBridge.class.getDeclaredField("TAG").get(null).toString().contains("FPAXP89")) {
                            Env.load_type = 3;
                        }
                    } catch (Throwable unused3) {
                    }
                }
                if (Env.load_type == 0) {
                    try {
                        if (XposedBridge.class.getDeclaredField("TAG").get(null).toString().contains("LSPosed")) {
                            Env.load_type = 1;
                        }
                    } catch (Throwable unused4) {
                    }
                }
                Env.data_dir = loadPackageParam.appInfo.dataDir;
                Env.package_name = loadPackageParam.packageName;
                Env.process_name = loadPackageParam.processName;
                Env.first_classloader = loadPackageParam.classLoader;
                Env.api_type = 4;
                if (!Env.module_core_path.startsWith("/data/app")) {
                    String strM3h = AbstractC0001b.m3h("core_app");
                    FileUtils.m220a(Env.module_core_path, strM3h);
                    FileUtils.m221b(new File(Env.module_core_path));
                    try {
                        if (new File(Env.module_core_path).getParentFile().getName().equals("have.fun")) {
                            FileUtils.m221b(new File(Env.module_core_path).getParentFile());
                        }
                    } catch (Exception unused5) {
                    }
                    Env.module_core_path = strM3h;
                }
                AbstractC0001b.m9o();
                Env.module_path = AbstractC0001b.m3h("app.bin");
                Env.app_path = loadPackageParam.appInfo.sourceDir;
                XHooker.setImpl(new C0222k());
                AbstractC0001b.m7l();
                FunLoader.load();
            }
        }
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        Env.module_core_path = startupParam.modulePath;
    }
}
