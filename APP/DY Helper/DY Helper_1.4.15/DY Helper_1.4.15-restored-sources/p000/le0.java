package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class le0 implements java.util.ListIterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6584;

    /* JADX INFO: renamed from: ζ */
    public int f6585;

    /* JADX INFO: renamed from: η */
    public int f6586;

    /* JADX INFO: renamed from: θ */
    public int f6587;

    /* JADX INFO: renamed from: ι */
    public final java.lang.Object f6588;

    public le0(p000.ix1 r2, int r3) {
            r1 = this;
            r0 = 3
            r1.f6584 = r0
            r1.<init>()
            r1.f6588 = r2
            int r3 = r3 + (-1)
            r1.f6585 = r3
            r3 = -1
            r1.f6586 = r3
            int r2 = p000.AbstractC0073bd.m889(r2)
            r1.f6587 = r2
            return
    }

    public le0(p000.ne0 r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.f6584 = r0
            r4 = r4 & 1
            if (r4 == 0) goto L8
            r3 = r0
        L8:
            v11 r4 = r2.f7580
            int r4 = r4.f11065
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public le0(p000.ne0 r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = 0
            r1.f6584 = r0
            r1.<init>()
            r1.f6588 = r2
            r1.f6585 = r3
            r1.f6586 = r4
            r1.f6587 = r5
            return
    }

    public le0(p000.yt0 r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f6584 = r0
            r1.<init>()
            r1.f6588 = r2
            r1.f6585 = r3
            r3 = -1
            r1.f6586 = r3
            int r2 = p000.yt0.m7024(r2)
            r1.f6587 = r2
            return
    }

    public le0(p000.zt0 r2, int r3) {
            r1 = this;
            r0 = 2
            r1.f6584 = r0
            r1.<init>()
            r1.f6588 = r2
            r1.f6585 = r3
            r3 = -1
            r1.f6586 = r3
            int r2 = p000.zt0.m7225(r2)
            r1.f6587 = r2
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f6584
            switch(r0) {
                case 0: goto L57;
                case 1: goto L3d;
                case 2: goto L23;
                default: goto L5;
            }
        L5:
            r3.m3551()
            java.lang.Object r0 = r3.f6588
            ix1 r0 = (p000.ix1) r0
            int r1 = r3.f6585
            int r1 = r1 + 1
            r0.add(r1, r4)
            r4 = -1
            r3.f6586 = r4
            int r4 = r3.f6585
            int r4 = r4 + 1
            r3.f6585 = r4
            int r4 = p000.AbstractC0073bd.m889(r0)
            r3.f6587 = r4
            return
        L23:
            r3.m3550()
            java.lang.Object r0 = r3.f6588
            zt0 r0 = (p000.zt0) r0
            int r1 = r3.f6585
            int r2 = r1 + 1
            r3.f6585 = r2
            r0.add(r1, r4)
            r4 = -1
            r3.f6586 = r4
            int r4 = p000.zt0.m7225(r0)
            r3.f6587 = r4
            return
        L3d:
            r3.m3549()
            java.lang.Object r0 = r3.f6588
            yt0 r0 = (p000.yt0) r0
            int r1 = r3.f6585
            int r2 = r1 + 1
            r3.f6585 = r2
            r0.add(r1, r4)
            r4 = -1
            r3.f6586 = r4
            int r4 = p000.yt0.m7024(r0)
            r3.f6587 = r4
            return
        L57:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Operation is not supported for read-only collection"
            r3.<init>(r4)
            throw r3
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f6584
            switch(r0) {
                case 0: goto L32;
                case 1: goto L24;
                case 2: goto L16;
                default: goto L5;
            }
        L5:
            int r0 = r2.f6585
            java.lang.Object r2 = r2.f6588
            ix1 r2 = (p000.ix1) r2
            int r2 = r2.size()
            r1 = 1
            int r2 = r2 - r1
            if (r0 >= r2) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
        L16:
            int r0 = r2.f6585
            java.lang.Object r2 = r2.f6588
            zt0 r2 = (p000.zt0) r2
            int r2 = r2.f13277
            if (r0 >= r2) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            return r2
        L24:
            int r0 = r2.f6585
            java.lang.Object r2 = r2.f6588
            yt0 r2 = (p000.yt0) r2
            int r2 = r2.f12785
            if (r0 >= r2) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            return r2
        L32:
            int r0 = r2.f6585
            int r2 = r2.f6587
            if (r0 >= r2) goto L3a
            r2 = 1
            goto L3b
        L3a:
            r2 = 0
        L3b:
            return r2
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f6584
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L15;
                case 2: goto Ld;
                default: goto L5;
            }
        L5:
            int r1 = r1.f6585
            if (r1 < 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
        Ld:
            int r1 = r1.f6585
            if (r1 <= 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
        L15:
            int r1 = r1.f6585
            if (r1 <= 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
        L1d:
            int r0 = r1.f6585
            int r1 = r1.f6586
            if (r0 <= r1) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = 0
        L26:
            return r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f6584
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L3d;
                case 2: goto L20;
                default: goto L5;
            }
        L5:
            r3.m3551()
            int r0 = r3.f6585
            int r0 = r0 + 1
            r3.f6586 = r0
            java.lang.Object r1 = r3.f6588
            ix1 r1 = (p000.ix1) r1
            int r2 = r1.size()
            p000.AbstractC0073bd.m870(r0, r2)
            java.lang.Object r1 = r1.get(r0)
            r3.f6585 = r0
            return r1
        L20:
            r3.m3550()
            int r0 = r3.f6585
            java.lang.Object r1 = r3.f6588
            zt0 r1 = (p000.zt0) r1
            int r2 = r1.f13277
            if (r0 >= r2) goto L38
            int r2 = r0 + 1
            r3.f6585 = r2
            r3.f6586 = r0
            java.lang.Object[] r3 = r1.f13276
            r3 = r3[r0]
            goto L3c
        L38:
            p000.C1080.m7277()
            r3 = 0
        L3c:
            return r3
        L3d:
            r3.m3549()
            int r0 = r3.f6585
            java.lang.Object r1 = r3.f6588
            yt0 r1 = (p000.yt0) r1
            int r2 = r1.f12785
            if (r0 >= r2) goto L58
            int r2 = r0 + 1
            r3.f6585 = r2
            r3.f6586 = r0
            java.lang.Object[] r3 = r1.f12783
            int r1 = r1.f12784
            int r1 = r1 + r0
            r3 = r3[r1]
            goto L5c
        L58:
            p000.C1080.m7277()
            r3 = 0
        L5c:
            return r3
        L5d:
            java.lang.Object r0 = r3.f6588
            ne0 r0 = (p000.ne0) r0
            v11 r0 = r0.f7580
            int r1 = r3.f6585
            int r2 = r1 + 1
            r3.f6585 = r2
            java.lang.Object r3 = r0.m6020(r1)
            r3.getClass()
            q01 r3 = (p000.q01) r3
            return r3
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f6584
            switch(r0) {
                case 0: goto L10;
                case 1: goto Ld;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r1.f6585
            int r1 = r1 + 1
            return r1
        La:
            int r1 = r1.f6585
            return r1
        Ld:
            int r1 = r1.f6585
            return r1
        L10:
            int r0 = r1.f6585
            int r1 = r1.f6586
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r3 = this;
            int r0 = r3.f6584
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L3f;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            r3.m3551()
            int r0 = r3.f6585
            java.lang.Object r1 = r3.f6588
            ix1 r1 = (p000.ix1) r1
            int r2 = r1.size()
            p000.AbstractC0073bd.m870(r0, r2)
            int r0 = r3.f6585
            r3.f6586 = r0
            java.lang.Object r0 = r1.get(r0)
            int r1 = r3.f6585
            int r1 = r1 + (-1)
            r3.f6585 = r1
            return r0
        L24:
            r3.m3550()
            int r0 = r3.f6585
            if (r0 <= 0) goto L3a
            int r0 = r0 + (-1)
            r3.f6585 = r0
            r3.f6586 = r0
            java.lang.Object r3 = r3.f6588
            zt0 r3 = (p000.zt0) r3
            java.lang.Object[] r3 = r3.f13276
            r3 = r3[r0]
            goto L3e
        L3a:
            p000.C1080.m7277()
            r3 = 0
        L3e:
            return r3
        L3f:
            r3.m3549()
            int r0 = r3.f6585
            if (r0 <= 0) goto L58
            int r0 = r0 + (-1)
            r3.f6585 = r0
            r3.f6586 = r0
            java.lang.Object r3 = r3.f6588
            yt0 r3 = (p000.yt0) r3
            java.lang.Object[] r1 = r3.f12783
            int r3 = r3.f12784
            int r3 = r3 + r0
            r3 = r1[r3]
            goto L5c
        L58:
            p000.C1080.m7277()
            r3 = 0
        L5c:
            return r3
        L5d:
            java.lang.Object r0 = r3.f6588
            ne0 r0 = (p000.ne0) r0
            v11 r0 = r0.f7580
            int r1 = r3.f6585
            int r1 = r1 + (-1)
            r3.f6585 = r1
            java.lang.Object r3 = r0.m6020(r1)
            r3.getClass()
            q01 r3 = (p000.q01) r3
            return r3
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f6584
            switch(r0) {
                case 0: goto L10;
                case 1: goto Ld;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            int r1 = r1.f6585
            return r1
        L8:
            int r1 = r1.f6585
        La:
            int r1 = r1 + (-1)
            return r1
        Ld:
            int r1 = r1.f6585
            goto La
        L10:
            int r0 = r1.f6585
            int r1 = r1.f6586
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r3 = this;
            int r0 = r3.f6584
            switch(r0) {
                case 0: goto L64;
                case 1: goto L42;
                case 2: goto L20;
                default: goto L5;
            }
        L5:
            r3.m3551()
            java.lang.Object r0 = r3.f6588
            ix1 r0 = (p000.ix1) r0
            int r1 = r3.f6586
            r0.remove(r1)
            int r1 = r3.f6585
            r2 = -1
            int r1 = r1 + r2
            r3.f6585 = r1
            r3.f6586 = r2
            int r0 = p000.AbstractC0073bd.m889(r0)
            r3.f6587 = r0
            return
        L20:
            java.lang.Object r0 = r3.f6588
            zt0 r0 = (p000.zt0) r0
            r3.m3550()
            int r1 = r3.f6586
            r2 = -1
            if (r1 == r2) goto L3c
            r0.mo4828(r1)
            int r1 = r3.f6586
            r3.f6585 = r1
            r3.f6586 = r2
            int r0 = p000.zt0.m7225(r0)
            r3.f6587 = r0
            goto L41
        L3c:
            java.lang.String r3 = "Call next() or previous() before removing element from the iterator."
            p000.C1080.m7279(r3)
        L41:
            return
        L42:
            java.lang.Object r0 = r3.f6588
            yt0 r0 = (p000.yt0) r0
            r3.m3549()
            int r1 = r3.f6586
            r2 = -1
            if (r1 == r2) goto L5e
            r0.mo4828(r1)
            int r1 = r3.f6586
            r3.f6585 = r1
            r3.f6586 = r2
            int r0 = p000.yt0.m7024(r0)
            r3.f6587 = r0
            goto L63
        L5e:
            java.lang.String r3 = "Call next() or previous() before removing element from the iterator."
            p000.C1080.m7279(r3)
        L63:
            return
        L64:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r3.<init>(r0)
            throw r3
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f6584
            switch(r0) {
                case 0: goto L4c;
                case 1: goto L36;
                case 2: goto L20;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f6588
            ix1 r0 = (p000.ix1) r0
            r2.m3551()
            int r1 = r2.f6586
            if (r1 < 0) goto L1a
            r0.set(r1, r3)
            int r3 = p000.AbstractC0073bd.m889(r0)
            r2.f6587 = r3
            goto L1f
        L1a:
            java.lang.String r2 = "Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()"
            p000.C1080.m7279(r2)
        L1f:
            return
        L20:
            r2.m3550()
            int r0 = r2.f6586
            r1 = -1
            if (r0 == r1) goto L30
            java.lang.Object r2 = r2.f6588
            zt0 r2 = (p000.zt0) r2
            r2.set(r0, r3)
            goto L35
        L30:
            java.lang.String r2 = "Call next() or previous() before replacing element from the iterator."
            p000.C1080.m7279(r2)
        L35:
            return
        L36:
            r2.m3549()
            int r0 = r2.f6586
            r1 = -1
            if (r0 == r1) goto L46
            java.lang.Object r2 = r2.f6588
            yt0 r2 = (p000.yt0) r2
            r2.set(r0, r3)
            goto L4b
        L46:
            java.lang.String r2 = "Call next() or previous() before replacing element from the iterator."
            p000.C1080.m7279(r2)
        L4b:
            return
        L4c:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Operation is not supported for read-only collection"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: α */
    public void m3549() {
            r1 = this;
            java.lang.Object r0 = r1.f6588
            yt0 r0 = (p000.yt0) r0
            zt0 r0 = r0.f12787
            int r0 = p000.zt0.m7225(r0)
            int r1 = r1.f6587
            if (r0 != r1) goto Lf
            return
        Lf:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: β */
    public void m3550() {
            r1 = this;
            java.lang.Object r0 = r1.f6588
            zt0 r0 = (p000.zt0) r0
            int r0 = p000.zt0.m7225(r0)
            int r1 = r1.f6587
            if (r0 != r1) goto Ld
            return
        Ld:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: γ */
    public void m3551() {
            r1 = this;
            java.lang.Object r0 = r1.f6588
            ix1 r0 = (p000.ix1) r0
            int r0 = p000.AbstractC0073bd.m889(r0)
            int r1 = r1.f6587
            if (r0 != r1) goto Ld
            return
        Ld:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }
}
