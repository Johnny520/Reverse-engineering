package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3285 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String f10709 = "android.intent.action.CREATE_REMINDER";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f10710 = "android.intent.extra.HTML_TEXT";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f10711 = "android.intent.extra.START_PLAYBACK";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String f10712 = "android.intent.extra.TIME";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f10713 = "android.intent.category.LEANBACK_LAUNCHER";

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۤۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(33)
    public static class C3286 {
        public C3286() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static <T> T[] m13762(@Yue.InterfaceC4410 android.content.Intent r0, @Yue.InterfaceC4544 java.lang.String r1, @Yue.InterfaceC4410 java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.getParcelableArrayExtra(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static <T> java.util.ArrayList<T> m13763(@Yue.InterfaceC4410 android.content.Intent r0, @Yue.InterfaceC4544 java.lang.String r1, @Yue.InterfaceC4410 java.lang.Class<? extends T> r2) {
                java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T> T m13764(@Yue.InterfaceC4410 android.content.Intent r0, @Yue.InterfaceC4544 java.lang.String r1, @Yue.InterfaceC4410 java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.getParcelableExtra(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T extends java.io.Serializable> T m13765(@Yue.InterfaceC4410 android.content.Intent r0, @Yue.InterfaceC4544 java.lang.String r1, @Yue.InterfaceC4410 java.lang.Class<T> r2) {
                java.io.Serializable r0 = r0.getSerializableExtra(r1, r2)
                return r0
        }
    }

    public C3285() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.content.Intent m13756(@Yue.InterfaceC4410 android.content.Context r5, @Yue.InterfaceC4410 java.lang.String r6) {
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            boolean r0 = Yue.C4661.m18507(r0)
            if (r0 == 0) goto L4a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            java.lang.String r3 = "package"
            if (r0 < r1) goto L23
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r5.<init>(r0)
            android.net.Uri r6 = android.net.Uri.fromParts(r3, r6, r2)
            android.content.Intent r5 = r5.setData(r6)
            return r5
        L23:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.AUTO_REVOKE_PERMISSIONS"
            r1.<init>(r4)
            android.net.Uri r6 = android.net.Uri.fromParts(r3, r6, r2)
            android.content.Intent r6 = r1.setData(r6)
            r1 = 30
            if (r0 < r1) goto L37
            return r6
        L37:
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r5 = Yue.C4661.m18508(r5)
            java.lang.Object r5 = Yue.C4868.m19181(r5)
            java.lang.String r5 = (java.lang.String) r5
            android.content.Intent r5 = r6.setPackage(r5)
            return r5
        L4a:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "Unused App Restriction features are not available on this device"
            r5.<init>(r6)
            throw r5
    }

    @Yue.InterfaceC4544
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.os.Parcelable[] m13757(@Yue.InterfaceC4410 android.content.Intent r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4410 java.lang.Class<? extends android.os.Parcelable> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.Object[] r2 = Yue.C3285.C3286.m13762(r2, r3, r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            return r2
        Ld:
            android.os.Parcelable[] r2 = r2.getParcelableArrayExtra(r3)
            return r2
    }

    @Yue.InterfaceC4544
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <T> java.util.ArrayList<T> m13758(@Yue.InterfaceC4410 android.content.Intent r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4410 java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.ArrayList r2 = Yue.C3285.C3286.m13763(r2, r3, r4)
            return r2
        Lb:
            java.util.ArrayList r2 = r2.getParcelableArrayListExtra(r3)
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T> T m13759(@Yue.InterfaceC4410 android.content.Intent r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4410 java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object r2 = Yue.C3285.C3286.m13764(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <T extends java.io.Serializable> T m13760(@Yue.InterfaceC4410 android.content.Intent r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4410 java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.io.Serializable r2 = Yue.C3285.C3286.m13765(r2, r3, r4)
            return r2
        Lb:
            java.io.Serializable r2 = r2.getSerializableExtra(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static android.content.Intent m13761(@Yue.InterfaceC4410 java.lang.String r0, @Yue.InterfaceC4410 java.lang.String r1) {
            android.content.Intent r0 = android.content.Intent.makeMainSelectorActivity(r0, r1)
            return r0
    }
}
