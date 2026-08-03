package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4661 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static final java.lang.String f14834 = "PackageManagerCompat";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String f14835 = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۣ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C4662 {
        public C4662() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m18510(@Yue.InterfaceC4410 android.content.Context r0) {
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                boolean r0 = r0.isAutoRevokeWhitelisted()
                r0 = r0 ^ 1
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۣ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC4663 {
    }

    public C4661() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m18507(@Yue.InterfaceC4410 android.content.pm.PackageManager r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 30
            if (r0 < r3) goto La
            r4 = r2
            goto Lb
        La:
            r4 = r1
        Lb:
            if (r0 >= r3) goto Lf
            r0 = r2
            goto L10
        Lf:
            r0 = r1
        L10:
            java.lang.String r5 = m18508(r5)
            if (r5 == 0) goto L18
            r5 = r2
            goto L19
        L18:
            r5 = r1
        L19:
            if (r4 != 0) goto L1f
            if (r0 == 0) goto L20
            if (r5 == 0) goto L20
        L1f:
            r1 = r2
        L20:
            return r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String m18508(@Yue.InterfaceC4410 android.content.pm.PackageManager r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.AUTO_REVOKE_PERMISSIONS"
            r0.<init>(r1)
            java.lang.String r1 = "package"
            java.lang.String r2 = "com.example"
            r3 = 0
            android.net.Uri r1 = android.net.Uri.fromParts(r1, r2, r3)
            android.content.Intent r0 = r0.setData(r1)
            r1 = 0
            java.util.List r0 = r4.queryIntentActivities(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r2 = "android.permission.PACKAGE_VERIFICATION_AGENT"
            int r2 = r4.checkPermission(r2, r1)
            if (r2 == 0) goto L36
            goto L1d
        L36:
            if (r3 == 0) goto L39
            return r3
        L39:
            r3 = r1
            goto L1d
        L3b:
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> m18509(@Yue.InterfaceC4410 android.content.Context r7) {
            Yue.ۥۡۦۦ۟ r0 = Yue.C5348.m20176()
            boolean r1 = Yue.C6637.m25503(r7)
            java.lang.String r2 = "PackageManagerCompat"
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            if (r1 != 0) goto L1a
            r0.mo459(r3)
            java.lang.String r7 = "User is in locked direct boot mode"
            android.util.Log.e(r2, r7)
            return r0
        L1a:
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            boolean r1 = m18507(r1)
            if (r1 != 0) goto L2d
            r7 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.mo459(r7)
            return r0
        L2d:
            android.content.pm.ApplicationInfo r1 = r7.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            r4 = 30
            if (r1 >= r4) goto L40
            r0.mo459(r3)
            java.lang.String r7 = "Target SDK version below API 30"
            android.util.Log.e(r2, r7)
            return r0
        L40:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 2
            r5 = 4
            r6 = 31
            if (r2 < r6) goto L61
            boolean r7 = Yue.C4661.C4662.m18510(r7)
            if (r7 == 0) goto L59
            if (r1 < r6) goto L51
            r5 = 5
        L51:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r0.mo459(r7)
            goto L60
        L59:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r0.mo459(r7)
        L60:
            return r0
        L61:
            if (r2 != r4) goto L72
            boolean r7 = Yue.C4661.C4662.m18510(r7)
            if (r7 == 0) goto L6a
            r3 = r5
        L6a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r0.mo459(r7)
            return r0
        L72:
            Yue.ۥۣۢۡۢ r1 = new Yue.ۥۣۢۡۢ
            r1.<init>(r7)
            Yue.ۥۣۡۥۢ r7 = new Yue.ۥۣۡۥۢ
            r7.<init>(r1)
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r0.addListener(r7, r2)
            r1.m25408(r0)
            return r0
    }
}
