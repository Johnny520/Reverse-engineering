package Yue;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3366 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f252 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f253 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f5335 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f5336 = 3;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۥۦ$ۥ */
    @InterfaceC7113(23)
    public static class C0120 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static <T> T m449(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static int m450(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m6896(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static String m6897(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۥۦ$ۥ۟ */
    @InterfaceC7113(29)
    public static class C0121 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m451(@InterfaceC6490 AppOpsManager appOpsManager, @InterfaceC6391 String str, int i, @InterfaceC6391 String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        @InterfaceC6391
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static String m452(@InterfaceC6391 Context context) {
            return context.getOpPackageName();
        }

        @InterfaceC4482
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static AppOpsManager m6898(@InterfaceC6391 Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m447(@InterfaceC6391 Context context, int i, @InterfaceC6391 String str, @InterfaceC6391 String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m6894(context, str, str2);
        }
        AppOpsManager appOpsManagerM6898 = C0121.m6898(context);
        int iM451 = C0121.m451(appOpsManagerM6898, str, Binder.getCallingUid(), str2);
        return iM451 != 0 ? iM451 : C0121.m451(appOpsManagerM6898, str, i, C0121.m452(context));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m448(@InterfaceC6391 Context context, @InterfaceC6391 String str, int i, @InterfaceC6391 String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m6892(@InterfaceC6391 Context context, @InterfaceC6391 String str, int i, @InterfaceC6391 String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m6893(@InterfaceC6391 Context context, @InterfaceC6391 String str, @InterfaceC6391 String str2) {
        return C0120.m450((AppOpsManager) C0120.m449(context, AppOpsManager.class), str, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m6894(@InterfaceC6391 Context context, @InterfaceC6391 String str, @InterfaceC6391 String str2) {
        return C0120.m6896((AppOpsManager) C0120.m449(context, AppOpsManager.class), str, str2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static String m6895(@InterfaceC6391 String str) {
        return C0120.m6897(str);
    }
}
