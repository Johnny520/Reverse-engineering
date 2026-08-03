package p265s;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p251r.C3621f;
import p251r.C3641z;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: s.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3862v0 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public int f12654h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3864w0 f12655i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f12656j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3862v0(C3864w0 c3864w0, int i9, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f12655i = c3864w0;
        this.f12656j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        return new C3862v0(this.f12655i, this.f12656j, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C3862v0) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i9 = this.f12654h;
        C3967n c3967n = C3967n.f12976a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC1089i.m2732I0(obj);
                return c3967n;
            }
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC1089i.m2732I0(obj);
        C3621f c3621f = this.f12655i.f12660v;
        this.f12654h = 1;
        Object objM7618m = C3641z.m7618m(c3621f.f11680b, this.f12656j, this);
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (objM7618m != enumC5799a) {
            objM7618m = c3967n;
        }
        return objM7618m == enumC5799a ? enumC5799a : c3967n;
    }
}
