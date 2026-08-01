package p000;

/* JADX INFO: renamed from: rn */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0767rn {

    /* JADX INFO: renamed from: α */
    public final p000.v80 f9405;

    /* JADX INFO: renamed from: β */
    public p000.C0466ke f9406;

    /* JADX INFO: renamed from: γ */
    public boolean f9407;

    /* JADX INFO: renamed from: δ */
    public final p000.cn0 f9408;

    /* JADX INFO: renamed from: ε */
    public boolean f9409;

    /* JADX INFO: renamed from: ζ */
    public int f9410;

    /* JADX INFO: renamed from: η */
    public int f9411;

    /* JADX INFO: renamed from: θ */
    public final java.util.ArrayList f9412;

    /* JADX INFO: renamed from: ι */
    public int f9413;

    /* JADX INFO: renamed from: κ */
    public int f9414;

    /* JADX INFO: renamed from: λ */
    public int f9415;

    /* JADX INFO: renamed from: μ */
    public int f9416;

    public C0767rn(p000.v80 r1, p000.C0466ke r2) {
            r0 = this;
            r0.<init>()
            r0.f9405 = r1
            r0.f9406 = r2
            cn0 r1 = new cn0
            r1.<init>()
            r0.f9408 = r1
            r1 = 1
            r0.f9409 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f9412 = r1
            r1 = -1
            r0.f9413 = r1
            r0.f9414 = r1
            r0.f9415 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m5113() {
            r2 = this;
            r2.m5115()
            java.util.ArrayList r0 = r2.f9412
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L15
            int r2 = r0.size()
            int r2 = r2 + (-1)
            r0.remove(r2)
            return
        L15:
            int r0 = r2.f9411
            int r0 = r0 + 1
            r2.f9411 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m5114() {
            r6 = this;
            int r0 = r6.f9411
            r1 = 0
            if (r0 <= 0) goto L21
            ke r2 = r6.f9406
            h81 r2 = r2.f5866
            m61 r3 = p000.m61.f6980
            r2.m2458(r3)
            int[] r3 = r2.f4623
            int r4 = r2.f4624
            o61[] r5 = r2.f4621
            int r2 = r2.f4622
            int r2 = r2 + (-1)
            r2 = r5[r2]
            int r2 = r2.f7964
            int r4 = r4 - r2
            r3[r4] = r0
            r6.f9411 = r1
        L21:
            java.util.ArrayList r0 = r6.f9412
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L50
            ke r6 = r6.f9406
            int r2 = r0.size()
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = r1
        L32:
            if (r4 >= r2) goto L3d
            java.lang.Object r5 = r0.get(r4)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L32
        L3d:
            r6.getClass()
            if (r2 != 0) goto L43
            goto L4d
        L43:
            h81 r6 = r6.f5866
            q51 r2 = p000.q51.f8875
            r6.m2458(r2)
            p000.g81.m2286(r6, r1, r3)
        L4d:
            r0.clear()
        L50:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m5115() {
            r8 = this;
            int r0 = r8.f9416
            if (r0 <= 0) goto L5d
            int r1 = r8.f9413
            r2 = -1
            if (r1 < 0) goto L2d
            r8.m5114()
            ke r3 = r8.f9406
            h81 r3 = r3.f5866
            e61 r4 = p000.e61.f3420
            r3.m2458(r4)
            int r4 = r3.f4624
            o61[] r5 = r3.f4621
            int r6 = r3.f4622
            int r6 = r6 + (-1)
            r5 = r5[r6]
            int r5 = r5.f7964
            int r4 = r4 - r5
            int[] r3 = r3.f4623
            r3[r4] = r1
            int r4 = r4 + 1
            r3[r4] = r0
            r8.f9413 = r2
            goto L5a
        L2d:
            int r1 = r8.f9415
            int r3 = r8.f9414
            r8.m5114()
            ke r4 = r8.f9406
            h81 r4 = r4.f5866
            b61 r5 = p000.b61.f1500
            r4.m2458(r5)
            int r5 = r4.f4624
            o61[] r6 = r4.f4621
            int r7 = r4.f4622
            int r7 = r7 + (-1)
            r6 = r6[r7]
            int r6 = r6.f7964
            int r5 = r5 - r6
            int[] r4 = r4.f4623
            int r6 = r5 + 1
            r4[r6] = r1
            r4[r5] = r3
            int r5 = r5 + 2
            r4[r5] = r0
            r8.f9414 = r2
            r8.f9415 = r2
        L5a:
            r0 = 0
            r8.f9416 = r0
        L5d:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m5116(boolean r6) {
            r5 = this;
            v80 r0 = r5.f9405
            nw1 r0 = r0.f11142
            if (r6 == 0) goto L9
            int r6 = r0.f7805
            goto Lb
        L9:
            int r6 = r0.f7803
        Lb:
            int r0 = r5.f9410
            int r0 = r6 - r0
            if (r0 < 0) goto L12
            goto L17
        L12:
            java.lang.String r1 = "Tried to seek backward"
            p000.AbstractC0804sn.m5526(r1)
        L17:
            if (r0 <= 0) goto L35
            ke r1 = r5.f9406
            h81 r1 = r1.f5866
            j51 r2 = p000.j51.f5323
            r1.m2458(r2)
            int[] r2 = r1.f4623
            int r3 = r1.f4624
            o61[] r4 = r1.f4621
            int r1 = r1.f4622
            int r1 = r1 + (-1)
            r1 = r4[r1]
            int r1 = r1.f7964
            int r3 = r3 - r1
            r2[r3] = r0
            r5.f9410 = r6
        L35:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m5117(int r3, int r4) {
            r2 = this;
            if (r4 <= 0) goto L2b
            if (r3 < 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid remove index "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p000.AbstractC0804sn.m5526(r0)
        L1a:
            int r0 = r2.f9413
            if (r0 != r3) goto L24
            int r3 = r2.f9416
            int r3 = r3 + r4
            r2.f9416 = r3
            return
        L24:
            r2.m5115()
            r2.f9413 = r3
            r2.f9416 = r4
        L2b:
            return
    }
}
