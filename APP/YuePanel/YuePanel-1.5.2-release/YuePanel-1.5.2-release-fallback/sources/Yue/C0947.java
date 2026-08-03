package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0947 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.reflect.Method f2714;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f2715;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f2716;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C0948 {
        public C0948() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m5386(android.graphics.Canvas r0) {
                r0.disableZ()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m5387(android.graphics.Canvas r0) {
                r0.enableZ()
                return
        }
    }

    public C0947() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m5385(@Yue.InterfaceC4410 android.graphics.Canvas r4, boolean r5) {
            java.lang.Class<android.graphics.Canvas> r0 = android.graphics.Canvas.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L12
            if (r5 == 0) goto Le
            Yue.C0947.C0948.m5387(r4)
            goto L54
        Le:
            Yue.C0947.C0948.m5386(r4)
            goto L54
        L12:
            r2 = 28
            if (r1 == r2) goto L55
            boolean r1 = Yue.C0947.f2716
            r2 = 0
            if (r1 != 0) goto L34
            r1 = 1
            java.lang.String r3 = "insertReorderBarrier"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r2)     // Catch: java.lang.NoSuchMethodException -> L32
            Yue.C0947.f2714 = r3     // Catch: java.lang.NoSuchMethodException -> L32
            r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L32
            java.lang.String r3 = "insertInorderBarrier"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)     // Catch: java.lang.NoSuchMethodException -> L32
            Yue.C0947.f2715 = r0     // Catch: java.lang.NoSuchMethodException -> L32
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L32
        L32:
            Yue.C0947.f2716 = r1
        L34:
            if (r5 == 0) goto L40
            java.lang.reflect.Method r0 = Yue.C0947.f2714     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L54
            if (r0 == 0) goto L40
            r0.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L54
            goto L40
        L3e:
            r4 = move-exception
            goto L4a
        L40:
            if (r5 != 0) goto L54
            java.lang.reflect.Method r5 = Yue.C0947.f2715     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L54
            if (r5 == 0) goto L54
            r5.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L54
            goto L54
        L4a:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.Throwable r4 = r4.getCause()
            r5.<init>(r4)
            throw r5
        L54:
            return
        L55:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "This method doesn't work on Pie!"
            r4.<init>(r5)
            throw r4
    }
}
