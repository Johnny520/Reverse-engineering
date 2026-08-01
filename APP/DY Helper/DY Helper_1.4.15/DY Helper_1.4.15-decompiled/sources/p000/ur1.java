package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ur1 extends p000.C0208dd {

    /* JADX INFO: renamed from: ι */
    public final transient byte[][] f10935;

    /* JADX INFO: renamed from: κ */
    public final transient int[] f10936;

    public ur1(byte[][] r2, int[] r3) {
            r1 = this;
            dd r0 = p000.C0208dd.f3085
            byte[] r0 = r0.f3086
            r1.<init>(r0)
            r1.f10935 = r2
            r1.f10936 = r3
            return
    }

    @Override // p000.C0208dd
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof p000.C0208dd
            if (r0 == 0) goto L1f
            dd r3 = (p000.C0208dd) r3
            int r0 = r3.mo1701()
            int r1 = r2.mo1701()
            if (r0 != r1) goto L1f
            int r0 = r2.mo1701()
            boolean r2 = r2.mo1706(r3, r0)
            if (r2 == 0) goto L1f
        L1d:
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    @Override // p000.C0208dd
    public final int hashCode() {
            r9 = this;
            int r0 = r9.f3087
            if (r0 == 0) goto L5
            return r0
        L5:
            byte[][] r0 = r9.f10935
            int r1 = r0.length
            r2 = 0
            r3 = 1
            r4 = r3
            r3 = r2
        Lc:
            if (r2 >= r1) goto L29
            int r5 = r1 + r2
            int[] r6 = r9.f10936
            r5 = r6[r5]
            r6 = r6[r2]
            r7 = r0[r2]
            int r3 = r6 - r3
            int r3 = r3 + r5
        L1b:
            if (r5 >= r3) goto L25
            int r4 = r4 * 31
            r8 = r7[r5]
            int r4 = r4 + r8
            int r5 = r5 + 1
            goto L1b
        L25:
            int r2 = r2 + 1
            r3 = r6
            goto Lc
        L29:
            r9.f3087 = r4
            return r4
    }

    @Override // p000.C0208dd
    public final java.lang.String toString() {
            r1 = this;
            dd r0 = new dd
            byte[] r1 = r1.m5942()
            r0.<init>(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // p000.C0208dd
    /* JADX INFO: renamed from: α */
    public final int mo1701() {
            r1 = this;
            byte[][] r0 = r1.f10935
            int r0 = r0.length
            int r0 = r0 + (-1)
            int[] r1 = r1.f10936
            r1 = r1[r0]
            return r1
    }

    @Override // p000.C0208dd
    /* JADX INFO: renamed from: β */
    public final java.lang.String mo1702() {
            r1 = this;
            dd r0 = new dd
            byte[] r1 = r1.m5942()
            r0.<init>(r1)
            java.lang.String r1 = r0.mo1702()
            return r1
    }

    @Override // p000.C0208dd
    /* JADX INFO: renamed from: γ */
    public final byte[] mo1703() {
            r0 = this;
            byte[] r0 = r0.m5942()
            return r0
    }

    @Override // p000.C0208dd
    /* JADX INFO: renamed from: δ */
    public final byte mo1704(int r10) {
            r9 = this;
            byte[][] r0 = r9.f10935
            int r1 = r0.length
            int r1 = r1 + (-1)
            int[] r2 = r9.f10936
            r1 = r2[r1]
            long r3 = (long) r1
            long r5 = (long) r10
            r7 = 1
            p000.ln0.m3629(r3, r5, r7)
            int r9 = p000.kn0.m3351(r9, r10)
            if (r9 != 0) goto L18
            r1 = 0
            goto L1c
        L18:
            int r1 = r9 + (-1)
            r1 = r2[r1]
        L1c:
            int r3 = r0.length
            int r3 = r3 + r9
            r2 = r2[r3]
            r9 = r0[r9]
            int r10 = r10 - r1
            int r10 = r10 + r2
            r9 = r9[r10]
            return r9
    }

    @Override // p000.C0208dd
    /* JADX INFO: renamed from: ε */
    public final boolean mo1705(int r9, byte[] r10, int r11, int r12) {
            r8 = this;
            r10.getClass()
            r0 = 0
            if (r9 < 0) goto L54
            int r1 = r8.mo1701()
            int r1 = r1 - r12
            if (r9 > r1) goto L54
            if (r11 < 0) goto L54
            int r1 = r10.length
            int r1 = r1 - r12
            if (r11 <= r1) goto L14
            goto L54
        L14:
            int r12 = r12 + r9
            int r1 = p000.kn0.m3351(r8, r9)
        L19:
            if (r9 >= r12) goto L52
            int[] r2 = r8.f10936
            if (r1 != 0) goto L21
            r3 = r0
            goto L25
        L21:
            int r3 = r1 + (-1)
            r3 = r2[r3]
        L25:
            r4 = r2[r1]
            int r4 = r4 - r3
            byte[][] r5 = r8.f10935
            int r6 = r5.length
            int r6 = r6 + r1
            r2 = r2[r6]
            int r4 = r4 + r3
            int r4 = java.lang.Math.min(r12, r4)
            int r4 = r4 - r9
            int r3 = r9 - r3
            int r3 = r3 + r2
            r2 = r5[r1]
            r2.getClass()
            r5 = r0
        L3d:
            if (r5 >= r4) goto L4d
            int r6 = r5 + r3
            r6 = r2[r6]
            int r7 = r5 + r11
            r7 = r10[r7]
            if (r6 == r7) goto L4a
            goto L54
        L4a:
            int r5 = r5 + 1
            goto L3d
        L4d:
            int r11 = r11 + r4
            int r9 = r9 + r4
            int r1 = r1 + 1
            goto L19
        L52:
            r8 = 1
            return r8
        L54:
            return r0
    }

    @Override // p000.C0208dd
    /* JADX INFO: renamed from: ζ */
    public final boolean mo1706(p000.C0208dd r10, int r11) {
            r9 = this;
            r10.getClass()
            int r0 = r9.mo1701()
            int r0 = r0 - r11
            r1 = 0
            if (r0 >= 0) goto Lc
            goto L38
        Lc:
            int r0 = p000.kn0.m3351(r9, r1)
            r2 = r1
            r3 = r2
        L12:
            if (r2 >= r11) goto L3e
            int[] r4 = r9.f10936
            if (r0 != 0) goto L1a
            r5 = r1
            goto L1e
        L1a:
            int r5 = r0 + (-1)
            r5 = r4[r5]
        L1e:
            r6 = r4[r0]
            int r6 = r6 - r5
            byte[][] r7 = r9.f10935
            int r8 = r7.length
            int r8 = r8 + r0
            r4 = r4[r8]
            int r6 = r6 + r5
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r2
            int r5 = r2 - r5
            int r5 = r5 + r4
            r4 = r7[r0]
            boolean r4 = r10.mo1705(r3, r4, r5, r6)
            if (r4 != 0) goto L39
        L38:
            return r1
        L39:
            int r3 = r3 + r6
            int r2 = r2 + r6
            int r0 = r0 + 1
            goto L12
        L3e:
            r9 = 1
            return r9
    }

    @Override // p000.C0208dd
    /* JADX INFO: renamed from: η */
    public final java.lang.String mo1707(java.nio.charset.Charset r2) {
            r1 = this;
            r2.getClass()
            dd r0 = new dd
            byte[] r1 = r1.m5942()
            r0.<init>(r1)
            java.lang.String r1 = r0.mo1707(r2)
            return r1
    }

    @Override // p000.C0208dd
    /* JADX INFO: renamed from: θ */
    public final p000.C0208dd mo1708(int r11, int r12) {
            r10 = this;
            r0 = -1234567890(0xffffffffb669fd2e, float:-3.4867076E-6)
            if (r12 != r0) goto L9
            int r12 = r10.mo1701()
        L9:
            if (r11 < 0) goto L9d
            int r0 = r10.mo1701()
            java.lang.String r1 = "endIndex="
            if (r12 > r0) goto L7d
            int r0 = r12 - r11
            if (r0 < 0) goto L72
            if (r11 != 0) goto L20
            int r1 = r10.mo1701()
            if (r12 != r1) goto L20
            return r10
        L20:
            if (r11 != r12) goto L25
            dd r10 = p000.C0208dd.f3085
            return r10
        L25:
            int r1 = p000.kn0.m3351(r10, r11)
            int r12 = r12 + (-1)
            int r12 = p000.kn0.m3351(r10, r12)
            int r2 = r12 + 1
            byte[][] r3 = r10.f10935
            java.lang.Object[] r2 = p000.AbstractC0312g7.m2242(r3, r1, r2)
            byte[][] r2 = (byte[][]) r2
            int r4 = r2.length
            int r4 = r4 * 2
            int[] r4 = new int[r4]
            r5 = 0
            int[] r10 = r10.f10936
            if (r1 > r12) goto L5e
            r7 = r1
            r6 = r5
        L45:
            r8 = r10[r7]
            int r8 = r8 - r11
            int r8 = java.lang.Math.min(r8, r0)
            r4[r6] = r8
            int r8 = r6 + 1
            int r9 = r2.length
            int r6 = r6 + r9
            int r9 = r3.length
            int r9 = r9 + r7
            r9 = r10[r9]
            r4[r6] = r9
            if (r7 == r12) goto L5e
            int r7 = r7 + 1
            r6 = r8
            goto L45
        L5e:
            if (r1 != 0) goto L61
            goto L65
        L61:
            int r1 = r1 + (-1)
            r5 = r10[r1]
        L65:
            int r10 = r2.length
            r12 = r4[r10]
            int r11 = r11 - r5
            int r11 = r11 + r12
            r4[r10] = r11
            ur1 r10 = new ur1
            r10.<init>(r2, r4)
            return r10
        L72:
            java.lang.String r10 = " < beginIndex="
            java.lang.String r10 = p000.AbstractC0602nx.m4125(r12, r11, r1, r10)
            p000.C1080.m7266(r10)
            r10 = 0
            return r10
        L7d:
            java.lang.String r11 = " > length("
            java.lang.StringBuilder r11 = p000.a12.m19(r12, r1, r11)
            int r10 = r10.mo1701()
            r11.append(r10)
            r10 = 41
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L9d:
            java.lang.String r10 = "beginIndex="
            java.lang.String r12 = " < 0"
            java.lang.String r10 = p000.AbstractC0602nx.m4127(r10, r11, r12)
            p000.C1080.m7266(r10)
            r10 = 0
            return r10
    }

    @Override // p000.C0208dd
    /* JADX INFO: renamed from: ι */
    public final p000.C0208dd mo1709() {
            r1 = this;
            dd r0 = new dd
            byte[] r1 = r1.m5942()
            r0.<init>(r1)
            dd r1 = r0.mo1709()
            return r1
    }

    @Override // p000.C0208dd
    /* JADX INFO: renamed from: λ */
    public final void mo1711(p000.C0793sc r10, int r11) {
            r9 = this;
            r0 = 0
            int r1 = p000.kn0.m3351(r9, r0)
            r2 = r0
        L6:
            if (r2 >= r11) goto L45
            int[] r3 = r9.f10936
            if (r1 != 0) goto Le
            r4 = r0
            goto L12
        Le:
            int r4 = r1 + (-1)
            r4 = r3[r4]
        L12:
            r5 = r3[r1]
            int r5 = r5 - r4
            byte[][] r6 = r9.f10935
            int r7 = r6.length
            int r7 = r7 + r1
            r3 = r3[r7]
            int r5 = r5 + r4
            int r5 = java.lang.Math.min(r11, r5)
            int r5 = r5 - r2
            int r4 = r2 - r4
            int r4 = r4 + r3
            r3 = r6[r1]
            rr1 r6 = new rr1
            int r7 = r4 + r5
            r8 = 1
            r6.<init>(r3, r4, r7, r8)
            rr1 r3 = r10.f9827
            if (r3 != 0) goto L39
            r6.f9477 = r6
            r6.f9476 = r6
            r10.f9827 = r6
            goto L41
        L39:
            rr1 r3 = r3.f9477
            r3.getClass()
            r3.m5124(r6)
        L41:
            int r2 = r2 + r5
            int r1 = r1 + 1
            goto L6
        L45:
            long r0 = r10.f9828
            long r2 = (long) r11
            long r0 = r0 + r2
            r10.f9828 = r0
            return
    }

    /* JADX INFO: renamed from: μ */
    public final byte[] m5942() {
            r10 = this;
            int r0 = r10.mo1701()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r10.f10935
            int r2 = r1.length
            r3 = 0
            r4 = r3
            r5 = r4
        Lc:
            if (r3 >= r2) goto L24
            int r6 = r2 + r3
            int[] r7 = r10.f10936
            r6 = r7[r6]
            r7 = r7[r3]
            r8 = r1[r3]
            int r4 = r7 - r4
            int r9 = r6 + r4
            p000.AbstractC0312g7.m2236(r8, r0, r5, r6, r9)
            int r5 = r5 + r4
            int r3 = r3 + 1
            r4 = r7
            goto Lc
        L24:
            return r0
    }
}
