package ci;

import p057e1.C0807b;
import p058e2.ScrollCaptureCallbackC0813c;
import p072f2.AbstractC1049l;
import p072f2.C1050m;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p116i.C1739c;
import p116i.C1785r0;
import p136j8.C2104o;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p332wb.AbstractC4855en;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0596m0 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1867h = 0;

    /* JADX INFO: renamed from: i */
    public int f1868i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ float f1869j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1870k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0596m0(C0598n0 c0598n0, float f3, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1870k = c0598n0;
        this.f1869j = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1867h) {
            case 0:
                return new C0596m0((C0598n0) this.f1870k, this.f1869j, interfaceC5557c);
            default:
                C0596m0 c0596m0 = new C0596m0((ScrollCaptureCallbackC0813c) this.f1870k, interfaceC5557c);
                c0596m0.f1869j = ((Number) obj).floatValue();
                return c0596m0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1867h) {
            case 0:
                return ((C0596m0) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            default:
                return ((C0596m0) create(Float.valueOf(((Number) obj).floatValue()), (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        Object f3;
        switch (this.f1867h) {
            case 0:
                C0598n0 c0598n0 = (C0598n0) this.f1870k;
                int i9 = this.f1868i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1739c c1739c = c0598n0.f1876w;
                    Float f10 = new Float(this.f1869j);
                    C1785r0 c1785r0 = c0598n0.f1875v;
                    this.f1868i = 1;
                    Object objM4359c = C1739c.m4359c(c1739c, f10, c1785r0, null, this, 12);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM4359c == enumC5799a) {
                        return enumC5799a;
                    }
                } else {
                    if (i9 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            default:
                ScrollCaptureCallbackC0813c scrollCaptureCallbackC0813c = (ScrollCaptureCallbackC0813c) this.f1870k;
                int i10 = this.f1868i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    float f11 = this.f1869j;
                    C1050m c1050m = scrollCaptureCallbackC0813c.f2440a.f3350d;
                    Object objM2320g = c1050m.f3341g.m2320g(AbstractC1049l.f3319e);
                    if (objM2320g == null) {
                        objM2320g = null;
                    }
                    InterfaceC1235p interfaceC1235p = (InterfaceC1235p) objM2320g;
                    if (interfaceC1235p == null) {
                        throw AbstractC4855en.m9257a("Required value was null.");
                    }
                    C0807b c0807b = new C0807b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
                    this.f1868i = 1;
                    obj = interfaceC1235p.invoke(c0807b, this);
                    f3 = EnumC5799a.f23547g;
                    if (obj != f3) {
                    }
                    return f3;
                }
                if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                f3 = new Float(Float.intBitsToFloat((int) (((C0807b) obj).f2414a & 4294967295L)));
                return f3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0596m0(ScrollCaptureCallbackC0813c scrollCaptureCallbackC0813c, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1870k = scrollCaptureCallbackC0813c;
    }
}
