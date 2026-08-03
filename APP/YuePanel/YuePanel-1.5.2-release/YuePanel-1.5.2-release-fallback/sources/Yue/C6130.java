package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6130 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.reflect.Method f22097;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f22098;

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C6131 {
        public C6131() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC4544
        @android.annotation.SuppressLint({"MissingPermission"})
        @Yue.InterfaceC5344("android.permission.READ_PHONE_STATE")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.String m22997(android.telephony.TelephonyManager r0, int r1) {
                java.lang.String r0 = r0.getDeviceId(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C6132 {
        public C6132() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC4544
        @android.annotation.SuppressLint({"MissingPermission"})
        @Yue.InterfaceC5344("android.permission.READ_PHONE_STATE")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.String m22998(android.telephony.TelephonyManager r0) {
                java.lang.String r0 = r0.getImei()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡ۟ۥ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C6133 {
        public C6133() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m22999(android.telephony.TelephonyManager r0) {
                int r0 = r0.getSubscriptionId()
                return r0
        }
    }

    public C6130() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    @Yue.InterfaceC5344("android.permission.READ_PHONE_STATE")
    @android.annotation.SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m22995(@Yue.InterfaceC4410 android.telephony.TelephonyManager r0) {
            java.lang.String r0 = Yue.C6130.C6132.m22998(r0)
            return r0
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m22996(@Yue.InterfaceC4410 android.telephony.TelephonyManager r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            int r3 = Yue.C6130.C6133.m22999(r3)
            return r3
        Lb:
            java.lang.reflect.Method r0 = Yue.C6130.f22098     // Catch: java.lang.Throwable -> L34
            r1 = 0
            if (r0 != 0) goto L1e
            java.lang.Class<android.telephony.TelephonyManager> r0 = android.telephony.TelephonyManager.class
            java.lang.String r2 = "getSubId"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L34
            Yue.C6130.f22098 = r0     // Catch: java.lang.Throwable -> L34
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L34
        L1e:
            java.lang.reflect.Method r0 = Yue.C6130.f22098     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L34
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L34
            int r0 = r3.intValue()     // Catch: java.lang.Throwable -> L34
            r1 = -1
            if (r0 == r1) goto L34
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L34
            return r3
        L34:
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
    }
}
