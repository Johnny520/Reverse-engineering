package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class u81 {
    /* JADX INFO: renamed from: α */
    public static final p000.wo1 m5802(float r17, float r18, float r19, float r20, long r21) {
            r0 = 32
            long r1 = r21 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r21 & r2
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r5 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r1
            long r0 = r5 << r0
            long r2 = r2 & r7
            long r9 = r0 | r2
            wo1 r4 = new wo1
            r11 = r9
            r13 = r9
            r15 = r9
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r4.<init>(r5, r6, r7, r8, r9, r11, r13, r15)
            return r4
    }

    /* JADX INFO: renamed from: β */
    public static final int m5803(p000.ip1 r1) {
            int r1 = r1.ordinal()
            if (r1 == 0) goto L13
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 != r0) goto Ld
            return r0
        Ld:
            p000.C1080.m7272()
            r1 = 0
            return r1
        L12:
            return r0
        L13:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static void m5804(p000.rw1 r5, java.util.List r6, p000.C1064zn r7) {
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L49
            int r0 = r6.size()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L49
            java.lang.Object r2 = r6.get(r1)
            q80 r2 = (p000.q80) r2
            int r2 = r5.m5153(r2)
            int r3 = r5.m5167(r2)
            int[] r4 = r5.f9539
            int r3 = r5.m5143(r3, r4)
            int[] r4 = r5.f9539
            int r2 = r2 + 1
            int r2 = r5.m5167(r2)
            int r2 = r5.m5157(r2, r4)
            if (r3 >= r2) goto L38
            int r2 = r5.m5158(r3)
            java.lang.Object[] r3 = r5.f9540
            r2 = r3[r2]
            goto L3a
        L38:
            i2 r2 = p000.C0730qn.f9051
        L3a:
            boolean r3 = r2 instanceof p000.bl1
            if (r3 == 0) goto L41
            bl1 r2 = (p000.bl1) r2
            goto L42
        L41:
            r2 = 0
        L42:
            if (r2 == 0) goto L46
            r2.f1777 = r7
        L46:
            int r1 = r1 + 1
            goto Lb
        L49:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static final boolean m5805(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static final p000.sr1 m5806(java.lang.Object r1) {
            uy r0 = p000.AbstractC0073bd.f1648
            if (r1 == r0) goto L7
            sr1 r1 = (p000.sr1) r1
            return r1
        L7:
            java.lang.String r1 = "Does not contain segment"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static final long m5807(int r2) {
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            float r2 = (float) r2
            long r0 = m5814(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static final boolean m5808(java.lang.Object r1) {
            uy r0 = p000.AbstractC0073bd.f1648
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static final boolean m5809(p000.z91 r5, float r6, float r7) {
            r0 = 1000593162(0x3ba3d70a, float:0.005)
            float r1 = r6 - r0
            float r2 = r7 - r0
            float r6 = r6 + r0
            float r7 = r7 + r0
            x2 r0 = p000.AbstractC1006y2.m6812()
            android.graphics.Path r3 = r0.f11999
            boolean r4 = java.lang.Float.isNaN(r1)
            if (r4 != 0) goto L27
            boolean r4 = java.lang.Float.isNaN(r2)
            if (r4 != 0) goto L27
            boolean r4 = java.lang.Float.isNaN(r6)
            if (r4 != 0) goto L27
            boolean r4 = java.lang.Float.isNaN(r7)
            if (r4 == 0) goto L2c
        L27:
            java.lang.String r4 = "Invalid rectangle, make sure no value is NaN"
            p000.AbstractC1006y2.m6813(r4)
        L2c:
            android.graphics.RectF r4 = r0.f12000
            if (r4 != 0) goto L37
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r0.f12000 = r4
        L37:
            android.graphics.RectF r4 = r0.f12000
            r4.getClass()
            r4.set(r1, r2, r6, r7)
            android.graphics.RectF r6 = r0.f12000
            r6.getClass()
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CCW
            r3.addRect(r6, r7)
            x2 r6 = p000.AbstractC1006y2.m6812()
            android.graphics.Path r7 = r6.f11999
            r1 = 1
            r6.m6504(r5, r0, r1)
            boolean r5 = r7.isEmpty()
            r7.reset()
            r3.reset()
            r5 = r5 ^ r1
            return r5
    }

    /* JADX INFO: renamed from: κ */
    public static final boolean m5810(p000.wo1 r6) {
            long r0 = r6.f11792
            r2 = 32
            long r2 = r0 >>> r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L24
            long r2 = r6.f11793
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L24
            long r2 = r6.f11794
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L24
            long r2 = r6.f11795
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L24
            r6 = 1
            return r6
        L24:
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: λ */
    public static final boolean m5811(float r2, float r3, float r4, float r5, long r6) {
            float r2 = r2 - r4
            float r3 = r3 - r5
            r4 = 32
            long r4 = r6 >> r4
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r6 & r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r2 = r2 * r2
            float r4 = r4 * r4
            float r2 = r2 / r4
            float r3 = r3 * r3
            float r5 = r5 * r5
            float r3 = r3 / r5
            float r3 = r3 + r2
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L26
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: μ */
    public static java.nio.MappedByteBuffer m5812(android.content.Context r8, android.net.Uri r9) {
            android.content.ContentResolver r8 = r8.getContentResolver()
            r1 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r9, r0, r1)     // Catch: java.io.IOException -> L4c
            if (r8 != 0) goto L13
            if (r8 == 0) goto L4c
            r8.close()     // Catch: java.io.IOException -> L4c
            return r1
        L13:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33
            java.io.FileDescriptor r0 = r8.getFileDescriptor()     // Catch: java.lang.Throwable -> L33
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L33
            java.nio.channels.FileChannel r2 = r9.getChannel()     // Catch: java.lang.Throwable -> L36
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L36
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L36
            r4 = 0
            java.nio.MappedByteBuffer r0 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L36
            r9.close()     // Catch: java.lang.Throwable -> L33
            r8.close()     // Catch: java.io.IOException -> L4c
            return r0
        L33:
            r0 = move-exception
            r9 = r0
            goto L42
        L36:
            r0 = move-exception
            r2 = r0
            r9.close()     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r0 = move-exception
            r9 = r0
            r2.addSuppressed(r9)     // Catch: java.lang.Throwable -> L33
        L41:
            throw r2     // Catch: java.lang.Throwable -> L33
        L42:
            r8.close()     // Catch: java.lang.Throwable -> L46
            goto L4b
        L46:
            r0 = move-exception
            r8 = r0
            r9.addSuppressed(r8)     // Catch: java.io.IOException -> L4c
        L4b:
            throw r9     // Catch: java.io.IOException -> L4c
        L4c:
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public static java.lang.String m5813(java.lang.String r4) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = p000.AbstractC0602nx.m4134(r0, r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        Lc:
            int r2 = r4.length()
            if (r1 >= r2) goto L22
            char r2 = r4.charAt(r1)
            boolean r3 = p000.jx0.m3020(r2)
            if (r3 != 0) goto L1f
            r0.append(r2)
        L1f:
            int r1 = r1 + 1
            goto Lc
        L22:
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: ξ */
    public static final long m5814(long r4, float r6) {
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = r4 | r0
            z32[] r6 = p000.y32.f12440
            return r4
    }

    /* JADX INFO: renamed from: ο */
    public static void m5815(android.app.Activity r6, java.lang.String r7, java.lang.Throwable r8) {
            java.lang.String r0 = "错误信息: "
            java.lang.String r1 = "错误类型: "
            java.lang.String r2 = "请检查是否隐藏了抖音包名以及模块包名字导致\n\n模块包名: com.example.dyhelper\nr60576f1b3c57f12a"
            java.lang.String r3 = " XML布局打开失败"
            r6.getClass()
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r7.concat(r3)     // Catch: java.lang.Throwable -> L5b
            android.app.AlertDialog$Builder r3 = r4.setTitle(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r2 = r8.getClass()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L5b
            r5.append(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "\n"
            r5.append(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L5b
            r4.append(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r8.getMessage()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L41
            java.lang.String r1 = "无"
        L41:
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L5b
            r4.append(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L5b
            android.app.AlertDialog$Builder r0 = r3.setMessage(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "知道了"
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)     // Catch: java.lang.Throwable -> L5b
            r0.show()     // Catch: java.lang.Throwable -> L5b
            return
        L5b:
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = " XML布局打开失败: "
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            r8 = 1
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r8)
            r6.show()
            return
    }

    /* JADX INFO: renamed from: π */
    public static final long m5816(java.lang.String r4, long r5, long r7, long r9) {
            int r0 = p000.j22.f5301
            java.lang.String r0 = java.lang.System.getProperty(r4)     // Catch: java.lang.SecurityException -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Lb
            return r5
        Lb:
            r5 = 10
            java.lang.Long r5 = p000.x02.m6489(r0, r5)
            r6 = 39
            java.lang.String r1 = "System property '"
            if (r5 == 0) goto L45
            long r2 = r5.longValue()
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 > 0) goto L24
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 > 0) goto L24
            return r2
        L24:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "' should be in range "
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4137(r1, r4, r7, r0)
            java.lang.String r7 = ".."
            java.lang.String r8 = ", but is '"
            p000.AbstractC0602nx.m4118(r4, r7, r9, r8)
            r4.append(r2)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L45:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r4)
            java.lang.String r4 = "' has unrecognized value '"
            r7.append(r4)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    /* JADX INFO: renamed from: ρ */
    public static int m5817(int r7, int r8, java.lang.String r9) {
            r8 = r8 & 8
            if (r8 == 0) goto L8
            r8 = 2147483647(0x7fffffff, float:NaN)
            goto Lb
        L8:
            r8 = 2097150(0x1ffffe, float:2.938733E-39)
        Lb:
            long r1 = (long) r7
            r7 = 1
            long r3 = (long) r7
            long r5 = (long) r8
            r0 = r9
            long r7 = m5816(r0, r1, r3, r5)
            int r7 = (int) r7
            return r7
    }

    /* JADX INFO: renamed from: σ */
    public static java.lang.String m5818(long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerId(value="
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: τ */
    public static final void m5819() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ε */
    public abstract p000.ml1 mo5068();
}
