package defpackage;

/* JADX INFO: renamed from: ᛸᛳᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1459 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.C0980 f6406 = null;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final java.util.ArrayDeque f6407 = null;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final defpackage.C0980 f6408 = null;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final defpackage.C1500 f6409 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C0980 f6410 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final defpackage.C0980 f6411 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0082 f6412;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.ArrayList f6413;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2063 f6414;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC1612 f6415;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.util.DisplayMetrics f6416;

    static {
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"
            ᛲᛶᛶᲁ r1 = defpackage.EnumC0308.f1635
            ᛵᲇᛳᲇ r0 = defpackage.C0980.m1921(r1, r0)
            defpackage.C1459.f6410 = r0
            ᛵᲇᛳᲇ r0 = new ᛵᲇᛳᲇ
            r1 = 0
            ᲈᛴᛵᲈ r2 = defpackage.C0980.f4390
            java.lang.String r3 = "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"
            r0.<init>(r3, r1, r2)
            defpackage.C1459.f6411 = r0
            ᛳᛸᛲᛲ r0 = defpackage.C0521.f2573
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"
            ᛵᲇᛳᲇ r1 = defpackage.C0980.m1921(r0, r1)
            defpackage.C1459.f6406 = r1
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"
            ᛵᲇᛳᲇ r0 = defpackage.C0980.m1921(r0, r1)
            defpackage.C1459.f6408 = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "image/vnd.wap.wbmp"
            java.lang.String r2 = "image/x-ico"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Collections.unmodifiableSet(r0)
            ᛸᛶᛱᛵ r0 = new ᛸᛶᛱᛵ
            r1 = 19
            r0.<init>(r1)
            defpackage.C1459.f6409 = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1, r2)
            java.util.Collections.unmodifiableSet(r0)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 0
            r0.<init>(r1)
            defpackage.C1459.f6407 = r0
            return
    }

    public C1459(java.util.ArrayList r2, android.util.DisplayMetrics r3, defpackage.InterfaceC1612 r4, defpackage.C2063 r5) {
            r1 = this;
            r1.<init>()
            ᛱᛴᲁᛴ r0 = defpackage.C0082.m543()
            r1.f6412 = r0
            r1.f6413 = r2
            java.lang.String r2 = "Argument must not be null"
            defpackage.C0292.m944(r3, r2)
            r1.f6416 = r3
            defpackage.C0292.m944(r4, r2)
            r1.f6415 = r4
            defpackage.C0292.m944(r5, r2)
            r1.f6414 = r5
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static java.io.IOException m2656(java.lang.IllegalArgumentException r3, int r4, int r5, java.lang.String r6, android.graphics.BitmapFactory.Options r7) {
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception decoding bitmap, outWidth: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", outHeight: "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ", outMimeType: "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = ", inBitmap: "
            r1.append(r4)
            android.graphics.Bitmap r4 = r7.inBitmap
            java.lang.String r4 = m2657(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static java.lang.String m2657(android.graphics.Bitmap r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " ("
            r0.<init>(r1)
            int r1 = r3.getAllocationByteCount()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r1.<init>(r2)
            int r2 = r3.getWidth()
            r1.append(r2)
            java.lang.String r2 = "x"
            r1.append(r2)
            int r2 = r3.getHeight()
            r1.append(r2)
            java.lang.String r2 = "] "
            r1.append(r2)
            android.graphics.Bitmap$Config r3 = r3.getConfig()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static android.graphics.Bitmap m2658(defpackage.C1326 r5, android.graphics.BitmapFactory.Options r6, defpackage.InterfaceC1983 r7, defpackage.InterfaceC1612 r8) {
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L22
            r7.mo2712()
            int r1 = r5.f5858
            switch(r1) {
                case 15: goto L22;
                case 16: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r5.f5856
            ᛸᲈᛸᲈ r1 = (defpackage.C1606) r1
            java.lang.Object r1 = r1.f7101
            ᲈᛵᲈᛲ r1 = (defpackage.C2250) r1
            monitor-enter(r1)
            byte[] r2 = r1.f9573     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f9571 = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r5
        L22:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = defpackage.AbstractC1538.f6792
            r4.lock()
            android.graphics.Bitmap r5 = r5.m2476(r6)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L5c
            r4.unlock()
            return r5
        L35:
            r4 = move-exception
            java.io.IOException r1 = m2656(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L5c
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L46
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L5c
        L46:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5b
            r8.mo1257(r0)     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            android.graphics.Bitmap r5 = m2658(r5, r6, r7, r8)     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            java.util.concurrent.locks.Lock r6 = defpackage.AbstractC1538.f6792
            r6.unlock()
            return r5
        L5a:
            throw r1     // Catch: java.lang.Throwable -> L5c
        L5b:
            throw r1     // Catch: java.lang.Throwable -> L5c
        L5c:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = defpackage.AbstractC1538.f6792
            r6.unlock()
            throw r5
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static void m2659(android.graphics.BitmapFactory.Options r3) {
            r0 = 0
            r3.inTempStorage = r0
            r1 = 0
            r3.inDither = r1
            r3.inScaled = r1
            r2 = 1
            r3.inSampleSize = r2
            r3.inPreferredConfig = r0
            r3.inJustDecodeBounds = r1
            r3.inDensity = r1
            r3.inTargetDensity = r1
            r3.inPreferredColorSpace = r0
            r3.outColorSpace = r0
            r3.outConfig = r0
            r3.outWidth = r1
            r3.outHeight = r1
            r3.outMimeType = r0
            r3.inBitmap = r0
            r3.inMutable = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0162 m2660(defpackage.C1326 r15, int r16, int r17, defpackage.C0533 r18, defpackage.InterfaceC1983 r19) {
            r14 = this;
            r0 = r18
            ᲇᛶᛳᛱ r2 = r14.f6414
            r3 = 65536(0x10000, float:9.1835E-41)
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Object r2 = r2.m3464(r4, r3)
            r12 = r2
            byte[] r12 = (byte[]) r12
            java.lang.Class<ᛸᛳᲀᛱ> r2 = defpackage.C1459.class
            monitor-enter(r2)
            java.util.ArrayDeque r13 = defpackage.C1459.f6407     // Catch: java.lang.Throwable -> L27
            monitor-enter(r13)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r3 = r13.poll()     // Catch: java.lang.Throwable -> La4
            android.graphics.BitmapFactory$Options r3 = (android.graphics.BitmapFactory.Options) r3     // Catch: java.lang.Throwable -> La4
            monitor-exit(r13)     // Catch: java.lang.Throwable -> La4
            if (r3 != 0) goto L2a
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L27
            r3.<init>()     // Catch: java.lang.Throwable -> L27
            m2659(r3)     // Catch: java.lang.Throwable -> L27
            goto L2a
        L27:
            r0 = move-exception
            goto La7
        L2a:
            monitor-exit(r2)
            r3.inTempStorage = r12
            ᛵᲇᛳᲇ r2 = defpackage.C1459.f6410
            java.lang.Object r2 = r0.m1326(r2)
            r5 = r2
            ᛲᛶᛶᲁ r5 = (defpackage.EnumC0308) r5
            ᛵᲇᛳᲇ r2 = defpackage.C1459.f6411
            java.lang.Object r2 = r0.m1326(r2)
            r6 = r2
            ᛸᛵᛷᛳ r6 = (defpackage.EnumC1492) r6
            ᛵᲇᛳᲇ r2 = defpackage.C0521.f2575
            java.lang.Object r2 = r0.m1326(r2)
            r4 = r2
            ᛳᛸᛲᛲ r4 = (defpackage.C0521) r4
            ᛵᲇᛳᲇ r2 = defpackage.C1459.f6406
            java.lang.Object r2 = r0.m1326(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r10 = r2.booleanValue()
            ᛵᲇᛳᲇ r2 = defpackage.C1459.f6408
            java.lang.Object r7 = r0.m1326(r2)
            if (r7 == 0) goto L73
            java.lang.Object r0 = r0.m1326(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L73
            r0 = 1
        L69:
            r1 = r14
            r2 = r15
            r8 = r16
            r9 = r17
            r11 = r19
            r7 = r0
            goto L75
        L73:
            r0 = 0
            goto L69
        L75:
            android.graphics.Bitmap r0 = r1.m2661(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L90
            ᛸᲈᲇᲁ r2 = r14.f6415     // Catch: java.lang.Throwable -> L90
            ᛱᲀᛴᲁ r0 = defpackage.C0162.m691(r2, r0)     // Catch: java.lang.Throwable -> L90
            m2659(r3)
            monitor-enter(r13)
            r13.offer(r3)     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L8d
            ᲇᛶᛳᛱ r1 = r14.f6414
            r1.m3468(r12)
            return r0
        L8d:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L8d
            throw r0
        L90:
            r0 = move-exception
            m2659(r3)
            java.util.ArrayDeque r4 = defpackage.C1459.f6407
            monitor-enter(r4)
            r4.offer(r3)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La1
            ᲇᛶᛳᛱ r1 = r14.f6414
            r1.m3468(r12)
            throw r0
        La1:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La1
            throw r0
        La4:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> La4
            throw r0     // Catch: java.lang.Throwable -> L27
        La7:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Bitmap m2661(defpackage.C1326 r43, android.graphics.BitmapFactory.Options r44, defpackage.C0521 r45, defpackage.EnumC0308 r46, defpackage.EnumC1492 r47, boolean r48, int r49, int r50, boolean r51, defpackage.InterfaceC1983 r52) {
            r42 = this;
            r1 = r42
            r2 = r43
            r3 = r44
            r0 = r45
            r6 = r49
            r7 = r50
            r8 = r52
            int r9 = defpackage.AbstractC1856.f8102
            long r9 = android.os.SystemClock.elapsedRealtimeNanos()
            r11 = 1
            r3.inJustDecodeBounds = r11
            ᛸᲈᲇᲁ r12 = r1.f6415
            m2658(r2, r3, r8, r12)
            r13 = 0
            r3.inJustDecodeBounds = r13
            int r14 = r3.outWidth
            int r15 = r3.outHeight
            int[] r14 = new int[]{r14, r15}
            r15 = r14[r13]
            r14 = r14[r11]
            java.lang.String r11 = r3.outMimeType
            r13 = -1
            if (r15 == r13) goto L36
            if (r14 != r13) goto L33
            goto L36
        L33:
            r17 = r48
            goto L38
        L36:
            r17 = 0
        L38:
            int r13 = r2.f5858
            r19 = 0
            switch(r13) {
                case 15: goto Lbb;
                case 16: goto L9f;
                default: goto L3f;
            }
        L3f:
            java.lang.Object r13 = r2.f5857
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r20 = r9
            java.lang.Object r9 = r2.f5859
            com.bumptech.glide.load.data.ᛷᲁᛳᛳ r9 = (com.bumptech.glide.load.data.C0006) r9
            java.lang.Object r10 = r2.f5856
            ᲇᛶᛳᛱ r10 = (defpackage.C2063) r10
            r48 = r9
            int r9 = r13.size()
            r22 = r11
            r11 = 0
        L56:
            if (r11 >= r9) goto L9d
            java.lang.Object r23 = r13.get(r11)
            r24 = r9
            r9 = r23
            ᛷᛱᲇᛴ r9 = (defpackage.InterfaceC1215) r9
            r23 = r11
            ᲈᛵᲈᛲ r11 = new ᲈᛵᲈᛲ     // Catch: java.lang.Throwable -> L93
            r25 = r13
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L93
            android.os.ParcelFileDescriptor r26 = r48.m231()     // Catch: java.lang.Throwable -> L93
            java.io.FileDescriptor r5 = r26.getFileDescriptor()     // Catch: java.lang.Throwable -> L93
            r13.<init>(r5)     // Catch: java.lang.Throwable -> L93
            r11.<init>(r13, r10)     // Catch: java.lang.Throwable -> L93
            int r5 = r9.mo804(r11, r10)     // Catch: java.lang.Throwable -> L8f
            r11.m3637()
            r48.m231()
            r9 = -1
            if (r5 == r9) goto L88
        L85:
            r13 = r5
            goto L106
        L88:
            int r11 = r23 + 1
            r9 = r24
            r13 = r25
            goto L56
        L8f:
            r0 = move-exception
            r19 = r11
            goto L94
        L93:
            r0 = move-exception
        L94:
            if (r19 == 0) goto L99
            r19.m3637()
        L99:
            r48.m231()
            throw r0
        L9d:
            r13 = -1
            goto L106
        L9f:
            r20 = r9
            r22 = r11
            java.lang.Object r5 = r2.f5859
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r9 = r2.f5856
            ᛸᲈᛸᲈ r9 = (defpackage.C1606) r9
            java.lang.Object r9 = r9.f7101
            ᲈᛵᲈᛲ r9 = (defpackage.C2250) r9
            r9.reset()
            java.lang.Object r10 = r2.f5857
            ᲇᛶᛳᛱ r10 = (defpackage.C2063) r10
            int r13 = defpackage.AbstractC1849.m3257(r5, r9, r10)
            goto L106
        Lbb:
            r20 = r9
            r22 = r11
            java.lang.Object r5 = r2.f5857
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r9 = r2.f5856
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            java.nio.ByteBuffer r9 = defpackage.AbstractC0036.m362(r9)
            java.lang.Object r10 = r2.f5859
            ᲇᛶᛳᛱ r10 = (defpackage.C2063) r10
            if (r9 != 0) goto Ld3
        Ld1:
            r10 = -1
            goto L105
        Ld3:
            int r11 = r5.size()
            r13 = 0
        Ld8:
            if (r13 >= r11) goto Ld1
            java.lang.Object r23 = r5.get(r13)
            r48 = r5
            r5 = r23
            ᛷᛱᲇᛴ r5 = (defpackage.InterfaceC1215) r5
            int r5 = r5.mo801(r9, r10)     // Catch: java.lang.Throwable -> Lfc
            r23 = r10
            r10 = 0
            java.nio.Buffer r16 = r9.position(r10)
            java.nio.ByteBuffer r16 = (java.nio.ByteBuffer) r16
            r10 = -1
            if (r5 == r10) goto Lf5
            goto L85
        Lf5:
            int r13 = r13 + 1
            r5 = r48
            r10 = r23
            goto Ld8
        Lfc:
            r0 = move-exception
            r10 = 0
            java.nio.Buffer r1 = r9.position(r10)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            throw r0
        L105:
            r13 = r10
        L106:
            r5 = 90
            switch(r13) {
                case 3: goto L112;
                case 4: goto L112;
                case 5: goto L110;
                case 6: goto L110;
                case 7: goto L10d;
                case 8: goto L10d;
                default: goto L10b;
            }
        L10b:
            r10 = 0
            goto L114
        L10d:
            r10 = 270(0x10e, float:3.78E-43)
            goto L114
        L110:
            r10 = r5
            goto L114
        L112:
            r10 = 180(0xb4, float:2.52E-43)
        L114:
            switch(r13) {
                case 2: goto L119;
                case 3: goto L119;
                case 4: goto L119;
                case 5: goto L119;
                case 6: goto L119;
                case 7: goto L119;
                case 8: goto L119;
                default: goto L117;
            }
        L117:
            r11 = 0
            goto L11a
        L119:
            r11 = 1
        L11a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r9) goto L12d
            if (r10 == r5) goto L128
            r5 = 270(0x10e, float:3.78E-43)
            if (r10 != r5) goto L125
            goto L12a
        L125:
            r27 = r15
            goto L131
        L128:
            r5 = 270(0x10e, float:3.78E-43)
        L12a:
            r27 = r14
            goto L131
        L12d:
            r5 = 270(0x10e, float:3.78E-43)
            r27 = r6
        L131:
            if (r7 != r9) goto L13e
            r9 = 90
            if (r10 == r9) goto L13c
            if (r10 != r5) goto L13a
            goto L13c
        L13a:
            r5 = r14
            goto L13f
        L13c:
            r5 = r15
            goto L13f
        L13e:
            r5 = r7
        L13f:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = r2.m2478()
            r23 = r13
            java.lang.String r13 = ", target density: "
            java.lang.String r7 = ", density: "
            r26 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r6 = "x"
            java.lang.String r4 = "Downsampler"
            r28 = r11
            java.lang.String r11 = "]"
            if (r15 <= 0) goto L157
            if (r14 > 0) goto L161
        L157:
            r8 = r7
            r0 = r11
            r45 = r12
            r7 = r13
            r1 = r27
            r10 = 3
            goto L360
        L161:
            r1 = 90
            if (r10 == r1) goto L175
            r1 = 270(0x10e, float:3.78E-43)
            if (r10 != r1) goto L16a
            goto L175
        L16a:
            r18 = r7
            r48 = r11
            r7 = r14
            r11 = r15
        L170:
            r1 = r27
            r27 = r13
            goto L17c
        L175:
            r18 = r7
            r48 = r11
            r11 = r14
            r7 = r15
            goto L170
        L17c:
            float r13 = r0.m1313(r11, r7, r1, r5)
            r29 = 0
            int r29 = (r13 > r29 ? 1 : (r13 == r29 ? 0 : -1))
            if (r29 <= 0) goto L322
            r29 = r13
            int r13 = r0.m1312(r11, r7, r1, r5)
            if (r13 == 0) goto L31c
            r30 = r10
            float r10 = (float) r11
            r48 = r10
            float r10 = r29 * r48
            r31 = r11
            double r10 = (double) r10
            r32 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r10 = r10 + r32
            int r10 = (int) r10
            float r11 = (float) r7
            r34 = r7
            float r7 = r29 * r11
            r35 = r10
            r36 = r11
            double r10 = (double) r7
            double r10 = r10 + r32
            int r7 = (int) r10
            int r11 = r31 / r35
            int r7 = r34 / r7
            r10 = 1
            if (r13 != r10) goto L1b6
            int r7 = java.lang.Math.max(r11, r7)
            goto L1ba
        L1b6:
            int r7 = java.lang.Math.min(r11, r7)
        L1ba:
            int r7 = java.lang.Integer.highestOneBit(r7)
            int r7 = java.lang.Math.max(r10, r7)
            if (r13 != r10) goto L1cd
            float r10 = (float) r7
            float r11 = r26 / r29
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L1cd
            int r7 = r7 << 1
        L1cd:
            r3.inSampleSize = r7
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG
            if (r9 != r10) goto L1f4
            r9 = 8
            int r9 = java.lang.Math.min(r7, r9)
            float r9 = (float) r9
            float r10 = r48 / r9
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            float r11 = r36 / r9
            r13 = r10
            double r9 = (double) r11
            double r9 = java.lang.Math.ceil(r9)
            int r9 = (int) r9
            int r10 = r7 / 8
            if (r10 <= 0) goto L234
            int r11 = r13 / r10
            int r9 = r9 / r10
            r10 = r11
            goto L249
        L1f4:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG
            if (r9 == r10) goto L236
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A
            if (r9 != r10) goto L1fd
            goto L236
        L1fd:
            boolean r9 = r9.isWebp()
            if (r9 == 0) goto L211
            float r9 = (float) r7
            float r10 = r48 / r9
            int r10 = java.lang.Math.round(r10)
            float r11 = r36 / r9
            int r9 = java.lang.Math.round(r11)
            goto L249
        L211:
            int r11 = r31 % r7
            if (r11 != 0) goto L219
            int r9 = r34 % r7
            if (r9 == 0) goto L21b
        L219:
            r10 = 1
            goto L220
        L21b:
            int r10 = r31 / r7
            int r9 = r34 / r7
            goto L249
        L220:
            r3.inJustDecodeBounds = r10
            m2658(r2, r3, r8, r12)
            r9 = 0
            r3.inJustDecodeBounds = r9
            int r11 = r3.outWidth
            int r13 = r3.outHeight
            int[] r11 = new int[]{r11, r13}
            r13 = r11[r9]
            r9 = r11[r10]
        L234:
            r10 = r13
            goto L249
        L236:
            float r9 = (float) r7
            float r10 = r48 / r9
            double r10 = (double) r10
            double r10 = java.lang.Math.floor(r10)
            int r10 = (int) r10
            float r11 = r36 / r9
            r13 = r10
            double r9 = (double) r11
            double r9 = java.lang.Math.floor(r9)
            int r9 = (int) r9
            goto L234
        L249:
            float r0 = r0.m1313(r10, r9, r1, r5)
            r13 = r12
            double r11 = (double) r0
            r34 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r11 > r34 ? 1 : (r11 == r34 ? 0 : -1))
            if (r0 > 0) goto L258
            r36 = r11
            goto L25a
        L258:
            double r36 = r34 / r11
        L25a:
            r38 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r36 = r36 * r38
            r40 = r11
            long r11 = java.lang.Math.round(r36)
            int r11 = (int) r11
            r45 = r13
            double r12 = (double) r11
            double r12 = r12 * r40
            double r12 = r12 + r32
            int r12 = (int) r12
            float r13 = (float) r12
            float r11 = (float) r11
            float r13 = r13 / r11
            r11 = r7
            double r7 = (double) r13
            double r7 = r40 / r7
            double r12 = (double) r12
            double r7 = r7 * r12
            double r7 = r7 + r32
            int r7 = (int) r7
            r3.inTargetDensity = r7
            if (r0 > 0) goto L283
            r34 = r40
            goto L285
        L283:
            double r34 = r34 / r40
        L285:
            double r34 = r34 * r38
            long r7 = java.lang.Math.round(r34)
            int r0 = (int) r7
            r3.inDensity = r0
            int r7 = r3.inTargetDensity
            if (r7 <= 0) goto L29b
            if (r0 <= 0) goto L29b
            if (r7 == r0) goto L29b
            r7 = 1
            r3.inScaled = r7
        L299:
            r7 = 2
            goto L2a1
        L29b:
            r7 = 0
            r3.inTargetDensity = r7
            r3.inDensity = r7
            goto L299
        L2a1:
            boolean r0 = android.util.Log.isLoggable(r4, r7)
            if (r0 == 0) goto L317
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Calculate scaling, source: ["
            r0.<init>(r7)
            r0.append(r15)
            r0.append(r6)
            r0.append(r14)
            java.lang.String r7 = "], degreesToRotate: "
            r0.append(r7)
            r7 = r30
            r0.append(r7)
            java.lang.String r7 = ", target: ["
            r0.append(r7)
            r0.append(r1)
            r0.append(r6)
            r0.append(r5)
            java.lang.String r7 = "], power of two scaled: ["
            r0.append(r7)
            r0.append(r10)
            r0.append(r6)
            r0.append(r9)
            java.lang.String r7 = "], exact scale factor: "
            r0.append(r7)
            r7 = r29
            r0.append(r7)
            java.lang.String r7 = ", power of 2 sample size: "
            r0.append(r7)
            r0.append(r11)
            java.lang.String r7 = ", adjusted scale factor: "
            r0.append(r7)
            r7 = r40
            r0.append(r7)
            r7 = r27
            r0.append(r7)
            int r8 = r3.inTargetDensity
            r0.append(r8)
            r8 = r18
            r0.append(r8)
            int r9 = r3.inDensity
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r4, r0)
        L314:
            r9 = r42
            goto L389
        L317:
            r8 = r18
            r7 = r27
            goto L314
        L31c:
            java.lang.String r0 = "Cannot round with null rounding"
            defpackage.C2264.m3684(r0)
            return r19
        L322:
            r7 = r13
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot scale with factor: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r4 = " from: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", source: ["
            r3.append(r0)
            r3.append(r15)
            r3.append(r6)
            r3.append(r14)
            java.lang.String r0 = "], target: ["
            r3.append(r0)
            r3.append(r1)
            r3.append(r6)
            r3.append(r5)
            r0 = r48
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L360:
            boolean r11 = android.util.Log.isLoggable(r4, r10)
            if (r11 == 0) goto L314
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Unable to determine dimensions for: "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = " with target ["
            r10.append(r9)
            r10.append(r1)
            r10.append(r6)
            r10.append(r5)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            android.util.Log.d(r4, r0)
            goto L314
        L389:
            ᛱᛴᲁᛴ r0 = r9.f6412
            r10 = r17
            r11 = r28
            boolean r0 = r0.m544(r1, r5, r10, r11)
            if (r0 == 0) goto L39d
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r10
            r10 = 0
            r3.inMutable = r10
            goto L39e
        L39d:
            r10 = 0
        L39e:
            if (r0 == 0) goto L3a1
            goto L3df
        L3a1:
            ᛲᛶᛶᲁ r0 = defpackage.EnumC0308.f1637
            r11 = r46
            if (r11 == r0) goto L3db
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r2.m2478()     // Catch: java.io.IOException -> L3b0
            boolean r13 = r0.hasAlpha()     // Catch: java.io.IOException -> L3b0
            goto L3ca
        L3b0:
            r0 = move-exception
            r12 = 3
            boolean r12 = android.util.Log.isLoggable(r4, r12)
            if (r12 == 0) goto L3c9
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Cannot determine whether the image has alpha or not from header, format "
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            android.util.Log.d(r4, r11, r0)
        L3c9:
            r13 = r10
        L3ca:
            if (r13 == 0) goto L3cf
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L3d1
        L3cf:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L3d1:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r10) goto L3df
            r10 = 1
            r3.inDither = r10
            goto L3df
        L3db:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L3df:
            if (r15 < 0) goto L3e7
            if (r14 < 0) goto L3e7
            if (r51 == 0) goto L3e7
            goto L466
        L3e7:
            int r0 = r3.inTargetDensity
            if (r0 <= 0) goto L3f5
            int r1 = r3.inDensity
            if (r1 <= 0) goto L3f5
            if (r0 == r1) goto L3f5
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
            goto L3f7
        L3f5:
            r0 = r26
        L3f7:
            int r1 = r3.inSampleSize
            float r5 = (float) r15
            float r10 = (float) r1
            float r5 = r5 / r10
            double r11 = (double) r5
            double r11 = java.lang.Math.ceil(r11)
            int r5 = (int) r11
            float r11 = (float) r14
            float r11 = r11 / r10
            double r10 = (double) r11
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            float r5 = (float) r5
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            float r10 = (float) r10
            float r10 = r10 * r0
            int r10 = java.lang.Math.round(r10)
            r11 = 2
            boolean r12 = android.util.Log.isLoggable(r4, r11)
            if (r12 == 0) goto L464
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Calculated target ["
            r11.<init>(r12)
            r11.append(r5)
            r11.append(r6)
            r11.append(r10)
            java.lang.String r12 = "] for source ["
            r11.append(r12)
            r11.append(r15)
            r11.append(r6)
            r11.append(r14)
            java.lang.String r12 = "], sampleSize: "
            r11.append(r12)
            r11.append(r1)
            java.lang.String r1 = ", targetDensity: "
            r11.append(r1)
            int r1 = r3.inTargetDensity
            r11.append(r1)
            r11.append(r8)
            int r1 = r3.inDensity
            r11.append(r1)
            java.lang.String r1 = ", density multiplier: "
            r11.append(r1)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Log.v(r4, r0)
        L464:
            r1 = r5
            r5 = r10
        L466:
            if (r1 <= 0) goto L481
            if (r5 <= 0) goto L481
            android.graphics.Bitmap$Config r0 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.HARDWARE
            if (r0 != r10) goto L471
            goto L481
        L471:
            android.graphics.Bitmap$Config r10 = r3.outConfig
            if (r10 != 0) goto L478
        L475:
            r13 = r45
            goto L47a
        L478:
            r0 = r10
            goto L475
        L47a:
            android.graphics.Bitmap r0 = r13.mo1261(r1, r5, r0)
            r3.inBitmap = r0
            goto L483
        L481:
            r13 = r45
        L483:
            if (r47 == 0) goto L4a0
            ᛸᛵᛷᛳ r0 = defpackage.EnumC1492.f6587
            r5 = r47
            if (r5 != r0) goto L498
            android.graphics.ColorSpace r0 = r3.outColorSpace
            if (r0 == 0) goto L498
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L498
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L49a
        L498:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L49a:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L4a0:
            r1 = r52
            android.graphics.Bitmap r0 = m2658(r2, r3, r1, r13)
            r1.mo2715(r13, r0)
            r11 = 2
            boolean r1 = android.util.Log.isLoggable(r4, r11)
            if (r1 == 0) goto L533
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Decoded "
            r1.<init>(r2)
            java.lang.String r2 = m2657(r0)
            r1.append(r2)
            java.lang.String r2 = " from ["
            r1.append(r2)
            r1.append(r15)
            r1.append(r6)
            r1.append(r14)
            java.lang.String r2 = "] "
            r1.append(r2)
            r2 = r22
            r1.append(r2)
            java.lang.String r2 = " with inBitmap "
            r1.append(r2)
            android.graphics.Bitmap r2 = r3.inBitmap
            java.lang.String r2 = m2657(r2)
            r1.append(r2)
            java.lang.String r2 = " for ["
            r1.append(r2)
            r2 = r49
            r1.append(r2)
            r1.append(r6)
            r2 = r50
            r1.append(r2)
            java.lang.String r2 = "], sample size: "
            r1.append(r2)
            int r2 = r3.inSampleSize
            r1.append(r2)
            r1.append(r8)
            int r2 = r3.inDensity
            r1.append(r2)
            r1.append(r7)
            int r2 = r3.inTargetDensity
            r1.append(r2)
            java.lang.String r2 = ", thread: "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ", duration: "
            r1.append(r2)
            double r2 = defpackage.AbstractC1856.m3272(r20)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r4, r1)
        L533:
            if (r0 == 0) goto L5a8
            android.util.DisplayMetrics r1 = r9.f6416
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            switch(r23) {
                case 2: goto L541;
                case 3: goto L541;
                case 4: goto L541;
                case 5: goto L541;
                case 6: goto L541;
                case 7: goto L541;
                case 8: goto L541;
                default: goto L53f;
            }
        L53f:
            r1 = r0
            goto L59d
        L541:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2 = 1127481344(0x43340000, float:180.0)
            r3 = 1119092736(0x42b40000, float:90.0)
            r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r23) {
                case 2: goto L579;
                case 3: goto L575;
                case 4: goto L56c;
                case 5: goto L563;
                case 6: goto L55f;
                case 7: goto L556;
                case 8: goto L552;
                default: goto L551;
            }
        L551:
            goto L57e
        L552:
            r1.setRotate(r4)
            goto L57e
        L556:
            r1.setRotate(r4)
            r4 = r26
            r1.postScale(r5, r4)
            goto L57e
        L55f:
            r1.setRotate(r3)
            goto L57e
        L563:
            r4 = r26
            r1.setRotate(r3)
            r1.postScale(r5, r4)
            goto L57e
        L56c:
            r4 = r26
            r1.setRotate(r2)
            r1.postScale(r5, r4)
            goto L57e
        L575:
            r1.setRotate(r2)
            goto L57e
        L579:
            r4 = r26
            r1.setScale(r5, r4)
        L57e:
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r4 = 1
            r5 = 0
            r6 = 0
            r42 = r0
            r47 = r1
            r45 = r2
            r46 = r3
            r48 = r4
            r43 = r5
            r44 = r6
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r42, r43, r44, r45, r46, r47, r48)
            r1 = r42
        L59d:
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L5a6
            r13.mo1257(r1)
        L5a6:
            r19 = r0
        L5a8:
            return r19
    }
}
