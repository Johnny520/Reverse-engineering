package p348xb;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: xb.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5762h extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f23447h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5763i f23448i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ float f23449j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5762h(C5763i c5763i, float f3, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f23448i = c5763i;
        this.f23449j = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C5762h c5762h = new C5762h(this.f23448i, this.f23449j, interfaceC5557c);
        c5762h.f23447h = obj;
        return c5762h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C5762h c5762h = (C5762h) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2);
        C3967n c3967n = C3967n.f12976a;
        c5762h.invokeSuspend(c3967n);
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f23447h;
        AbstractC1089i.m2732I0(obj);
        AbstractC3603v.m7563q(interfaceC3599t, null, new C5755a(this.f23448i, this.f23449j, null, 1), 3);
        return C3967n.f12976a;
    }
}
