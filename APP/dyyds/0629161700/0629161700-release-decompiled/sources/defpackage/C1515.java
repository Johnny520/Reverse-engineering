package defpackage;

/* JADX INFO: renamed from: ᛸᛶᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1515 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object f6689;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f6690;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean f6691;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f6692;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f6693;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Object f6694;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.Object f6695;

    public C1515(defpackage.C0109 r1, boolean r2, defpackage.C0031 r3, defpackage.C1515 r4) {
            r0 = this;
            r0.<init>()
            r0.f6690 = r1
            r0.f6691 = r2
            r0.f6689 = r3
            int r1 = r3.f518
            if (r1 != 0) goto Lf
            r1 = -1
            goto L11
        Lf:
            int r1 = r1 + (-2)
        L11:
            r0.f6692 = r1
            r0.f6694 = r4
            if (r4 == 0) goto L19
            r4.f6695 = r0
        L19:
            return
    }

    public C1515(defpackage.C1606 r10, java.util.ArrayList r11, int[] r12, int[] r13) {
            r9 = this;
            r9.<init>()
            r9.f6690 = r11
            r9.f6689 = r12
            r9.f6694 = r13
            r0 = 0
            java.util.Arrays.fill(r12, r0)
            java.util.Arrays.fill(r13, r0)
            r9.f6695 = r10
            java.lang.Object r1 = r10.f7101
            ᛲᛱᲀᲇ r1 = (defpackage.RunnableC0240) r1
            java.util.List r2 = r1.f1433
            int r2 = r2.size()
            r9.f6692 = r2
            java.util.List r1 = r1.f1432
            int r1 = r1.size()
            r9.f6693 = r1
            r3 = 1
            r9.f6691 = r3
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L31
            r4 = 0
            goto L37
        L31:
            java.lang.Object r4 = r11.get(r0)
            ᛸᛵᛵᛵ r4 = (defpackage.C1488) r4
        L37:
            if (r4 == 0) goto L41
            int r5 = r4.f6576
            if (r5 != 0) goto L41
            int r4 = r4.f6577
            if (r4 == 0) goto L49
        L41:
            ᛸᛵᛵᛵ r4 = new ᛸᛵᛵᛵ
            r4.<init>(r0, r0, r0)
            r11.add(r0, r4)
        L49:
            ᛸᛵᛵᛵ r4 = new ᛸᛵᛵᛵ
            r4.<init>(r2, r1, r0)
            r11.add(r4)
            java.util.Iterator r1 = r11.iterator()
        L55:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r1.next()
            ᛸᛵᛵᛵ r2 = (defpackage.C1488) r2
            r4 = r0
        L62:
            int r5 = r2.f6575
            if (r4 >= r5) goto L55
            int r5 = r2.f6576
            int r5 = r5 + r4
            int r6 = r2.f6577
            int r6 = r6 + r4
            boolean r7 = r10.m2898(r5, r6)
            if (r7 == 0) goto L74
            r7 = r3
            goto L75
        L74:
            r7 = 2
        L75:
            int r8 = r6 << 4
            r8 = r8 | r7
            r12[r5] = r8
            int r5 = r5 << 4
            r5 = r5 | r7
            r13[r6] = r5
            int r4 = r4 + 1
            goto L62
        L82:
            boolean r9 = r9.f6691
            if (r9 == 0) goto Le0
            java.util.Iterator r9 = r11.iterator()
            r1 = r0
        L8b:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Le0
            java.lang.Object r2 = r9.next()
            ᛸᛵᛵᛵ r2 = (defpackage.C1488) r2
        L97:
            int r3 = r2.f6576
            if (r1 >= r3) goto Ldc
            r3 = r12[r1]
            if (r3 != 0) goto Ld9
            int r3 = r11.size()
            r4 = r0
            r5 = r4
        La5:
            if (r4 >= r3) goto Ld9
            java.lang.Object r6 = r11.get(r4)
            ᛸᛵᛵᛵ r6 = (defpackage.C1488) r6
        Lad:
            int r7 = r6.f6577
            if (r5 >= r7) goto Ld3
            r7 = r13[r5]
            if (r7 != 0) goto Ld0
            boolean r7 = r10.m2899(r1, r5)
            if (r7 == 0) goto Ld0
            boolean r3 = r10.m2898(r1, r5)
            if (r3 == 0) goto Lc4
            r3 = 8
            goto Lc5
        Lc4:
            r3 = 4
        Lc5:
            int r4 = r5 << 4
            r4 = r4 | r3
            r12[r1] = r4
            int r4 = r1 << 4
            r3 = r3 | r4
            r13[r5] = r3
            goto Ld9
        Ld0:
            int r5 = r5 + 1
            goto Lad
        Ld3:
            int r5 = r6.f6575
            int r5 = r5 + r7
            int r4 = r4 + 1
            goto La5
        Ld9:
            int r1 = r1 + 1
            goto L97
        Ldc:
            int r1 = r2.f6575
            int r1 = r1 + r3
            goto L8b
        Le0:
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static void m2752(defpackage.C0109 r1, defpackage.C1515 r2, defpackage.C1515 r3, defpackage.C1515 r4, defpackage.C1515 r5, defpackage.C0031 r6) {
            if (r2 == 0) goto Lb
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            int r0 = r1.m605(r0)
            r2.m2763(r0, r6)
        Lb:
            if (r3 == 0) goto L16
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            int r2 = r1.m605(r2)
            r3.m2763(r2, r6)
        L16:
            if (r4 == 0) goto L21
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r2 = r1.m605(r2)
            r4.m2763(r2, r6)
        L21:
            if (r5 == 0) goto L2c
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.m605(r2)
            r5.m2763(r1, r6)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static void m2753(int r6, defpackage.C1515[] r7, int r8, defpackage.C0031 r9) {
            int r0 = r8 * 2
            int r0 = r0 + 1
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r8) goto L19
            r4 = r7[r2]
            if (r4 != 0) goto Lf
            r3 = r1
            goto L15
        Lf:
            int r3 = r4.m2762(r3)
            int r3 = r3 + (-8)
        L15:
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L6
        L19:
            r9.m344(r6)
            r9.m339(r0)
            r9.m347(r8)
            r6 = r1
        L23:
            if (r6 >= r8) goto L51
            r0 = r7[r6]
            r2 = r1
            r4 = r3
        L29:
            if (r0 == 0) goto L38
            r0.m2760()
            int r2 = r2 + 1
            java.lang.Object r4 = r0.f6694
            ᛸᛶᛸᛳ r4 = (defpackage.C1515) r4
            r5 = r4
            r4 = r0
            r0 = r5
            goto L29
        L38:
            r9.m344(r2)
        L3b:
            if (r4 == 0) goto L4e
            java.lang.Object r0 = r4.f6689
            ᛱᛲᛳᛲ r0 = (defpackage.C0031) r0
            byte[] r2 = r0.f520
            int r0 = r0.f518
            r9.m338(r2, r1, r0)
            java.lang.Object r0 = r4.f6695
            r4 = r0
            ᛸᛶᛸᛳ r4 = (defpackage.C1515) r4
            goto L3b
        L4e:
            int r6 = r6 + 1
            goto L23
        L51:
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static defpackage.C1515 m2754(defpackage.C0109 r2, java.lang.String r3, defpackage.C1515 r4) {
            ᛱᛲᛳᛲ r0 = new ᛱᛲᛳᛲ
            r0.<init>()
            int r3 = r2.m605(r3)
            r0.m344(r3)
            r3 = 0
            r0.m344(r3)
            ᛸᛶᛸᛳ r3 = new ᛸᛶᛸᛳ
            r1 = 1
            r3.<init>(r2, r1, r0, r4)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static defpackage.C1515 m2755(defpackage.C0109 r4, int r5, defpackage.C0031 r6, java.lang.String r7, defpackage.C1515 r8) {
            ᛱᛲᛳᛲ r0 = new ᛱᛲᛳᛲ
            r0.<init>()
            int r1 = r5 >>> 24
            r2 = 1
            if (r1 == 0) goto L29
            if (r1 == r2) goto L29
            switch(r1) {
                case 16: goto L1f;
                case 17: goto L1f;
                case 18: goto L1f;
                case 19: goto L1b;
                case 20: goto L1b;
                case 21: goto L1b;
                case 22: goto L29;
                case 23: goto L1f;
                default: goto Lf;
            }
        Lf:
            switch(r1) {
                case 66: goto L1f;
                case 67: goto L1f;
                case 68: goto L1f;
                case 69: goto L1f;
                case 70: goto L1f;
                case 71: goto L17;
                case 72: goto L17;
                case 73: goto L17;
                case 74: goto L17;
                case 75: goto L17;
                default: goto L12;
            }
        L12:
            defpackage.C0086.m557()
            r4 = 0
            return r4
        L17:
            r0.m339(r5)
            goto L2e
        L1b:
            r0.m347(r1)
            goto L2e
        L1f:
            r3 = 16776960(0xffff00, float:2.3509528E-38)
            r5 = r5 & r3
            int r5 = r5 >> 8
            r0.m340(r1, r5)
            goto L2e
        L29:
            int r5 = r5 >>> 16
            r0.m344(r5)
        L2e:
            r5 = 0
            if (r6 != 0) goto L35
            r0.m347(r5)
            goto L41
        L35:
            byte[] r1 = r6.f520
            int r6 = r6.f518
            r3 = r1[r6]
            int r3 = r3 * 2
            int r3 = r3 + r2
            r0.m338(r1, r6, r3)
        L41:
            int r6 = r4.m605(r7)
            r0.m344(r6)
            r0.m344(r5)
            ᛸᛶᛸᛳ r5 = new ᛸᛶᛸᛳ
            r5.<init>(r4, r2, r0, r8)
            return r5
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static int m2756(java.lang.String r4, defpackage.C1515[] r5, int r6) {
            int r0 = r6 * 2
            int r0 = r0 + 7
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r6) goto L18
            r3 = r5[r2]
            if (r3 != 0) goto Le
            r3 = r1
            goto L14
        Le:
            int r3 = r3.m2762(r4)
            int r3 = r3 + (-8)
        L14:
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L6
        L18:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static int m2757(defpackage.C1515 r1, defpackage.C1515 r2, defpackage.C1515 r3, defpackage.C1515 r4) {
            if (r1 == 0) goto L9
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            int r1 = r1.m2762(r0)
            goto La
        L9:
            r1 = 0
        La:
            if (r2 == 0) goto L13
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            int r2 = r2.m2762(r0)
            int r1 = r1 + r2
        L13:
            if (r3 == 0) goto L1c
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r2 = r3.m2762(r2)
            int r1 = r1 + r2
        L1c:
            if (r4 == 0) goto L26
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r2 = r4.m2762(r2)
            int r2 = r2 + r1
            return r2
        L26:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static defpackage.C2088 m2758(java.util.ArrayDeque r2, int r3, boolean r4) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            ᲇᛷᛴᛸ r0 = (defpackage.C2088) r0
            int r1 = r0.f8934
            if (r1 != r3) goto L4
            boolean r1 = r0.f8933
            if (r1 != r4) goto L4
            r2.remove()
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r2.next()
            ᲇᛷᛴᛸ r3 = (defpackage.C2088) r3
            if (r4 == 0) goto L32
            int r1 = r3.f8935
            int r1 = r1 + (-1)
            r3.f8935 = r1
            goto L1d
        L32:
            int r1 = r3.f8935
            int r1 = r1 + 1
            r3.f8935 = r1
            goto L1d
        L39:
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public defpackage.C1515 m2759(java.lang.String r4) {
            r3 = this;
            java.lang.Object r0 = r3.f6690
            ᛱᛶᛲᛲ r0 = (defpackage.C0109) r0
            java.lang.Object r1 = r3.f6689
            ᛱᛲᛳᛲ r1 = (defpackage.C0031) r1
            int r2 = r3.f6693
            int r2 = r2 + 1
            r3.f6693 = r2
            boolean r3 = r3.f6691
            if (r3 == 0) goto L19
            int r3 = r0.m605(r4)
            r1.m344(r3)
        L19:
            r3 = 91
            r4 = 0
            r1.m340(r3, r4)
            ᛸᛶᛸᛳ r3 = new ᛸᛶᛸᛳ
            r2 = 0
            r3.<init>(r0, r4, r1, r2)
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public void m2760() {
            r3 = this;
            r0 = -1
            int r1 = r3.f6692
            if (r1 == r0) goto L17
            java.lang.Object r0 = r3.f6689
            ᛱᛲᛳᛲ r0 = (defpackage.C0031) r0
            byte[] r0 = r0.f520
            int r3 = r3.f6693
            int r2 = r3 >>> 8
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            byte r3 = (byte) r3
            r0[r1] = r3
        L17:
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public void m2761(java.lang.Object r9, java.lang.String r10) {
            r8 = this;
            java.lang.Object r0 = r8.f6690
            ᛱᛶᛲᛲ r0 = (defpackage.C0109) r0
            java.lang.Object r1 = r8.f6689
            ᛱᛲᛳᛲ r1 = (defpackage.C0031) r1
            int r2 = r8.f6693
            int r2 = r2 + 1
            r8.f6693 = r2
            boolean r8 = r8.f6691
            if (r8 == 0) goto L19
            int r8 = r0.m605(r10)
            r1.m344(r8)
        L19:
            boolean r8 = r9 instanceof java.lang.String
            if (r8 == 0) goto L29
            java.lang.String r9 = (java.lang.String) r9
            int r8 = r0.m605(r9)
            r9 = 115(0x73, float:1.61E-43)
            r1.m340(r9, r8)
            return
        L29:
            boolean r8 = r9 instanceof java.lang.Byte
            r10 = 66
            r2 = 3
            if (r8 == 0) goto L40
            java.lang.Byte r9 = (java.lang.Byte) r9
            byte r8 = r9.byteValue()
            ᛷᛲᲁᲀ r8 = r0.m609(r2, r8)
            int r8 = r8.f5529
            r1.m340(r10, r8)
            return
        L40:
            boolean r8 = r9 instanceof java.lang.Boolean
            r3 = 90
            if (r8 == 0) goto L56
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            ᛷᛲᲁᲀ r8 = r0.m609(r2, r8)
            int r8 = r8.f5529
            r1.m340(r3, r8)
            return
        L56:
            boolean r8 = r9 instanceof java.lang.Character
            r4 = 67
            if (r8 == 0) goto L6c
            java.lang.Character r9 = (java.lang.Character) r9
            char r8 = r9.charValue()
            ᛷᛲᲁᲀ r8 = r0.m609(r2, r8)
            int r8 = r8.f5529
            r1.m340(r4, r8)
            return
        L6c:
            boolean r8 = r9 instanceof java.lang.Short
            r5 = 83
            if (r8 == 0) goto L82
            java.lang.Short r9 = (java.lang.Short) r9
            short r8 = r9.shortValue()
            ᛷᛲᲁᲀ r8 = r0.m609(r2, r8)
            int r8 = r8.f5529
            r1.m340(r5, r8)
            return
        L82:
            boolean r8 = r9 instanceof defpackage.C2118
            if (r8 == 0) goto L96
            ᲇᲀᛴᲁ r9 = (defpackage.C2118) r9
            java.lang.String r8 = r9.m3546()
            int r8 = r0.m605(r8)
            r9 = 99
            r1.m340(r9, r8)
            return
        L96:
            boolean r8 = r9 instanceof byte[]
            r6 = 0
            r7 = 91
            if (r8 == 0) goto Lb4
            byte[] r9 = (byte[]) r9
            int r8 = r9.length
            r1.m340(r7, r8)
            int r8 = r9.length
        La4:
            if (r6 >= r8) goto L18a
            r3 = r9[r6]
            ᛷᛲᲁᲀ r3 = r0.m609(r2, r3)
            int r3 = r3.f5529
            r1.m340(r10, r3)
            int r6 = r6 + 1
            goto La4
        Lb4:
            boolean r8 = r9 instanceof boolean[]
            if (r8 == 0) goto Lcf
            boolean[] r9 = (boolean[]) r9
            int r8 = r9.length
            r1.m340(r7, r8)
            int r8 = r9.length
        Lbf:
            if (r6 >= r8) goto L18a
            boolean r10 = r9[r6]
            ᛷᛲᲁᲀ r10 = r0.m609(r2, r10)
            int r10 = r10.f5529
            r1.m340(r3, r10)
            int r6 = r6 + 1
            goto Lbf
        Lcf:
            boolean r8 = r9 instanceof short[]
            if (r8 == 0) goto Lea
            short[] r9 = (short[]) r9
            int r8 = r9.length
            r1.m340(r7, r8)
            int r8 = r9.length
        Lda:
            if (r6 >= r8) goto L18a
            short r10 = r9[r6]
            ᛷᛲᲁᲀ r10 = r0.m609(r2, r10)
            int r10 = r10.f5529
            r1.m340(r5, r10)
            int r6 = r6 + 1
            goto Lda
        Lea:
            boolean r8 = r9 instanceof char[]
            if (r8 == 0) goto L105
            char[] r9 = (char[]) r9
            int r8 = r9.length
            r1.m340(r7, r8)
            int r8 = r9.length
        Lf5:
            if (r6 >= r8) goto L18a
            char r10 = r9[r6]
            ᛷᛲᲁᲀ r10 = r0.m609(r2, r10)
            int r10 = r10.f5529
            r1.m340(r4, r10)
            int r6 = r6 + 1
            goto Lf5
        L105:
            boolean r8 = r9 instanceof int[]
            if (r8 == 0) goto L122
            int[] r9 = (int[]) r9
            int r8 = r9.length
            r1.m340(r7, r8)
            int r8 = r9.length
        L110:
            if (r6 >= r8) goto L18a
            r10 = r9[r6]
            ᛷᛲᲁᲀ r10 = r0.m609(r2, r10)
            int r10 = r10.f5529
            r3 = 73
            r1.m340(r3, r10)
            int r6 = r6 + 1
            goto L110
        L122:
            boolean r8 = r9 instanceof long[]
            if (r8 == 0) goto L140
            long[] r9 = (long[]) r9
            int r8 = r9.length
            r1.m340(r7, r8)
            int r8 = r9.length
        L12d:
            if (r6 >= r8) goto L18a
            r2 = r9[r6]
            r10 = 5
            ᛷᛲᲁᲀ r10 = r0.m607(r2, r10)
            int r10 = r10.f5529
            r2 = 74
            r1.m340(r2, r10)
            int r6 = r6 + 1
            goto L12d
        L140:
            boolean r8 = r9 instanceof float[]
            if (r8 == 0) goto L165
            float[] r9 = (float[]) r9
            int r8 = r9.length
            r1.m340(r7, r8)
            int r8 = r9.length
        L14b:
            if (r6 >= r8) goto L18a
            r10 = r9[r6]
            r0.getClass()
            r2 = 4
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            ᛷᛲᲁᲀ r10 = r0.m609(r2, r10)
            int r10 = r10.f5529
            r2 = 70
            r1.m340(r2, r10)
            int r6 = r6 + 1
            goto L14b
        L165:
            boolean r8 = r9 instanceof double[]
            if (r8 == 0) goto L18b
            double[] r9 = (double[]) r9
            int r8 = r9.length
            r1.m340(r7, r8)
            int r8 = r9.length
        L170:
            if (r6 >= r8) goto L18a
            r2 = r9[r6]
            r0.getClass()
            r10 = 6
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            ᛷᛲᲁᲀ r10 = r0.m607(r2, r10)
            int r10 = r10.f5529
            r2 = 68
            r1.m340(r2, r10)
            int r6 = r6 + 1
            goto L170
        L18a:
            return
        L18b:
            ᛷᛲᲁᲀ r8 = r0.m614(r9)
            java.lang.String r9 = ".s.IFJDCS"
            int r10 = r8.f5530
            char r9 = r9.charAt(r10)
            int r8 = r8.f5529
            r1.m340(r9, r8)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int m2762(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.lang.Object r0 = r1.f6690
            ᛱᛶᛲᛲ r0 = (defpackage.C0109) r0
            r0.m605(r2)
        L9:
            r2 = 8
        Lb:
            if (r1 == 0) goto L19
            java.lang.Object r0 = r1.f6689
            ᛱᛲᛳᛲ r0 = (defpackage.C0031) r0
            int r0 = r0.f518
            int r2 = r2 + r0
            java.lang.Object r1 = r1.f6694
            ᛸᛶᛸᛳ r1 = (defpackage.C1515) r1
            goto Lb
        L19:
            return r2
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public void m2763(int r6, defpackage.C0031 r7) {
            r5 = this;
            r0 = 2
            r1 = 0
            r2 = 0
            r3 = r1
        L4:
            if (r5 == 0) goto L1a
            r5.m2760()
            java.lang.Object r2 = r5.f6689
            ᛱᛲᛳᛲ r2 = (defpackage.C0031) r2
            int r2 = r2.f518
            int r0 = r0 + r2
            int r3 = r3 + 1
            java.lang.Object r2 = r5.f6694
            ᛸᛶᛸᛳ r2 = (defpackage.C1515) r2
            r4 = r2
            r2 = r5
            r5 = r4
            goto L4
        L1a:
            r7.m344(r6)
            r7.m339(r0)
            r7.m344(r3)
        L23:
            if (r2 == 0) goto L36
            java.lang.Object r5 = r2.f6689
            ᛱᛲᛳᛲ r5 = (defpackage.C0031) r5
            byte[] r6 = r5.f520
            int r5 = r5.f518
            r7.m338(r6, r1, r5)
            java.lang.Object r5 = r2.f6695
            r2 = r5
            ᛸᛶᛸᛳ r2 = (defpackage.C1515) r2
            goto L23
        L36:
            return
    }
}
