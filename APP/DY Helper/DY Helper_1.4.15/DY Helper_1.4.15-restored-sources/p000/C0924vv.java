package p000;

/* JADX INFO: renamed from: vv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0924vv {

    /* JADX INFO: renamed from: α */
    public p000.wa0 f11413;

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList f11414;

    /* JADX INFO: renamed from: γ */
    public p000.wa0 f11415;

    /* JADX INFO: renamed from: δ */
    public int f11416;

    /* JADX INFO: renamed from: ε */
    public final p000.t91 f11417;

    /* JADX INFO: renamed from: ζ */
    public int f11418;

    /* JADX INFO: renamed from: η */
    public final java.lang.String[] f11419;

    /* JADX INFO: renamed from: θ */
    public final int[] f11420;

    /* JADX INFO: renamed from: ι */
    public final int[] f11421;

    /* JADX INFO: renamed from: κ */
    public final p000.AbstractC0401in[] f11422;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ p000.C0055aw f11423;

    public C0924vv(p000.C0055aw r3) {
            r2 = this;
            r2.<init>()
            r2.f11423 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f11414 = r3
            r3 = 1
            r2.f11416 = r3
            t91 r0 = new t91
            r1 = 0
            r0.<init>(r1)
            r2.f11417 = r0
            r2.f11418 = r3
            java.lang.String r3 = ""
            java.lang.String[] r3 = new java.lang.String[]{r3, r3}
            r2.f11419 = r3
            r3 = -1
            int[] r0 = new int[]{r3, r3}
            r2.f11420 = r0
            int[] r3 = new int[]{r3, r3}
            r2.f11421 = r3
            r3 = 2
            in[] r3 = new p000.AbstractC0401in[r3]
            r2.f11422 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.wa0 m6275(int r4) {
            r3 = this;
            aw r0 = r3.f11423
            androidx.compose.ui.platform.AndroidComposeView r0 = p000.h62.m2446(r0)
            ua0 r0 = r0.getGraphicsContext()
        La:
            java.util.ArrayList r1 = r3.f11414
            int r2 = r1.size()
            if (r2 > r4) goto L1a
            wa0 r2 = r0.mo3470()
            r1.add(r2)
            goto La
        L1a:
            java.lang.Object r3 = r1.get(r4)
            wa0 r3 = (p000.wa0) r3
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final void m6276() {
            r5 = this;
            aw r0 = r5.f11423
            androidx.compose.ui.platform.AndroidComposeView r0 = p000.h62.m2446(r0)
            ua0 r0 = r0.getGraphicsContext()
            wa0 r1 = r5.f11413
            if (r1 == 0) goto L11
            r0.mo3469(r1)
        L11:
            r1 = 0
            r5.f11413 = r1
            java.util.ArrayList r2 = r5.f11414
            java.util.Iterator r3 = r2.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2a
            java.lang.Object r4 = r3.next()
            wa0 r4 = (p000.wa0) r4
            r0.mo3469(r4)
            goto L1a
        L2a:
            r2.clear()
            wa0 r2 = r5.f11415
            if (r2 == 0) goto L34
            r0.mo3469(r2)
        L34:
            r5.f11415 = r1
            in[] r0 = r5.f11422
            p000.AbstractC0312g7.m2246(r1, r0)
            java.lang.String[] r0 = r5.f11419
            java.lang.String r1 = ""
            p000.AbstractC0312g7.m2246(r1, r0)
            int[] r0 = r5.f11420
            p000.AbstractC0312g7.m2247(r0)
            int[] r5 = r5.f11421
            p000.AbstractC0312g7.m2247(r5)
            return
    }
}
