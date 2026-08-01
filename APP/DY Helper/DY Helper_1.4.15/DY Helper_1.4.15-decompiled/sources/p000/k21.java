package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class k21 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: ε */
    public java.lang.Object[] f5716;

    /* JADX INFO: renamed from: ζ */
    public p000.h21 f5717;

    /* JADX INFO: renamed from: η */
    public int f5718;

    public k21(java.lang.Object[] r1) {
            r0 = this;
            r0.<init>()
            r0.f5716 = r1
            r1 = 0
            r0.f5718 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m3126(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f5718
            int r0 = r0 + 1
            java.lang.Object[] r1 = r3.f5716
            int r1 = r1.length
            if (r1 >= r0) goto Lc
            r3.m3138(r0)
        Lc:
            java.lang.Object[] r0 = r3.f5716
            int r1 = r3.f5718
            if (r4 == r1) goto L18
            int r2 = r4 + 1
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r2, r1)
        L18:
            r0[r4] = r5
            int r4 = r3.f5718
            int r4 = r4 + 1
            r3.f5718 = r4
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m3127(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f5718
            int r0 = r0 + 1
            java.lang.Object[] r1 = r2.f5716
            int r1 = r1.length
            if (r1 >= r0) goto Lc
            r2.m3138(r0)
        Lc:
            java.lang.Object[] r0 = r2.f5716
            int r1 = r2.f5718
            r0[r1] = r3
            int r1 = r1 + 1
            r2.f5718 = r1
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m3128(int r5, p000.k21 r6) {
            r4 = this;
            int r0 = r6.f5718
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r4.f5718
            int r1 = r1 + r0
            java.lang.Object[] r2 = r4.f5716
            int r2 = r2.length
            if (r2 >= r1) goto L10
            r4.m3138(r1)
        L10:
            java.lang.Object[] r1 = r4.f5716
            int r2 = r4.f5718
            if (r5 == r2) goto L1c
            int r3 = r5 + r0
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r5, r1, r3, r2)
        L1c:
            java.lang.Object[] r6 = r6.f5716
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r1, r5, r0)
            int r5 = r4.f5718
            int r5 = r5 + r0
            r4.f5718 = r5
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m3129(int r7, java.util.List r8) {
            r6 = this;
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r8.size()
            int r1 = r6.f5718
            int r1 = r1 + r0
            java.lang.Object[] r2 = r6.f5716
            int r2 = r2.length
            if (r2 >= r1) goto L16
            r6.m3138(r1)
        L16:
            java.lang.Object[] r1 = r6.f5716
            int r2 = r6.f5718
            if (r7 == r2) goto L22
            int r3 = r7 + r0
            int r2 = r2 - r7
            java.lang.System.arraycopy(r1, r7, r1, r3, r2)
        L22:
            int r2 = r8.size()
            r3 = 0
        L27:
            if (r3 >= r2) goto L34
            int r4 = r7 + r3
            java.lang.Object r5 = r8.get(r3)
            r1[r4] = r5
            int r3 = r3 + 1
            goto L27
        L34:
            int r7 = r6.f5718
            int r7 = r7 + r0
            r6.f5718 = r7
            return
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m3130(int r6, java.util.Collection r7) {
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r7.size()
            int r2 = r5.f5718
            int r2 = r2 + r0
            java.lang.Object[] r3 = r5.f5716
            int r3 = r3.length
            if (r3 >= r2) goto L17
            r5.m3138(r2)
        L17:
            java.lang.Object[] r2 = r5.f5716
            int r3 = r5.f5718
            if (r6 == r3) goto L23
            int r4 = r6 + r0
            int r3 = r3 - r6
            java.lang.System.arraycopy(r2, r6, r2, r4, r3)
        L23:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L29:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r7.next()
            int r4 = r1 + 1
            if (r1 < 0) goto L3c
            int r1 = r1 + r6
            r2[r1] = r3
            r1 = r4
            goto L29
        L3c:
            p000.AbstractC1021yh.m6917()
            r5 = 0
            throw r5
        L41:
            int r6 = r5.f5718
            int r6 = r6 + r0
            r5.f5718 = r6
            r5 = 1
            return r5
    }

    /* JADX INFO: renamed from: ζ */
    public final java.util.List m3131() {
            r1 = this;
            h21 r0 = r1.f5717
            if (r0 != 0) goto Lb
            h21 r0 = new h21
            r0.<init>(r1)
            r1.f5717 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final void m3132() {
            r5 = this;
            java.lang.Object[] r0 = r5.f5716
            int r1 = r5.f5718
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r1) goto Le
            r4 = 0
            r0[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r5.f5718 = r2
            return
    }

    /* JADX INFO: renamed from: θ */
    public final boolean m3133(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f5718
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r0 < 0) goto L18
            r3 = r2
        L8:
            java.lang.Object[] r4 = r5.f5716
            r4 = r4[r3]
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L13
            return r1
        L13:
            if (r3 == r0) goto L18
            int r3 = r3 + 1
            goto L8
        L18:
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public final int m3134(java.lang.Object r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f5716
            int r3 = r3.f5718
            r1 = 0
        L5:
            if (r1 >= r3) goto L13
            r2 = r0[r1]
            boolean r2 = p000.ln0.m3626(r4, r2)
            if (r2 == 0) goto L10
            return r1
        L10:
            int r1 = r1 + 1
            goto L5
        L13:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: κ */
    public final boolean m3135(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m3134(r1)
            if (r1 < 0) goto Lb
            r0.m3136(r1)
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public final java.lang.Object m3136(int r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.f5716
            r1 = r0[r5]
            int r2 = r4.f5718
            int r3 = r2 + (-1)
            if (r5 == r3) goto L10
            int r3 = r5 + 1
            int r2 = r2 - r3
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L10:
            int r5 = r4.f5718
            int r5 = r5 + (-1)
            r4.f5718 = r5
            r4 = 0
            r0[r5] = r4
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public final void m3137(int r4, int r5) {
            r3 = this;
            if (r5 <= r4) goto L22
            int r0 = r3.f5718
            if (r5 >= r0) goto Lc
            java.lang.Object[] r1 = r3.f5716
            int r0 = r0 - r5
            java.lang.System.arraycopy(r1, r5, r1, r4, r0)
        Lc:
            int r0 = r3.f5718
            int r5 = r5 - r4
            int r4 = r0 - r5
            int r0 = r0 + (-1)
            if (r4 > r0) goto L20
            r5 = r4
        L16:
            java.lang.Object[] r1 = r3.f5716
            r2 = 0
            r1[r5] = r2
            if (r5 == r0) goto L20
            int r5 = r5 + 1
            goto L16
        L20:
            r3.f5718 = r4
        L22:
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m3138(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f5716
            int r1 = r0.length
            int r2 = r1 * 2
            int r4 = java.lang.Math.max(r4, r2)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.f5716 = r4
            return
    }
}
