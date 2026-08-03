package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0125ed<androidx.profileinstaller.d.c> f949a = null;
    public static final java.lang.Object b = null;
    public static androidx.profileinstaller.d.c c;

    public static class a {
        public static android.content.pm.PackageInfo a(android.content.pm.PackageManager r2, android.content.Context r3) {
                java.lang.String r3 = r3.getPackageName()
                r0 = 0
                android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
                return r2
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f950a;
        public final int b;
        public final long c;
        public final long d;

        public b(int r1, int r2, long r3, long r5) {
                r0 = this;
                r0.<init>()
                r0.f950a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r5
                return
        }

        public static androidx.profileinstaller.d.b a(java.io.File r9) {
                java.io.DataInputStream r1 = new java.io.DataInputStream
                java.io.FileInputStream r0 = new java.io.FileInputStream
                r0.<init>(r9)
                r1.<init>(r0)
                androidx.profileinstaller.d$b r2 = new androidx.profileinstaller.d$b     // Catch: java.lang.Throwable -> L23
                int r3 = r1.readInt()     // Catch: java.lang.Throwable -> L23
                int r4 = r1.readInt()     // Catch: java.lang.Throwable -> L23
                long r5 = r1.readLong()     // Catch: java.lang.Throwable -> L23
                long r7 = r1.readLong()     // Catch: java.lang.Throwable -> L23
                r2.<init>(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L23
                r1.close()
                return r2
            L23:
                r0 = move-exception
                r9 = r0
                r1.close()     // Catch: java.lang.Throwable -> L29
                goto L2d
            L29:
                r0 = move-exception
                r9.addSuppressed(r0)
            L2d:
                throw r9
        }

        public final void b(java.io.File r4) {
                r3 = this;
                r4.delete()
                java.io.DataOutputStream r0 = new java.io.DataOutputStream
                java.io.FileOutputStream r1 = new java.io.FileOutputStream
                r1.<init>(r4)
                r0.<init>(r1)
                int r4 = r3.f950a     // Catch: java.lang.Throwable -> L25
                r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
                int r4 = r3.b     // Catch: java.lang.Throwable -> L25
                r0.writeInt(r4)     // Catch: java.lang.Throwable -> L25
                long r1 = r3.c     // Catch: java.lang.Throwable -> L25
                r0.writeLong(r1)     // Catch: java.lang.Throwable -> L25
                long r1 = r3.d     // Catch: java.lang.Throwable -> L25
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

        public final boolean equals(java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                r1 = 0
                if (r7 == 0) goto L2b
                boolean r2 = r7 instanceof androidx.profileinstaller.d.b
                if (r2 != 0) goto Lc
                goto L2b
            Lc:
                androidx.profileinstaller.d$b r7 = (androidx.profileinstaller.d.b) r7
                int r2 = r6.b
                int r3 = r7.b
                if (r2 != r3) goto L2b
                long r2 = r6.c
                long r4 = r7.c
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 != 0) goto L2b
                int r2 = r6.f950a
                int r3 = r7.f950a
                if (r2 != r3) goto L2b
                long r2 = r6.d
                long r4 = r7.d
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 != 0) goto L2b
                return r0
            L2b:
                return r1
        }

        public final int hashCode() {
                r5 = this;
                int r0 = r5.b
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                long r1 = r5.c
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                int r2 = r5.f950a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                long r3 = r5.d
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }
    }

    public static class c {
    }

    static {
            a.ed r0 = new a.ed
            r0.<init>()
            androidx.profileinstaller.d.f949a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.profileinstaller.d.b = r0
            r0 = 0
            androidx.profileinstaller.d.c = r0
            return
    }

    public static long a(android.content.Context r3) {
            android.content.Context r0 = r3.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L15
            android.content.pm.PackageInfo r3 = androidx.profileinstaller.d.a.a(r0, r3)
            long r0 = r3.lastUpdateTime
            return r0
        L15:
            java.lang.String r3 = r3.getPackageName()
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            long r0 = r3.lastUpdateTime
            return r0
    }

    public static androidx.profileinstaller.d.c b() {
            androidx.profileinstaller.d$c r0 = new androidx.profileinstaller.d$c
            r0.<init>()
            androidx.profileinstaller.d.c = r0
            a.ed<androidx.profileinstaller.d$c> r1 = androidx.profileinstaller.d.f949a
            r1.getClass()
            a.A$a r2 = a.A.f
            r3 = 0
            boolean r0 = r2.b(r1, r3, r0)
            if (r0 == 0) goto L18
            a.A.b(r1)
        L18:
            androidx.profileinstaller.d$c r0 = androidx.profileinstaller.d.c
            return r0
    }

    public static void c(android.content.Context r18, boolean r19) {
            if (r19 != 0) goto L8
            androidx.profileinstaller.d$c r0 = androidx.profileinstaller.d.c
            if (r0 == 0) goto L8
            goto Ld3
        L8:
            java.lang.Object r1 = androidx.profileinstaller.d.b
            monitor-enter(r1)
            if (r19 != 0) goto L16
            androidx.profileinstaller.d$c r0 = androidx.profileinstaller.d.c     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            goto Ld4
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L13
            r2 = 30
            if (r0 != r2) goto L21
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L21:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "/data/misc/profiles/ref/"
            java.lang.String r4 = r18.getPackageName()     // Catch: java.lang.Throwable -> L13
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "primary.prof"
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L13
            long r2 = r0.length()     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L13
            r4 = 0
            r5 = 0
            r7 = 1
            if (r0 == 0) goto L47
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L47
            r0 = r7
            goto L48
        L47:
            r0 = r4
        L48:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = "/data/misc/profiles/cur/0/"
            java.lang.String r11 = r18.getPackageName()     // Catch: java.lang.Throwable -> L13
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = "primary.prof"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L13
            long r16 = r8.length()     // Catch: java.lang.Throwable -> L13
            boolean r8 = r8.exists()     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L6a
            int r5 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r5 <= 0) goto L6a
            r5 = r7
            goto L6b
        L6a:
            r5 = r4
        L6b:
            long r14 = a(r18)     // Catch: java.lang.Throwable -> L13 android.content.pm.PackageManager.NameNotFoundException -> Lcf
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r8 = r18.getFilesDir()     // Catch: java.lang.Throwable -> L13
            java.lang.String r9 = "profileInstalled"
            r6.<init>(r8, r9)     // Catch: java.lang.Throwable -> L13
            boolean r8 = r6.exists()     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L8a
            androidx.profileinstaller.d$b r8 = androidx.profileinstaller.d.b.a(r6)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L85
            goto L8b
        L85:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto Ld3
        L8a:
            r8 = 0
        L8b:
            r9 = 2
            if (r8 == 0) goto L9b
            long r10 = r8.c     // Catch: java.lang.Throwable -> L13
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 != 0) goto L9b
            int r10 = r8.b     // Catch: java.lang.Throwable -> L13
            if (r10 != r9) goto L99
            goto L9b
        L99:
            r4 = r10
            goto La2
        L9b:
            if (r0 == 0) goto L9f
            r4 = r7
            goto La2
        L9f:
            if (r5 == 0) goto La2
            r4 = r9
        La2:
            if (r19 == 0) goto La9
            if (r5 == 0) goto La9
            if (r4 == r7) goto La9
            r4 = r9
        La9:
            if (r8 == 0) goto Lb8
            int r0 = r8.b     // Catch: java.lang.Throwable -> L13
            if (r0 != r9) goto Lb8
            if (r4 != r7) goto Lb8
            long r9 = r8.d     // Catch: java.lang.Throwable -> L13
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto Lb8
            r4 = 3
        Lb8:
            r13 = r4
            androidx.profileinstaller.d$b r11 = new androidx.profileinstaller.d$b     // Catch: java.lang.Throwable -> L13
            r12 = 1
            r11.<init>(r12, r13, r14, r16)     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto Lc7
            boolean r0 = r8.equals(r11)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lca
        Lc7:
            r11.b(r6)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> Lca
        Lca:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto Ld3
        Lcf:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
        Ld3:
            return
        Ld4:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }
}
