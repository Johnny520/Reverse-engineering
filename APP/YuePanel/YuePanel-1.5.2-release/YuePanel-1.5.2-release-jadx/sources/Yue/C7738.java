package Yue;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7738 {

    /* JADX INFO: renamed from: ۥ */
    public static Method f3054;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Method f3055;

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۥ$ۥ */
    @InterfaceC7113(23)
    public static class C1341 {
        @InterfaceC4482
        @InterfaceC6490
        @SuppressLint({"MissingPermission"})
        @InterfaceC7118("android.permission.READ_PHONE_STATE")
        /* JADX INFO: renamed from: ۥ */
        public static String m3837(TelephonyManager telephonyManager, int i) {
            return telephonyManager.getDeviceId(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۥ$ۥ۟ */
    @InterfaceC7113(26)
    public static class C1342 {
        @InterfaceC4482
        @InterfaceC6490
        @SuppressLint({"MissingPermission"})
        @InterfaceC7118("android.permission.READ_PHONE_STATE")
        /* JADX INFO: renamed from: ۥ */
        public static String m3838(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۥ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C7739 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m3839(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    @InterfaceC6490
    @InterfaceC7118("android.permission.READ_PHONE_STATE")
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: ۥ */
    public static String m3835(@InterfaceC6391 TelephonyManager telephonyManager) {
        return C1342.m3838(telephonyManager);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static int m3836(@InterfaceC6391 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C7739.m3839(telephonyManager);
        }
        try {
            if (f3055 == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", null);
                f3055 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f3055.invoke(telephonyManager, null);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
