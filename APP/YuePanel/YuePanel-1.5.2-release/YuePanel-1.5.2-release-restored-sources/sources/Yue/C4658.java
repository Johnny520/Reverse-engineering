package Yue;

import android.os.Environment;
import java.io.File;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4658 {

    /* JADX INFO: renamed from: ۥ */
    @Deprecated
    public static final String f1036 = "unknown";

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠۠$ۥ */
    @InterfaceC7113(21)
    public static class C0464 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static String m1611(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static String m1610(@InterfaceC6391 File file) {
        return C0464.m1611(file);
    }
}
