package p348xb;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p116i.C1739c;
import p116i.C1785r0;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p332wb.C4868f3;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: xb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5755a extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f23425h;

    /* JADX INFO: renamed from: i */
    public int f23426i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C5763i f23427j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f23428k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5755a(C5763i c5763i, float f3, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f23425h = i9;
        this.f23427j = c5763i;
        this.f23428k = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f23425h) {
            case 0:
                return new C5755a(this.f23427j, this.f23428k, interfaceC5557c, 0);
            case 1:
                return new C5755a(this.f23427j, this.f23428k, interfaceC5557c, 1);
            default:
                return new C5755a(this.f23427j, this.f23428k, interfaceC5557c, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f23425h) {
        }
        return ((C5755a) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23425h) {
            case 0:
                int i9 = this.f23426i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5763i c5763i = this.f23427j;
                    C1739c c1739c = c5763i.f23460k;
                    Float f3 = new Float(this.f23428k);
                    C1785r0 c1785r0 = c5763i.f23455f;
                    this.f23426i = 1;
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
                int i10 = this.f23426i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5763i c5763i2 = this.f23427j;
                    C1739c c1739c2 = c5763i2.f23460k;
                    Float f10 = new Float(this.f23428k);
                    C1785r0 c1785r02 = c5763i2.f23455f;
                    C4868f3 c4868f3 = new C4868f3(c5763i2, 5);
                    this.f23426i = 1;
                    Object objM4359c2 = C1739c.m4359c(c1739c2, f10, c1785r02, c4868f3, this, 4);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objM4359c2 == enumC5799a2) {
                    }
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i11 = this.f23426i;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5763i c5763i3 = this.f23427j;
                    C1739c c1739c3 = c5763i3.f23461l;
                    Float f11 = new Float(this.f23428k);
                    C1785r0 c1785r03 = c5763i3.f23456g;
                    this.f23426i = 1;
                    Object objM4359c3 = C1739c.m4359c(c1739c3, f11, c1785r03, null, this, 12);
                    EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                    if (objM4359c3 == enumC5799a3) {
                    }
                } else if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
