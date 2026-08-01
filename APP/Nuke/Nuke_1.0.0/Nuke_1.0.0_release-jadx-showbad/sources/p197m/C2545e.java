package p197m;

import p007B0.C0171D;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0379Q;
import p061L2.C0982v;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1666k;
import p153e1.C2005a;

/* JADX INFO: renamed from: m.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2545e extends AbstractC1666k implements InterfaceC1604f {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2516A f8130e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2545e(C2516A c2516a) {
        super(3);
        this.f8130e = c2516a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        AbstractC0391b0 abstractC0391b0Mo648e = ((InterfaceC0376N) obj2).mo648e(((C2005a) obj3).f6726a);
        return ((InterfaceC0379Q) obj).mo604f0(abstractC0391b0Mo648e.f1206d, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, new C0171D(10, abstractC0391b0Mo648e, this.f8130e));
    }
}
