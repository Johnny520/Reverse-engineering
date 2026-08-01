package defpackage;

/* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2065 implements defpackage.InterfaceC1405 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1814 f8874;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f8875;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0682 f8876;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0245 f8877;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.util.List f8878;

    public C2065(defpackage.C0682 r1, int r2, defpackage.C1814 r3, defpackage.C0245 r4, java.util.List r5) {
            r0 = this;
            r0.<init>()
            r0.f8876 = r1
            r0.f8875 = r2
            r0.f8874 = r3
            r0.f8877 = r4
            r0.f8878 = r5
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m3469(java.lang.Class r3, java.lang.String r4, java.lang.reflect.Field r5, java.lang.reflect.Field r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Class "
            r1.<init>(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " declares multiple JSON fields named '"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "'; conflict is caused by fields "
            r1.append(r3)
            java.lang.String r3 = defpackage.AbstractC2026.m3414(r5)
            r1.append(r3)
            java.lang.String r3 = " and "
            r1.append(r3)
            java.lang.String r3 = defpackage.AbstractC2026.m3414(r6)
            r1.append(r3)
            java.lang.String r3 = "\nSee "
            r1.append(r3)
            java.lang.String r3 = "duplicate-fields"
            java.lang.String r4 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r3 = r4.concat(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean m3470(java.lang.reflect.Field r3, boolean r4) {
            r2 = this;
            ᲁᛲᛷᛲ r2 = r2.f8874
            r2.getClass()
            r0 = 136(0x88, float:1.9E-43)
            int r1 = r3.getModifiers()
            r0 = r0 & r1
            r1 = 1
            if (r0 == 0) goto L11
        Lf:
            r4 = r1
            goto L47
        L11:
            boolean r0 = r3.isSynthetic()
            if (r0 == 0) goto L18
            goto Lf
        L18:
            java.lang.Class r3 = r3.getType()
            boolean r3 = r2.m3209(r3, r4)
            if (r3 == 0) goto L23
            goto Lf
        L23:
            if (r4 == 0) goto L28
            java.util.List r2 = r2.f7942
            goto L2a
        L28:
            java.util.List r2 = r2.f7941
        L2a:
            boolean r3 = r2.isEmpty()
            r4 = 0
            if (r3 != 0) goto L47
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L3c
            goto L47
        L3c:
            java.lang.Object r2 = r2.next()
            r2.getClass()
            defpackage.C2264.m3679()
            return r4
        L47:
            r2 = r4 ^ 1
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2191 m3471(defpackage.C1950 r30, defpackage.C1949 r31, java.lang.Class r32, boolean r33) {
            r29 = this;
            r0 = r29
            r7 = r32
            boolean r1 = r7.isInterface()
            if (r1 == 0) goto Ld
            ᲈᛲᛶ r0 = defpackage.C2191.f9295
            return r0
        Ld:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r1 = r31
            r10 = r7
        L1a:
            java.lang.reflect.Type r11 = r1.f8477
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r10 == r1) goto L217
            java.lang.reflect.Field[] r12 = r10.getDeclaredFields()
            if (r10 == r7) goto L2e
            int r1 = r12.length
            if (r1 <= 0) goto L2e
            java.util.List r1 = r0.f8878
            defpackage.AbstractC0498.m1282(r1)
        L2e:
            int r13 = r12.length
            r14 = 0
            r15 = r14
        L31:
            if (r15 >= r13) goto L1fe
            r1 = r12[r15]
            r2 = 1
            boolean r24 = r0.m3470(r1, r2)
            boolean r3 = r0.m3470(r1, r14)
            if (r24 != 0) goto L46
            if (r3 != 0) goto L46
            r3 = r30
            goto L1f9
        L46:
            java.lang.Class<ᛷᛳᲇᲀ> r4 = defpackage.InterfaceC1248.class
            r25 = 0
            if (r33 == 0) goto L88
            int r5 = r1.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto L5b
            r26 = r14
        L58:
            r19 = r25
            goto L8b
        L5b:
            ᛲᲈᲀᲈ r5 = defpackage.AbstractC2026.f8732
            java.lang.reflect.Method r5 = r5.mo1138(r10, r1)
            defpackage.AbstractC2026.m3417(r5)
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r4)
            if (r6 == 0) goto L83
            java.lang.annotation.Annotation r6 = r1.getAnnotation(r4)
            if (r6 == 0) goto L71
            goto L83
        L71:
            java.lang.String r0 = defpackage.AbstractC2026.m3413(r5, r14)
            ᛲᛱᛶᲀ r1 = new ᛲᛱᛶᲀ
            java.lang.String r2 = "@SerializedName on "
            java.lang.String r3 = " is not supported"
            java.lang.String r0 = defpackage.AbstractC0225.m817(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L83:
            r26 = r3
            r19 = r5
            goto L8b
        L88:
            r26 = r3
            goto L58
        L8b:
            if (r19 != 0) goto L90
            defpackage.AbstractC2026.m3417(r1)
        L90:
            java.lang.reflect.Type r3 = r1.getGenericType()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.reflect.Type r3 = defpackage.AbstractC0209.m766(r11, r10, r3, r5)
            java.lang.annotation.Annotation r4 = r1.getAnnotation(r4)
            ᛷᛳᲇᲀ r4 = (defpackage.InterfaceC1248) r4
            if (r4 != 0) goto L10b
            r4 = 95
            int r5 = r0.f8875
            switch(r5) {
                case 1: goto L104;
                case 2: goto Lfb;
                case 3: goto Lec;
                case 4: goto Ldd;
                case 5: goto Lce;
                case 6: goto Lbd;
                default: goto Lac;
            }
        Lac:
            java.lang.String r4 = r1.getName()
            r5 = 46
            java.lang.String r4 = defpackage.AbstractC0225.m821(r4, r5)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r5)
            goto L108
        Lbd:
            java.lang.String r4 = r1.getName()
            r5 = 45
            java.lang.String r4 = defpackage.AbstractC0225.m821(r4, r5)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r5)
            goto L108
        Lce:
            java.lang.String r5 = r1.getName()
            java.lang.String r4 = defpackage.AbstractC0225.m821(r5, r4)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r5)
            goto L108
        Ldd:
            java.lang.String r5 = r1.getName()
            java.lang.String r4 = defpackage.AbstractC0225.m821(r5, r4)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toUpperCase(r5)
            goto L108
        Lec:
            java.lang.String r4 = r1.getName()
            r5 = 32
            java.lang.String r4 = defpackage.AbstractC0225.m821(r4, r5)
            java.lang.String r4 = defpackage.AbstractC0225.m828(r4)
            goto L108
        Lfb:
            java.lang.String r4 = r1.getName()
            java.lang.String r4 = defpackage.AbstractC0225.m828(r4)
            goto L108
        L104:
            java.lang.String r4 = r1.getName()
        L108:
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            goto L11c
        L10b:
            java.lang.String r5 = r4.value()
            java.lang.String[] r4 = r4.alternate()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r28 = r5
            r5 = r4
            r4 = r28
        L11c:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L12a
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r31 = r2
            r2 = r4
            goto L13e
        L12a:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r16 = r5.size()
            r31 = r2
            int r2 = r16 + 1
            r6.<init>(r2)
            r6.add(r4)
            r6.addAll(r5)
            r2 = r6
        L13e:
            java.lang.Object r4 = r2.get(r14)
            r17 = r4
            java.lang.String r17 = (java.lang.String) r17
            ᲁᲇᛸᲈ r4 = new ᲁᲇᛸᲈ
            r4.<init>(r3)
            java.lang.Class r3 = r4.f8476
            if (r3 == 0) goto L158
            boolean r3 = r3.isPrimitive()
            if (r3 == 0) goto L158
            r22 = r31
            goto L15a
        L158:
            r22 = r14
        L15a:
            int r3 = r1.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r3)
            if (r5 == 0) goto L16d
            boolean r3 = java.lang.reflect.Modifier.isFinal(r3)
            if (r3 == 0) goto L16d
            r23 = r31
            goto L16f
        L16d:
            r23 = r14
        L16f:
            java.lang.Class<ᛳᲁᛱᲀ> r3 = defpackage.InterfaceC0553.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            r5 = r3
            ᛳᲁᛱᲀ r5 = (defpackage.InterfaceC0553) r5
            if (r5 == 0) goto L18e
            r6 = r2
            ᛴᛵᲇᲇ r2 = r0.f8876
            r3 = r6
            r6 = 0
            r18 = r1
            ᛲᛲᛲᛵ r1 = r0.f8877
            r16 = r31
            r27 = r3
            r3 = r30
            ᛴᲀᲈᛴ r1 = r1.m857(r2, r3, r4, r5, r6)
            goto L198
        L18e:
            r3 = r30
            r16 = r31
            r18 = r1
            r27 = r2
            r1 = r25
        L198:
            if (r1 == 0) goto L19d
            r2 = r16
            goto L19e
        L19d:
            r2 = r14
        L19e:
            if (r1 != 0) goto L1a4
            ᛴᲀᲈᛴ r1 = r3.m3367(r4)
        L1a4:
            if (r24 == 0) goto L1b5
            if (r2 == 0) goto L1aa
            r2 = r1
            goto L1b2
        L1aa:
            ᲈᛲᲈ r2 = new ᲈᛲᲈ
            java.lang.reflect.Type r4 = r4.f8477
            r5 = 2
            r2.<init>(r3, r1, r4, r5)
        L1b2:
            r20 = r2
            goto L1b7
        L1b5:
            r20 = r1
        L1b7:
            ᲈᛲᛳᛱ r16 = new ᲈᛲᛳᛱ
            r21 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r2 = r16
            r4 = r17
            r1 = r18
            if (r26 == 0) goto L1e8
            java.util.Iterator r5 = r27.iterator()
        L1ca:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1e8
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r16 = r8.put(r6, r2)
            r14 = r16
            ᲈᛲᛳᛱ r14 = (defpackage.C2185) r14
            if (r14 != 0) goto L1e2
            r14 = 0
            goto L1ca
        L1e2:
            java.lang.reflect.Field r0 = r14.f9276
            m3469(r7, r6, r0, r1)
            throw r25
        L1e8:
            if (r24 == 0) goto L1f9
            java.lang.Object r2 = r9.put(r4, r2)
            ᲈᛲᛳᛱ r2 = (defpackage.C2185) r2
            if (r2 != 0) goto L1f3
            goto L1f9
        L1f3:
            java.lang.reflect.Field r0 = r2.f9276
            m3469(r7, r4, r0, r1)
            throw r25
        L1f9:
            int r15 = r15 + 1
            r14 = 0
            goto L31
        L1fe:
            r3 = r30
            java.lang.reflect.Type r1 = r10.getGenericSuperclass()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.reflect.Type r1 = defpackage.AbstractC0209.m766(r11, r10, r1, r2)
            ᲁᲇᛸᲈ r2 = new ᲁᲇᛸᲈ
            r2.<init>(r1)
            java.lang.Class r10 = r2.f8476
            r1 = r2
            goto L1a
        L217:
            ᲈᛲᛶ r0 = new ᲈᛲᛶ
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r2 = r9.values()
            r1.<init>(r2)
            r0.<init>(r8, r1)
            return r0
    }

    @Override // defpackage.InterfaceC1405
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.AbstractC0758 mo690(defpackage.C1950 r5, defpackage.C1949 r6) {
            r4 = this;
            java.lang.Class r0 = r6.f8476
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto Lc
            r4 = 0
            return r4
        Lc:
            ᛲᲈᲀᲈ r1 = defpackage.AbstractC2026.f8732
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L2a
            boolean r1 = r0.isAnonymousClass()
            if (r1 != 0) goto L24
            boolean r1 = r0.isLocalClass()
            if (r1 == 0) goto L2a
        L24:
            ᲇᛶᲀᛷ r4 = new ᲇᛶᲀᛷ
            r4.<init>()
            return r4
        L2a:
            java.util.List r1 = r4.f8878
            defpackage.AbstractC0498.m1282(r1)
            ᛲᲈᲀᲈ r1 = defpackage.AbstractC2026.f8732
            boolean r1 = r1.mo1140(r0)
            r2 = 1
            if (r1 == 0) goto L42
            ᛷᛶᲈᲀ r1 = new ᛷᛶᲈᲀ
            ᲈᛲᛶ r4 = r4.m3471(r5, r6, r0, r2)
            r1.<init>(r0, r4)
            return r1
        L42:
            ᛴᛵᲇᲇ r1 = r4.f8876
            ᛳᛴᲁᛸ r1 = r1.m1557(r6, r2)
            ᛲᛷᛱᲀ r2 = new ᛲᛷᛱᲀ
            r3 = 0
            ᲈᛲᛶ r4 = r4.m3471(r5, r6, r0, r3)
            r2.<init>(r1, r4)
            return r2
    }
}
