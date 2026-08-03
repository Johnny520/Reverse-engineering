package p321w;

import ci.C0577d;
import p000a.AbstractC0000a;
import p015b0.C0136d0;
import p015b0.C0154t;
import p049d9.C0750k;
import p070f0.C0976h;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p100h0.C1560y;
import p136j8.C2104o;
import p144k.C2209s1;
import p174m.AbstractC2615j0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: w.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4590d0 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f15128h;

    /* JADX INFO: renamed from: i */
    public int f15129i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC3918x f15130j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC4647y0 f15131k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4590d0(InterfaceC3918x interfaceC3918x, InterfaceC4647y0 interfaceC4647y0, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f15128h = i9;
        this.f15130j = interfaceC3918x;
        this.f15131k = interfaceC4647y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f15128h) {
            case 0:
                return new C4590d0(this.f15130j, this.f15131k, interfaceC5557c, 0);
            case 1:
                return new C4590d0(this.f15130j, this.f15131k, interfaceC5557c, 1);
            default:
                return new C4590d0(this.f15130j, this.f15131k, interfaceC5557c, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f15128h) {
        }
        return ((C4590d0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f15128h;
        int i10 = 0;
        InterfaceC4647y0 interfaceC4647y0 = this.f15131k;
        InterfaceC3918x interfaceC3918x = this.f15130j;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        C3967n c3967n = C3967n.f12976a;
        InterfaceC5557c interfaceC5557c = null;
        switch (i9) {
            case 0:
                int i11 = this.f15129i;
                if (i11 != 0) {
                    if (i11 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC1089i.m2732I0(obj);
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    this.f15129i = 1;
                    Object objM7551e = AbstractC3603v.m7551e(new C4639u0(interfaceC3918x, interfaceC4647y0, interfaceC5557c, i10), this);
                    if (objM7551e != enumC5799a) {
                        objM7551e = c3967n;
                    }
                    if (objM7551e == enumC5799a) {
                    }
                }
                break;
            case 1:
                int i12 = this.f15129i;
                if (i12 != 0) {
                    if (i12 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC1089i.m2732I0(obj);
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    this.f15129i = 1;
                    Object objM78n = AbstractC0000a.m78n(interfaceC3918x, new C0750k(interfaceC4647y0, (InterfaceC5557c) null, 4), this);
                    if (objM78n != enumC5799a) {
                        objM78n = c3967n;
                    }
                    if (objM78n == enumC5799a) {
                    }
                }
                break;
            default:
                int i13 = this.f15129i;
                if (i13 != 0) {
                    if (i13 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC1089i.m2732I0(obj);
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    this.f15129i = 1;
                    C1560y c1560y = new C1560y(interfaceC4647y0, 2);
                    C4637t0 c4637t0 = new C4637t0(interfaceC4647y0, 0);
                    C4637t0 c4637t02 = new C4637t0(interfaceC4647y0, 1);
                    C0154t c0154t = new C0154t(interfaceC4647y0, 23);
                    float f3 = AbstractC2615j0.f8497a;
                    Object objM78n2 = AbstractC0000a.m78n(interfaceC3918x, new C0577d(new C2209s1(2), new C0976h(c1560y, 2), c0154t, c4637t02, new C0136d0(c4637t0, 25), (InterfaceC5557c) null), this);
                    if (objM78n2 != enumC5799a) {
                        objM78n2 = c3967n;
                    }
                    if (objM78n2 != enumC5799a) {
                        objM78n2 = c3967n;
                    }
                    if (objM78n2 != enumC5799a) {
                        objM78n2 = c3967n;
                    }
                    if (objM78n2 == enumC5799a) {
                    }
                }
                break;
        }
        return c3967n;
    }
}
