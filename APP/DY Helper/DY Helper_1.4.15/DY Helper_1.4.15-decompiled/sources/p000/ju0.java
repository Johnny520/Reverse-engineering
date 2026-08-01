package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ju0 {

    /* JADX INFO: renamed from: α */
    public final p000.C0568n f5583;

    /* JADX INFO: renamed from: β */
    public boolean f5584;

    /* JADX INFO: renamed from: γ */
    public int f5585;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ p000.p11 f5586;

    public ju0(p000.p11 r1, p000.C0568n r2) {
            r0 = this;
            r0.<init>()
            r0.f5586 = r1
            r1 = -1
            r0.f5585 = r1
            r0.f5583 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2988(boolean r4) {
            r3 = this;
            boolean r0 = r3.f5584
            if (r4 != r0) goto L5
            goto L2b
        L5:
            r3.f5584 = r4
            r0 = 1
            if (r4 == 0) goto Lc
            r4 = r0
            goto Ld
        Lc:
            r4 = -1
        Ld:
            p11 r1 = r3.f5586
            int r2 = r1.f8386
            int r4 = r4 + r2
            r1.f8386 = r4
            boolean r4 = r1.f8387
            if (r4 == 0) goto L19
            goto L24
        L19:
            r1.f8387 = r0
        L1b:
            r4 = 0
            int r0 = r1.f8386     // Catch: java.lang.Throwable -> L2c
            if (r2 == r0) goto L22
            r2 = r0
            goto L1b
        L22:
            r1.f8387 = r4
        L24:
            boolean r4 = r3.f5584
            if (r4 == 0) goto L2b
            r1.m4379(r3)
        L2b:
            return
        L2c:
            r3 = move-exception
            r1.f8387 = r4
            throw r3
    }
}
