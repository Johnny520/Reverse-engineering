package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛷᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0061 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0564 f348 = null;

    static {
            xhss.ᛶᛵᲇᛸ r0 = new xhss.ᛶᛵᲇᛸ
            r1 = 9
            r0.<init>(r1)
            xhss.AbstractC0061.f348 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final int m195(java.lang.String r7) {
            r0 = 0
            r2 = 0
        L3:
            int r3 = r7.length()
            if (r2 >= r3) goto L1d
            char r3 = r7.charAt(r2)
            long r3 = (long) r3
            r5 = 127(0x7f, double:6.27E-322)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L17
            r3 = 2
            goto L19
        L17:
            r3 = 1
        L19:
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L3
        L1d:
            int r7 = (int) r0
            return r7
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final java.lang.String m196(java.lang.String r1, int r2) {
            int r0 = m195(r1)
            int r2 = r2 - r0
            if (r2 <= 0) goto L19
            java.lang.String r0 = " "
            java.lang.String r2 = xhss.AbstractC0226.m494(r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
        L19:
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static java.lang.annotation.Annotation[] m197(java.lang.reflect.Member r1) {
            boolean r0 = r1 instanceof java.lang.reflect.AnnotatedElement
            if (r0 == 0) goto Lb
            java.lang.reflect.AnnotatedElement r1 = (java.lang.reflect.AnnotatedElement) r1
            java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
            return r1
        Lb:
            java.lang.String r0 = "Unsupported member type: "
            xhss.C0532.m948(r1, r0)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static java.util.List m198(xhss.AbstractC0490 r3, xhss.C0772 r4, java.lang.Class r5, xhss.InterfaceC0645 r6) {
            xhss.ᛵᛷᛶᛱ r0 = xhss.C0492.f1802
            if (r5 == 0) goto L39
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            xhss.ᛱᛸᛷᛸ r2 = xhss.AbstractC0256.m565(r1)
            java.lang.Class r2 = xhss.C0614.m1075(r2)
            if (r2 != 0) goto L11
            goto L12
        L11:
            r1 = r2
        L12:
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L19
            goto L39
        L19:
            java.lang.Object r1 = r6.mo112(r5)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L36
            boolean r1 = r4.f2549
            if (r1 == 0) goto L32
            java.lang.Class r5 = r5.getSuperclass()
            java.util.List r0 = m198(r3, r4, r5, r6)
            goto L35
        L32:
            m205(r3, r4)
        L35:
            r1 = r0
        L36:
            java.util.List r1 = (java.util.List) r1
            return r1
        L39:
            m205(r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static boolean m199(java.util.Collection r6, java.util.List r7, xhss.C0772 r8) {
            int r0 = r6.size()
            int r1 = r7.size()
            r2 = 0
            if (r0 == r1) goto Lc
            goto L42
        Lc:
            java.util.Iterator r6 = r6.iterator()
            r0 = r2
        L11:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r6.next()
            int r3 = r0 + 1
            java.lang.Object r0 = r7.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            r4 = 0
            java.lang.Class r1 = m202(r1, r8, r4)
            java.lang.Class<xhss.ᲇᛱᲁᛸ> r4 = xhss.AbstractC1006.class
            xhss.ᛱᛸᛷᛸ r5 = xhss.AbstractC0256.m565(r4)
            java.lang.Class r5 = xhss.C0614.m1075(r5)
            if (r5 != 0) goto L35
            goto L36
        L35:
            r4 = r5
        L36:
            boolean r4 = xhss.AbstractC0007.m97(r1, r4)
            if (r4 != 0) goto L43
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 != 0) goto L43
        L42:
            return r2
        L43:
            r0 = r3
            goto L11
        L45:
            r6 = 1
            return r6
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0604 m200(xhss.C1111 r4, xhss.AbstractC0490 r5, xhss.C0772 r6) {
            java.lang.String r0 = r5.f1795
            xhss.ᲇᛵᲈᛵ r1 = new xhss.ᲇᛵᲈᛵ
            r2 = 21
            r1.<init>(r2)
            java.lang.String r2 = "name"
            xhss.ᛶᲇᲇᛲ r4 = m211(r4, r6, r2, r0, r1)
            xhss.ᲇᛵᲈᛵ r0 = new xhss.ᲇᛵᲈᛵ
            r1 = 22
            r0.<init>(r1)
            java.lang.String r1 = "nameCondition"
            r2 = 0
            xhss.ᛶᲇᲇᛲ r4 = m211(r4, r6, r1, r2, r0)
            java.util.LinkedHashSet r0 = r5.f1796
            xhss.ᲇᛵᲈᛵ r1 = new xhss.ᲇᛵᲈᛵ
            r3 = 23
            r1.<init>(r3)
            java.lang.String r3 = "modifiers"
            xhss.ᛶᲇᲇᛲ r4 = m211(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r0 = r5.f1799
            xhss.ᲇᛵᲈᛵ r1 = new xhss.ᲇᛵᲈᛵ
            r3 = 24
            r1.<init>(r3)
            java.lang.String r3 = "modifiersNot"
            xhss.ᛶᲇᲇᛲ r4 = m211(r4, r6, r3, r0, r1)
            xhss.ᲇᛵᲈᛵ r0 = new xhss.ᲇᛵᲈᛵ
            r1 = 25
            r0.<init>(r1)
            java.lang.String r1 = "modifiersCondition"
            xhss.ᛶᲇᲇᛲ r4 = m211(r4, r6, r1, r2, r0)
            xhss.ᲇᛵᲈᛵ r0 = new xhss.ᲇᛵᲈᛵ
            r1 = 26
            r0.<init>(r1)
            java.lang.String r1 = "isSynthetic"
            xhss.ᛶᲇᲇᛲ r4 = m211(r4, r6, r1, r2, r0)
            xhss.ᲇᛵᲈᛵ r0 = new xhss.ᲇᛵᲈᛵ
            r1 = 27
            r0.<init>(r1)
            java.lang.String r1 = "isSyntheticNot"
            xhss.ᛶᲇᲇᛲ r4 = m211(r4, r6, r1, r2, r0)
            java.util.LinkedHashSet r0 = r5.f1797
            xhss.ᛱᲀᲇᛵ r1 = new xhss.ᛱᲀᲇᛵ
            r3 = 15
            r1.<init>(r6, r3)
            java.lang.String r3 = "annotations"
            xhss.ᛶᲇᲇᛲ r4 = m211(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r5 = r5.f1800
            xhss.ᛱᲀᲇᛵ r0 = new xhss.ᛱᲀᲇᛵ
            r1 = 16
            r0.<init>(r6, r1)
            java.lang.String r1 = "annotationsNot"
            xhss.ᛶᲇᲇᛲ r4 = m211(r4, r6, r1, r5, r0)
            xhss.ᲇᛵᲈᛵ r5 = new xhss.ᲇᛵᲈᛵ
            r0 = 28
            r5.<init>(r0)
            java.lang.String r0 = "genericString"
            xhss.ᛶᲇᲇᛲ r4 = m211(r4, r6, r0, r2, r5)
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static final boolean m201(xhss.C0772 r0, java.util.Set r1, java.lang.reflect.Executable r2) {
            java.lang.reflect.AnnotatedType[] r2 = r2.getAnnotatedExceptionTypes()
            java.lang.reflect.AnnotatedElement[] r2 = (java.lang.reflect.AnnotatedElement[]) r2
            java.util.List r2 = m209(r2)
            boolean r0 = m199(r1, r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public static java.lang.Class m202(java.lang.Object r3, xhss.C0772 r4, java.lang.String r5) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r3 = (java.lang.Class) r3
            goto L4e
        L7:
            boolean r0 = r3 instanceof xhss.C0078
            if (r0 == 0) goto L14
            xhss.ᛱᛸᛷᛸ r3 = (xhss.C0078) r3
            xhss.ᛲᛵᲀᲈ r3 = (xhss.InterfaceC0162) r3
            java.lang.Class r3 = r3.mo236()
            goto L4e
        L14:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L46
            int r0 = r4.f2551
            java.lang.Class r4 = r4.f2550
            r1 = 2
            r2 = 1
            if (r0 != r2) goto L2b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Class r3 = xhss.AbstractC0025.m127(r3, r4, r1)
            goto L4e
        L2b:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Class r3 = xhss.AbstractC0025.m128(r3, r4, r1)
            if (r3 != 0) goto L4e
            java.lang.Class<xhss.ᛶᲈᛴᛲ> r3 = xhss.C0614.class
            xhss.ᛱᛸᛷᛸ r4 = xhss.AbstractC0256.m565(r3)
            java.lang.Class r4 = xhss.C0614.m1075(r4)
            if (r4 != 0) goto L44
            goto L4e
        L44:
            r3 = r4
            goto L4e
        L46:
            boolean r4 = r3 instanceof xhss.AbstractC1006
            if (r4 == 0) goto L83
            java.lang.Class r3 = r3.getClass()
        L4e:
            java.lang.Class<xhss.ᲇᛱᲁᛸ> r4 = xhss.AbstractC1006.class
            xhss.ᛱᛸᛷᛸ r0 = xhss.AbstractC0256.m565(r4)
            java.lang.Class r0 = xhss.C0614.m1075(r0)
            if (r0 != 0) goto L5b
            goto L5c
        L5b:
            r4 = r0
        L5c:
            boolean r4 = xhss.AbstractC0007.m97(r3, r4)
            if (r4 == 0) goto L82
            if (r5 != 0) goto L65
            goto L82
        L65:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "VagueType is not supported for \""
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r5 = "\"."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L82:
            return r3
        L83:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported type: "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = ", supported types are Class, KClass, String and VagueType."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final boolean m203(xhss.C0772 r4, java.util.Set r5, java.lang.reflect.Executable r6) {
            java.lang.reflect.AnnotatedType r6 = r6.getAnnotatedReceiverType()
            java.lang.annotation.Annotation[] r6 = r6.getAnnotations()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L22
            r3 = r6[r2]
            xhss.ᛱᛸᛷᛸ r3 = xhss.C0614.m1077(r3)
            java.lang.Class r3 = r3.mo236()
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L22:
            boolean r4 = m199(r5, r0, r4)
            r4 = r4 ^ 1
            return r4
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final boolean m204(xhss.C0772 r4, java.util.Set r5, java.lang.reflect.Executable r6) {
            java.lang.reflect.AnnotatedType r6 = r6.getAnnotatedReceiverType()
            java.lang.annotation.Annotation[] r6 = r6.getAnnotations()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L22
            r3 = r6[r2]
            xhss.ᛱᛸᛷᛸ r3 = xhss.C0614.m1077(r3)
            java.lang.Class r3 = r3.mo236()
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L22:
            boolean r4 = m199(r5, r0, r4)
            return r4
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static void m205(xhss.AbstractC0490 r17, xhss.C0772 r18) {
            r1 = r17
            r2 = r18
            java.lang.String r0 = "\n"
            java.lang.String r3 = " (Kotlin reflection is not available)"
            boolean r4 = r2.f2549
            java.lang.Class r5 = r2.f2550
            java.lang.String r6 = ""
            if (r4 == 0) goto L13
            java.lang.String r7 = " (Also tried for superclass)"
            goto L14
        L13:
            r7 = r6
        L14:
            if (r4 != 0) goto L19
            java.lang.String r4 = "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. "
            goto L1b
        L19:
            java.lang.String r4 = "Check if the conditions are correct and valid, and try again. "
        L1b:
            java.lang.String r8 = "-+"
            java.lang.String r9 = "+-"
            java.lang.String r10 = "-"
            java.util.Map r12 = r1.mo899()     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r13.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.Set r12 = r12.entrySet()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L53
        L32:
            boolean r14 = r12.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r14 == 0) goto L8a
            java.lang.Object r14 = r12.next()     // Catch: java.lang.Throwable -> L53
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch: java.lang.Throwable -> L53
            java.lang.Object r15 = r14.getKey()     // Catch: java.lang.Throwable -> L53
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L53
            java.lang.Object r14 = r14.getValue()     // Catch: java.lang.Throwable -> L53
            if (r14 != 0) goto L4c
        L4a:
            r11 = 0
            goto L6f
        L4c:
            boolean r11 = r14 instanceof xhss.InterfaceC0938     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L58
            java.lang.String r11 = "(Runtime Condition)"
            goto L6f
        L53:
            r0 = move-exception
            r16 = r5
            goto L193
        L58:
            boolean r11 = r14 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L6b
            r11 = r14
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.lang.Throwable -> L53
            boolean r11 = r11.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L66
            goto L4a
        L66:
            java.lang.String r11 = xhss.AbstractC1006.m1648(r14)     // Catch: java.lang.Throwable -> L53
            goto L6f
        L6b:
            java.lang.String r11 = xhss.AbstractC1006.m1648(r14)     // Catch: java.lang.Throwable -> L53
        L6f:
            if (r11 == 0) goto L7a
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L53
            java.lang.String r11 = xhss.AbstractC0226.m493(r11, r3, r6)     // Catch: java.lang.Throwable -> L53
            goto L7b
        L7a:
            r11 = 0
        L7b:
            if (r11 == 0) goto L83
            xhss.ᲀᛴᛳᛸ r14 = new xhss.ᲀᛴᛳᛸ     // Catch: java.lang.Throwable -> L53
            r14.<init>(r15, r11)     // Catch: java.lang.Throwable -> L53
            goto L84
        L83:
            r14 = 0
        L84:
            if (r14 == 0) goto L32
            r13.add(r14)     // Catch: java.lang.Throwable -> L53
            goto L32
        L8a:
            boolean r11 = r13.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L98
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L53
            r16 = r5
            goto L199
        L98:
            java.util.Iterator r11 = r13.iterator()     // Catch: java.lang.Throwable -> L53
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r12 == 0) goto L18b
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L53
            xhss.ᲀᛴᛳᛸ r12 = (xhss.C0857) r12     // Catch: java.lang.Throwable -> L53
            java.lang.Object r12 = r12.f2767     // Catch: java.lang.Throwable -> L53
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L53
            int r12 = m195(r12)     // Catch: java.lang.Throwable -> L53
        Lb0:
            boolean r14 = r11.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r14 == 0) goto Lc8
            java.lang.Object r14 = r11.next()     // Catch: java.lang.Throwable -> L53
            xhss.ᲀᛴᛳᛸ r14 = (xhss.C0857) r14     // Catch: java.lang.Throwable -> L53
            java.lang.Object r14 = r14.f2767     // Catch: java.lang.Throwable -> L53
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L53
            int r14 = m195(r14)     // Catch: java.lang.Throwable -> L53
            if (r12 >= r14) goto Lb0
            r12 = r14
            goto Lb0
        Lc8:
            java.util.Iterator r11 = r13.iterator()     // Catch: java.lang.Throwable -> L53
            boolean r14 = r11.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r14 == 0) goto L183
            java.lang.Object r14 = r11.next()     // Catch: java.lang.Throwable -> L53
            xhss.ᲀᛴᛳᛸ r14 = (xhss.C0857) r14     // Catch: java.lang.Throwable -> L53
            java.lang.Object r14 = r14.f2768     // Catch: java.lang.Throwable -> L53
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L53
            int r14 = m195(r14)     // Catch: java.lang.Throwable -> L53
        Le0:
            boolean r15 = r11.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r15 == 0) goto Lf8
            java.lang.Object r15 = r11.next()     // Catch: java.lang.Throwable -> L53
            xhss.ᲀᛴᛳᛸ r15 = (xhss.C0857) r15     // Catch: java.lang.Throwable -> L53
            java.lang.Object r15 = r15.f2768     // Catch: java.lang.Throwable -> L53
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L53
            int r15 = m195(r15)     // Catch: java.lang.Throwable -> L53
            if (r14 >= r15) goto Le0
            r14 = r15
            goto Le0
        Lf8:
            java.lang.String r11 = r5.toString()     // Catch: java.lang.Throwable -> L53
            java.lang.String r11 = xhss.AbstractC0226.m493(r11, r3, r6)     // Catch: java.lang.Throwable -> L53
            int r15 = m195(r11)     // Catch: java.lang.Throwable -> L53
            int r16 = r12 + r14
            int r16 = r16 + 3
            int r15 = r15 - r16
            if (r15 >= 0) goto L10d
            r15 = 0
        L10d:
            int r14 = r14 + r15
            java.lang.String r15 = xhss.AbstractC0226.m494(r10, r12)     // Catch: java.lang.Throwable -> L53
            r16 = r5
            java.lang.String r5 = xhss.AbstractC0226.m494(r10, r14)     // Catch: java.lang.Throwable -> L181
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L181
            r2.<init>()     // Catch: java.lang.Throwable -> L181
            r2.append(r9)     // Catch: java.lang.Throwable -> L181
            r2.append(r15)     // Catch: java.lang.Throwable -> L181
            java.lang.String r15 = "-+-"
            r2.append(r15)     // Catch: java.lang.Throwable -> L181
            r2.append(r5)     // Catch: java.lang.Throwable -> L181
            r2.append(r8)     // Catch: java.lang.Throwable -> L181
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L181
            int r5 = r12 + r14
            int r5 = r5 + 3
            java.lang.String r10 = xhss.AbstractC0226.m494(r10, r5)     // Catch: java.lang.Throwable -> L181
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L181
            r15.<init>()     // Catch: java.lang.Throwable -> L181
            r15.append(r9)     // Catch: java.lang.Throwable -> L181
            r15.append(r10)     // Catch: java.lang.Throwable -> L181
            r15.append(r8)     // Catch: java.lang.Throwable -> L181
            java.lang.String r8 = r15.toString()     // Catch: java.lang.Throwable -> L181
            java.lang.String r5 = m196(r11, r5)     // Catch: java.lang.Throwable -> L181
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L181
            r9.<init>()     // Catch: java.lang.Throwable -> L181
            java.lang.String r10 = "| "
            r9.append(r10)     // Catch: java.lang.Throwable -> L181
            r9.append(r5)     // Catch: java.lang.Throwable -> L181
            java.lang.String r5 = " |"
            r9.append(r5)     // Catch: java.lang.Throwable -> L181
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Throwable -> L181
            xhss.ᛴᲇᲁᲀ r9 = new xhss.ᛴᲇᲁᲀ     // Catch: java.lang.Throwable -> L181
            r9.<init>(r12, r14)     // Catch: java.lang.Throwable -> L181
            r10 = 30
            java.lang.String r9 = xhss.AbstractC0713.m1242(r13, r0, r9, r10)     // Catch: java.lang.Throwable -> L181
            java.lang.String[] r2 = new java.lang.String[]{r8, r5, r2, r9, r2}     // Catch: java.lang.Throwable -> L181
            java.util.List r2 = xhss.AbstractC0086.m245(r2)     // Catch: java.lang.Throwable -> L181
            r5 = 62
            r8 = 0
            java.lang.String r0 = xhss.AbstractC0713.m1242(r2, r0, r8, r5)     // Catch: java.lang.Throwable -> L181
            goto L199
        L181:
            r0 = move-exception
            goto L193
        L183:
            r16 = r5
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L181
            r0.<init>()     // Catch: java.lang.Throwable -> L181
            throw r0     // Catch: java.lang.Throwable -> L181
        L18b:
            r16 = r5
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L181
            r0.<init>()     // Catch: java.lang.Throwable -> L181
            throw r0     // Catch: java.lang.Throwable -> L181
        L193:
            xhss.ᲈᛳᛱᲇ r2 = new xhss.ᲈᛳᛱᲇ
            r2.<init>(r0)
            r0 = r2
        L199:
            java.lang.String r2 = r16.toString()
            java.lang.String r2 = xhss.AbstractC0226.m493(r2, r3, r6)
            java.lang.String r3 = "\nFailed to build condition table."
            java.lang.String r2 = r2.concat(r3)
            boolean r3 = r0 instanceof xhss.C1129
            if (r3 == 0) goto L1ac
            r0 = r2
        L1ac:
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r1 instanceof xhss.C0653
            java.lang.String r3 = "Unsupported condition type: "
            java.lang.String r5 = "\nSuggestion: "
            java.lang.String r6 = ".\n"
            if (r2 == 0) goto L1d5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "No method found matching the condition for current class"
            r8.<init>(r9)
            r8.append(r7)
            r8.append(r6)
            r8.append(r0)
            r8.append(r5)
            r8.append(r4)
            java.lang.String r0 = r8.toString()
        L1d2:
            r4 = r18
            goto L1f4
        L1d5:
            boolean r8 = r1 instanceof xhss.C0508
            if (r8 == 0) goto L22b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "No field found matching the condition for current class"
            r8.<init>(r9)
            r8.append(r7)
            r8.append(r6)
            r8.append(r0)
            r8.append(r5)
            r8.append(r4)
            java.lang.String r0 = r8.toString()
            goto L1d2
        L1f4:
            int r4 = r4.f2551
            r5 = 1
            if (r4 != r5) goto L219
            java.lang.String r4 = "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.3 ======\n"
            if (r2 != 0) goto L20f
            boolean r2 = r1 instanceof xhss.C0508
            if (r2 != 0) goto L205
            xhss.C0532.m948(r1, r3)
            return
        L205:
            java.lang.NoSuchFieldException r1 = new java.lang.NoSuchFieldException
            java.lang.String r0 = r0.concat(r4)
            r1.<init>(r0)
            goto L218
        L20f:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.String r0 = r0.concat(r4)
            r1.<init>(r0)
        L218:
            throw r1
        L219:
            r1 = 2
            if (r4 != r1) goto L22a
            xhss.ᛴᛷᛱ r1 = xhss.AbstractC0943.f3062
            java.lang.CharSequence r0 = xhss.AbstractC0120.m346(r0)
            java.lang.String r0 = r0.toString()
            r8 = 0
            xhss.AbstractC0943.m1537(r0, r8)
        L22a:
            return
        L22b:
            xhss.C0532.m948(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static final boolean m206(xhss.C0772 r0, java.util.Set r1, java.lang.reflect.Executable r2) {
            java.lang.reflect.AnnotatedType[] r2 = r2.getAnnotatedExceptionTypes()
            java.lang.reflect.AnnotatedElement[] r2 = (java.lang.reflect.AnnotatedElement[]) r2
            java.util.List r2 = m209(r2)
            boolean r0 = m199(r1, r2, r0)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final boolean m207(xhss.C0772 r0, java.util.Set r1, java.lang.reflect.Executable r2) {
            java.lang.reflect.AnnotatedType[] r2 = r2.getAnnotatedParameterTypes()
            java.lang.reflect.AnnotatedElement[] r2 = (java.lang.reflect.AnnotatedElement[]) r2
            java.util.List r2 = m209(r2)
            boolean r0 = m199(r1, r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final boolean m208(xhss.C0772 r4, java.util.Set r5, java.lang.reflect.Executable r6) {
            java.lang.reflect.AnnotatedType r6 = r6.getAnnotatedReturnType()
            java.lang.annotation.Annotation[] r6 = r6.getAnnotations()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L22
            r3 = r6[r2]
            xhss.ᛱᛸᛷᛸ r3 = xhss.C0614.m1077(r3)
            java.lang.Class r3 = r3.mo236()
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L22:
            boolean r4 = m199(r5, r0, r4)
            r4 = r4 ^ 1
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static java.util.List m209(java.lang.reflect.AnnotatedElement[] r8) {
            int r0 = r8.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L11
            r4 = r8[r2]
            java.lang.annotation.Annotation[] r4 = r4.getAnnotations()
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L11:
            if (r3 != 0) goto L16
            xhss.ᛵᛷᛶᛱ r8 = xhss.C0492.f1802
            return r8
        L16:
            xhss.ᲈᛶᲀᲈ r0 = new xhss.ᲈᛶᲀᲈ
            r2 = 10
            r0.<init>(r2)
            int r2 = r8.length
            r3 = r1
        L1f:
            if (r3 >= r2) goto L3e
            r4 = r8[r3]
            java.lang.annotation.Annotation[] r4 = r4.getAnnotations()
            int r5 = r4.length
            r6 = r1
        L29:
            if (r6 >= r5) goto L3b
            r7 = r4[r6]
            xhss.ᛱᛸᛷᛸ r7 = xhss.C0614.m1077(r7)
            java.lang.Class r7 = r7.mo236()
            r0.add(r7)
            int r6 = r6 + 1
            goto L29
        L3b:
            int r3 = r3 + 1
            goto L1f
        L3e:
            r0.m1852()
            r8 = 1
            r0.f3747 = r8
            int r8 = r0.f3746
            if (r8 <= 0) goto L49
            return r0
        L49:
            xhss.ᲈᛶᲀᲈ r8 = xhss.C1150.f3744
            return r8
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final boolean m210(xhss.C0772 r4, java.util.Set r5, java.lang.reflect.Executable r6) {
            java.lang.reflect.AnnotatedType r6 = r6.getAnnotatedReturnType()
            java.lang.annotation.Annotation[] r6 = r6.getAnnotations()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L22
            r3 = r6[r2]
            xhss.ᛱᛸᛷᛸ r3 = xhss.C0614.m1077(r3)
            java.lang.Class r3 = r3.mo236()
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L22:
            boolean r4 = m199(r5, r0, r4)
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static xhss.C0604 m211(xhss.InterfaceC0966 r6, xhss.C0772 r7, java.lang.String r8, java.lang.Object r9, xhss.InterfaceC0517 r10) {
            xhss.ᛴᲁᲀᲁ r0 = new xhss.ᛴᲁᲀᲁ
            r5 = 1
            r3 = r7
            r4 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            xhss.ᛶᲇᲇᛲ r7 = new xhss.ᛶᲇᲇᛲ
            r8 = 1
            r7.<init>(r6, r8, r0)
            return r7
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final boolean m212(xhss.C0772 r0, java.util.Set r1, java.lang.reflect.Executable r2) {
            java.lang.reflect.AnnotatedType[] r2 = r2.getAnnotatedParameterTypes()
            java.lang.reflect.AnnotatedElement[] r2 = (java.lang.reflect.AnnotatedElement[]) r2
            java.util.List r2 = m209(r2)
            boolean r0 = m199(r1, r2, r0)
            r0 = r0 ^ 1
            return r0
    }
}
