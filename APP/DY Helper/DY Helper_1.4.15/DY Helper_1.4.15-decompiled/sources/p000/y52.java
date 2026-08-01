package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y52 extends p000.AbstractC1100 {

    /* JADX INFO: renamed from: η */
    public int f12461;

    /* JADX INFO: renamed from: θ */
    public java.lang.Object[] f12462;

    /* JADX INFO: renamed from: ι */
    public boolean f12463;

    public y52(java.lang.Object[] r3, int r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r4, r5)
            r2.f12461 = r6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r2.f12462 = r6
            r0 = 0
            r1 = 1
            if (r4 != r5) goto Lf
            r5 = r1
            goto L10
        Lf:
            r5 = r0
        L10:
            r2.f12463 = r5
            r6[r0] = r3
            int r4 = r4 - r5
            r2.m6837(r4, r1)
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r4.m6836()
            int r1 = r4.f13424
            r2 = 1
            int r1 = r1 + r2
            r4.f13424 = r1
            int r3 = r4.f13425
            if (r1 != r3) goto L17
            r4.f12463 = r2
            return r0
        L17:
            r1 = 0
            r4.m6838(r1)
            return r0
        L1c:
            p000.C1080.m7277()
            r4 = 0
            return r4
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L22
            int r0 = r1.f13424
            int r0 = r0 + (-1)
            r1.f13424 = r0
            boolean r0 = r1.f12463
            if (r0 == 0) goto L18
            r0 = 0
            r1.f12463 = r0
            java.lang.Object r1 = r1.m6836()
            return r1
        L18:
            r0 = 31
            r1.m6838(r0)
            java.lang.Object r1 = r1.m6836()
            return r1
        L22:
            p000.C1080.m7277()
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.Object m6836() {
            r2 = this;
            int r0 = r2.f13424
            r0 = r0 & 31
            java.lang.Object[] r1 = r2.f12462
            int r2 = r2.f12461
            int r2 = r2 + (-1)
            r2 = r1[r2]
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r2 = r2[r0]
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final void m6837(int r5, int r6) {
            r4 = this;
            int r0 = r4.f12461
            int r0 = r0 - r6
            int r0 = r0 * 5
        L5:
            int r1 = r4.f12461
            if (r6 >= r1) goto L21
            java.lang.Object[] r1 = r4.f12462
            int r2 = r6 + (-1)
            r2 = r1[r2]
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r3 = p000.i81.m2669(r5, r0)
            r2 = r2[r3]
            r1[r6] = r2
            int r0 = r0 + (-5)
            int r6 = r6 + 1
            goto L5
        L21:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m6838(int r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.f13424
            int r1 = p000.i81.m2669(r1, r0)
            if (r1 != r3) goto Lc
            int r0 = r0 + 5
            goto L1
        Lc:
            if (r0 <= 0) goto L1c
            int r3 = r2.f12461
            int r3 = r3 + (-1)
            int r0 = r0 / 5
            int r3 = r3 - r0
            int r0 = r2.f13424
            int r3 = r3 + 1
            r2.m6837(r0, r3)
        L1c:
            return
    }
}
