package ci;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import p371yg.C6046b;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0573b extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1765h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0586h0 f1766i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0573b(C0586h0 c0586h0, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1765h = i9;
        this.f1766i = c0586h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1765h) {
            case 0:
                return new C0573b(this.f1766i, interfaceC5557c, 0);
            default:
                return new C0573b(this.f1766i, interfaceC5557c, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f1765h) {
            case 0:
                C0573b c0573b = (C0573b) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c0573b.invokeSuspend(c3967n);
                return c3967n;
            default:
                C0573b c0573b2 = (C0573b) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c0573b2.invokeSuspend(c3967n2);
                return c3967n2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1765h) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                C0586h0 c0586h0 = this.f1766i;
                c0586h0.f1830i = true;
                C6046b c6046b = c0586h0.f1831j;
                if (c6046b.m10805c()) {
                    c6046b.m10808f(null);
                }
                break;
            default:
                AbstractC1089i.m2732I0(obj);
                C0586h0 c0586h02 = this.f1766i;
                c0586h02.f1829h = true;
                C6046b c6046b2 = c0586h02.f1831j;
                if (c6046b2.m10805c()) {
                    c6046b2.m10808f(null);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
