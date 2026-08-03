package p174m;

import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1236q;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2647r0 extends AbstractC6044i implements InterfaceC1236q {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8644h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2647r0(int i9, InterfaceC5557c interfaceC5557c, int i10) {
        super(i9, interfaceC5557c);
        this.f8644h = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f8644h) {
            case 0:
                long j3 = ((C0807b) obj2).f2414a;
                C2647r0 c2647r0 = new C2647r0(3, (InterfaceC5557c) obj3, 0);
                C3967n c3967n = C3967n.f12976a;
                c2647r0.invokeSuspend(c3967n);
                return c3967n;
            case 1:
                ((Number) obj2).floatValue();
                C2647r0 c2647r02 = new C2647r0(3, (InterfaceC5557c) obj3, 1);
                C3967n c3967n2 = C3967n.f12976a;
                c2647r02.invokeSuspend(c3967n2);
                return c3967n2;
            default:
                long j4 = ((C0807b) obj2).f2414a;
                C2647r0 c2647r03 = new C2647r0(3, (InterfaceC5557c) obj3, 2);
                C3967n c3967n3 = C3967n.f12976a;
                c2647r03.invokeSuspend(c3967n3);
                return c3967n3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f8644h;
        C3967n c3967n = C3967n.f12976a;
        switch (i9) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                break;
            case 1:
                AbstractC1089i.m2732I0(obj);
                break;
            default:
                AbstractC1089i.m2732I0(obj);
                break;
        }
        return c3967n;
    }
}
