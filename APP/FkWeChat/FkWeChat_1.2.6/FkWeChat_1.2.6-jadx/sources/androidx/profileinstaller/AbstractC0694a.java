package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* JADX INFO: renamed from: androidx.profileinstaller.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0694a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static File m2728a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Context m2729a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2726a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = m2726a(file2) && z10;
        }
        return z10;
    }

    /* JADX INFO: renamed from: b */
    public static void m2727b(Context context, ProfileInstallReceiver.C0691a c0691a) {
        if (m2726a(Build.VERSION.SDK_INT >= 34 ? b.m2729a(context).getCacheDir() : a.m2728a(b.m2729a(context)))) {
            c0691a.mo2718b(14, null);
        } else {
            c0691a.mo2718b(15, null);
        }
    }
}
