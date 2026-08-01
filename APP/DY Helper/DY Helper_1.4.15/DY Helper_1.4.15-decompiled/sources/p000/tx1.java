package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tx1 implements p000.InterfaceC0953wn, java.lang.Iterable, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.ow1 f10491;

    /* JADX INFO: renamed from: ζ */
    public final int f10492;

    /* JADX INFO: renamed from: η */
    public final p000.dn1 f10493;

    public tx1(p000.ow1 r1, int r2, p000.x80 r3, p000.dn1 r4) {
            r0 = this;
            r0.<init>()
            r0.f10491 = r1
            r0.f10492 = r2
            r0.f10493 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.tx1
            if (r0 == 0) goto L22
            tx1 r3 = (p000.tx1) r3
            int r0 = r3.f10492
            int r1 = r2.f10492
            if (r0 != r1) goto L22
            ow1 r0 = r3.f10491
            ow1 r1 = r2.f10491
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22
            dn1 r3 = r3.f10493
            dn1 r2 = r2.f10493
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L22
            r2 = 1
            return r2
        L22:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f10492
            int r0 = r0 * 31
            ow1 r1 = r2.f10491
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            dn1 r2 = r2.f10493
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            sx1 r0 = new sx1
            r1 = 0
            dn1 r2 = r4.f10493
            ow1 r3 = r4.f10491
            int r4 = r4.f10492
            r0.<init>(r3, r4, r1, r2)
            return r0
    }
}
