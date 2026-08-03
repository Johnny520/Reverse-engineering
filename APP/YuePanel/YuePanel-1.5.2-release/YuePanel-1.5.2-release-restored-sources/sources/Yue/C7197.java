package Yue;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;

/* JADX INFO: renamed from: Yue.ۥۡۧۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7197 {

    /* JADX INFO: renamed from: Yue.ۥۡۧۡۥ$ۥ */
    @InterfaceC7113(28)
    public static class C1204 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3491(SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m3490(@InterfaceC6391 SQLiteCursor sQLiteCursor, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1204.m3491(sQLiteCursor, z);
        }
    }
}
