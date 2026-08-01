package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nw1 {

    /* JADX INFO: renamed from: α */
    public final p000.ow1 f7797;

    /* JADX INFO: renamed from: β */
    public final int[] f7798;

    /* JADX INFO: renamed from: γ */
    public final int f7799;

    /* JADX INFO: renamed from: δ */
    public java.lang.Object[] f7800;

    /* JADX INFO: renamed from: ε */
    public final int f7801;

    /* JADX INFO: renamed from: ζ */
    public boolean f7802;

    /* JADX INFO: renamed from: η */
    public int f7803;

    /* JADX INFO: renamed from: θ */
    public int f7804;

    /* JADX INFO: renamed from: ι */
    public int f7805;

    /* JADX INFO: renamed from: κ */
    public final p000.cn0 f7806;

    /* JADX INFO: renamed from: λ */
    public int f7807;

    /* JADX INFO: renamed from: μ */
    public int f7808;

    /* JADX INFO: renamed from: ν */
    public int f7809;

    /* JADX INFO: renamed from: ξ */
    public boolean f7810;

    public nw1(p000.ow1 r3) {
            r2 = this;
            r2.<init>()
            r2.f7797 = r3
            int[] r0 = r3.f8286
            r2.f7798 = r0
            int r0 = r3.f8287
            r2.f7799 = r0
            java.lang.Object[] r1 = r3.f8288
            r2.f7800 = r1
            int r3 = r3.f8289
            r2.f7801 = r3
            r2.f7804 = r0
            r3 = -1
            r2.f7805 = r3
            cn0 r3 = new cn0
            r3.<init>()
            r2.f7806 = r3
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SlotReader(current="
            r0.<init>(r1)
            int r1 = r2.f7803
            r0.append(r1)
            java.lang.String r1 = ", key="
            r0.append(r1)
            int r1 = r2.m4102()
            r0.append(r1)
            java.lang.String r1 = ", parent="
            r0.append(r1)
            int r1 = r2.f7805
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r2 = r2.f7804
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final p000.q80 m4096(int r3) {
            r2 = this;
            ow1 r0 = r2.f7797
            java.util.ArrayList r0 = r0.f8294
            int r2 = r2.f7799
            int r2 = p000.qw1.m4949(r0, r3, r2)
            if (r2 >= 0) goto L18
            q80 r1 = new q80
            r1.<init>(r3)
            int r2 = r2 + 1
            int r2 = -r2
            r0.add(r2, r1)
            return r1
        L18:
            java.lang.Object r2 = r0.get(r2)
            q80 r2 = (p000.q80) r2
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.Object m4097(int r3, int[] r4) {
            r2 = this;
            int r3 = r3 * 5
            int r0 = r3 + 1
            r0 = r4[r0]
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L20
            java.lang.Object[] r2 = r2.f7800
            int r1 = r4.length
            if (r3 < r1) goto L12
            int r3 = r4.length
            goto L1d
        L12:
            int r3 = r3 + 4
            r3 = r4[r3]
            int r4 = r0 >> 29
            int r4 = java.lang.Integer.bitCount(r4)
            int r3 = r3 + r4
        L1d:
            r2 = r2[r3]
            return r2
        L20:
            i2 r2 = p000.C0730qn.f9051
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final void m4098() {
            r2 = this;
            r0 = 1
            r2.f7802 = r0
            ow1 r0 = r2.f7797
            int r1 = r0.f8290
            if (r1 <= 0) goto La
            goto Lf
        La:
            java.lang.String r1 = "Unexpected reader close()"
            p000.AbstractC0804sn.m5526(r1)
        Lf:
            int r1 = r0.f8290
            int r1 = r1 + (-1)
            r0.f8290 = r1
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.f7800 = r0
            return
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m4099(int r2) {
            r1 = this;
            int r2 = r2 * 5
            r0 = 1
            int r2 = r2 + r0
            int[] r1 = r1.f7798
            r1 = r1[r2]
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r2
            if (r1 == 0) goto Le
            return r0
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public final void m4100() {
            r4 = this;
            int r0 = r4.f7807
            if (r0 != 0) goto L4c
            int r0 = r4.f7803
            int r1 = r4.f7804
            if (r0 != r1) goto Lb
            goto L10
        Lb:
            java.lang.String r0 = "endGroup() not called at the end of a group"
            p000.AbstractC0804sn.m5526(r0)
        L10:
            int r0 = r4.f7805
            int r0 = r0 * 5
            int r0 = r0 + 2
            int[] r1 = r4.f7798
            r0 = r1[r0]
            r4.f7805 = r0
            int r2 = r4.f7799
            if (r0 >= 0) goto L22
            r3 = r2
            goto L29
        L22:
            int r3 = r0 * 5
            int r3 = r3 + 3
            r3 = r1[r3]
            int r3 = r3 + r0
        L29:
            r4.f7804 = r3
            cn0 r3 = r4.f7806
            int r3 = r3.m1268()
            if (r3 >= 0) goto L39
            r0 = 0
            r4.f7808 = r0
            r4.f7809 = r0
            return
        L39:
            r4.f7808 = r3
            int r2 = r2 + (-1)
            if (r0 < r2) goto L42
            int r0 = r4.f7801
            goto L4a
        L42:
            int r0 = r0 + 1
            int r0 = r0 * 5
            int r0 = r0 + 4
            r0 = r1[r0]
        L4a:
            r4.f7809 = r0
        L4c:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object m4101() {
            r2 = this;
            int r0 = r2.f7803
            int r1 = r2.f7804
            if (r0 >= r1) goto Ld
            int[] r1 = r2.f7798
            java.lang.Object r2 = r2.m4097(r0, r1)
            return r2
        Ld:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    /* JADX INFO: renamed from: η */
    public final int m4102() {
            r2 = this;
            int r0 = r2.f7803
            int r1 = r2.f7804
            if (r0 >= r1) goto Ld
            int r0 = r0 * 5
            int[] r2 = r2.f7798
            r2 = r2[r0]
            return r2
        Ld:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public final java.lang.Object m4103(int r4, int r5) {
            r3 = this;
            int[] r0 = r3.f7798
            int r1 = p000.qw1.m4946(r4, r0)
            int r4 = r4 + 1
            int r2 = r3.f7799
            if (r4 >= r2) goto L13
            int r4 = r4 * 5
            int r4 = r4 + 4
            r4 = r0[r4]
            goto L15
        L13:
            int r4 = r3.f7801
        L15:
            int r1 = r1 + r5
            if (r1 >= r4) goto L1d
            java.lang.Object[] r3 = r3.f7800
            r3 = r3[r1]
            return r3
        L1d:
            i2 r3 = p000.C0730qn.f9051
            return r3
    }

    /* JADX INFO: renamed from: ι */
    public final int m4104(int r1) {
            r0 = this;
            int r1 = r1 * 5
            int[] r0 = r0.f7798
            r0 = r0[r1]
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final boolean m4105(int r2) {
            r1 = this;
            int r2 = r2 * 5
            r0 = 1
            int r2 = r2 + r0
            int[] r1 = r1.f7798
            r1 = r1[r2]
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r2
            if (r1 == 0) goto Le
            return r0
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public final boolean m4106(int r2) {
            r1 = this;
            int r2 = r2 * 5
            r0 = 1
            int r2 = r2 + r0
            int[] r1 = r1.f7798
            r1 = r1[r2]
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r2
            if (r1 == 0) goto Le
            return r0
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public final boolean m4107(int r2) {
            r1 = this;
            int r2 = r2 * 5
            r0 = 1
            int r2 = r2 + r0
            int[] r1 = r1.f7798
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto Le
            return r0
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public final java.lang.Object m4108() {
            r3 = this;
            int r0 = r3.f7807
            if (r0 > 0) goto L17
            int r0 = r3.f7808
            int r1 = r3.f7809
            if (r0 < r1) goto Lb
            goto L17
        Lb:
            r1 = 1
            r3.f7810 = r1
            java.lang.Object[] r1 = r3.f7800
            int r2 = r0 + 1
            r3.f7808 = r2
            r3 = r1[r0]
            return r3
        L17:
            r0 = 0
            r3.f7810 = r0
            i2 r3 = p000.C0730qn.f9051
            return r3
    }

    /* JADX INFO: renamed from: ξ */
    public final java.lang.Object m4109(int r4) {
            r3 = this;
            int r4 = r4 * 5
            int r0 = r4 + 1
            int[] r1 = r3.f7798
            r0 = r1[r0]
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r2
            if (r0 == 0) goto L1b
            if (r0 == 0) goto L18
            java.lang.Object[] r3 = r3.f7800
            int r4 = r4 + 4
            r4 = r1[r4]
            r3 = r3[r4]
            return r3
        L18:
            i2 r3 = p000.C0730qn.f9051
            return r3
        L1b:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ο */
    public final int m4110(int r1) {
            r0 = this;
            int r1 = r1 * 5
            int r1 = r1 + 1
            int[] r0 = r0.f7798
            r0 = r0[r1]
            r1 = 67108863(0x3ffffff, float:1.5046327E-36)
            r0 = r0 & r1
            return r0
    }

    /* JADX INFO: renamed from: π */
    public final java.lang.Object m4111(int r3, int[] r4) {
            r2 = this;
            int r3 = r3 * 5
            int r0 = r3 + 1
            r0 = r4[r0]
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L1b
            java.lang.Object[] r2 = r2.f7800
            int r3 = r3 + 4
            r3 = r4[r3]
            int r4 = r0 >> 30
            int r4 = java.lang.Integer.bitCount(r4)
            int r4 = r4 + r3
            r2 = r2[r4]
            return r2
        L1b:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ρ */
    public final int m4112(int r1) {
            r0 = this;
            int r1 = r1 * 5
            int r1 = r1 + 2
            int[] r0 = r0.f7798
            r0 = r0[r1]
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public final void m4113(int r4) {
            r3 = this;
            int r0 = r3.f7807
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Cannot reposition while in an empty region"
            p000.AbstractC0804sn.m5526(r0)
        La:
            r3.f7803 = r4
            int[] r0 = r3.f7798
            int r1 = r3.f7799
            if (r4 >= r1) goto L19
            int r4 = r4 * 5
            int r4 = r4 + 2
            r4 = r0[r4]
            goto L1a
        L19:
            r4 = -1
        L1a:
            int r2 = r3.f7805
            if (r4 == r2) goto L33
            r3.f7805 = r4
            if (r4 >= 0) goto L25
            r3.f7804 = r1
            goto L2e
        L25:
            int r1 = r4 * 5
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r4
            r3.f7804 = r0
        L2e:
            r4 = 0
            r3.f7808 = r4
            r3.f7809 = r4
        L33:
            return
    }

    /* JADX INFO: renamed from: τ */
    public final int m4114() {
            r5 = this;
            int r0 = r5.f7807
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Cannot skip while in an empty region"
            p000.AbstractC0804sn.m5526(r0)
        La:
            int r0 = r5.f7803
            int r1 = r0 * 5
            int r2 = r1 + 1
            int[] r3 = r5.f7798
            r2 = r3[r2]
            r4 = 1073741824(0x40000000, float:2.0)
            r4 = r4 & r2
            if (r4 == 0) goto L1b
            r2 = 1
            goto L1f
        L1b:
            r4 = 67108863(0x3ffffff, float:1.5046327E-36)
            r2 = r2 & r4
        L1f:
            int r1 = r1 + 3
            r1 = r3[r1]
            int r1 = r1 + r0
            r5.f7803 = r1
            return r2
    }

    /* JADX INFO: renamed from: υ */
    public final void m4115() {
            r2 = this;
            int r0 = r2.f7807
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = r1
        L8:
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Cannot skip the enclosing group while in an empty region"
            p000.AbstractC0804sn.m5526(r0)
        Lf:
            int r0 = r2.f7804
            r2.f7803 = r0
            r2.f7808 = r1
            r2.f7809 = r1
            return
    }

    /* JADX INFO: renamed from: φ */
    public final void m4116() {
            r6 = this;
            int r0 = r6.f7807
            if (r0 > 0) goto L4e
            int r0 = r6.f7805
            int r1 = r6.f7803
            int r2 = r1 * 5
            int r3 = r2 + 2
            int[] r4 = r6.f7798
            r3 = r4[r3]
            if (r3 != r0) goto L13
            goto L18
        L13:
            java.lang.String r0 = "Invalid slot table detected"
            p000.pi1.m4544(r0)
        L18:
            int r0 = r6.f7808
            int r3 = r6.f7809
            cn0 r5 = r6.f7806
            if (r0 != 0) goto L27
            if (r3 != 0) goto L27
            r0 = -1
            r5.m1269(r0)
            goto L2a
        L27:
            r5.m1269(r0)
        L2a:
            r6.f7805 = r1
            int r2 = r2 + 3
            r0 = r4[r2]
            int r0 = r0 + r1
            r6.f7804 = r0
            int r0 = r1 + 1
            r6.f7803 = r0
            int r2 = p000.qw1.m4946(r1, r4)
            r6.f7808 = r2
            int r2 = r6.f7799
            int r2 = r2 + (-1)
            if (r1 < r2) goto L46
            int r0 = r6.f7801
            goto L4c
        L46:
            int r0 = r0 * 5
            int r0 = r0 + 4
            r0 = r4[r0]
        L4c:
            r6.f7809 = r0
        L4e:
            return
    }
}
