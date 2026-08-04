package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛶᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1803 extends AbstractViewOnTouchListenerC0067 {

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1921 f9072;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ C2600 f9073;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1803(C1921 c1921, C1921 c19212, C2600 c2600) {
        super(c19212);
        this.f9072 = c1921;
        this.f9073 = c2600;
    }

    @Override // yyds.AbstractViewOnTouchListenerC0067
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC0911 mo438() {
        return this.f9073;
    }

    @Override // yyds.AbstractViewOnTouchListenerC0067
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo439() {
        C1921 c1921 = this.f9072;
        if (c1921.getInternalPopup().mo2574()) {
            return true;
        }
        c1921.f9673.mo2576(AbstractC0162.m728(c1921), AbstractC0162.m727(c1921));
        return true;
    }
}
