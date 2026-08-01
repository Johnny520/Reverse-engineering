package defpackage;

/* JADX INFO: renamed from: ᛵᛴᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0876 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f3953;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C1708 f3954;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final byte[] f3955;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.nio.ByteBuffer f3956;

    public C0876() {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r1.f3955 = r0
            r0 = 0
            r1.f3953 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int[] m1857(int r10) {
            r9 = this;
            int r0 = r10 * 3
            byte[] r0 = new byte[r0]
            r1 = 0
            java.nio.ByteBuffer r2 = r9.f3956     // Catch: java.nio.BufferUnderflowException -> L33
            r2.get(r0)     // Catch: java.nio.BufferUnderflowException -> L33
            r2 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r2]     // Catch: java.nio.BufferUnderflowException -> L33
            r2 = 0
            r3 = r2
        L10:
            if (r2 >= r10) goto L35
            int r4 = r3 + 1
            r5 = r0[r3]     // Catch: java.nio.BufferUnderflowException -> L33
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r3 + 2
            r4 = r0[r4]     // Catch: java.nio.BufferUnderflowException -> L33
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 3
            r6 = r0[r6]     // Catch: java.nio.BufferUnderflowException -> L33
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r2 + 1
            int r5 = r5 << 16
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = r5 | r8
            int r4 = r4 << 8
            r4 = r4 | r5
            r4 = r4 | r6
            r1[r2] = r4     // Catch: java.nio.BufferUnderflowException -> L33
            r2 = r7
            goto L10
        L33:
            r10 = move-exception
            goto L36
        L35:
            return r1
        L36:
            java.lang.String r0 = "GifHeaderParser"
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L44
            java.lang.String r2 = "Format Error Reading Color Table"
            android.util.Log.d(r0, r2, r10)
        L44:
            ᲀᛷᛵᲈ r9 = r9.f3954
            r10 = 1
            r9.f7610 = r10
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m1858() {
            r6 = this;
            int r0 = r6.m1859()
            r6.f3953 = r0
            if (r0 <= 0) goto L4a
            r0 = 0
            r1 = r0
        La:
            int r1 = r6.f3953     // Catch: java.lang.Exception -> L18
            if (r0 >= r1) goto L4a
            int r1 = r1 - r0
            java.nio.ByteBuffer r2 = r6.f3956     // Catch: java.lang.Exception -> L18
            byte[] r3 = r6.f3955     // Catch: java.lang.Exception -> L18
            r2.get(r3, r0, r1)     // Catch: java.lang.Exception -> L18
            int r0 = r0 + r1
            goto La
        L18:
            r2 = move-exception
            r3 = 3
            java.lang.String r4 = "GifHeaderParser"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Error Reading Block n: "
            r3.<init>(r5)
            r3.append(r0)
            java.lang.String r0 = " count: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " blockSize: "
            r3.append(r0)
            int r0 = r6.f3953
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.d(r4, r0, r2)
        L45:
            ᲀᛷᛵᲈ r6 = r6.f3954
            r0 = 1
            r6.f7610 = r0
        L4a:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int m1859() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f3956     // Catch: java.lang.Exception -> L9
            byte r1 = r0.get()     // Catch: java.lang.Exception -> L9
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
        L9:
            ᲀᛷᛵᲈ r1 = r1.f3954
            r0 = 1
            r1.f7610 = r0
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m1860() {
            r0 = this;
            ᲀᛷᛵᲈ r0 = r0.f3954
            int r0 = r0.f7610
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1708 m1861() {
            r11 = this;
            java.nio.ByteBuffer r0 = r11.f3956
            r1 = 0
            if (r0 == 0) goto L206
            boolean r0 = r11.m1860()
            if (r0 == 0) goto Le
            ᲀᛷᛵᲈ r11 = r11.f3954
            return r11
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
            r3 = r2
        L15:
            r4 = 6
            if (r3 >= r4) goto L23
            int r4 = r11.m1859()
            char r4 = (char) r4
            r0.append(r4)
            int r3 = r3 + 1
            goto L15
        L23:
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "GIF"
            boolean r0 = r0.startsWith(r3)
            ᲀᛷᛵᲈ r3 = r11.f3954
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            r6 = 1
            if (r0 != 0) goto L37
            r3.f7610 = r6
            goto L93
        L37:
            java.nio.ByteBuffer r0 = r11.f3956
            short r0 = r0.getShort()
            r3.f7611 = r0
            ᲀᛷᛵᲈ r0 = r11.f3954
            java.nio.ByteBuffer r3 = r11.f3956
            short r3 = r3.getShort()
            r0.f7612 = r3
            int r0 = r11.m1859()
            ᲀᛷᛵᲈ r3 = r11.f3954
            r7 = r0 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L55
            r7 = r6
            goto L56
        L55:
            r7 = r2
        L56:
            r3.f7602 = r7
            r0 = r0 & 7
            int r0 = r0 + r6
            double r7 = (double) r0
            double r7 = java.lang.Math.pow(r4, r7)
            int r0 = (int) r7
            r3.f7604 = r0
            ᲀᛷᛵᲈ r0 = r11.f3954
            int r3 = r11.m1859()
            r0.f7609 = r3
            ᲀᛷᛵᲈ r0 = r11.f3954
            r11.m1859()
            r0.getClass()
            ᲀᛷᛵᲈ r0 = r11.f3954
            boolean r0 = r0.f7602
            if (r0 == 0) goto L93
            boolean r0 = r11.m1860()
            if (r0 != 0) goto L93
            ᲀᛷᛵᲈ r0 = r11.f3954
            int r3 = r0.f7604
            int[] r3 = r11.m1857(r3)
            r0.f7608 = r3
            ᲀᛷᛵᲈ r0 = r11.f3954
            int[] r3 = r0.f7608
            int r7 = r0.f7609
            r3 = r3[r7]
            r0.f7603 = r3
        L93:
            boolean r0 = r11.m1860()
            if (r0 != 0) goto L203
            r0 = r2
        L9a:
            if (r0 != 0) goto L1fb
            boolean r3 = r11.m1860()
            if (r3 != 0) goto L1fb
            ᲀᛷᛵᲈ r3 = r11.f3954
            int r3 = r3.f7607
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r3 > r7) goto L1fb
            int r3 = r11.m1859()
            r7 = 33
            if (r3 == r7) goto L151
            r7 = 44
            if (r3 == r7) goto Lc2
            r7 = 59
            if (r3 == r7) goto Lc0
            ᲀᛷᛵᲈ r3 = r11.f3954
            r3.f7610 = r6
            goto L9a
        Lc0:
            r0 = r6
            goto L9a
        Lc2:
            ᲀᛷᛵᲈ r3 = r11.f3954
            ᛳᛱᲇᲈ r7 = r3.f7606
            if (r7 != 0) goto Lcf
            ᛳᛱᲇᲈ r7 = new ᛳᛱᲇᲈ
            r7.<init>()
            r3.f7606 = r7
        Lcf:
            java.nio.ByteBuffer r3 = r11.f3956
            short r3 = r3.getShort()
            r7.f2085 = r3
            ᲀᛷᛵᲈ r3 = r11.f3954
            ᛳᛱᲇᲈ r3 = r3.f7606
            java.nio.ByteBuffer r7 = r11.f3956
            short r7 = r7.getShort()
            r3.f2087 = r7
            ᲀᛷᛵᲈ r3 = r11.f3954
            ᛳᛱᲇᲈ r3 = r3.f7606
            java.nio.ByteBuffer r7 = r11.f3956
            short r7 = r7.getShort()
            r3.f2084 = r7
            ᲀᛷᛵᲈ r3 = r11.f3954
            ᛳᛱᲇᲈ r3 = r3.f7606
            java.nio.ByteBuffer r7 = r11.f3956
            short r7 = r7.getShort()
            r3.f2083 = r7
            int r3 = r11.m1859()
            r7 = r3 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L105
            r7 = r6
            goto L106
        L105:
            r7 = r2
        L106:
            r8 = r3 & 7
            int r8 = r8 + r6
            double r8 = (double) r8
            double r8 = java.lang.Math.pow(r4, r8)
            int r8 = (int) r8
            ᲀᛷᛵᲈ r9 = r11.f3954
            ᛳᛱᲇᲈ r9 = r9.f7606
            r3 = r3 & 64
            if (r3 == 0) goto L119
            r3 = r6
            goto L11a
        L119:
            r3 = r2
        L11a:
            r9.f2082 = r3
            if (r7 == 0) goto L125
            int[] r3 = r11.m1857(r8)
            r9.f2080 = r3
            goto L127
        L125:
            r9.f2080 = r1
        L127:
            ᲀᛷᛵᲈ r3 = r11.f3954
            ᛳᛱᲇᲈ r3 = r3.f7606
            java.nio.ByteBuffer r7 = r11.f3956
            int r7 = r7.position()
            r3.f2086 = r7
            r11.m1859()
            r11.m1862()
            boolean r3 = r11.m1860()
            if (r3 == 0) goto L141
            goto L9a
        L141:
            ᲀᛷᛵᲈ r3 = r11.f3954
            int r7 = r3.f7607
            int r7 = r7 + r6
            r3.f7607 = r7
            java.util.ArrayList r7 = r3.f7605
            ᛳᛱᲇᲈ r3 = r3.f7606
            r7.add(r3)
            goto L9a
        L151:
            int r3 = r11.m1859()
            if (r3 == r6) goto L1f6
            r7 = 249(0xf9, float:3.49E-43)
            r8 = 2
            if (r3 == r7) goto L1b3
            r7 = 254(0xfe, float:3.56E-43)
            if (r3 == r7) goto L1ae
            r7 = 255(0xff, float:3.57E-43)
            if (r3 == r7) goto L169
            r11.m1862()
            goto L9a
        L169:
            r11.m1858()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r7 = r2
        L172:
            r9 = 11
            byte[] r10 = r11.f3955
            if (r7 >= r9) goto L181
            r9 = r10[r7]
            char r9 = (char) r9
            r3.append(r9)
            int r7 = r7 + 1
            goto L172
        L181:
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = "NETSCAPE2.0"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L1a9
        L18d:
            r11.m1858()
            r3 = r10[r2]
            if (r3 != r6) goto L19d
            r3 = r10[r6]
            r3 = r10[r8]
            ᲀᛷᛵᲈ r3 = r11.f3954
            r3.getClass()
        L19d:
            int r3 = r11.f3953
            if (r3 <= 0) goto L9a
            boolean r3 = r11.m1860()
            if (r3 == 0) goto L18d
            goto L9a
        L1a9:
            r11.m1862()
            goto L9a
        L1ae:
            r11.m1862()
            goto L9a
        L1b3:
            ᲀᛷᛵᲈ r3 = r11.f3954
            ᛳᛱᲇᲈ r7 = new ᛳᛱᲇᲈ
            r7.<init>()
            r3.f7606 = r7
            r11.m1859()
            int r3 = r11.m1859()
            ᲀᛷᛵᲈ r7 = r11.f3954
            ᛳᛱᲇᲈ r7 = r7.f7606
            r9 = r3 & 28
            int r9 = r9 >> r8
            r7.f2089 = r9
            if (r9 != 0) goto L1d0
            r7.f2089 = r6
        L1d0:
            r3 = r3 & 1
            if (r3 == 0) goto L1d6
            r3 = r6
            goto L1d7
        L1d6:
            r3 = r2
        L1d7:
            r7.f2088 = r3
            java.nio.ByteBuffer r3 = r11.f3956
            short r3 = r3.getShort()
            r7 = 10
            if (r3 >= r8) goto L1e4
            r3 = r7
        L1e4:
            ᲀᛷᛵᲈ r8 = r11.f3954
            ᛳᛱᲇᲈ r8 = r8.f7606
            int r3 = r3 * r7
            r8.f2081 = r3
            int r3 = r11.m1859()
            r8.f2079 = r3
            r11.m1859()
            goto L9a
        L1f6:
            r11.m1862()
            goto L9a
        L1fb:
            ᲀᛷᛵᲈ r0 = r11.f3954
            int r1 = r0.f7607
            if (r1 >= 0) goto L203
            r0.f7610 = r6
        L203:
            ᲀᛷᛵᲈ r11 = r11.f3954
            return r11
        L206:
            java.lang.String r11 = "You must call setData() before parseHeader()"
            defpackage.C2264.m3676(r11)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m1862() {
            r3 = this;
        L0:
            int r0 = r3.m1859()
            java.nio.ByteBuffer r1 = r3.f3956
            int r1 = r1.position()
            int r1 = r1 + r0
            java.nio.ByteBuffer r2 = r3.f3956
            int r2 = r2.limit()
            int r1 = java.lang.Math.min(r1, r2)
            java.nio.ByteBuffer r2 = r3.f3956
            r2.position(r1)
            if (r0 > 0) goto L0
            return
    }
}
