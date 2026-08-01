package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rw1 {

    /* JADX INFO: renamed from: α */
    public final p000.ow1 f9538;

    /* JADX INFO: renamed from: β */
    public int[] f9539;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object[] f9540;

    /* JADX INFO: renamed from: δ */
    public java.util.ArrayList f9541;

    /* JADX INFO: renamed from: ε */
    public java.util.HashMap f9542;

    /* JADX INFO: renamed from: ζ */
    public p000.n11 f9543;

    /* JADX INFO: renamed from: η */
    public int f9544;

    /* JADX INFO: renamed from: θ */
    public int f9545;

    /* JADX INFO: renamed from: ι */
    public int f9546;

    /* JADX INFO: renamed from: κ */
    public int f9547;

    /* JADX INFO: renamed from: λ */
    public int f9548;

    /* JADX INFO: renamed from: μ */
    public int f9549;

    /* JADX INFO: renamed from: ν */
    public int f9550;

    /* JADX INFO: renamed from: ξ */
    public int f9551;

    /* JADX INFO: renamed from: ο */
    public int f9552;

    /* JADX INFO: renamed from: π */
    public final p000.cn0 f9553;

    /* JADX INFO: renamed from: ρ */
    public final p000.cn0 f9554;

    /* JADX INFO: renamed from: σ */
    public final p000.cn0 f9555;

    /* JADX INFO: renamed from: τ */
    public p000.n11 f9556;

    /* JADX INFO: renamed from: υ */
    public int f9557;

    /* JADX INFO: renamed from: φ */
    public int f9558;

    /* JADX INFO: renamed from: χ */
    public int f9559;

    /* JADX INFO: renamed from: ψ */
    public boolean f9560;

    /* JADX INFO: renamed from: ω */
    public p000.m11 f9561;

    public rw1(p000.ow1 r4) {
            r3 = this;
            r3.<init>()
            r3.f9538 = r4
            int[] r0 = r4.f8286
            r3.f9539 = r0
            java.lang.Object[] r1 = r4.f8288
            r3.f9540 = r1
            java.util.ArrayList r2 = r4.f8294
            r3.f9541 = r2
            java.util.HashMap r2 = r4.f8295
            r3.f9542 = r2
            n11 r2 = r4.f8296
            r3.f9543 = r2
            int r2 = r4.f8287
            r3.f9544 = r2
            int r0 = r0.length
            int r0 = r0 / 5
            int r0 = r0 - r2
            r3.f9545 = r0
            int r4 = r4.f8289
            r3.f9548 = r4
            int r0 = r1.length
            int r0 = r0 - r4
            r3.f9549 = r0
            r3.f9550 = r2
            cn0 r4 = new cn0
            r4.<init>()
            r3.f9553 = r4
            cn0 r4 = new cn0
            r4.<init>()
            r3.f9554 = r4
            cn0 r4 = new cn0
            r4.<init>()
            r3.f9555 = r4
            r3.f9558 = r2
            r4 = -1
            r3.f9559 = r4
            return
    }

    /* JADX INFO: renamed from: Β */
    public static void m5127(p000.rw1 r6) {
            int r0 = r6.f9559
            int r1 = r6.m5167(r0)
            int[] r2 = r6.f9539
            int r1 = r1 * 5
            int r1 = r1 + 1
            r3 = r2[r1]
            r4 = 134217728(0x8000000, float:3.85186E-34)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            goto L21
        L15:
            r5 = -134217729(0xfffffffff7ffffff, float:-1.0384593E34)
            r3 = r3 & r5
            r3 = r3 | r4
            r2[r1] = r3
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r3
            if (r1 == 0) goto L22
        L21:
            return
        L22:
            int r0 = r6.m5134(r0, r2)
            r6.m5149(r0)
            return
    }

    /* JADX INFO: renamed from: ι */
    public static int m5128(int r0, int r1, int r2, int r3) {
            if (r0 <= r1) goto L7
            int r3 = r3 - r2
            int r3 = r3 - r0
            int r3 = r3 + 1
            int r0 = -r3
        L7:
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SlotWriter(current = "
            r0.<init>(r1)
            int r1 = r2.f9557
            r0.append(r1)
            java.lang.String r1 = " end="
            r0.append(r1)
            int r1 = r2.f9558
            r0.append(r1)
            java.lang.String r1 = " size = "
            r0.append(r1)
            int r1 = r2.m5165()
            r0.append(r1)
            java.lang.String r1 = " gap="
            r0.append(r1)
            int r1 = r2.f9544
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            int r1 = r2.f9544
            int r2 = r2.f9545
            int r1 = r1 + r2
            r0.append(r1)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: Α */
    public final boolean m5129(int r2) {
            r1 = this;
            int[] r0 = r1.f9539
            int r1 = r1.m5167(r2)
            int r1 = r1 * 5
            r2 = 1
            int r1 = r1 + r2
            r1 = r0[r1]
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 == 0) goto L12
            return r2
        L12:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: Γ */
    public final void m5130(p000.ow1 r16, int r17) {
            r15 = this;
            r0 = r16
            int r1 = r15.f9551
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "Check failed"
            p000.AbstractC0804sn.m5526(r1)
        Lc:
            r7 = 0
            if (r17 != 0) goto L62
            int r1 = r15.f9557
            if (r1 != 0) goto L62
            ow1 r1 = r15.f9538
            int r1 = r1.f8287
            if (r1 != 0) goto L62
            int[] r1 = r0.f8286
            int r2 = r17 * 5
            int r2 = r2 + 3
            r2 = r1[r2]
            int r4 = r0.f8287
            if (r2 != r4) goto L62
            int[] r2 = r15.f9539
            java.lang.Object[] r5 = r15.f9540
            java.util.ArrayList r6 = r15.f9541
            java.util.HashMap r8 = r15.f9542
            n11 r9 = r15.f9543
            java.lang.Object[] r10 = r0.f8288
            int r11 = r0.f8289
            java.util.HashMap r12 = r0.f8295
            n11 r13 = r0.f8296
            r15.f9539 = r1
            r15.f9540 = r10
            java.util.ArrayList r14 = r0.f8294
            r15.f9541 = r14
            r15.f9544 = r4
            int r1 = r1.length
            int r1 = r1 / 5
            int r1 = r1 - r4
            r15.f9545 = r1
            r15.f9548 = r11
            int r1 = r10.length
            int r1 = r1 - r11
            r15.f9549 = r1
            r15.f9550 = r4
            r15.f9542 = r12
            r15.f9543 = r13
            r0.f8286 = r2
            r0.f8287 = r7
            r0.f8288 = r5
            r0.f8289 = r7
            r0.f8294 = r6
            r0.f8295 = r8
            r0.f8296 = r9
            return
        L62:
            rw1 r1 = r0.m4303()
            r4 = 1
            r5 = 1
            r6 = 0
            r3 = r15
            r2 = r17
            p000.v71.m6041(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L74
            r0 = 1
            r1.m5155(r0)
            return
        L74:
            r0 = move-exception
            r1.m5155(r7)
            throw r0
    }

    /* JADX INFO: renamed from: Δ */
    public final void m5131(int r9) {
            r8 = this;
            int r0 = r8.f9545
            int r1 = r8.f9544
            if (r1 == r9) goto Lab
            java.util.ArrayList r2 = r8.f9541
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L59
            int r2 = r8.f9545
            int r3 = r8.m5164()
            int r3 = r3 - r2
            java.util.ArrayList r2 = r8.f9541
            if (r1 >= r9) goto L39
            int r2 = p000.qw1.m4945(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r8.f9541
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.f9541
            java.lang.Object r4 = r4.get(r2)
            q80 r4 = (p000.q80) r4
            int r5 = r4.f8904
            if (r5 >= 0) goto L59
            int r5 = r5 + r3
            if (r5 >= r9) goto L59
            r4.f8904 = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            int r2 = p000.qw1.m4945(r2, r9, r3)
        L3d:
            java.util.ArrayList r4 = r8.f9541
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.f9541
            java.lang.Object r4 = r4.get(r2)
            q80 r4 = (p000.q80) r4
            int r5 = r4.f8904
            if (r5 < 0) goto L59
            int r5 = r3 - r5
            int r5 = -r5
            r4.f8904 = r5
            int r2 = r2 + 1
            goto L3d
        L59:
            if (r0 <= 0) goto L70
            int[] r2 = r8.f9539
            int r3 = r9 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            if (r9 >= r1) goto L6a
            int r4 = r4 + r3
            p000.AbstractC0312g7.m2235(r4, r3, r5, r2, r2)
            goto L70
        L6a:
            int r6 = r5 + r4
            int r3 = r3 + r4
            p000.AbstractC0312g7.m2235(r5, r6, r3, r2, r2)
        L70:
            if (r9 >= r1) goto L74
            int r1 = r9 + r0
        L74:
            int r2 = r8.m5164()
            if (r1 >= r2) goto L7b
            goto L80
        L7b:
            java.lang.String r3 = "Check failed"
            p000.AbstractC0804sn.m5526(r3)
        L80:
            if (r1 >= r2) goto Lab
            int[] r3 = r8.f9539
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            r5 = -2
            if (r3 <= r5) goto L8f
            r6 = r3
            goto L95
        L8f:
            int r6 = r8.m5165()
            int r6 = r6 + r3
            int r6 = r6 - r5
        L95:
            if (r6 >= r9) goto L98
            goto L9f
        L98:
            int r7 = r8.m5165()
            int r7 = r7 - r6
            int r7 = r7 - r5
            int r6 = -r7
        L9f:
            if (r6 == r3) goto La5
            int[] r3 = r8.f9539
            r3[r4] = r6
        La5:
            int r1 = r1 + 1
            if (r1 != r9) goto L80
            int r1 = r1 + r0
            goto L80
        Lab:
            r8.f9544 = r9
            return
    }

    /* JADX INFO: renamed from: Ε */
    public final void m5132(int r8, int r9) {
            r7 = this;
            int r0 = r7.f9549
            int r1 = r7.f9548
            int r2 = r7.f9550
            if (r1 == r8) goto L1b
            java.lang.Object[] r3 = r7.f9540
            if (r8 >= r1) goto L13
            int r4 = r8 + r0
            int r1 = r1 - r8
            java.lang.System.arraycopy(r3, r8, r3, r4, r1)
            goto L1b
        L13:
            int r4 = r1 + r0
            int r5 = r8 + r0
            int r5 = r5 - r4
            java.lang.System.arraycopy(r3, r4, r3, r1, r5)
        L1b:
            int r9 = r9 + 1
            int r1 = r7.m5165()
            int r9 = java.lang.Math.min(r9, r1)
            if (r2 == r9) goto L87
            java.lang.Object[] r1 = r7.f9540
            int r1 = r1.length
            int r1 = r1 - r0
            if (r9 >= r2) goto L5a
            int r0 = r7.m5167(r9)
            int r2 = r7.m5167(r2)
            int r3 = r7.f9544
        L37:
            if (r0 >= r2) goto L85
            int[] r4 = r7.f9539
            int r5 = r0 * 5
            int r5 = r5 + 4
            r4 = r4[r5]
            if (r4 < 0) goto L44
            goto L49
        L44:
            java.lang.String r6 = "Unexpected anchor value, expected a positive anchor"
            p000.AbstractC0804sn.m5526(r6)
        L49:
            int[] r6 = r7.f9539
            int r4 = r1 - r4
            int r4 = r4 + 1
            int r4 = -r4
            r6[r5] = r4
            int r0 = r0 + 1
            if (r0 != r3) goto L37
            int r4 = r7.f9545
            int r0 = r0 + r4
            goto L37
        L5a:
            int r0 = r7.m5167(r2)
            int r2 = r7.m5167(r9)
        L62:
            if (r0 >= r2) goto L85
            int[] r3 = r7.f9539
            int r4 = r0 * 5
            int r4 = r4 + 4
            r3 = r3[r4]
            if (r3 >= 0) goto L6f
            goto L74
        L6f:
            java.lang.String r5 = "Unexpected anchor value, expected a negative anchor"
            p000.AbstractC0804sn.m5526(r5)
        L74:
            int[] r5 = r7.f9539
            int r3 = r3 + r1
            int r3 = r3 + 1
            r5[r4] = r3
            int r0 = r0 + 1
            int r3 = r7.f9544
            if (r0 != r3) goto L62
            int r3 = r7.f9545
            int r0 = r0 + r3
            goto L62
        L85:
            r7.f9550 = r9
        L87:
            r7.f9548 = r8
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public final java.lang.Object m5133(int r4) {
            r3 = this;
            int r4 = r3.m5167(r4)
            int[] r0 = r3.f9539
            int r1 = r4 * 5
            int r1 = r1 + 1
            r1 = r0[r1]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L1e
            java.lang.Object[] r1 = r3.f9540
            int r4 = r3.m5157(r4, r0)
            int r3 = r3.m5158(r4)
            r3 = r1[r3]
            return r3
        L1e:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: Η */
    public final int m5134(int r1, int[] r2) {
            r0 = this;
            int r1 = r0.m5167(r1)
            int r1 = r1 * 5
            int r1 = r1 + 2
            r1 = r2[r1]
            r2 = -2
            if (r1 <= r2) goto Le
            return r1
        Le:
            int r0 = r0.m5165()
            int r0 = r0 + r1
            int r0 = r0 - r2
            return r0
    }

    /* JADX INFO: renamed from: Θ */
    public final java.lang.Object m5135(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f9551
            r1 = 1
            if (r0 <= 0) goto La
            int r0 = r4.f9559
            r4.m5173(r1, r0)
        La:
            java.lang.Object[] r0 = r4.f9540
            int r2 = r4.f9546
            int r3 = r2 + 1
            r4.f9546 = r3
            int r2 = r4.m5158(r2)
            r0 = r0[r2]
            int r2 = r4.f9546
            int r3 = r4.f9547
            if (r2 > r3) goto L1f
            goto L24
        L1f:
            java.lang.String r2 = "Writing to an invalid slot"
            p000.AbstractC0804sn.m5526(r2)
        L24:
            java.lang.Object[] r2 = r4.f9540
            int r3 = r4.f9546
            int r3 = r3 - r1
            int r4 = r4.m5158(r3)
            r2[r4] = r5
            return r0
    }

    /* JADX INFO: renamed from: Ι */
    public final void m5136() {
            r9 = this;
            m11 r0 = r9.f9561
            if (r0 == 0) goto L56
        L4:
            int r1 = r0.f6888
            if (r1 == 0) goto L56
            int r1 = p000.e81.m1888(r0)
            int r2 = r9.m5167(r1)
            int r3 = r1 + 1
            int r4 = r9.m5170(r1)
            int r4 = r4 + r1
        L17:
            r5 = 0
            r6 = 1
            if (r3 >= r4) goto L33
            int[] r7 = r9.f9539
            int r8 = r9.m5167(r3)
            int r8 = r8 * 5
            int r8 = r8 + r6
            r7 = r7[r8]
            r8 = 201326592(0xc000000, float:9.8607613E-32)
            r7 = r7 & r8
            if (r7 == 0) goto L2d
            r3 = r6
            goto L34
        L2d:
            int r5 = r9.m5170(r3)
            int r3 = r3 + r5
            goto L17
        L33:
            r3 = r5
        L34:
            int[] r4 = r9.f9539
            int r2 = r2 * 5
            int r2 = r2 + r6
            r7 = r4[r2]
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            r8 = r8 & r7
            if (r8 == 0) goto L41
            r5 = r6
        L41:
            if (r5 == r3) goto L4
            r5 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            r5 = r5 & r7
            int r3 = r3 << 26
            r3 = r3 | r5
            r4[r2] = r3
            int r1 = r9.m5134(r1, r4)
            if (r1 < 0) goto L4
            p000.e81.m1871(r0, r1)
            goto L4
        L56:
            return
    }

    /* JADX INFO: renamed from: Κ */
    public final boolean m5137() {
            r7 = this;
            int r0 = r7.f9551
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Cannot remove group while inserting"
            p000.AbstractC0804sn.m5526(r0)
        La:
            int r0 = r7.f9557
            int r1 = r7.f9546
            int[] r2 = r7.f9539
            int r3 = r7.m5167(r0)
            int r2 = r7.m5157(r3, r2)
            int r3 = r7.m5141()
            int r4 = r7.f9559
            r7.m5144(r4)
            m11 r4 = r7.f9561
            if (r4 == 0) goto L3e
        L25:
            int r5 = r4.f6888
            if (r5 == 0) goto L3e
            if (r5 == 0) goto L36
            int[] r5 = r4.f6887
            r6 = 0
            r5 = r5[r6]
            if (r5 < r0) goto L3e
            p000.e81.m1888(r4)
            goto L25
        L36:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r0 = "IntList is empty."
            r7.<init>(r0)
            throw r7
        L3e:
            int r4 = r7.f9557
            int r4 = r4 - r0
            boolean r4 = r7.m5138(r0, r4)
            int r5 = r7.f9546
            int r5 = r5 - r2
            int r6 = r0 + (-1)
            r7.m5139(r2, r5, r6)
            r7.f9557 = r0
            r7.f9546 = r1
            int r0 = r7.f9552
            int r0 = r0 - r3
            r7.f9552 = r0
            return r4
    }

    /* JADX INFO: renamed from: Λ */
    public final boolean m5138(int r10, int r11) {
            r9 = this;
            r0 = 0
            if (r11 <= 0) goto L93
            java.util.ArrayList r1 = r9.f9541
            r9.m5131(r10)
            boolean r1 = r1.isEmpty()
            r2 = 1
            if (r1 != 0) goto L61
            java.util.HashMap r1 = r9.f9542
            int r3 = r9.f9545
            int r4 = r10 + r11
            int r5 = r9.m5164()
            int r5 = r5 - r3
            java.util.ArrayList r3 = r9.f9541
            int r3 = p000.qw1.m4945(r3, r4, r5)
            java.util.ArrayList r5 = r9.f9541
            int r5 = r5.size()
            if (r3 < r5) goto L2a
            int r3 = r3 + (-1)
        L2a:
            int r5 = r3 + 1
            r6 = r0
        L2d:
            if (r3 < 0) goto L53
            java.util.ArrayList r7 = r9.f9541
            java.lang.Object r7 = r7.get(r3)
            q80 r7 = (p000.q80) r7
            int r8 = r9.m5153(r7)
            if (r8 < r10) goto L53
            if (r8 >= r4) goto L50
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.f8904 = r5
            if (r1 == 0) goto L4b
            java.lang.Object r5 = r1.remove(r7)
            x80 r5 = (p000.x80) r5
        L4b:
            if (r6 != 0) goto L4f
            int r6 = r3 + 1
        L4f:
            r5 = r3
        L50:
            int r3 = r3 + (-1)
            goto L2d
        L53:
            if (r5 >= r6) goto L56
            r0 = r2
        L56:
            if (r0 == 0) goto L61
            java.util.ArrayList r1 = r9.f9541
            java.util.List r1 = r1.subList(r5, r6)
            r1.clear()
        L61:
            r9.f9544 = r10
            int r1 = r9.f9545
            int r1 = r1 + r11
            r9.f9545 = r1
            int r1 = r9.f9550
            if (r1 <= r10) goto L73
            int r1 = r1 - r11
            int r10 = java.lang.Math.max(r10, r1)
            r9.f9550 = r10
        L73:
            int r10 = r9.f9558
            int r1 = r9.f9544
            if (r10 < r1) goto L7c
            int r10 = r10 - r11
            r9.f9558 = r10
        L7c:
            int r10 = r9.f9559
            if (r10 < 0) goto L93
            int[] r11 = r9.f9539
            int r1 = r9.m5167(r10)
            int r1 = r1 * 5
            int r1 = r1 + r2
            r11 = r11[r1]
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r11 = r11 & r1
            if (r11 == 0) goto L93
            r9.m5149(r10)
        L93:
            return r0
    }

    /* JADX INFO: renamed from: Μ */
    public final void m5139(int r3, int r4, int r5) {
            r2 = this;
            if (r4 <= 0) goto L1b
            int r0 = r2.f9549
            int r1 = r3 + r4
            r2.m5132(r1, r5)
            r2.f9548 = r3
            int r0 = r0 + r4
            r2.f9549 = r0
            java.lang.Object[] r5 = r2.f9540
            r0 = 0
            java.util.Arrays.fill(r5, r3, r1, r0)
            int r5 = r2.f9547
            if (r5 < r3) goto L1b
            int r5 = r5 - r4
            r2.f9547 = r5
        L1b:
            return
    }

    /* JADX INFO: renamed from: Ν */
    public final java.lang.Object m5140(int r4, int r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.m5167(r4)
            int[] r1 = r3.f9539
            int r0 = r3.m5143(r0, r1)
            int[] r1 = r3.f9539
            int r2 = r4 + 1
            int r2 = r3.m5167(r2)
            int r1 = r3.m5157(r2, r1)
            int r2 = r0 + r5
            if (r2 < r0) goto L1d
            if (r2 >= r1) goto L1d
            goto L36
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Write to an invalid slot index "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " for group "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            p000.AbstractC0804sn.m5526(r4)
        L36:
            int r4 = r3.m5158(r2)
            java.lang.Object[] r3 = r3.f9540
            r5 = r3[r4]
            r3[r4] = r6
            return r5
    }

    /* JADX INFO: renamed from: Ξ */
    public final int m5141() {
            r4 = this;
            int r0 = r4.f9557
            int r0 = r4.m5167(r0)
            int r1 = r4.f9557
            int[] r2 = r4.f9539
            int r0 = r0 * 5
            int r3 = r0 + 3
            r3 = r2[r3]
            int r3 = r3 + r1
            r4.f9557 = r3
            int r1 = r4.m5167(r3)
            int r1 = r4.m5157(r1, r2)
            r4.f9546 = r1
            int[] r4 = r4.f9539
            r1 = 1
            int r0 = r0 + r1
            r4 = r4[r0]
            r0 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r4
            if (r0 == 0) goto L29
            return r1
        L29:
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r4 = r4 & r0
            return r4
    }

    /* JADX INFO: renamed from: Ο */
    public final void m5142() {
            r2 = this;
            int r0 = r2.f9558
            r2.f9557 = r0
            int[] r1 = r2.f9539
            int r0 = r2.m5167(r0)
            int r0 = r2.m5157(r0, r1)
            r2.f9546 = r0
            return
    }

    /* JADX INFO: renamed from: Π */
    public final int m5143(int r2, int[] r3) {
            r1 = this;
            int r0 = r1.m5164()
            if (r2 < r0) goto Ld
            java.lang.Object[] r2 = r1.f9540
            int r2 = r2.length
            int r1 = r1.f9549
            int r2 = r2 - r1
            return r2
        Ld:
            int r2 = p000.qw1.m4946(r2, r3)
            int r3 = r1.f9549
            java.lang.Object[] r1 = r1.f9540
            int r1 = r1.length
            if (r2 >= 0) goto L1d
            int r1 = r1 - r3
            int r1 = r1 + r2
            int r1 = r1 + 1
            return r1
        L1d:
            return r2
    }

    /* JADX INFO: renamed from: Ρ */
    public final p000.x80 m5144(int r3) {
            r2 = this;
            java.util.HashMap r0 = r2.f9542
            r1 = 0
            if (r0 == 0) goto L12
            q80 r2 = r2.m5147(r3)
            if (r2 == 0) goto L12
            java.lang.Object r2 = r0.get(r2)
            x80 r2 = (p000.x80) r2
            return r2
        L12:
            return r1
    }

    /* JADX INFO: renamed from: Σ */
    public final void m5145() {
            r2 = this;
            int r0 = r2.f9551
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Key must be supplied when inserting"
            p000.AbstractC0804sn.m5526(r0)
        La:
            i2 r0 = p000.C0730qn.f9051
            r1 = 0
            r2.m5146(r1, r0, r0, r1)
            return
    }

    /* JADX INFO: renamed from: Τ */
    public final void m5146(int r12, java.lang.Object r13, java.lang.Object r14, boolean r15) {
            r11 = this;
            int r0 = r11.f9559
            int r1 = r11.f9551
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto La
            r1 = r3
            goto Lb
        La:
            r1 = r2
        Lb:
            cn0 r4 = r11.f9555
            int r5 = r11.f9552
            r4.m1269(r5)
            i2 r4 = p000.C0730qn.f9051
            if (r1 == 0) goto La4
            int r1 = r11.f9557
            int[] r5 = r11.f9539
            int r6 = r11.m5167(r1)
            int r5 = r11.m5157(r6, r5)
            r11.m5172(r3)
            r11.f9546 = r5
            r11.f9547 = r5
            int r6 = r11.m5167(r1)
            if (r13 == r4) goto L31
            r7 = r3
            goto L32
        L31:
            r7 = r2
        L32:
            if (r15 != 0) goto L38
            if (r14 == r4) goto L38
            r4 = r3
            goto L39
        L38:
            r4 = r2
        L39:
            int r8 = r11.f9549
            int r9 = r11.f9548
            java.lang.Object[] r10 = r11.f9540
            int r10 = r10.length
            int r5 = m5128(r5, r9, r8, r10)
            if (r5 < 0) goto L53
            int r8 = r11.f9550
            if (r8 >= r1) goto L53
            java.lang.Object[] r8 = r11.f9540
            int r8 = r8.length
            int r9 = r11.f9549
            int r8 = r8 - r9
            int r8 = r8 - r5
            int r8 = r8 + r3
            int r5 = -r8
        L53:
            int[] r3 = r11.f9539
            int r8 = r11.f9559
            int r6 = r6 * 5
            r3[r6] = r12
            int r12 = r6 + 1
            int r9 = r15 << 30
            int r10 = r7 << 29
            r9 = r9 | r10
            int r10 = r4 << 28
            r9 = r9 | r10
            r3[r12] = r9
            int r12 = r6 + 2
            r3[r12] = r8
            int r12 = r6 + 3
            r3[r12] = r2
            int r6 = r6 + 4
            r3[r6] = r5
            int r12 = r15 + r7
            int r12 = r12 + r4
            if (r12 <= 0) goto L96
            r11.m5173(r12, r1)
            java.lang.Object[] r12 = r11.f9540
            int r3 = r11.f9546
            if (r15 == 0) goto L86
            int r15 = r3 + 1
            r12[r3] = r14
            r3 = r15
        L86:
            if (r7 == 0) goto L8d
            int r15 = r3 + 1
            r12[r3] = r13
            r3 = r15
        L8d:
            if (r4 == 0) goto L94
            int r13 = r3 + 1
            r12[r3] = r14
            r3 = r13
        L94:
            r11.f9546 = r3
        L96:
            r11.f9552 = r2
            int r12 = r1 + 1
            r11.f9559 = r1
            r11.f9557 = r12
            if (r0 < 0) goto Lff
            r11.m5144(r0)
            goto Lff
        La4:
            cn0 r12 = r11.f9553
            r12.m1269(r0)
            int r12 = r11.m5164()
            int r13 = r11.f9545
            int r12 = r12 - r13
            int r13 = r11.f9558
            int r12 = r12 - r13
            cn0 r13 = r11.f9554
            r13.m1269(r12)
            int r12 = r11.f9557
            int r13 = r11.m5167(r12)
            boolean r0 = p000.ln0.m3626(r14, r4)
            if (r0 != 0) goto Lcf
            if (r15 == 0) goto Lcc
            int r15 = r11.f9557
            r11.m5150(r15, r14)
            goto Lcf
        Lcc:
            r11.m5148(r14)
        Lcf:
            int[] r14 = r11.f9539
            int r14 = r11.m5143(r13, r14)
            r11.f9546 = r14
            int[] r14 = r11.f9539
            int r15 = r11.f9557
            int r15 = r15 + r3
            int r15 = r11.m5167(r15)
            int r14 = r11.m5157(r15, r14)
            r11.f9547 = r14
            int[] r14 = r11.f9539
            int r13 = r13 * 5
            int r15 = r13 + 1
            r15 = r14[r15]
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r15 = r15 & r0
            r11.f9552 = r15
            r11.f9559 = r12
            int r15 = r12 + 1
            r11.f9557 = r15
            int r13 = r13 + 3
            r13 = r14[r13]
            int r12 = r12 + r13
        Lff:
            r11.f9558 = r12
            return
    }

    /* JADX INFO: renamed from: Υ */
    public final p000.q80 m5147(int r3) {
            r2 = this;
            r0 = 0
            if (r3 < 0) goto L1c
            int r1 = r2.m5165()
            if (r3 >= r1) goto L1c
            java.util.ArrayList r1 = r2.f9541
            int r2 = r2.m5165()
            int r2 = p000.qw1.m4949(r1, r3, r2)
            if (r2 < 0) goto L1c
            java.lang.Object r2 = r1.get(r2)
            q80 r2 = (p000.q80) r2
            return r2
        L1c:
            return r0
    }

    /* JADX INFO: renamed from: Φ */
    public final void m5148(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f9557
            int r0 = r4.m5167(r0)
            int[] r1 = r4.f9539
            int r2 = r0 * 5
            int r2 = r2 + 1
            r1 = r1[r2]
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r1 = r1 & r3
            if (r1 == 0) goto L14
            goto L19
        L14:
            java.lang.String r1 = "Updating the data of a group that was not created with a data slot"
            p000.AbstractC0804sn.m5526(r1)
        L19:
            java.lang.Object[] r1 = r4.f9540
            int[] r3 = r4.f9539
            int r0 = r4.m5157(r0, r3)
            r2 = r3[r2]
            int r2 = r2 >> 29
            int r2 = java.lang.Integer.bitCount(r2)
            int r2 = r2 + r0
            int r4 = r4.m5158(r2)
            r1[r4] = r5
            return
    }

    /* JADX INFO: renamed from: Χ */
    public final void m5149(int r2) {
            r1 = this;
            if (r2 < 0) goto L10
            m11 r0 = r1.f9561
            if (r0 != 0) goto Ld
            m11 r0 = new m11
            r0.<init>()
            r1.f9561 = r0
        Ld:
            p000.e81.m1871(r0, r2)
        L10:
            return
    }

    /* JADX INFO: renamed from: Ψ */
    public final void m5150(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.m5167(r4)
            int[] r1 = r3.f9539
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            int r2 = r2 + 1
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L2b
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " that was not created with as a node group"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            p000.AbstractC0804sn.m5526(r4)
        L2b:
            java.lang.Object[] r4 = r3.f9540
            int[] r1 = r3.f9539
            int r0 = r3.m5157(r0, r1)
            int r3 = r3.m5158(r0)
            r4[r3] = r5
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m5151(int r3) {
            r2 = this;
            if (r3 < 0) goto L3
            goto L8
        L3:
            java.lang.String r0 = "Cannot seek backwards"
            p000.AbstractC0804sn.m5526(r0)
        L8:
            int r0 = r2.f9551
            if (r0 > 0) goto Ld
            goto L12
        Ld:
            java.lang.String r0 = "Cannot call seek() while inserting"
            p000.pi1.m4545(r0)
        L12:
            if (r3 != 0) goto L15
            return
        L15:
            int r0 = r2.f9557
            int r0 = r0 + r3
            int r3 = r2.f9559
            if (r0 < r3) goto L21
            int r3 = r2.f9558
            if (r0 > r3) goto L21
            goto L43
        L21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot seek outside the current group ("
            r3.<init>(r1)
            int r1 = r2.f9559
            r3.append(r1)
            r1 = 45
            r3.append(r1)
            int r1 = r2.f9558
            r3.append(r1)
            r1 = 41
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            p000.AbstractC0804sn.m5526(r3)
        L43:
            r2.f9557 = r0
            int[] r3 = r2.f9539
            int r0 = r2.m5167(r0)
            int r3 = r2.m5157(r0, r3)
            r2.f9546 = r3
            r2.f9547 = r3
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.q80 m5152(int r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.f9541
            int r1 = r4.m5165()
            int r1 = p000.qw1.m4949(r0, r5, r1)
            if (r1 >= 0) goto L23
            q80 r2 = new q80
            int r3 = r4.f9544
            if (r5 > r3) goto L13
            goto L19
        L13:
            int r4 = r4.m5165()
            int r4 = r4 - r5
            int r5 = -r4
        L19:
            r2.<init>(r5)
            int r1 = r1 + 1
            int r4 = -r1
            r0.add(r4, r2)
            return r2
        L23:
            java.lang.Object r4 = r0.get(r1)
            q80 r4 = (p000.q80) r4
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public final int m5153(p000.q80 r1) {
            r0 = this;
            int r1 = r1.f8904
            if (r1 >= 0) goto La
            int r0 = r0.m5165()
            int r0 = r0 + r1
            return r0
        La:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final void m5154() {
            r2 = this;
            int r0 = r2.f9551
            int r1 = r0 + 1
            r2.f9551 = r1
            if (r0 != 0) goto L17
            int r0 = r2.m5164()
            int r1 = r2.f9545
            int r0 = r0 - r1
            int r1 = r2.f9558
            int r0 = r0 - r1
            cn0 r2 = r2.f9554
            r2.m1269(r0)
        L17:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m5155(boolean r8) {
            r7 = this;
            r0 = 1
            r7.f9560 = r0
            if (r8 == 0) goto L2b
            cn0 r8 = r7.f9553
            int r8 = r8.f2211
            if (r8 != 0) goto L2b
            int r8 = r7.m5165()
            r7.m5131(r8)
            java.lang.Object[] r8 = r7.f9540
            int r8 = r8.length
            int r0 = r7.f9549
            int r8 = r8 - r0
            int r0 = r7.f9544
            r7.m5132(r8, r0)
            int r8 = r7.f9548
            int r0 = r7.f9549
            int r0 = r0 + r8
            java.lang.Object[] r1 = r7.f9540
            r2 = 0
            java.util.Arrays.fill(r1, r8, r0, r2)
            r7.m5136()
        L2b:
            int[] r8 = r7.f9539
            int r0 = r7.f9544
            java.lang.Object[] r1 = r7.f9540
            int r2 = r7.f9548
            java.util.ArrayList r3 = r7.f9541
            java.util.HashMap r4 = r7.f9542
            n11 r5 = r7.f9543
            ow1 r7 = r7.f9538
            boolean r6 = r7.f8292
            if (r6 == 0) goto L40
            goto L45
        L40:
            java.lang.String r6 = "Unexpected writer close()"
            p000.pi1.m4544(r6)
        L45:
            r6 = 0
            r7.f8292 = r6
            r7.f8286 = r8
            r7.f8287 = r0
            r7.f8288 = r1
            r7.f8289 = r2
            r7.f8294 = r3
            r7.f8295 = r4
            r7.f8296 = r5
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final int m5156(int r2) {
            r1 = this;
            int[] r0 = r1.f9539
            int r2 = r1.m5167(r2)
            int r1 = r1.m5157(r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: η */
    public final int m5157(int r2, int[] r3) {
            r1 = this;
            int r0 = r1.m5164()
            if (r2 < r0) goto Ld
            java.lang.Object[] r2 = r1.f9540
            int r2 = r2.length
            int r1 = r1.f9549
            int r2 = r2 - r1
            return r2
        Ld:
            int r2 = r2 * 5
            int r2 = r2 + 4
            r2 = r3[r2]
            int r3 = r1.f9549
            java.lang.Object[] r1 = r1.f9540
            int r1 = r1.length
            if (r2 >= 0) goto L1f
            int r1 = r1 - r3
            int r1 = r1 + r2
            int r1 = r1 + 1
            return r1
        L1f:
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public final int m5158(int r2) {
            r1 = this;
            int r0 = r1.f9549
            int r1 = r1.f9548
            if (r2 >= r1) goto L8
            r1 = 0
            goto L9
        L8:
            r1 = 1
        L9:
            int r0 = r0 * r1
            int r0 = r0 + r2
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final void m5159() {
            r14 = this;
            int r0 = r14.f9551
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r3 = r14.f9557
            int r4 = r14.f9558
            int r5 = r14.f9559
            int r6 = r14.m5167(r5)
            int r7 = r14.f9552
            int r8 = r3 - r5
            int[] r9 = r14.f9539
            int r10 = r6 * 5
            int r11 = r10 + 1
            r9 = r9[r11]
            r12 = 1073741824(0x40000000, float:2.0)
            r9 = r9 & r12
            if (r9 == 0) goto L26
            r9 = r2
            goto L27
        L26:
            r9 = r1
        L27:
            cn0 r13 = r14.f9555
            if (r0 == 0) goto L81
            n11 r0 = r14.f9556
            if (r0 == 0) goto L4c
            java.lang.Object r3 = r0.m5525(r5)
            v11 r3 = (p000.v11) r3
            if (r3 == 0) goto L4c
            java.lang.Object[] r4 = r3.f11064
            int r3 = r3.f11065
            r11 = r1
        L3c:
            if (r11 >= r3) goto L46
            r12 = r4[r11]
            r14.m5135(r12)
            int r11 = r11 + 1
            goto L3c
        L46:
            java.lang.Object r0 = r0.m3941(r5)
            v11 r0 = (p000.v11) r0
        L4c:
            int[] r0 = r14.f9539
            int r10 = r10 + 3
            r0[r10] = r8
            p000.qw1.m4947(r6, r7, r0)
            int r0 = r13.m1268()
            if (r9 == 0) goto L5c
            r7 = r2
        L5c:
            int r0 = r0 + r7
            r14.f9552 = r0
            int[] r0 = r14.f9539
            int r0 = r14.m5134(r5, r0)
            r14.f9559 = r0
            if (r0 >= 0) goto L6e
            int r0 = r14.m5165()
            goto L73
        L6e:
            int r0 = r0 + r2
            int r0 = r14.m5167(r0)
        L73:
            if (r0 >= 0) goto L76
            goto L7c
        L76:
            int[] r1 = r14.f9539
            int r1 = r14.m5157(r0, r1)
        L7c:
            r14.f9546 = r1
            r14.f9547 = r1
            return
        L81:
            if (r3 != r4) goto L84
            goto L89
        L84:
            java.lang.String r0 = "Expected to be at the end of a group"
            p000.AbstractC0804sn.m5526(r0)
        L89:
            int[] r0 = r14.f9539
            int r10 = r10 + 3
            r3 = r0[r10]
            r4 = r0[r11]
            r11 = 67108863(0x3ffffff, float:1.5046327E-36)
            r4 = r4 & r11
            r0[r10] = r8
            p000.qw1.m4947(r6, r7, r0)
            cn0 r0 = r14.f9553
            int r0 = r0.m1268()
            int r6 = r14.m5164()
            int r10 = r14.f9545
            int r6 = r6 - r10
            cn0 r10 = r14.f9554
            int r10 = r10.m1268()
            int r6 = r6 - r10
            r14.f9558 = r6
            r14.f9559 = r0
            int[] r6 = r14.f9539
            int r5 = r14.m5134(r5, r6)
            int r6 = r13.m1268()
            r14.f9552 = r6
            if (r5 != r0) goto Lc9
            if (r9 == 0) goto Lc3
            goto Lc5
        Lc3:
            int r1 = r7 - r4
        Lc5:
            int r6 = r6 + r1
            r14.f9552 = r6
            return
        Lc9:
            int r8 = r8 - r3
            if (r9 == 0) goto Lce
            r7 = r1
            goto Lcf
        Lce:
            int r7 = r7 - r4
        Lcf:
            if (r8 != 0) goto Ld3
            if (r7 == 0) goto L10a
        Ld3:
            if (r5 == 0) goto L10a
            if (r5 == r0) goto L10a
            if (r7 != 0) goto Ldb
            if (r8 == 0) goto L10a
        Ldb:
            int r3 = r14.m5167(r5)
            if (r8 == 0) goto Lec
            int[] r4 = r14.f9539
            int r6 = r3 * 5
            int r6 = r6 + 3
            r9 = r4[r6]
            int r9 = r9 + r8
            r4[r6] = r9
        Lec:
            if (r7 == 0) goto Lfa
            int[] r4 = r14.f9539
            int r6 = r3 * 5
            int r6 = r6 + r2
            r6 = r4[r6]
            r6 = r6 & r11
            int r6 = r6 + r7
            p000.qw1.m4947(r3, r6, r4)
        Lfa:
            int[] r4 = r14.f9539
            int r3 = r3 * 5
            int r3 = r3 + r2
            r3 = r4[r3]
            r3 = r3 & r12
            if (r3 == 0) goto L105
            r7 = r1
        L105:
            int r5 = r14.m5134(r5, r4)
            goto Ld3
        L10a:
            int r0 = r14.f9552
            int r0 = r0 + r7
            r14.f9552 = r0
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m5160() {
            r2 = this;
            int r0 = r2.f9551
            if (r0 <= 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Unbalanced begin/end insert"
            p000.pi1.m4545(r0)
        La:
            int r0 = r2.f9551
            int r0 = r0 + (-1)
            r2.f9551 = r0
            if (r0 != 0) goto L32
            cn0 r0 = r2.f9555
            int r0 = r0.f2211
            cn0 r1 = r2.f9553
            int r1 = r1.f2211
            if (r0 != r1) goto L1d
            goto L22
        L1d:
            java.lang.String r0 = "startGroup/endGroup mismatch while inserting"
            p000.AbstractC0804sn.m5526(r0)
        L22:
            int r0 = r2.m5164()
            int r1 = r2.f9545
            int r0 = r0 - r1
            cn0 r1 = r2.f9554
            int r1 = r1.m1268()
            int r0 = r0 - r1
            r2.f9558 = r0
        L32:
            return
    }

    /* JADX INFO: renamed from: μ */
    public final void m5161(int r5) {
            r4 = this;
            int r0 = r4.f9551
            r1 = 0
            r2 = 1
            if (r0 > 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "Cannot call ensureStarted() while inserting"
            p000.AbstractC0804sn.m5526(r0)
        L10:
            int r0 = r4.f9559
            if (r0 == r5) goto L47
            if (r5 < r0) goto L1b
            int r3 = r4.f9558
            if (r5 >= r3) goto L1b
            r1 = r2
        L1b:
            if (r1 != 0) goto L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Started group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " must be a subgroup of the group at "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.AbstractC0804sn.m5526(r0)
        L36:
            int r0 = r4.f9557
            int r1 = r4.f9546
            int r2 = r4.f9547
            r4.f9557 = r5
            r4.m5145()
            r4.f9557 = r0
            r4.f9546 = r1
            r4.f9547 = r2
        L47:
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m5162(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.f9544
            if (r3 >= r0) goto L5
            goto Ld
        L5:
            int r0 = r2.m5165()
            int r0 = r0 - r3
            int r0 = r0 + 2
            int r3 = -r0
        Ld:
            if (r5 >= r4) goto L2f
            int[] r0 = r2.f9539
            int r1 = r2.m5167(r5)
            int r1 = r1 * 5
            int r1 = r1 + 2
            r0[r1] = r3
            int[] r0 = r2.f9539
            int r1 = r2.m5167(r5)
            int r1 = r1 * 5
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r5
            int r1 = r5 + 1
            r2.m5162(r5, r0, r1)
            r5 = r0
            goto Ld
        L2f:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final void m5163(int r20, p000.e80 r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = r0.f9539
            int r3 = r0.m5134(r1, r3)
            int r4 = r0.m5165()
            int r5 = r19.m5170(r20)
            int r5 = r5 + r1
            r7 = r1
            r8 = 0
            r9 = 0
        L18:
            if (r7 >= r5) goto L14b
            int r10 = r0.m5156(r7)
            int r11 = r7 + 1
            int r12 = r0.m5156(r11)
        L24:
            if (r10 >= r12) goto La4
            int r14 = r0.m5158(r10)
            java.lang.Object[] r15 = r0.f9540
            r14 = r15[r14]
            boolean r15 = r14 instanceof p000.a90
            if (r15 == 0) goto L8a
            r15 = r14
            a90 r15 = (p000.a90) r15
            boolean r6 = r15 instanceof p000.a90
            if (r6 == 0) goto L3a
            goto L3b
        L3a:
            r15 = 0
        L3b:
            if (r15 == 0) goto L8d
            int r6 = r15.f146
            if (r6 < 0) goto L8a
            int r14 = r0.m5170(r7)
            int r14 = r14 + r7
            r15 = r11
            r13 = 0
        L48:
            if (r15 >= r14) goto L6e
            if (r13 >= r6) goto L6e
            int r16 = r0.m5167(r15)
            r17 = r3
            int[] r3 = r0.f9539
            int r16 = r16 * 5
            int r18 = r16 + 3
            r18 = r3[r18]
            int r15 = r18 + r15
            if (r15 >= r14) goto L6b
            int r16 = r16 + 1
            r3 = r3[r16]
            r16 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 & r16
            if (r3 == 0) goto L69
            goto L6b
        L69:
            int r13 = r13 + 1
        L6b:
            r3 = r17
            goto L48
        L6e:
            r17 = r3
            if (r8 != 0) goto L79
            int[] r3 = p000.an0.f333
            o11 r8 = new o11
            r8.<init>()
        L79:
            if (r9 != 0) goto L80
            m11 r9 = new m11
            r9.<init>()
        L80:
            r8.m4151(r15)
            r9.m3701(r15)
            r9.m3701(r10)
            goto L9f
        L8a:
            r17 = r3
            goto L98
        L8d:
            java.lang.String r0 = "Inconsistent composition"
            p000.AbstractC0804sn.m5527(r0)
            pm r0 = new pm
            r0.<init>()
            throw r0
        L98:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2.invoke(r3, r14)
        L9f:
            int r10 = r10 + 1
            r3 = r17
            goto L24
        La4:
            r17 = r3
            if (r11 >= r4) goto Laf
            int[] r3 = r0.f9539
            int r3 = r0.m5134(r11, r3)
            goto Lb0
        Laf:
            r3 = -1
        Lb0:
            if (r3 == r7) goto L142
            r6 = r17
        Lb4:
            if (r9 == 0) goto L12e
            if (r8 == 0) goto L12e
            boolean r10 = r8.m4155(r7)
            if (r10 == 0) goto L12e
            int r10 = r9.f6888
            int r12 = r10 / 2
            r14 = 0
            r15 = 0
        Lc4:
            if (r14 >= r12) goto L102
            int r13 = r14 * 2
            r17 = r4
            int r4 = r9.m3702(r13)
            if (r4 != r7) goto Le6
            int r13 = r13 + 1
            int r4 = r9.m3702(r13)
            java.lang.Object[] r13 = r0.f9540
            int r18 = r0.m5158(r4)
            r13 = r13[r18]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.invoke(r4, r13)
            goto Lfb
        Le6:
            if (r13 == r15) goto Lf9
            int r2 = r15 + 1
            r9.m3704(r15, r4)
            int r15 = r15 + 2
            int r13 = r13 + 1
            int r4 = r9.m3702(r13)
            r9.m3704(r2, r4)
            goto Lfb
        Lf9:
            int r15 = r15 + 2
        Lfb:
            int r14 = r14 + 1
            r2 = r21
            r4 = r17
            goto Lc4
        L102:
            r17 = r4
            if (r15 == r10) goto L130
            if (r15 < 0) goto L128
            int r2 = r9.f6888
            if (r15 > r2) goto L128
            if (r10 < 0) goto L128
            if (r10 > r2) goto L128
            if (r10 < r15) goto L122
            if (r10 == r15) goto L130
            if (r10 >= r2) goto L11b
            int[] r4 = r9.f6887
            p000.AbstractC0312g7.m2235(r15, r10, r2, r4, r4)
        L11b:
            int r2 = r9.f6888
            int r10 = r10 - r15
            int r2 = r2 - r10
            r9.f6888 = r2
            goto L130
        L122:
            java.lang.String r0 = "The end index must be < start index"
            p000.C1080.m7275(r0)
            return
        L128:
            java.lang.String r0 = "Index must be between 0 and size"
            p000.C1080.m7269(r0)
            return
        L12e:
            r17 = r4
        L130:
            if (r7 == r1) goto L144
            if (r6 == r3) goto L144
            int[] r2 = r0.f9539
            int r2 = r0.m5134(r6, r2)
            r7 = r6
            r4 = r17
            r6 = r2
            r2 = r21
            goto Lb4
        L142:
            r17 = r4
        L144:
            r2 = r21
            r7 = r11
            r4 = r17
            goto L18
        L14b:
            return
    }

    /* JADX INFO: renamed from: ο */
    public final int m5164() {
            r0 = this;
            int[] r0 = r0.f9539
            int r0 = r0.length
            int r0 = r0 / 5
            return r0
    }

    /* JADX INFO: renamed from: π */
    public final int m5165() {
            r1 = this;
            int r0 = r1.m5164()
            int r1 = r1.f9545
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public final java.lang.Object m5166(int r5) {
            r4 = this;
            int r5 = r4.m5167(r5)
            int[] r0 = r4.f9539
            int r1 = r5 * 5
            int r1 = r1 + 1
            r2 = r0[r1]
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2 = r2 & r3
            if (r2 == 0) goto L23
            java.lang.Object[] r2 = r4.f9540
            int r4 = r4.m5157(r5, r0)
            r5 = r0[r1]
            int r5 = r5 >> 29
            int r5 = java.lang.Integer.bitCount(r5)
            int r5 = r5 + r4
            r4 = r2[r5]
            return r4
        L23:
            i2 r4 = p000.C0730qn.f9051
            return r4
    }

    /* JADX INFO: renamed from: σ */
    public final int m5167(int r2) {
            r1 = this;
            int r0 = r1.f9545
            int r1 = r1.f9544
            if (r2 >= r1) goto L8
            r1 = 0
            goto L9
        L8:
            r1 = 1
        L9:
            int r0 = r0 * r1
            int r0 = r0 + r2
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public final int m5168(int r2) {
            r1 = this;
            int[] r0 = r1.f9539
            int r1 = r1.m5167(r2)
            int r1 = r1 * 5
            r1 = r0[r1]
            return r1
    }

    /* JADX INFO: renamed from: υ */
    public final java.lang.Object m5169(int r4) {
            r3 = this;
            int r4 = r3.m5167(r4)
            int[] r0 = r3.f9539
            int r4 = r4 * 5
            int r1 = r4 + 1
            r1 = r0[r1]
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r1
            if (r2 == 0) goto L21
            java.lang.Object[] r3 = r3.f9540
            int r4 = r4 + 4
            r4 = r0[r4]
            int r0 = r1 >> 30
            int r0 = java.lang.Integer.bitCount(r0)
            int r0 = r0 + r4
            r3 = r3[r0]
            return r3
        L21:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: φ */
    public final int m5170(int r2) {
            r1 = this;
            int[] r0 = r1.f9539
            int r1 = r1.m5167(r2)
            int r1 = r1 * 5
            int r1 = r1 + 3
            r1 = r0[r1]
            return r1
    }

    /* JADX INFO: renamed from: χ */
    public final boolean m5171(int r6, int r7) {
            r5 = this;
            int r0 = r5.f9559
            r1 = 0
            if (r7 != r0) goto L8
            int r5 = r5.f9558
            goto L41
        L8:
            cn0 r0 = r5.f9553
            int r2 = r0.m1267(r1)
            if (r7 <= r2) goto L16
            int r5 = r5.m5170(r7)
        L14:
            int r5 = r5 + r7
            goto L41
        L16:
            int[] r2 = r0.f2210
            int r3 = r2.length
            int r0 = r0.f2211
            int r0 = java.lang.Math.min(r3, r0)
            r3 = r1
        L20:
            if (r3 >= r0) goto L2a
            r4 = r2[r3]
            if (r4 != r7) goto L27
            goto L2b
        L27:
            int r3 = r3 + 1
            goto L20
        L2a:
            r3 = -1
        L2b:
            if (r3 >= 0) goto L32
            int r5 = r5.m5170(r7)
            goto L14
        L32:
            int r0 = r5.m5164()
            int r2 = r5.f9545
            int r0 = r0 - r2
            cn0 r5 = r5.f9554
            int[] r5 = r5.f2210
            r5 = r5[r3]
            int r5 = r0 - r5
        L41:
            if (r6 <= r7) goto L47
            if (r6 >= r5) goto L47
            r5 = 1
            return r5
        L47:
            return r1
    }

    /* JADX INFO: renamed from: ψ */
    public final void m5172(int r12) {
            r11 = this;
            if (r12 <= 0) goto L78
            int r0 = r11.f9557
            r11.m5131(r0)
            int r1 = r11.f9544
            int r2 = r11.f9545
            int[] r3 = r11.f9539
            int r4 = r3.length
            int r4 = r4 / 5
            int r5 = r4 - r2
            r6 = 0
            if (r2 >= r12) goto L3c
            int r7 = r4 * 2
            int r8 = r5 + r12
            int r7 = java.lang.Math.max(r7, r8)
            r8 = 32
            int r7 = java.lang.Math.max(r7, r8)
            int r8 = r7 * 5
            int[] r8 = new int[r8]
            int r7 = r7 - r5
            int r2 = r2 + r1
            int r9 = r1 + r7
            int r10 = r1 * 5
            p000.AbstractC0312g7.m2235(r6, r6, r10, r3, r8)
            int r9 = r9 * 5
            int r2 = r2 * 5
            int r4 = r4 * 5
            p000.AbstractC0312g7.m2235(r9, r2, r4, r3, r8)
            r11.f9539 = r8
            r2 = r7
        L3c:
            int r3 = r11.f9558
            if (r3 < r1) goto L43
            int r3 = r3 + r12
            r11.f9558 = r3
        L43:
            int r3 = r1 + r12
            r11.f9544 = r3
            int r2 = r2 - r12
            r11.f9545 = r2
            if (r5 <= 0) goto L52
            int r0 = r0 + r12
            int r0 = r11.m5156(r0)
            goto L53
        L52:
            r0 = r6
        L53:
            int r2 = r11.f9550
            if (r2 >= r1) goto L58
            goto L5a
        L58:
            int r6 = r11.f9548
        L5a:
            int r2 = r11.f9549
            java.lang.Object[] r4 = r11.f9540
            int r4 = r4.length
            int r0 = m5128(r0, r6, r2, r4)
            r2 = r1
        L64:
            if (r2 >= r3) goto L71
            int[] r4 = r11.f9539
            int r5 = r2 * 5
            int r5 = r5 + 4
            r4[r5] = r0
            int r2 = r2 + 1
            goto L64
        L71:
            int r0 = r11.f9550
            if (r0 < r1) goto L78
            int r0 = r0 + r12
            r11.f9550 = r0
        L78:
            return
    }

    /* JADX INFO: renamed from: ω */
    public final void m5173(int r10, int r11) {
            r9 = this;
            if (r10 <= 0) goto L47
            int r0 = r9.f9546
            r9.m5132(r0, r11)
            int r11 = r9.f9548
            int r0 = r9.f9549
            if (r0 >= r10) goto L3a
            java.lang.Object[] r1 = r9.f9540
            int r2 = r1.length
            int r3 = r2 - r0
            int r4 = r2 * 2
            int r5 = r3 + r10
            int r4 = java.lang.Math.max(r4, r5)
            r5 = 32
            int r4 = java.lang.Math.max(r4, r5)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r7 = r6
        L24:
            if (r7 >= r4) goto L2c
            r8 = 0
            r5[r7] = r8
            int r7 = r7 + 1
            goto L24
        L2c:
            int r4 = r4 - r3
            int r0 = r0 + r11
            int r3 = r11 + r4
            java.lang.System.arraycopy(r1, r6, r5, r6, r11)
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r5, r3, r2)
            r9.f9540 = r5
            r0 = r4
        L3a:
            int r1 = r9.f9547
            if (r1 < r11) goto L41
            int r1 = r1 + r10
            r9.f9547 = r1
        L41:
            int r11 = r11 + r10
            r9.f9548 = r11
            int r0 = r0 - r10
            r9.f9549 = r0
        L47:
            return
    }
}
