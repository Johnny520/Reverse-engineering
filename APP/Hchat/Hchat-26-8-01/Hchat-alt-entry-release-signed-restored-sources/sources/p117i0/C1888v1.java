package p117i0;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p249qg.InterfaceC3599t;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p345x8.AbstractC5731x;
import p370yf.AbstractC6044i;
import tg.EnumC4203u;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: i0.v1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1888v1 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6264h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f6265i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1888v1(int i9, InterfaceC5557c interfaceC5557c, int i10) {
        super(i9, interfaceC5557c);
        this.f6264h = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f6264h) {
            case 0:
                C1888v1 c1888v1 = new C1888v1(2, interfaceC5557c, 0);
                c1888v1.f6265i = obj;
                return c1888v1;
            case 1:
                C1888v1 c1888v12 = new C1888v1(2, interfaceC5557c, 1);
                c1888v12.f6265i = obj;
                return c1888v12;
            default:
                C1888v1 c1888v13 = new C1888v1(2, interfaceC5557c, 2);
                c1888v13.f6265i = obj;
                return c1888v13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6264h) {
            case 0:
                return ((C1888v1) create((EnumC1885u1) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            case 1:
                return ((C1888v1) create((EnumC4203u) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            default:
                return ((C1888v1) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        Object c3959f;
        switch (this.f6264h) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                return Boolean.valueOf(((EnumC1885u1) this.f6265i) == EnumC1885u1.f6256g);
            case 1:
                AbstractC1089i.m2732I0(obj);
                return Boolean.valueOf(((EnumC4203u) this.f6265i) != EnumC4203u.f13793g);
            default:
                AbstractC1089i.m2732I0(obj);
                try {
                    c3959f = AbstractC5731x.m10404e();
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                return new C3960g(c3959f);
        }
    }
}
