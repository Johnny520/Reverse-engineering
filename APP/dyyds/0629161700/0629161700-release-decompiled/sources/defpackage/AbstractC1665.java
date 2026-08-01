package defpackage;

/* JADX INFO: renamed from: ᲀᛴᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1665 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.concurrent.ConcurrentHashMap f7444 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.AbstractC1665.f7444 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3062(java.lang.Class r28) {
            r0 = r28
            java.util.concurrent.ConcurrentHashMap r1 = defpackage.AbstractC1665.f7444
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L5e0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = r0
        L10:
            r3 = 0
            r4 = 1
            r5 = 2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            if (r2 == r7) goto L182
            java.lang.reflect.Field[] r7 = r2.getDeclaredFields()
            int r8 = r7.length
            r9 = r3
        L1d:
            if (r9 >= r8) goto L17c
            r10 = r7[r9]
            java.lang.String r11 = r10.getName()
            boolean r12 = r1.containsKey(r11)
            if (r12 == 0) goto L31
            r18 = r4
            r17 = r5
            goto L174
        L31:
            ᛴᛶᛸᲈ r12 = new ᛴᛶᛸᲈ
            r12.<init>()
            java.lang.String r13 = r10.getName()
            r12.f3338 = r13
            int r13 = r10.getModifiers()
            r14 = r13 & 136(0x88, float:1.9E-43)
            if (r14 <= 0) goto L4a
            r18 = r4
            r17 = r5
            goto L165
        L4a:
            r13 = r13 & 1
            if (r13 <= 0) goto L50
            r12.f3341 = r10
        L50:
            java.lang.String r13 = r10.getName()
            int r14 = r13.length()
            int r15 = r14 + 3
            char[] r15 = new char[r15]
            r16 = 115(0x73, float:1.61E-43)
            r15[r3] = r16
            r17 = 101(0x65, float:1.42E-43)
            r15[r4] = r17
            r17 = 116(0x74, float:1.63E-43)
            r15[r5] = r17
            r17 = r5
            char r5 = r13.charAt(r3)
            r18 = r4
            r4 = 122(0x7a, float:1.71E-43)
            r6 = 97
            if (r5 < r6) goto L7b
            if (r5 > r4) goto L7b
            int r5 = r5 + (-32)
            char r5 = (char) r5
        L7b:
            r20 = 3
            r15[r20] = r5
            r5 = r18
        L81:
            if (r5 >= r14) goto L8e
            int r20 = r5 + 3
            char r21 = r13.charAt(r5)
            r15[r20] = r21
            int r5 = r5 + 1
            goto L81
        L8e:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r15)
            java.lang.Class r13 = r10.getType()     // Catch: java.lang.Exception -> La1
            java.lang.Class[] r13 = new java.lang.Class[]{r13}     // Catch: java.lang.Exception -> La1
            java.lang.reflect.Method r5 = r2.getDeclaredMethod(r5, r13)     // Catch: java.lang.Exception -> La1
            r12.f3342 = r5     // Catch: java.lang.Exception -> La1
        La1:
            java.lang.Class r5 = r10.getType()
            java.lang.Class r13 = java.lang.Boolean.TYPE
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto Le4
            java.lang.String r13 = r10.getName()
            int r14 = r13.length()
            int r15 = r14 + 2
            char[] r15 = new char[r15]
            r20 = 105(0x69, float:1.47E-43)
            r15[r3] = r20
            r15[r18] = r16
            r16 = r5
            char r5 = r13.charAt(r3)
            if (r5 < r6) goto Lcc
            if (r5 > r4) goto Lcc
            int r5 = r5 + (-32)
            char r5 = (char) r5
        Lcc:
            r15[r17] = r5
            r4 = r18
        Ld0:
            if (r4 >= r14) goto Ldd
            int r5 = r4 + 2
            char r6 = r13.charAt(r4)
            r15[r5] = r6
            int r4 = r4 + 1
            goto Ld0
        Ldd:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r15)
        Le2:
            r5 = 0
            goto Lef
        Le4:
            r16 = r5
            java.lang.String r4 = r10.getName()
            java.lang.String r4 = defpackage.AbstractC1849.m3255(r4)
            goto Le2
        Lef:
            java.lang.reflect.Method r4 = r2.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> Lf5
            r12.f3340 = r4     // Catch: java.lang.Exception -> Lf5
        Lf5:
            java.lang.reflect.Method r4 = r12.f3340
            if (r4 != 0) goto L10a
            if (r16 == 0) goto L10a
            java.lang.String r4 = r10.getName()     // Catch: java.lang.Exception -> L10a
            java.lang.String r4 = defpackage.AbstractC1849.m3255(r4)     // Catch: java.lang.Exception -> L10a
            r5 = 0
            java.lang.reflect.Method r4 = r2.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L10a
            r12.f3340 = r4     // Catch: java.lang.Exception -> L10a
        L10a:
            java.lang.reflect.Field r4 = r12.f3341
            if (r4 != 0) goto L117
            java.lang.reflect.Method r4 = r12.f3340
            if (r4 != 0) goto L117
            java.lang.reflect.Method r4 = r12.f3342
            if (r4 != 0) goto L117
            goto L165
        L117:
            java.lang.reflect.Method r4 = r12.f3340
            java.lang.Class<ᛲᛲᛱᛱ> r5 = defpackage.InterfaceC0244.class
            if (r4 == 0) goto L134
            java.lang.annotation.Annotation r4 = r4.getAnnotation(r5)
            ᛲᛲᛱᛱ r4 = (defpackage.InterfaceC0244) r4
            if (r4 == 0) goto L12d
            boolean r4 = r4.value()
            if (r4 == 0) goto L12d
            r4 = r3
            goto L12f
        L12d:
            r4 = r18
        L12f:
            if (r4 != 0) goto L134
            r4 = 0
            r12.f3340 = r4
        L134:
            java.lang.reflect.Method r4 = r12.f3342
            if (r4 == 0) goto L14f
            java.lang.annotation.Annotation r4 = r4.getAnnotation(r5)
            ᛲᛲᛱᛱ r4 = (defpackage.InterfaceC0244) r4
            if (r4 == 0) goto L148
            boolean r4 = r4.value()
            if (r4 == 0) goto L148
            r4 = r3
            goto L14a
        L148:
            r4 = r18
        L14a:
            if (r4 != 0) goto L14f
            r5 = 0
            r12.f3342 = r5
        L14f:
            java.lang.reflect.Method r4 = r12.f3340
            if (r4 != 0) goto L15c
            java.lang.reflect.Method r4 = r12.f3342
            if (r4 != 0) goto L15c
            java.lang.reflect.Field r4 = r12.f3341
            if (r4 != 0) goto L15c
            goto L165
        L15c:
            java.lang.Class r4 = r10.getType()
            r12.f3339 = r4
            r10.getGenericType()
        L165:
            java.lang.reflect.Field r4 = r12.f3341
            if (r4 != 0) goto L171
            java.lang.reflect.Method r4 = r12.f3340
            if (r4 != 0) goto L171
            java.lang.reflect.Method r4 = r12.f3342
            if (r4 == 0) goto L174
        L171:
            r1.put(r11, r12)
        L174:
            int r9 = r9 + 1
            r5 = r17
            r4 = r18
            goto L1d
        L17c:
            java.lang.Class r2 = r2.getSuperclass()
            goto L10
        L182:
            r18 = r4
            r17 = r5
            java.util.Collection r2 = r1.values()
            int r1 = r1.size()
            ᛴᛶᛸᲈ[] r1 = new defpackage.C0695[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            ᛴᛶᛸᲈ[] r1 = (defpackage.C0695[]) r1
            java.lang.String r2 = r0.getName()
            java.lang.String r4 = "java.util."
            boolean r4 = r2.startsWith(r4)
            java.lang.String r5 = "AccAccess"
            if (r4 == 0) goto L1ab
            java.lang.String r4 = "net.minidev.asm."
            java.lang.String r2 = defpackage.AbstractC0225.m817(r4, r2, r5)
            goto L1af
        L1ab:
            java.lang.String r2 = r2.concat(r5)
        L1af:
            ᲇᛶᛷ r4 = new ᲇᛶᛷ
            java.lang.ClassLoader r5 = r0.getClassLoader()
            r4.<init>(r5)
            java.lang.Class r5 = r4.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L1bd
            goto L1be
        L1bd:
            r5 = 0
        L1be:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            r8 = r0
        L1c4:
            if (r8 == 0) goto L1e4
            boolean r9 = r8.equals(r7)
            if (r9 != 0) goto L1e4
            r6.addLast(r8)
            java.lang.Class[] r9 = r8.getInterfaces()
            int r10 = r9.length
            r11 = r3
        L1d5:
            if (r11 >= r10) goto L1df
            r12 = r9[r11]
            r6.addLast(r12)
            int r11 = r11 + 1
            goto L1d5
        L1df:
            java.lang.Class r8 = r8.getSuperclass()
            goto L1c4
        L1e4:
            r6.addLast(r7)
            if (r5 != 0) goto L5c3
            ᛷᛷᲇᲇ r5 = new ᛷᛷᲇᲇ
            r5.<init>(r0, r1, r4)
            java.util.Iterator r0 = r6.iterator()
        L1f2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25f
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.HashMap r4 = defpackage.AbstractC0170.f1148
            java.lang.Object r1 = r4.get(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            if (r1 != 0) goto L209
            goto L25c
        L209:
            java.util.Iterator r1 = r1.iterator()
        L20d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L25c
            java.lang.Object r4 = r1.next()
            java.lang.Class r4 = (java.lang.Class) r4
            if (r4 != 0) goto L21c
            goto L259
        L21c:
            java.lang.reflect.Method[] r4 = r4.getMethods()
            int r6 = r4.length
            r8 = r3
        L222:
            if (r8 >= r6) goto L259
            r9 = r4[r8]
            int r10 = r9.getModifiers()
            r10 = r10 & 8
            if (r10 != 0) goto L22f
            goto L254
        L22f:
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r11 = r10.length
            r12 = r18
            if (r11 == r12) goto L239
            goto L254
        L239:
            r10 = r10[r3]
            boolean r10 = r10.equals(r7)
            if (r10 != 0) goto L242
            goto L254
        L242:
            java.lang.Class r10 = r9.getReturnType()
            java.lang.Class r11 = java.lang.Void.TYPE
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L24f
            goto L254
        L24f:
            java.util.HashMap r11 = r5.f5838
            r11.put(r10, r9)
        L254:
            int r8 = r8 + 1
            r18 = 1
            goto L222
        L259:
            r18 = 1
            goto L20d
        L25c:
            r18 = 1
            goto L1f2
        L25f:
            ᛳᲇᲇᲇ r9 = new ᛳᲇᲇᲇ
            r9.<init>()
            ᛴᛶᛸᲈ[] r0 = r5.f5835
            int r1 = r0.length
            r4 = 10
            if (r1 <= r4) goto L26d
            r1 = 1
            goto L26e
        L26d:
            r1 = r3
        L26e:
            java.lang.String r4 = "Lnet/minidev/asm/BeansAccess<L"
            java.lang.String r6 = ";>;"
            java.lang.String r7 = r5.f5837
            java.lang.String r13 = defpackage.AbstractC0225.m817(r4, r7, r6)
            java.lang.String r22 = defpackage.C1320.f5831
            r15 = 0
            r10 = 50
            r11 = 33
            java.lang.String r12 = r5.f5832
            r14 = r22
            r9.m1376(r10, r11, r12, r13, r14, r15)
            r13 = 0
            r14 = 0
            r10 = 1
            java.lang.String r11 = "<init>"
            java.lang.String r12 = "()V"
            ᲀᛱᲁᛶ r4 = r9.m1375(r10, r11, r12, r13, r14)
            r6 = 25
            r4.m2925(r6, r3)
            java.lang.String r24 = "()V"
            r25 = 0
            r21 = 183(0xb7, float:2.56E-43)
            java.lang.String r23 = "<init>"
            r20 = r4
            r20.m2916(r21, r22, r23, r24, r25)
            r8 = 177(0xb1, float:2.48E-43)
            r4.m2923(r8)
            r12 = 1
            r4.m2927(r12, r12)
            java.lang.String r11 = "set"
            java.lang.String r12 = "(Ljava/lang/Object;ILjava/lang/Object;)V"
            ᲀᛱᲁᛶ r4 = r9.m1375(r10, r11, r12, r13, r14)
            int r10 = r0.length
            r15 = 21
            r11 = 14
            if (r10 != 0) goto L2bd
            goto L332
        L2bd:
            int r10 = r0.length
            if (r10 <= r11) goto L303
            r10 = r17
            r4.m2925(r15, r10)
            int r10 = r0.length
            ᛶᛴᲀᲇ[] r10 = defpackage.AbstractC1849.m3243(r10)
            ᛶᛴᲀᲇ r12 = new ᛶᛴᲀᲇ
            r12.<init>()
            int r13 = r10.length
            r18 = 1
            int r13 = r13 + (-1)
            r4.m2913(r3, r13, r12, r10)
            int r13 = r0.length
            r14 = r3
            r16 = r14
        L2db:
            if (r14 >= r13) goto L2ff
            r11 = r0[r14]
            int r20 = r16 + 1
            r6 = r10[r16]
            r4.m2924(r6)
            java.lang.reflect.Field r6 = r11.f3341
            if (r6 != 0) goto L2f3
            java.lang.reflect.Method r6 = r11.f3342
            if (r6 == 0) goto L2ef
            goto L2f3
        L2ef:
            r4.m2923(r8)
            goto L2f6
        L2f3:
            r5.m2449(r4, r11)
        L2f6:
            int r14 = r14 + 1
            r16 = r20
            r6 = 25
            r11 = 14
            goto L2db
        L2ff:
            r4.m2924(r12)
            goto L332
        L303:
            int r6 = r0.length
            ᛶᛴᲀᲇ[] r6 = defpackage.AbstractC1849.m3243(r6)
            int r8 = r0.length
            r10 = r3
            r11 = r10
        L30b:
            if (r10 >= r8) goto L332
            r12 = r0[r10]
            r13 = r6[r11]
            defpackage.C1320.m2446(r4, r11, r13)
            r5.m2449(r4, r12)
            r12 = r6[r11]
            r4.m2924(r12)
            r23 = 0
            r25 = 0
            r21 = 3
            r22 = 0
            r24 = 0
            r20 = r4
            r20.m2929(r21, r22, r23, r24, r25)
            r18 = 1
            int r11 = r11 + 1
            int r10 = r10 + 1
            goto L30b
        L332:
            r5.m2448(r4)
            r4.m2927(r3, r3)
            r13 = 0
            r14 = 0
            r10 = 1
            java.lang.String r11 = "get"
            java.lang.String r12 = "(Ljava/lang/Object;I)Ljava/lang/Object;"
            r4 = 14
            ᲀᛱᲁᛶ r20 = r9.m1375(r10, r11, r12, r13, r14)
            int r6 = r0.length
            r10 = 192(0xc0, float:2.69E-43)
            r11 = 176(0xb0, float:2.47E-43)
            if (r6 != 0) goto L35e
            r23 = 0
            r25 = 0
            r21 = 3
            r22 = 0
            r24 = 0
            r20.m2929(r21, r22, r23, r24, r25)
            r12 = r11
            r6 = r20
            goto L475
        L35e:
            r6 = r20
            int r12 = r0.length
            if (r12 <= r4) goto L408
            r4 = 2
            r6.m2925(r15, r4)
            int r4 = r0.length
            ᛶᛴᲀᲇ[] r4 = defpackage.AbstractC1849.m3243(r4)
            ᛶᛴᲀᲇ r12 = new ᛶᛴᲀᲇ
            r12.<init>()
            int r13 = r4.length
            r18 = 1
            int r13 = r13 + (-1)
            r6.m2913(r3, r13, r12, r4)
            int r13 = r0.length
            r14 = r3
            r15 = r14
        L37c:
            if (r14 >= r13) goto L3f3
            r3 = r0[r14]
            int r26 = r15 + 1
            r15 = r4[r15]
            r6.m2924(r15)
            r23 = 0
            r25 = 0
            r21 = 3
            r22 = 0
            r24 = 0
            r20 = r6
            r20.m2929(r21, r22, r23, r24, r25)
            java.lang.reflect.Field r15 = r3.f3341
            java.lang.reflect.Method r8 = r3.f3340
            if (r15 != 0) goto L3aa
            if (r8 == 0) goto L3a2
            r11 = 25
            r15 = 1
            goto L3ad
        L3a2:
            r15 = 1
            r6.m2923(r15)
            r6.m2923(r11)
            goto L3eb
        L3aa:
            r15 = 1
            r11 = 25
        L3ad:
            r6.m2925(r11, r15)
            r6.m2920(r10, r7)
            java.lang.Class r11 = r3.f3339
            ᲇᲀᛴᲁ r11 = defpackage.C2118.m3545(r11)
            java.lang.reflect.Method r15 = r3.f3342
            if (r15 != 0) goto L3c0
            if (r8 != 0) goto L3c0
            goto L3c2
        L3c0:
            if (r8 != 0) goto L3ce
        L3c2:
            java.lang.String r3 = r3.f3338
            java.lang.String r8 = r11.m3546()
            r15 = 180(0xb4, float:2.52E-43)
            r6.m2917(r15, r7, r3, r8)
            goto L3e3
        L3ce:
            java.lang.String r24 = defpackage.C2118.m3544(r8)
            java.lang.String r23 = r8.getName()
            r25 = 0
            r21 = 182(0xb6, float:2.55E-43)
            java.lang.String r3 = r5.f5837
            r22 = r3
            r20 = r6
            r20.m2916(r21, r22, r23, r24, r25)
        L3e3:
            defpackage.AbstractC1849.m3249(r6, r11)
            r3 = 176(0xb0, float:2.47E-43)
            r6.m2923(r3)
        L3eb:
            int r14 = r14 + 1
            r15 = r26
            r3 = 0
            r11 = 176(0xb0, float:2.47E-43)
            goto L37c
        L3f3:
            r6.m2924(r12)
            r23 = 0
            r25 = 0
            r21 = 3
            r22 = 0
            r24 = 0
            r20 = r6
            r20.m2929(r21, r22, r23, r24, r25)
        L405:
            r12 = 176(0xb0, float:2.47E-43)
            goto L475
        L408:
            int r3 = r0.length
            ᛶᛴᲀᲇ[] r3 = defpackage.AbstractC1849.m3243(r3)
            int r4 = r0.length
            r8 = 0
            r11 = 0
        L410:
            if (r8 >= r4) goto L405
            r12 = r0[r8]
            r13 = r3[r11]
            defpackage.C1320.m2446(r6, r11, r13)
            r13 = 25
            r15 = 1
            r6.m2925(r13, r15)
            r6.m2920(r10, r7)
            java.lang.Class r13 = r12.f3339
            java.lang.reflect.Method r14 = r12.f3340
            java.lang.String r15 = r12.f3338
            ᲇᲀᛴᲁ r13 = defpackage.C2118.m3545(r13)
            java.lang.reflect.Method r12 = r12.f3342
            if (r12 != 0) goto L433
            if (r14 != 0) goto L433
            goto L435
        L433:
            if (r14 != 0) goto L43f
        L435:
            java.lang.String r12 = r13.m3546()
            r14 = 180(0xb4, float:2.52E-43)
            r6.m2917(r14, r7, r15, r12)
            goto L454
        L43f:
            java.lang.String r24 = defpackage.C2118.m3544(r14)
            java.lang.String r23 = r14.getName()
            r25 = 0
            r21 = 182(0xb6, float:2.55E-43)
            java.lang.String r12 = r5.f5837
            r20 = r6
            r22 = r12
            r20.m2916(r21, r22, r23, r24, r25)
        L454:
            defpackage.AbstractC1849.m3249(r6, r13)
            r12 = 176(0xb0, float:2.47E-43)
            r6.m2923(r12)
            r13 = r3[r11]
            r6.m2924(r13)
            r23 = 0
            r25 = 0
            r21 = 3
            r22 = 0
            r24 = 0
            r20 = r6
            r20.m2929(r21, r22, r23, r24, r25)
            int r11 = r11 + 1
            int r8 = r8 + 1
            goto L410
        L475:
            r5.m2448(r6)
            r3 = 0
            r6.m2927(r3, r3)
            r3 = 153(0x99, float:2.14E-43)
            if (r1 != 0) goto L4e5
            r13 = 0
            r14 = 0
            r4 = r10
            r10 = 1
            java.lang.String r11 = "set"
            r27 = r12
            java.lang.String r12 = "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V"
            r6 = r27
            ᲀᛱᲁᛶ r8 = r9.m1375(r10, r11, r12, r13, r14)
            int r10 = r0.length
            ᛶᛴᲀᲇ[] r10 = defpackage.AbstractC1849.m3243(r10)
            int r11 = r0.length
            r12 = 0
            r13 = 0
        L498:
            if (r12 >= r11) goto L4dc
            r14 = r0[r12]
            r6 = 25
            r15 = 2
            r8.m2925(r6, r15)
            java.lang.String r6 = r14.f3338
            r8.m2915(r6)
            java.lang.String r24 = "(Ljava/lang/Object;)Z"
            r25 = 0
            r21 = 182(0xb6, float:2.55E-43)
            java.lang.String r22 = "java/lang/String"
            java.lang.String r23 = "equals"
            r20 = r8
            r20.m2916(r21, r22, r23, r24, r25)
            r6 = r20
            r8 = r10[r13]
            r6.m2918(r3, r8)
            r5.m2449(r6, r14)
            r8 = r10[r13]
            r6.m2924(r8)
            r23 = 0
            r25 = 0
            r21 = 3
            r22 = 0
            r24 = 0
            r20.m2929(r21, r22, r23, r24, r25)
            r18 = 1
            int r13 = r13 + 1
            int r12 = r12 + 1
            r8 = r6
            r6 = 176(0xb0, float:2.47E-43)
            goto L498
        L4dc:
            r6 = r8
            r5.m2447(r6)
            r8 = 0
            r6.m2927(r8, r8)
            goto L4e6
        L4e5:
            r4 = r10
        L4e6:
            if (r1 != 0) goto L587
            r13 = 0
            r14 = 0
            r10 = 1
            java.lang.String r11 = "get"
            java.lang.String r12 = "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;"
            ᲀᛱᲁᛶ r1 = r9.m1375(r10, r11, r12, r13, r14)
            int r6 = r0.length
            ᛶᛴᲀᲇ[] r6 = defpackage.AbstractC1849.m3243(r6)
            int r8 = r0.length
            r10 = 0
            r11 = 0
        L4fb:
            if (r10 >= r8) goto L580
            r12 = r0[r10]
            r13 = 25
            r15 = 2
            r1.m2925(r13, r15)
            java.lang.String r13 = r12.f3338
            java.lang.reflect.Method r14 = r12.f3340
            r1.m2915(r13)
            java.lang.String r24 = "(Ljava/lang/Object;)Z"
            r25 = 0
            r21 = 182(0xb6, float:2.55E-43)
            java.lang.String r22 = "java/lang/String"
            java.lang.String r23 = "equals"
            r20 = r1
            r20.m2916(r21, r22, r23, r24, r25)
            r13 = r6[r11]
            r1.m2918(r3, r13)
            r13 = 25
            r15 = 1
            r1.m2925(r13, r15)
            r1.m2920(r4, r7)
            java.lang.Class r15 = r12.f3339
            ᲇᲀᛴᲁ r15 = defpackage.C2118.m3545(r15)
            java.lang.reflect.Method r3 = r12.f3342
            if (r3 != 0) goto L536
            if (r14 != 0) goto L536
            goto L538
        L536:
            if (r14 != 0) goto L545
        L538:
            java.lang.String r3 = r12.f3338
            java.lang.String r12 = r15.m3546()
            r14 = 180(0xb4, float:2.52E-43)
            r1.m2917(r14, r7, r3, r12)
            r3 = r14
            goto L55c
        L545:
            r3 = 180(0xb4, float:2.52E-43)
            java.lang.String r24 = defpackage.C2118.m3544(r14)
            java.lang.String r23 = r14.getName()
            r25 = 0
            r21 = 182(0xb6, float:2.55E-43)
            java.lang.String r12 = r5.f5837
            r20 = r1
            r22 = r12
            r20.m2916(r21, r22, r23, r24, r25)
        L55c:
            defpackage.AbstractC1849.m3249(r1, r15)
            r12 = 176(0xb0, float:2.47E-43)
            r1.m2923(r12)
            r12 = r6[r11]
            r1.m2924(r12)
            r23 = 0
            r25 = 0
            r21 = 3
            r22 = 0
            r24 = 0
            r20 = r1
            r20.m2929(r21, r22, r23, r24, r25)
            int r11 = r11 + 1
            int r10 = r10 + 1
            r3 = 153(0x99, float:2.14E-43)
            goto L4fb
        L580:
            r5.m2447(r1)
            r3 = 0
            r1.m2927(r3, r3)
        L587:
            r13 = 0
            r14 = 0
            r10 = 1
            java.lang.String r11 = "newInstance"
            java.lang.String r12 = "()Ljava/lang/Object;"
            ᲀᛱᲁᛶ r0 = r9.m1375(r10, r11, r12, r13, r14)
            r1 = 187(0xbb, float:2.62E-43)
            r0.m2920(r1, r7)
            r1 = 89
            r0.m2923(r1)
            java.lang.String r24 = "()V"
            r25 = 0
            r21 = 183(0xb7, float:2.56E-43)
            java.lang.String r1 = r5.f5837
            java.lang.String r23 = "<init>"
            r20 = r0
            r22 = r1
            r20.m2916(r21, r22, r23, r24, r25)
            r12 = 176(0xb0, float:2.47E-43)
            r0.m2923(r12)
            r4 = 2
            r15 = 1
            r0.m2927(r4, r15)
            byte[] r0 = r9.m1378()
            ᲇᛶᛷ r1 = r5.f5836
            java.lang.String r3 = r5.f5833
            java.lang.Class r5 = r1.m3474(r3, r0)
        L5c3:
            java.lang.Object r0 = r5.newInstance()     // Catch: java.lang.Exception -> L5cc
            if (r0 != 0) goto L5ce
            r19 = 0
            throw r19     // Catch: java.lang.Exception -> L5cc
        L5cc:
            r0 = move-exception
            goto L5d4
        L5ce:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.Exception -> L5cc
            r0.<init>()     // Catch: java.lang.Exception -> L5cc
            throw r0     // Catch: java.lang.Exception -> L5cc
        L5d4:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r3 = "Error constructing accessor class: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2, r0)
            throw r1
        L5e0:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }
}
