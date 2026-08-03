package Yue;

import android.annotation.SuppressLint;
import android.os.Message;

/* JADX INFO: renamed from: Yue.ۥۡۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6190 {

    /* JADX INFO: renamed from: ۥ */
    public static boolean f1880 = true;

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean f1881 = true;

    /* JADX INFO: renamed from: Yue.ۥۡۡ۟$ۥ */
    @InterfaceC7113(22)
    public static class C0930 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m2680(Message message) {
            return message.isAsynchronous();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m2681(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ */
    public static boolean m2678(@InterfaceC6391 Message message) {
        return C0930.m2680(message);
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m2679(@InterfaceC6391 Message message, boolean z) {
        C0930.m2681(message, z);
    }
}
