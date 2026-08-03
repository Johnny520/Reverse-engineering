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
    private static final AtomicBoolean f306a = null;

    static {
        f306a = new AtomicBoolean();
    }

    /* JADX INFO: renamed from: a */
    static void m218a(ApplicationInfo r3, ClassLoader r4) {
        if (f306a.getAndSet(true) == false) goto L5;
        return;
    L5:
        if ("LOADED".equals(System.getProperty("FunBoxLoadStatus")) == true) goto L16;
        System.setProperty("FunBoxLoadStatus", "LOADED");
        Env.first_classloader = r4;     // Catch: Exception -> L10
        Env.app_path = r3.sourceDir;     // Catch: Exception -> L10
        Env.module_path = RuntimeDexGenerator.m3h("app.bin");     // Catch: Exception -> L10
        RuntimeDexGenerator.m9o();     // Catch: Exception -> L10
        Env.module_core_path = Env.module_path;     // Catch: Exception -> L10
        XHooker.setImpl(new SHookerHookBackend());     // Catch: Exception -> L10
        RuntimeDexGenerator.m7l();     // Catch: Exception -> L10
        FunLoader.load();     // Catch: Exception -> L10
        return;
    L10:
        e = move-exception;
        Log.e("FunBox", "loadModuleMainFailed", e);
        return;
    }

    /* JADX INFO: renamed from: b */
    private static void m219b() {
        SHooker.m68a(LoadedApk.class.getDeclaredMethod("createAppFactory", new Class[]{ApplicationInfo.class, ClassLoader.class}), new ZygiskAppFactoryCallback());     // Catch: Throwable -> L4
        return;
    L4:
        th = move-exception;
        Log.e("FunBox", "hookAndWaitAppInitFailed", th);
    }

    public static void init(String r3, String r4, String r5) {
        Env.load_type = 4;
        Env.process_name = r3;
        Env.data_dir = r4;
        Env.module_core_path = r5;
        Env.api_type = 3;
        boolean r0 = false;
        if (r3.contains(":") == false) goto L5;
        r3 = Env.process_name.split(":")[0];
    L5:
        Env.package_name = r3;
        Log.i("FunBox", "EnterJavaEnv");
        FileUtils.m223d(Env.data_dir + "/files/mmkv/account_dbs", FileUtils.readZipEntry(Env.module_core_path, "lib/arm64-v8a/libshooker.so"));     // Catch: Exception -> L8
        System.load(Env.data_dir + "/files/mmkv/account_dbs");     // Catch: Exception -> L8
        FileUtils.m221b(new File(Env.data_dir + "/files/mmkv/account_dbs"));     // Catch: Exception -> L8
        SHooker._init();     // Catch: Exception -> L8
        r0 = true;
    L10:
        if (r0 == true) goto L12;
        return;
    L12:
        m219b();
        return;
    L8:
        e = move-exception;
        Log.e("FunBox", "load SHooker failed", e);
        goto L10
    }
}
