package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h81 extends p000.i81 {

    /* JADX INFO: renamed from: β */
    public p000.o61[] f4621;

    /* JADX INFO: renamed from: γ */
    public int f4622;

    /* JADX INFO: renamed from: δ */
    public int[] f4623;

    /* JADX INFO: renamed from: ε */
    public int f4624;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object[] f4625;

    /* JADX INFO: renamed from: η */
    public int f4626;

    public h81() {
            r2 = this;
            r2.<init>()
            r0 = 16
            o61[] r1 = new p000.o61[r0]
            r2.f4621 = r1
            int[] r1 = new int[r0]
            r2.f4623 = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.f4625 = r0
            return
    }

    /* JADX INFO: renamed from: Ε */
    public final void m2455() {
            r4 = this;
            r0 = 0
            r4.f4622 = r0
            r4.f4624 = r0
            java.lang.Object[] r1 = r4.f4625
            r2 = 0
            int r3 = r4.f4626
            java.util.Arrays.fill(r1, r0, r3, r2)
            r4.f4626 = r0
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public final void m2456(p000.InterfaceC0676p6 r9, p000.rw1 r10, p000.en1 r11, p000.r71 r12) {
            r8 = this;
            int r0 = r8.f4622
            if (r0 == 0) goto L50
            f81 r2 = new f81
            r2.<init>(r8)
        L9:
            h81 r0 = r2.f3820
            o61[] r1 = r0.f4621
            int r3 = r2.f3817
            r1 = r1[r3]
            q80 r7 = r1.mo4213(r2)
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.mo45(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L40
            int r9 = r2.f3817
            int r10 = r0.f4622
            if (r9 < r10) goto L23
            goto L50
        L23:
            o61[] r11 = r0.f4621
            r11 = r11[r9]
            int r12 = r2.f3818
            int r0 = r11.f7964
            int r12 = r12 + r0
            r2.f3818 = r12
            int r12 = r2.f3819
            int r11 = r11.f7965
            int r12 = r12 + r11
            r2.f3819 = r12
            int r9 = r9 + 1
            r2.f3817 = r9
            if (r9 >= r10) goto L50
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            goto L9
        L40:
            r0 = move-exception
            r8 = r0
            if (r6 != 0) goto L45
            goto L4f
        L45:
            z7 r9 = new z7
            r10 = 10
            r9.<init>(r7, r4, r6, r10)
            p000.jx0.m3063(r8, r9)
        L4f:
            throw r8
        L50:
            r8.m2455()
            return
    }

    /* JADX INFO: renamed from: Η */
    public final boolean m2457() {
            r0 = this;
            int r0 = r0.f4622
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Θ */
    public final void m2458(p000.o61 r8) {
            r7 = this;
            int r0 = r7.f4622
            o61[] r1 = r7.f4621
            int r2 = r1.length
            r3 = 1024(0x400, float:1.435E-42)
            r4 = 0
            if (r0 != r2) goto L17
            if (r0 <= r3) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r0
        Lf:
            int r2 = r2 + r0
            o61[] r2 = new p000.o61[r2]
            java.lang.System.arraycopy(r1, r4, r2, r4, r0)
            r7.f4621 = r2
        L17:
            int r0 = r7.f4624
            int r1 = r8.f7964
            int r2 = r8.f7965
            int r0 = r0 + r1
            int[] r1 = r7.f4623
            int r5 = r1.length
            if (r0 <= r5) goto L34
            if (r5 <= r3) goto L27
            r6 = r3
            goto L28
        L27:
            r6 = r5
        L28:
            int r6 = r6 + r5
            if (r6 >= r0) goto L2c
            goto L2d
        L2c:
            r0 = r6
        L2d:
            int[] r0 = new int[r0]
            p000.AbstractC0312g7.m2235(r4, r4, r5, r1, r0)
            r7.f4623 = r0
        L34:
            int r0 = r7.f4626
            int r0 = r0 + r2
            java.lang.Object[] r1 = r7.f4625
            int r5 = r1.length
            if (r0 <= r5) goto L4c
            if (r5 <= r3) goto L3f
            goto L40
        L3f:
            r3 = r5
        L40:
            int r3 = r3 + r5
            if (r3 >= r0) goto L44
            goto L45
        L44:
            r0 = r3
        L45:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.System.arraycopy(r1, r4, r0, r4, r5)
            r7.f4625 = r0
        L4c:
            o61[] r0 = r7.f4621
            int r1 = r7.f4622
            int r3 = r1 + 1
            r7.f4622 = r3
            r0[r1] = r8
            int r0 = r7.f4624
            int r8 = r8.f7964
            int r0 = r0 + r8
            r7.f4624 = r0
            int r8 = r7.f4626
            int r8 = r8 + r2
            r7.f4626 = r8
            return
    }
}
