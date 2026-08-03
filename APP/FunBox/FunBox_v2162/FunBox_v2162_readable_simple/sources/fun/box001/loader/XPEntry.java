package fun.box001.loader;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.hookbackend.xposed.XposedHookBackend;
import fun.box001.loader.utils.FileUtils;
import fun.box001.shared.Env;
import fun.box001.shared.hook.XHooker;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class XPEntry implements IXposedHookLoadPackage, IXposedHookZygoteInit {
    public XPEntry() {
    }

    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam r6) {
        if (r6.isFirstApplication == false) goto L45;
        String r0 = r6.processName;
        Integer.parseInt(r0.substring(r0.length() - 1));     // Catch: Throwable -> L7
        return;
    L8:
        if ("LOADED".equals(System.getProperty("FunBoxLoadStatus")) == false) goto L10;
        return;
    L10:
        System.setProperty("FunBoxLoadStatus", "LOADED");
        getClass().getClassLoader().loadClass("org.lsposed.lspatch.share.PatchConfig");     // Catch: Throwable -> L31
        Env.load_type = 2;     // Catch: Throwable -> L31
    L13:
        if (Env.load_type != 0) goto L18;
        if (XposedBridge.class.getDeclaredField("TAG").get(null).toString().contains("FPAXP89") == false) goto L18;
        Env.load_type = 3;     // Catch: Throwable -> L32
    L18:
        if (Env.load_type == 0) goto L35;
    L22:
        Env.data_dir = r6.appInfo.dataDir;
        Env.package_name = r6.packageName;
        Env.process_name = r6.processName;
        Env.first_classloader = r6.classLoader;
        Env.api_type = 4;
        if (Env.module_core_path.startsWith("/data/app") == true) goto L29;
        String r02 = RuntimeDexGenerator.m3h("core_app");
        FileUtils.m220a(Env.module_core_path, r02);
        FileUtils.m221b(new File(Env.module_core_path));
        if (new File(Env.module_core_path).getParentFile().getName().equals("have.fun") == false) goto L28;
        FileUtils.m221b(new File(Env.module_core_path).getParentFile());     // Catch: Exception -> L34
    L28:
        Env.module_core_path = r02;
    L29:
        RuntimeDexGenerator.m9o();
        Env.module_path = RuntimeDexGenerator.m3h("app.bin");
        Env.app_path = r6.appInfo.sourceDir;
        XHooker.setImpl(new XposedHookBackend());
        RuntimeDexGenerator.m7l();
        FunLoader.load();
        return;
    L35:
        if (XposedBridge.class.getDeclaredField("TAG").get(null).toString().contains("LSPosed") == false) goto L22;
        Env.load_type = 1;     // Catch: Throwable -> L33
        goto L22
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam r1) {
        Env.module_core_path = r1.modulePath;
    }
}
