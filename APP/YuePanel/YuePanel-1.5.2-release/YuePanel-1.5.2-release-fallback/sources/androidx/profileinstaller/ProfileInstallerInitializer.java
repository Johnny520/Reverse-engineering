package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements Yue.InterfaceC3247<androidx.profileinstaller.ProfileInstallerInitializer.C7648> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f29465 = 5000;

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(16)
    public static class C7646 {
        public C7646() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m29531(java.lang.Runnable r0, long r1) {
                m29532(r0, r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m29532(java.lang.Runnable r0, long r1) {
                r0.run()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m29533(java.lang.Runnable r2) {
                android.view.Choreographer r0 = android.view.Choreographer.getInstance()
                Yue.ۥۡۥۢ۠ r1 = new Yue.ۥۡۥۢ۠
                r1.<init>(r2)
                r0.postFrameCallback(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C7647 {
        public C7647() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.os.Handler m29534(android.os.Looper r0) {
                android.os.Handler r0 = Yue.C1443.m7089(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$ۥ۟۟, reason: contains not printable characters */
    public static class C7648 {
        public C7648() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ProfileInstallerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m29521(androidx.profileinstaller.ProfileInstallerInitializer r0, android.content.Context r1) {
            r0.m29530(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m29522(android.content.Context r0) {
            m29525(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m29523(android.content.Context r0) {
            m29524(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m29524(android.content.Context r0) {
            m29526(r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m29525(android.content.Context r0) {
            androidx.profileinstaller.C7653.m29564(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m29526(@Yue.InterfaceC4410 android.content.Context r8) {
            java.util.concurrent.ThreadPoolExecutor r7 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r5, r6)
            Yue.ۥۡۥۢ۟ r0 = new Yue.ۥۡۥۢ۟
            r0.<init>(r8)
            r7.execute(r0)
            return
    }

    @Override // Yue.InterfaceC3247
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ androidx.profileinstaller.ProfileInstallerInitializer.C7648 create(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            androidx.profileinstaller.ProfileInstallerInitializer$ۥ۟۟ r1 = r0.m29527(r1)
            return r1
    }

    @Override // Yue.InterfaceC3247
    @Yue.InterfaceC4410
    public java.util.List<java.lang.Class<? extends Yue.InterfaceC3247<?>>> dependencies() {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public androidx.profileinstaller.ProfileInstallerInitializer.C7648 m29527(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            r0.m29528(r1)
            androidx.profileinstaller.ProfileInstallerInitializer$ۥ۟۟ r1 = new androidx.profileinstaller.ProfileInstallerInitializer$ۥ۟۟
            r1.<init>()
            return r1
    }

    @Yue.InterfaceC5336(16)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29528(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            Yue.ۥۡۥۢ r0 = new Yue.ۥۡۥۢ
            r0.<init>(r1, r2)
            androidx.profileinstaller.ProfileInstallerInitializer.C7646.m29533(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m29529(@Yue.InterfaceC4410 android.content.Context r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = androidx.profileinstaller.ProfileInstallerInitializer.C7647.m29534(r0)
            goto L18
        Lf:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
        L18:
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 1
            int r2 = java.lang.Math.max(r2, r3)
            int r1 = r1.nextInt(r2)
            Yue.ۥۡۥۡۨ r2 = new Yue.ۥۡۥۡۨ
            r2.<init>(r6)
            int r1 = r1 + 5000
            long r3 = (long) r1
            r0.postDelayed(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ void m29530(android.content.Context r1) {
            r0 = this;
            r0.m29529(r1)
            return
    }
}
