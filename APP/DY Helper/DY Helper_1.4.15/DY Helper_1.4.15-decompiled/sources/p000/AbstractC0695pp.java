package p000;

/* JADX INFO: renamed from: pp */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0695pp extends p000.AbstractC0715q8 {

    /* JADX INFO: renamed from: ζ */
    public final p000.InterfaceC0880up f8639;

    /* JADX INFO: renamed from: η */
    public transient p000.InterfaceC0631op f8640;

    public AbstractC0695pp(p000.InterfaceC0631op r2) {
            r1 = this;
            if (r2 == 0) goto L7
            up r0 = r2.mo72()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
    }

    public AbstractC0695pp(p000.InterfaceC0631op r1, p000.InterfaceC0880up r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f8639 = r2
            return
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public p000.InterfaceC0880up mo72() {
            r0 = this;
            up r0 = r0.f8639
            r0.getClass()
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: λ */
    public void mo4562() {
            r4 = this;
            op r0 = r4.f8640
            if (r0 == 0) goto L32
            if (r0 == r4) goto L32
            up r1 = r4.mo72()
            x r2 = p000.C0966x.f11916
            sp r1 = r1.mo1785(r2)
            r1.getClass()
            kotlinx.coroutines.α r1 = (kotlinx.coroutines.AbstractC0479) r1
            gt r0 = (p000.C0334gt) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.C0334gt.f4444
        L19:
            java.lang.Object r2 = r1.get(r0)
            uy r3 = p000.jx0.f5622
            if (r2 == r3) goto L19
            java.lang.Object r0 = r1.get(r0)
            boolean r1 = r0 instanceof p000.C0015ae
            if (r1 == 0) goto L2c
            ae r0 = (p000.C0015ae) r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            if (r0 == 0) goto L32
            r0.m84()
        L32:
            nm r0 = p000.C0591nm.f7670
            r4.f8640 = r0
            return
    }
}
