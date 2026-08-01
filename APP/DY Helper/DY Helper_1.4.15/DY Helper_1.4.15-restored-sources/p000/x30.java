package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x30 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12025;

    /* JADX INFO: renamed from: ζ */
    public final java.util.Iterator f12026;

    /* JADX INFO: renamed from: η */
    public int f12027;

    /* JADX INFO: renamed from: θ */
    public java.lang.Object f12028;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.ss1 f12029;

    public x30(p000.c40 r2) {
            r1 = this;
            r0 = 1
            r1.f12025 = r0
            r1.<init>()
            r1.f12029 = r2
            ss1 r2 = r2.f1961
            java.util.Iterator r2 = r2.iterator()
            r1.f12026 = r2
            return
    }

    public x30(p000.y30 r2) {
            r1 = this;
            r0 = 0
            r1.f12025 = r0
            r1.<init>()
            r1.f12029 = r2
            ss1 r2 = r2.f12436
            java.util.Iterator r2 = r2.iterator()
            r1.f12026 = r2
            r2 = -1
            r1.f12027 = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f12025
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            int r0 = r2.f12027
            r1 = 1
            if (r0 != r1) goto Lb
            goto L14
        Lb:
            r1 = 2
            if (r0 != r1) goto L10
            r1 = 0
            goto L14
        L10:
            boolean r1 = r2.m6512()
        L14:
            return r1
        L15:
            int r0 = r2.f12027
            r1 = -1
            if (r0 != r1) goto L1d
            r2.m6511()
        L1d:
            int r2 = r2.f12027
            r0 = 1
            if (r2 != r0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f12025
            switch(r0) {
                case 0: goto L2c;
                default: goto L5;
            }
        L5:
            int r0 = r3.f12027
            r1 = 2
            if (r0 == r1) goto L27
            if (r0 != 0) goto L18
            boolean r0 = r3.m6512()
            if (r0 == 0) goto L13
            goto L18
        L13:
            p000.C1080.m7277()
        L16:
            r3 = 0
            goto L2b
        L18:
            r0 = 0
            r3.f12027 = r0
            java.lang.Object r3 = r3.f12028
            java.util.Iterator r3 = (java.util.Iterator) r3
            r3.getClass()
            java.lang.Object r3 = r3.next()
            goto L2b
        L27:
            p000.C1080.m7277()
            goto L16
        L2b:
            return r3
        L2c:
            int r0 = r3.f12027
            r1 = -1
            if (r0 != r1) goto L34
            r3.m6511()
        L34:
            int r0 = r3.f12027
            if (r0 == 0) goto L40
            java.lang.Object r0 = r3.f12028
            r2 = 0
            r3.f12028 = r2
            r3.f12027 = r1
            goto L44
        L40:
            p000.C1080.m7277()
            r0 = 0
        L44:
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            int r1 = r1.f12025
            switch(r1) {
                case 0: goto Ld;
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
    }

    /* JADX INFO: renamed from: α */
    public void m6511() {
            r4 = this;
            ss1 r0 = r4.f12029
            y30 r0 = (p000.y30) r0
        L4:
            java.util.Iterator r1 = r4.f12026
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r1 = r1.next()
            a80 r2 = r0.f12438
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r0.f12437
            if (r2 != r3) goto L4
            r4.f12028 = r1
            r0 = 1
            r4.f12027 = r0
            return
        L26:
            r0 = 0
            r4.f12027 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public boolean m6512() {
            r4 = this;
            java.lang.Object r0 = r4.f12028
            java.util.Iterator r0 = (java.util.Iterator) r0
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L10
            r4.f12027 = r1
            return r1
        L10:
            java.util.Iterator r0 = r4.f12026
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r0 = r0.next()
            ss1 r2 = r4.f12029
            c40 r2 = (p000.c40) r2
            a80 r3 = r2.f1963
            a80 r2 = r2.f1962
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Object r0 = r3.invoke(r0)
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L10
            r4.f12028 = r0
            r4.f12027 = r1
            return r1
        L39:
            r0 = 2
            r4.f12027 = r0
            r0 = 0
            r4.f12028 = r0
            r4 = 0
            return r4
    }
}
