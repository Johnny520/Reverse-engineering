package defpackage;

/* JADX INFO: renamed from: ᛷᛸᲈᛵ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1347 extends defpackage.AbstractC0651 {
    /* JADX INFO: renamed from: ᛱᛳᛷ, reason: contains not printable characters */
    public static java.lang.String m2499(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 8
            if (r1 > r0) goto L12
            r0 = 0
            int r1 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r0, r1)
            goto L2d
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            int r2 = r4.length()
            int r1 = r1 - r2
            r2 = 1
            if (r2 > r1) goto L29
        L1f:
            r3 = 48
            r0.append(r3)
            if (r2 == r1) goto L29
            int r2 = r2 + 1
            goto L1f
        L29:
            r0.append(r4)
            r4 = r0
        L2d:
            java.lang.String r4 = r4.toString()
            return r4
    }

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public static boolean m2500(java.lang.CharSequence r8, java.lang.CharSequence r9, boolean r10) {
            boolean r0 = r9 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r9 = (java.lang.String) r9
            r0 = 2
            int r8 = m2517(r8, r9, r1, r10, r0)
            if (r8 < 0) goto L20
            goto L1e
        Lf:
            int r5 = r8.length()
            r7 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            r6 = r10
            int r8 = m2515(r2, r3, r4, r5, r6, r7)
            if (r8 < 0) goto L20
        L1e:
            r8 = 1
            return r8
        L20:
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛵᲁᛲ, reason: contains not printable characters */
    public static final java.util.List m2501(java.lang.CharSequence r8, java.lang.String r9, int r10) {
            m2508(r10)
            r0 = 0
            int r1 = m2504(r8, r9, r0, r0)
            r2 = -1
            if (r1 == r2) goto L52
            r3 = 1
            if (r10 != r3) goto Lf
            goto L52
        Lf:
            if (r10 <= 0) goto L13
            r4 = r3
            goto L14
        L13:
            r4 = r0
        L14:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            if (r4 == 0) goto L1e
            if (r10 <= r6) goto L1d
            goto L1e
        L1d:
            r6 = r10
        L1e:
            r5.<init>(r6)
            r6 = r0
        L22:
            java.lang.CharSequence r6 = r8.subSequence(r6, r1)
            java.lang.String r6 = r6.toString()
            r5.add(r6)
            int r6 = r9.length()
            int r6 = r6 + r1
            if (r4 == 0) goto L3c
            int r1 = r5.size()
            int r7 = r10 + (-1)
            if (r1 == r7) goto L42
        L3c:
            int r1 = m2504(r8, r9, r6, r0)
            if (r1 != r2) goto L22
        L42:
            int r9 = r8.length()
            java.lang.CharSequence r8 = r8.subSequence(r6, r9)
            java.lang.String r8 = r8.toString()
            r5.add(r8)
            return r5
        L52:
            java.lang.String r8 = r8.toString()
            java.util.List r8 = java.util.Collections.singletonList(r8)
            return r8
    }

    /* JADX INFO: renamed from: ᛲᛶᛷᛲ, reason: contains not printable characters */
    public static java.util.List m2502(java.lang.String r4, char[] r5) {
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            char r5 = r5[r1]
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.util.List r4 = m2501(r4, r5, r1)
            return r4
        L10:
            m2508(r1)
            ᛴᛸᲀᛲ r0 = new ᛴᛸᲀᛲ
            ᛷᛶᛵᛲ r3 = new ᛷᛶᛵᛲ
            r3.<init>(r1, r5)
            r0.<init>(r4, r1, r3)
            ᲀᛲᲇᲇ r5 = new ᲀᛲᲇᲇ
            r5.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = defpackage.AbstractC0575.m1369(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L2f:
            r1 = r5
            ᲈᛱᲁᛵ r1 = (defpackage.C2180) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r1 = r1.next()
            ᛱᛵᲇᲇ r1 = (defpackage.C0106) r1
            int r3 = r1.f9424
            int r1 = r1.f9423
            int r1 = r1 + r2
            java.lang.CharSequence r1 = r4.subSequence(r3, r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L2f
        L4f:
            return r0
    }

    /* JADX INFO: renamed from: ᛲᲈᛶᲇ, reason: contains not printable characters */
    public static java.lang.String m2503(java.lang.String r5, char... r6) {
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        L8:
            if (r2 > r0) goto L26
            if (r3 != 0) goto Le
            r4 = r2
            goto Lf
        Le:
            r4 = r0
        Lf:
            char r4 = r5.charAt(r4)
            boolean r4 = defpackage.AbstractC2315.m3768(r6, r4)
            if (r3 != 0) goto L20
            if (r4 != 0) goto L1d
            r3 = r1
            goto L8
        L1d:
            int r2 = r2 + 1
            goto L8
        L20:
            if (r4 != 0) goto L23
            goto L26
        L23:
            int r0 = r0 + (-1)
            goto L8
        L26:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public static final int m2504(java.lang.CharSequence r6, java.lang.String r7, int r8, boolean r9) {
            if (r9 != 0) goto Le
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto L7
            goto Le
        L7:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            return r6
        Le:
            int r3 = r6.length()
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            int r6 = m2515(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ᛳᛸᛱᲇ, reason: contains not printable characters */
    public static final int m2505(java.lang.CharSequence r6, char[] r7, int r8, boolean r9) {
            r0 = 0
            if (r9 != 0) goto L27
            int r1 = r7.length
            r2 = 1
            if (r1 != r2) goto L27
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L27
            int r9 = r7.length
            if (r9 == 0) goto L1f
            if (r9 != r2) goto L19
            char r7 = r7[r0]
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            return r6
        L19:
            java.lang.String r6 = "Array has more than one element."
            defpackage.C2264.m3684(r6)
            return r0
        L1f:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Array is empty."
            r6.<init>(r7)
            throw r6
        L27:
            if (r8 >= 0) goto L2a
            r8 = r0
        L2a:
            int r1 = m2516(r6)
            if (r8 > r1) goto L49
        L30:
            char r2 = r6.charAt(r8)
            int r3 = r7.length
            r4 = r0
        L36:
            if (r4 >= r3) goto L44
            char r5 = r7[r4]
            boolean r5 = defpackage.AbstractC0729.m1636(r5, r2, r9)
            if (r5 == 0) goto L41
            return r8
        L41:
            int r4 = r4 + 1
            goto L36
        L44:
            if (r8 == r1) goto L49
            int r8 = r8 + 1
            goto L30
        L49:
            r6 = -1
            return r6
    }

    /* JADX INFO: renamed from: ᛴᛴᛲᲈ, reason: contains not printable characters */
    public static final boolean m2506(java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, int r8, boolean r9) {
            r0 = 0
            if (r7 < 0) goto L2f
            if (r5 < 0) goto L2f
            int r1 = r4.length()
            int r1 = r1 - r8
            if (r5 > r1) goto L2f
            int r1 = r6.length()
            int r1 = r1 - r8
            if (r7 <= r1) goto L14
            goto L2f
        L14:
            r1 = r0
        L15:
            if (r1 >= r8) goto L2d
            int r2 = r5 + r1
            char r2 = r4.charAt(r2)
            int r3 = r7 + r1
            char r3 = r6.charAt(r3)
            boolean r2 = defpackage.AbstractC0729.m1636(r2, r3, r9)
            if (r2 != 0) goto L2a
            return r0
        L2a:
            int r1 = r1 + 1
            goto L15
        L2d:
            r4 = 1
            return r4
        L2f:
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛴᲈᛵ, reason: contains not printable characters */
    public static java.lang.String m2507(java.lang.String r3) {
            r0 = 0
            r1 = 6
            r2 = 47
            int r0 = m2518(r3, r2, r0, r1)
            r1 = -1
            if (r0 != r1) goto Lc
            return r3
        Lc:
            int r0 = r0 + 1
            int r1 = r3.length()
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ᛴᛶᛸᲈ, reason: contains not printable characters */
    public static final void m2508(int r1) {
            if (r1 < 0) goto L3
            return
        L3:
            java.lang.String r0 = "Limit must be non-negative, but was "
            java.lang.String r1 = defpackage.AbstractC1124.m2145(r1, r0)
            defpackage.C2264.m3678(r1)
            return
    }

    /* JADX INFO: renamed from: ᛵᛵᲀᛲ, reason: contains not printable characters */
    public static java.lang.String m2509(java.lang.String r1, java.lang.String r2) {
            boolean r0 = m2525(r1, r2)
            if (r0 == 0) goto L14
            int r0 = r1.length()
            int r2 = r2.length()
            int r0 = r0 - r2
            r2 = 0
            java.lang.String r1 = r1.substring(r2, r0)
        L14:
            return r1
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public static boolean m2510(java.lang.CharSequence r2, char r3) {
            r0 = 2
            r1 = 0
            int r2 = m2514(r2, r3, r1, r0)
            if (r2 < 0) goto La
            r2 = 1
            return r2
        La:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛲᛶᲀ, reason: contains not printable characters */
    public static java.lang.String m2511(java.lang.String r3, char... r4) {
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L21
        L8:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = defpackage.AbstractC2315.m3768(r4, r2)
            if (r2 != 0) goto L1c
            int r0 = r0 + 1
            r4 = 0
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L23
        L1c:
            if (r1 >= 0) goto L1f
            goto L21
        L1f:
            r0 = r1
            goto L8
        L21:
            java.lang.String r3 = ""
        L23:
            java.lang.String r3 = r3.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛲᲁᛳ, reason: contains not printable characters */
    public static java.util.List m2512(java.lang.CharSequence r2) {
            ᛵᛵᛷᛸ r0 = new ᛵᛵᛷᛸ
            r0.<init>(r2)
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto Le
            ᲀᛶᲇ r2 = defpackage.C1698.f7558
            return r2
        Le:
            java.lang.Object r2 = r0.next()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1d
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L1d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r2)
        L25:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            r1.add(r2)
            goto L25
        L33:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛴᲈ, reason: contains not printable characters */
    public static java.lang.String m2513(java.lang.String r1, java.lang.String r2) {
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto Le
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
        Le:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public static int m2514(java.lang.CharSequence r1, char r2, int r3, int r4) {
            r4 = r4 & 2
            r0 = 0
            if (r4 == 0) goto L6
            r3 = r0
        L6:
            boolean r4 = r1 instanceof java.lang.String
            if (r4 != 0) goto L14
            r4 = 1
            char[] r4 = new char[r4]
            r4[r0] = r2
            int r1 = m2505(r1, r4, r3, r0)
            return r1
        L14:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.indexOf(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public static final int m2515(java.lang.CharSequence r15, java.lang.CharSequence r16, int r17, int r18, boolean r19, boolean r20) {
            r0 = r16
            r1 = r17
            r2 = r18
            r6 = -1
            r3 = 0
            if (r20 != 0) goto L1b
            ᛱᛵᲇᲇ r4 = new ᛱᛵᲇᲇ
            if (r1 >= 0) goto Lf
            r1 = r3
        Lf:
            int r3 = r15.length()
            if (r2 <= r3) goto L16
            r2 = r3
        L16:
            r3 = 1
            r4.<init>(r1, r2, r3)
            goto L2a
        L1b:
            int r4 = m2516(r15)
            if (r1 <= r4) goto L22
            r1 = r4
        L22:
            if (r2 >= 0) goto L25
            r2 = r3
        L25:
            ᲈᛳᛷᛴ r4 = new ᲈᛳᛷᛴ
            r4.<init>(r1, r2, r6)
        L2a:
            boolean r1 = r15 instanceof java.lang.String
            int r7 = r4.f9422
            int r8 = r4.f9423
            int r2 = r4.f9424
            if (r1 == 0) goto L60
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L60
            if (r7 <= 0) goto L3c
            if (r2 <= r8) goto L40
        L3c:
            if (r7 >= 0) goto L7e
            if (r8 > r2) goto L7e
        L40:
            r13 = r2
        L41:
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            r12 = r15
            java.lang.String r12 = (java.lang.String) r12
            int r14 = r9.length()
            r11 = 0
            if (r19 != 0) goto L53
            boolean r1 = r9.regionMatches(r11, r12, r13, r14)
            goto L59
        L53:
            r10 = r19
            boolean r1 = r9.regionMatches(r10, r11, r12, r13, r14)
        L59:
            if (r1 == 0) goto L5c
            return r13
        L5c:
            if (r13 == r8) goto L7e
            int r13 = r13 + r7
            goto L41
        L60:
            if (r7 <= 0) goto L64
            if (r2 <= r8) goto L68
        L64:
            if (r7 >= 0) goto L7e
            if (r8 > r2) goto L7e
        L68:
            r3 = r2
        L69:
            r1 = 0
            int r4 = r0.length()
            r2 = r15
            r5 = r19
            boolean r1 = m2506(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L78
            return r3
        L78:
            if (r3 == r8) goto L7e
            int r3 = r3 + r7
            r0 = r16
            goto L69
        L7e:
            return r6
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public static final int m2516(java.lang.CharSequence r0) {
            int r0 = r0.length()
            int r0 = r0 + (-1)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲇᛷᛶ, reason: contains not printable characters */
    public static /* synthetic */ int m2517(java.lang.CharSequence r2, java.lang.String r3, int r4, boolean r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = r1
        Lb:
            int r2 = m2504(r2, r3, r4, r5)
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛱᲈᛳ, reason: contains not printable characters */
    public static int m2518(java.lang.CharSequence r2, char r3, int r4, int r5) {
            r5 = r5 & 2
            if (r5 == 0) goto L8
            int r4 = m2516(r2)
        L8:
            boolean r5 = r2 instanceof java.lang.String
            if (r5 != 0) goto L3a
            r5 = 1
            char[] r5 = new char[r5]
            r0 = 0
            r5[r0] = r3
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L1f
            char r3 = r5[r0]
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.lastIndexOf(r3, r4)
            return r2
        L1f:
            int r3 = m2516(r2)
            if (r4 <= r3) goto L26
            r4 = r3
        L26:
            r3 = -1
            if (r3 >= r4) goto L39
            char r3 = r2.charAt(r4)
            char r1 = r5[r0]
            boolean r3 = defpackage.AbstractC0729.m1636(r1, r3, r0)
            if (r3 == 0) goto L36
            return r4
        L36:
            int r4 = r4 + (-1)
            goto L26
        L39:
            return r3
        L3a:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.lastIndexOf(r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ᲀᛷᛲᛴ, reason: contains not printable characters */
    public static java.util.List m2519(java.lang.String r3, java.lang.String[] r4, int r5) {
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto L7
            r5 = r0
            goto L8
        L7:
            r5 = 2
        L8:
            int r1 = r4.length
            r2 = 1
            if (r1 != r2) goto L1a
            r0 = r4[r0]
            int r1 = r0.length()
            if (r1 != 0) goto L15
            goto L1a
        L15:
            java.util.List r3 = m2501(r3, r0, r5)
            return r3
        L1a:
            m2508(r5)
            java.util.List r4 = java.util.Arrays.asList(r4)
            ᛴᛸᲀᛲ r0 = new ᛴᛸᲀᛲ
            ᛷᛶᛵᛲ r1 = new ᛷᛶᛵᛲ
            r1.<init>(r2, r4)
            r0.<init>(r3, r5, r1)
            ᲀᛲᲇᲇ r4 = new ᲀᛲᲇᲇ
            r4.<init>(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = defpackage.AbstractC0575.m1369(r4)
            r5.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L3d:
            r0 = r4
            ᲈᛱᲁᛵ r0 = (defpackage.C2180) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r0 = r0.next()
            ᛱᛵᲇᲇ r0 = (defpackage.C0106) r0
            int r1 = r0.f9424
            int r0 = r0.f9423
            int r0 = r0 + r2
            java.lang.CharSequence r0 = r3.subSequence(r1, r0)
            java.lang.String r0 = r0.toString()
            r5.add(r0)
            goto L3d
        L5d:
            return r5
    }

    /* JADX INFO: renamed from: ᲀᲀᛲᛸ, reason: contains not printable characters */
    public static java.lang.String m2520(java.lang.String r4, java.lang.String r5) {
            r0 = 6
            r1 = 46
            r2 = 0
            int r0 = m2518(r4, r1, r2, r0)
            r1 = -1
            if (r0 != r1) goto Lc
            return r4
        Lc:
            int r0 = r0 + 1
            int r1 = r4.length()
            if (r1 < r0) goto L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4, r2, r0)
            r3.append(r5)
            int r5 = r4.length()
            r3.append(r4, r1, r5)
            java.lang.String r4 = r3.toString()
            return r4
        L2b:
            java.lang.String r4 = "End index ("
            java.lang.String r5 = ") is less than start index ("
            defpackage.C1356.m2533(r4, r1, r5, r0)
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᲀᲀᲇᛴ, reason: contains not printable characters */
    public static java.lang.CharSequence m2521(java.lang.CharSequence r5) {
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        L8:
            if (r2 > r0) goto L26
            if (r3 != 0) goto Le
            r4 = r2
            goto Lf
        Le:
            r4 = r0
        Lf:
            char r4 = r5.charAt(r4)
            boolean r4 = defpackage.AbstractC0729.m1639(r4)
            if (r3 != 0) goto L20
            if (r4 != 0) goto L1d
            r3 = r1
            goto L8
        L1d:
            int r2 = r2 + 1
            goto L8
        L20:
            if (r4 != 0) goto L23
            goto L26
        L23:
            int r0 = r0 + (-1)
            goto L8
        L26:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    /* JADX INFO: renamed from: ᲀᲈᛵᛳ, reason: contains not printable characters */
    public static java.lang.String m2522(java.lang.String r3, char... r4) {
            int r0 = r3.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            char r2 = r3.charAt(r1)
            boolean r2 = defpackage.AbstractC2315.m3768(r4, r2)
            if (r2 != 0) goto L1a
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            goto L1f
        L1a:
            int r1 = r1 + 1
            goto L5
        L1d:
            java.lang.String r3 = ""
        L1f:
            java.lang.String r3 = r3.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᲁᛸᛴᛶ, reason: contains not printable characters */
    public static java.lang.String m2523(int r1, java.lang.String r2) {
            if (r1 < 0) goto Lf
            int r0 = r2.length()
            if (r1 <= r0) goto L9
            r1 = r0
        L9:
            r0 = 0
            java.lang.String r1 = r2.substring(r0, r1)
            return r1
        Lf:
            java.lang.String r2 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            defpackage.C0086.m546(r2, r1, r0)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛱᛱ, reason: contains not printable characters */
    public static boolean m2524(java.lang.CharSequence r3) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.length()
            if (r1 >= r2) goto L16
            char r2 = r3.charAt(r1)
            boolean r2 = defpackage.AbstractC0729.m1639(r2)
            if (r2 != 0) goto L13
            return r0
        L13:
            int r1 = r1 + 1
            goto L2
        L16:
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public static boolean m2525(java.lang.CharSequence r8, java.lang.String r9) {
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto Lc
            java.lang.String r8 = (java.lang.String) r8
            r0 = 0
            boolean r8 = defpackage.AbstractC0651.m1483(r8, r9, r0)
            return r8
        Lc:
            int r0 = r8.length()
            int r1 = r9.length()
            int r3 = r0 - r1
            r5 = 0
            int r6 = r9.length()
            r7 = 0
            r2 = r8
            r4 = r9
            boolean r8 = m2506(r2, r3, r4, r5, r6, r7)
            return r8
    }
}
