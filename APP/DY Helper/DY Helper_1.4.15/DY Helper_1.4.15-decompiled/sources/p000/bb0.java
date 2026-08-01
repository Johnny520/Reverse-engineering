package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bb0 {

    /* JADX INFO: renamed from: α */
    public final p000.C0319ge f1600;

    /* JADX INFO: renamed from: β */
    public final p000.C0282fe f1601;

    /* JADX INFO: renamed from: γ */
    public final android.graphics.RenderNode f1602;

    /* JADX INFO: renamed from: δ */
    public long f1603;

    /* JADX INFO: renamed from: ε */
    public android.graphics.Paint f1604;

    /* JADX INFO: renamed from: ζ */
    public android.graphics.Matrix f1605;

    /* JADX INFO: renamed from: η */
    public boolean f1606;

    /* JADX INFO: renamed from: θ */
    public float f1607;

    /* JADX INFO: renamed from: ι */
    public int f1608;

    /* JADX INFO: renamed from: κ */
    public float f1609;

    /* JADX INFO: renamed from: λ */
    public float f1610;

    /* JADX INFO: renamed from: μ */
    public float f1611;

    /* JADX INFO: renamed from: ν */
    public long f1612;

    /* JADX INFO: renamed from: ξ */
    public long f1613;

    /* JADX INFO: renamed from: ο */
    public float f1614;

    /* JADX INFO: renamed from: π */
    public boolean f1615;

    /* JADX INFO: renamed from: ρ */
    public boolean f1616;

    /* JADX INFO: renamed from: σ */
    public boolean f1617;

    /* JADX INFO: renamed from: τ */
    public p000.AbstractC0401in f1618;

    /* JADX INFO: renamed from: υ */
    public int f1619;

    public bb0() {
            r4 = this;
            ge r0 = new ge
            r0.<init>()
            fe r1 = new fe
            r1.<init>()
            r4.<init>()
            r4.f1600 = r0
            r4.f1601 = r1
            android.graphics.RenderNode r0 = new android.graphics.RenderNode
            java.lang.String r1 = "graphicsLayer"
            r0.<init>(r1)
            r4.f1602 = r0
            r1 = 0
            r4.f1603 = r1
            r1 = 0
            r0.setClipToBounds(r1)
            r4.m842(r0, r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.f1607 = r0
            r2 = 3
            r4.f1608 = r2
            r4.f1609 = r0
            r4.f1610 = r0
            long r2 = p000.C0114ci.f2120
            r4.f1612 = r2
            r4.f1613 = r2
            r0 = 1090519040(0x41000000, float:8.0)
            r4.f1614 = r0
            r4.f1619 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m841() {
            r4 = this;
            boolean r0 = r4.f1615
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            boolean r3 = r4.f1606
            if (r3 != 0) goto Lc
            r3 = r2
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r0 == 0) goto L14
            boolean r0 = r4.f1606
            if (r0 == 0) goto L14
            r1 = r2
        L14:
            boolean r0 = r4.f1616
            android.graphics.RenderNode r2 = r4.f1602
            if (r3 == r0) goto L1f
            r4.f1616 = r3
            r2.setClipToBounds(r3)
        L1f:
            boolean r0 = r4.f1617
            if (r1 == r0) goto L28
            r4.f1617 = r1
            r2.setClipToOutline(r1)
        L28:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m842(android.graphics.RenderNode r4, int r5) {
            r3 = this;
            r0 = 1
            if (r5 != r0) goto Lc
            android.graphics.Paint r3 = r3.f1604
            r4.setUseCompositingLayer(r0, r3)
            r4.setHasOverlappingRendering(r0)
            return
        Lc:
            android.graphics.Paint r3 = r3.f1604
            r1 = 0
            r2 = 2
            if (r5 != r2) goto L19
            r4.setUseCompositingLayer(r1, r3)
            r4.setHasOverlappingRendering(r1)
            return
        L19:
            r4.setUseCompositingLayer(r1, r3)
            r4.setHasOverlappingRendering(r0)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m843() {
            r5 = this;
            int r0 = r5.f1619
            android.graphics.RenderNode r1 = r5.f1602
            r2 = 1
            if (r0 != r2) goto L8
            goto L16
        L8:
            int r3 = r5.f1608
            r4 = 3
            if (r3 != r4) goto L16
            in r3 = r5.f1618
            if (r3 == 0) goto L12
            goto L16
        L12:
            r5.m842(r1, r0)
            return
        L16:
            r5.m842(r1, r2)
            return
    }
}
