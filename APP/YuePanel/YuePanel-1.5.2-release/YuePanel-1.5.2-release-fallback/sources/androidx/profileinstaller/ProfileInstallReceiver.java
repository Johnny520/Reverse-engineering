package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final java.lang.String f29455 = "androidx.profileinstaller.action.INSTALL_PROFILE";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final java.lang.String f29456 = "androidx.profileinstaller.action.SAVE_PROFILE";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final java.lang.String f29457 = "androidx.profileinstaller.action.SKIP_FILE";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final java.lang.String f29458 = "androidx.profileinstaller.action.BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final java.lang.String f29459 = "EXTRA_SKIP_FILE_OPERATION";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final java.lang.String f29460 = "WRITE_SKIP_FILE";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final java.lang.String f29461 = "DELETE_SKIP_FILE";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final java.lang.String f29462 = "EXTRA_BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public static final java.lang.String f29463 = "DROP_SHADER_CACHE";

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallReceiver$ۥ, reason: contains not printable characters */
    public class C7645 implements androidx.profileinstaller.C7653.InterfaceC7657 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.profileinstaller.ProfileInstallReceiver f29464;

        public C7645(androidx.profileinstaller.ProfileInstallReceiver r1) {
                r0 = this;
                r0.f29464 = r1
                r0.<init>()
                return
        }

        @Override // androidx.profileinstaller.C7653.InterfaceC7657
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo29519(int r2, @Yue.InterfaceC4544 java.lang.Object r3) {
                r1 = this;
                androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r0 = androidx.profileinstaller.C7653.f29484
                r0.mo29519(r2, r3)
                return
        }

        @Override // androidx.profileinstaller.C7653.InterfaceC7657
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo29520(int r2, @Yue.InterfaceC4544 java.lang.Object r3) {
                r1 = this;
                androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r0 = androidx.profileinstaller.C7653.f29484
                r0.mo29520(r2, r3)
                androidx.profileinstaller.ProfileInstallReceiver r3 = r1.f29464
                r3.setResultCode(r2)
                return
        }
    }

    public ProfileInstallReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m29518(@Yue.InterfaceC4410 androidx.profileinstaller.C7653.InterfaceC7657 r2) {
            int r0 = android.os.Process.myPid()
            r1 = 10
            android.os.Process.sendSignal(r0, r1)
            r0 = 12
            r1 = 0
            r2.mo29520(r0, r1)
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4544 android.content.Intent r4) {
            r2 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r4.getAction()
            java.lang.String r1 = "androidx.profileinstaller.action.INSTALL_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1f
            Yue.ۥۡۥۡۥ r4 = new Yue.ۥۡۥۡۥ
            r4.<init>()
            androidx.profileinstaller.ProfileInstallReceiver$ۥ r0 = new androidx.profileinstaller.ProfileInstallReceiver$ۥ
            r0.<init>(r2)
            r1 = 1
            androidx.profileinstaller.C7653.m29566(r3, r4, r0, r1)
            goto L9b
        L1f:
            java.lang.String r1 = "androidx.profileinstaller.action.SKIP_FILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L5f
            android.os.Bundle r4 = r4.getExtras()
            if (r4 == 0) goto L9b
            java.lang.String r0 = "EXTRA_SKIP_FILE_OPERATION"
            java.lang.String r4 = r4.getString(r0)
            java.lang.String r0 = "WRITE_SKIP_FILE"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L49
            Yue.ۥۡۥۡۥ r4 = new Yue.ۥۡۥۡۥ
            r4.<init>()
            androidx.profileinstaller.ProfileInstallReceiver$ۥ r0 = new androidx.profileinstaller.ProfileInstallReceiver$ۥ
            r0.<init>(r2)
            androidx.profileinstaller.C7653.m29567(r3, r4, r0)
            goto L9b
        L49:
            java.lang.String r0 = "DELETE_SKIP_FILE"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L9b
            Yue.ۥۡۥۡۥ r4 = new Yue.ۥۡۥۡۥ
            r4.<init>()
            androidx.profileinstaller.ProfileInstallReceiver$ۥ r0 = new androidx.profileinstaller.ProfileInstallReceiver$ۥ
            r0.<init>(r2)
            androidx.profileinstaller.C7653.m29556(r3, r4, r0)
            goto L9b
        L5f:
            java.lang.String r1 = "androidx.profileinstaller.action.SAVE_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L70
            androidx.profileinstaller.ProfileInstallReceiver$ۥ r3 = new androidx.profileinstaller.ProfileInstallReceiver$ۥ
            r3.<init>(r2)
            m29518(r3)
            goto L9b
        L70:
            java.lang.String r1 = "androidx.profileinstaller.action.BENCHMARK_OPERATION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9b
            android.os.Bundle r4 = r4.getExtras()
            if (r4 == 0) goto L9b
            java.lang.String r0 = "EXTRA_BENCHMARK_OPERATION"
            java.lang.String r4 = r4.getString(r0)
            androidx.profileinstaller.ProfileInstallReceiver$ۥ r0 = new androidx.profileinstaller.ProfileInstallReceiver$ۥ
            r0.<init>(r2)
            java.lang.String r1 = "DROP_SHADER_CACHE"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L95
            androidx.profileinstaller.C7649.m29536(r3, r0)
            goto L9b
        L95:
            r3 = 16
            r4 = 0
            r0.mo29520(r3, r4)
        L9b:
            return
    }
}
