package defpackage;

/* JADX INFO: renamed from: ᛸᛵᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1487 implements defpackage.InterfaceC1914, defpackage.InterfaceC0953, defpackage.InterfaceC0696 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C1487 f6574;

    public C1487() {
            r0 = this;
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static int m2689(android.graphics.fonts.FontStyle r2, android.graphics.fonts.FontStyle r3) {
            int r0 = r2.getWeight()
            int r1 = r3.getWeight()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 / 100
            int r2 = r2.getSlant()
            int r3 = r3.getSlant()
            if (r2 != r3) goto L1b
            r2 = 0
            goto L1c
        L1b:
            r2 = 2
        L1c:
            int r0 = r0 + r2
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static byte[] m2690(java.util.List r3) {
            ᛸᲁᛵ r0 = new ᛸᲁᛵ
            r0.<init>()
            java.util.ArrayList r3 = m2692(r3)
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r0.m2855(r2)
            r0.m2838(r1)
            goto Ld
        L24:
            long r1 = r0.f6928
            byte[] r3 = r0.m2833(r1)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static com.ss.android.ugc.awemes.WardDatabase m2691(android.content.Context r32) {
            android.content.Context r1 = r32.getApplicationContext()
            r2 = -927038910668334(0xfffcb4dcef0961d2, double:NaN)
            r2 = -927154874785326(0xfffcb4c1ef0961d2, double:NaN)
            java.lang.String r2 = "ward_database"
            boolean r0 = defpackage.AbstractC1347.m2524(r2)
            r3 = 0
            if (r0 != 0) goto L3fd
            java.lang.String r0 = ":memory:"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3f6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            ᛳᛴᛱᲀ r4 = new ᛳᛴᛱᲀ
            r0 = 1
            r4.<init>(r0)
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.Class<com.ss.android.ugc.awemes.WardDatabase> r7 = com.ss.android.ugc.awemes.WardDatabase.class
            ᛲᲀᲈᛳ r22 = defpackage.AbstractC1168.m2249(r7)
            ᛳᲈᛴ r7 = com.ss.android.ugc.awemes.WardDatabase.f428
            ᛳᲈᛴ r8 = com.ss.android.ugc.awemes.WardDatabase.f426
            ᛳᲈᛴ r9 = com.ss.android.ugc.awemes.WardDatabase.f429
            ᛳᲈᛴ[] r7 = new defpackage.C0589[]{r7, r8, r9}
            r23 = 0
            r8 = r23
        L57:
            r9 = 3
            if (r8 >= r9) goto L71
            r9 = r7[r8]
            int r10 = r9.f2957
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.add(r10)
            int r9 = r9.f2958
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.add(r9)
            int r8 = r8 + 1
            goto L57
        L71:
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r9)
            ᛳᲈᛴ[] r7 = (defpackage.C0589[]) r7
            int r8 = r7.length
            r10 = r23
        L7a:
            if (r10 >= r8) goto L84
            r11 = r7[r10]
            r4.m1226(r11)
            int r10 = r10 + 1
            goto L7a
        L84:
            ᛶᲇᛱᛱ r8 = defpackage.C0824.f3789
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto Lb5
            java.util.Iterator r6 = r6.iterator()
        L90:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb5
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r10 = r13.contains(r10)
            if (r10 != 0) goto Lab
            goto L90
        Lab:
            java.lang.String r0 = "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "
            java.lang.String r0 = defpackage.AbstractC1124.m2145(r7, r0)
            defpackage.C2264.m3678(r0)
            return r3
        Lb5:
            r6 = r3
            ᛷᲈᲀ r3 = new ᛷᲈᲀ
            r7 = 25
            r3.<init>(r7)
            r7 = r0
            ᛸᲁᛶᛸ r0 = new ᛸᲁᛶᛸ
            java.lang.String r10 = "activity"
            java.lang.Object r10 = r1.getSystemService(r10)
            boolean r11 = r10 instanceof android.app.ActivityManager
            if (r11 == 0) goto Lcd
            android.app.ActivityManager r10 = (android.app.ActivityManager) r10
            goto Lce
        Lcd:
            r10 = r6
        Lce:
            if (r10 == 0) goto Ld7
            boolean r10 = r10.isLowRamDevice()
            if (r10 != 0) goto Ld7
            goto Ld8
        Ld7:
            r9 = 2
        Ld8:
            r20 = 0
            r21 = 0
            r10 = r6
            r6 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r14 = r12
            r12 = 1
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r24 = r19
            r19 = 0
            r25 = r7
            r7 = r9
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Class r1 = r22.mo1084()
            java.lang.Package r2 = r1.getPackage()
            if (r2 == 0) goto L108
            java.lang.String r2 = r2.getName()
            if (r2 != 0) goto L10a
        L108:
            java.lang.String r2 = ""
        L10a:
            java.lang.String r3 = r1.getCanonicalName()
            int r4 = r2.length()
            if (r4 != 0) goto L116
            r7 = 1
            goto L120
        L116:
            int r4 = r2.length()
            r7 = 1
            int r4 = r4 + r7
            java.lang.String r3 = r3.substring(r4)
        L120:
            r4 = 95
            r5 = 46
            java.lang.String r3 = r3.replace(r5, r4)
            java.lang.String r4 = "_Impl"
            java.lang.String r3 = r3.concat(r4)
            int r4 = r2.length()     // Catch: java.lang.InstantiationException -> L39b java.lang.IllegalAccessException -> L39d java.lang.ClassNotFoundException -> L39f
            if (r4 != 0) goto L136
            r2 = r3
            goto L148
        L136:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.InstantiationException -> L39b java.lang.IllegalAccessException -> L39d java.lang.ClassNotFoundException -> L39f
            r4.<init>()     // Catch: java.lang.InstantiationException -> L39b java.lang.IllegalAccessException -> L39d java.lang.ClassNotFoundException -> L39f
            r4.append(r2)     // Catch: java.lang.InstantiationException -> L39b java.lang.IllegalAccessException -> L39d java.lang.ClassNotFoundException -> L39f
            r4.append(r5)     // Catch: java.lang.InstantiationException -> L39b java.lang.IllegalAccessException -> L39d java.lang.ClassNotFoundException -> L39f
            r4.append(r3)     // Catch: java.lang.InstantiationException -> L39b java.lang.IllegalAccessException -> L39d java.lang.ClassNotFoundException -> L39f
            java.lang.String r2 = r4.toString()     // Catch: java.lang.InstantiationException -> L39b java.lang.IllegalAccessException -> L39d java.lang.ClassNotFoundException -> L39f
        L148:
            java.lang.ClassLoader r4 = r1.getClassLoader()     // Catch: java.lang.InstantiationException -> L39b java.lang.IllegalAccessException -> L39d java.lang.ClassNotFoundException -> L39f
            java.lang.Class r2 = java.lang.Class.forName(r2, r7, r4)     // Catch: java.lang.InstantiationException -> L39b java.lang.IllegalAccessException -> L39d java.lang.ClassNotFoundException -> L39f
            r15 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r15)     // Catch: java.lang.InstantiationException -> L39b java.lang.IllegalAccessException -> L39d java.lang.ClassNotFoundException -> L39f
            java.lang.Object r1 = r2.newInstance(r15)     // Catch: java.lang.InstantiationException -> L39b java.lang.IllegalAccessException -> L39d java.lang.ClassNotFoundException -> L39f
            com.ss.android.ugc.awemes.WardDatabase r1 = (com.ss.android.ugc.awemes.WardDatabase) r1
            r1.f431 = r7
            ᲇᲁᛱᛱ r3 = r1.mo305()     // Catch: defpackage.C0118 -> L162
            goto L163
        L162:
            r3 = r15
        L163:
            if (r3 == 0) goto L37b
            ᲁᛸᲀᛸ r2 = new ᲁᛸᲀᛸ
            ᲁᛵᲀᛵ r24 = new ᲁᛵᲀᛵ
            r30 = 1
            r31 = 1
            r25 = 2
            java.lang.Class<ᛳᛲᛷᲁ> r27 = defpackage.AbstractC0425.class
            java.lang.String r28 = "compatTransactionCoroutineExecute"
            java.lang.String r29 = "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r26 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r4 = r24
            r2.<init>(r0, r3, r4)
            r1.f433 = r2
            ᛸᛸᛶᲈ r2 = r1.mo306()
            r1.f439 = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r3 = r1.mo311()
            java.util.List r4 = r0.f6934
            int r5 = r4.size()
            boolean[] r6 = new boolean[r5]
            java.util.Iterator r3 = r3.iterator()
        L19c:
            boolean r8 = r3.hasNext()
            r9 = -1
            if (r8 == 0) goto L1f0
            java.lang.Object r8 = r3.next()
            ᛲᲀᲈᛳ r8 = (defpackage.C0355) r8
            int r10 = r4.size()
            int r10 = r10 + r9
            if (r10 < 0) goto L1c5
        L1b0:
            int r11 = r10 + (-1)
            java.lang.Object r12 = r4.get(r10)
            boolean r12 = r8.m1083(r12)
            if (r12 == 0) goto L1c0
            r6[r10] = r7
            r9 = r10
            goto L1c5
        L1c0:
            if (r11 >= 0) goto L1c3
            goto L1c5
        L1c3:
            r10 = r11
            goto L1b0
        L1c5:
            if (r9 < 0) goto L1cf
            java.lang.Object r9 = r4.get(r9)
            r2.put(r8, r9)
            goto L19c
        L1cf:
            java.lang.String r0 = r8.m1085()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "A required auto migration spec ("
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ") is missing in the database configuration."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L1f0:
            int r3 = r4.size()
            int r3 = r3 + r9
            if (r3 < 0) goto L20a
        L1f7:
            int r4 = r3 + (-1)
            if (r3 >= r5) goto L204
            boolean r3 = r6[r3]
            if (r3 == 0) goto L204
            if (r4 >= 0) goto L202
            goto L20a
        L202:
            r3 = r4
            goto L1f7
        L204:
            java.lang.String r0 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            defpackage.C2264.m3684(r0)
            return r15
        L20a:
            java.util.List r2 = r1.mo310(r2)
            java.util.Iterator r2 = r2.iterator()
        L212:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24f
            java.lang.Object r3 = r2.next()
            ᛳᲈᛴ r3 = (defpackage.C0589) r3
            int r4 = r3.f2957
            int r5 = r3.f2958
            ᛳᛴᛱᲀ r6 = r0.f6937
            java.util.LinkedHashMap r8 = r6.f2205
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r10 = r8.containsKey(r10)
            if (r10 == 0) goto L247
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r8.get(r4)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 != 0) goto L23e
            ᲇᛴᛳᲇ r4 = defpackage.C2033.f8764
        L23e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r4 = r4.containsKey(r5)
            goto L249
        L247:
            r4 = r23
        L249:
            if (r4 != 0) goto L212
            r6.m1226(r3)
            goto L212
        L24f:
            java.util.LinkedHashMap r2 = r1.mo312()
            java.util.List r3 = r0.f6941
            int r4 = r3.size()
            boolean[] r4 = new boolean[r4]
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L263:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L2c5
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            ᛲᲀᲈᛳ r6 = (defpackage.C0355) r6
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L27f:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L263
            java.lang.Object r8 = r5.next()
            ᛲᲀᲈᛳ r8 = (defpackage.C0355) r8
            int r10 = r3.size()
            int r10 = r10 + r9
            if (r10 < 0) goto L2a6
        L292:
            int r11 = r10 + (-1)
            java.lang.Object r12 = r3.get(r10)
            boolean r12 = r8.m1083(r12)
            if (r12 == 0) goto L2a1
            r4[r10] = r7
            goto L2a7
        L2a1:
            if (r11 >= 0) goto L2a4
            goto L2a6
        L2a4:
            r10 = r11
            goto L292
        L2a6:
            r10 = r9
        L2a7:
            if (r10 < 0) goto L2b3
            java.lang.Object r10 = r3.get(r10)
            java.util.LinkedHashMap r11 = r1.f437
            r11.put(r8, r10)
            goto L27f
        L2b3:
            java.lang.String r0 = r8.m1085()
            java.lang.String r1 = r6.m1085()
            java.lang.String r2 = " is missing in the database configuration."
            java.lang.String r3 = "A required type converter ("
            java.lang.String r4 = ") for "
            defpackage.C0086.m547(r3, r0, r4, r1, r2)
            return r15
        L2c5:
            int r2 = r3.size()
            int r2 = r2 + r9
            if (r2 < 0) goto L2e3
        L2cc:
            int r5 = r2 + (-1)
            boolean r6 = r4[r2]
            if (r6 == 0) goto L2d7
            if (r5 >= 0) goto L2d5
            goto L2e3
        L2d5:
            r2 = r5
            goto L2cc
        L2d7:
            java.lang.Object r0 = r3.get(r2)
            java.lang.String r1 = "Unexpected type converter "
            java.lang.String r2 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
            defpackage.C0086.m559(r0, r1, r2)
            return r15
        L2e3:
            java.util.concurrent.Executor r2 = r0.f6930
            r1.f435 = r2
            ᛳᛴᛶᛲ r2 = new ᛳᛴᛶᛲ
            java.util.concurrent.Executor r3 = r0.f6933
            r2.<init>(r3)
            r1.f434 = r2
            java.util.concurrent.Executor r3 = r1.f435
            if (r3 != 0) goto L2f5
            r3 = r15
        L2f5:
            ᲈᛴᛲᛵ r2 = new ᲈᛴᛲᛵ
            r2.<init>(r3)
            ᛸᛷᛱᛷ r3 = defpackage.AbstractC1754.m3149()
            ᛳᛵᲈᛵ r2 = defpackage.AbstractC0397.m1146(r2, r3)
            ᛳᲁᛳᛴ r2 = defpackage.AbstractC1628.m2962(r2)
            r1.f436 = r2
            ᛳᛵᲈᛵ r2 = r2.f2727
            ᛳᛴᛶᛲ r3 = r1.f434
            if (r3 != 0) goto L30f
            r3 = r15
        L30f:
            ᲈᛴᛲᛵ r4 = new ᲈᛴᛲᛵ
            r4.<init>(r3)
            ᛳᛵᲈᛵ r2 = r2.mo971(r4)
            r1.f438 = r2
            boolean r2 = r0.f6944
            r1.f430 = r2
            ᲁᛸᲀᛸ r3 = r1.f433
            if (r3 != 0) goto L323
            r3 = r15
        L323:
            ᲁᛱᲀᛲ r2 = r3.f8264
            if (r2 != 0) goto L329
        L327:
            r3 = r15
            goto L33a
        L329:
            r3 = r2
        L32a:
            boolean r2 = r3 instanceof defpackage.AbstractC0287
            if (r2 == 0) goto L32f
            goto L33a
        L32f:
            boolean r2 = r3 instanceof defpackage.InterfaceC1846
            if (r2 == 0) goto L327
            ᲁᛴᛶᛷ r3 = (defpackage.InterfaceC1846) r3
            ᲁᛱᲀᛲ r3 = r3.m3233()
            goto L32a
        L33a:
            ᛲᛴᲁᲈ r3 = (defpackage.AbstractC0287) r3
            ᲁᛸᲀᛸ r3 = r1.f433
            if (r3 != 0) goto L341
            r3 = r15
        L341:
            ᲁᛱᲀᛲ r2 = r3.f8264
            if (r2 != 0) goto L347
        L345:
            r3 = r15
            goto L358
        L347:
            r3 = r2
        L348:
            boolean r2 = r3 instanceof defpackage.AbstractC0834
            if (r2 == 0) goto L34d
            goto L358
        L34d:
            boolean r2 = r3 instanceof defpackage.InterfaceC1846
            if (r2 == 0) goto L345
            ᲁᛴᛶᛷ r3 = (defpackage.InterfaceC1846) r3
            ᲁᛱᲀᛲ r3 = r3.m3233()
            goto L348
        L358:
            ᛵᛲᛷᲁ r3 = (defpackage.AbstractC0834) r3
            android.content.Intent r2 = r0.f6940
            if (r2 == 0) goto L37a
            java.lang.String r3 = r0.f6943
            if (r3 == 0) goto L374
            ᛸᛸᛶᲈ r4 = r1.f439
            if (r4 != 0) goto L367
            goto L368
        L367:
            r15 = r4
        L368:
            r15.f6838 = r2
            ᲀᛵᛶᛱ r2 = new ᲀᛵᛶᛱ
            android.content.Context r0 = r0.f6939
            r2.<init>(r0, r3, r15)
            r15.f6839 = r2
            goto L37a
        L374:
            java.lang.String r0 = "Required value was null."
            defpackage.C2264.m3684(r0)
            return r15
        L37a:
            return r1
        L37b:
            ᲁᛸᲀᛸ r2 = new ᲁᛸᲀᛸ
            ᛴᛳᛷᛸ r3 = new ᛴᛳᛷᛸ
            r3.<init>(r1)
            ᲁᛵᲀᛵ r24 = new ᲁᛵᲀᛵ
            r30 = 1
            r31 = 0
            r25 = 2
            java.lang.Class<ᛳᛲᛷᲁ> r27 = defpackage.AbstractC0425.class
            java.lang.String r28 = "compatTransactionCoroutineExecute"
            java.lang.String r29 = "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r26 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r1 = r24
            r2.<init>(r0, r3, r1)
            throw r15
        L39b:
            r0 = move-exception
            goto L3a1
        L39d:
            r0 = move-exception
            goto L3b9
        L39f:
            r0 = move-exception
            goto L3d1
        L3a1:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to create an instance of "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L3b9:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot access the constructor "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L3d1:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Cannot find implementation for "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = ". "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = " does not exist. Is Room annotation processor correctly configured?"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1, r0)
            throw r2
        L3f6:
            r15 = r3
            java.lang.String r0 = "Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            defpackage.C2264.m3684(r0)
            return r15
        L3fd:
            r15 = r3
            java.lang.String r0 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            defpackage.C2264.m3684(r0)
            return r15
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.util.ArrayList m2692(java.util.List r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r4.next()
            r2 = r1
            ᲁᛳᛶᛵ r2 = (defpackage.EnumC1832) r2
            ᲁᛳᛶᛵ r3 = defpackage.EnumC1832.f7982
            if (r2 == r3) goto L9
            r0.add(r1)
            goto L9
        L1e:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r1 = defpackage.AbstractC0575.m1369(r0)
            r4.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            ᲁᛳᛶᛵ r1 = (defpackage.EnumC1832) r1
            java.lang.String r1 = r1.f7986
            r4.add(r1)
            goto L2b
        L3d:
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m2693(defpackage.InterfaceC0270 r3, java.lang.Object r4) {
            ᛷᛶᛷᛲ r4 = (defpackage.C1294) r4
            r0 = -15268893335086(0xfffff21cef0961d2, double:NaN)
            r0 = -15311843008046(0xfffff212ef0961d2, double:NaN)
            r0 = 1
            java.lang.String r1 = r4.f5750
            r3.mo527(r0, r1)
            r0 = 2
            java.lang.String r1 = r4.f5752
            r3.mo527(r0, r1)
            r0 = 3
            java.lang.String r1 = r4.f5749
            r3.mo527(r0, r1)
            r0 = 4
            java.lang.String r1 = r4.f5748
            r3.mo527(r0, r1)
            r0 = 5
            java.lang.String r1 = r4.f5747
            r3.mo527(r0, r1)
            r0 = 6
            java.lang.String r1 = r4.f5753
            r3.mo527(r0, r1)
            r0 = 7
            long r1 = r4.f5754
            r3.mo528(r1, r0)
            r0 = 8
            long r1 = r4.f5743
            r3.mo528(r1, r0)
            java.lang.String r0 = r4.f5746
            r1 = 9
            if (r0 != 0) goto L4d
            r3.mo529(r1)
            goto L50
        L4d:
            r3.mo527(r1, r0)
        L50:
            java.lang.String r0 = r4.f5751
            r1 = 10
            if (r0 != 0) goto L5a
            r3.mo529(r1)
            goto L5d
        L5a:
            r3.mo527(r1, r0)
        L5d:
            java.lang.String r0 = r4.f5744
            r1 = 11
            if (r0 != 0) goto L67
            r3.mo529(r1)
            goto L6a
        L67:
            r3.mo527(r1, r0)
        L6a:
            java.lang.String r4 = r4.f5745
            r0 = 12
            if (r4 != 0) goto L74
            r3.mo529(r0)
            return
        L74:
            r3.mo527(r0, r4)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static android.graphics.fonts.Font m2694(android.graphics.fonts.FontFamily r5, int r6) {
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r6 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r6 = r6 & 2
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L13
            r6 = r3
            goto L14
        L13:
            r6 = r2
        L14:
            r0.<init>(r1, r6)
            android.graphics.fonts.Font r6 = r5.getFont(r2)
            android.graphics.fonts.FontStyle r1 = r6.getStyle()
            int r1 = m2689(r0, r1)
        L23:
            int r2 = r5.getSize()
            if (r3 >= r2) goto L3c
            android.graphics.fonts.Font r2 = r5.getFont(r3)
            android.graphics.fonts.FontStyle r4 = r2.getStyle()
            int r4 = m2689(r0, r4)
            if (r4 >= r1) goto L39
            r6 = r2
            r1 = r4
        L39:
            int r3 = r3 + 1
            goto L23
        L3c:
            return r6
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public android.graphics.fonts.FontFamily m2695(defpackage.C0275[] r10, android.content.ContentResolver r11) {
            r9 = this;
            int r0 = r10.length
            r1 = 0
            r2 = 0
            r3 = r1
        L4:
            if (r2 >= r0) goto L7d
            r4 = r10[r2]
            android.net.Uri r5 = r4.f1550
            java.lang.String r5 = r5.getScheme()
            java.lang.String r6 = "systemfont"
            boolean r5 = java.util.Objects.equals(r5, r6)
            if (r5 == 0) goto L1b
            android.graphics.fonts.Font r4 = r9.mo1164(r4)
            goto L6c
        L1b:
            android.net.Uri r5 = r4.f1550     // Catch: java.io.IOException -> L2e
            java.lang.String r6 = r4.f1547     // Catch: java.io.IOException -> L2e
            java.lang.String r7 = "r"
            android.os.ParcelFileDescriptor r5 = r11.openFileDescriptor(r5, r7, r1)     // Catch: java.io.IOException -> L2e
            if (r5 != 0) goto L30
            if (r5 == 0) goto L2c
            r5.close()     // Catch: java.io.IOException -> L2e
        L2c:
            r4 = r1
            goto L6c
        L2e:
            r4 = move-exception
            goto L64
        L30:
            android.graphics.fonts.Font$Builder r7 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L51
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L51
            int r8 = r4.f1549     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r7 = r7.setWeight(r8)     // Catch: java.lang.Throwable -> L51
            boolean r8 = r4.f1548     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r7 = r7.setSlant(r8)     // Catch: java.lang.Throwable -> L51
            int r4 = r4.f1551     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r4 = r7.setTtcIndex(r4)     // Catch: java.lang.Throwable -> L51
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L53
            r4.setFontVariationSettings(r6)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r4 = move-exception
            goto L5b
        L53:
            android.graphics.fonts.Font r4 = r4.build()     // Catch: java.lang.Throwable -> L51
            r5.close()     // Catch: java.io.IOException -> L2e
            goto L6c
        L5b:
            r5.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L2e
        L63:
            throw r4     // Catch: java.io.IOException -> L2e
        L64:
            java.lang.String r5 = "TypefaceCompatApi29Impl"
            java.lang.String r6 = "Font load failed"
            android.util.Log.w(r5, r6, r4)
            goto L2c
        L6c:
            if (r4 != 0) goto L6f
            goto L7a
        L6f:
            if (r3 != 0) goto L77
            android.graphics.fonts.FontFamily$Builder r3 = new android.graphics.fonts.FontFamily$Builder
            r3.<init>(r4)
            goto L7a
        L77:
            r3.addFont(r4)
        L7a:
            int r2 = r2 + 1
            goto L4
        L7d:
            if (r3 != 0) goto L80
            return r1
        L80:
            android.graphics.fonts.FontFamily r9 = r3.build()
            return r9
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public com.ss.android.ugc.awemes.WardDatabase m2696(android.content.Context r3) {
            r2 = this;
            r0 = -927004550929966(0xfffcb4e4ef0961d2, double:NaN)
            com.ss.android.ugc.awemes.WardDatabase r0 = com.ss.android.ugc.awemes.WardDatabase.f427
            if (r0 != 0) goto L23
            monitor-enter(r2)
            com.ss.android.ugc.awemes.WardDatabase r0 = com.ss.android.ugc.awemes.WardDatabase.f427     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1f
            ᛸᛵᛴᛲ r0 = com.ss.android.ugc.awemes.WardDatabase.f425     // Catch: java.lang.Throwable -> L1d
            r0.getClass()     // Catch: java.lang.Throwable -> L1d
            com.ss.android.ugc.awemes.WardDatabase r0 = m2691(r3)     // Catch: java.lang.Throwable -> L1d
            com.ss.android.ugc.awemes.WardDatabase.f427 = r0     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r3 = move-exception
            goto L21
        L1f:
            monitor-exit(r2)
            return r0
        L21:
            monitor-exit(r2)
            throw r3
        L23:
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public android.graphics.fonts.Font mo1164(defpackage.C0275 r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Getting font from Typeface is not supported before API31"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.graphics.Typeface m2697(android.content.Context r6, java.util.List r7, int r8) {
            r5 = this;
            android.content.ContentResolver r6 = r6.getContentResolver()
            r0 = 0
            r1 = 0
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Exception -> L2f
            ᛲᛳᲈᲁ[] r0 = (defpackage.C0275[]) r0     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontFamily r0 = r5.m2695(r0, r6)     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L13
            return r1
        L13:
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L2f
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2f
            r3 = 1
        L19:
            int r4 = r7.size()     // Catch: java.lang.Exception -> L2f
            if (r3 >= r4) goto L34
            java.lang.Object r4 = r7.get(r3)     // Catch: java.lang.Exception -> L2f
            ᛲᛳᲈᲁ[] r4 = (defpackage.C0275[]) r4     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontFamily r4 = r5.m2695(r4, r6)     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto L31
            r2.addCustomFallback(r4)     // Catch: java.lang.Exception -> L2f
            goto L31
        L2f:
            r5 = move-exception
            goto L45
        L31:
            int r3 = r3 + 1
            goto L19
        L34:
            android.graphics.fonts.Font r5 = m2694(r0, r8)     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontStyle r5 = r5.getStyle()     // Catch: java.lang.Exception -> L2f
            android.graphics.Typeface$CustomFallbackBuilder r5 = r2.setStyle(r5)     // Catch: java.lang.Exception -> L2f
            android.graphics.Typeface r5 = r5.build()     // Catch: java.lang.Exception -> L2f
            return r5
        L45:
            java.lang.String r6 = "TypefaceCompatApi29Impl"
            java.lang.String r7 = "Font load failed"
            android.util.Log.w(r6, r7, r5)
            return r1
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public java.lang.Object m2698(defpackage.C0569 r4) {
            r3 = this;
            com.thegrizzlylabs.sardineandroid.model.Multistatus r3 = defpackage.AbstractC1193.m2324(r4)
            java.util.List r3 = r3.getResponse()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r3.size()
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r3.next()
            com.thegrizzlylabs.sardineandroid.model.Response r0 = (com.thegrizzlylabs.sardineandroid.model.Response) r0
            ᛷᛷᲈᛶ r1 = new ᛷᛷᲈᛶ     // Catch: java.net.URISyntaxException -> L2a
            r1.<init>(r0)     // Catch: java.net.URISyntaxException -> L2a
            r4.add(r1)     // Catch: java.net.URISyntaxException -> L2a
            goto L15
        L2a:
            java.lang.String r0 = r0.getHref()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Ignore resource with invalid URI "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "ᛸᛵᛴᛲ"
            android.util.Log.w(r1, r0)
            goto L15
        L42:
            return r4
    }

    @Override // defpackage.InterfaceC0953
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public boolean mo1902(java.lang.Object r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC0696
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public defpackage.InterfaceC2267 mo365(defpackage.C1326 r3) {
            r2 = this;
            ᲇᛱᛱᛷ r2 = new ᲇᛱᛱᛷ
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            ᲈᛶᲀᛳ r3 = r3.m2475(r0, r1)
            r0 = 0
            r2.<init>(r3, r0)
            return r2
    }
}
