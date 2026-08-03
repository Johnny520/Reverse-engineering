package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0537 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f1349 = 0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f1350 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f1351 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f1352 = 3;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۥۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C0538 {
        public C0538() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static <T> T m1901(android.content.Context r0, java.lang.Class<T> r1) {
                java.lang.Object r0 = r0.getSystemService(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static int m1902(android.app.AppOpsManager r0, java.lang.String r1, java.lang.String r2) {
                int r0 = r0.noteProxyOp(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m1903(android.app.AppOpsManager r0, java.lang.String r1, java.lang.String r2) {
                int r0 = r0.noteProxyOpNoThrow(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static java.lang.String m1904(java.lang.String r0) {
                java.lang.String r0 = android.app.AppOpsManager.permissionToOp(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۥۦ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C0539 {
        public C0539() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m1905(@Yue.InterfaceC4544 android.app.AppOpsManager r0, @Yue.InterfaceC4410 java.lang.String r1, int r2, @Yue.InterfaceC4410 java.lang.String r3) {
                if (r0 != 0) goto L4
                r0 = 1
                return r0
            L4:
                int r0 = r0.checkOpNoThrow(r1, r2, r3)
                return r0
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.lang.String m1906(@Yue.InterfaceC4410 android.content.Context r0) {
                java.lang.String r0 = r0.getOpPackageName()
                return r0
        }

        @Yue.InterfaceC1947
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.app.AppOpsManager m1907(@Yue.InterfaceC4410 android.content.Context r1) {
                java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
                java.lang.Object r1 = r1.getSystemService(r0)
                android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
                return r1
        }
    }

    public C0537() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m1895(@Yue.InterfaceC4410 android.content.Context r2, int r3, @Yue.InterfaceC4410 java.lang.String r4, @Yue.InterfaceC4410 java.lang.String r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1e
            android.app.AppOpsManager r0 = Yue.C0537.C0539.m1907(r2)
            int r1 = android.os.Binder.getCallingUid()
            int r5 = Yue.C0537.C0539.m1905(r0, r4, r1, r5)
            if (r5 == 0) goto L15
            return r5
        L15:
            java.lang.String r2 = Yue.C0537.C0539.m1906(r2)
            int r2 = Yue.C0537.C0539.m1905(r0, r4, r3, r2)
            return r2
        L1e:
            int r2 = m1899(r2, r4, r5)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m1896(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.lang.String r2, int r3, @Yue.InterfaceC4410 java.lang.String r4) {
            java.lang.String r0 = "appops"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = r1.noteOp(r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m1897(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.lang.String r2, int r3, @Yue.InterfaceC4410 java.lang.String r4) {
            java.lang.String r0 = "appops"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = r1.noteOpNoThrow(r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m1898(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.String r3) {
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r1 = Yue.C0537.C0538.m1901(r1, r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = Yue.C0537.C0538.m1902(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m1899(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.String r3) {
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r1 = Yue.C0537.C0538.m1901(r1, r0)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r1 = Yue.C0537.C0538.m1903(r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.String m1900(@Yue.InterfaceC4410 java.lang.String r0) {
            java.lang.String r0 = Yue.C0537.C0538.m1904(r0)
            return r0
    }
}
