package sh;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p116i.C1739c;
import p116i.C1785r0;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: sh.y1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4065y1 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13468h;

    /* JADX INFO: renamed from: i */
    public int f13469i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1739c f13470j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1785r0 f13471k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4065y1(C1739c c1739c, C1785r0 c1785r0, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f13468h = i9;
        this.f13470j = c1739c;
        this.f13471k = c1785r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f13468h) {
            case 0:
                return new C4065y1(this.f13470j, this.f13471k, interfaceC5557c, 0);
            case 1:
                return new C4065y1(this.f13470j, this.f13471k, interfaceC5557c, 1);
            case 2:
                return new C4065y1(this.f13470j, this.f13471k, interfaceC5557c, 2);
            default:
                return new C4065y1(this.f13470j, this.f13471k, interfaceC5557c, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f13468h) {
        }
        return ((C4065y1) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f13468h) {
            case 0:
                int i9 = this.f13469i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f3 = new Float(1.0f);
                    this.f13469i = 1;
                    Object objM4359c = C1739c.m4359c(this.f13470j, f3, this.f13471k, null, this, 12);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM4359c == enumC5799a) {
                    }
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 1:
                int i10 = this.f13469i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f10 = new Float(0.0f);
                    this.f13469i = 1;
                    Object objM4359c2 = C1739c.m4359c(this.f13470j, f10, this.f13471k, null, this, 12);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objM4359c2 == enumC5799a2) {
                    }
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 2:
                int i11 = this.f13469i;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f11 = new Float(0.0f);
                    this.f13469i = 1;
                    Object objM4359c3 = C1739c.m4359c(this.f13470j, f11, this.f13471k, null, this, 12);
                    EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                    if (objM4359c3 == enumC5799a3) {
                    }
                } else if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i12 = this.f13469i;
                if (i12 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f12 = new Float(20.0f);
                    this.f13469i = 1;
                    Object objM4359c4 = C1739c.m4359c(this.f13470j, f12, this.f13471k, null, this, 12);
                    EnumC5799a enumC5799a4 = EnumC5799a.f23547g;
                    if (objM4359c4 == enumC5799a4) {
                    }
                } else if (i12 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
