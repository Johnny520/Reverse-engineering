package com.bumptech.glide;

/* JADX INFO: renamed from: com.bumptech.glide.ᛷᲁᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0007 implements android.content.ComponentCallbacks2 {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static volatile boolean f348;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static volatile com.bumptech.glide.ComponentCallbacks2C0007 f349;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C1500 f350;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f351;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0909 f352;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1702 f353;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1612 f354;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C2063 f355;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C1646 f356;

    public ComponentCallbacks2C0007(android.content.Context r2, defpackage.C0827 r3, defpackage.C1702 r4, defpackage.InterfaceC1612 r5, defpackage.C2063 r6, defpackage.C1646 r7, defpackage.C1500 r8, defpackage.C1403 r9, defpackage.C1499 r10, java.util.List r11, java.util.ArrayList r12, defpackage.AbstractC0729 r13, defpackage.C1606 r14) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f351 = r0
            r1.f354 = r5
            r1.f355 = r6
            r1.f353 = r4
            r1.f356 = r7
            r1.f350 = r8
            java.lang.Object r4 = r14.f7101
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Class<ᛱᛴᛲᛶ> r5 = defpackage.AbstractC0069.class
            java.lang.Object r4 = r4.get(r5)
            if (r4 != 0) goto L3a
            ᛳᲀᛴᲈ r8 = new ᛳᲀᛴᲈ
            r8.<init>(r1, r12, r13)
            r12 = r11
            r11 = r10
            r10 = r9
            ᛸᛶᛱᛵ r9 = new ᛸᛶᛱᛵ
            r4 = 27
            r9.<init>(r4)
            ᛵᛶᛳᲇ r5 = new ᛵᛶᛳᲇ
            r13 = r3
            r7 = r6
            r6 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.f352 = r5
            return
        L3a:
            defpackage.C2264.m3679()
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.ComponentCallbacks2C2190 m234(android.content.Context r1) {
            java.lang.String r0 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            defpackage.C0292.m944(r1, r0)
            com.bumptech.glide.ᛷᲁᛳᛳ r0 = m235(r1)
            ᲀᛳᛶᛴ r0 = r0.f356
            ᲈᛲᛵᲀ r1 = r0.m3018(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static com.bumptech.glide.ComponentCallbacks2C0007 m235(android.content.Context r4) {
            com.bumptech.glide.ᛷᲁᛳᛳ r0 = com.bumptech.glide.ComponentCallbacks2C0007.f349
            if (r0 != 0) goto L80
            android.content.Context r0 = r4.getApplicationContext()
            java.lang.String r1 = "Glide"
            java.lang.String r2 = "com.bumptech.glide.GeneratedAppGlideModuleImpl"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L44 java.lang.ClassNotFoundException -> L4d
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L44 java.lang.ClassNotFoundException -> L4d
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L44 java.lang.ClassNotFoundException -> L4d
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L44 java.lang.ClassNotFoundException -> L4d
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L44 java.lang.ClassNotFoundException -> L4d
            java.lang.Object r0 = r2.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L44 java.lang.ClassNotFoundException -> L4d
            com.bumptech.glide.GeneratedAppGlideModule r0 = (com.bumptech.glide.GeneratedAppGlideModule) r0     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L32 java.lang.IllegalAccessException -> L3b java.lang.InstantiationException -> L44 java.lang.ClassNotFoundException -> L4d
            goto L5a
        L29:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."
            r0.<init>(r1, r4)
            throw r0
        L32:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."
            r0.<init>(r1, r4)
            throw r0
        L3b:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."
            r0.<init>(r1, r4)
            throw r0
        L44:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."
            r0.<init>(r1, r4)
            throw r0
        L4d:
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L59
            java.lang.String r0 = "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"
            android.util.Log.w(r1, r0)
        L59:
            r0 = 0
        L5a:
            java.lang.Class<com.bumptech.glide.ᛷᲁᛳᛳ> r1 = com.bumptech.glide.ComponentCallbacks2C0007.class
            monitor-enter(r1)
            com.bumptech.glide.ᛷᲁᛳᛳ r2 = com.bumptech.glide.ComponentCallbacks2C0007.f349     // Catch: java.lang.Throwable -> L7d
            if (r2 != 0) goto L7b
            boolean r2 = com.bumptech.glide.ComponentCallbacks2C0007.f348     // Catch: java.lang.Throwable -> L7d
            if (r2 != 0) goto L73
            r2 = 1
            com.bumptech.glide.ComponentCallbacks2C0007.f348 = r2     // Catch: java.lang.Throwable -> L7d
            r2 = 0
            m236(r4, r0)     // Catch: java.lang.Throwable -> L6f
            com.bumptech.glide.ComponentCallbacks2C0007.f348 = r2     // Catch: java.lang.Throwable -> L7d
            goto L7b
        L6f:
            r4 = move-exception
            com.bumptech.glide.ComponentCallbacks2C0007.f348 = r2     // Catch: java.lang.Throwable -> L7d
            throw r4     // Catch: java.lang.Throwable -> L7d
        L73:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = "Glide has been called recursively, this is probably an internal library error!"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L7d
            throw r4     // Catch: java.lang.Throwable -> L7d
        L7b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7d
            goto L80
        L7d:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7d
            throw r4
        L80:
            com.bumptech.glide.ᛷᲁᛳᛳ r4 = com.bumptech.glide.ComponentCallbacks2C0007.f349
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m236(android.content.Context r29, com.bumptech.glide.GeneratedAppGlideModule r30) {
            ᛸᛶᛱᛲ r9 = new ᛸᛶᛱᛲ
            r1 = 0
            r9.<init>(r1)
            ᛶᲈᛷᛶ r2 = new ᛶᲈᛷᛶ
            r3 = 1
            r2.<init>(r3)
            ᛷᲈᲀ r8 = new ᛷᲈᲀ
            r0 = 26
            r8.<init>(r0)
            android.content.Context r4 = r29.getApplicationContext()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.lang.String r0 = "Got app info metadata: "
            java.lang.String r5 = "ManifestParser"
            r6 = 3
            boolean r7 = android.util.Log.isLoggable(r5, r6)
            if (r7 == 0) goto L29
            java.lang.String r7 = "Loading Glide modules"
            android.util.Log.d(r5, r7)
        L29:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r7 = 2
            android.content.pm.PackageManager r10 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            java.lang.String r12 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r13 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo(r12, r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            if (r10 == 0) goto L94
            android.os.Bundle r12 = r10.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            if (r12 != 0) goto L44
            goto L94
        L44:
            boolean r12 = android.util.Log.isLoggable(r5, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            if (r12 == 0) goto L5e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r12.<init>(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            android.os.Bundle r0 = r10.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r12.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            java.lang.String r0 = r12.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            android.util.Log.v(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            goto L5e
        L5c:
            r0 = move-exception
            goto La0
        L5e:
            android.os.Bundle r0 = r10.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            java.util.Set r0 = r0.keySet()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            java.util.Iterator r0 = r0.iterator()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
        L68:
            boolean r12 = r0.hasNext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            if (r12 == 0) goto L88
            java.lang.Object r12 = r0.next()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            java.lang.String r12 = (java.lang.String) r12     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            java.lang.String r13 = "GlideModule"
            android.os.Bundle r14 = r10.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            java.lang.Object r14 = r14.get(r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            boolean r13 = r13.equals(r14)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            if (r13 != 0) goto L83
            goto L68
        L83:
            defpackage.C1825.m3213(r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r0 = 0
            throw r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
        L88:
            boolean r0 = android.util.Log.isLoggable(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            if (r0 == 0) goto Lac
            java.lang.String r0 = "Finished loading Glide modules"
            android.util.Log.d(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            goto Lac
        L94:
            boolean r0 = android.util.Log.isLoggable(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            if (r0 == 0) goto Lac
            java.lang.String r0 = "Got null app info metadata"
            android.util.Log.d(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            goto Lac
        La0:
            r10 = 6
            boolean r10 = android.util.Log.isLoggable(r5, r10)
            if (r10 == 0) goto Lac
            java.lang.String r10 = "Failed to parse glide modules"
            android.util.Log.e(r5, r10, r0)
        Lac:
            if (r30 == 0) goto Ld4
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld4
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r0 = r11.iterator()
            boolean r5 = r0.hasNext()
            if (r5 != 0) goto Lc9
            goto Ld4
        Lc9:
            java.lang.Object r0 = r0.next()
            r0.getClass()
            defpackage.C2264.m3679()
            return
        Ld4:
            java.lang.String r0 = "Glide"
            boolean r0 = android.util.Log.isLoggable(r0, r6)
            if (r0 == 0) goto Lf2
            java.util.Iterator r0 = r11.iterator()
            boolean r5 = r0.hasNext()
            if (r5 != 0) goto Le7
            goto Lf2
        Le7:
            java.lang.Object r0 = r0.next()
            r0.getClass()
            defpackage.C2264.m3679()
            return
        Lf2:
            java.util.Iterator r0 = r11.iterator()
            boolean r5 = r0.hasNext()
            if (r5 != 0) goto L261
            ᛴᲁᲇᛲ r0 = new ᛴᲁᲇᛲ
            r0.<init>(r3)
            int r5 = defpackage.ExecutorServiceC0166.f1141
            r6 = 4
            if (r5 != 0) goto L114
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            int r5 = r5.availableProcessors()
            int r5 = java.lang.Math.min(r6, r5)
            defpackage.ExecutorServiceC0166.f1141 = r5
        L114:
            int r13 = defpackage.ExecutorServiceC0166.f1141
            java.lang.String r5 = "source"
            boolean r10 = android.text.TextUtils.isEmpty(r5)
            if (r10 != 0) goto L25b
            ᲀᛲᲁᲁ r10 = new ᲀᛲᲁᲁ
            r10.<init>(r0, r5, r1)
            java.util.concurrent.ThreadPoolExecutor r12 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.PriorityBlockingQueue r18 = new java.util.concurrent.PriorityBlockingQueue
            r18.<init>()
            r15 = 0
            java.util.concurrent.TimeUnit r24 = java.util.concurrent.TimeUnit.MILLISECONDS
            r14 = r13
            r19 = r10
            r17 = r24
            r12.<init>(r13, r14, r15, r17, r18, r19)
            ᛱᲀᛷᛱ r0 = new ᛱᲀᛷᛱ
            r0.<init>(r12)
            ᛴᲁᲇᛲ r5 = new ᛴᲁᲇᛲ
            r5.<init>(r3)
            java.lang.String r10 = "disk-cache"
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 != 0) goto L255
            ᲀᛲᲁᲁ r12 = new ᲀᛲᲁᲁ
            r13 = 1
            r12.<init>(r5, r10, r13)
            java.util.concurrent.ThreadPoolExecutor r19 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.PriorityBlockingQueue r25 = new java.util.concurrent.PriorityBlockingQueue
            r25.<init>()
            r22 = 0
            r21 = r13
            r26 = r12
            r20 = r13
            r19.<init>(r20, r21, r22, r24, r25, r26)
            r5 = r19
            ᛱᲀᛷᛱ r10 = new ᛱᲀᛷᛱ
            r10.<init>(r5)
            int r5 = defpackage.ExecutorServiceC0166.f1141
            if (r5 != 0) goto L179
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            int r5 = r5.availableProcessors()
            int r5 = java.lang.Math.min(r6, r5)
            defpackage.ExecutorServiceC0166.f1141 = r5
        L179:
            int r5 = defpackage.ExecutorServiceC0166.f1141
            if (r5 < r6) goto L180
            r20 = r7
            goto L182
        L180:
            r20 = r3
        L182:
            ᛴᲁᲇᛲ r5 = new ᛴᲁᲇᛲ
            r5.<init>(r3)
            java.lang.String r7 = "animation"
            boolean r12 = android.text.TextUtils.isEmpty(r7)
            if (r12 != 0) goto L24f
            ᲀᛲᲁᲁ r12 = new ᲀᛲᲁᲁ
            r12.<init>(r5, r7, r3)
            java.util.concurrent.ThreadPoolExecutor r19 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.PriorityBlockingQueue r25 = new java.util.concurrent.PriorityBlockingQueue
            r25.<init>()
            r22 = 0
            r21 = r20
            r26 = r12
            r19.<init>(r20, r21, r22, r24, r25, r26)
            r5 = r19
            ᛱᲀᛷᛱ r7 = new ᛱᲀᛷᛱ
            r7.<init>(r5)
            ᛸᲀᲈ r5 = new ᛸᲀᲈ
            r5.<init>(r4)
            ᛲᛴᛶᛶ r12 = new ᛲᛴᛶᛶ
            r12.<init>(r5)
            r5 = r7
            ᛸᛶᛱᛵ r7 = new ᛸᛶᛱᛵ
            r13 = 17
            r7.<init>(r13)
            int r13 = r12.f1567
            if (r13 <= 0) goto L1cc
            ᛳᛵᛵᛳ r14 = new ᛳᛵᛵᛳ
            r27 = r2
            long r1 = (long) r13
            r14.<init>(r1)
        L1c9:
            r2 = r5
            r1 = r14
            goto L1d6
        L1cc:
            r27 = r2
            ᛷᲈᲀ r14 = new ᛷᲈᲀ
            r1 = 12
            r14.<init>(r1)
            goto L1c9
        L1d6:
            ᲇᛶᛳᛱ r5 = new ᲇᛶᛳᛱ
            int r13 = r12.f1566
            r5.<init>(r13)
            ᲀᛷᛲᛱ r14 = new ᲀᛷᛲᛱ
            int r12 = r12.f1568
            long r12 = (long) r12
            r14.<init>(r12)
            r12 = 0
            ᛶᲈᛱᲈ r15 = new ᛶᲈᛱᲈ
            ᛷᲁᛷᛶ r13 = new ᛷᲁᛷᛶ
            r13.<init>(r4, r6)
            r15.<init>()
            r15.f5356 = r13
            ᛵᛲᛵᛴ r13 = new ᛵᛲᛵᛴ
            ᛱᲀᛷᛱ r6 = new ᛱᲀᛷᛱ
            java.util.concurrent.ThreadPoolExecutor r19 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.SynchronousQueue r25 = new java.util.concurrent.SynchronousQueue
            r25.<init>()
            ᲀᛲᲁᲁ r12 = new ᲀᛲᲁᲁ
            r17 = r0
            ᛴᲁᲇᛲ r0 = new ᛴᲁᲇᛲ
            r0.<init>(r3)
            java.lang.String r3 = "source-unlimited"
            r28 = r1
            r1 = 0
            r12.<init>(r0, r3, r1)
            r20 = 0
            r21 = 2147483647(0x7fffffff, float:NaN)
            r22 = 10000(0x2710, double:4.9407E-320)
            r26 = r12
            r19.<init>(r20, r21, r22, r24, r25, r26)
            r0 = r19
            r6.<init>(r0)
            r19 = r2
            r18 = r6
            r16 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r2 = r13
            java.util.List r10 = java.util.Collections.EMPTY_LIST
            ᛸᲈᛸᲈ r13 = new ᛸᲈᛸᲈ
            r1 = r27
            r13.<init>(r1)
            ᲀᛳᛶᛴ r6 = new ᲀᛳᛶᛴ
            r6.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.File r0 = defpackage.C0082.f822
            com.bumptech.glide.ᛷᲁᛳᛳ r0 = new com.bumptech.glide.ᛷᲁᛳᛳ
            r12 = r30
            r1 = r4
            r3 = r14
            r4 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.registerComponentCallbacks(r0)
            com.bumptech.glide.ComponentCallbacks2C0007.f349 = r0
            return
        L24f:
            java.lang.String r0 = "Name must be non-null and non-empty, but given: animation"
            defpackage.C2264.m3684(r0)
            return
        L255:
            java.lang.String r0 = "Name must be non-null and non-empty, but given: disk-cache"
            defpackage.C2264.m3684(r0)
            return
        L25b:
            java.lang.String r0 = "Name must be non-null and non-empty, but given: source"
            defpackage.C2264.m3684(r0)
            return
        L261:
            java.lang.Object r0 = r0.next()
            r0.getClass()
            defpackage.C2264.m3679()
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r3 = this;
            defpackage.AbstractC1754.m3158()
            ᲀᛷᛲᛱ r0 = r3.f353
            r1 = 0
            r0.m1691(r1)
            ᛸᲈᲇᲁ r0 = r3.f354
            r0.mo1259()
            ᲇᛶᛳᛱ r3 = r3.f355
            monitor-enter(r3)
            r0 = 0
            r3.m3466(r0)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)
            return
        L18:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r9) {
            r8 = this;
            defpackage.AbstractC1754.m3158()
            java.util.ArrayList r0 = r8.f351
            monitor-enter(r0)
            java.util.ArrayList r1 = r8.f351     // Catch: java.lang.Throwable -> L1c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1c
            ᲈᛲᛵᲀ r2 = (defpackage.ComponentCallbacks2C2190) r2     // Catch: java.lang.Throwable -> L1c
            r2.getClass()     // Catch: java.lang.Throwable -> L1c
            goto Lc
        L1c:
            r8 = move-exception
            goto L67
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            ᲀᛷᛲᛱ r1 = r8.f353
            r1.getClass()
            r0 = 15
            r2 = 20
            r3 = 40
            if (r9 < r3) goto L32
            r4 = 0
            r1.m1691(r4)
            goto L40
        L32:
            if (r9 >= r2) goto L36
            if (r9 != r0) goto L40
        L36:
            monitor-enter(r1)
            long r4 = r1.f3555     // Catch: java.lang.Throwable -> L64
            monitor-exit(r1)
            r6 = 2
            long r4 = r4 / r6
            r1.m1691(r4)
        L40:
            ᛸᲈᲇᲁ r1 = r8.f354
            r1.mo1258(r9)
            ᲇᛶᛳᛱ r8 = r8.f355
            monitor-enter(r8)
            if (r9 < r3) goto L54
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L61
            r9 = 0
            r8.m3466(r9)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            goto L5f
        L51:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L51
            throw r9     // Catch: java.lang.Throwable -> L61
        L54:
            if (r9 >= r2) goto L58
            if (r9 != r0) goto L5f
        L58:
            int r9 = r8.f8865     // Catch: java.lang.Throwable -> L61
            int r9 = r9 / 2
            r8.m3466(r9)     // Catch: java.lang.Throwable -> L61
        L5f:
            monitor-exit(r8)
            return
        L61:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            throw r9
        L64:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            throw r8
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r8
    }
}
