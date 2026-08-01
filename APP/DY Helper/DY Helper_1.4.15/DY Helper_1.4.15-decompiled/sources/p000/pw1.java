package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pw1 implements p000.InterfaceC0953wn, java.lang.Iterable, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.ow1 f8747;

    /* JADX INFO: renamed from: ζ */
    public final int f8748;

    /* JADX INFO: renamed from: η */
    public final int f8749;

    public pw1(p000.ow1 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f8747 = r1
            r0.f8748 = r2
            r0.f8749 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.pw1
            if (r0 == 0) goto L1e
            pw1 r3 = (p000.pw1) r3
            int r0 = r3.f8748
            int r1 = r2.f8748
            if (r0 != r1) goto L1e
            int r0 = r3.f8749
            int r1 = r2.f8749
            if (r0 != r1) goto L1e
            ow1 r3 = r3.f8747
            ow1 r2 = r2.f8747
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1e
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            ow1 r0 = r1.f8747
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.f8748
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r5 = this;
            ow1 r0 = r5.f8747
            int r1 = r0.f8293
            int r2 = r5.f8749
            if (r1 == r2) goto Lb
            p000.qw1.m4950()
        Lb:
            int r5 = r5.f8748
            r0.m4305(r5)
            lc0 r1 = new lc0
            int r2 = r5 + 1
            int[] r3 = r0.f8286
            int r4 = r5 * 5
            int r4 = r4 + 3
            r3 = r3[r4]
            int r3 = r3 + r5
            r1.<init>(r0, r2, r3)
            return r1
    }
}
