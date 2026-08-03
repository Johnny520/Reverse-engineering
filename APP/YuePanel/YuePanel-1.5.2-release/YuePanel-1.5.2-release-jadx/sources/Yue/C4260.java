package Yue;

import android.database.CursorWindow;
import android.os.Build;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4260 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۨ۟۟$ۥ */
    @InterfaceC7113(28)
    public static class C0372 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static CursorWindow m1225(String str, long j) {
            return new CursorWindow(str, j);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static CursorWindow m1224(@InterfaceC6490 String str, long j) {
        return Build.VERSION.SDK_INT >= 28 ? C0372.m1225(str, j) : new CursorWindow(str);
    }
}
