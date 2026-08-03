package p100h0;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p116i.C1739c;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h0.w0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1557w0 extends AbstractC6044i implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5196h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5197i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1557w0(Object obj, InterfaceC5557c interfaceC5557c, int i9) {
        super(1, interfaceC5557c);
        this.f5196h = i9;
        this.f5197i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(InterfaceC5557c interfaceC5557c) {
        switch (this.f5196h) {
            case 0:
                return new C1557w0((C1511d1) this.f5197i, interfaceC5557c, 0);
            case 1:
                return new C1557w0((C1511d1) this.f5197i, interfaceC5557c, 1);
            case 2:
                return new C1557w0((C1511d1) this.f5197i, interfaceC5557c, 2);
            case 3:
                return new C1557w0((C1511d1) this.f5197i, interfaceC5557c, 3);
            default:
                return new C1557w0((C1739c) this.f5197i, interfaceC5557c, 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj;
        switch (this.f5196h) {
            case 0:
                C1557w0 c1557w0 = (C1557w0) create(interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c1557w0.invokeSuspend(c3967n);
                return c3967n;
            case 1:
                C1557w0 c1557w02 = (C1557w0) create(interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c1557w02.invokeSuspend(c3967n2);
                return c3967n2;
            case 2:
                C1557w0 c1557w03 = (C1557w0) create(interfaceC5557c);
                C3967n c3967n3 = C3967n.f12976a;
                c1557w03.invokeSuspend(c3967n3);
                return c3967n3;
            case 3:
                C1557w0 c1557w04 = (C1557w0) create(interfaceC5557c);
                C3967n c3967n4 = C3967n.f12976a;
                c1557w04.invokeSuspend(c3967n4);
                return c3967n4;
            default:
                C1557w0 c1557w05 = (C1557w0) create(interfaceC5557c);
                C3967n c3967n5 = C3967n.f12976a;
                c1557w05.invokeSuspend(c3967n5);
                return c3967n5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5196h) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                ((C1511d1) this.f5197i).f5028A = false;
                break;
            case 1:
                AbstractC1089i.m2732I0(obj);
                ((C1511d1) this.f5197i).m4020f();
                break;
            case 2:
                AbstractC1089i.m2732I0(obj);
                C1511d1 c1511d1 = (C1511d1) this.f5197i;
                c1511d1.m4019d(c1511d1.f5028A);
                break;
            case 3:
                AbstractC1089i.m2732I0(obj);
                ((C1511d1) this.f5197i).m4030p();
                break;
            default:
                AbstractC1089i.m2732I0(obj);
                C1739c.m4358b((C1739c) this.f5197i);
                break;
        }
        return C3967n.f12976a;
    }
}
