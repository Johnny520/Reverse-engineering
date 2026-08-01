package defpackage;

/* JADX INFO: renamed from: ᛳᛵᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0480 implements defpackage.InterfaceC1612 {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final android.graphics.Bitmap.Config f2410 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f2411;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f2412;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final long f2413;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.Set f2414;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1366 f2415;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f2416;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public long f2417;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f2418;

    static {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            defpackage.C0480.f2410 = r0
            return
    }

    public C0480(long r4) {
            r3 = this;
            ᛷᲁᛳᛶ r0 = new ᛷᲁᛳᛶ
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            android.graphics.Bitmap$Config[] r2 = android.graphics.Bitmap.Config.values()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            r2 = 0
            r1.add(r2)
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
            r1.remove(r2)
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            r3.<init>()
            r3.f2413 = r4
            r3.f2415 = r0
            r3.f2414 = r1
            return
    }

    @Override // defpackage.InterfaceC1612
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final android.graphics.Bitmap mo1254(int r1, int r2, android.graphics.Bitmap.Config r3) {
            r0 = this;
            android.graphics.Bitmap r0 = r0.m1260(r1, r2, r3)
            if (r0 == 0) goto Lb
            r1 = 0
            r0.eraseColor(r1)
            return r0
        Lb:
            if (r3 == 0) goto Le
            goto L10
        Le:
            android.graphics.Bitmap$Config r3 = defpackage.C0480.f2410
        L10:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final synchronized void m1255(long r7) {
            r6 = this;
            monitor-enter(r6)
        L1:
            long r0 = r6.f2417     // Catch: java.lang.Throwable -> L34
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L88
            ᛷᲁᛳᛶ r0 = r6.f2415     // Catch: java.lang.Throwable -> L34
            ᛴᛵᲇᲇ r1 = r0.f5976     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r1.m1554()     // Catch: java.lang.Throwable -> L34
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L1e
            int r2 = defpackage.AbstractC1754.m3136(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L34
            r0.m2538(r2, r1)     // Catch: java.lang.Throwable -> L34
        L1e:
            if (r1 != 0) goto L3c
            java.lang.String r7 = "LruBitmapPool"
            r8 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r8)     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L36
            java.lang.String r7 = "LruBitmapPool"
            java.lang.String r8 = "Size mismatch, resetting"
            android.util.Log.w(r7, r8)     // Catch: java.lang.Throwable -> L34
            r6.m1256()     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r7 = move-exception
            goto L8a
        L36:
            r7 = 0
            r6.f2417 = r7     // Catch: java.lang.Throwable -> L34
            monitor-exit(r6)
            return
        L3c:
            long r2 = r6.f2417     // Catch: java.lang.Throwable -> L34
            int r0 = defpackage.AbstractC1754.m3136(r1)     // Catch: java.lang.Throwable -> L34
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L34
            long r2 = r2 - r4
            r6.f2417 = r2     // Catch: java.lang.Throwable -> L34
            int r0 = r6.f2416     // Catch: java.lang.Throwable -> L34
            int r0 = r0 + 1
            r6.f2416 = r0     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "LruBitmapPool"
            r2 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L77
            java.lang.String r0 = "LruBitmapPool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "Evicting bitmap="
            r2.append(r3)     // Catch: java.lang.Throwable -> L34
            int r3 = defpackage.AbstractC1754.m3136(r1)     // Catch: java.lang.Throwable -> L34
            android.graphics.Bitmap$Config r4 = r1.getConfig()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = defpackage.C1366.m2535(r3, r4)     // Catch: java.lang.Throwable -> L34
            r2.append(r3)     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L34
            android.util.Log.d(r0, r2)     // Catch: java.lang.Throwable -> L34
        L77:
            java.lang.String r0 = "LruBitmapPool"
            r2 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L83
            r6.m1256()     // Catch: java.lang.Throwable -> L34
        L83:
            r1.recycle()     // Catch: java.lang.Throwable -> L34
            goto L1
        L88:
            monitor-exit(r6)
            return
        L8a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L34
            throw r7
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1256() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Hits="
            r0.<init>(r1)
            int r1 = r3.f2418
            r0.append(r1)
            java.lang.String r1 = ", misses="
            r0.append(r1)
            int r1 = r3.f2411
            r0.append(r1)
            java.lang.String r1 = ", puts="
            r0.append(r1)
            int r1 = r3.f2412
            r0.append(r1)
            java.lang.String r1 = ", evictions="
            r0.append(r1)
            int r1 = r3.f2416
            r0.append(r1)
            java.lang.String r1 = ", currentSize="
            r0.append(r1)
            long r1 = r3.f2417
            r0.append(r1)
            java.lang.String r1 = ", maxSize="
            r0.append(r1)
            long r1 = r3.f2413
            r0.append(r1)
            java.lang.String r1 = "\nStrategy="
            r0.append(r1)
            ᛷᲁᛳᛶ r3 = r3.f2415
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "LruBitmapPool"
            android.util.Log.v(r0, r3)
            return
    }

    @Override // defpackage.InterfaceC1612
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final synchronized void mo1257(android.graphics.Bitmap r9) {
            r8 = this;
            java.lang.String r0 = "Reject bitmap from pool, bitmap: "
            java.lang.String r1 = "Put bitmap in pool="
            monitor-enter(r8)
            if (r9 == 0) goto Lc3
            boolean r2 = r9.isRecycled()     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto Lbb
            boolean r2 = r9.isMutable()     // Catch: java.lang.Throwable -> L5f
            r3 = 2
            if (r2 == 0) goto L73
            int r2 = defpackage.AbstractC1754.m3136(r9)     // Catch: java.lang.Throwable -> L5f
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L5f
            long r6 = r8.f2413     // Catch: java.lang.Throwable -> L5f
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L73
            java.util.Set r2 = r8.f2414     // Catch: java.lang.Throwable -> L5f
            android.graphics.Bitmap$Config r4 = r9.getConfig()     // Catch: java.lang.Throwable -> L5f
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L2c
            goto L73
        L2c:
            int r0 = defpackage.AbstractC1754.m3136(r9)     // Catch: java.lang.Throwable -> L5f
            ᛷᲁᛳᛶ r2 = r8.f2415     // Catch: java.lang.Throwable -> L5f
            r2.m2536(r9)     // Catch: java.lang.Throwable -> L5f
            int r2 = r8.f2412     // Catch: java.lang.Throwable -> L5f
            int r2 = r2 + 1
            r8.f2412 = r2     // Catch: java.lang.Throwable -> L5f
            long r4 = r8.f2417     // Catch: java.lang.Throwable -> L5f
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L5f
            long r4 = r4 + r6
            r8.f2417 = r4     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L61
            java.lang.String r0 = "LruBitmapPool"
            int r2 = defpackage.AbstractC1754.m3136(r9)     // Catch: java.lang.Throwable -> L5f
            android.graphics.Bitmap$Config r9 = r9.getConfig()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r9 = defpackage.C1366.m2535(r2, r9)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r9 = r1.concat(r9)     // Catch: java.lang.Throwable -> L5f
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r9 = move-exception
            goto Lcb
        L61:
            java.lang.String r9 = "LruBitmapPool"
            boolean r9 = android.util.Log.isLoggable(r9, r3)     // Catch: java.lang.Throwable -> L5f
            if (r9 == 0) goto L6c
            r8.m1256()     // Catch: java.lang.Throwable -> L5f
        L6c:
            long r0 = r8.f2413     // Catch: java.lang.Throwable -> L5f
            r8.m1255(r0)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r8)
            return
        L73:
            java.lang.String r1 = "LruBitmapPool"
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto Lb6
            java.lang.String r1 = "LruBitmapPool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            int r0 = defpackage.AbstractC1754.m3136(r9)     // Catch: java.lang.Throwable -> L5f
            android.graphics.Bitmap$Config r3 = r9.getConfig()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = defpackage.C1366.m2535(r0, r3)     // Catch: java.lang.Throwable -> L5f
            r2.append(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = ", is mutable: "
            r2.append(r0)     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r9.isMutable()     // Catch: java.lang.Throwable -> L5f
            r2.append(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = ", is allowed config: "
            r2.append(r0)     // Catch: java.lang.Throwable -> L5f
            java.util.Set r0 = r8.f2414     // Catch: java.lang.Throwable -> L5f
            android.graphics.Bitmap$Config r3 = r9.getConfig()     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> L5f
            r2.append(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L5f
            android.util.Log.v(r1, r0)     // Catch: java.lang.Throwable -> L5f
        Lb6:
            r9.recycle()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r8)
            return
        Lbb:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "Cannot pool recycled bitmap"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            throw r9     // Catch: java.lang.Throwable -> L5f
        Lc3:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "Bitmap must not be null"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            throw r9     // Catch: java.lang.Throwable -> L5f
        Lcb:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5f
            throw r9
    }

    @Override // defpackage.InterfaceC1612
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final void mo1258(int r5) {
            r4 = this;
            r0 = 3
            java.lang.String r1 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "trimMemory, level="
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1a:
            r0 = 40
            if (r5 >= r0) goto L34
            r0 = 20
            if (r5 < r0) goto L23
            goto L34
        L23:
            if (r5 >= r0) goto L2b
            r0 = 15
            if (r5 != r0) goto L2a
            goto L2b
        L2a:
            return
        L2b:
            long r0 = r4.f2413
            r2 = 2
            long r0 = r0 / r2
            r4.m1255(r0)
            return
        L34:
            r4.mo1259()
            return
    }

    @Override // defpackage.InterfaceC1612
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final void mo1259() {
            r2 = this;
            r0 = 3
            java.lang.String r1 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = "clearMemory"
            android.util.Log.d(r1, r0)
        Le:
            r0 = 0
            r2.m1255(r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final synchronized android.graphics.Bitmap m1260(int r9, int r10, android.graphics.Bitmap.Config r11) {
            r8 = this;
            java.lang.String r0 = "Get bitmap="
            java.lang.String r1 = "Missing bitmap="
            monitor-enter(r8)
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE     // Catch: java.lang.Throwable -> L36
            if (r11 == r2) goto L7c
            ᛷᲁᛳᛶ r2 = r8.f2415     // Catch: java.lang.Throwable -> L36
            if (r11 == 0) goto Lf
            r3 = r11
            goto L11
        Lf:
            android.graphics.Bitmap$Config r3 = defpackage.C0480.f2410     // Catch: java.lang.Throwable -> L36
        L11:
            android.graphics.Bitmap r2 = r2.m2539(r9, r10, r3)     // Catch: java.lang.Throwable -> L36
            r3 = 1
            if (r2 != 0) goto L3e
            java.lang.String r4 = "LruBitmapPool"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L38
            java.lang.String r4 = "LruBitmapPool"
            int r5 = r9 * r10
            int r6 = defpackage.AbstractC1754.m3137(r11)     // Catch: java.lang.Throwable -> L36
            int r6 = r6 * r5
            java.lang.String r5 = defpackage.C1366.m2535(r6, r11)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r1.concat(r5)     // Catch: java.lang.Throwable -> L36
            android.util.Log.d(r4, r1)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r9 = move-exception
            goto L95
        L38:
            int r1 = r8.f2411     // Catch: java.lang.Throwable -> L36
            int r1 = r1 + r3
            r8.f2411 = r1     // Catch: java.lang.Throwable -> L36
            goto L53
        L3e:
            int r1 = r8.f2418     // Catch: java.lang.Throwable -> L36
            int r1 = r1 + r3
            r8.f2418 = r1     // Catch: java.lang.Throwable -> L36
            long r4 = r8.f2417     // Catch: java.lang.Throwable -> L36
            int r1 = defpackage.AbstractC1754.m3136(r2)     // Catch: java.lang.Throwable -> L36
            long r6 = (long) r1     // Catch: java.lang.Throwable -> L36
            long r4 = r4 - r6
            r8.f2417 = r4     // Catch: java.lang.Throwable -> L36
            r2.setHasAlpha(r3)     // Catch: java.lang.Throwable -> L36
            r2.setPremultiplied(r3)     // Catch: java.lang.Throwable -> L36
        L53:
            java.lang.String r1 = "LruBitmapPool"
            r3 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L6f
            java.lang.String r1 = "LruBitmapPool"
            int r9 = r9 * r10
            int r10 = defpackage.AbstractC1754.m3137(r11)     // Catch: java.lang.Throwable -> L36
            int r10 = r10 * r9
            java.lang.String r9 = defpackage.C1366.m2535(r10, r11)     // Catch: java.lang.Throwable -> L36
            java.lang.String r9 = r0.concat(r9)     // Catch: java.lang.Throwable -> L36
            android.util.Log.v(r1, r9)     // Catch: java.lang.Throwable -> L36
        L6f:
            java.lang.String r9 = "LruBitmapPool"
            boolean r9 = android.util.Log.isLoggable(r9, r3)     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto L7a
            r8.m1256()     // Catch: java.lang.Throwable -> L36
        L7a:
            monitor-exit(r8)
            return r2
        L7c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "Cannot create a mutable Bitmap with config: "
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L36
            r10.append(r11)     // Catch: java.lang.Throwable -> L36
            java.lang.String r11 = ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"
            r10.append(r11)     // Catch: java.lang.Throwable -> L36
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L36
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L36
            throw r9     // Catch: java.lang.Throwable -> L36
        L95:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L36
            throw r9
    }

    @Override // defpackage.InterfaceC1612
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final android.graphics.Bitmap mo1261(int r1, int r2, android.graphics.Bitmap.Config r3) {
            r0 = this;
            android.graphics.Bitmap r0 = r0.m1260(r1, r2, r3)
            if (r0 != 0) goto Lf
            if (r3 == 0) goto L9
            goto Lb
        L9:
            android.graphics.Bitmap$Config r3 = defpackage.C0480.f2410
        Lb:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
        Lf:
            return r0
    }
}
