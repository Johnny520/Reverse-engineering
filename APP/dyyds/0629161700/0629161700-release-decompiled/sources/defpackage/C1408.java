package defpackage;

/* JADX INFO: renamed from: ᛷᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1408 implements defpackage.InterfaceC0391 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C0980 f6121 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C0980 f6122 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C1487 f6123 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final java.util.List f6124 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1487 f6125;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC1029 f6126;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1612 f6127;

    static {
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            ᛱᛸᛲ r1 = new ᛱᛸᛲ
            r2 = 2
            r1.<init>(r2)
            ᛵᲇᛳᲇ r3 = new ᛵᲇᛳᲇ
            java.lang.String r4 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"
            r3.<init>(r4, r0, r1)
            defpackage.C1408.f6122 = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            ᛱᛸᛲ r1 = new ᛱᛸᛲ
            r2 = 3
            r1.<init>(r2)
            ᛵᲇᛳᲇ r2 = new ᛵᲇᛳᲇ
            java.lang.String r3 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"
            r2.<init>(r3, r0, r1)
            defpackage.C1408.f6121 = r2
            ᛸᛵᛴᛲ r0 = new ᛸᛵᛴᛲ
            r0.<init>()
            defpackage.C1408.f6123 = r0
            java.lang.String r0 = "TP1A"
            java.lang.String r1 = "TD1A.220804.031"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            defpackage.C1408.f6124 = r0
            return
    }

    public C1408(defpackage.InterfaceC1612 r1, defpackage.InterfaceC1029 r2) {
            r0 = this;
            r0.<init>()
            r0.f6127 = r1
            r0.f6126 = r2
            ᛸᛵᛴᛲ r1 = defpackage.C1408.f6123
            r0.f6125 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Bitmap m2571(java.lang.Object r14, android.media.MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, defpackage.C0521 r21) {
            r13 = this;
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r0 = android.os.Build.DEVICE
            r7 = 3
            r8 = 0
            java.lang.String r9 = "VideoDecoder"
            if (r0 == 0) goto L73
            java.lang.String r5 = ".+_cheets|cheets_.+"
            boolean r0 = r0.matches(r5)
            if (r0 == 0) goto L73
            r0 = 12
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = "video/webm"
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L25
            goto L73
        L25:
            android.media.MediaExtractor r5 = new android.media.MediaExtractor     // Catch: java.lang.Throwable -> L5a
            r5.<init>()     // Catch: java.lang.Throwable -> L5a
            ᛶᛳᛱᲈ r0 = r13.f6126     // Catch: java.lang.Throwable -> L54
            r0.mo1982(r5, r14)     // Catch: java.lang.Throwable -> L54
            int r0 = r5.getTrackCount()     // Catch: java.lang.Throwable -> L54
            r6 = 0
        L34:
            if (r6 >= r0) goto L56
            android.media.MediaFormat r10 = r5.getTrackFormat(r6)     // Catch: java.lang.Throwable -> L54
            java.lang.String r11 = "mime"
            java.lang.String r10 = r10.getString(r11)     // Catch: java.lang.Throwable -> L54
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r10 = r11.equals(r10)     // Catch: java.lang.Throwable -> L54
            if (r10 != 0) goto L4b
            int r6 = r6 + 1
            goto L34
        L4b:
            r5.release()
            java.lang.String r0 = "Cannot decode VP8 video on CrOS."
            defpackage.C2264.m3676(r0)
            return r8
        L54:
            r0 = move-exception
            goto L5c
        L56:
            r5.release()
            goto L73
        L5a:
            r0 = move-exception
            r5 = r8
        L5c:
            boolean r6 = android.util.Log.isLoggable(r9, r7)     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L6a
            java.lang.String r6 = "Exception trying to extract track info for a webm video on CrOS."
            android.util.Log.d(r9, r6, r0)     // Catch: java.lang.Throwable -> L68
            goto L6a
        L68:
            r0 = move-exception
            goto L6d
        L6a:
            if (r5 == 0) goto L73
            goto L56
        L6d:
            if (r5 == 0) goto L72
            r5.release()
        L72:
            throw r0
        L73:
            r10 = 24
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto Lcd
            if (r3 == r0) goto Lcd
            ᛳᛸᛲᛲ r0 = defpackage.C0521.f2570
            if (r4 == r0) goto Lcd
            r0 = 18
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch: java.lang.Throwable -> Lc1
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> Lc1
            r5 = 19
            java.lang.String r5 = r15.extractMetadata(r5)     // Catch: java.lang.Throwable -> Lc1
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r6 = r15.extractMetadata(r10)     // Catch: java.lang.Throwable -> Lc1
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> Lc1
            r11 = 90
            if (r6 == r11) goto La3
            r11 = 270(0x10e, float:3.78E-43)
            if (r6 != r11) goto La6
        La3:
            r12 = r5
            r5 = r0
            r0 = r12
        La6:
            float r2 = r4.m1313(r0, r5, r2, r3)     // Catch: java.lang.Throwable -> Lc1
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Lc1
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> Lc1
            float r3 = (float) r5     // Catch: java.lang.Throwable -> Lc1
            float r2 = r2 * r3
            int r6 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> Lc1
            r1 = r15
            r2 = r16
            r4 = r18
            r5 = r0
            android.graphics.Bitmap r8 = r1.getScaledFrameAtTime(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc1
            goto Lcd
        Lc1:
            r0 = move-exception
            boolean r2 = android.util.Log.isLoggable(r9, r7)
            if (r2 == 0) goto Lcd
            java.lang.String r2 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r9, r2, r0)
        Lcd:
            if (r8 != 0) goto Ld3
            android.graphics.Bitmap r8 = r15.getFrameAtTime(r16, r18)
        Ld3:
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r2 = "Pixel"
            boolean r0 = r0.startsWith(r2)
            r2 = 33
            if (r0 == 0) goto Lfe
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r2) goto Lfe
            java.util.List r0 = defpackage.C1408.f6124
            java.util.Iterator r0 = r0.iterator()
        Le9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L177
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = android.os.Build.ID
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto Le9
            goto L102
        Lfe:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r2) goto L177
        L102:
            r0 = 36
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch: java.lang.NumberFormatException -> L16c
            r2 = 35
            java.lang.String r2 = r15.extractMetadata(r2)     // Catch: java.lang.NumberFormatException -> L16c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L16c
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L16c
            r3 = 7
            r4 = 6
            if (r0 == r3) goto L11c
            if (r0 != r4) goto L177
        L11c:
            if (r2 != r4) goto L177
            java.lang.String r0 = r15.extractMetadata(r10)     // Catch: java.lang.NumberFormatException -> L16c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L16c
            int r0 = java.lang.Math.abs(r0)     // Catch: java.lang.NumberFormatException -> L16c
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 != r1) goto L177
            boolean r0 = android.util.Log.isLoggable(r9, r7)
            if (r0 == 0) goto L139
            java.lang.String r0 = "Applying HDR 180 deg thumbnail correction"
            android.util.Log.d(r9, r0)
        L139:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r8.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            r2 = 1127481344(0x43340000, float:180.0)
            r0.postRotate(r2, r1, r3)
            int r1 = r8.getWidth()
            int r2 = r8.getHeight()
            r3 = 1
            r4 = 0
            r5 = 0
            r18 = r0
            r16 = r1
            r17 = r2
            r19 = r3
            r14 = r4
            r15 = r5
            r13 = r8
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)
            goto L177
        L16c:
            boolean r0 = android.util.Log.isLoggable(r9, r7)
            if (r0 == 0) goto L177
            java.lang.String r0 = "Exception trying to extract HDR transfer function or rotation"
            android.util.Log.d(r9, r0)
        L177:
            if (r8 == 0) goto L17a
            return r8
        L17a:
            ᛸᛵᛳᲀ r0 = new ᛸᛵᛳᲀ
            java.lang.String r1 = "MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC1901 mo382(java.lang.Object r11, int r12, int r13, defpackage.C0533 r14) {
            r10 = this;
            ᛵᲇᛳᲇ r0 = defpackage.C1408.f6122
            java.lang.Object r0 = r14.m1326(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r0 = -1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L19
            goto L2d
        L19:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Requested frame must be non-negative, or DEFAULT_FRAME, given: "
            r11.<init>(r12)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L2d:
            ᛵᲇᛳᲇ r0 = defpackage.C1408.f6121
            java.lang.Object r0 = r14.m1326(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L3c
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L3c:
            ᛵᲇᛳᲇ r1 = defpackage.C0521.f2575
            java.lang.Object r14 = r14.m1326(r1)
            ᛳᛸᛲᛲ r14 = (defpackage.C0521) r14
            if (r14 != 0) goto L48
            ᛳᛸᛲᛲ r14 = defpackage.C0521.f2574
        L48:
            r9 = r14
            ᛸᛵᛴᛲ r14 = r10.f6125
            r14.getClass()
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever
            r3.<init>()
            ᛶᛳᛱᲈ r14 = r10.f6126     // Catch: java.lang.Throwable -> L6e
            r14.mo1983(r3, r11)     // Catch: java.lang.Throwable -> L6e
            int r6 = r0.intValue()     // Catch: java.lang.Throwable -> L6e
            r1 = r10
            r2 = r11
            r7 = r12
            r8 = r13
            android.graphics.Bitmap r10 = r1.m2571(r2, r3, r4, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6e
            r3.close()
            ᛸᲈᲇᲁ r11 = r1.f6127
            ᛱᲀᛴᲁ r10 = defpackage.C0162.m691(r11, r10)
            return r10
        L6e:
            r0 = move-exception
            r10 = r0
            r3.close()
            throw r10
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo383(java.lang.Object r1, defpackage.C0533 r2) {
            r0 = this;
            r0 = 1
            return r0
    }
}
