package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1444 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f4542 = 15;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۥۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C1445 {
        public C1445() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.os.Handler m7095(android.os.Looper r0) {
                android.os.Handler r0 = Yue.C1443.m7089(r0)
                return r0
        }
    }

    public C1444() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Thread m7090(java.lang.String r0, java.lang.Runnable r1) {
            java.lang.Thread r0 = m7093(r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.util.concurrent.Executor m7091(@Yue.InterfaceC4410 android.os.Handler r1) {
            java.util.Objects.requireNonNull(r1)
            Yue.ۥ۟ۦۥۢ r0 = new Yue.ۥ۟ۦۥۢ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.util.concurrent.ThreadPoolExecutor m7092(@Yue.InterfaceC4410 java.lang.String r8) {
            Yue.ۥ۟ۦۥۣ r7 = new Yue.ۥ۟ۦۥۣ
            r7.<init>(r8)
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 15
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0 = 1
            r8.allowCoreThreadTimeOut(r0)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Thread m7093(java.lang.String r1, java.lang.Runnable r2) {
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r2, r1)
            r1 = 10
            r0.setPriority(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.os.Handler m7094() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = Yue.C1444.C1445.m7095(r0)
            return r0
        Lf:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            return r0
    }
}
