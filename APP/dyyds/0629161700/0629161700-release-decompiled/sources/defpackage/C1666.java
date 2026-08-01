package defpackage;

/* JADX INFO: renamed from: ᲀᛴᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1666 implements defpackage.InterfaceC0598 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC0992 f7445;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1380 f7446;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7447;

    public /* synthetic */ C1666(defpackage.AbstractC0992 r1, defpackage.C1380 r2, int r3) {
            r0 = this;
            r0.f7447 = r3
            r0.f7445 = r1
            r0.f7446 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0598
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.Object mo617(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.f7447
            java.lang.String r2 = "Unsupported member type: "
            java.lang.Class<java.lang.reflect.Constructor> r5 = java.lang.reflect.Constructor.class
            java.lang.Class<java.lang.reflect.Method> r7 = java.lang.reflect.Method.class
            java.lang.Class<java.lang.reflect.Field> r8 = java.lang.reflect.Field.class
            r11 = 6
            r12 = 0
            ᲀᛶᲇ r13 = defpackage.C1698.f7558
            java.lang.String r14 = " because got an exception."
            ᲁᲁᛷᲈ r15 = defpackage.AbstractC0849.f3872
            ᛷᲇᛱᲈ r3 = r0.f7446
            ᛵᲈᛳᛸ r0 = r0.f7445
            r4 = 0
            switch(r1) {
                case 0: goto L105;
                default: goto L1c;
            }
        L1c:
            r1 = r18
            java.lang.Class r1 = (java.lang.Class) r1
            r6 = r0
            ᛵᛷᛶᲇ r6 = (defpackage.C0930) r6
            r3.getClass()
            java.lang.reflect.Field[] r0 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L2f
            java.util.List r0 = defpackage.AbstractC2315.m3771(r0)     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r0 = move-exception
            ᛴᛸᛲᲀ r1 = new ᛴᛸᛲᲀ
            r1.<init>(r0)
            r0 = r1
        L36:
            java.lang.Throwable r1 = defpackage.C2165.m3569(r0)
            if (r1 == 0) goto L52
            ᛲᲈᛶᲈ r16 = defpackage.AbstractC2298.f9721
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to get declared fields in "
            r9.<init>(r10)
            r9.append(r15)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            defpackage.AbstractC2298.m3729(r9, r1)
        L52:
            boolean r1 = r0 instanceof defpackage.C0723
            if (r1 == 0) goto L57
            r0 = r4
        L57:
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L5c
            goto L5d
        L5c:
            r13 = r0
        L5d:
            ᛵᲀᛱᲈ r0 = new ᛵᲀᛱᲈ
            r0.<init>(r12, r13)
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1789(r0, r6, r3)
            ᛷᛸᲁᛱ r1 = new ᛷᛸᲁᛱ
            r1.<init>(r11)
            java.lang.String r9 = "isEnumConstant"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r9, r4, r1)
            ᛷᛸᲁᛱ r1 = new ᛷᛸᲁᛱ
            r9 = 7
            r1.<init>(r9)
            java.lang.String r9 = "isEnumConstantNot"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r9, r4, r1)
            java.lang.Object r1 = r6.f4197
            ᛵᲀᲀᲇ r9 = new ᛵᲀᲀᲇ
            r10 = 17
            r9.<init>(r3, r10)
            java.lang.String r10 = "type"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r10, r1, r9)
            ᛳᲈᲇᛳ r1 = r6.f4198
            ᲇᲈᛱᛸ r6 = new ᲇᲈᛱᛸ
            r9 = 9
            r6.<init>(r9)
            java.lang.String r9 = "typeCondition"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r9, r1, r6)
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r6 = 10
            r1.<init>(r6)
            java.lang.String r6 = "genericType"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r6, r4, r1)
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r6 = 11
            r1.<init>(r6)
            java.lang.String r6 = "genericTypeCondition"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r6, r4, r1)
            ᛲᲀᲈᛳ r1 = defpackage.AbstractC1168.m2249(r8)
            ᛲᲀᲈᛳ r6 = defpackage.AbstractC1168.m2249(r7)
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto Ld0
            ᛱᲈᛳᲁ r1 = new ᛱᲈᛳᲁ
            r2 = 3
            r1.<init>(r3, r2)
            ᛱᛷᛷᛲ r2 = new ᛱᛷᛷᛲ
            r6 = 2
            r2.<init>(r0, r1, r6)
            goto Lfc
        Ld0:
            r6 = 2
            ᛲᲀᲈᛳ r5 = defpackage.AbstractC1168.m2249(r5)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto Le7
            ᛱᲈᛳᲁ r1 = new ᛱᲈᛳᲁ
            r2 = 4
            r1.<init>(r3, r2)
            ᛱᛷᛷᛲ r2 = new ᛱᛷᛷᛲ
            r2.<init>(r0, r1, r6)
            goto Lfc
        Le7:
            ᛲᲀᲈᛳ r5 = defpackage.AbstractC1168.m2249(r8)
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L101
            ᛱᲈᛳᲁ r1 = new ᛱᲈᛳᲁ
            r2 = 5
            r1.<init>(r3, r2)
            ᛱᛷᛷᛲ r2 = new ᛱᛷᛷᛲ
            r2.<init>(r0, r1, r6)
        Lfc:
            java.util.List r4 = defpackage.AbstractC0591.m1392(r2)
            goto L104
        L101:
            defpackage.C2264.m3681(r0, r2)
        L104:
            return r4
        L105:
            r1 = r18
            java.lang.Class r1 = (java.lang.Class) r1
            r6 = r0
            ᛶᛶᛲᛱ r6 = (defpackage.C1085) r6
            r3.getClass()
            java.lang.reflect.Method[] r0 = r1.getDeclaredMethods()     // Catch: java.lang.Throwable -> L118
            java.util.List r0 = defpackage.AbstractC2315.m3771(r0)     // Catch: java.lang.Throwable -> L118
            goto L11f
        L118:
            r0 = move-exception
            ᛴᛸᛲᲀ r1 = new ᛴᛸᛲᲀ
            r1.<init>(r0)
            r0 = r1
        L11f:
            java.lang.Throwable r1 = defpackage.C2165.m3569(r0)
            if (r1 == 0) goto L13b
            ᛲᲈᛶᲈ r9 = defpackage.AbstractC2298.f9721
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to get declared methods in "
            r9.<init>(r10)
            r9.append(r15)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            defpackage.AbstractC2298.m3729(r9, r1)
        L13b:
            boolean r1 = r0 instanceof defpackage.C0723
            if (r1 == 0) goto L140
            r0 = r4
        L140:
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L145
            goto L146
        L145:
            r13 = r0
        L146:
            ᛵᲀᛱᲈ r0 = new ᛵᲀᛱᲈ
            r0.<init>(r12, r13)
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1789(r0, r6, r3)
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1797(r0, r6, r3)
            java.lang.Object r1 = r6.f4872
            ᛵᲀᲀᲇ r9 = new ᛵᲀᲀᲇ
            r10 = 2
            r9.<init>(r3, r10)
            java.lang.String r10 = "returnType"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r10, r1, r9)
            ᛴᛳᛷᛸ r1 = r6.f4873
            ᲇᲈᛱᛸ r6 = new ᲇᲈᛱᛸ
            r10 = 17
            r6.<init>(r10)
            java.lang.String r9 = "returnTypeCondition"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r9, r1, r6)
            ᲇᲈᛱᛸ r1 = new ᲇᲈᛱᛸ
            r6 = 24
            r1.<init>(r6)
            java.lang.String r6 = "isBridge"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r6, r4, r1)
            ᛷᛸᲁᛱ r1 = new ᛷᛸᲁᛱ
            r6 = 3
            r1.<init>(r6)
            java.lang.String r6 = "isBridgeNot"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r6, r4, r1)
            ᛷᛸᲁᛱ r1 = new ᛷᛸᲁᛱ
            r6 = 4
            r1.<init>(r6)
            java.lang.String r6 = "isDefault"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r6, r4, r1)
            ᛷᛸᲁᛱ r1 = new ᛷᛸᲁᛱ
            r6 = 5
            r1.<init>(r6)
            java.lang.String r6 = "isDefaultNot"
            ᛷᛵᛵᛶ r0 = defpackage.AbstractC0849.m1796(r0, r3, r6, r4, r1)
            ᛲᲀᲈᛳ r1 = defpackage.AbstractC1168.m2249(r7)
            ᛲᲀᲈᛳ r6 = defpackage.AbstractC1168.m2249(r7)
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L1bb
            ᛱᲈᛳᲁ r1 = new ᛱᲈᛳᲁ
            r1.<init>(r3, r11)
            ᛱᛷᛷᛲ r2 = new ᛱᛷᛷᛲ
            r6 = 2
            r2.<init>(r0, r1, r6)
            goto L1e8
        L1bb:
            r6 = 2
            ᛲᲀᲈᛳ r5 = defpackage.AbstractC1168.m2249(r5)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L1d2
            ᛱᲈᛳᲁ r1 = new ᛱᲈᛳᲁ
            r9 = 7
            r1.<init>(r3, r9)
            ᛱᛷᛷᛲ r2 = new ᛱᛷᛷᛲ
            r2.<init>(r0, r1, r6)
            goto L1e8
        L1d2:
            ᛲᲀᲈᛳ r5 = defpackage.AbstractC1168.m2249(r8)
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L1ed
            ᛱᲈᛳᲁ r1 = new ᛱᲈᛳᲁ
            r2 = 8
            r1.<init>(r3, r2)
            ᛱᛷᛷᛲ r2 = new ᛱᛷᛷᛲ
            r2.<init>(r0, r1, r6)
        L1e8:
            java.util.List r4 = defpackage.AbstractC0591.m1392(r2)
            goto L1f0
        L1ed:
            defpackage.C2264.m3681(r0, r2)
        L1f0:
            return r4
    }
}
