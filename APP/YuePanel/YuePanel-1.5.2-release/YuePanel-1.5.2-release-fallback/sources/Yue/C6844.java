package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6844 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean f23965 = true;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f23966;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f23967;

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C6845 {
        public C6845() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m26533(android.view.ViewGroup r0, int r1) {
                int r0 = r0.getChildDrawingOrder(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m26534(android.view.ViewGroup r0, boolean r1) {
                r0.suppressLayout(r1)
                return
        }
    }

    static {
            return
    }

    public C6844() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m26530(@Yue.InterfaceC4410 android.view.ViewGroup r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            int r4 = Yue.C6844.C6845.m26533(r4, r5)
            return r4
        Lb:
            boolean r0 = Yue.C6844.f23967
            if (r0 != 0) goto L25
            r0 = 1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            java.lang.String r2 = "getChildDrawingOrder"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L23
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r3}     // Catch: java.lang.NoSuchMethodException -> L23
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L23
            Yue.C6844.f23966 = r1     // Catch: java.lang.NoSuchMethodException -> L23
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L23
        L23:
            Yue.C6844.f23967 = r0
        L25:
            java.lang.reflect.Method r0 = Yue.C6844.f23966
            if (r0 == 0) goto L44
            int r1 = r4.getChildCount()     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L44
            java.lang.Object r4 = r0.invoke(r4, r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L44
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L44
            return r4
        L44:
            return r5
    }

    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m26531(@Yue.InterfaceC4410 android.view.ViewGroup r1, boolean r2) {
            boolean r0 = Yue.C6844.f23965
            if (r0 == 0) goto Lb
            Yue.C6844.C6845.m26534(r1, r2)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r1 = 0
            Yue.C6844.f23965 = r1
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m26532(@Yue.InterfaceC4410 android.view.ViewGroup r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            Yue.C6844.C6845.m26534(r2, r3)
            goto Ld
        La:
            m26531(r2, r3)
        Ld:
            return
    }
}
