package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛲᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0634 implements xhss.InterfaceC0341 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0230 f2183;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f2184;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0105 f2185;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0067 f2186;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.util.List f2187;

    public C0634(xhss.C0230 r1, int r2, xhss.C0067 r3, xhss.C0105 r4, java.util.List r5) {
            r0 = this;
            r0.<init>()
            r0.f2183 = r1
            r0.f2184 = r2
            r0.f2186 = r3
            r0.f2185 = r4
            r0.f2187 = r5
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static void m1104(java.lang.Class r3, java.lang.String r4, java.lang.reflect.Field r5, java.lang.reflect.Field r6) {
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
            java.lang.String r3 = xhss.AbstractC1031.m1677(r5)
            r1.append(r3)
            java.lang.String r3 = " and "
            r1.append(r3)
            java.lang.String r3 = xhss.AbstractC1031.m1677(r6)
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

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0199 m1105(xhss.C1125 r30, xhss.C0032 r31, java.lang.Class r32, boolean r33) {
            r29 = this;
            r0 = r29
            r7 = r32
            boolean r1 = r7.isInterface()
            if (r1 == 0) goto Ld
            xhss.ᛲᛸᲈᲇ r0 = xhss.C0199.f758
            return r0
        Ld:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r1 = r31
            r10 = r7
        L1a:
            java.lang.reflect.Type r11 = r1.f209
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r10 == r1) goto L217
            java.lang.reflect.Field[] r12 = r10.getDeclaredFields()
            if (r10 == r7) goto L2e
            int r1 = r12.length
            if (r1 <= 0) goto L2e
            java.util.List r1 = r0.f2187
            xhss.AbstractC0775.m1314(r1)
        L2e:
            int r13 = r12.length
            r14 = 0
            r15 = r14
        L31:
            if (r15 >= r13) goto L1fe
            r1 = r12[r15]
            r2 = 1
            boolean r24 = r0.m1106(r1, r2)
            boolean r3 = r0.m1106(r1, r14)
            if (r24 != 0) goto L46
            if (r3 != 0) goto L46
            r3 = r30
            goto L1f9
        L46:
            java.lang.Class<xhss.ᛶᲁᲈᛲ> r4 = xhss.InterfaceC0596.class
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
            xhss.ᲈᲀᲀᛱ r5 = xhss.AbstractC1031.f3335
            java.lang.reflect.Method r5 = r5.mo799(r10, r1)
            xhss.AbstractC1031.m1681(r5)
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r4)
            if (r6 == 0) goto L83
            java.lang.annotation.Annotation r6 = r1.getAnnotation(r4)
            if (r6 == 0) goto L71
            goto L83
        L71:
            java.lang.String r0 = xhss.AbstractC1031.m1680(r5, r14)
            xhss.ᛱᲈᛲᛷ r1 = new xhss.ᛱᲈᛲᛷ
            java.lang.String r2 = "@SerializedName on "
            java.lang.String r3 = " is not supported"
            java.lang.String r0 = xhss.AbstractC0390.m781(r2, r0, r3)
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
            xhss.AbstractC1031.m1681(r1)
        L90:
            java.lang.reflect.Type r3 = r1.getGenericType()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.reflect.Type r3 = xhss.C0915.m1488(r11, r10, r3, r5)
            java.lang.annotation.Annotation r4 = r1.getAnnotation(r4)
            xhss.ᛶᲁᲈᛲ r4 = (xhss.InterfaceC0596) r4
            if (r4 != 0) goto L10b
            r4 = 95
            int r5 = r0.f2184
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
            java.lang.String r4 = xhss.AbstractC0390.m788(r4, r5)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r5)
            goto L108
        Lbd:
            java.lang.String r4 = r1.getName()
            r5 = 45
            java.lang.String r4 = xhss.AbstractC0390.m788(r4, r5)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r5)
            goto L108
        Lce:
            java.lang.String r5 = r1.getName()
            java.lang.String r4 = xhss.AbstractC0390.m788(r5, r4)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r5)
            goto L108
        Ldd:
            java.lang.String r5 = r1.getName()
            java.lang.String r4 = xhss.AbstractC0390.m788(r5, r4)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toUpperCase(r5)
            goto L108
        Lec:
            java.lang.String r4 = r1.getName()
            r5 = 32
            java.lang.String r4 = xhss.AbstractC0390.m788(r4, r5)
            java.lang.String r4 = xhss.AbstractC0390.m775(r4)
            goto L108
        Lfb:
            java.lang.String r4 = r1.getName()
            java.lang.String r4 = xhss.AbstractC0390.m775(r4)
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
            xhss.ᛱᛳᲈᛷ r4 = new xhss.ᛱᛳᲈᛷ
            r4.<init>(r3)
            java.lang.Class r3 = r4.f211
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
            java.lang.Class<xhss.ᛸᛱᲀᛷ> r3 = xhss.InterfaceC0726.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            r5 = r3
            xhss.ᛸᛱᲀᛷ r5 = (xhss.InterfaceC0726) r5
            if (r5 == 0) goto L18e
            r6 = r2
            xhss.ᛳᛱᛲᲀ r2 = r0.f2183
            r3 = r6
            r6 = 0
            r18 = r1
            xhss.ᛱᲁᲈᛷ r1 = r0.f2185
            r16 = r31
            r27 = r3
            r3 = r30
            xhss.ᛲᛱᛶᛴ r1 = r1.m291(r2, r3, r4, r5, r6)
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
            xhss.ᛲᛱᛶᛴ r1 = r3.m1815(r4)
        L1a4:
            if (r24 == 0) goto L1b5
            if (r2 == 0) goto L1aa
            r2 = r1
            goto L1b2
        L1aa:
            xhss.ᲈᛱᛲᛴ r2 = new xhss.ᲈᛱᛲᛴ
            java.lang.reflect.Type r4 = r4.f209
            r5 = 2
            r2.<init>(r3, r1, r4, r5)
        L1b2:
            r20 = r2
            goto L1b7
        L1b5:
            r20 = r1
        L1b7:
            xhss.ᲁᲀᛸᛲ r16 = new xhss.ᲁᲀᛸᛲ
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
            xhss.ᲁᲀᛸᛲ r14 = (xhss.C0981) r14
            if (r14 != 0) goto L1e2
            r14 = 0
            goto L1ca
        L1e2:
            java.lang.reflect.Field r0 = r14.f3184
            m1104(r7, r6, r0, r1)
            throw r25
        L1e8:
            if (r24 == 0) goto L1f9
            java.lang.Object r2 = r9.put(r4, r2)
            xhss.ᲁᲀᛸᛲ r2 = (xhss.C0981) r2
            if (r2 != 0) goto L1f3
            goto L1f9
        L1f3:
            java.lang.reflect.Field r0 = r2.f3184
            m1104(r7, r4, r0, r1)
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
            java.lang.reflect.Type r1 = xhss.C0915.m1488(r11, r10, r1, r2)
            xhss.ᛱᛳᲈᛷ r2 = new xhss.ᛱᛳᲈᛷ
            r2.<init>(r1)
            java.lang.Class r10 = r2.f211
            r1 = r2
            goto L1a
        L217:
            xhss.ᛲᛸᲈᲇ r0 = new xhss.ᛲᛸᲈᲇ
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r2 = r9.values()
            r1.<init>(r2)
            r0.<init>(r8, r1)
            return r0
    }

    @Override // xhss.InterfaceC0341
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.AbstractC0121 mo160(xhss.C1125 r5, xhss.C0032 r6) {
            r4 = this;
            java.lang.Class r0 = r6.f211
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto Lc
            r4 = 0
            return r4
        Lc:
            xhss.ᲈᲀᲀᛱ r1 = xhss.AbstractC1031.f3335
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L2a
            boolean r1 = r0.isAnonymousClass()
            if (r1 != 0) goto L24
            boolean r1 = r0.isLocalClass()
            if (r1 == 0) goto L2a
        L24:
            xhss.ᛴᛳᛲ r4 = new xhss.ᛴᛳᛲ
            r4.<init>()
            return r4
        L2a:
            java.util.List r1 = r4.f2187
            xhss.AbstractC0775.m1314(r1)
            xhss.ᲈᲀᲀᛱ r1 = xhss.AbstractC1031.f3335
            boolean r1 = r1.mo796(r0)
            r2 = 1
            if (r1 == 0) goto L42
            xhss.ᛴᛶᲇᛸ r1 = new xhss.ᛴᛶᲇᛸ
            xhss.ᛲᛸᲈᲇ r4 = r4.m1105(r5, r6, r0, r2)
            r1.<init>(r0, r4)
            return r1
        L42:
            xhss.ᛳᛱᛲᲀ r1 = r4.f2183
            xhss.ᲁᲀᛶᛲ r1 = r1.m532(r6, r2)
            xhss.ᛱᲁᲈᛲ r2 = new xhss.ᛱᲁᲈᛲ
            r3 = 0
            xhss.ᛲᛸᲈᲇ r4 = r4.m1105(r5, r6, r0, r3)
            r2.<init>(r1, r4)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final boolean m1106(java.lang.reflect.Field r3, boolean r4) {
            r2 = this;
            xhss.ᛱᛷᲈᛱ r2 = r2.f2186
            r2.getClass()
            r0 = 136(0x88, float:1.9E-43)
            int r1 = r3.getModifiers()
            r0 = r0 & r1
            r1 = 1
            if (r0 == 0) goto L11
        Lf:
            r2 = r1
            goto L49
        L11:
            boolean r0 = r3.isSynthetic()
            if (r0 == 0) goto L18
            goto Lf
        L18:
            java.lang.Class r3 = r3.getType()
            boolean r3 = r2.m215(r3, r4)
            if (r3 == 0) goto L23
            goto Lf
        L23:
            if (r4 == 0) goto L28
            java.util.List r2 = r2.f363
            goto L2a
        L28:
            java.util.List r2 = r2.f364
        L2a:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L48
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L3b
            goto L48
        L3b:
            java.lang.Object r2 = r2.next()
            r2.getClass()
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>()
            throw r2
        L48:
            r2 = 0
        L49:
            r2 = r2 ^ r1
            return r2
    }
}
