package p000;

/* JADX INFO: renamed from: rw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0776rw implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9533;

    /* JADX INFO: renamed from: ζ */
    public final java.util.Iterator f9534;

    /* JADX INFO: renamed from: η */
    public int f9535;

    public C0776rw(java.util.Iterator r2) {
            r1 = this;
            r0 = 1
            r1.f9533 = r0
            r2.getClass()
            r1.<init>()
            r1.f9534 = r2
            return
    }

    public C0776rw(p000.C0813sw r2) {
            r1 = this;
            r0 = 0
            r1.f9533 = r0
            r1.<init>()
            ss1 r0 = r2.f10057
            java.util.Iterator r0 = r0.iterator()
            r1.f9534 = r0
            int r2 = r2.f10058
            r1.f9535 = r2
            return
    }

    public C0776rw(p000.C0813sw r1, byte r2) {
            r0 = this;
            r2 = 2
            r0.f9533 = r2
            r0.<init>()
            int r2 = r1.f10058
            r0.f9535 = r2
            ss1 r1 = r1.f10057
            java.util.Iterator r1 = r1.iterator()
            r0.f9534 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f9533
            switch(r0) {
                case 0: goto L1c;
                case 1: goto L15;
                default: goto L5;
            }
        L5:
            int r0 = r2.f9535
            if (r0 <= 0) goto L13
            java.util.Iterator r2 = r2.f9534
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
        L15:
            java.util.Iterator r2 = r2.f9534
            boolean r2 = r2.hasNext()
            return r2
        L1c:
            int r0 = r2.f9535
            java.util.Iterator r1 = r2.f9534
            if (r0 <= 0) goto L32
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L32
            r1.next()
            int r0 = r2.f9535
            int r0 = r0 + (-1)
            r2.f9535 = r0
            goto L1c
        L32:
            boolean r2 = r1.hasNext()
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f9533
            switch(r0) {
                case 0: goto L32;
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            int r0 = r3.f9535
            if (r0 == 0) goto L14
            int r0 = r0 + (-1)
            r3.f9535 = r0
            java.util.Iterator r3 = r3.f9534
            java.lang.Object r3 = r3.next()
            goto L18
        L14:
            p000.C1080.m7277()
            r3 = 0
        L18:
            return r3
        L19:
            ql0 r0 = new ql0
            int r1 = r3.f9535
            int r2 = r1 + 1
            r3.f9535 = r2
            if (r1 < 0) goto L2d
            java.util.Iterator r3 = r3.f9534
            java.lang.Object r3 = r3.next()
            r0.<init>(r1, r3)
            return r0
        L2d:
            p000.AbstractC1021yh.m6917()
            r3 = 0
            throw r3
        L32:
            int r0 = r3.f9535
            java.util.Iterator r1 = r3.f9534
            if (r0 <= 0) goto L48
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L48
            r1.next()
            int r0 = r3.f9535
            int r0 = r0 + (-1)
            r3.f9535 = r0
            goto L32
        L48:
            java.lang.Object r3 = r1.next()
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            int r1 = r1.f9533
            switch(r1) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        L15:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
