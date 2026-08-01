package androidx.appcompat.widget;

import p190.InterfaceC7776;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0120 extends AbstractViewOnTouchListenerC0164 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C0227 f546;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0115 f547;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120(C0227 c0227, C0227 c02272, C0115 c0115) {
        super(c02272);
        this.f546 = c0227;
        this.f547 = c0115;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0164
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo525() {
        C0227 c0227 = this.f546;
        if (c0227.getInternalPopup().mo520()) {
            return true;
        }
        c0227.f855.mo515(c0227.getTextDirection(), c0227.getTextAlignment());
        return true;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0164
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7776 mo526() {
        return this.f547;
    }
}
