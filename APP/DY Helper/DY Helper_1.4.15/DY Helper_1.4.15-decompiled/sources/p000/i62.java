package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class i62 {

    /* JADX INFO: renamed from: α */
    public static final p000.zz1 f4928 = null;

    /* JADX INFO: renamed from: β */
    public static final p000.kw0 f4929 = null;

    /* JADX INFO: renamed from: γ */
    public static android.graphics.Paint f4930;

    static {
            java.lang.String r0 = "TypefaceCompat static init"
            p000.e81.m1872(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L15
            j62 r0 = new j62
            r1 = 8
            r0.<init>(r1)
            p000.i62.f4928 = r0
            goto L1e
        L15:
            zz1 r0 = new zz1
            r1 = 8
            r0.<init>(r1)
            p000.i62.f4928 = r0
        L1e:
            kw0 r0 = new kw0
            r1 = 16
            r0.<init>(r1)
            p000.i62.f4929 = r0
            r0 = 0
            p000.i62.f4930 = r0
            android.os.Trace.endSection()
            return
    }

    /* JADX INFO: renamed from: α */
    public static android.graphics.Typeface m2622(android.content.Context r2, p000.f60[] r3, int r4) {
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            p000.e81.m1872(r0)
            zz1 r0 = p000.i62.f4928     // Catch: java.lang.Throwable -> L38
            r0.getClass()     // Catch: java.lang.Throwable -> L38
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            android.graphics.fonts.FontFamily r2 = r0.m7262(r3, r2)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            if (r2 != 0) goto L16
            goto L34
        L16:
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            r3.<init>(r2)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            android.graphics.fonts.Font r2 = p000.zz1.m7258(r2, r4)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
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

    /* JADX INFO: renamed from: β */
    public static android.graphics.Typeface m2623(android.content.Context r17, p000.u50 r18, android.content.res.Resources r19, int r20, java.lang.String r21, int r22, int r23, p000.C1009y5 r24, boolean r25) {
            r0 = r18
            r4 = r23
            r1 = r24
            boolean r2 = r0 instanceof p000.x50
            r3 = 21
            r6 = -3
            r7 = 0
            r5 = 0
            if (r2 == 0) goto L23d
            x50 r0 = (p000.x50) r0
            java.lang.String r2 = "TypefaceCompat"
            java.lang.String r8 = r0.f12055
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            r10 = 1
            if (r9 != 0) goto L24
            android.graphics.Typeface r8 = m2626(r8)
            if (r8 == 0) goto L24
            goto Le7
        L24:
            java.util.ArrayList r8 = r0.f12052
            int r9 = r8.size()
            if (r9 != r10) goto L3a
            java.lang.Object r2 = r8.get(r5)
            n50 r2 = (p000.n50) r2
            java.lang.String r2 = r2.f7393
            android.graphics.Typeface r8 = m2626(r2)
            goto Le7
        L3a:
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r9 >= r11) goto L43
        L40:
            r8 = r7
            goto Le7
        L43:
            r9 = r5
        L44:
            int r11 = r8.size()
            if (r9 >= r11) goto L5c
            java.lang.Object r11 = r8.get(r9)
            n50 r11 = (p000.n50) r11
            java.lang.String r11 = r11.f7393
            android.graphics.Typeface r11 = m2626(r11)
            if (r11 != 0) goto L59
            goto L40
        L59:
            int r9 = r9 + 1
            goto L44
        L5c:
            r9 = r5
            r11 = r7
        L5e:
            int r12 = r8.size()
            if (r9 >= r12) goto Le3
            java.lang.Object r12 = r8.get(r9)
            n50 r12 = (p000.n50) r12
            int r13 = r8.size()
            int r13 = r13 - r10
            if (r9 != r13) goto L7f
            java.lang.String r13 = r12.f7394
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L7f
            java.lang.String r2 = r12.f7393
            r11.setSystemFallback(r2)
            goto Le3
        L7f:
            java.lang.String r13 = r12.f7393
            java.lang.String r14 = r12.f7394
            android.graphics.Typeface r13 = m2626(r13)
            android.graphics.fonts.Font r13 = m2627(r13)
            if (r13 != 0) goto La6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unable identify the primary font for "
            r8.<init>(r9)
            java.lang.String r9 = r12.f7393
            r8.append(r9)
            java.lang.String r9 = ". Falling back to provider font."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r2, r8)
            goto L40
        La6:
            boolean r12 = android.text.TextUtils.isEmpty(r14)
            if (r12 == 0) goto Lcb
            android.graphics.fonts.FontFamily$Builder r12 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> Lc4
            android.graphics.fonts.Font$Builder r15 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> Lc4
            android.graphics.fonts.Font$Builder r13 = p000.k42.m3163(r13)     // Catch: java.io.IOException -> Lc4
            android.graphics.fonts.Font$Builder r13 = r13.setFontVariationSettings(r14)     // Catch: java.io.IOException -> Lc4
            android.graphics.fonts.Font r13 = r13.build()     // Catch: java.io.IOException -> Lc4
            r12.<init>(r13)     // Catch: java.io.IOException -> Lc4
            android.graphics.fonts.FontFamily r12 = r12.build()     // Catch: java.io.IOException -> Lc4
            goto Ld4
        Lc4:
            java.lang.String r8 = "Failed to clone Font instance. Fall back to provider font."
            android.util.Log.e(r2, r8)
            goto L40
        Lcb:
            android.graphics.fonts.FontFamily$Builder r12 = new android.graphics.fonts.FontFamily$Builder
            r12.<init>(r13)
            android.graphics.fonts.FontFamily r12 = r12.build()
        Ld4:
            if (r11 != 0) goto Ldc
            android.graphics.Typeface$CustomFallbackBuilder r11 = new android.graphics.Typeface$CustomFallbackBuilder
            r11.<init>(r12)
            goto Ldf
        Ldc:
            r11.addCustomFallback(r12)
        Ldf:
            int r9 = r9 + 1
            goto L5e
        Le3:
            android.graphics.Typeface r8 = r11.build()
        Le7:
            if (r8 == 0) goto L106
            if (r1 == 0) goto Lfc
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            ii0 r2 = new ii0
            r2.<init>(r1, r3, r8)
            r0.post(r2)
        Lfc:
            kw0 r0 = p000.i62.f4929
            java.lang.String r1 = m2625(r19, r20, r21, r22, r23)
            r0.m3422(r1, r8)
            return r8
        L106:
            if (r25 == 0) goto L110
            int r2 = r0.f12054
            if (r2 != 0) goto L10e
        L10c:
            r2 = r10
            goto L113
        L10e:
            r2 = r5
            goto L113
        L110:
            if (r1 != 0) goto L10e
            goto L10c
        L113:
            r3 = -1
            if (r25 == 0) goto L119
            int r8 = r0.f12053
            goto L11a
        L119:
            r8 = r3
        L11a:
            android.os.Handler r9 = new android.os.Handler
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            r9.<init>(r11)
            y21 r11 = new y21
            r11.<init>()
            r11.f12428 = r1
            java.util.ArrayList r0 = r0.f12052
            n5 r12 = new n5
            nn1 r1 = new nn1
            r1.<init>(r9)
            r9 = 7
            r12.<init>(r9, r11, r1, r5)
            if (r2 == 0) goto L1c6
            int r2 = r0.size()
            if (r2 > r10) goto L1c0
            java.lang.Object r0 = r0.get(r5)
            n50 r0 = (p000.n50) r0
            kw0 r2 = p000.t50.f10202
            java.util.List r2 = java.util.List.of(r0)
            java.lang.String r2 = p000.t50.m5606(r4, r2)
            kw0 r9 = p000.t50.f10202
            java.lang.Object r9 = r9.m3421(r2)
            android.graphics.Typeface r9 = (android.graphics.Typeface) r9
            if (r9 == 0) goto L164
            ｓ r0 = new ｓ
            r0.<init>(r10, r11, r9, r5)
            r1.execute(r0)
            r7 = r9
            goto L237
        L164:
            if (r8 != r3) goto L177
            java.util.List r0 = java.util.List.of(r0)
            r1 = r17
            s50 r0 = p000.t50.m5607(r2, r1, r0, r4)
            r12.m3971(r0)
            android.graphics.Typeface r7 = r0.f9738
            goto L237
        L177:
            r1 = r17
            r3 = r0
            q50 r0 = new q50
            r5 = 0
            r16 = r2
            r2 = r1
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r1 = p000.t50.f10203     // Catch: java.lang.InterruptedException -> L1ae
            java.util.concurrent.Future r0 = r1.submit(r0)     // Catch: java.lang.InterruptedException -> L1ae
            long r1 = (long) r8
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L19b java.util.concurrent.ExecutionException -> L19d java.util.concurrent.TimeoutException -> L19f
            java.lang.Object r0 = r0.get(r1, r3)     // Catch: java.lang.InterruptedException -> L19b java.util.concurrent.ExecutionException -> L19d java.util.concurrent.TimeoutException -> L19f
            s50 r0 = (p000.s50) r0     // Catch: java.lang.InterruptedException -> L1ae
            r12.m3971(r0)     // Catch: java.lang.InterruptedException -> L1ae
            android.graphics.Typeface r7 = r0.f9738     // Catch: java.lang.InterruptedException -> L1ae
            goto L237
        L19b:
            r0 = move-exception
            goto L1a7
        L19d:
            r0 = move-exception
            goto L1a8
        L19f:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.InterruptedException -> L1ae
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L1ae
            throw r0     // Catch: java.lang.InterruptedException -> L1ae
        L1a7:
            throw r0     // Catch: java.lang.InterruptedException -> L1ae
        L1a8:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> L1ae
            r1.<init>(r0)     // Catch: java.lang.InterruptedException -> L1ae
            throw r1     // Catch: java.lang.InterruptedException -> L1ae
        L1ae:
            java.lang.Object r0 = r12.f7388
            nn1 r0 = (p000.nn1) r0
            java.lang.Object r1 = r12.f7387
            y21 r1 = (p000.y21) r1
            md r2 = new md
            r2.<init>(r1, r6)
            r0.execute(r2)
            goto L237
        L1c0:
            java.lang.String r0 = "Fallbacks with blocking fetches are not supported for performance reasons"
            p000.C1080.m7275(r0)
            return r7
        L1c6:
            java.lang.String r2 = p000.t50.m5606(r4, r0)
            kw0 r3 = p000.t50.f10202
            java.lang.Object r3 = r3.m3421(r2)
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            if (r3 == 0) goto L1de
            ｓ r0 = new ｓ
            r0.<init>(r10, r11, r3, r5)
            r1.execute(r0)
            r7 = r3
            goto L237
        L1de:
            r50 r1 = new r50
            r1.<init>(r5, r12)
            java.lang.Object r8 = p000.t50.f10204
            monitor-enter(r8)
            fw1 r3 = p000.t50.f10205     // Catch: java.lang.Throwable -> L1f5
            java.lang.Object r5 = r3.get(r2)     // Catch: java.lang.Throwable -> L1f5
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L1f5
            if (r5 == 0) goto L1f7
            r5.add(r1)     // Catch: java.lang.Throwable -> L1f5
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1f5
            goto L237
        L1f5:
            r0 = move-exception
            goto L23b
        L1f7:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f5
            r5.<init>()     // Catch: java.lang.Throwable -> L1f5
            r5.add(r1)     // Catch: java.lang.Throwable -> L1f5
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L1f5
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1f5
            r3 = r0
            q50 r0 = new q50
            r5 = 1
            r1 = r2
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r2 = p000.t50.f10203
            r50 r3 = new r50
            r3.<init>(r10, r1)
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L224
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r1.<init>(r5)
            goto L229
        L224:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
        L229:
            on1 r5 = new on1
            r5.<init>()
            r5.f8160 = r0
            r5.f8161 = r3
            r5.f8162 = r1
            r2.execute(r5)
        L237:
            r12 = r19
            goto L2c8
        L23b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1f5
            throw r0
        L23d:
            zz1 r2 = p000.i62.f4928
            v50 r0 = (p000.v50) r0
            r2.getClass()
            w50[] r0 = r0.f11107     // Catch: java.lang.Exception -> L280
            int r2 = r0.length     // Catch: java.lang.Exception -> L280
            r8 = r7
        L248:
            if (r5 >= r2) goto L289
            r9 = r0[r5]     // Catch: java.lang.Exception -> L280
            android.graphics.fonts.Font$Builder r10 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L280 java.io.IOException -> L284
            int r11 = r9.f11571     // Catch: java.lang.Exception -> L280 java.io.IOException -> L284
            r12 = r19
            r10.<init>(r12, r11)     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            int r11 = r9.f11567     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            android.graphics.fonts.Font$Builder r10 = r10.setWeight(r11)     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            boolean r11 = r9.f11568     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            android.graphics.fonts.Font$Builder r10 = r10.setSlant(r11)     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            int r11 = r9.f11570     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            android.graphics.fonts.Font$Builder r10 = r10.setTtcIndex(r11)     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            java.lang.String r9 = r9.f11569     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            android.graphics.fonts.Font$Builder r9 = r10.setFontVariationSettings(r9)     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            android.graphics.fonts.Font r9 = r9.build()     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            if (r8 != 0) goto L27c
            android.graphics.fonts.FontFamily$Builder r10 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            r10.<init>(r9)     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            r8 = r10
            goto L286
        L27a:
            r0 = move-exception
            goto L2a8
        L27c:
            r8.addFont(r9)     // Catch: java.lang.Exception -> L27a java.io.IOException -> L286
            goto L286
        L280:
            r0 = move-exception
            r12 = r19
            goto L2a8
        L284:
            r12 = r19
        L286:
            int r5 = r5 + 1
            goto L248
        L289:
            r12 = r19
            if (r8 != 0) goto L28e
            goto L2af
        L28e:
            android.graphics.fonts.FontFamily r0 = r8.build()     // Catch: java.lang.Exception -> L27a
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L27a
            r2.<init>(r0)     // Catch: java.lang.Exception -> L27a
            android.graphics.fonts.Font r0 = p000.zz1.m7258(r0, r4)     // Catch: java.lang.Exception -> L27a
            android.graphics.fonts.FontStyle r0 = r0.getStyle()     // Catch: java.lang.Exception -> L27a
            android.graphics.Typeface$CustomFallbackBuilder r0 = r2.setStyle(r0)     // Catch: java.lang.Exception -> L27a
            android.graphics.Typeface r7 = r0.build()     // Catch: java.lang.Exception -> L27a
            goto L2af
        L2a8:
            java.lang.String r2 = "TypefaceCompatApi29Impl"
            java.lang.String r5 = "Font load failed"
            android.util.Log.w(r2, r5, r0)
        L2af:
            if (r1 == 0) goto L2c8
            if (r7 == 0) goto L2c5
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            ii0 r2 = new ii0
            r2.<init>(r1, r3, r7)
            r0.post(r2)
            goto L2c8
        L2c5:
            r1.m6834(r6)
        L2c8:
            if (r7 == 0) goto L2d3
            kw0 r0 = p000.i62.f4929
            java.lang.String r1 = m2625(r19, r20, r21, r22, r23)
            r0.m3422(r1, r7)
        L2d3:
            return r7
    }

    /* JADX INFO: renamed from: γ */
    public static android.graphics.Typeface m2624(android.content.res.Resources r3, int r4, java.lang.String r5, int r6, int r7) {
            zz1 r0 = p000.i62.f4928
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
            java.lang.String r3 = m2625(r3, r4, r5, r6, r7)
            kw0 r4 = p000.i62.f4929
            r4.m3422(r3, r0)
        L3d:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m2625(android.content.res.Resources r1, int r2, java.lang.String r3, int r4, int r5) {
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

    /* JADX INFO: renamed from: ε */
    public static android.graphics.Typeface m2626(java.lang.String r3) {
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

    /* JADX INFO: renamed from: ζ */
    public static android.graphics.fonts.Font m2627(android.graphics.Typeface r2) {
            android.graphics.Paint r0 = p000.i62.f4930
            if (r0 != 0) goto Lb
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            p000.i62.f4930 = r0
        Lb:
            android.graphics.Paint r0 = p000.i62.f4930
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r1)
            android.graphics.Paint r0 = p000.i62.f4930
            r0.setTypeface(r2)
            android.graphics.Paint r2 = p000.i62.f4930
            android.graphics.text.PositionedGlyphs r2 = p000.k42.m3165(r2)
            int r0 = p000.k42.m3161(r2)
            if (r0 != 0) goto L25
            r2 = 0
            return r2
        L25:
            android.graphics.fonts.Font r2 = p000.k42.m3164(r2)
            return r2
    }
}
