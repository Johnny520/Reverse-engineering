package p251r;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p144k.EnumC2164d1;
import p174m.InterfaceC2660u1;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: r.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3639x extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11788h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3641z f11789i;

    /* JADX INFO: renamed from: j */
    public int f11790j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3639x(C3641z c3641z, int i9, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f11789i = c3641z;
        this.f11790j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f11788h) {
            case 0:
                return new C3639x(this.f11789i, interfaceC5557c);
            default:
                return new C3639x(this.f11789i, this.f11790j, interfaceC5557c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f11788h) {
            case 0:
                return ((C3639x) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            default:
                C3639x c3639x = (C3639x) create((InterfaceC2660u1) obj, (InterfaceC5557c) obj2);
                C3967n c3967n = C3967n.f12976a;
                c3639x.invokeSuspend(c3967n);
                return c3967n;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f11788h) {
            case 0:
                int i9 = this.f11790j;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C3638w c3638w = new C3638w(2, null, 0);
                    this.f11790j = 1;
                    Object objMo5459b = this.f11789i.mo5459b(EnumC2164d1.f7173g, c3638w, this);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objMo5459b == enumC5799a) {
                    }
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                AbstractC1089i.m2732I0(obj);
                this.f11789i.m7625n(this.f11790j, true);
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3639x(C3641z c3641z, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f11789i = c3641z;
    }
}
