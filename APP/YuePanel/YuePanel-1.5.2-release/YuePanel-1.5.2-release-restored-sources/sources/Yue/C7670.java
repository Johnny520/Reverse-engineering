package Yue;

import android.os.Build;
import android.telephony.SubscriptionManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(22)
public class C7670 {

    /* JADX INFO: renamed from: ۥ */
    public static Method f3002;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۤ۠$ۥ */
    @InterfaceC7113(29)
    public static class C1321 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m3776(int i) {
            return SubscriptionManager.getSlotIndex(i);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m3775(int i) {
        if (i == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return C1321.m3776(i);
        }
        try {
            if (f3002 == null) {
                Method declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                f3002 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f3002.invoke(null, Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
