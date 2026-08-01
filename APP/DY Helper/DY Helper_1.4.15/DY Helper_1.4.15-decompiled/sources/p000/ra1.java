package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 extends p000.AbstractC1100 {

    /* JADX INFO: renamed from: η */
    public final java.lang.Object[] f9314;

    /* JADX INFO: renamed from: θ */
    public final p000.y52 f9315;

    public ra1(java.lang.Object[] r1, java.lang.Object[] r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r3, r4)
            r0.f9314 = r2
            int r4 = r4 + (-1)
            r2 = r4 & (-32)
            if (r3 <= r2) goto Lc
            r3 = r2
        Lc:
            y52 r4 = new y52
            r4.<init>(r1, r3, r2, r5)
            r0.f9315 = r4
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            y52 r0 = r3.f9315
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            int r1 = r3.f13424
            int r1 = r1 + 1
            r3.f13424 = r1
            java.lang.Object r3 = r0.next()
            return r3
        L19:
            int r1 = r3.f13424
            int r2 = r1 + 1
            r3.f13424 = r2
            int r0 = r0.f13425
            int r1 = r1 - r0
            java.lang.Object[] r3 = r3.f9314
            r3 = r3[r1]
            return r3
        L27:
            p000.C1080.m7277()
            r3 = 0
            return r3
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r3 = this;
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L21
            int r0 = r3.f13424
            y52 r1 = r3.f9315
            int r2 = r1.f13425
            if (r0 <= r2) goto L18
            int r0 = r0 + (-1)
            r3.f13424 = r0
            int r0 = r0 - r2
            java.lang.Object[] r3 = r3.f9314
            r3 = r3[r0]
            return r3
        L18:
            int r0 = r0 + (-1)
            r3.f13424 = r0
            java.lang.Object r3 = r1.previous()
            return r3
        L21:
            p000.C1080.m7277()
            r3 = 0
            return r3
    }
}
