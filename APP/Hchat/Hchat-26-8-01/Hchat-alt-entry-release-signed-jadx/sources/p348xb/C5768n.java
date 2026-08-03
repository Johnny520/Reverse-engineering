package p348xb;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: xb.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5768n extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f23488h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f23489i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C5769o f23490j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5768n(C5769o c5769o, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f23488h = i9;
        this.f23490j = c5769o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f23488h) {
            case 0:
                C5768n c5768n = new C5768n(this.f23490j, interfaceC5557c, 0);
                c5768n.f23489i = obj;
                return c5768n;
            case 1:
                C5768n c5768n2 = new C5768n(this.f23490j, interfaceC5557c, 1);
                c5768n2.f23489i = obj;
                return c5768n2;
            default:
                C5768n c5768n3 = new C5768n(this.f23490j, interfaceC5557c, 2);
                c5768n3.f23489i = obj;
                return c5768n3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f23488h) {
            case 0:
                C5768n c5768n = (C5768n) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c5768n.invokeSuspend(c3967n);
                return c3967n;
            case 1:
                C5768n c5768n2 = (C5768n) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c5768n2.invokeSuspend(c3967n2);
                return c3967n2;
            default:
                C5768n c5768n3 = (C5768n) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n3 = C3967n.f12976a;
                c5768n3.invokeSuspend(c3967n3);
                return c3967n3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23488h) {
            case 0:
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f23489i;
                AbstractC1089i.m2732I0(obj);
                C5769o c5769o = this.f23490j;
                InterfaceC5557c interfaceC5557c = null;
                AbstractC3603v.m7563q(interfaceC3599t, null, new C5767m(c5769o, interfaceC5557c, 0), 3);
                AbstractC3603v.m7563q(interfaceC3599t, null, new C5767m(c5769o, interfaceC5557c, 1), 3);
                break;
            case 1:
                InterfaceC3599t interfaceC3599t2 = (InterfaceC3599t) this.f23489i;
                AbstractC1089i.m2732I0(obj);
                C5769o c5769o2 = this.f23490j;
                InterfaceC5557c interfaceC5557c2 = null;
                AbstractC3603v.m7563q(interfaceC3599t2, null, new C5767m(c5769o2, interfaceC5557c2, 2), 3);
                AbstractC3603v.m7563q(interfaceC3599t2, null, new C5767m(c5769o2, interfaceC5557c2, 3), 3);
                break;
            default:
                InterfaceC3599t interfaceC3599t3 = (InterfaceC3599t) this.f23489i;
                AbstractC1089i.m2732I0(obj);
                C5769o c5769o3 = this.f23490j;
                InterfaceC5557c interfaceC5557c3 = null;
                AbstractC3603v.m7563q(interfaceC3599t3, null, new C5767m(c5769o3, interfaceC5557c3, 4), 3);
                AbstractC3603v.m7563q(interfaceC3599t3, null, new C5767m(c5769o3, interfaceC5557c3, 5), 3);
                break;
        }
        return C3967n.f12976a;
    }
}
