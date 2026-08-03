package fun.box001.loader;

import android.app.LoadedApk;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.shooker.SHooker;
import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.hookbackend.xposed.SHookerHookBackend;
import fun.box001.loader.utils.FileUtils;
import fun.box001.shared.Env;
import fun.box001.shared.hook.XHooker;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class ZygiskEntry {

    /* JADX INFO: renamed from: a */
    private static final AtomicBoolean f306a = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    static void m218a(ApplicationInfo applicationInfo, ClassLoader classLoader) {
        if (f306a.getAndSet(true) || "LOADED".equals(System.getProperty("FunBoxLoadStatus"))) {
            return;
        }
        System.setProperty("FunBoxLoadStatus", "LOADED");
        try {
            Env.first_classloader = classLoader;
            Env.app_path = applicationInfo.sourceDir;
            Env.module_path = RuntimeDexGenerator.m3h("app.bin");
            RuntimeDexGenerator.m9o();
            Env.module_core_path = Env.module_path;
            XHooker.setImpl(new SHookerHookBackend());
            RuntimeDexGenerator.m7l();
            FunLoader.load();
        } catch (Exception e2) {
            Log.e("FunBox", "loadModuleMainFailed", e2);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m219b() {
        try {
            SHooker.m68a(LoadedApk.class.getDeclaredMethod("createAppFactory", ApplicationInfo.class, ClassLoader.class), new ZygiskAppFactoryCallback());
        } catch (Throwable th) {
            Log.e("FunBox", "hookAndWaitAppInitFailed", th);
        }
    }

    public static void init(String str, String str2, String str3) {
        Env.load_type = 4;
        Env.process_name = str;
        Env.data_dir = str2;
        Env.module_core_path = str3;
        Env.api_type = 3;
        boolean z = false;
        if (str.contains(":")) {
            str = Env.process_name.split(":")[0];
        }
        Env.package_name = str;
        Log.i("FunBox", "EnterJavaEnv");
        try {
            FileUtils.m223d(Env.data_dir + "/files/mmkv/account_dbs", FileUtils.readZipEntry(Env.module_core_path, "lib/arm64-v8a/libshooker.so"));
            System.load(Env.data_dir + "/files/mmkv/account_dbs");
            FileUtils.m221b(new File(Env.data_dir + "/files/mmkv/account_dbs"));
            SHooker._init();
            z = true;
        } catch (Exception e2) {
            Log.e("FunBox", "load SHooker failed", e2);
        }
        if (z) {
            m219b();
        }
    }
}
