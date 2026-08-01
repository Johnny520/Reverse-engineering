package p000;

/* JADX INFO: renamed from: j4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0361j4 extends AbstractViewOnTouchListenerC0452ll {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0694s4 f2656j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0805v4 f2657k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0361j4(C0805v4 c0805v4, C0805v4 c0805v42, C0694s4 c0694s4) {
        super(c0805v42);
        this.f2657k = c0805v4;
        this.f2656j = c0694s4;
    }

    @Override // p000.AbstractViewOnTouchListenerC0452ll
    /* JADX INFO: renamed from: b */
    public final y30 mo814b() {
        return this.f2656j;
    }

    @Override // p000.AbstractViewOnTouchListenerC0452ll
    /* JADX INFO: renamed from: c */
    public final boolean mo815c() {
        C0805v4 c0805v4 = this.f2657k;
        if (c0805v4.getInternalPopup().mo1972b()) {
            return true;
        }
        c0805v4.f4894f.mo1975e(AbstractC0472m4.m1804b(c0805v4), AbstractC0472m4.m1803a(c0805v4));
        return true;
    }
}
