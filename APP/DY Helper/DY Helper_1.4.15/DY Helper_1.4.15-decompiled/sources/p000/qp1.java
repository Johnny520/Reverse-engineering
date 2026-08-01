package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qp1 extends p000.tp1 implements java.util.Iterator {

    /* JADX INFO: renamed from: ε */
    public p000.rp1 f9074;

    /* JADX INFO: renamed from: ζ */
    public p000.rp1 f9075;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f9076;

    public qp1(p000.rp1 r1, p000.rp1 r2, int r3) {
            r0 = this;
            r0.f9076 = r3
            r0.<init>()
            r0.f9074 = r2
            r0.f9075 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            rp1 r0 = r0.f9075
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            rp1 r0 = r2.f9075
            rp1 r1 = r2.f9074
            if (r0 == r1) goto Le
            if (r1 != 0) goto L9
            goto Le
        L9:
            rp1 r1 = r2.m4941(r0)
            goto Lf
        Le:
            r1 = 0
        Lf:
            r2.f9075 = r1
            return r0
    }

    @Override // p000.tp1
    /* JADX INFO: renamed from: α */
    public final void mo4940(p000.rp1 r4) {
            r3 = this;
            rp1 r0 = r3.f9074
            r1 = 0
            if (r0 != r4) goto Ld
            rp1 r0 = r3.f9075
            if (r4 != r0) goto Ld
            r3.f9075 = r1
            r3.f9074 = r1
        Ld:
            rp1 r0 = r3.f9074
            if (r0 != r4) goto L1d
            int r2 = r3.f9076
            switch(r2) {
                case 0: goto L19;
                default: goto L16;
            }
        L16:
            rp1 r0 = r0.f9434
            goto L1b
        L19:
            rp1 r0 = r0.f9435
        L1b:
            r3.f9074 = r0
        L1d:
            rp1 r0 = r3.f9075
            if (r0 != r4) goto L2e
            rp1 r4 = r3.f9074
            if (r0 == r4) goto L2c
            if (r4 != 0) goto L28
            goto L2c
        L28:
            rp1 r1 = r3.m4941(r0)
        L2c:
            r3.f9075 = r1
        L2e:
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.rp1 m4941(p000.rp1 r1) {
            r0 = this;
            int r0 = r0.f9076
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            rp1 r0 = r1.f9435
            return r0
        L8:
            rp1 r0 = r1.f9434
            return r0
    }
}
