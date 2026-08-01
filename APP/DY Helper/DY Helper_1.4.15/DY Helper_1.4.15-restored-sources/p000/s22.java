package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class s22 {

    /* JADX INFO: renamed from: α */
    public final p000.n72 f9691;

    /* JADX INFO: renamed from: β */
    public final p000.g62 f9692;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object f9693;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object f9694;

    /* JADX INFO: renamed from: ε */
    public final p000.AbstractC0100c4 f9695;

    /* JADX INFO: renamed from: ζ */
    public final p000.AbstractC0100c4 f9696;

    /* JADX INFO: renamed from: η */
    public final p000.AbstractC0100c4 f9697;

    /* JADX INFO: renamed from: θ */
    public long f9698;

    /* JADX INFO: renamed from: ι */
    public p000.AbstractC0100c4 f9699;

    public s22(p000.InterfaceC0933w3 r1, p000.g62 r2, java.lang.Object r3, java.lang.Object r4, p000.AbstractC0100c4 r5) {
            r0 = this;
            n72 r1 = r1.mo1841(r2)
            r0.<init>()
            r0.f9691 = r1
            r0.f9692 = r2
            r0.f9693 = r4
            r0.f9694 = r3
            a80 r1 = r2.f4262
            java.lang.Object r1 = r1.invoke(r3)
            c4 r1 = (p000.AbstractC0100c4) r1
            r0.f9695 = r1
            a80 r1 = r2.f4262
            java.lang.Object r2 = r1.invoke(r4)
            c4 r2 = (p000.AbstractC0100c4) r2
            r0.f9696 = r2
            if (r5 == 0) goto L2a
            c4 r1 = p000.AbstractC1021yh.m6891(r5)
            goto L34
        L2a:
            java.lang.Object r1 = r1.invoke(r3)
            c4 r1 = (p000.AbstractC0100c4) r1
            c4 r1 = r1.mo29()
        L34:
            r0.f9697 = r1
            r1 = -1
            r0.f9698 = r1
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TargetBasedAnimation: "
            r0.<init>(r1)
            java.lang.Object r1 = r5.f9694
            r0.append(r1)
            java.lang.String r1 = " -> "
            r0.append(r1)
            java.lang.Object r1 = r5.f9693
            r0.append(r1)
            java.lang.String r1 = ",initial velocity: "
            r0.append(r1)
            c4 r1 = r5.f9697
            r0.append(r1)
            java.lang.String r1 = ", duration: "
            r0.append(r1)
            long r1 = r5.m5356()
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r3
            r0.append(r1)
            java.lang.String r1 = " ms,animationSpec: "
            r0.append(r1)
            n72 r5 = r5.f9691
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final long m5356() {
            r4 = this;
            long r0 = r4.f9698
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L16
            c4 r0 = r4.f9696
            c4 r1 = r4.f9697
            n72 r2 = r4.f9691
            c4 r3 = r4.f9695
            long r0 = r2.mo2563(r3, r0, r1)
            r4.f9698 = r0
        L16:
            long r0 = r4.f9698
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.Object m5357(long r7) {
            r6 = this;
            long r0 = r6.m5356()
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto Lb
            java.lang.Object r6 = r6.f9693
            return r6
        Lb:
            c4 r4 = r6.f9696
            c4 r5 = r6.f9697
            n72 r0 = r6.f9691
            c4 r3 = r6.f9695
            r1 = r7
            c4 r7 = r0.mo2561(r1, r3, r4, r5)
            int r8 = r7.mo28()
            r0 = 0
        L1d:
            if (r0 >= r8) goto L4d
            float r3 = r7.mo27(r0)
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L4a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "AnimationVector cannot contain a NaN. "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r4 = ". Animation: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = ", playTimeNanos: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            p000.ri1.m5099(r3)
        L4a:
            int r0 = r0 + 1
            goto L1d
        L4d:
            g62 r6 = r6.f9692
            a80 r6 = r6.f4263
            java.lang.Object r6 = r6.invoke(r7)
            return r6
    }

    /* JADX INFO: renamed from: γ */
    public final p000.AbstractC0100c4 m5358(long r7) {
            r6 = this;
            long r0 = r6.m5356()
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L1b
            c4 r7 = r6.f9699
            if (r7 != 0) goto L1a
            c4 r7 = r6.f9696
            c4 r8 = r6.f9697
            n72 r0 = r6.f9691
            c4 r1 = r6.f9695
            c4 r7 = r0.mo2562(r1, r7, r8)
            r6.f9699 = r7
        L1a:
            return r7
        L1b:
            c4 r4 = r6.f9696
            c4 r5 = r6.f9697
            n72 r0 = r6.f9691
            c4 r3 = r6.f9695
            r1 = r7
            c4 r6 = r0.mo2559(r1, r3, r4, r5)
            return r6
    }
}
