package p332wb;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p116i.C1768l1;
import p116i.C1785r0;
import p136j8.C2104o;
import p162l3.C2469w;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import sh.AbstractC4066z;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.n3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5130n3 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f19100h;

    /* JADX INFO: renamed from: i */
    public int f19101i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1739c f19102j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5130n3(C1739c c1739c, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f19100h = i9;
        this.f19102j = c1739c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f19100h) {
            case 0:
                return new C5130n3(this.f19102j, interfaceC5557c, 0);
            case 1:
                return new C5130n3(this.f19102j, interfaceC5557c, 1);
            case 2:
                return new C5130n3(this.f19102j, interfaceC5557c, 2);
            case 3:
                return new C5130n3(this.f19102j, interfaceC5557c, 3);
            case 4:
                return new C5130n3(this.f19102j, interfaceC5557c, 4);
            case 5:
                return new C5130n3(this.f19102j, interfaceC5557c, 5);
            case 6:
                return new C5130n3(this.f19102j, interfaceC5557c, 6);
            case 7:
                return new C5130n3(this.f19102j, interfaceC5557c, 7);
            case 8:
                return new C5130n3(this.f19102j, interfaceC5557c, 8);
            default:
                return new C5130n3(this.f19102j, interfaceC5557c, 9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f19100h) {
        }
        return ((C5130n3) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19100h) {
            case 0:
                int i9 = this.f19101i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f3 = new Float(0.0f);
                    C1785r0 c1785r0 = new C1785r0(1.0f, 300.0f, new Float(0.5f));
                    this.f19101i = 1;
                    Object objM4359c = C1739c.m4359c(this.f19102j, f3, c1785r0, null, this, 12);
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
                int i10 = this.f19101i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f10 = new Float(1.0f);
                    C1768l1 c1768l1M4380p = AbstractC1742d.m4380p(300, 2, new C2469w(21));
                    this.f19101i = 1;
                    Object objM4359c2 = C1739c.m4359c(this.f19102j, f10, c1768l1M4380p, null, this, 12);
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
                int i11 = this.f19101i;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f11 = new Float(1.0f);
                    C1785r0 c1785r02 = AbstractC4066z.f13472a;
                    this.f19101i = 1;
                    Object objM4359c3 = C1739c.m4359c(this.f19102j, f11, c1785r02, null, this, 12);
                    EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                    if (objM4359c3 == enumC5799a3) {
                    }
                } else if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 3:
                int i12 = this.f19101i;
                if (i12 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f12 = new Float(1.0f);
                    C1768l1 c1768l1 = AbstractC4066z.f13473b;
                    this.f19101i = 1;
                    Object objM4359c4 = C1739c.m4359c(this.f19102j, f12, c1768l1, null, this, 12);
                    EnumC5799a enumC5799a4 = EnumC5799a.f23547g;
                    if (objM4359c4 == enumC5799a4) {
                    }
                } else if (i12 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 4:
                int i13 = this.f19101i;
                if (i13 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f13 = new Float(1.0f);
                    C1768l1 c1768l12 = AbstractC4066z.f13475d;
                    this.f19101i = 1;
                    Object objM4359c5 = C1739c.m4359c(this.f19102j, f13, c1768l12, null, this, 12);
                    EnumC5799a enumC5799a5 = EnumC5799a.f23547g;
                    if (objM4359c5 == enumC5799a5) {
                    }
                } else if (i13 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 5:
                int i14 = this.f19101i;
                if (i14 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f14 = new Float(0.0f);
                    C1785r0 c1785r03 = AbstractC4066z.f13472a;
                    this.f19101i = 1;
                    Object objM4359c6 = C1739c.m4359c(this.f19102j, f14, c1785r03, null, this, 12);
                    EnumC5799a enumC5799a6 = EnumC5799a.f23547g;
                    if (objM4359c6 == enumC5799a6) {
                    }
                } else if (i14 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 6:
                int i15 = this.f19101i;
                if (i15 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f15 = new Float(0.0f);
                    C1768l1 c1768l13 = AbstractC4066z.f13476e;
                    this.f19101i = 1;
                    Object objM4359c7 = C1739c.m4359c(this.f19102j, f15, c1768l13, null, this, 12);
                    EnumC5799a enumC5799a7 = EnumC5799a.f23547g;
                    if (objM4359c7 == enumC5799a7) {
                    }
                } else if (i15 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 7:
                int i16 = this.f19101i;
                if (i16 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f16 = new Float(1.0f);
                    C1785r0 c1785r04 = AbstractC4066z.f13477f;
                    this.f19101i = 1;
                    Object objM4359c8 = C1739c.m4359c(this.f19102j, f16, c1785r04, null, this, 12);
                    EnumC5799a enumC5799a8 = EnumC5799a.f23547g;
                    if (objM4359c8 == enumC5799a8) {
                    }
                } else if (i16 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 8:
                int i17 = this.f19101i;
                if (i17 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f17 = new Float(1.0f);
                    C1768l1 c1768l14 = AbstractC4066z.f13473b;
                    this.f19101i = 1;
                    Object objM4359c9 = C1739c.m4359c(this.f19102j, f17, c1768l14, null, this, 12);
                    EnumC5799a enumC5799a9 = EnumC5799a.f23547g;
                    if (objM4359c9 == enumC5799a9) {
                    }
                } else if (i17 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i18 = this.f19101i;
                if (i18 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    Float f18 = new Float(1.0f);
                    C1768l1 c1768l15 = AbstractC4066z.f13475d;
                    this.f19101i = 1;
                    Object objM4359c10 = C1739c.m4359c(this.f19102j, f18, c1768l15, null, this, 12);
                    EnumC5799a enumC5799a10 = EnumC5799a.f23547g;
                    if (objM4359c10 == enumC5799a10) {
                    }
                } else if (i18 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
