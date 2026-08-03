package p000;

/* JADX INFO: renamed from: V3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0906V3 extends AbstractViewOnTouchListenerC1266ci {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1245c4 f2824j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1394f4 f2825k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0906V3(C1394f4 c1394f4, C1394f4 c1394f42, C1245c4 c1245c4) {
        super(c1394f42);
        this.f2825k = c1394f4;
        this.f2824j = c1245c4;
    }

    @Override // p000.AbstractViewOnTouchListenerC1266ci
    /* JADX INFO: renamed from: b */
    public final InterfaceC2168ky mo1753b() {
        return this.f2824j;
    }

    @Override // p000.AbstractViewOnTouchListenerC1266ci
    /* JADX INFO: renamed from: c */
    public final boolean mo1754c() {
        C1394f4 c1394f4 = this.f2825k;
        if (c1394f4.getInternalPopup().mo1971a()) {
            return true;
        }
        c1394f4.f4954f.mo1979m(c1394f4.getTextDirection(), c1394f4.getTextAlignment());
        return true;
    }
}
