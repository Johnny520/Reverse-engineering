package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1491 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f4653 = 1;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f4654 = 2;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f4655 = 3;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C1492 {
        public C1492() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m7358(android.net.ConnectivityManager r0) {
                int r0 = r0.getRestrictBackgroundStatus()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۟$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC1493 {
    }

    public C1491() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    @Yue.InterfaceC5344("android.permission.ACCESS_NETWORK_STATE")
    @android.annotation.SuppressLint({"ReferencesDeprecated"})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.net.NetworkInfo m7355(@Yue.InterfaceC4410 android.net.ConnectivityManager r1, @Yue.InterfaceC4410 android.content.Intent r2) {
            java.lang.String r0 = "networkInfo"
            android.os.Parcelable r2 = r2.getParcelableExtra(r0)
            android.net.NetworkInfo r2 = (android.net.NetworkInfo) r2
            if (r2 == 0) goto L13
            int r2 = r2.getType()
            android.net.NetworkInfo r1 = r1.getNetworkInfo(r2)
            return r1
        L13:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m7356(@Yue.InterfaceC4410 android.net.ConnectivityManager r0) {
            int r0 = Yue.C1491.C1492.m7358(r0)
            return r0
    }

    @Yue.InterfaceC5344("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m7357(@Yue.InterfaceC4410 android.net.ConnectivityManager r0) {
            boolean r0 = r0.isActiveNetworkMetered()
            return r0
    }
}
