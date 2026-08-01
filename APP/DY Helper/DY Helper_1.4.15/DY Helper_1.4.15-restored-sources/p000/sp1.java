package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sp1 extends p000.tp1 implements java.util.Iterator {

    /* JADX INFO: renamed from: ε */
    public p000.rp1 f9986;

    /* JADX INFO: renamed from: ζ */
    public boolean f9987;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.up1 f9988;

    public sp1(p000.up1 r1) {
            r0 = this;
            r0.<init>()
            r0.f9988 = r1
            r1 = 1
            r0.f9987 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f9987
            if (r0 == 0) goto Lb
            up1 r1 = r1.f9988
            rp1 r1 = r1.f10925
            if (r1 == 0) goto L15
            goto L13
        Lb:
            rp1 r1 = r1.f9986
            if (r1 == 0) goto L15
            rp1 r1 = r1.f9434
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            boolean r0 = r1.f9987
            if (r0 == 0) goto Le
            r0 = 0
            r1.f9987 = r0
            up1 r0 = r1.f9988
            rp1 r0 = r0.f10925
            r1.f9986 = r0
            goto L18
        Le:
            rp1 r0 = r1.f9986
            if (r0 == 0) goto L15
            rp1 r0 = r0.f9434
            goto L16
        L15:
            r0 = 0
        L16:
            r1.f9986 = r0
        L18:
            rp1 r1 = r1.f9986
            return r1
    }

    @Override // p000.tp1
    /* JADX INFO: renamed from: α */
    public final void mo4940(p000.rp1 r2) {
            r1 = this;
            rp1 r0 = r1.f9986
            if (r2 != r0) goto Lf
            rp1 r2 = r0.f9435
            r1.f9986 = r2
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.f9987 = r2
        Lf:
            return
    }
}
