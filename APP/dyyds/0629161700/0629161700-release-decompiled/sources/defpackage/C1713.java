package defpackage;

/* JADX INFO: renamed from: ᲀᛷᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1713 implements defpackage.InterfaceC0391 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C1467 f7619 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0682 f7620;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1467 f7621;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.content.Context f7622;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f7623;

    static {
            ᛸᛴᛱᛸ r0 = new ᛸᛴᛱᛸ
            r1 = 0
            r0.<init>(r1)
            defpackage.C1713.f7619 = r0
            return
    }

    public C1713(android.content.Context r1, java.util.ArrayList r2, defpackage.InterfaceC1612 r3, defpackage.C2063 r4) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f7622 = r1
            r0.f7623 = r2
            ᛴᛵᲇᲇ r1 = new ᛴᛵᲇᲇ
            r2 = 23
            r1.<init>(r3, r2, r4)
            r0.f7620 = r1
            ᛸᛴᛱᛸ r1 = defpackage.C1713.f7619
            r0.f7621 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static int m3103(defpackage.C1708 r4, int r5, int r6) {
            int r0 = r4.f7612
            int r0 = r0 / r6
            int r1 = r4.f7611
            int r1 = r1 / r5
            int r0 = java.lang.Math.min(r0, r1)
            if (r0 != 0) goto Le
            r0 = 0
            goto L12
        Le:
            int r0 = java.lang.Integer.highestOneBit(r0)
        L12:
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            r2 = 2
            java.lang.String r3 = "BufferGifDecoder"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L5a
            if (r0 <= r1) goto L5a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Downsampling GIF, sampleSize: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = ", target dimens: ["
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "x"
            r1.append(r5)
            r1.append(r6)
            java.lang.String r6 = "], actual dimens: ["
            r1.append(r6)
            int r6 = r4.f7611
            r1.append(r6)
            r1.append(r5)
            int r4 = r4.f7612
            r1.append(r4)
            java.lang.String r4 = "]"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.v(r3, r4)
        L5a:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0568 m3104(java.nio.ByteBuffer r15, int r16, int r17, defpackage.C0876 r18, defpackage.C0533 r19) {
            r14 = this;
            java.lang.String r1 = "Decoded GIF from stream in "
            java.lang.String r2 = "BufferGifDecoder"
            int r0 = defpackage.AbstractC1856.f8102
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            r5 = 2
            ᲀᛷᛵᲈ r0 = r18.m1861()     // Catch: java.lang.Throwable -> L2d
            int r6 = r0.f7607     // Catch: java.lang.Throwable -> L2d
            r7 = 0
            if (r6 <= 0) goto La2
            int r6 = r0.f7610     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L1a
            goto La2
        L1a:
            ᛵᲇᛳᲇ r6 = defpackage.AbstractC1299.f5759     // Catch: java.lang.Throwable -> L2d
            r8 = r19
            java.lang.Object r6 = r8.m1326(r6)     // Catch: java.lang.Throwable -> L2d
            ᛲᛶᛶᲁ r8 = defpackage.EnumC0308.f1636     // Catch: java.lang.Throwable -> L2d
            if (r6 != r8) goto L31
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Throwable -> L2d
        L28:
            r11 = r16
            r12 = r17
            goto L34
        L2d:
            r0 = move-exception
            r14 = r0
            goto Laf
        L31:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L2d
            goto L28
        L34:
            int r8 = m3103(r0, r11, r12)     // Catch: java.lang.Throwable -> L2d
            ᛴᛵᲇᲇ r9 = r14.f7620     // Catch: java.lang.Throwable -> L2d
            ᛱᛷᛴᛷ r10 = new ᛱᛷᛴᛷ     // Catch: java.lang.Throwable -> L2d
            r10.<init>(r9, r0, r15, r8)     // Catch: java.lang.Throwable -> L2d
            r10.m639(r6)     // Catch: java.lang.Throwable -> L2d
            int r0 = r10.f1039     // Catch: java.lang.Throwable -> L2d
            int r0 = r0 + 1
            ᲀᛷᛵᲈ r6 = r10.f1040     // Catch: java.lang.Throwable -> L2d
            int r6 = r6.f7607     // Catch: java.lang.Throwable -> L2d
            int r0 = r0 % r6
            r10.f1039 = r0     // Catch: java.lang.Throwable -> L2d
            android.graphics.Bitmap r13 = r10.m641()     // Catch: java.lang.Throwable -> L2d
            if (r13 != 0) goto L6d
            boolean r14 = android.util.Log.isLoggable(r2, r5)
            if (r14 == 0) goto Lae
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r1)
        L5e:
            double r0 = defpackage.AbstractC1856.m3272(r3)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            android.util.Log.v(r2, r14)
            return r7
        L6d:
            ᛶᛴᲁᛱ r0 = new ᛶᛴᲁᛱ     // Catch: java.lang.Throwable -> L2d
            android.content.Context r14 = r14.f7622     // Catch: java.lang.Throwable -> L2d
            ᛲᛱᲀᲈ r6 = new ᛲᛱᲀᲈ     // Catch: java.lang.Throwable -> L2d
            ᛲᲀᲁᛲ r8 = new ᛲᲀᲁᛲ     // Catch: java.lang.Throwable -> L2d
            com.bumptech.glide.ᛷᲁᛳᛳ r9 = com.bumptech.glide.ComponentCallbacks2C0007.m235(r14)     // Catch: java.lang.Throwable -> L2d
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L2d
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L2d
            ᛳᲇᛲᛷ r14 = new ᛳᲇᛲᛷ     // Catch: java.lang.Throwable -> L2d
            r6 = 0
            r14.<init>(r0, r6)     // Catch: java.lang.Throwable -> L2d
            boolean r0 = android.util.Log.isLoggable(r2, r5)
            if (r0 == 0) goto La1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            double r3 = defpackage.AbstractC1856.m3272(r3)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        La1:
            return r14
        La2:
            boolean r14 = android.util.Log.isLoggable(r2, r5)
            if (r14 == 0) goto Lae
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r1)
            goto L5e
        Lae:
            return r7
        Laf:
            boolean r0 = android.util.Log.isLoggable(r2, r5)
            if (r0 == 0) goto Lc8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            double r3 = defpackage.AbstractC1856.m3272(r3)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        Lc8:
            throw r14
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC1901 mo382(java.lang.Object r8, int r9, int r10, defpackage.C0533 r11) {
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            ᛸᛴᛱᛸ r8 = r7.f7621
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f6497     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L17
            ᛵᛴᛸᛶ r0 = (defpackage.C0876) r0     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L15
            ᛵᛴᛸᛶ r0 = new ᛵᛴᛸᛶ     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1a
        L17:
            r0 = move-exception
            r7 = r0
            goto L53
        L1a:
            r0 = 0
            r5.f3956 = r0     // Catch: java.lang.Throwable -> L17
            byte[] r0 = r5.f3955     // Catch: java.lang.Throwable -> L17
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L17
            ᲀᛷᛵᲈ r0 = new ᲀᛷᛵᲈ     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
            r5.f3954 = r0     // Catch: java.lang.Throwable -> L17
            r5.f3953 = r1     // Catch: java.lang.Throwable -> L17
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L17
            r5.f3956 = r0     // Catch: java.lang.Throwable -> L17
            r0.position(r1)     // Catch: java.lang.Throwable -> L17
            java.nio.ByteBuffer r0 = r5.f3956     // Catch: java.lang.Throwable -> L17
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L17
            r0.order(r1)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            ᛳᲇᛲᛷ r7 = r1.m3104(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4b
            ᛸᛴᛱᛸ r8 = r1.f7621
            r8.m2662(r5)
            return r7
        L4b:
            r0 = move-exception
            r7 = r0
            ᛸᛴᛱᛸ r8 = r1.f7621
            r8.m2662(r5)
            throw r7
        L53:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L17
            throw r7
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo383(java.lang.Object r2, defpackage.C0533 r3) {
            r1 = this;
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            ᛵᲇᛳᲇ r0 = defpackage.AbstractC1299.f5760
            java.lang.Object r3 = r3.m1326(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L1c
            java.util.ArrayList r1 = r1.f7623
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = defpackage.AbstractC1849.m3250(r1, r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF
            if (r1 != r2) goto L1c
            r1 = 1
            return r1
        L1c:
            r1 = 0
            return r1
    }
}
