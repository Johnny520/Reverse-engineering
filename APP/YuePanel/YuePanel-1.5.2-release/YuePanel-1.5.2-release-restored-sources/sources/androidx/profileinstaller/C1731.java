package androidx.profileinstaller;

import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* JADX INFO: renamed from: androidx.profileinstaller.ۥ */
/* JADX INFO: loaded from: classes.dex */
public class C1731 {

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ$ۥ, reason: contains not printable characters */
    @InterfaceC7113(api = 21)
    public static class C8894 {
        /* JADX INFO: renamed from: ۥ */
        public static File m4883(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ$ۥ۟, reason: contains not printable characters */
    @InterfaceC7113(api = 24)
    public static class C8895 {
        /* JADX INFO: renamed from: ۥ */
        public static File m4884(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m4881(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m4881(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m4882(@InterfaceC6391 Context context, @InterfaceC6391 ProfileInstallReceiver.C1728 c1728) {
        if (m4881(C8895.m4884(context))) {
            c1728.mo4875(14, null);
        } else {
            c1728.mo4875(15, null);
        }
    }
}
