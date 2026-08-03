package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(22)
public class C6042 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.reflect.Method f21842;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۤ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C6043 {
        public C6043() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m22719(int r0) {
                int r0 = android.telephony.SubscriptionManager.getSlotIndex(r0)
                return r0
        }
    }

    public C6042() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m22718(int r4) {
            r0 = -1
            if (r4 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Lf
            int r4 = Yue.C6042.C6043.m22719(r4)
            return r4
        Lf:
            java.lang.reflect.Method r1 = Yue.C6042.f21842     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L27
            java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
            java.lang.String r2 = "getSlotIndex"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L3f
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L3f
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L3f
            Yue.C6042.f21842 = r1     // Catch: java.lang.Throwable -> L3f
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L3f
        L27:
            java.lang.reflect.Method r1 = Yue.C6042.f21842     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L3f
            r2 = 0
            java.lang.Object r4 = r1.invoke(r2, r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L3f
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L3f
            return r4
        L3f:
            return r0
    }
}
