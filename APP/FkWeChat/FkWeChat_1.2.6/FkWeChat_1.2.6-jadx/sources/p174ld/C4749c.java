package p174ld;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import me.yun.fkwechat.core.config.AppConfig;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: ld.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4749c {

    /* JADX INFO: renamed from: a */
    public static final C4749c f14071a = new C4749c();

    /* JADX INFO: renamed from: a */
    public static final boolean m19000a(Application application) {
        Object objM18798b;
        Object objM18798b2;
        application.getClass();
        try {
            C4712s.a aVar = C4712s.f13928r;
            Context baseContext = application.getBaseContext();
            PackageManager packageManager = baseContext.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(baseContext.getPackageName(), 0);
            AppConfig.hostApplication = application;
            AppConfig.hostContext = baseContext;
            AppConfig.hostAppName = packageManager.getApplicationLabel(baseContext.getApplicationInfo()).toString();
            AppConfig.hostClassLoader = baseContext.getClassLoader();
            AppConfig.hostApkPath = baseContext.getApplicationInfo().sourceDir;
            AppConfig.hostVersionCode = packageInfo.versionCode;
            AppConfig.hostVersionName = packageInfo.versionName;
            AppConfig.hostDataPath = baseContext.getDataDir().getAbsolutePath();
            File[] externalMediaDirs = baseContext.getExternalMediaDirs();
            if (externalMediaDirs != null) {
                if (!(externalMediaDirs.length == 0)) {
                    AppConfig.hostMediaPath = externalMediaDirs[0].getAbsolutePath();
                }
            }
            try {
                AppConfig.moduleVersionName = "1.2.6";
                AppConfig.moduleVersionCode = 31;
                AppConfig.moduleApkPath = packageManager.getApplicationInfo(AppConfig.MODULE_PACKAGE, 0).sourceDir;
                objM18798b2 = C4712s.m18798b(C4700i0.f13910a);
            } catch (Throwable th) {
                C4712s.a aVar2 = C4712s.f13928r;
                objM18798b2 = C4712s.m18798b(AbstractC4713t.m18807a(th));
            }
            Throwable thM18801e = C4712s.m18801e(objM18798b2);
            if (thM18801e != null) {
                AbstractC8924d.m34265e("Failed to get module info", thM18801e);
            }
            objM18798b = C4712s.m18798b(Boolean.TRUE);
        } catch (Throwable th2) {
            C4712s.a aVar3 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th2));
        }
        Throwable thM18801e2 = C4712s.m18801e(objM18798b);
        if (thM18801e2 != null) {
            AbstractC8924d.m34265e("initContext error", thM18801e2);
            objM18798b = Boolean.FALSE;
        }
        return ((Boolean) objM18798b).booleanValue();
    }
}
