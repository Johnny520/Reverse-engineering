package p000;

/* JADX INFO: renamed from: V3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0906V3 extends AbstractViewOnTouchListenerC1266ci {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1245c4 f2824j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1394f4 f2825k;

    public C0906V3(C1394f4 r1, C1394f4 r2, C1245c4 r3) {
        this.f2825k = r1;
        this.f2824j = r3;
        super(r2);
    }

    @Override // p000.AbstractViewOnTouchListenerC1266ci
    /* JADX INFO: renamed from: b */
    public final InterfaceC2168ky mo1753b() {
        return this.f2824j;
    }

    @Override // p000.AbstractViewOnTouchListenerC1266ci
    /* JADX INFO: renamed from: c */
    public final boolean mo1754c() {
        C1394f4 r0 = this.f2825k;
        if (r0.getInternalPopup().mo1971a() == true) goto L7;
        r0.f4954f.mo1979m(r0.getTextDirection(), r0.getTextAlignment());
        return true;
    L7:
        return true;
    }
}
