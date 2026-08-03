package Yue;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۡۥ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6801 {

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۨ$ۥ */
    public static class C1087 {

        /* JADX INFO: renamed from: ۥ */
        public static final Object f2332 = new Object();

        /* JADX INFO: renamed from: ۥ۟ */
        public static Method f2333;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean f17683;

        @SuppressLint({"DiscouragedPrivateApi"})
        /* JADX INFO: renamed from: ۥ */
        public static boolean m3268(int i) {
            try {
                synchronized (f2332) {
                    try {
                        if (!f17683) {
                            f17683 = true;
                            f2333 = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                        }
                    } finally {
                    }
                }
                Method method = f2333;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۨ$ۥ۟ */
    @InterfaceC7113(24)
    public static class C1088 {
        /* JADX INFO: renamed from: ۥ */
        public static boolean m3269(int i) {
            return Process.isApplicationUid(i);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m3267(int i) {
        return C1088.m3269(i);
    }
}
