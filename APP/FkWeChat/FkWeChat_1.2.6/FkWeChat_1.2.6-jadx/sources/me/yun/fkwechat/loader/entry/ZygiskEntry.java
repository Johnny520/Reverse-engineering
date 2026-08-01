package me.yun.fkwechat.loader.entry;

import android.app.Application;
import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import java.lang.reflect.Executable;
import java.util.Set;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
public class ZygiskEntry {
    private static final String TAG = "FkWeChat/ZE";
    private static final String TARGET_PACKAGE = "com.tencent.mm";
    public static volatile ClassLoader sAppClassLoader;
    private static final Set<Object> sTrackedLoadedApks = null;
    public Executable backup;

    /* JADX INFO: compiled from: Dex2C */
    public static class BootstrapTask implements Runnable {
        private final ClassLoader loader;
        private int retries = 0;

        static {
            FkwLoader.registerNativesForClass(38, BootstrapTask.class);
            Hidden0.special_clinit_38_30(BootstrapTask.class);
        }

        public BootstrapTask(ClassLoader classLoader) {
            this.loader = classLoader;
        }

        private native Application getApplication();

        @Override // java.lang.Runnable
        public native void run();
    }

    /* JADX INFO: compiled from: Dex2C */
    public static class LoadedApkCtorMarker {
        public Executable backup;

        static {
            FkwLoader.registerNativesForClass(39, LoadedApkCtorMarker.class);
            Hidden0.special_clinit_39_20(LoadedApkCtorMarker.class);
        }

        public native Object callback(Object[] objArr);
    }

    static {
        FkwLoader.registerNativesForClass(40, ZygiskEntry.class);
        Hidden0.special_clinit_40_00(ZygiskEntry.class);
    }

    /* JADX INFO: renamed from: a */
    public static native /* bridge */ /* synthetic */ Set m21259a();

    public static native void bootstrapAfterLSPlant(ClassLoader classLoader);

    public static native void init(ClassLoader classLoader);

    public static native void installBootstrapHook();

    private native void invokeBackup(Object[] objArr);

    private static native void nativeOnAppClassLoaderReady(ClassLoader classLoader);

    private static native Class<?> resolveClass(ClassLoader classLoader, String str);

    private static native Class<?> tryLoadClass(ClassLoader classLoader, String str);

    public native Object callback(Object[] objArr);
}
