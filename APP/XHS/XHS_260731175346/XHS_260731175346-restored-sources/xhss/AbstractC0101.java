package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲁᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0101 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C1084 f467 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static android.graphics.Paint f468;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0564 f469 = null;

    static {
            java.lang.String r0 = "TypefaceCompat static init"
            xhss.AbstractC0060.m180(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L13
            xhss.ᲈᲇᲈᛴ r0 = new xhss.ᲈᲇᲈᛴ
            r0.<init>()
            xhss.AbstractC0101.f469 = r0
            goto L1a
        L13:
            xhss.ᛶᛵᲇᛸ r0 = new xhss.ᛶᛵᲇᛸ
            r0.<init>()
            xhss.AbstractC0101.f469 = r0
        L1a:
            xhss.ᲇᲀᲈᛲ r0 = new xhss.ᲇᲀᲈᛲ
            r1 = 16
            r0.<init>(r1)
            xhss.AbstractC0101.f467 = r0
            r0 = 0
            xhss.AbstractC0101.f468 = r0
            android.os.Trace.endSection()
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static android.graphics.Typeface m267(android.content.Context r13, xhss.InterfaceC0571 r14, android.content.res.Resources r15, int r16, java.lang.String r17, int r18, int r19, xhss.C0702 r20) {
            r4 = r19
            r1 = r20
            boolean r0 = r14 instanceof xhss.C0846
            r6 = 0
            r2 = 0
            if (r0 == 0) goto L22a
            xhss.ᲀᛲᲈᛶ r14 = (xhss.C0846) r14
            java.lang.String r0 = "TypefaceCompat"
            java.lang.String r3 = r14.f2753
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            r7 = 1
            if (r5 != 0) goto L1f
            android.graphics.Typeface r3 = m269(r3)
            if (r3 == 0) goto L1f
            goto Le2
        L1f:
            java.util.ArrayList r3 = r14.f2752
            int r5 = r3.size()
            if (r5 != r7) goto L35
            java.lang.Object r0 = r3.get(r2)
            xhss.ᛷᛱᛲᲇ r0 = (xhss.C0622) r0
            java.lang.String r0 = r0.f2143
            android.graphics.Typeface r3 = m269(r0)
            goto Le2
        L35:
            int r5 = android.os.Build.VERSION.SDK_INT
            r8 = 31
            if (r5 >= r8) goto L3e
        L3b:
            r3 = r6
            goto Le2
        L3e:
            r5 = r2
        L3f:
            int r8 = r3.size()
            if (r5 >= r8) goto L57
            java.lang.Object r8 = r3.get(r5)
            xhss.ᛷᛱᛲᲇ r8 = (xhss.C0622) r8
            java.lang.String r8 = r8.f2143
            android.graphics.Typeface r8 = m269(r8)
            if (r8 != 0) goto L54
            goto L3b
        L54:
            int r5 = r5 + 1
            goto L3f
        L57:
            r5 = r2
            r8 = r6
        L59:
            int r9 = r3.size()
            if (r5 >= r9) goto Lde
            java.lang.Object r9 = r3.get(r5)
            xhss.ᛷᛱᛲᲇ r9 = (xhss.C0622) r9
            int r10 = r3.size()
            int r10 = r10 - r7
            if (r5 != r10) goto L7a
            java.lang.String r10 = r9.f2147
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L7a
            java.lang.String r0 = r9.f2143
            r8.setSystemFallback(r0)
            goto Lde
        L7a:
            java.lang.String r10 = r9.f2143
            java.lang.String r11 = r9.f2147
            android.graphics.Typeface r10 = m269(r10)
            android.graphics.fonts.Font r10 = m272(r10)
            if (r10 != 0) goto La1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable identify the primary font for "
            r3.<init>(r5)
            java.lang.String r5 = r9.f2143
            r3.append(r5)
            java.lang.String r5 = ". Falling back to provider font."
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r0, r3)
            goto L3b
        La1:
            boolean r9 = android.text.TextUtils.isEmpty(r11)
            if (r9 != 0) goto Lc6
            android.graphics.fonts.FontFamily$Builder r9 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> Lbf
            android.graphics.fonts.Font$Builder r12 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> Lbf
            android.graphics.fonts.Font$Builder r10 = xhss.AbstractC1022.m1672(r10)     // Catch: java.io.IOException -> Lbf
            android.graphics.fonts.Font$Builder r10 = r10.setFontVariationSettings(r11)     // Catch: java.io.IOException -> Lbf
            android.graphics.fonts.Font r10 = r10.build()     // Catch: java.io.IOException -> Lbf
            r9.<init>(r10)     // Catch: java.io.IOException -> Lbf
            android.graphics.fonts.FontFamily r9 = r9.build()     // Catch: java.io.IOException -> Lbf
            goto Lcf
        Lbf:
            java.lang.String r3 = "Failed to clone Font instance. Fall back to provider font."
            android.util.Log.e(r0, r3)
            goto L3b
        Lc6:
            android.graphics.fonts.FontFamily$Builder r9 = new android.graphics.fonts.FontFamily$Builder
            r9.<init>(r10)
            android.graphics.fonts.FontFamily r9 = r9.build()
        Lcf:
            if (r8 != 0) goto Ld7
            android.graphics.Typeface$CustomFallbackBuilder r8 = new android.graphics.Typeface$CustomFallbackBuilder
            r8.<init>(r9)
            goto Lda
        Ld7:
            r8.addCustomFallback(r9)
        Lda:
            int r5 = r5 + 1
            goto L59
        Lde:
            android.graphics.Typeface r3 = r8.build()
        Le2:
            if (r3 == 0) goto Lff
            android.os.Handler r13 = new android.os.Handler
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            r13.<init>(r14)
            xhss.ᲈᲈᛸᛳ r14 = new xhss.ᲈᲈᛸᛳ
            r14.<init>(r1, r3)
            r13.post(r14)
            xhss.ᲇᲀᲈᛲ r13 = xhss.AbstractC0101.f467
            java.lang.String r14 = m271(r15, r16, r17, r18, r19)
            r13.m1744(r14, r3)
            return r3
        Lff:
            int r0 = r14.f2751
            if (r0 != 0) goto L105
            r0 = r7
            goto L106
        L105:
            r0 = r2
        L106:
            int r8 = r14.f2750
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r3.<init>(r5)
            xhss.ᲇᛵᛲᲁ r5 = new xhss.ᲇᛵᛲᲁ
            r9 = 23
            r5.<init>(r9)
            r5.f3349 = r1
            java.util.ArrayList r14 = r14.f2752
            xhss.ᛳᛱᛲᲀ r9 = new xhss.ᛳᛱᛲᲀ
            xhss.ᲈᲀᛶᛶ r1 = new xhss.ᲈᲀᛶᛶ
            r1.<init>(r3)
            r3 = 3
            r9.<init>(r3, r5, r1)
            if (r0 == 0) goto L1b3
            int r0 = r14.size()
            if (r0 > r7) goto L1ad
            java.lang.Object r14 = r14.get(r2)
            r3 = r14
            xhss.ᛷᛱᛲᲇ r3 = (xhss.C0622) r3
            xhss.ᲇᲀᲈᛲ r14 = xhss.AbstractC0294.f1135
            java.util.List r14 = java.util.List.of(r3)
            java.lang.String r14 = xhss.AbstractC0294.m620(r14, r4)
            xhss.ᲇᲀᲈᛲ r0 = xhss.AbstractC0294.f1135
            java.lang.Object r0 = r0.m1745(r14)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L155
            xhss.ᛳᛵᛲᲇ r13 = new xhss.ᛳᛵᛲᲇ
            r13.<init>(r2, r5, r0)
            r1.execute(r13)
            r6 = r0
            goto L2a9
        L155:
            r0 = -1
            if (r8 != r0) goto L167
            java.util.List r0 = java.util.List.of(r3)
            xhss.ᛳᛵᛴᲈ r13 = xhss.AbstractC0294.m619(r14, r13, r0, r4)
            r9.m537(r13)
            android.graphics.Typeface r6 = r13.f1036
            goto L2a9
        L167:
            xhss.ᛳᛱᛵᛱ r0 = new xhss.ᛳᛱᛵᛱ
            r5 = 0
            r2 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r13 = xhss.AbstractC0294.f1133     // Catch: java.lang.InterruptedException -> L19a
            java.util.concurrent.Future r13 = r13.submit(r0)     // Catch: java.lang.InterruptedException -> L19a
            long r0 = (long) r8
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L185 java.util.concurrent.ExecutionException -> L188 java.util.concurrent.TimeoutException -> L18b
            java.lang.Object r13 = r13.get(r0, r14)     // Catch: java.lang.InterruptedException -> L185 java.util.concurrent.ExecutionException -> L188 java.util.concurrent.TimeoutException -> L18b
            xhss.ᛳᛵᛴᲈ r13 = (xhss.C0271) r13     // Catch: java.lang.InterruptedException -> L19a
            r9.m537(r13)     // Catch: java.lang.InterruptedException -> L19a
            android.graphics.Typeface r6 = r13.f1036     // Catch: java.lang.InterruptedException -> L19a
            goto L2a9
        L185:
            r0 = move-exception
            r13 = r0
            goto L193
        L188:
            r0 = move-exception
            r13 = r0
            goto L194
        L18b:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch: java.lang.InterruptedException -> L19a
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch: java.lang.InterruptedException -> L19a
            throw r13     // Catch: java.lang.InterruptedException -> L19a
        L193:
            throw r13     // Catch: java.lang.InterruptedException -> L19a
        L194:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> L19a
            r14.<init>(r13)     // Catch: java.lang.InterruptedException -> L19a
            throw r14     // Catch: java.lang.InterruptedException -> L19a
        L19a:
            java.lang.Object r13 = r9.f894
            xhss.ᲈᲀᛶᛶ r13 = (xhss.ExecutorC1176) r13
            java.lang.Object r14 = r9.f893
            xhss.ᲇᛵᛲᲁ r14 = (xhss.C1037) r14
            xhss.ᲀᛸᲁᛲ r0 = new xhss.ᲀᛸᲁᛲ
            r1 = -3
            r0.<init>(r14, r1)
            r13.execute(r0)
            goto L2a9
        L1ad:
            java.lang.String r13 = "Fallbacks with blocking fetches are not supported for performance reasons"
            xhss.C0532.m959(r13)
            return r6
        L1b3:
            java.lang.String r0 = xhss.AbstractC0294.m620(r14, r4)
            xhss.ᲇᲀᲈᛲ r3 = xhss.AbstractC0294.f1135
            java.lang.Object r3 = r3.m1745(r0)
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            if (r3 == 0) goto L1cc
            xhss.ᛳᛵᛲᲇ r13 = new xhss.ᛳᛵᛲᲇ
            r13.<init>(r2, r5, r3)
            r1.execute(r13)
            r6 = r3
            goto L2a9
        L1cc:
            xhss.ᲀᛶᛲᛵ r1 = new xhss.ᲀᛶᛲᛵ
            r1.<init>(r2, r9)
            java.lang.Object r3 = xhss.AbstractC0294.f1134
            monitor-enter(r3)
            xhss.ᛴᛶᲀᛶ r2 = xhss.AbstractC0294.f1136     // Catch: java.lang.Throwable -> L1e4
            java.lang.Object r5 = r2.get(r0)     // Catch: java.lang.Throwable -> L1e4
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L1e4
            if (r5 == 0) goto L1e7
            r5.add(r1)     // Catch: java.lang.Throwable -> L1e4
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e4
            goto L2a9
        L1e4:
            r0 = move-exception
            r13 = r0
            goto L228
        L1e7:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e4
            r5.<init>()     // Catch: java.lang.Throwable -> L1e4
            r5.add(r1)     // Catch: java.lang.Throwable -> L1e4
            r2.put(r0, r5)     // Catch: java.lang.Throwable -> L1e4
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e4
            r1 = r0
            xhss.ᛳᛱᛵᛱ r0 = new xhss.ᛳᛱᛵᛱ
            r5 = 1
            r2 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r13 = xhss.AbstractC0294.f1133
            xhss.ᲀᛶᛲᛵ r14 = new xhss.ᲀᛶᛲᛵ
            r14.<init>(r7, r1)
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L213
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            goto L218
        L213:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
        L218:
            xhss.ᲀᛳᲀᛴ r2 = new xhss.ᲀᛳᲀᛴ
            r2.<init>()
            r2.f2760 = r0
            r2.f2761 = r14
            r2.f2762 = r1
            r13.execute(r2)
            goto L2a9
        L228:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e4
            throw r13
        L22a:
            xhss.ᛶᛵᲇᛸ r13 = xhss.AbstractC0101.f469
            xhss.ᛷᲁᛵ r14 = (xhss.C0706) r14
            r13.getClass()
            xhss.ᛲᲁᲈᛱ[] r13 = r14.f2377     // Catch: java.lang.Exception -> L265
            int r14 = r13.length     // Catch: java.lang.Exception -> L265
            r0 = r6
        L235:
            if (r2 >= r14) goto L26e
            r3 = r13[r2]     // Catch: java.lang.Exception -> L265
            android.graphics.fonts.Font$Builder r5 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            int r7 = r3.f784     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            r5.<init>(r15, r7)     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            int r7 = r3.f785     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            android.graphics.fonts.Font$Builder r5 = r5.setWeight(r7)     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            boolean r7 = r3.f782     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            android.graphics.fonts.Font$Builder r5 = r5.setSlant(r7)     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            int r7 = r3.f786     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r7)     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            java.lang.String r3 = r3.f783     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            android.graphics.fonts.Font$Builder r3 = r5.setFontVariationSettings(r3)     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            android.graphics.fonts.Font r3 = r3.build()     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            if (r0 != 0) goto L268
            android.graphics.fonts.FontFamily$Builder r5 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            r5.<init>(r3)     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
            r0 = r5
            goto L26b
        L265:
            r0 = move-exception
            r13 = r0
            goto L28b
        L268:
            r0.addFont(r3)     // Catch: java.lang.Exception -> L265 java.io.IOException -> L26b
        L26b:
            int r2 = r2 + 1
            goto L235
        L26e:
            if (r0 != 0) goto L271
            goto L292
        L271:
            android.graphics.fonts.FontFamily r13 = r0.build()     // Catch: java.lang.Exception -> L265
            android.graphics.Typeface$CustomFallbackBuilder r14 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L265
            r14.<init>(r13)     // Catch: java.lang.Exception -> L265
            android.graphics.fonts.Font r13 = xhss.C0564.m1029(r13, r4)     // Catch: java.lang.Exception -> L265
            android.graphics.fonts.FontStyle r13 = r13.getStyle()     // Catch: java.lang.Exception -> L265
            android.graphics.Typeface$CustomFallbackBuilder r13 = r14.setStyle(r13)     // Catch: java.lang.Exception -> L265
            android.graphics.Typeface r6 = r13.build()     // Catch: java.lang.Exception -> L265
            goto L292
        L28b:
            java.lang.String r14 = "TypefaceCompatApi29Impl"
            java.lang.String r0 = "Font load failed"
            android.util.Log.w(r14, r0, r13)
        L292:
            if (r6 == 0) goto L2a6
            android.os.Handler r13 = new android.os.Handler
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            r13.<init>(r14)
            xhss.ᲈᲈᛸᛳ r14 = new xhss.ᲈᲈᛸᛳ
            r14.<init>(r1, r6)
            r13.post(r14)
            goto L2a9
        L2a6:
            r1.m1224()
        L2a9:
            if (r6 == 0) goto L2b4
            xhss.ᲇᲀᲈᛲ r13 = xhss.AbstractC0101.f467
            java.lang.String r14 = m271(r15, r16, r17, r18, r19)
            r13.m1744(r14, r6)
        L2b4:
            return r6
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static android.graphics.Typeface m268(android.content.res.Resources r3, int r4, java.lang.String r5, int r6, int r7) {
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC0101.f469
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
            java.lang.String r3 = m271(r3, r4, r5, r6, r7)
            xhss.ᲇᲀᲈᛲ r4 = xhss.AbstractC0101.f467
            r4.m1744(r3, r0)
        L3d:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static android.graphics.Typeface m269(java.lang.String r3) {
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

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static android.graphics.Typeface m270(android.content.Context r2, xhss.C0486[] r3, int r4) {
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            xhss.AbstractC0060.m180(r0)
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC0101.f469     // Catch: java.lang.Throwable -> L38
            r0.getClass()     // Catch: java.lang.Throwable -> L38
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            android.graphics.fonts.FontFamily r2 = r0.m1036(r3, r2)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            if (r2 != 0) goto L16
            goto L34
        L16:
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            r3.<init>(r2)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
            android.graphics.fonts.Font r2 = xhss.C0564.m1029(r2, r4)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L38
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

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static java.lang.String m271(android.content.res.Resources r1, int r2, java.lang.String r3, int r4, int r5) {
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

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static android.graphics.fonts.Font m272(android.graphics.Typeface r2) {
            android.graphics.Paint r0 = xhss.AbstractC0101.f468
            if (r0 != 0) goto Lb
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            xhss.AbstractC0101.f468 = r0
        Lb:
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r1)
            android.graphics.Paint r0 = xhss.AbstractC0101.f468
            r0.setTypeface(r2)
            android.graphics.Paint r2 = xhss.AbstractC0101.f468
            android.graphics.text.PositionedGlyphs r2 = xhss.AbstractC1022.m1673(r2)
            int r0 = xhss.AbstractC1022.m1669(r2)
            if (r0 != 0) goto L23
            r2 = 0
            return r2
        L23:
            android.graphics.fonts.Font r2 = xhss.AbstractC1022.m1668(r2)
            return r2
    }
}
