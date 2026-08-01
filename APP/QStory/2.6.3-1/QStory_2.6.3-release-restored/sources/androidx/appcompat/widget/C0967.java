package androidx.appcompat.widget;

import p206.InterfaceC8606;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0967 extends AbstractViewOnTouchListenerC1011 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C1074 f891;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0962 f892;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0967(C1074 c1074, C1074 c10742, C0962 c0962) {
        super(c10742);
        this.f891 = c1074;
        this.f892 = c0962;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1011
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo1086() {
        C1074 c1074 = this.f891;
        if (c1074.getInternalPopup().mo1081()) {
            return true;
        }
        c1074.f1200.mo1076(c1074.getTextDirection(), c1074.getTextAlignment());
        return true;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1011
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8606 mo1087() {
        return this.f892;
    }
}
