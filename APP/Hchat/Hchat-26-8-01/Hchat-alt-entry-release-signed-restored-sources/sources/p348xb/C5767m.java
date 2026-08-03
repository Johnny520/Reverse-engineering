package p348xb;

import p057e1.C0807b;
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

/* JADX INFO: renamed from: xb.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5767m extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f23485h;

    /* JADX INFO: renamed from: i */
    public int f23486i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C5769o f23487j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5767m(C5769o c5769o, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f23485h = i9;
        this.f23487j = c5769o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f23485h) {
            case 0:
                return new C5767m(this.f23487j, interfaceC5557c, 0);
            case 1:
                return new C5767m(this.f23487j, interfaceC5557c, 1);
            case 2:
                return new C5767m(this.f23487j, interfaceC5557c, 2);
            case 3:
                return new C5767m(this.f23487j, interfaceC5557c, 3);
            case 4:
                return new C5767m(this.f23487j, interfaceC5557c, 4);
            default:
                return new C5767m(this.f23487j, interfaceC5557c, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f23485h) {
        }
        return ((C5767m) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23485h) {
            case 0:
                int i9 = this.f23486i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5769o c5769o = this.f23487j;
                    C1739c c1739c = c5769o.f23495e;
                    Float f3 = new Float(1.0f);
                    C1785r0 c1785r0 = c5769o.f23493c;
                    this.f23486i = 1;
                    Object objM4359c = C1739c.m4359c(c1739c, f3, c1785r0, null, this, 12);
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
                int i10 = this.f23486i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5769o c5769o2 = this.f23487j;
                    C1739c c1739c2 = c5769o2.f23496f;
                    C0807b c0807b = new C0807b(c5769o2.f23497g);
                    this.f23486i = 1;
                    Object objM4361e = c1739c2.m4361e(c0807b, this);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objM4361e == enumC5799a2) {
                    }
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 2:
                int i11 = this.f23486i;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5769o c5769o3 = this.f23487j;
                    C1739c c1739c3 = c5769o3.f23495e;
                    Float f10 = new Float(0.0f);
                    C1785r0 c1785r02 = c5769o3.f23493c;
                    this.f23486i = 1;
                    Object objM4359c2 = C1739c.m4359c(c1739c3, f10, c1785r02, null, this, 12);
                    EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                    if (objM4359c2 == enumC5799a3) {
                    }
                } else if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 3:
                int i12 = this.f23486i;
                if (i12 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5769o c5769o4 = this.f23487j;
                    C1739c c1739c4 = c5769o4.f23496f;
                    C0807b c0807b2 = new C0807b(c5769o4.f23497g);
                    C1785r0 c1785r03 = c5769o4.f23494d;
                    this.f23486i = 1;
                    Object objM4359c3 = C1739c.m4359c(c1739c4, c0807b2, c1785r03, null, this, 12);
                    EnumC5799a enumC5799a4 = EnumC5799a.f23547g;
                    if (objM4359c3 == enumC5799a4) {
                    }
                } else if (i12 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 4:
                int i13 = this.f23486i;
                if (i13 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5769o c5769o5 = this.f23487j;
                    C1739c c1739c5 = c5769o5.f23495e;
                    Float f11 = new Float(0.0f);
                    C1785r0 c1785r04 = c5769o5.f23493c;
                    this.f23486i = 1;
                    Object objM4359c4 = C1739c.m4359c(c1739c5, f11, c1785r04, null, this, 12);
                    EnumC5799a enumC5799a5 = EnumC5799a.f23547g;
                    if (objM4359c4 == enumC5799a5) {
                    }
                } else if (i13 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i14 = this.f23486i;
                if (i14 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5769o c5769o6 = this.f23487j;
                    C1739c c1739c6 = c5769o6.f23496f;
                    C0807b c0807b3 = new C0807b(c5769o6.f23497g);
                    C1785r0 c1785r05 = c5769o6.f23494d;
                    this.f23486i = 1;
                    Object objM4359c5 = C1739c.m4359c(c1739c6, c0807b3, c1785r05, null, this, 12);
                    EnumC5799a enumC5799a6 = EnumC5799a.f23547g;
                    if (objM4359c5 == enumC5799a6) {
                    }
                } else if (i14 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
