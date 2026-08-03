package androidx.profileinstaller;

/* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7659 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f29507 = "/data/misc/profiles/ref/";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f29508 = "/data/misc/profiles/cur/0/";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f29509 = "primary.prof";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f29510 = "profileInstalled";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.C5348<androidx.profileinstaller.C7659.C7662> f29511 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.Object f29512 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f29513 = "ProfileVerifier";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public static androidx.profileinstaller.C7659.C7662 f29514;

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(33)
    public static class C7660 {
        public C7660() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.content.pm.PackageInfo m29573(android.content.pm.PackageManager r2, android.content.Context r3) throws android.content.pm.PackageManager.NameNotFoundException {
                java.lang.String r3 = r3.getPackageName()
                r0 = 0
                android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟۟$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static class C7661 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f29515 = 1;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int f29516;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f29517;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long f29518;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long f29519;

        public C7661(int r1, int r2, long r3, long r5) {
                r0 = this;
                r0.<init>()
                r0.f29516 = r1
                r0.f29517 = r2
                r0.f29518 = r3
                r0.f29519 = r5
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static androidx.profileinstaller.C7659.C7661 m29574(@Yue.InterfaceC4410 java.io.File r9) throws java.io.IOException {
                java.io.DataInputStream r0 = new java.io.DataInputStream
                java.io.FileInputStream r1 = new java.io.FileInputStream
                r1.<init>(r9)
                r0.<init>(r1)
                androidx.profileinstaller.ۥ۟۟۟$ۥ۟ r9 = new androidx.profileinstaller.ۥ۟۟۟$ۥ۟     // Catch: java.lang.Throwable -> L24
                int r3 = r0.readInt()     // Catch: java.lang.Throwable -> L24
                int r4 = r0.readInt()     // Catch: java.lang.Throwable -> L24
                long r5 = r0.readLong()     // Catch: java.lang.Throwable -> L24
                long r7 = r0.readLong()     // Catch: java.lang.Throwable -> L24
                r2 = r9
                r2.<init>(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L24
                r0.close()
                return r9
            L24:
                r9 = move-exception
                r0.close()     // Catch: java.lang.Throwable -> L29
                goto L2d
            L29:
                r0 = move-exception
                r9.addSuppressed(r0)
            L2d:
                throw r9
        }

        public boolean equals(java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                r1 = 0
                if (r7 == 0) goto L2d
                boolean r2 = r7 instanceof androidx.profileinstaller.C7659.C7661
                if (r2 != 0) goto Lc
                goto L2d
            Lc:
                androidx.profileinstaller.ۥ۟۟۟$ۥ۟ r7 = (androidx.profileinstaller.C7659.C7661) r7
                int r2 = r6.f29517
                int r3 = r7.f29517
                if (r2 != r3) goto L2b
                long r2 = r6.f29518
                long r4 = r7.f29518
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto L2b
                int r2 = r6.f29516
                int r3 = r7.f29516
                if (r2 != r3) goto L2b
                long r2 = r6.f29519
                long r4 = r7.f29519
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 != 0) goto L2b
                goto L2c
            L2b:
                r0 = r1
            L2c:
                return r0
            L2d:
                return r1
        }

        public int hashCode() {
                r5 = this;
                int r0 = r5.f29517
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                long r1 = r5.f29518
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                int r2 = r5.f29516
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                long r3 = r5.f29519
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m29575(@Yue.InterfaceC4410 java.io.File r4) throws java.io.IOException {
                r3 = this;
                r4.delete()
                java.io.DataOutputStream r0 = new java.io.DataOutputStream
                java.io.FileOutputStream r1 = new java.io.FileOutputStream
                r1.<init>(r4)
                r0.<init>(r1)
                int r4 = r3.f29516     // Catch: java.lang.Throwable -> L25
                r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
                int r4 = r3.f29517     // Catch: java.lang.Throwable -> L25
                r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
                long r1 = r3.f29518     // Catch: java.lang.Throwable -> L25
                r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
                long r1 = r3.f29519     // Catch: java.lang.Throwable -> L25
                r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
                r0.close()
                return
            L25:
                r4 = move-exception
                r0.close()     // Catch: java.lang.Throwable -> L2a
                goto L2e
            L2a:
                r0 = move-exception
                r4.addSuppressed(r0)
            L2e:
                throw r4
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public static class C7662 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f29520 = 16;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f29521 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f29522 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f29523 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f29524 = 3;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f29525 = 65536;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f29526 = 131072;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f29527 = 196608;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final int f29528 = 262144;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int f29529;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean f29530;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean f29531;

        /* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InterfaceC7663 {
        }

        public C7662(int r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.f29529 = r1
                r0.f29531 = r3
                r0.f29530 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m29576() {
                r1 = this;
                int r0 = r1.f29529
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean m29577() {
                r1 = this;
                boolean r0 = r1.f29531
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m29578() {
                r1 = this;
                boolean r0 = r1.f29530
                return r0
        }
    }

    static {
            Yue.ۥۡۦۦ۟ r0 = Yue.C5348.m20176()
            androidx.profileinstaller.C7659.f29511 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.profileinstaller.C7659.f29512 = r0
            r0 = 0
            androidx.profileinstaller.C7659.f29514 = r0
            return
    }

    public C7659() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static com.google.common.util.concurrent.ListenableFuture<androidx.profileinstaller.C7659.C7662> m29568() {
            Yue.ۥۡۦۦ۟<androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟> r0 = androidx.profileinstaller.C7659.f29511
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static long m29569(android.content.Context r3) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.Context r0 = r3.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L15
            android.content.pm.PackageInfo r3 = androidx.profileinstaller.C7659.C7660.m29573(r0, r3)
            long r0 = r3.lastUpdateTime
            return r0
        L15:
            java.lang.String r3 = r3.getPackageName()
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            long r0 = r3.lastUpdateTime
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static androidx.profileinstaller.C7659.C7662 m29570(int r1, boolean r2, boolean r3) {
            androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟ r0 = new androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟
            r0.<init>(r1, r2, r3)
            androidx.profileinstaller.C7659.f29514 = r0
            Yue.ۥۡۦۦ۟<androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟> r1 = androidx.profileinstaller.C7659.f29511
            r1.mo459(r0)
            androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟ r1 = androidx.profileinstaller.C7659.f29514
            return r1
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC7131
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static androidx.profileinstaller.C7659.C7662 m29571(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = 0
            androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟ r1 = m29572(r1, r0)
            return r1
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC7131
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static androidx.profileinstaller.C7659.C7662 m29572(@Yue.InterfaceC4410 android.content.Context r18, boolean r19) {
            if (r19 != 0) goto L7
            androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟ r0 = androidx.profileinstaller.C7659.f29514
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Object r1 = androidx.profileinstaller.C7659.f29512
            monitor-enter(r1)
            if (r19 != 0) goto L15
            androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟ r0 = androidx.profileinstaller.C7659.f29514     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L15
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r0 = move-exception
            goto Le7
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L12
            r2 = 28
            r3 = 0
            if (r0 < r2) goto Ldf
            r2 = 30
            if (r0 != r2) goto L22
            goto Ldf
        L22:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "/data/misc/profiles/ref/"
            java.lang.String r5 = r18.getPackageName()     // Catch: java.lang.Throwable -> L12
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = "primary.prof"
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L12
            long r4 = r0.length()     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L12
            r6 = 0
            r2 = 1
            if (r0 == 0) goto L47
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L47
            r0 = r2
            goto L48
        L47:
            r0 = r3
        L48:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.lang.String r10 = "/data/misc/profiles/cur/0/"
            java.lang.String r11 = r18.getPackageName()     // Catch: java.lang.Throwable -> L12
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L12
            java.lang.String r10 = "primary.prof"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L12
            long r16 = r8.length()     // Catch: java.lang.Throwable -> L12
            boolean r8 = r8.exists()     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto L6a
            int r6 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r6 <= 0) goto L6a
            r6 = r2
            goto L6b
        L6a:
            r6 = r3
        L6b:
            long r14 = m29569(r18)     // Catch: java.lang.Throwable -> L12 android.content.pm.PackageManager.NameNotFoundException -> Ld7
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.io.File r8 = r18.getFilesDir()     // Catch: java.lang.Throwable -> L12
            java.lang.String r9 = "profileInstalled"
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L12
            boolean r8 = r7.exists()     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto L8d
            androidx.profileinstaller.ۥ۟۟۟$ۥ۟ r8 = androidx.profileinstaller.C7659.C7661.m29574(r7)     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L85
            goto L8e
        L85:
            r2 = 131072(0x20000, float:1.83671E-40)
            androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟ r0 = m29570(r2, r0, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r0
        L8d:
            r8 = 0
        L8e:
            r9 = 2
            if (r8 == 0) goto L9e
            long r10 = r8.f29518     // Catch: java.lang.Throwable -> L12
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 != 0) goto L9e
            int r10 = r8.f29517     // Catch: java.lang.Throwable -> L12
            if (r10 != r9) goto L9c
            goto L9e
        L9c:
            r3 = r10
            goto La5
        L9e:
            if (r0 == 0) goto La2
            r3 = r2
            goto La5
        La2:
            if (r6 == 0) goto La5
            r3 = r9
        La5:
            if (r19 == 0) goto Lac
            if (r6 == 0) goto Lac
            if (r3 == r2) goto Lac
            r3 = r9
        Lac:
            if (r8 == 0) goto Lbb
            int r10 = r8.f29517     // Catch: java.lang.Throwable -> L12
            if (r10 != r9) goto Lbb
            if (r3 != r2) goto Lbb
            long r9 = r8.f29519     // Catch: java.lang.Throwable -> L12
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 >= 0) goto Lbb
            r3 = 3
        Lbb:
            androidx.profileinstaller.ۥ۟۟۟$ۥ۟ r2 = new androidx.profileinstaller.ۥ۟۟۟$ۥ۟     // Catch: java.lang.Throwable -> L12
            r12 = 1
            r11 = r2
            r13 = r3
            r11.<init>(r12, r13, r14, r16)     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto Lcb
            boolean r4 = r8.equals(r2)     // Catch: java.lang.Throwable -> L12
            if (r4 != 0) goto Ld1
        Lcb:
            r2.m29575(r7)     // Catch: java.lang.Throwable -> L12 java.io.IOException -> Lcf
            goto Ld1
        Lcf:
            r3 = 196608(0x30000, float:2.75506E-40)
        Ld1:
            androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟ r0 = m29570(r3, r0, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r0
        Ld7:
            r2 = 65536(0x10000, float:9.1835E-41)
            androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟ r0 = m29570(r2, r0, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r0
        Ldf:
            r0 = 262144(0x40000, float:3.67342E-40)
            androidx.profileinstaller.ۥ۟۟۟$ۥ۟۟ r0 = m29570(r0, r3, r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r0
        Le7:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }
}
