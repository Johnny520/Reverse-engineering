package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6654 {

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۡ$ۥ */
    @InterfaceC7113(28)
    public static class C1046 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m3131(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static int m3132(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۡ$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1047 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۡ$ۥ۟۟, reason: contains not printable characters */
    @SuppressLint({"UniqueConstants"})
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6655 {
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ */
    public static int m3129(@InterfaceC6391 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C1046.m3131(permissionInfo) : permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static int m3130(@InterfaceC6391 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C1046.m3132(permissionInfo) : permissionInfo.protectionLevel & (-16);
    }
}
