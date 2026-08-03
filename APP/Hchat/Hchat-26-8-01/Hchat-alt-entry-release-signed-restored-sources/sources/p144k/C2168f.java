package p144k;

import ci.C0589j;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p187n.C2854h;
import p187n.C2855i;
import p187n.C2857k;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: k.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2168f extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7181h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC2171g f7182i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2168f(AbstractC2171g abstractC2171g, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f7181h = i9;
        this.f7182i = abstractC2171g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f7181h) {
            case 0:
                return new C2168f(this.f7182i, interfaceC5557c, 0);
            default:
                return new C2168f(this.f7182i, interfaceC5557c, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f7181h) {
            case 0:
                C2168f c2168f = (C2168f) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c2168f.invokeSuspend(c3967n);
                return c3967n;
            default:
                C2168f c2168f2 = (C2168f) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c2168f2.invokeSuspend(c3967n2);
                return c3967n2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7181h) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                AbstractC2171g abstractC2171g = this.f7182i;
                if (abstractC2171g.f7198J == null) {
                    C2854h c2854h = new C2854h();
                    C2857k c2857k = abstractC2171g.f7205w;
                    if (c2857k != null) {
                        AbstractC3603v.m7563q(abstractC2171g.m10550Y0(), null, new C0589j(c2857k, c2854h, (InterfaceC5557c) null, 6), 3);
                    }
                    abstractC2171g.f7198J = c2854h;
                }
                break;
            default:
                AbstractC1089i.m2732I0(obj);
                AbstractC2171g abstractC2171g2 = this.f7182i;
                C2854h c2854h2 = abstractC2171g2.f7198J;
                if (c2854h2 != null) {
                    C2855i c2855i = new C2855i(c2854h2);
                    C2857k c2857k2 = abstractC2171g2.f7205w;
                    InterfaceC5557c interfaceC5557c = null;
                    if (c2857k2 != null) {
                        AbstractC3603v.m7563q(abstractC2171g2.m10550Y0(), null, new C0589j(c2857k2, c2855i, interfaceC5557c, 7), 3);
                    }
                    abstractC2171g2.f7198J = null;
                }
                break;
        }
        return C3967n.f12976a;
    }
}
