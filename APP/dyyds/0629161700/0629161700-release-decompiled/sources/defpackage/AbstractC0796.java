package defpackage;

/* JADX INFO: renamed from: ᛴᲈᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0796 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static android.graphics.Paint f3687;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1487 f3688 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C2301 f3689 = null;

    static {
            java.lang.String r0 = "TypefaceCompat static init"
            defpackage.AbstractC2193.m3597(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L13
            ᛲᲈᲇᲈ r0 = new ᛲᲈᲇᲈ
            r0.<init>()
            defpackage.AbstractC0796.f3688 = r0
            goto L1a
        L13:
            ᛸᛵᛴᛲ r0 = new ᛸᛵᛴᛲ
            r0.<init>()
            defpackage.AbstractC0796.f3688 = r0
        L1a:
            ᲈᛸᛲᛵ r0 = new ᲈᛸᛲᛵ
            r1 = 16
            r0.<init>(r1)
            defpackage.AbstractC0796.f3689 = r0
            r0 = 0
            defpackage.AbstractC0796.f3687 = r0
            android.os.Trace.endSection()
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static android.graphics.Typeface m1723(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La
            goto L1e
        La:
            r1 = 0
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r1)
            if (r3 == 0) goto L1e
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L1e
            return r3
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static java.lang.String m1724(android.content.res.Resources r1, int r2, java.lang.String r3, int r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getResourcePackageName(r2)
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static android.graphics.Typeface m1725(android.content.res.Resources r3, int r4, java.lang.String r5, int r6, int r7) {
            ᛸᛵᛴᛲ r0 = defpackage.AbstractC0796.f3688
            r0.getClass()
            android.graphics.fonts.Font$Builder r0 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L29
            r0.<init>(r3, r4)     // Catch: java.lang.Exception -> L29
            android.graphics.fonts.Font r0 = r0.build()     // Catch: java.lang.Exception -> L29
            android.graphics.fonts.FontFamily$Builder r1 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L29
            r1.<init>(r0)     // Catch: java.lang.Exception -> L29
            android.graphics.fonts.FontFamily r1 = r1.build()     // Catch: java.lang.Exception -> L29
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L29
            r2.<init>(r1)     // Catch: java.lang.Exception -> L29
            android.graphics.fonts.FontStyle r0 = r0.getStyle()     // Catch: java.lang.Exception -> L29
            android.graphics.Typeface$CustomFallbackBuilder r0 = r2.setStyle(r0)     // Catch: java.lang.Exception -> L29
            android.graphics.Typeface r0 = r0.build()     // Catch: java.lang.Exception -> L29
            goto L32
        L29:
            r0 = move-exception
            java.lang.String r1 = "TypefaceCompatApi29Impl"
            java.lang.String r2 = "Font load failed"
            android.util.Log.w(r1, r2, r0)
            r0 = 0
        L32:
            if (r0 == 0) goto L3d
            java.lang.String r3 = m1724(r3, r4, r5, r6, r7)
            ᲈᛸᛲᛵ r4 = defpackage.AbstractC0796.f3689
            r4.m3734(r3, r0)
        L3d:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static android.graphics.Typeface m1726(android.content.Context r2, defpackage.C0275[] r3, int r4) {
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            defpackage.AbstractC2193.m3597(r0)
            ᛸᛵᛴᛲ r0 = defpackage.AbstractC0796.f3688     // Catch: java.lang.Throwable -> L38
            r0.getClass()     // Catch: java.lang.Throwable -> L38
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            android.graphics.fonts.FontFamily r2 = r0.m2695(r3, r2)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            if (r2 != 0) goto L16
            goto L34
        L16:
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            r3.<init>(r2)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            android.graphics.fonts.Font r2 = defpackage.C1487.m2694(r2, r4)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            android.graphics.fonts.FontStyle r2 = r2.getStyle()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            android.graphics.Typeface$CustomFallbackBuilder r2 = r3.setStyle(r2)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            android.graphics.Typeface r1 = r2.build()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            goto L34
        L2c:
            r2 = move-exception
            java.lang.String r3 = "TypefaceCompatApi29Impl"
            java.lang.String r4 = "Font load failed"
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L38
        L34:
            android.os.Trace.endSection()
            return r1
        L38:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static android.graphics.Typeface m1727(android.content.Context r16, defpackage.InterfaceC1436 r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, defpackage.C0394 r23) {
            r0 = r17
            r4 = r22
            r1 = r23
            boolean r2 = r0 instanceof defpackage.C1827
            r3 = 7
            r6 = 0
            r5 = 0
            if (r2 == 0) goto L230
            ᲁᛳᛱᛱ r0 = (defpackage.C1827) r0
            java.lang.String r2 = "TypefaceCompat"
            java.lang.String r7 = r0.f7967
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            r9 = 1
            if (r8 != 0) goto L22
            android.graphics.Typeface r7 = m1723(r7)
            if (r7 == 0) goto L22
            goto Le5
        L22:
            java.util.ArrayList r7 = r0.f7969
            int r8 = r7.size()
            if (r8 != r9) goto L38
            java.lang.Object r2 = r7.get(r5)
            ᲇᛱᛸᛱ r2 = (defpackage.C1982) r2
            java.lang.String r2 = r2.f8572
            android.graphics.Typeface r7 = m1723(r2)
            goto Le5
        L38:
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 31
            if (r8 >= r10) goto L41
        L3e:
            r7 = r6
            goto Le5
        L41:
            r8 = r5
        L42:
            int r10 = r7.size()
            if (r8 >= r10) goto L5a
            java.lang.Object r10 = r7.get(r8)
            ᲇᛱᛸᛱ r10 = (defpackage.C1982) r10
            java.lang.String r10 = r10.f8572
            android.graphics.Typeface r10 = m1723(r10)
            if (r10 != 0) goto L57
            goto L3e
        L57:
            int r8 = r8 + 1
            goto L42
        L5a:
            r8 = r5
            r10 = r6
        L5c:
            int r11 = r7.size()
            if (r8 >= r11) goto Le1
            java.lang.Object r11 = r7.get(r8)
            ᲇᛱᛸᛱ r11 = (defpackage.C1982) r11
            int r12 = r7.size()
            int r12 = r12 - r9
            if (r8 != r12) goto L7d
            java.lang.String r12 = r11.f8577
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L7d
            java.lang.String r2 = r11.f8572
            r10.setSystemFallback(r2)
            goto Le1
        L7d:
            java.lang.String r12 = r11.f8572
            java.lang.String r13 = r11.f8577
            android.graphics.Typeface r12 = m1723(r12)
            android.graphics.fonts.Font r12 = m1728(r12)
            if (r12 != 0) goto La4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unable identify the primary font for "
            r7.<init>(r8)
            java.lang.String r8 = r11.f8572
            r7.append(r8)
            java.lang.String r8 = ". Falling back to provider font."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r2, r7)
            goto L3e
        La4:
            boolean r11 = android.text.TextUtils.isEmpty(r13)
            if (r11 != 0) goto Lc9
            android.graphics.fonts.FontFamily$Builder r11 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> Lc2
            android.graphics.fonts.Font$Builder r14 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> Lc2
            android.graphics.fonts.Font$Builder r12 = defpackage.AbstractC2344.m3837(r12)     // Catch: java.io.IOException -> Lc2
            android.graphics.fonts.Font$Builder r12 = r12.setFontVariationSettings(r13)     // Catch: java.io.IOException -> Lc2
            android.graphics.fonts.Font r12 = r12.build()     // Catch: java.io.IOException -> Lc2
            r11.<init>(r12)     // Catch: java.io.IOException -> Lc2
            android.graphics.fonts.FontFamily r11 = r11.build()     // Catch: java.io.IOException -> Lc2
            goto Ld2
        Lc2:
            java.lang.String r7 = "Failed to clone Font instance. Fall back to provider font."
            android.util.Log.e(r2, r7)
            goto L3e
        Lc9:
            android.graphics.fonts.FontFamily$Builder r11 = new android.graphics.fonts.FontFamily$Builder
            r11.<init>(r12)
            android.graphics.fonts.FontFamily r11 = r11.build()
        Ld2:
            if (r10 != 0) goto Lda
            android.graphics.Typeface$CustomFallbackBuilder r10 = new android.graphics.Typeface$CustomFallbackBuilder
            r10.<init>(r11)
            goto Ldd
        Lda:
            r10.addCustomFallback(r11)
        Ldd:
            int r8 = r8 + 1
            goto L5c
        Le1:
            android.graphics.Typeface r7 = r10.build()
        Le5:
            if (r7 == 0) goto L102
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            ᛸᛳᛴᲁ r2 = new ᛸᛳᛴᲁ
            r2.<init>(r1, r3, r7)
            r0.post(r2)
            ᲈᛸᛲᛵ r0 = defpackage.AbstractC0796.f3689
            java.lang.String r1 = m1724(r18, r19, r20, r21, r22)
            r0.m3734(r1, r7)
            return r7
        L102:
            int r2 = r0.f7968
            if (r2 != 0) goto L108
            r2 = r9
            goto L109
        L108:
            r2 = r5
        L109:
            int r7 = r0.f7970
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r3.<init>(r8)
            ᛶᲈᛱᲈ r8 = new ᛶᲈᛱᲈ
            r8.<init>()
            r8.f5356 = r1
            java.util.ArrayList r0 = r0.f7969
            ᛴᛵᲇᲇ r10 = new ᛴᛵᲇᲇ
            ᲈᲇᲇᲀ r1 = new ᲈᲇᲇᲀ
            r1.<init>(r3)
            r3 = 12
            r10.<init>(r8, r3, r1)
            r3 = 2
            if (r2 == 0) goto L1b9
            int r2 = r0.size()
            if (r2 > r9) goto L1b3
            java.lang.Object r0 = r0.get(r5)
            ᲇᛱᛸᛱ r0 = (defpackage.C1982) r0
            ᲈᛸᛲᛵ r2 = defpackage.AbstractC0604.f2991
            java.util.List r2 = java.util.List.of(r0)
            java.lang.String r2 = defpackage.AbstractC0604.m1398(r4, r2)
            ᲈᛸᛲᛵ r9 = defpackage.AbstractC0604.f2991
            java.lang.Object r9 = r9.m3732(r2)
            android.graphics.Typeface r9 = (android.graphics.Typeface) r9
            if (r9 == 0) goto L157
            ᛱᲈᛷᲀ r0 = new ᛱᲈᛷᲀ
            r0.<init>(r8, r9, r3, r5)
            r1.execute(r0)
            r6 = r9
            goto L22a
        L157:
            r1 = -1
            if (r7 != r1) goto L16b
            java.util.List r0 = java.util.List.of(r0)
            r1 = r16
            ᛴᲀᛷ r0 = defpackage.AbstractC0604.m1399(r2, r1, r0, r4)
            r10.m1561(r0)
            android.graphics.Typeface r6 = r0.f3519
            goto L22a
        L16b:
            r1 = r16
            r3 = r0
            ᲇᛶᲁᲀ r0 = new ᲇᛶᲁᲀ
            r5 = 0
            r15 = r2
            r2 = r1
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r1 = defpackage.AbstractC0604.f2992     // Catch: java.lang.InterruptedException -> L1a0
            java.util.concurrent.Future r0 = r1.submit(r0)     // Catch: java.lang.InterruptedException -> L1a0
            long r1 = (long) r7
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L18d java.util.concurrent.ExecutionException -> L18f java.util.concurrent.TimeoutException -> L191
            java.lang.Object r0 = r0.get(r1, r3)     // Catch: java.lang.InterruptedException -> L18d java.util.concurrent.ExecutionException -> L18f java.util.concurrent.TimeoutException -> L191
            ᛴᲀᛷ r0 = (defpackage.C0748) r0     // Catch: java.lang.InterruptedException -> L1a0
            r10.m1561(r0)     // Catch: java.lang.InterruptedException -> L1a0
            android.graphics.Typeface r6 = r0.f3519     // Catch: java.lang.InterruptedException -> L1a0
            goto L22a
        L18d:
            r0 = move-exception
            goto L199
        L18f:
            r0 = move-exception
            goto L19a
        L191:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.InterruptedException -> L1a0
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L1a0
            throw r0     // Catch: java.lang.InterruptedException -> L1a0
        L199:
            throw r0     // Catch: java.lang.InterruptedException -> L1a0
        L19a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> L1a0
            r1.<init>(r0)     // Catch: java.lang.InterruptedException -> L1a0
            throw r1     // Catch: java.lang.InterruptedException -> L1a0
        L1a0:
            java.lang.Object r0 = r10.f3285
            ᲈᲇᲇᲀ r0 = (defpackage.ExecutorC2359) r0
            java.lang.Object r1 = r10.f3286
            ᛶᲈᛱᲈ r1 = (defpackage.C1180) r1
            ᛲᲁᲇᛶ r2 = new ᛲᲁᲇᛶ
            r3 = -3
            r2.<init>(r1, r3)
            r0.execute(r2)
            goto L22a
        L1b3:
            java.lang.String r0 = "Fallbacks with blocking fetches are not supported for performance reasons"
            defpackage.C2264.m3684(r0)
            return r6
        L1b9:
            java.lang.String r2 = defpackage.AbstractC0604.m1398(r4, r0)
            ᲈᛸᛲᛵ r7 = defpackage.AbstractC0604.f2991
            java.lang.Object r7 = r7.m3732(r2)
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            if (r7 == 0) goto L1d1
            ᛱᲈᛷᲀ r0 = new ᛱᲈᛷᲀ
            r0.<init>(r8, r7, r3, r5)
            r1.execute(r0)
            r6 = r7
            goto L22a
        L1d1:
            ᛸᛷᛴᛱ r1 = new ᛸᛷᛴᛱ
            r1.<init>(r5, r10)
            java.lang.Object r7 = defpackage.AbstractC0604.f2990
            monitor-enter(r7)
            ᛸᲇᛲᛶ r3 = defpackage.AbstractC0604.f2989     // Catch: java.lang.Throwable -> L1e8
            java.lang.Object r5 = r3.get(r2)     // Catch: java.lang.Throwable -> L1e8
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L1e8
            if (r5 == 0) goto L1ea
            r5.add(r1)     // Catch: java.lang.Throwable -> L1e8
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1e8
            goto L22a
        L1e8:
            r0 = move-exception
            goto L22e
        L1ea:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e8
            r5.<init>()     // Catch: java.lang.Throwable -> L1e8
            r5.add(r1)     // Catch: java.lang.Throwable -> L1e8
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L1e8
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1e8
            r3 = r0
            ᲇᛶᲁᲀ r0 = new ᲇᛶᲁᲀ
            r5 = 1
            r1 = r2
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r2 = defpackage.AbstractC0604.f2992
            ᛸᛷᛴᛱ r3 = new ᛸᛷᛴᛱ
            r3.<init>(r9, r1)
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L217
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r1.<init>(r5)
            goto L21c
        L217:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
        L21c:
            ᲁᛷᲇᛷ r5 = new ᲁᛷᲇᛷ
            r5.<init>()
            r5.f8193 = r0
            r5.f8192 = r3
            r5.f8195 = r1
            r2.execute(r5)
        L22a:
            r11 = r18
            goto L2b9
        L22e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1e8
            throw r0
        L230:
            ᛸᛵᛴᛲ r2 = defpackage.AbstractC0796.f3688
            ᛸᛵᲀ r0 = (defpackage.C1495) r0
            r2.getClass()
            ᲈᲇᛷᲈ[] r0 = r0.f6591     // Catch: java.lang.Exception -> L273
            int r2 = r0.length     // Catch: java.lang.Exception -> L273
            r7 = r6
        L23b:
            if (r5 >= r2) goto L27c
            r8 = r0[r5]     // Catch: java.lang.Exception -> L273
            android.graphics.fonts.Font$Builder r9 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L273 java.io.IOException -> L277
            int r10 = r8.f10151     // Catch: java.lang.Exception -> L273 java.io.IOException -> L277
            r11 = r18
            r9.<init>(r11, r10)     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            int r10 = r8.f10154     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            android.graphics.fonts.Font$Builder r9 = r9.setWeight(r10)     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            boolean r10 = r8.f10155     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            android.graphics.fonts.Font$Builder r9 = r9.setSlant(r10)     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            int r10 = r8.f10152     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            android.graphics.fonts.Font$Builder r9 = r9.setTtcIndex(r10)     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            java.lang.String r8 = r8.f10153     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            android.graphics.fonts.Font$Builder r8 = r9.setFontVariationSettings(r8)     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            android.graphics.fonts.Font r8 = r8.build()     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            if (r7 != 0) goto L26f
            android.graphics.fonts.FontFamily$Builder r9 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            r9.<init>(r8)     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            r7 = r9
            goto L279
        L26d:
            r0 = move-exception
            goto L29b
        L26f:
            r7.addFont(r8)     // Catch: java.lang.Exception -> L26d java.io.IOException -> L279
            goto L279
        L273:
            r0 = move-exception
            r11 = r18
            goto L29b
        L277:
            r11 = r18
        L279:
            int r5 = r5 + 1
            goto L23b
        L27c:
            r11 = r18
            if (r7 != 0) goto L281
            goto L2a2
        L281:
            android.graphics.fonts.FontFamily r0 = r7.build()     // Catch: java.lang.Exception -> L26d
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L26d
            r2.<init>(r0)     // Catch: java.lang.Exception -> L26d
            android.graphics.fonts.Font r0 = defpackage.C1487.m2694(r0, r4)     // Catch: java.lang.Exception -> L26d
            android.graphics.fonts.FontStyle r0 = r0.getStyle()     // Catch: java.lang.Exception -> L26d
            android.graphics.Typeface$CustomFallbackBuilder r0 = r2.setStyle(r0)     // Catch: java.lang.Exception -> L26d
            android.graphics.Typeface r6 = r0.build()     // Catch: java.lang.Exception -> L26d
            goto L2a2
        L29b:
            java.lang.String r2 = "TypefaceCompatApi29Impl"
            java.lang.String r5 = "Font load failed"
            android.util.Log.w(r2, r5, r0)
        L2a2:
            if (r6 == 0) goto L2b6
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            ᛸᛳᛴᲁ r2 = new ᛸᛳᛴᲁ
            r2.<init>(r1, r3, r6)
            r0.post(r2)
            goto L2b9
        L2b6:
            r1.m1136()
        L2b9:
            if (r6 == 0) goto L2c4
            ᲈᛸᛲᛵ r0 = defpackage.AbstractC0796.f3689
            java.lang.String r1 = m1724(r18, r19, r20, r21, r22)
            r0.m3734(r1, r6)
        L2c4:
            return r6
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static android.graphics.fonts.Font m1728(android.graphics.Typeface r2) {
            android.graphics.Paint r0 = defpackage.AbstractC0796.f3687
            if (r0 != 0) goto Lb
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            defpackage.AbstractC0796.f3687 = r0
        Lb:
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r1)
            android.graphics.Paint r0 = defpackage.AbstractC0796.f3687
            r0.setTypeface(r2)
            android.graphics.Paint r2 = defpackage.AbstractC0796.f3687
            android.graphics.text.PositionedGlyphs r2 = defpackage.AbstractC2344.m3822(r2)
            int r0 = defpackage.AbstractC2344.m3831(r2)
            if (r0 != 0) goto L23
            r2 = 0
            return r2
        L23:
            android.graphics.fonts.Font r2 = defpackage.AbstractC2344.m3839(r2)
            return r2
    }
}
