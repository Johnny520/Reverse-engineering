package Yue;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: renamed from: Yue.ۥۣۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8146 {

    /* JADX INFO: renamed from: Yue.ۥۣۢۤ$ۥ */
    @InterfaceC7113(24)
    public static class C1440 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m4172(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m4171(@InterfaceC6391 Context context) {
        return C1440.m4172(context);
    }
}
