package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛱᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0007 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0564 f148 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0547 f149 = null;

    static {
            xhss.ᛶᛲᛷᛵ r0 = new xhss.ᛶᛲᛷᛵ
            java.lang.String r1 = "RESUME_TOKEN"
            r2 = 2
            r0.<init>(r1, r2)
            xhss.AbstractC0007.f149 = r0
            xhss.ᛶᛵᲇᛸ r0 = new xhss.ᛶᛵᲇᛸ
            r1 = 13
            r0.<init>(r1)
            xhss.AbstractC0007.f148 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final java.lang.Object m94(xhss.C0141[] r8, xhss.C0421 r9) {
            int r0 = r8.length
            if (r0 != 0) goto L6
            xhss.ᛵᛷᛶᛱ r8 = xhss.C0492.f1802
            return r8
        L6:
            xhss.ᛸᛱᛶᛲ r0 = new xhss.ᛸᛱᛶᛲ
            r0.<init>(r8)
            xhss.ᛲᛶᛳᲁ r1 = new xhss.ᛲᛶᛳᲁ
            xhss.ᛱᛴᛶᛴ r9 = xhss.AbstractC0561.m1021(r9)
            r1.<init>(r9)
            xhss.ᛱᛲᲁᲇ r9 = r1.m415()
            if (r9 != 0) goto L1b
            goto L31
        L1b:
            sun.misc.Unsafe r2 = xhss.AbstractC1067.f3442
            long r3 = xhss.C0172.f687
            java.lang.Object r3 = r2.getObjectVolatile(r1, r3)
            boolean r3 = r3 instanceof xhss.InterfaceC0214
            if (r3 != 0) goto L31
            r9.mo125()
            xhss.ᛵᛵᲇᛳ r9 = xhss.C0475.f1712
            long r3 = xhss.C0172.f688
            r2.putObjectVolatile(r1, r3, r9)
        L31:
            int r9 = r8.length
            xhss.ᛳᛳᲈᲈ[] r2 = new xhss.C0257[r9]
            r3 = 0
            r4 = r3
        L36:
            if (r4 >= r9) goto L4e
            r5 = r8[r4]
            r5.m1337()
            xhss.ᛳᛳᲈᲈ r6 = new xhss.ᛳᛳᲈᲈ
            r6.<init>(r0, r1)
            r7 = 1
            xhss.ᛱᛲᲁᲇ r5 = xhss.AbstractC0473.m862(r5, r7, r6)
            r6.f949 = r5
            r2[r4] = r6
            int r4 = r4 + 1
            goto L36
        L4e:
            xhss.ᛷᲁᛸᲀ r8 = new xhss.ᛷᲁᛸᲀ
            r8.<init>(r2)
        L53:
            if (r3 >= r9) goto L64
            r0 = r2[r3]
            r0.getClass()
            sun.misc.Unsafe r4 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0257.f947
            r4.putObjectVolatile(r0, r5, r8)
            int r3 = r3 + 1
            goto L53
        L64:
            sun.misc.Unsafe r9 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0172.f687
            java.lang.Object r9 = r9.getObjectVolatile(r1, r2)
            boolean r9 = r9 instanceof xhss.InterfaceC0214
            if (r9 != 0) goto L74
            r8.m1226()
            goto L77
        L74:
            xhss.AbstractC0060.m186(r1, r8)
        L77:
            java.lang.Object r8 = r1.m424()
            return r8
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static java.lang.String m95(xhss.C0289 r19, xhss.C0289[] r20, int r21) {
            r0 = r19
            r1 = r20
            int r2 = r0.mo611()
            r4 = 0
        L9:
            if (r4 >= r2) goto La2
            int r5 = r4 + r2
            int r5 = r5 / 2
        Lf:
            r6 = 10
            r7 = -1
            if (r5 <= r7) goto L1d
            byte r8 = r0.mo616(r5)
            if (r8 == r6) goto L1d
            int r5 = r5 + (-1)
            goto Lf
        L1d:
            int r8 = r5 + 1
            r9 = 1
            r10 = r9
        L21:
            int r11 = r8 + r10
            byte r12 = r0.mo616(r11)
            if (r12 == r6) goto L2c
            int r10 = r10 + 1
            goto L21
        L2c:
            int r6 = r11 - r8
            r12 = r21
            r10 = 0
            r13 = 0
            r14 = 0
        L33:
            if (r10 == 0) goto L39
            r10 = 46
            r15 = 0
            goto L48
        L39:
            r15 = r1[r12]
            byte r15 = r15.mo616(r13)
            byte[] r16 = xhss.AbstractC0577.f2010
            r15 = r15 & 255(0xff, float:3.57E-43)
            r18 = r15
            r15 = r10
            r10 = r18
        L48:
            int r3 = r8 + r14
            byte r3 = r0.mo616(r3)
            byte[] r17 = xhss.AbstractC0577.f2010
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r10 = r10 - r3
            if (r10 != 0) goto L6f
            int r14 = r14 + 1
            int r13 = r13 + 1
            if (r14 == r6) goto L6f
            r3 = r1[r12]
            int r3 = r3.mo611()
            if (r3 != r13) goto L6d
            int r3 = r1.length
            int r3 = r3 - r9
            if (r12 != r3) goto L68
            goto L6f
        L68:
            int r12 = r12 + 1
            r13 = r7
            r10 = r9
            goto L33
        L6d:
            r10 = r15
            goto L33
        L6f:
            if (r10 >= 0) goto L73
        L71:
            r2 = r5
            goto L9
        L73:
            if (r10 <= 0) goto L78
        L75:
            int r4 = r11 + 1
            goto L9
        L78:
            int r3 = r6 - r14
            r7 = r1[r12]
            int r7 = r7.mo611()
            int r7 = r7 - r13
            int r12 = r12 + 1
            int r9 = r1.length
        L84:
            if (r12 >= r9) goto L90
            r10 = r1[r12]
            int r10 = r10.mo611()
            int r7 = r7 + r10
            int r12 = r12 + 1
            goto L84
        L90:
            if (r7 >= r3) goto L93
            goto L71
        L93:
            if (r7 <= r3) goto L96
            goto L75
        L96:
            int r6 = r6 + r8
            xhss.ᛳᛶᲈᲈ r0 = r0.mo613(r8, r6)
            java.nio.charset.Charset r1 = xhss.AbstractC0619.f2136
            java.lang.String r0 = r0.mo615(r1)
            return r0
        La2:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static xhss.C1062 m96(org.luckypray.dexkit.DexKitBridge r16, xhss.C0320 r17) {
            r0 = r17
            r1 = 4
            int r1 = r0.m654(r1)
            r2 = 0
            if (r1 == 0) goto L15
            java.nio.ByteBuffer r3 = r0.f1202
            int r4 = r0.f1205
            int r1 = r1 + r4
            int r1 = r3.getInt(r1)
            r5 = r1
            goto L16
        L15:
            r5 = r2
        L16:
            r1 = 6
            int r1 = r0.m654(r1)
            if (r1 == 0) goto L28
            java.nio.ByteBuffer r3 = r0.f1202
            int r4 = r0.f1205
            int r1 = r1 + r4
            int r1 = r3.getInt(r1)
            r6 = r1
            goto L29
        L28:
            r6 = r2
        L29:
            r1 = 8
            int r1 = r0.m654(r1)
            if (r1 == 0) goto L37
            int r3 = r0.f1205
            int r1 = r1 + r3
            r0.m660(r1)
        L37:
            r1 = 10
            int r1 = r0.m654(r1)
            if (r1 == 0) goto L4a
            java.nio.ByteBuffer r3 = r0.f1202
            int r4 = r0.f1205
            int r1 = r1 + r4
            int r1 = r3.getInt(r1)
            r7 = r1
            goto L4b
        L4a:
            r7 = r2
        L4b:
            r1 = 12
            int r1 = r0.m654(r1)
            r3 = 0
            if (r1 == 0) goto L5c
            int r4 = r0.f1205
            int r1 = r1 + r4
            java.lang.String r1 = r0.m660(r1)
            goto L5d
        L5c:
            r1 = r3
        L5d:
            if (r1 != 0) goto L61
            java.lang.String r1 = ""
        L61:
            r8 = r1
            r1 = 14
            int r1 = r0.m654(r1)
            if (r1 == 0) goto L74
            java.nio.ByteBuffer r4 = r0.f1202
            int r9 = r0.f1205
            int r1 = r1 + r9
            int r1 = r4.getInt(r1)
            goto L75
        L74:
            r1 = r2
        L75:
            r4 = -1
            if (r1 != r4) goto L7a
        L78:
            r9 = r3
            goto L7f
        L7a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            goto L78
        L7f:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r1 = 16
            int r3 = r0.m654(r1)
            if (r3 == 0) goto L91
            int r3 = r0.m661(r3)
            goto L92
        L91:
            r3 = r2
        L92:
            r4 = r2
        L93:
            if (r4 >= r3) goto Lb4
            int r11 = r0.m654(r1)
            if (r11 == 0) goto La9
            java.nio.ByteBuffer r12 = r0.f1202
            int r11 = r0.m656(r11)
            int r13 = r4 * 4
            int r13 = r13 + r11
            int r11 = r12.getInt(r13)
            goto Laa
        La9:
            r11 = r2
        Laa:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.add(r11)
            int r4 = r4 + 1
            goto L93
        Lb4:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 18
            int r3 = r0.m654(r1)
            if (r3 == 0) goto Lc6
            int r3 = r0.m661(r3)
            goto Lc7
        Lc6:
            r3 = r2
        Lc7:
            r4 = r2
        Lc8:
            if (r4 >= r3) goto Le9
            int r12 = r0.m654(r1)
            if (r12 == 0) goto Lde
            java.nio.ByteBuffer r13 = r0.f1202
            int r12 = r0.m656(r12)
            int r14 = r4 * 4
            int r14 = r14 + r12
            int r12 = r13.getInt(r14)
            goto Ldf
        Lde:
            r12 = r2
        Ldf:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.add(r12)
            int r4 = r4 + 1
            goto Lc8
        Le9:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r1 = 20
            int r3 = r0.m654(r1)
            if (r3 == 0) goto Lfb
            int r3 = r0.m661(r3)
            goto Lfc
        Lfb:
            r3 = r2
        Lfc:
            r4 = r2
        Lfd:
            if (r4 >= r3) goto L11e
            int r13 = r0.m654(r1)
            if (r13 == 0) goto L113
            java.nio.ByteBuffer r14 = r0.f1202
            int r13 = r0.m656(r13)
            int r15 = r4 * 4
            int r15 = r15 + r13
            int r13 = r14.getInt(r15)
            goto L114
        L113:
            r13 = r2
        L114:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.add(r13)
            int r4 = r4 + 1
            goto Lfd
        L11e:
            xhss.ᲇᛸᛳᛸ r3 = new xhss.ᲇᛸᛳᛸ
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static boolean m97(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static final xhss.C0871 m98(xhss.C0871 r5) {
            xhss.ᛳᛵᛴ r0 = r5.m1442()
            xhss.ᛵᛷᲀᛱ r1 = new xhss.ᛵᛷᲀᛱ
            xhss.ᲇᛷᛱᛸ r5 = r5.f2816
            xhss.ᛱᛴᛲᛴ r2 = r5.mo721()
            long r3 = r5.mo719()
            r1.<init>(r2, r3)
            r0.f1030 = r1
            xhss.ᲀᛶᛷᲁ r5 = r0.m588()
            return r5
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static void m99(android.content.Context r18, java.util.concurrent.Executor r19, xhss.InterfaceC0825 r20, boolean r21) {
            r1 = r18
            r5 = r20
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 7
            r9 = 0
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r2, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L262
            java.io.File r11 = r1.getFilesDir()
            r12 = 0
            if (r21 != 0) goto L78
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r11, r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L3f
        L3d:
            r0 = r9
            goto L6d
        L3f:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3d
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3d
            r7.<init>(r0)     // Catch: java.io.IOException -> L3d
            r3.<init>(r7)     // Catch: java.io.IOException -> L3d
            long r14 = r3.readLong()     // Catch: java.lang.Throwable -> L62
            r3.close()     // Catch: java.io.IOException -> L3d
            r16 = r14
            long r13 = r10.lastUpdateTime
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L5a
            r0 = 1
            goto L5b
        L5a:
            r0 = r9
        L5b:
            if (r0 == 0) goto L6d
            r3 = 2
            r5.mo1032(r3, r12)
            goto L6d
        L62:
            r0 = move-exception
            r7 = r0
            r3.close()     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.io.IOException -> L3d
        L6c:
            throw r7     // Catch: java.io.IOException -> L3d
        L6d:
            if (r0 != 0) goto L70
            goto L78
        L70:
            r1.getPackageName()
            xhss.AbstractC0999.m1638(r1, r9)
            goto L261
        L78:
            r1.getPackageName()
            byte[] r13 = xhss.AbstractC0561.f1985
            java.io.File r7 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r0.<init>(r3, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r0, r2)
            xhss.ᛴᲈᛴᛲ r2 = new xhss.ᛴᲈᛴᛲ
            java.lang.String r0 = "dexopt/baseline.prof"
            r3 = r4
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            byte[] r4 = r2.f1507
            if (r4 != 0) goto La6
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 3
            r2.m815(r3, r0)
        La3:
            r6 = 1
            goto L256
        La6:
            boolean r6 = r7.exists()
            r14 = 4
            if (r6 == 0) goto Lb9
            boolean r6 = r7.canWrite()
            if (r6 != 0) goto Lb7
            r2.m815(r14, r12)
            goto La3
        Lb7:
            r6 = 1
            goto Lbd
        Lb9:
            r7.createNewFile()     // Catch: java.io.IOException -> L252
            goto Lb7
        Lbd:
            r2.f1513 = r6
            r6 = 6
            java.io.FileInputStream r0 = r2.m816(r3, r0)     // Catch: java.io.IOException -> Lc6 java.io.FileNotFoundException -> Lcb
            r7 = r0
            goto Ld0
        Lc6:
            r0 = move-exception
            r5.mo1032(r8, r0)
            goto Lcf
        Lcb:
            r0 = move-exception
            r5.mo1032(r6, r0)
        Lcf:
            r7 = r12
        Ld0:
            java.lang.String r15 = "Invalid magic"
            r6 = 8
            if (r7 == 0) goto L11d
            byte[] r0 = xhss.AbstractC0775.m1316(r7, r14)     // Catch: java.lang.Throwable -> Lf3 java.lang.IllegalStateException -> Lf6 java.io.IOException -> Lf8
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch: java.lang.Throwable -> Lf3 java.lang.IllegalStateException -> Lf6 java.io.IOException -> Lf8
            if (r0 == 0) goto Lfa
            byte[] r0 = xhss.AbstractC0775.m1316(r7, r14)     // Catch: java.lang.Throwable -> Lf3 java.lang.IllegalStateException -> Lf6 java.io.IOException -> Lf8
            java.lang.String r9 = r2.f1508     // Catch: java.lang.Throwable -> Lf3 java.lang.IllegalStateException -> Lf6 java.io.IOException -> Lf8
            xhss.ᛶᲇᲈᛴ[] r9 = xhss.AbstractC0561.m1016(r7, r0, r9)     // Catch: java.lang.Throwable -> Lf3 java.lang.IllegalStateException -> Lf6 java.io.IOException -> Lf8
            r7.close()     // Catch: java.io.IOException -> Lee
            goto L111
        Lee:
            r0 = move-exception
            r5.mo1032(r8, r0)
            goto L111
        Lf3:
            r0 = move-exception
            r1 = r0
            goto L114
        Lf6:
            r0 = move-exception
            goto L100
        Lf8:
            r0 = move-exception
            goto L10c
        Lfa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf3 java.lang.IllegalStateException -> Lf6 java.io.IOException -> Lf8
            r0.<init>(r15)     // Catch: java.lang.Throwable -> Lf3 java.lang.IllegalStateException -> Lf6 java.io.IOException -> Lf8
            throw r0     // Catch: java.lang.Throwable -> Lf3 java.lang.IllegalStateException -> Lf6 java.io.IOException -> Lf8
        L100:
            r5.mo1032(r6, r0)     // Catch: java.lang.Throwable -> Lf3
        L103:
            r7.close()     // Catch: java.io.IOException -> L107
            goto L110
        L107:
            r0 = move-exception
            r5.mo1032(r8, r0)
            goto L110
        L10c:
            r5.mo1032(r8, r0)     // Catch: java.lang.Throwable -> Lf3
            goto L103
        L110:
            r9 = r12
        L111:
            r2.f1511 = r9
            goto L11d
        L114:
            r7.close()     // Catch: java.io.IOException -> L118
            goto L11c
        L118:
            r0 = move-exception
            r5.mo1032(r8, r0)
        L11c:
            throw r1
        L11d:
            xhss.ᛶᲇᲈᛴ[] r0 = r2.f1511
            if (r0 == 0) goto L180
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 34
            if (r7 <= r9) goto L128
            goto L180
        L128:
            switch(r7) {
                case 31: goto L12c;
                case 32: goto L12c;
                case 33: goto L12c;
                case 34: goto L12c;
                default: goto L12b;
            }
        L12b:
            goto L180
        L12c:
            java.lang.String r7 = "dexopt/baseline.profm"
            java.io.FileInputStream r3 = r2.m816(r3, r7)     // Catch: java.lang.IllegalStateException -> L14f java.io.IOException -> L151 java.io.FileNotFoundException -> L153
            if (r3 == 0) goto L167
            byte[] r7 = xhss.AbstractC0561.f1986     // Catch: java.lang.Throwable -> L155
            byte[] r9 = xhss.AbstractC0775.m1316(r3, r14)     // Catch: java.lang.Throwable -> L155
            boolean r7 = java.util.Arrays.equals(r7, r9)     // Catch: java.lang.Throwable -> L155
            if (r7 == 0) goto L158
            byte[] r7 = xhss.AbstractC0775.m1316(r3, r14)     // Catch: java.lang.Throwable -> L155
            xhss.ᛶᲇᲈᛴ[] r0 = xhss.AbstractC0561.m1010(r3, r7, r4, r0)     // Catch: java.lang.Throwable -> L155
            r2.f1511 = r0     // Catch: java.lang.Throwable -> L155
            r3.close()     // Catch: java.lang.IllegalStateException -> L14f java.io.IOException -> L151 java.io.FileNotFoundException -> L153
            r0 = r2
            goto L17d
        L14f:
            r0 = move-exception
            goto L16d
        L151:
            r0 = move-exception
            goto L173
        L153:
            r0 = move-exception
            goto L177
        L155:
            r0 = move-exception
            r4 = r0
            goto L15e
        L158:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L155
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L155
            throw r0     // Catch: java.lang.Throwable -> L155
        L15e:
            r3.close()     // Catch: java.lang.Throwable -> L162
            goto L166
        L162:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L14f java.io.IOException -> L151 java.io.FileNotFoundException -> L153
        L166:
            throw r4     // Catch: java.lang.IllegalStateException -> L14f java.io.IOException -> L151 java.io.FileNotFoundException -> L153
        L167:
            if (r3 == 0) goto L17c
            r3.close()     // Catch: java.lang.IllegalStateException -> L14f java.io.IOException -> L151 java.io.FileNotFoundException -> L153
            goto L17c
        L16d:
            r2.f1511 = r12
            r5.mo1032(r6, r0)
            goto L17c
        L173:
            r5.mo1032(r8, r0)
            goto L17c
        L177:
            r3 = 9
            r5.mo1032(r3, r0)
        L17c:
            r0 = r12
        L17d:
            if (r0 == 0) goto L180
            r2 = r0
        L180:
            xhss.ᛸᲈᛷ r3 = r2.f1506
            xhss.ᛶᲇᲈᛴ[] r0 = r2.f1511
            byte[] r4 = r2.f1507
            java.lang.String r5 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L1d4
            if (r4 != 0) goto L18d
            goto L1d4
        L18d:
            boolean r7 = r2.f1513
            if (r7 == 0) goto L1d0
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.IllegalStateException -> L1ac java.io.IOException -> L1ae
            r7.<init>()     // Catch: java.lang.IllegalStateException -> L1ac java.io.IOException -> L1ae
            r7.write(r13)     // Catch: java.lang.Throwable -> L1b0
            r7.write(r4)     // Catch: java.lang.Throwable -> L1b0
            boolean r0 = xhss.AbstractC0561.m1000(r7, r4, r0)     // Catch: java.lang.Throwable -> L1b0
            if (r0 != 0) goto L1b3
            r0 = 5
            r3.mo1032(r0, r12)     // Catch: java.lang.Throwable -> L1b0
            r2.f1511 = r12     // Catch: java.lang.Throwable -> L1b0
            r7.close()     // Catch: java.lang.IllegalStateException -> L1ac java.io.IOException -> L1ae
            goto L1d4
        L1ac:
            r0 = move-exception
            goto L1c6
        L1ae:
            r0 = move-exception
            goto L1ca
        L1b0:
            r0 = move-exception
            r4 = r0
            goto L1bd
        L1b3:
            byte[] r0 = r7.toByteArray()     // Catch: java.lang.Throwable -> L1b0
            r2.f1510 = r0     // Catch: java.lang.Throwable -> L1b0
            r7.close()     // Catch: java.lang.IllegalStateException -> L1ac java.io.IOException -> L1ae
            goto L1cd
        L1bd:
            r7.close()     // Catch: java.lang.Throwable -> L1c1
            goto L1c5
        L1c1:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L1ac java.io.IOException -> L1ae
        L1c5:
            throw r4     // Catch: java.lang.IllegalStateException -> L1ac java.io.IOException -> L1ae
        L1c6:
            r3.mo1032(r6, r0)
            goto L1cd
        L1ca:
            r3.mo1032(r8, r0)
        L1cd:
            r2.f1511 = r12
            goto L1d4
        L1d0:
            xhss.C0532.m950(r5)
            return
        L1d4:
            byte[] r0 = r2.f1510
            if (r0 != 0) goto L1dc
            r0 = 0
            r6 = 1
            goto L243
        L1dc:
            boolean r3 = r2.f1513
            if (r3 == 0) goto L24e
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L20b java.io.IOException -> L230 java.io.FileNotFoundException -> L233
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L20b java.io.IOException -> L230 java.io.FileNotFoundException -> L233
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L224
            java.io.File r0 = r2.f1512     // Catch: java.lang.Throwable -> L224
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L224
            r0 = 512(0x200, float:7.17E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L218
        L1f0:
            int r5 = r3.read(r0)     // Catch: java.lang.Throwable -> L218
            if (r5 <= 0) goto L1fb
            r6 = 0
            r4.write(r0, r6, r5)     // Catch: java.lang.Throwable -> L218
            goto L1f0
        L1fb:
            r6 = 1
            r2.m815(r6, r12)     // Catch: java.lang.Throwable -> L215
            r4.close()     // Catch: java.lang.Throwable -> L212
            r3.close()     // Catch: java.lang.Throwable -> L20b java.io.IOException -> L20d java.io.FileNotFoundException -> L20f
            r2.f1510 = r12
            r2.f1511 = r12
            r0 = r6
            goto L243
        L20b:
            r0 = move-exception
            goto L249
        L20d:
            r0 = move-exception
            goto L236
        L20f:
            r0 = move-exception
        L210:
            r3 = 6
            goto L23e
        L212:
            r0 = move-exception
        L213:
            r4 = r0
            goto L227
        L215:
            r0 = move-exception
        L216:
            r5 = r0
            goto L21b
        L218:
            r0 = move-exception
            r6 = 1
            goto L216
        L21b:
            r4.close()     // Catch: java.lang.Throwable -> L21f
            goto L223
        L21f:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L212
        L223:
            throw r5     // Catch: java.lang.Throwable -> L212
        L224:
            r0 = move-exception
            r6 = 1
            goto L213
        L227:
            r3.close()     // Catch: java.lang.Throwable -> L22b
            goto L22f
        L22b:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L20b java.io.IOException -> L20d java.io.FileNotFoundException -> L20f
        L22f:
            throw r4     // Catch: java.lang.Throwable -> L20b java.io.IOException -> L20d java.io.FileNotFoundException -> L20f
        L230:
            r0 = move-exception
            r6 = 1
            goto L236
        L233:
            r0 = move-exception
            r6 = 1
            goto L210
        L236:
            r2.m815(r8, r0)     // Catch: java.lang.Throwable -> L20b
        L239:
            r2.f1510 = r12
            r2.f1511 = r12
            goto L242
        L23e:
            r2.m815(r3, r0)     // Catch: java.lang.Throwable -> L20b
            goto L239
        L242:
            r0 = 0
        L243:
            if (r0 == 0) goto L257
            m101(r10, r11)
            goto L257
        L249:
            r2.f1510 = r12
            r2.f1511 = r12
            throw r0
        L24e:
            xhss.C0532.m950(r5)
            return
        L252:
            r6 = 1
            r2.m815(r14, r12)
        L256:
            r0 = 0
        L257:
            if (r0 == 0) goto L25d
            if (r21 == 0) goto L25d
            r9 = r6
            goto L25e
        L25d:
            r9 = 0
        L25e:
            xhss.AbstractC0999.m1638(r1, r9)
        L261:
            return
        L262:
            r0 = move-exception
            r5.mo1032(r8, r0)
            r6 = 0
            xhss.AbstractC0999.m1638(r1, r6)
            return
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static xhss.AbstractC0495 m100(xhss.C0385 r2) {
            r2.m762()     // Catch: java.lang.NumberFormatException -> L10 java.io.IOException -> L17 xhss.C1198 -> L1e java.io.EOFException -> L25
            r0 = 0
            xhss.ᛲᲁᛸᛴ r1 = xhss.C0208.f775     // Catch: java.io.EOFException -> Le java.lang.NumberFormatException -> L10 java.io.IOException -> L17 xhss.C1198 -> L1e
            r1.getClass()     // Catch: java.io.EOFException -> Le java.lang.NumberFormatException -> L10 java.io.IOException -> L17 xhss.C1198 -> L1e
            xhss.ᛵᛷᛸᛶ r2 = xhss.C0208.m473(r2)     // Catch: java.io.EOFException -> Le java.lang.NumberFormatException -> L10 java.io.IOException -> L17 xhss.C1198 -> L1e
            return r2
        Le:
            r2 = move-exception
            goto L27
        L10:
            r2 = move-exception
            xhss.ᛱᲈᛲᛷ r0 = new xhss.ᛱᲈᛲᛷ
            r0.<init>(r2)
            throw r0
        L17:
            r2 = move-exception
            xhss.ᛱᲈᛲᛷ r0 = new xhss.ᛱᲈᛲᛷ
            r0.<init>(r2)
            throw r0
        L1e:
            r2 = move-exception
            xhss.ᛱᲈᛲᛷ r0 = new xhss.ᛱᲈᛲᛷ
            r0.<init>(r2)
            throw r0
        L25:
            r2 = move-exception
            r0 = 1
        L27:
            if (r0 == 0) goto L2c
            xhss.ᲇᛳᛷᛳ r2 = xhss.C1023.f3322
            return r2
        L2c:
            xhss.ᛱᲈᛲᛷ r0 = new xhss.ᛱᲈᛲᛷ
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static void m101(android.content.pm.PackageInfo r2, java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r3, r1)
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch: java.io.IOException -> L24
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L24
            r1.<init>(r0)     // Catch: java.io.IOException -> L24
            r3.<init>(r1)     // Catch: java.io.IOException -> L24
            long r0 = r2.lastUpdateTime     // Catch: java.lang.Throwable -> L1a
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L1a
            r3.close()     // Catch: java.io.IOException -> L24
            return
        L1a:
            r2 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L24
        L23:
            throw r2     // Catch: java.io.IOException -> L24
        L24:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static int m102(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            return r0
        L4:
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static xhss.C0034 m103(java.lang.String r10) {
            xhss.ᛲᛳᛴᲁ r0 = xhss.C0034.f219
            r1 = 0
            xhss.ᛷᛱᛳᲁ r0 = r0.m375(r10, r1)
            r2 = 34
            if (r0 == 0) goto L117
            java.lang.Object r3 = r0.f2152
            xhss.ᛲᛶᛸᛵ r3 = (xhss.C0176) r3
            if (r3 != 0) goto L18
            xhss.ᛲᛶᛸᛵ r3 = new xhss.ᛲᛶᛸᛵ
            r3.<init>(r0)
            r0.f2152 = r3
        L18:
            r4 = 1
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r5 = java.util.Locale.ROOT
            r3.toLowerCase(r5)
            java.lang.Object r3 = r0.f2152
            xhss.ᛲᛶᛸᛵ r3 = (xhss.C0176) r3
            if (r3 != 0) goto L31
            xhss.ᛲᛶᛸᛵ r3 = new xhss.ᛲᛶᛸᛵ
            r3.<init>(r0)
            r0.f2152 = r3
        L31:
            r6 = 2
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            r3.toLowerCase(r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r0 = r0.f2151
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            int r5 = r0.start()
            int r0 = r0.end()
            xhss.ᛱᛲᲇᲀ r0 = xhss.AbstractC0473.m855(r5, r0)
            int r0 = r0.f3091
        L52:
            int r0 = r0 + r4
            int r5 = r10.length()
            if (r0 >= r5) goto L109
            xhss.ᛲᛳᛴᲁ r5 = xhss.C0034.f220
            xhss.ᛷᛱᛳᲁ r5 = r5.m375(r10, r0)
            if (r5 == 0) goto Le2
            java.lang.Object r0 = r5.f2151
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            java.lang.Object r5 = r5.f2153
            xhss.ᲀᛸᛸᲁ r5 = (xhss.C0886) r5
            xhss.ᛷᛴᲇᲀ r7 = r5.m1451(r4)
            r8 = 0
            if (r7 == 0) goto L73
            java.lang.String r7 = r7.f2251
            goto L74
        L73:
            r7 = r8
        L74:
            if (r7 != 0) goto L85
            int r5 = r0.start()
            int r0 = r0.end()
            xhss.ᛱᛲᲇᲀ r0 = xhss.AbstractC0473.m855(r5, r0)
            int r0 = r0.f3091
            goto L52
        L85:
            xhss.ᛷᛴᲇᲀ r9 = r5.m1451(r6)
            if (r9 == 0) goto L8d
            java.lang.String r8 = r9.f2251
        L8d:
            if (r8 != 0) goto L97
            r8 = 3
            xhss.ᛷᛴᲇᲀ r5 = r5.m1451(r8)
            java.lang.String r8 = r5.f2251
            goto Lcc
        L97:
            int r5 = r8.length()
            if (r5 <= 0) goto Lcc
            char r5 = r8.charAt(r1)
            r9 = 39
            boolean r5 = xhss.AbstractC0955.m1553(r5, r9, r1)
            if (r5 == 0) goto Lcc
            int r5 = r8.length()
            if (r5 <= 0) goto Lcc
            int r5 = xhss.AbstractC0120.m345(r8)
            char r5 = r8.charAt(r5)
            boolean r5 = xhss.AbstractC0955.m1553(r5, r9, r1)
            if (r5 == 0) goto Lcc
            int r5 = r8.length()
            if (r5 <= r6) goto Lcc
            int r5 = r8.length()
            int r5 = r5 - r4
            java.lang.String r8 = r8.substring(r4, r5)
        Lcc:
            r3.add(r7)
            r3.add(r8)
            int r5 = r0.start()
            int r0 = r0.end()
            xhss.ᛱᛲᲇᲀ r0 = xhss.AbstractC0473.m855(r5, r0)
            int r0 = r0.f3091
            goto L52
        Le2:
            java.lang.String r0 = r10.substring(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Parameter is not formatted correctly: \""
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = "\" for: \""
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        L109:
            xhss.ᛱᛴᛲᛴ r0 = new xhss.ᛱᛴᛲᛴ
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r3.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.<init>(r10)
            return r0
        L117:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "No subtype found for: \""
            r1.<init>(r3)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static void m104(java.lang.RuntimeException r5, java.lang.String r6) {
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            int r1 = r0.length
            r2 = -1
            r3 = 0
        L7:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L16
            r2 = r3
        L16:
            int r3 = r3 + 1
            goto L7
        L19:
            int r2 = r2 + 1
            java.lang.Object[] r6 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
            r5.setStackTrace(r6)
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public abstract void mo105(xhss.C1068 r1);

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public abstract void mo106(java.lang.Throwable r1);
}
