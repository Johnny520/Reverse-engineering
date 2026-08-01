package p069i;

import p068h.InterfaceC0579D;

/* JADX INFO: renamed from: i.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0624I extends AbstractViewOnTouchListenerC0724w0 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0640Q f2160k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0647U f2161l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624I(C0647U c0647u, C0647U c0647u2, C0640Q c0640q) {
        super(c0647u2);
        this.f2161l = c0647u;
        this.f2160k = c0640q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractViewOnTouchListenerC0724w0
    /* JADX INFO: renamed from: b */
    public final InterfaceC0579D mo1171b() {
        return this.f2160k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractViewOnTouchListenerC0724w0
    /* JADX INFO: renamed from: c */
    public final boolean mo1172c() {
        C0647U c0647u = this.f2161l;
        if (c0647u.getInternalPopup().mo1240a()) {
            return true;
        }
        c0647u.f2211g.mo1244e(AbstractC0628K.m1236b(c0647u), AbstractC0628K.m1235a(c0647u));
        return true;
    }
}
