package p116i;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: i.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1736b extends AbstractC6044i implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1739c f5774h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5775i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1736b(C1739c c1739c, Object obj, InterfaceC5557c interfaceC5557c) {
        super(1, interfaceC5557c);
        this.f5774h = c1739c;
        this.f5775i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(InterfaceC5557c interfaceC5557c) {
        return new C1736b(this.f5774h, this.f5775i, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C1736b c1736b = (C1736b) create((InterfaceC5557c) obj);
        C3967n c3967n = C3967n.f12976a;
        c1736b.invokeSuspend(c3967n);
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        AbstractC1089i.m2732I0(obj);
        C1739c c1739c = this.f5774h;
        C1739c.m4358b(c1739c);
        Object objM4357a = C1739c.m4357a(c1739c, this.f5775i);
        c1739c.f5786c.f5901h.setValue(objM4357a);
        c1739c.f5788e.setValue(objM4357a);
        return C3967n.f12976a;
    }
}
