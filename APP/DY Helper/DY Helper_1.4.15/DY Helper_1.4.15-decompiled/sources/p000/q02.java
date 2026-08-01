package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class q02 extends p000.x02 {
    /* JADX INFO: renamed from: Υ */
    public static boolean m4654(java.lang.CharSequence r8, java.lang.CharSequence r9, boolean r10) {
            r8.getClass()
            r9.getClass()
            boolean r0 = r9 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.String r9 = (java.lang.String) r9
            r0 = 2
            int r8 = m4669(r8, r9, r1, r10, r0)
            if (r8 < 0) goto L26
            goto L24
        L15:
            int r5 = r8.length()
            r7 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            r6 = r10
            int r8 = m4667(r2, r3, r4, r5, r6, r7)
            if (r8 < 0) goto L26
        L24:
            r8 = 1
            return r8
        L26:
            return r1
    }

    /* JADX INFO: renamed from: Φ */
    public static boolean m4655(java.lang.CharSequence r2, char r3) {
            r2.getClass()
            r0 = 2
            r1 = 0
            int r2 = m4668(r2, r3, r1, r0)
            if (r2 < 0) goto Ld
            r2 = 1
            return r2
        Ld:
            return r1
    }

    /* JADX INFO: renamed from: Χ */
    public static java.lang.String m4656(java.lang.String r1) {
            int r0 = r1.length()
            int r0 = r0 + (-1)
            if (r0 >= 0) goto L9
            r0 = 0
        L9:
            java.lang.String r1 = m4693(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: Ψ */
    public static boolean m4657(java.lang.String r3, char r4) {
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L18
            int r0 = r3.length()
            r2 = 1
            int r0 = r0 - r2
            char r3 = r3.charAt(r0)
            boolean r3 = p000.jx0.m3057(r3, r4, r1)
            if (r3 == 0) goto L18
            return r2
        L18:
            return r1
    }

    /* JADX INFO: renamed from: Ω */
    public static java.lang.Character m4658(java.lang.CharSequence r1) {
            int r0 = r1.length()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r0 = 0
            char r1 = r1.charAt(r0)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
    }

    /* JADX INFO: renamed from: А */
    public static java.lang.String m4659(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 4
            if (r1 <= r0) goto L8
            r1 = r0
        L8:
            int r0 = r0 - r1
            java.lang.String r2 = r2.substring(r0)
            return r2
    }

    /* JADX INFO: renamed from: Б */
    public static java.lang.CharSequence m4660(java.lang.CharSequence r5) {
            r5.getClass()
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        Lb:
            if (r2 > r0) goto L29
            if (r3 != 0) goto L11
            r4 = r2
            goto L12
        L11:
            r4 = r0
        L12:
            char r4 = r5.charAt(r4)
            boolean r4 = p000.jx0.m3020(r4)
            if (r3 != 0) goto L23
            if (r4 != 0) goto L20
            r3 = r1
            goto Lb
        L20:
            int r2 = r2 + 1
            goto Lb
        L23:
            if (r4 != 0) goto L26
            goto L29
        L26:
            int r0 = r0 + (-1)
            goto Lb
        L29:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    /* JADX INFO: renamed from: В */
    public static java.lang.String m4661(java.lang.String r5, char... r6) {
            r5.getClass()
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        Lb:
            if (r2 > r0) goto L29
            if (r3 != 0) goto L11
            r4 = r2
            goto L12
        L11:
            r4 = r0
        L12:
            char r4 = r5.charAt(r4)
            boolean r4 = p000.AbstractC0312g7.m2233(r6, r4)
            if (r3 != 0) goto L23
            if (r4 != 0) goto L20
            r3 = r1
            goto Lb
        L20:
            int r2 = r2 + 1
            goto Lb
        L23:
            if (r4 != 0) goto L26
            goto L29
        L26:
            int r0 = r0 + (-1)
            goto Lb
        L29:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    /* JADX INFO: renamed from: Г */
    public static java.lang.CharSequence m4662(java.lang.String r3) {
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L21
        L8:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = p000.jx0.m3020(r2)
            if (r2 != 0) goto L1c
            int r0 = r0 + 1
            r1 = 0
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            return r3
        L1c:
            if (r1 >= 0) goto L1f
            goto L21
        L1f:
            r0 = r1
            goto L8
        L21:
            java.lang.String r3 = ""
            return r3
    }

    /* JADX INFO: renamed from: Д */
    public static java.lang.String m4663(java.lang.String r3, char... r4) {
            r3.getClass()
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L24
        Lb:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = p000.AbstractC0312g7.m2233(r4, r2)
            if (r2 != 0) goto L1f
            int r0 = r0 + 1
            r4 = 0
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L26
        L1f:
            if (r1 >= 0) goto L22
            goto L24
        L22:
            r0 = r1
            goto Lb
        L24:
            java.lang.String r3 = ""
        L26:
            java.lang.String r3 = r3.toString()
            return r3
    }

    /* JADX INFO: renamed from: Е */
    public static java.lang.String m4664(java.lang.String r3, char... r4) {
            r3.getClass()
            int r0 = r3.length()
            r1 = 0
        L8:
            if (r1 >= r0) goto L20
            char r2 = r3.charAt(r1)
            boolean r2 = p000.AbstractC0312g7.m2233(r4, r2)
            if (r2 != 0) goto L1d
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            goto L22
        L1d:
            int r1 = r1 + 1
            goto L8
        L20:
            java.lang.String r3 = ""
        L22:
            java.lang.String r3 = r3.toString()
            return r3
    }

    /* JADX INFO: renamed from: а */
    public static java.lang.Character m4665(java.lang.String r1, int r2) {
            r1.getClass()
            if (r2 < 0) goto L14
            int r0 = r1.length()
            if (r2 >= r0) goto L14
            char r1 = r1.charAt(r2)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: б */
    public static final int m4666(java.lang.CharSequence r6, java.lang.String r7, int r8, boolean r9) {
            r6.getClass()
            r7.getClass()
            if (r9 != 0) goto L14
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto Ld
            goto L14
        Ld:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            return r6
        L14:
            int r3 = r6.length()
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            int r6 = m4667(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: в */
    public static final int m4667(java.lang.CharSequence r16, java.lang.CharSequence r17, int r18, int r19, boolean r20, boolean r21) {
            r2 = r16
            r0 = r17
            r1 = r18
            r3 = r19
            r6 = -1
            r4 = 1
            r5 = 0
            if (r21 != 0) goto L1d
            xm0 r7 = new xm0
            if (r1 >= 0) goto L12
            r1 = r5
        L12:
            int r5 = r2.length()
            if (r3 <= r5) goto L19
            r3 = r5
        L19:
            r7.<init>(r1, r3, r4)
            goto L30
        L1d:
            r2.getClass()
            int r7 = r2.length()
            int r7 = r7 - r4
            if (r1 <= r7) goto L28
            r1 = r7
        L28:
            if (r3 >= 0) goto L2b
            r3 = r5
        L2b:
            vm0 r7 = new vm0
            r7.<init>(r1, r3, r6)
        L30:
            boolean r1 = r2 instanceof java.lang.String
            int r8 = r7.f11349
            int r9 = r7.f11348
            int r3 = r7.f11347
            if (r1 == 0) goto L5f
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L5f
            if (r8 <= 0) goto L42
            if (r3 <= r9) goto L46
        L42:
            if (r8 >= 0) goto L7d
            if (r9 > r3) goto L7d
        L46:
            r13 = r3
        L47:
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            int r14 = r10.length()
            r11 = 0
            r15 = r20
            boolean r1 = p000.x02.m6481(r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L5b
            return r13
        L5b:
            if (r13 == r9) goto L7d
            int r13 = r13 + r8
            goto L47
        L5f:
            if (r8 <= 0) goto L63
            if (r3 <= r9) goto L67
        L63:
            if (r8 >= 0) goto L7d
            if (r9 > r3) goto L7d
        L67:
            r1 = 0
            int r4 = r0.length()
            r5 = r20
            boolean r1 = m4677(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L75
            return r3
        L75:
            if (r3 == r9) goto L7d
            int r3 = r3 + r8
            r2 = r16
            r0 = r17
            goto L67
        L7d:
            return r6
    }

    /* JADX INFO: renamed from: г */
    public static int m4668(java.lang.CharSequence r1, char r2, int r3, int r4) {
            r4 = r4 & 2
            r0 = 0
            if (r4 == 0) goto L6
            r3 = r0
        L6:
            r1.getClass()
            boolean r4 = r1 instanceof java.lang.String
            if (r4 != 0) goto L17
            r4 = 1
            char[] r4 = new char[r4]
            r4[r0] = r2
            int r1 = m4670(r1, r4, r3, r0)
            return r1
        L17:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.indexOf(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: д */
    public static /* synthetic */ int m4669(java.lang.CharSequence r2, java.lang.String r3, int r4, boolean r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = r1
        Lb:
            int r2 = m4666(r2, r3, r4, r5)
            return r2
    }

    /* JADX INFO: renamed from: е */
    public static final int m4670(java.lang.CharSequence r6, char[] r7, int r8, boolean r9) {
            r6.getClass()
            r0 = 1
            if (r9 != 0) goto L18
            int r1 = r7.length
            if (r1 != r0) goto L18
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L18
            char r7 = p000.AbstractC0312g7.m2257(r7)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            return r6
        L18:
            r1 = 0
            if (r8 >= 0) goto L1c
            r8 = r1
        L1c:
            int r2 = r6.length()
            int r2 = r2 - r0
            if (r8 > r2) goto L3c
        L23:
            char r0 = r6.charAt(r8)
            int r3 = r7.length
            r4 = r1
        L29:
            if (r4 >= r3) goto L37
            char r5 = r7[r4]
            boolean r5 = p000.jx0.m3057(r5, r0, r9)
            if (r5 == 0) goto L34
            return r8
        L34:
            int r4 = r4 + 1
            goto L29
        L37:
            if (r8 == r2) goto L3c
            int r8 = r8 + 1
            goto L23
        L3c:
            r6 = -1
            return r6
    }

    /* JADX INFO: renamed from: ж */
    public static boolean m4671(java.lang.CharSequence r3) {
            r3.getClass()
            r0 = 0
            r1 = r0
        L5:
            int r2 = r3.length()
            if (r1 >= r2) goto L19
            char r2 = r3.charAt(r1)
            boolean r2 = p000.jx0.m3020(r2)
            if (r2 != 0) goto L16
            return r0
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: з */
    public static char m4672(java.lang.CharSequence r1) {
            r1.getClass()
            int r0 = r1.length()
            if (r0 == 0) goto L14
            int r0 = r1.length()
            int r0 = r0 + (-1)
            char r1 = r1.charAt(r0)
            return r1
        L14:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Char sequence is empty."
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: и */
    public static int m4673(int r0, java.lang.String r1, java.lang.String r2) {
            r0 = r0 & 2
            if (r0 == 0) goto Lb
            int r0 = r1.length()
            int r0 = r0 + (-1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r2.getClass()
            int r0 = r1.lastIndexOf(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: й */
    public static int m4674(java.lang.String r0, char r1, int r2, int r3) {
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            r0.getClass()
            int r2 = r0.length()
            int r2 = r2 + (-1)
        Ld:
            r0.getClass()
            int r0 = r0.lastIndexOf(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: к */
    public static java.util.List m4675(java.lang.CharSequence r2) {
            r2.getClass()
            es0 r0 = new es0
            r0.<init>(r2)
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L11
            jz r2 = p000.C0450jz.f5672
            goto L32
        L11:
            java.lang.Object r2 = r0.next()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L20
            java.util.List r2 = p000.AbstractC1021yh.m6896(r2)
            goto L32
        L20:
            java.util.ArrayList r2 = p000.lz1.m3696(r2)
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            r2.add(r1)
            goto L24
        L32:
            return r2
    }

    /* JADX INFO: renamed from: л */
    public static java.lang.String m4676(java.lang.String r3, int r4) {
            if (r4 < 0) goto L32
            int r0 = r3.length()
            if (r4 > r0) goto L12
            r4 = 0
            int r0 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L2d
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            int r1 = r3.length()
            int r4 = r4 - r1
            r1 = 1
            if (r1 > r4) goto L29
        L1f:
            r2 = 48
            r0.append(r2)
            if (r1 == r4) goto L29
            int r1 = r1 + 1
            goto L1f
        L29:
            r0.append(r3)
            r3 = r0
        L2d:
            java.lang.String r3 = r3.toString()
            return r3
        L32:
            java.lang.String r3 = "Desired length "
            java.lang.String r0 = " is less than zero."
            java.lang.String r3 = p000.AbstractC0602nx.m4127(r3, r4, r0)
            p000.C1080.m7275(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: м */
    public static final boolean m4677(java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, int r8, boolean r9) {
            r4.getClass()
            r6.getClass()
            r0 = 0
            if (r7 < 0) goto L35
            if (r5 < 0) goto L35
            int r1 = r4.length()
            int r1 = r1 - r8
            if (r5 > r1) goto L35
            int r1 = r6.length()
            int r1 = r1 - r8
            if (r7 <= r1) goto L1a
            goto L35
        L1a:
            r1 = r0
        L1b:
            if (r1 >= r8) goto L33
            int r2 = r5 + r1
            char r2 = r4.charAt(r2)
            int r3 = r7 + r1
            char r3 = r6.charAt(r3)
            boolean r2 = p000.jx0.m3057(r2, r3, r9)
            if (r2 != 0) goto L30
            return r0
        L30:
            int r1 = r1 + 1
            goto L1b
        L33:
            r4 = 1
            return r4
        L35:
            return r0
    }

    /* JADX INFO: renamed from: н */
    public static java.lang.String m4678(java.lang.String r1, java.lang.String r2) {
            r1.getClass()
            r2.getClass()
            r0 = 0
            boolean r0 = p000.x02.m6485(r1, r2, r0)
            if (r0 == 0) goto L15
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
        L15:
            return r1
    }

    /* JADX INFO: renamed from: о */
    public static java.lang.String m4679(java.lang.String r2, java.lang.String r3) {
            r0 = 0
            boolean r1 = p000.x02.m6479(r2, r3, r0)
            if (r1 == 0) goto L14
            int r1 = r2.length()
            int r3 = r3.length()
            int r1 = r1 - r3
            java.lang.String r2 = r2.substring(r0, r1)
        L14:
            return r2
    }

    /* JADX INFO: renamed from: п */
    public static final void m4680(int r1) {
            if (r1 < 0) goto L3
            return
        L3:
            java.lang.String r0 = "Limit must be non-negative, but was "
            java.lang.String r1 = p000.a12.m17(r0, r1)
            p000.C1080.m7266(r1)
            return
    }

    /* JADX INFO: renamed from: р */
    public static final java.util.List m4681(java.lang.CharSequence r8, java.lang.String r9, int r10) {
            m4680(r10)
            r0 = 0
            int r1 = m4666(r8, r9, r0, r0)
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
            int r1 = m4666(r8, r9, r6, r0)
            if (r1 != r2) goto L22
        L42:
            int r9 = r8.length()
            java.lang.CharSequence r8 = r8.subSequence(r6, r9)
            java.lang.String r8 = r8.toString()
            r5.add(r8)
            return r5
        L52:
            java.lang.String r8 = r8.toString()
            java.util.List r8 = p000.AbstractC1021yh.m6896(r8)
            return r8
    }

    /* JADX INFO: renamed from: с */
    public static java.util.List m4682(java.lang.String r3, char[] r4, int r5, int r6) {
            r6 = r6 & 4
            r0 = 0
            if (r6 == 0) goto L6
            r5 = r0
        L6:
            r3.getClass()
            int r6 = r4.length
            r1 = 1
            if (r6 != r1) goto L18
            char r4 = r4[r0]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.util.List r3 = m4681(r3, r4, r5)
            return r3
        L18:
            m4680(r5)
            wr r6 = new wr
            cc r0 = new cc
            r2 = 11
            r0.<init>(r2, r4)
            r6.<init>(r3, r5, r0)
            e7 r4 = new e7
            r5 = 2
            r4.<init>(r5, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = p000.AbstractC1021yh.m6889(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            r6 = r4
            vr r6 = (p000.C0920vr) r6
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r6 = r6.next()
            xm0 r6 = (p000.xm0) r6
            r6.getClass()
            int r0 = r6.f11347
            int r6 = r6.f11348
            int r6 = r6 + r1
            java.lang.CharSequence r6 = r3.subSequence(r0, r6)
            java.lang.String r6 = r6.toString()
            r5.add(r6)
            goto L3c
        L5f:
            return r5
    }

    /* JADX INFO: renamed from: т */
    public static java.util.List m4683(java.lang.String r4, java.lang.String[] r5, int r6) {
            r6 = r6 & 4
            r0 = 0
            if (r6 == 0) goto L7
            r6 = r0
            goto L8
        L7:
            r6 = 2
        L8:
            int r1 = r5.length
            r2 = 1
            if (r1 != r2) goto L1a
            r0 = r5[r0]
            int r1 = r0.length()
            if (r1 != 0) goto L15
            goto L1a
        L15:
            java.util.List r4 = m4681(r4, r0, r6)
            return r4
        L1a:
            m4680(r6)
            java.util.List r5 = java.util.Arrays.asList(r5)
            r5.getClass()
            wr r0 = new wr
            cc r1 = new cc
            r3 = 12
            r1.<init>(r3, r5)
            r0.<init>(r4, r6, r1)
            e7 r5 = new e7
            r6 = 2
            r5.<init>(r6, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = p000.AbstractC1021yh.m6889(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L45:
            r0 = r5
            vr r0 = (p000.C0920vr) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r0 = r0.next()
            xm0 r0 = (p000.xm0) r0
            r0.getClass()
            int r1 = r0.f11347
            int r0 = r0.f11348
            int r0 = r0 + r2
            java.lang.CharSequence r0 = r4.subSequence(r1, r0)
            java.lang.String r0 = r0.toString()
            r6.add(r0)
            goto L45
        L68:
            return r6
    }

    /* JADX INFO: renamed from: у */
    public static boolean m4684(java.lang.String r2, char r3) {
            r2.getClass()
            int r0 = r2.length()
            r1 = 0
            if (r0 <= 0) goto L16
            char r2 = r2.charAt(r1)
            boolean r2 = p000.jx0.m3057(r2, r3, r1)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            return r1
    }

    /* JADX INFO: renamed from: ф */
    public static java.lang.String m4685(java.lang.String r2, char r3, java.lang.String r4) {
            r0 = 0
            r1 = 6
            int r3 = m4668(r2, r3, r0, r1)
            r0 = -1
            if (r3 != r0) goto La
            return r4
        La:
            int r3 = r3 + 1
            int r4 = r2.length()
            java.lang.String r2 = r2.substring(r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: х */
    public static java.lang.String m4686(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            r1 = 6
            int r0 = m4669(r2, r3, r0, r0, r1)
            r1 = -1
            if (r0 != r1) goto La
            return r4
        La:
            int r3 = r3.length()
            int r3 = r3 + r0
            int r4 = r2.length()
            java.lang.String r2 = r2.substring(r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ц */
    public static java.lang.String m4687(java.lang.String r2, char r3, java.lang.String r4) {
            r2.getClass()
            r4.getClass()
            r0 = 0
            r1 = 6
            int r3 = m4674(r2, r3, r0, r1)
            r0 = -1
            if (r3 != r0) goto L10
            return r4
        L10:
            int r3 = r3 + 1
            int r4 = r2.length()
            java.lang.String r2 = r2.substring(r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ч */
    public static java.lang.String m4688(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 6
            int r0 = m4673(r0, r2, r3)
            r1 = -1
            if (r0 != r1) goto L9
            return r4
        L9:
            int r3 = r3.length()
            int r3 = r3 + r0
            int r4 = r2.length()
            java.lang.String r2 = r2.substring(r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ш */
    public static java.lang.String m4689(java.lang.String r2, char r3, java.lang.String r4) {
            r2.getClass()
            r4.getClass()
            r0 = 6
            r1 = 0
            int r3 = m4668(r2, r3, r1, r0)
            r0 = -1
            if (r3 != r0) goto L10
            return r4
        L10:
            java.lang.String r2 = r2.substring(r1, r3)
            return r2
    }

    /* JADX INFO: renamed from: щ */
    public static java.lang.String m4690(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r2.getClass()
            r4.getClass()
            r0 = 6
            r1 = 0
            int r3 = m4669(r2, r3, r1, r1, r0)
            r0 = -1
            if (r3 != r0) goto L10
            return r4
        L10:
            java.lang.String r2 = r2.substring(r1, r3)
            return r2
    }

    /* JADX INFO: renamed from: э */
    public static java.lang.String m4691(java.lang.String r3, java.lang.String r4) {
            r3.getClass()
            r4.getClass()
            r0 = 6
            r1 = 46
            r2 = 0
            int r0 = m4674(r3, r1, r2, r0)
            r1 = -1
            if (r0 != r1) goto L12
            return r4
        L12:
            java.lang.String r3 = r3.substring(r2, r0)
            return r3
    }

    /* JADX INFO: renamed from: ю */
    public static java.lang.String m4692(java.lang.String r2) {
            java.lang.String r0 = "."
            r1 = 6
            int r0 = m4673(r1, r2, r0)
            r1 = -1
            if (r0 != r1) goto Lb
            return r2
        Lb:
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            return r2
    }

    /* JADX INFO: renamed from: я */
    public static java.lang.String m4693(java.lang.String r1, int r2) {
            r1.getClass()
            if (r2 < 0) goto L12
            int r0 = r1.length()
            if (r2 <= r0) goto Lc
            r2 = r0
        Lc:
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r2)
            return r1
        L12:
            java.lang.String r1 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r1 = p000.AbstractC0602nx.m4127(r1, r2, r0)
            p000.C1080.m7266(r1)
            r1 = 0
            return r1
    }
}
