package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛱᛲᲀ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0120 extends xhss.AbstractC0226 {
    /* JADX INFO: renamed from: ᛱᛱᲈᲀ, reason: contains not printable characters */
    public static final java.util.List m337(java.lang.CharSequence r5, java.lang.String r6) {
            r0 = 0
            int r1 = m343(r5, r6, r0, r0)
            r2 = -1
            if (r1 == r2) goto L36
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            r3.<init>(r4)
            r4 = r0
        L10:
            java.lang.CharSequence r4 = r5.subSequence(r4, r1)
            java.lang.String r4 = r4.toString()
            r3.add(r4)
            int r4 = r6.length()
            int r4 = r4 + r1
            int r1 = m343(r5, r6, r4, r0)
            if (r1 != r2) goto L10
            int r6 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r4, r6)
            java.lang.String r5 = r5.toString()
            r3.add(r5)
            return r3
        L36:
            java.lang.String r5 = r5.toString()
            java.util.List r5 = java.util.Collections.singletonList(r5)
            return r5
    }

    /* JADX INFO: renamed from: ᛱᛲᛸᲇ, reason: contains not printable characters */
    public static boolean m338(java.lang.CharSequence r2, char r3) {
            r0 = 2
            r1 = 0
            int r2 = m351(r2, r3, r1, r0)
            if (r2 < 0) goto La
            r2 = 1
            return r2
        La:
            return r1
    }

    /* JADX INFO: renamed from: ᛱᲁᛳᛲ, reason: contains not printable characters */
    public static boolean m339(java.lang.CharSequence r13, java.lang.CharSequence r14, boolean r15) {
            boolean r1 = r14 instanceof java.lang.String
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L12
            r0 = r14
            java.lang.String r0 = (java.lang.String) r0
            r1 = 2
            int r0 = m350(r13, r0, r9, r15, r1)
            if (r0 < 0) goto L74
            goto L73
        L12:
            int r3 = r13.length()
            xhss.ᛱᛲᲇᲀ r5 = new xhss.ᛱᛲᲇᲀ
            int r6 = r13.length()
            if (r3 <= r6) goto L1f
            r3 = r6
        L1f:
            r5.<init>(r9, r3, r10)
            boolean r3 = r13 instanceof java.lang.String
            int r11 = r5.f3092
            int r12 = r5.f3091
            if (r3 == 0) goto L53
            if (r1 == 0) goto L53
            if (r11 <= 0) goto L30
            if (r12 >= 0) goto L34
        L30:
            if (r11 >= 0) goto L70
            if (r12 > 0) goto L70
        L34:
            r7 = r9
        L35:
            r3 = r14
            java.lang.String r3 = (java.lang.String) r3
            r6 = r13
            java.lang.String r6 = (java.lang.String) r6
            int r8 = r3.length()
            r5 = 0
            if (r15 != 0) goto L47
            boolean r1 = r3.regionMatches(r5, r6, r7, r8)
            goto L4c
        L47:
            r4 = r15
            boolean r1 = r3.regionMatches(r4, r5, r6, r7, r8)
        L4c:
            if (r1 == 0) goto L4f
            goto L71
        L4f:
            if (r7 == r12) goto L70
            int r7 = r7 + r11
            goto L35
        L53:
            if (r11 <= 0) goto L57
            if (r12 >= 0) goto L5b
        L57:
            if (r11 >= 0) goto L70
            if (r12 > 0) goto L70
        L5b:
            r3 = r9
        L5c:
            r1 = 0
            int r4 = r14.length()
            r2 = r13
            r0 = r14
            r5 = r15
            boolean r1 = m354(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L6c
            r7 = r3
            goto L71
        L6c:
            if (r3 == r12) goto L70
            int r3 = r3 + r11
            goto L5c
        L70:
            r7 = -1
        L71:
            if (r7 < 0) goto L74
        L73:
            return r10
        L74:
            return r9
    }

    /* JADX INFO: renamed from: ᛲᛵᲁᲁ, reason: contains not printable characters */
    public static java.lang.String m340(java.lang.String r4) {
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

    /* JADX INFO: renamed from: ᛲᲀᲇᛳ, reason: contains not printable characters */
    public static java.lang.String m341(java.lang.String r5, char... r6) {
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
            boolean r4 = xhss.AbstractC0193.m453(r6, r4)
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

    /* JADX INFO: renamed from: ᛴᛴᛲᛸ, reason: contains not printable characters */
    public static boolean m342(java.lang.CharSequence r4) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.length()
            if (r1 >= r2) goto L1d
            char r2 = r4.charAt(r1)
            boolean r3 = java.lang.Character.isWhitespace(r2)
            if (r3 != 0) goto L1a
            boolean r2 = java.lang.Character.isSpaceChar(r2)
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: ᛴᛷᛵᛴ, reason: contains not printable characters */
    public static final int m343(java.lang.CharSequence r11, java.lang.String r12, int r13, boolean r14) {
            if (r14 != 0) goto Lf
            boolean r3 = r11 instanceof java.lang.String
            if (r3 != 0) goto L7
            goto Lf
        L7:
            r2 = r11
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r2.indexOf(r12, r13)
            return r0
        Lf:
            int r3 = r11.length()
            xhss.ᛱᛲᲇᲀ r4 = new xhss.ᛱᛲᲇᲀ
            if (r13 >= 0) goto L19
            r1 = 0
            goto L1a
        L19:
            r1 = r13
        L1a:
            int r5 = r11.length()
            if (r3 <= r5) goto L21
            r3 = r5
        L21:
            r5 = 1
            r4.<init>(r1, r3, r5)
            boolean r3 = r11 instanceof java.lang.String
            int r9 = r4.f3092
            int r10 = r4.f3091
            if (r3 == 0) goto L52
            if (r9 <= 0) goto L31
            if (r1 <= r10) goto L35
        L31:
            if (r9 >= 0) goto L6e
            if (r10 > r1) goto L6e
        L35:
            r7 = r1
        L36:
            r6 = r11
            java.lang.String r6 = (java.lang.String) r6
            int r8 = r12.length()
            r5 = 0
            if (r14 != 0) goto L45
            boolean r1 = r12.regionMatches(r5, r6, r7, r8)
            goto L4b
        L45:
            r3 = r12
            r4 = r14
            boolean r1 = r3.regionMatches(r4, r5, r6, r7, r8)
        L4b:
            if (r1 == 0) goto L4e
            return r7
        L4e:
            if (r7 == r10) goto L6e
            int r7 = r7 + r9
            goto L36
        L52:
            if (r9 <= 0) goto L56
            if (r1 <= r10) goto L5a
        L56:
            if (r9 >= 0) goto L6e
            if (r10 > r1) goto L6e
        L5a:
            r3 = r1
        L5b:
            r1 = 0
            int r4 = r12.length()
            r2 = r11
            r0 = r12
            r5 = r14
            boolean r1 = m354(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L6a
            return r3
        L6a:
            if (r3 == r10) goto L6e
            int r3 = r3 + r9
            goto L5b
        L6e:
            r0 = -1
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲈᛳᛲ, reason: contains not printable characters */
    public static java.util.List m344(java.lang.String r4, char[] r5) {
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            char r5 = r5[r1]
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.util.List r4 = m337(r4, r5)
            return r4
        L10:
            xhss.ᲀᛲᲇᛲ r0 = new xhss.ᲀᛲᲇᛲ
            xhss.ᛲᛷᲁᛳ r3 = new xhss.ᛲᛷᲁᛳ
            r3.<init>(r2, r5)
            r0.<init>(r4, r3, r1)
            xhss.ᲀᛲᛴᛴ r5 = new xhss.ᲀᛲᛴᛴ
            r5.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = xhss.AbstractC0249.m554(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L2c:
            r1 = r5
            xhss.ᲀᲀᲇᛵ r1 = (xhss.C0902) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r1 = r1.next()
            xhss.ᛱᛲᲇᲀ r1 = (xhss.C0023) r1
            int r3 = r1.f3090
            int r1 = r1.f3091
            int r1 = r1 + r2
            java.lang.CharSequence r1 = r4.subSequence(r3, r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L2c
        L4c:
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲈᲀᲀ, reason: contains not printable characters */
    public static final int m345(java.lang.CharSequence r0) {
            int r0 = r0.length()
            int r0 = r0 + (-1)
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛳᛸᲇ, reason: contains not printable characters */
    public static java.lang.CharSequence m346(java.lang.CharSequence r7) {
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            if (r3 > r0) goto L33
            if (r4 != 0) goto Lf
            r5 = r3
            goto L10
        Lf:
            r5 = r0
        L10:
            char r5 = r7.charAt(r5)
            boolean r6 = java.lang.Character.isWhitespace(r5)
            if (r6 != 0) goto L23
            boolean r5 = java.lang.Character.isSpaceChar(r5)
            if (r5 == 0) goto L21
            goto L23
        L21:
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            if (r4 != 0) goto L2d
            if (r5 != 0) goto L2a
            r4 = r1
            goto L9
        L2a:
            int r3 = r3 + 1
            goto L9
        L2d:
            if (r5 != 0) goto L30
            goto L33
        L30:
            int r0 = r0 + (-1)
            goto L9
        L33:
            int r0 = r0 + r1
            java.lang.CharSequence r7 = r7.subSequence(r3, r0)
            return r7
    }

    /* JADX INFO: renamed from: ᛵᛴᛲᛵ, reason: contains not printable characters */
    public static java.lang.String m347(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 6
            if (r1 <= r0) goto L8
            r1 = r0
        L8:
            int r0 = r0 - r1
            java.lang.String r2 = r2.substring(r0)
            return r2
    }

    /* JADX INFO: renamed from: ᛵᛸᲁᛸ, reason: contains not printable characters */
    public static java.lang.String m348(java.lang.String r1, int r2) {
            if (r2 < 0) goto Lf
            int r0 = r1.length()
            if (r2 <= r0) goto L9
            r2 = r0
        L9:
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r2)
            return r1
        Lf:
            java.lang.String r1 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            xhss.C0532.m958(r1, r2, r0)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛵᲈᛱᛳ, reason: contains not printable characters */
    public static java.lang.String m349(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            boolean r0 = xhss.AbstractC0226.m492(r1, r2, r0)
            if (r0 == 0) goto Lf
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
        Lf:
            return r1
    }

    /* JADX INFO: renamed from: ᛶᲀᛵᲇ, reason: contains not printable characters */
    public static /* synthetic */ int m350(java.lang.CharSequence r2, java.lang.String r3, int r4, boolean r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = r1
        Lb:
            int r2 = m343(r2, r3, r4, r5)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛷ, reason: contains not printable characters */
    public static int m351(java.lang.CharSequence r1, char r2, int r3, int r4) {
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
            int r1 = m353(r1, r4, r3, r0)
            return r1
        L14:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.indexOf(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ᲀᲁᲁᛲ, reason: contains not printable characters */
    public static java.lang.String m352(java.lang.String r3, char... r4) {
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L21
        L8:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = xhss.AbstractC0193.m453(r4, r2)
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

    /* JADX INFO: renamed from: ᲁᛲᲈᛵ, reason: contains not printable characters */
    public static final int m353(java.lang.CharSequence r6, char[] r7, int r8, boolean r9) {
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
            xhss.C0532.m959(r6)
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
            int r1 = m345(r6)
            if (r8 > r1) goto L49
        L30:
            char r2 = r6.charAt(r8)
            int r3 = r7.length
            r4 = r0
        L36:
            if (r4 >= r3) goto L44
            char r5 = r7[r4]
            boolean r5 = xhss.AbstractC0955.m1553(r5, r2, r9)
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

    /* JADX INFO: renamed from: ᲇᛸᛶ, reason: contains not printable characters */
    public static final boolean m354(java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, int r8, boolean r9) {
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
            boolean r2 = xhss.AbstractC0955.m1553(r2, r3, r9)
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

    /* JADX INFO: renamed from: ᲈᛱᛷᛵ, reason: contains not printable characters */
    public static int m355(java.lang.CharSequence r2, char r3, int r4, int r5) {
            r5 = r5 & 2
            if (r5 == 0) goto L8
            int r4 = m345(r2)
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
            int r3 = m345(r2)
            if (r4 <= r3) goto L26
            r4 = r3
        L26:
            r3 = -1
            if (r3 >= r4) goto L39
            char r3 = r2.charAt(r4)
            char r1 = r5[r0]
            boolean r3 = xhss.AbstractC0955.m1553(r1, r3, r0)
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

    /* JADX INFO: renamed from: ᲈᲈᲈ, reason: contains not printable characters */
    public static java.util.List m356(java.lang.String r4, java.lang.String[] r5) {
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L13
            r0 = r5[r1]
            int r3 = r0.length()
            if (r3 != 0) goto Le
            goto L13
        Le:
            java.util.List r4 = m337(r4, r0)
            return r4
        L13:
            java.util.List r5 = java.util.Arrays.asList(r5)
            xhss.ᲀᛲᲇᛲ r0 = new xhss.ᲀᛲᲇᛲ
            xhss.ᛲᛷᲁᛳ r3 = new xhss.ᛲᛷᲁᛳ
            r3.<init>(r1, r5)
            r0.<init>(r4, r3, r1)
            xhss.ᲀᛲᛴᛴ r5 = new xhss.ᲀᛲᛴᛴ
            r5.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = xhss.AbstractC0249.m554(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L33:
            r1 = r5
            xhss.ᲀᲀᲇᛵ r1 = (xhss.C0902) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r1 = r1.next()
            xhss.ᛱᛲᲇᲀ r1 = (xhss.C0023) r1
            int r3 = r1.f3090
            int r1 = r1.f3091
            int r1 = r1 + r2
            java.lang.CharSequence r1 = r4.subSequence(r3, r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L33
        L53:
            return r0
    }
}
