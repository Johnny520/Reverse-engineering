package p000;

/* JADX INFO: renamed from: y6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1010y6 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public int f12464;

    /* JADX INFO: renamed from: ζ */
    public int f12465;

    /* JADX INFO: renamed from: η */
    public boolean f12466;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ int f12467;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f12468;

    public C1010y6(int r1) {
            r0 = this;
            r0.<init>()
            r0.f12464 = r1
            return
    }

    public C1010y6(p000.C0103c7 r1, int r2) {
            r0 = this;
            r0.f12467 = r2
            switch(r2) {
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            r0.f12468 = r1
            int r1 = r1.f4157
            r0.<init>(r1)
            return
        Ld:
            r0.f12468 = r1
            int r1 = r1.f4157
            r0.<init>(r1)
            return
    }

    public C1010y6(p000.C0202d7 r2) {
            r1 = this;
            r0 = 2
            r1.f12467 = r0
            r1.f12468 = r2
            int r2 = r2.f2931
            r1.<init>(r2)
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f12465
            int r1 = r1.f12464
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L30
            int r0 = r3.f12465
            int r1 = r3.f12467
            switch(r1) {
                case 0: goto L1f;
                case 1: goto L16;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r1 = r3.f12468
            d7 r1 = (p000.C0202d7) r1
            java.lang.Object[] r1 = r1.f2930
            r0 = r1[r0]
            goto L27
        L16:
            java.lang.Object r1 = r3.f12468
            c7 r1 = (p000.C0103c7) r1
            java.lang.Object r0 = r1.m2218(r0)
            goto L27
        L1f:
            java.lang.Object r1 = r3.f12468
            c7 r1 = (p000.C0103c7) r1
            java.lang.Object r0 = r1.m2215(r0)
        L27:
            int r1 = r3.f12465
            r2 = 1
            int r1 = r1 + r2
            r3.f12465 = r1
            r3.f12466 = r2
            return r0
        L30:
            p000.C1080.m7277()
            r3 = 0
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            boolean r0 = r2.f12466
            if (r0 == 0) goto L30
            int r0 = r2.f12465
            int r0 = r0 + (-1)
            r2.f12465 = r0
            int r1 = r2.f12467
            switch(r1) {
                case 0: goto L1f;
                case 1: goto L17;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r1 = r2.f12468
            d7 r1 = (p000.C0202d7) r1
            r1.m1669(r0)
            goto L26
        L17:
            java.lang.Object r1 = r2.f12468
            c7 r1 = (p000.C0103c7) r1
            r1.m2216(r0)
            goto L26
        L1f:
            java.lang.Object r1 = r2.f12468
            c7 r1 = (p000.C0103c7) r1
            r1.m2216(r0)
        L26:
            int r0 = r2.f12464
            int r0 = r0 + (-1)
            r2.f12464 = r0
            r0 = 0
            r2.f12466 = r0
            return
        L30:
            java.lang.String r2 = "Call next() before removing an element."
            p000.C1080.m7279(r2)
            return
    }
}
