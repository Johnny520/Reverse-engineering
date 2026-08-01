package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yw1 implements java.lang.Iterable, p000.lo0 {

    /* JADX INFO: renamed from: ι */
    public static final p000.yw1 f12861 = null;

    /* JADX INFO: renamed from: ε */
    public final long f12862;

    /* JADX INFO: renamed from: ζ */
    public final long f12863;

    /* JADX INFO: renamed from: η */
    public final long f12864;

    /* JADX INFO: renamed from: θ */
    public final long[] f12865;

    static {
            yw1 r0 = new yw1
            r5 = 0
            r7 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r3, r5, r7)
            p000.yw1.f12861 = r0
            return
    }

    public yw1(long r1, long r3, long r5, long[] r7) {
            r0 = this;
            r0.<init>()
            r0.f12862 = r1
            r0.f12863 = r3
            r0.f12864 = r5
            r0.f12865 = r7
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            xw1 r0 = new xw1
            r1 = 0
            r0.<init>(r2, r1)
            ts1 r2 = p000.e81.m1879(r0)
            return r2
    }

    public final java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r9, r2)
            r1.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L20:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r9.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.add(r2)
            goto L20
        L38:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = ""
            r9.append(r2)
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L48:
            if (r4 >= r3) goto L7c
            java.lang.Object r6 = r1.get(r4)
            r7 = 1
            int r5 = r5 + r7
            if (r5 <= r7) goto L57
            java.lang.String r8 = ", "
            r9.append(r8)
        L57:
            if (r6 != 0) goto L5a
            goto L5c
        L5a:
            boolean r7 = r6 instanceof java.lang.CharSequence
        L5c:
            if (r7 == 0) goto L64
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r9.append(r6)
            goto L79
        L64:
            boolean r7 = r6 instanceof java.lang.Character
            if (r7 == 0) goto L72
            java.lang.Character r6 = (java.lang.Character) r6
            char r6 = r6.charValue()
            r9.append(r6)
            goto L79
        L72:
            java.lang.String r6 = r6.toString()
            r9.append(r6)
        L79:
            int r4 = r4 + 1
            goto L48
        L7c:
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r0.append(r9)
            r9 = 93
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
    }

    /* JADX INFO: renamed from: α */
    public final p000.yw1 m7044(p000.yw1 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            yw1 r2 = p000.yw1.f12861
            if (r1 != r2) goto L9
            return r0
        L9:
            if (r0 != r2) goto Lc
            return r2
        Lc:
            long r2 = r1.f12864
            long r4 = r1.f12864
            long[] r6 = r1.f12865
            long r7 = r1.f12863
            long r9 = r1.f12862
            long r11 = r0.f12864
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 != 0) goto L34
            long[] r1 = r0.f12865
            if (r6 != r1) goto L34
            r16 = r11
            yw1 r11 = new yw1
            long r2 = r0.f12862
            long r4 = ~r9
            long r12 = r2 & r4
            long r2 = r0.f12863
            long r4 = ~r7
            long r14 = r2 & r4
            r18 = r1
            r11.<init>(r12, r14, r16, r18)
            return r11
        L34:
            r1 = 0
            if (r6 == 0) goto L44
            int r2 = r6.length
            r3 = r1
        L39:
            if (r3 >= r2) goto L44
            r11 = r6[r3]
            yw1 r0 = r0.m7045(r11)
            int r3 = r3 + 1
            goto L39
        L44:
            r2 = 0
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r11 = 1
            r13 = 64
            if (r6 == 0) goto L61
            r6 = r1
        L4f:
            if (r6 >= r13) goto L61
            long r14 = r11 << r6
            long r14 = r14 & r7
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L5e
            long r14 = (long) r6
            long r14 = r14 + r4
            yw1 r0 = r0.m7045(r14)
        L5e:
            int r6 = r6 + 1
            goto L4f
        L61:
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 == 0) goto L79
        L65:
            if (r1 >= r13) goto L79
            long r6 = r11 << r1
            long r6 = r6 & r9
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L76
            long r6 = (long) r1
            long r6 = r6 + r4
            long r14 = (long) r13
            long r6 = r6 + r14
            yw1 r0 = r0.m7045(r6)
        L76:
            int r1 = r1 + 1
            goto L65
        L79:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final p000.yw1 m7045(long r14) {
            r13 = this;
            long r0 = r13.f12864
            long r0 = r14 - r0
            r2 = 0
            long r3 = (long) r2
            int r5 = p000.ln0.m3633(r0, r3)
            r6 = 0
            r8 = 1
            r10 = 64
            if (r5 < 0) goto L33
            long r11 = (long) r10
            int r5 = p000.ln0.m3633(r0, r11)
            if (r5 >= 0) goto L33
            int r14 = (int) r0
            long r14 = r8 << r14
            long r0 = r13.f12863
            long r2 = r0 & r14
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L91
            yw1 r3 = new yw1
            long r14 = ~r14
            long r6 = r0 & r14
            long r8 = r13.f12864
            long[] r10 = r13.f12865
            long r4 = r13.f12862
            r3.<init>(r4, r6, r8, r10)
            return r3
        L33:
            long r11 = (long) r10
            int r5 = p000.ln0.m3633(r0, r11)
            if (r5 < 0) goto L5e
            r5 = 128(0x80, float:1.8E-43)
            long r11 = (long) r5
            int r5 = p000.ln0.m3633(r0, r11)
            if (r5 >= 0) goto L5e
            int r14 = (int) r0
            int r14 = r14 - r10
            long r14 = r8 << r14
            long r0 = r13.f12862
            long r2 = r0 & r14
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L91
            yw1 r3 = new yw1
            long r14 = ~r14
            long r4 = r0 & r14
            long r8 = r13.f12864
            long[] r10 = r13.f12865
            long r6 = r13.f12863
            r3.<init>(r4, r6, r8, r10)
            return r3
        L5e:
            int r0 = p000.ln0.m3633(r0, r3)
            if (r0 >= 0) goto L91
            long[] r0 = r13.f12865
            if (r0 == 0) goto L91
            int r14 = p000.i81.m2657(r14, r0)
            if (r14 < 0) goto L91
            yw1 r3 = new yw1
            int r15 = r0.length
            int r1 = r15 + (-1)
            if (r1 != 0) goto L78
            r14 = 0
            r10 = r14
            goto L87
        L78:
            long[] r4 = new long[r1]
            if (r14 <= 0) goto L7f
            p000.AbstractC0312g7.m2237(r0, r4, r2, r2, r14)
        L7f:
            if (r14 >= r1) goto L86
            int r1 = r14 + 1
            p000.AbstractC0312g7.m2237(r0, r4, r14, r1, r15)
        L86:
            r10 = r4
        L87:
            long r4 = r13.f12862
            long r6 = r13.f12863
            long r8 = r13.f12864
            r3.<init>(r4, r6, r8, r10)
            return r3
        L91:
            return r13
    }

    /* JADX INFO: renamed from: γ */
    public final boolean m7046(long r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            long r3 = r0.f12864
            long r3 = r1 - r3
            r5 = 0
            long r6 = (long) r5
            int r8 = p000.ln0.m3633(r3, r6)
            r11 = 1
            r13 = 1
            r14 = 64
            r15 = 0
            if (r8 < 0) goto L2b
            long r9 = (long) r14
            int r8 = p000.ln0.m3633(r3, r9)
            if (r8 >= 0) goto L2b
            int r1 = (int) r3
            long r1 = r11 << r1
            long r3 = r0.f12863
            long r0 = r1 & r3
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L2a
            return r13
        L2a:
            return r5
        L2b:
            long r8 = (long) r14
            int r8 = p000.ln0.m3633(r3, r8)
            if (r8 < 0) goto L49
            r8 = 128(0x80, float:1.8E-43)
            long r8 = (long) r8
            int r8 = p000.ln0.m3633(r3, r8)
            if (r8 >= 0) goto L49
            int r1 = (int) r3
            int r1 = r1 - r14
            long r1 = r11 << r1
            long r3 = r0.f12862
            long r0 = r1 & r3
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L48
            return r13
        L48:
            return r5
        L49:
            int r3 = p000.ln0.m3633(r3, r6)
            if (r3 <= 0) goto L50
            return r5
        L50:
            long[] r0 = r0.f12865
            if (r0 == 0) goto L5b
            int r0 = p000.i81.m2657(r1, r0)
            if (r0 < 0) goto L5b
            return r13
        L5b:
            return r5
    }

    /* JADX INFO: renamed from: δ */
    public final p000.yw1 m7047(p000.yw1 r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            yw1 r2 = p000.yw1.f12861
            if (r1 != r2) goto L9
            return r0
        L9:
            if (r0 != r2) goto Lc
            return r1
        Lc:
            long r2 = r1.f12864
            long r4 = r1.f12864
            long[] r6 = r1.f12865
            long r7 = r1.f12863
            long r9 = r1.f12862
            long r11 = r0.f12864
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            long r13 = r0.f12863
            r3 = r2
            long r1 = r0.f12862
            if (r3 != 0) goto L33
            long[] r3 = r0.f12865
            if (r6 != r3) goto L33
            r16 = r11
            yw1 r11 = new yw1
            r14 = r13
            long r12 = r1 | r9
            long r14 = r14 | r7
            r18 = r3
            r11.<init>(r12, r14, r16, r18)
            return r11
        L33:
            r14 = r13
            r3 = 64
            r13 = 0
            r16 = 0
            r18 = 1
            long[] r11 = r0.f12865
            if (r11 != 0) goto L86
            if (r11 == 0) goto L50
            int r4 = r11.length
            r5 = r21
            r6 = r13
        L45:
            if (r6 >= r4) goto L52
            r7 = r11[r6]
            yw1 r5 = r5.m7048(r7)
            int r6 = r6 + 1
            goto L45
        L50:
            r5 = r21
        L52:
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            long r6 = r0.f12864
            if (r4 == 0) goto L6c
            r0 = r13
        L59:
            if (r0 >= r3) goto L6c
            long r8 = r18 << r0
            long r8 = r8 & r14
            int r4 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r4 == 0) goto L69
            long r8 = (long) r0
            long r8 = r8 + r6
            yw1 r4 = r5.m7048(r8)
            r5 = r4
        L69:
            int r0 = r0 + 1
            goto L59
        L6c:
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 == 0) goto L85
        L70:
            if (r13 >= r3) goto L85
            long r8 = r18 << r13
            long r8 = r8 & r1
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 == 0) goto L82
            long r8 = (long) r13
            long r8 = r8 + r6
            long r10 = (long) r3
            long r8 = r8 + r10
            yw1 r0 = r5.m7048(r8)
            r5 = r0
        L82:
            int r13 = r13 + 1
            goto L70
        L85:
            return r5
        L86:
            if (r6 == 0) goto L95
            int r1 = r6.length
            r2 = r13
        L8a:
            if (r2 >= r1) goto L95
            r11 = r6[r2]
            yw1 r0 = r0.m7048(r11)
            int r2 = r2 + 1
            goto L8a
        L95:
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lac
            r1 = r13
        L9a:
            if (r1 >= r3) goto Lac
            long r11 = r18 << r1
            long r11 = r11 & r7
            int r2 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r2 == 0) goto La9
            long r11 = (long) r1
            long r11 = r11 + r4
            yw1 r0 = r0.m7048(r11)
        La9:
            int r1 = r1 + 1
            goto L9a
        Lac:
            int r1 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc4
        Lb0:
            if (r13 >= r3) goto Lc4
            long r1 = r18 << r13
            long r1 = r1 & r9
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            long r1 = (long) r13
            long r1 = r1 + r4
            long r6 = (long) r3
            long r1 = r1 + r6
            yw1 r0 = r0.m7048(r1)
        Lc1:
            int r13 = r13 + 1
            goto Lb0
        Lc4:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final p000.yw1 m7048(long r30) {
            r29 = this;
            r0 = r29
            r1 = r30
            long r3 = r0.f12864
            long r5 = r1 - r3
            r7 = 0
            long r8 = (long) r7
            int r10 = p000.ln0.m3633(r5, r8)
            long r11 = r0.f12863
            r15 = 64
            r16 = 0
            r18 = 1
            if (r10 < 0) goto L3a
            long r13 = (long) r15
            int r10 = p000.ln0.m3633(r5, r13)
            if (r10 >= 0) goto L3a
            int r1 = (int) r5
            long r1 = r18 << r1
            long r3 = r11 & r1
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 != 0) goto L1ab
            yw1 r13 = new yw1
            long r16 = r11 | r1
            long r1 = r0.f12864
            long[] r3 = r0.f12865
            long r14 = r0.f12862
            r18 = r1
            r20 = r3
            r13.<init>(r14, r16, r18, r20)
            return r13
        L3a:
            long r13 = (long) r15
            int r10 = p000.ln0.m3633(r5, r13)
            r21 = r8
            long r7 = r0.f12862
            r9 = 128(0x80, float:1.8E-43)
            r23 = r3
            if (r10 < 0) goto L6a
            long r3 = (long) r9
            int r3 = p000.ln0.m3633(r5, r3)
            if (r3 >= 0) goto L6a
            int r1 = (int) r5
            int r1 = r1 - r15
            long r1 = r18 << r1
            long r3 = r7 & r1
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 != 0) goto L1ab
            yw1 r9 = new yw1
            long r10 = r7 | r1
            long r14 = r0.f12864
            long[] r1 = r0.f12865
            long r12 = r0.f12863
            r16 = r1
            r9.<init>(r10, r12, r14, r16)
            return r9
        L6a:
            long r3 = (long) r9
            int r5 = p000.ln0.m3633(r5, r3)
            long[] r6 = r0.f12865
            r9 = 1
            if (r5 < 0) goto L171
            boolean r5 = r29.m7046(r30)
            if (r5 != 0) goto L1ab
            long r9 = (long) r9
            long r25 = r1 + r9
            long r25 = r25 / r13
            r27 = r3
            long r3 = r25 * r13
            r25 = r7
            r7 = r21
            int r0 = p000.ln0.m3633(r3, r7)
            if (r0 >= 0) goto L95
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r3 = r3 - r27
            long r3 = r3 + r9
        L95:
            r7 = r23
            r22 = r25
            r5 = 0
        L9a:
            int r9 = p000.ln0.m3633(r7, r3)
            if (r9 >= 0) goto L13b
            int r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r9 == 0) goto L123
            if (r5 != 0) goto L107
            y21 r5 = new y21
            r5.<init>()
            if (r6 == 0) goto Lf9
            int r9 = r6.length
            long[] r9 = java.util.Arrays.copyOf(r6, r9)
            q11 r10 = new q11
            r29 = 0
            int r0 = r9.length
            r10.<init>(r0)
            int r0 = r10.f8794
            if (r0 < 0) goto Lf3
            int r15 = r9.length
            if (r15 != 0) goto Lc4
            r24 = r3
            goto L104
        Lc4:
            int r15 = r9.length
            int r15 = r15 + r0
            r24 = r3
            long[] r3 = r10.f8793
            int r4 = r3.length
            if (r4 >= r15) goto Ldc
            int r4 = r3.length
            int r4 = r4 * 3
            int r4 = r4 / 2
            int r4 = java.lang.Math.max(r15, r4)
            long[] r3 = java.util.Arrays.copyOf(r3, r4)
            r10.f8793 = r3
        Ldc:
            long[] r3 = r10.f8793
            int r4 = r10.f8794
            if (r0 == r4) goto Le7
            int r15 = r9.length
            int r15 = r15 + r0
            p000.AbstractC0312g7.m2237(r3, r3, r15, r0, r4)
        Le7:
            int r4 = r9.length
            r15 = 0
            p000.AbstractC0312g7.m2237(r9, r3, r0, r15, r4)
            int r0 = r10.f8794
            int r3 = r9.length
            int r0 = r0 + r3
            r10.f8794 = r0
            goto L104
        Lf3:
            java.lang.String r0 = ""
            p000.C1080.m7269(r0)
            throw r29
        Lf9:
            r24 = r3
            r29 = 0
            q11 r10 = new q11
            r0 = 16
            r10.<init>(r0)
        L104:
            r5.f12428 = r10
            goto L10b
        L107:
            r24 = r3
            r29 = 0
        L10b:
            r0 = 0
            r3 = 64
        L10e:
            if (r0 >= r3) goto L128
            long r9 = r18 << r0
            long r9 = r9 & r11
            int r4 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r4 == 0) goto L120
            long r9 = (long) r0
            long r9 = r9 + r7
            java.lang.Object r4 = r5.f12428
            q11 r4 = (p000.q11) r4
            r4.m4709(r9)
        L120:
            int r0 = r0 + 1
            goto L10e
        L123:
            r24 = r3
            r3 = r15
            r29 = 0
        L128:
            int r0 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r0 != 0) goto L131
            r26 = r24
            r24 = r16
            goto L141
        L131:
            long r7 = r7 + r13
            r15 = r3
            r11 = r22
            r3 = r24
            r22 = r16
            goto L9a
        L13b:
            r29 = 0
            r26 = r7
            r24 = r11
        L141:
            yw1 r21 = new yw1
            if (r5 == 0) goto L165
            java.lang.Object r0 = r5.f12428
            q11 r0 = (p000.q11) r0
            int r3 = r0.f8794
            if (r3 != 0) goto L150
            r0 = r29
            goto L15f
        L150:
            long[] r4 = new long[r3]
            long[] r0 = r0.f8793
            r7 = 0
        L155:
            if (r7 >= r3) goto L15e
            r8 = r0[r7]
            r4[r7] = r8
            int r7 = r7 + 1
            goto L155
        L15e:
            r0 = r4
        L15f:
            if (r0 != 0) goto L162
            goto L165
        L162:
            r28 = r0
            goto L167
        L165:
            r28 = r6
        L167:
            r21.<init>(r22, r24, r26, r28)
            r0 = r21
            yw1 r0 = r0.m7048(r1)
            return r0
        L171:
            if (r6 != 0) goto L186
            r2 = r1
            yw1 r1 = new yw1
            long[] r8 = new long[r9]
            r20 = 0
            r8[r20] = r2
            long r2 = r0.f12862
            long r4 = r0.f12863
            long r6 = r0.f12864
            r1.<init>(r2, r4, r6, r8)
            return r1
        L186:
            r2 = r1
            int r1 = p000.i81.m2657(r2, r6)
            if (r1 >= 0) goto L1ab
            int r1 = r1 + r9
            int r1 = -r1
            int r4 = r6.length
            int r5 = r4 + 1
            long[] r14 = new long[r5]
            r15 = 0
            p000.AbstractC0312g7.m2237(r6, r14, r15, r15, r1)
            int r5 = r1 + 1
            p000.AbstractC0312g7.m2237(r6, r14, r5, r1, r4)
            r14[r1] = r2
            yw1 r7 = new yw1
            long r10 = r0.f12863
            long r12 = r0.f12864
            long r8 = r0.f12862
            r7.<init>(r8, r10, r12, r14)
            return r7
        L1ab:
            return r0
    }
}
