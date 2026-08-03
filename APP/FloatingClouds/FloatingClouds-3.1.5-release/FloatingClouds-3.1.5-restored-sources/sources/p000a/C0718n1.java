package p000a;

import p000a.C0737o1;

/* JADX INFO: renamed from: a.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0718n1 extends AbstractViewOnTouchListenerC0386V6 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0737o1.e f2736j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0737o1 f2737k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0718n1(C0737o1 c0737o1, C0737o1 c0737o12, C0737o1.e eVar) {
        super(c0737o12);
        this.f2737k = c0737o1;
        this.f2736j = eVar;
    }

    @Override // p000a.AbstractViewOnTouchListenerC0386V6
    /* JADX INFO: renamed from: b */
    public final InterfaceC0541de mo1016b() {
        return this.f2736j;
    }

    @Override // p000a.AbstractViewOnTouchListenerC0386V6
    /* JADX INFO: renamed from: c */
    public final boolean mo1017c() {
        C0737o1 c0737o1 = this.f2737k;
        if (c0737o1.getInternalPopup().mo1732b()) {
            return true;
        }
        c0737o1.f2894f.mo1735e(c0737o1.getTextDirection(), c0737o1.getTextAlignment());
        return true;
    }
}
