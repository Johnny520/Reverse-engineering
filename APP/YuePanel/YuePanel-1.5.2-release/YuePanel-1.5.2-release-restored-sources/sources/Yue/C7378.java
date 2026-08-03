package Yue;

import Yue.InterfaceC7144;
import android.app.Notification;
import android.app.Service;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7378 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f2833 = 1;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f2834 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f22278 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f22279 = 255;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f22280 = 1073745919;

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۥ$ۥ */
    @InterfaceC7113(24)
    public static class C1246 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3587(Service service, int i) {
            service.stopForeground(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۥ$ۥ۟ */
    @InterfaceC7113(29)
    public static class C1247 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3588(Service service, int i, Notification notification, int i2) {
            if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & 255);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۥ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(34)
    public static class C7379 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3589(Service service, int i, Notification notification, int i2) {
            if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & C7378.f22280);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۥ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7380 {
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m3585(@InterfaceC6391 Service service, int i, @InterfaceC6391 Notification notification, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            C7379.m3589(service, i, notification, i2);
        } else if (i3 >= 29) {
            C1247.m3588(service, i, notification, i2);
        } else {
            service.startForeground(i, notification);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3586(@InterfaceC6391 Service service, int i) {
        C1246.m3587(service, i);
    }
}
