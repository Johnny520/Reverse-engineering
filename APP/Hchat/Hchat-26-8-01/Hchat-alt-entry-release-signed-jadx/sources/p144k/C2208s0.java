package p144k;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: k.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2208s0 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7320h;

    /* JADX INFO: renamed from: i */
    public int f7321i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2211t0 f7322j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2208s0(C2211t0 c2211t0, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f7320h = i9;
        this.f7322j = c2211t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f7320h) {
            case 0:
                return new C2208s0(this.f7322j, interfaceC5557c, 0);
            default:
                return new C2208s0(this.f7322j, interfaceC5557c, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f7320h) {
        }
        return ((C2208s0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7320h) {
            case 0:
                int i9 = this.f7321i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    this.f7321i = 1;
                    Object objM5453k1 = C2211t0.m5453k1(this.f7322j, this);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM5453k1 == enumC5799a) {
                    }
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i10 = this.f7321i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    this.f7321i = 1;
                    Object objM5454l1 = C2211t0.m5454l1(this.f7322j, this);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objM5454l1 == enumC5799a2) {
                    }
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
