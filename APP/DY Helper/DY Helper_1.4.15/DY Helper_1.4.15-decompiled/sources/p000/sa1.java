package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sa1 extends p000.AbstractC1100 {

    /* JADX INFO: renamed from: η */
    public final p000.qa1 f9777;

    /* JADX INFO: renamed from: θ */
    public int f9778;

    /* JADX INFO: renamed from: ι */
    public p000.y52 f9779;

    /* JADX INFO: renamed from: κ */
    public int f9780;

    public sa1(p000.qa1 r2, int r3) {
            r1 = this;
            int r0 = r2.f8942
            r1.<init>(r3, r0)
            r1.f9777 = r2
            int r2 = r2.m4830()
            r1.f9778 = r2
            r2 = -1
            r1.f9780 = r2
            r1.m5380()
            return
    }

    @Override // p000.AbstractC1100, java.util.ListIterator
    public final void add(java.lang.Object r3) {
            r2 = this;
            r2.m5379()
            int r0 = r2.f13424
            qa1 r1 = r2.f9777
            r1.add(r0, r3)
            int r3 = r2.f13424
            int r3 = r3 + 1
            r2.f13424 = r3
            int r3 = r1.mo4827()
            r2.f13425 = r3
            int r3 = r1.m4830()
            r2.f9778 = r3
            r3 = -1
            r2.f9780 = r3
            r2.m5380()
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            r4.m5379()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            int r0 = r4.f13424
            r4.f9780 = r0
            y52 r1 = r4.f9779
            qa1 r2 = r4.f9777
            if (r1 != 0) goto L1c
            java.lang.Object[] r1 = r2.f8941
            int r2 = r0 + 1
            r4.f13424 = r2
            r4 = r1[r0]
            return r4
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            int r0 = r4.f13424
            int r0 = r0 + 1
            r4.f13424 = r0
            java.lang.Object r4 = r1.next()
            return r4
        L2d:
            java.lang.Object[] r0 = r2.f8941
            int r2 = r4.f13424
            int r3 = r2 + 1
            r4.f13424 = r3
            int r4 = r1.f13425
            int r2 = r2 - r4
            r4 = r0[r2]
            return r4
        L3b:
            p000.C1080.m7277()
            r4 = 0
            return r4
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r4 = this;
            r4.m5379()
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L35
            int r0 = r4.f13424
            int r1 = r0 + (-1)
            r4.f9780 = r1
            y52 r1 = r4.f9779
            qa1 r2 = r4.f9777
            if (r1 != 0) goto L1e
            java.lang.Object[] r1 = r2.f8941
            int r0 = r0 + (-1)
            r4.f13424 = r0
            r4 = r1[r0]
            return r4
        L1e:
            int r3 = r1.f13425
            if (r0 <= r3) goto L2c
            java.lang.Object[] r1 = r2.f8941
            int r0 = r0 + (-1)
            r4.f13424 = r0
            int r0 = r0 - r3
            r4 = r1[r0]
            return r4
        L2c:
            int r0 = r0 + (-1)
            r4.f13424 = r0
            java.lang.Object r4 = r1.previous()
            return r4
        L35:
            p000.C1080.m7277()
            r4 = 0
            return r4
    }

    @Override // p000.AbstractC1100, java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r4 = this;
            r4.m5379()
            int r0 = r4.f9780
            r1 = -1
            if (r0 == r1) goto L27
            qa1 r2 = r4.f9777
            r2.mo4828(r0)
            int r0 = r4.f9780
            int r3 = r4.f13424
            if (r0 >= r3) goto L15
            r4.f13424 = r0
        L15:
            int r0 = r2.mo4827()
            r4.f13425 = r0
            int r0 = r2.m4830()
            r4.f9778 = r0
            r4.f9780 = r1
            r4.m5380()
            return
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
    }

    @Override // p000.AbstractC1100, java.util.ListIterator
    public final void set(java.lang.Object r3) {
            r2 = this;
            r2.m5379()
            int r0 = r2.f9780
            r1 = -1
            if (r0 == r1) goto L17
            qa1 r1 = r2.f9777
            r1.set(r0, r3)
            int r3 = r1.m4830()
            r2.f9778 = r3
            r2.m5380()
            return
        L17:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
    }

    /* JADX INFO: renamed from: α */
    public final void m5379() {
            r1 = this;
            int r0 = r1.f9778
            qa1 r1 = r1.f9777
            int r1 = r1.m4830()
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: β */
    public final void m5380() {
            r6 = this;
            qa1 r0 = r6.f9777
            java.lang.Object[] r1 = r0.f8940
            if (r1 != 0) goto La
            r0 = 0
            r6.f9779 = r0
            return
        La:
            int r2 = r0.f8942
            r3 = 1
            int r2 = r2 - r3
            r2 = r2 & (-32)
            int r4 = r6.f13424
            if (r4 <= r2) goto L15
            r4 = r2
        L15:
            int r0 = r0.f8938
            int r0 = r0 / 5
            int r0 = r0 + r3
            y52 r5 = r6.f9779
            if (r5 != 0) goto L26
            y52 r3 = new y52
            r3.<init>(r1, r4, r2, r0)
            r6.f9779 = r3
            return
        L26:
            r5.f13424 = r4
            r5.f13425 = r2
            r5.f12461 = r0
            java.lang.Object[] r6 = r5.f12462
            int r6 = r6.length
            if (r6 >= r0) goto L35
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r5.f12462 = r6
        L35:
            java.lang.Object[] r6 = r5.f12462
            r0 = 0
            r6[r0] = r1
            if (r4 != r2) goto L3d
            r0 = r3
        L3d:
            r5.f12463 = r0
            int r4 = r4 - r0
            r5.m6837(r4, r3)
            return
    }
}
