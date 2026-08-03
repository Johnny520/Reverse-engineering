package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4939 {

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۨ$ۥ, reason: contains not printable characters */
    public static class C4940 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final java.lang.Object f15777 = null;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.lang.reflect.Method f15778;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean f15779;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                Yue.C4939.C4940.f15777 = r0
                return
        }

        public C4940() {
                r0 = this;
                r0.<init>()
                return
        }

        @android.annotation.SuppressLint({"DiscouragedPrivateApi"})
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m19326(int r5) {
                r0 = 1
                java.lang.Object r1 = Yue.C4939.C4940.f15777     // Catch: java.lang.Exception -> L38
                monitor-enter(r1)     // Catch: java.lang.Exception -> L38
                boolean r2 = Yue.C4939.C4940.f15779     // Catch: java.lang.Throwable -> L1b
                if (r2 != 0) goto L1d
                Yue.C4939.C4940.f15779 = r0     // Catch: java.lang.Throwable -> L1b
                java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
                java.lang.String r3 = "isApp"
                java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1b
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L1b
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L1b
                Yue.C4939.C4940.f15778 = r2     // Catch: java.lang.Throwable -> L1b
                goto L1d
            L1b:
                r5 = move-exception
                goto L40
            L1d:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
                java.lang.reflect.Method r1 = Yue.C4939.C4940.f15778     // Catch: java.lang.Exception -> L38
                if (r1 == 0) goto L45
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L38
                java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L38
                r2 = 0
                java.lang.Object r5 = r1.invoke(r2, r5)     // Catch: java.lang.Exception -> L38
                java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L38
                if (r5 == 0) goto L3a
                boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> L38
                return r5
            L38:
                r5 = move-exception
                goto L42
            L3a:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L38
                r5.<init>()     // Catch: java.lang.Exception -> L38
                throw r5     // Catch: java.lang.Exception -> L38
            L40:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
                throw r5     // Catch: java.lang.Exception -> L38
            L42:
                r5.printStackTrace()
            L45:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۨ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C4941 {
        public C4941() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m19327(int r0) {
                boolean r0 = android.os.Process.isApplicationUid(r0)
                return r0
        }
    }

    public C4939() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m19325(int r0) {
            boolean r0 = Yue.C4939.C4941.m19327(r0)
            return r0
    }
}
