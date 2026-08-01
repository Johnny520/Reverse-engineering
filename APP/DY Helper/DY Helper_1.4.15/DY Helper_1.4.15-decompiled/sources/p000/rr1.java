package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rr1 {

    /* JADX INFO: renamed from: α */
    public final byte[] f9471;

    /* JADX INFO: renamed from: β */
    public int f9472;

    /* JADX INFO: renamed from: γ */
    public int f9473;

    /* JADX INFO: renamed from: δ */
    public boolean f9474;

    /* JADX INFO: renamed from: ε */
    public final boolean f9475;

    /* JADX INFO: renamed from: ζ */
    public p000.rr1 f9476;

    /* JADX INFO: renamed from: η */
    public p000.rr1 f9477;

    public rr1() {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.f9471 = r0
            r0 = 1
            r1.f9475 = r0
            r0 = 0
            r1.f9474 = r0
            return
    }

    public rr1(byte[] r1, int r2, int r3, boolean r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f9471 = r1
            r0.f9472 = r2
            r0.f9473 = r3
            r0.f9474 = r4
            r1 = 0
            r0.f9475 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.rr1 m5123() {
            r4 = this;
            rr1 r0 = r4.f9476
            r1 = 0
            if (r0 == r4) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            rr1 r2 = r4.f9477
            r2.getClass()
            rr1 r3 = r4.f9476
            r2.f9476 = r3
            rr1 r2 = r4.f9476
            r2.getClass()
            rr1 r3 = r4.f9477
            r2.f9477 = r3
            r4.f9476 = r1
            r4.f9477 = r1
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final void m5124(p000.rr1 r2) {
            r1 = this;
            r2.getClass()
            r2.f9477 = r1
            rr1 r0 = r1.f9476
            r2.f9476 = r0
            rr1 r0 = r1.f9476
            r0.getClass()
            r0.f9477 = r2
            r1.f9476 = r2
            return
    }

    /* JADX INFO: renamed from: γ */
    public final p000.rr1 m5125() {
            r4 = this;
            r0 = 1
            r4.f9474 = r0
            rr1 r1 = new rr1
            int r2 = r4.f9472
            int r3 = r4.f9473
            byte[] r4 = r4.f9471
            r1.<init>(r4, r2, r3, r0)
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final void m5126(p000.rr1 r6, int r7) {
            r5 = this;
            r6.getClass()
            byte[] r0 = r6.f9471
            boolean r1 = r6.f9475
            if (r1 == 0) goto L4a
            int r1 = r6.f9473
            int r2 = r1 + r7
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 <= r3) goto L34
            boolean r4 = r6.f9474
            if (r4 != 0) goto L2e
            int r4 = r6.f9472
            int r2 = r2 - r4
            if (r2 > r3) goto L28
            r2 = 0
            p000.AbstractC0312g7.m2236(r0, r0, r2, r4, r1)
            int r1 = r6.f9473
            int r3 = r6.f9472
            int r1 = r1 - r3
            r6.f9473 = r1
            r6.f9472 = r2
            goto L34
        L28:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L2e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L34:
            int r1 = r6.f9473
            int r2 = r5.f9472
            int r3 = r2 + r7
            byte[] r4 = r5.f9471
            p000.AbstractC0312g7.m2236(r4, r0, r1, r2, r3)
            int r0 = r6.f9473
            int r0 = r0 + r7
            r6.f9473 = r0
            int r6 = r5.f9472
            int r6 = r6 + r7
            r5.f9472 = r6
            return
        L4a:
            java.lang.String r5 = "only owner can write"
            p000.C1080.m7279(r5)
            return
    }
}
