package p332wb;

import p041d1.C0676v;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.eo */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4856eo extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f16966h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0676v f16967i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4856eo(C0676v c0676v, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f16966h = i9;
        this.f16967i = c0676v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f16966h) {
            case 0:
                return new C4856eo(this.f16967i, interfaceC5557c, 0);
            case 1:
                return new C4856eo(this.f16967i, interfaceC5557c, 1);
            default:
                return new C4856eo(this.f16967i, interfaceC5557c, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f16966h) {
            case 0:
                C4856eo c4856eo = (C4856eo) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c4856eo.invokeSuspend(c3967n);
                return c3967n;
            case 1:
                C4856eo c4856eo2 = (C4856eo) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c4856eo2.invokeSuspend(c3967n2);
                return c3967n2;
            default:
                C4856eo c4856eo3 = (C4856eo) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n3 = C3967n.f12976a;
                c4856eo3.invokeSuspend(c3967n3);
                return c3967n3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f16966h) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                C0676v.m1859a(this.f16967i);
                break;
            case 1:
                AbstractC1089i.m2732I0(obj);
                C0676v.m1859a(this.f16967i);
                break;
            default:
                AbstractC1089i.m2732I0(obj);
                C0676v.m1859a(this.f16967i);
                break;
        }
        return C3967n.f12976a;
    }
}
