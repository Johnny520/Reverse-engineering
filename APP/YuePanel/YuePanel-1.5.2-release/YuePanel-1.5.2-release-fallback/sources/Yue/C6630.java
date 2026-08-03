package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6630 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public static java.lang.reflect.Method f23134;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public static java.lang.reflect.Constructor<android.os.UserHandle> f23135;

    /* JADX INFO: renamed from: Yue.ۥۣۣۣۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C6631 {
        private C6631() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.os.UserHandle m25477(int r0) {
                android.os.UserHandle r0 = android.os.UserHandle.getUserHandleForUid(r0)
                return r0
        }
    }

    public C6630() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.reflect.Method m25474() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = Yue.C6630.f23134
            if (r0 != 0) goto L18
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.Class<android.os.UserHandle> r1 = android.os.UserHandle.class
            java.lang.String r2 = "getUserId"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r0)
            Yue.C6630.f23134 = r0
            r1 = 1
            r0.setAccessible(r1)
        L18:
            java.lang.reflect.Method r0 = Yue.C6630.f23134
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.reflect.Constructor<android.os.UserHandle> m25475() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Constructor<android.os.UserHandle> r0 = Yue.C6630.f23135
            if (r0 != 0) goto L16
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.Class<android.os.UserHandle> r1 = android.os.UserHandle.class
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r0)
            Yue.C6630.f23135 = r0
            r1 = 1
            r0.setAccessible(r1)
        L16:
            java.lang.reflect.Constructor<android.os.UserHandle> r0 = Yue.C6630.f23135
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.os.UserHandle m25476(int r0) {
            android.os.UserHandle r0 = Yue.C6630.C6631.m25477(r0)
            return r0
    }
}
