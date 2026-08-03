package p144k;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p187n.C2857k;
import p187n.C2858l;
import p187n.C2859m;
import p187n.C2860n;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: k.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2165e extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7176h;

    /* JADX INFO: renamed from: i */
    public int f7177i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC2171g f7178j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2859m f7179k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2165e(AbstractC2171g abstractC2171g, C2859m c2859m, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f7176h = i9;
        this.f7178j = abstractC2171g;
        this.f7179k = c2859m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f7176h) {
            case 0:
                return new C2165e(this.f7178j, this.f7179k, interfaceC5557c, 0);
            case 1:
                return new C2165e(this.f7178j, this.f7179k, interfaceC5557c, 1);
            case 2:
                return new C2165e(this.f7178j, this.f7179k, interfaceC5557c, 2);
            default:
                return new C2165e(this.f7178j, this.f7179k, interfaceC5557c, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f7176h) {
        }
        return ((C2165e) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f7176h) {
            case 0:
                int i9 = this.f7177i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2857k c2857k = this.f7178j.f7205w;
                    if (c2857k != null) {
                        C2858l c2858l = new C2858l(this.f7179k);
                        this.f7177i = 1;
                        Object objM6281a = c2857k.m6281a(c2858l, this);
                        EnumC5799a enumC5799a = EnumC5799a.f23547g;
                        if (objM6281a == enumC5799a) {
                        }
                    }
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 1:
                int i10 = this.f7177i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2857k c2857k2 = this.f7178j.f7205w;
                    if (c2857k2 != null) {
                        C2858l c2858l2 = new C2858l(this.f7179k);
                        this.f7177i = 1;
                        Object objM6281a2 = c2857k2.m6281a(c2858l2, this);
                        EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                        if (objM6281a2 == enumC5799a2) {
                        }
                    }
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            case 2:
                int i11 = this.f7177i;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2857k c2857k3 = this.f7178j.f7205w;
                    if (c2857k3 != null) {
                        this.f7177i = 1;
                        Object objM6281a3 = c2857k3.m6281a(this.f7179k, this);
                        EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                        if (objM6281a3 == enumC5799a3) {
                        }
                    }
                } else if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                break;
            default:
                int i12 = this.f7177i;
                if (i12 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2857k c2857k4 = this.f7178j.f7205w;
                    if (c2857k4 != null) {
                        C2860n c2860n = new C2860n(this.f7179k);
                        this.f7177i = 1;
                        Object objM6281a4 = c2857k4.m6281a(c2860n, this);
                        EnumC5799a enumC5799a4 = EnumC5799a.f23547g;
                        if (objM6281a4 == enumC5799a4) {
                        }
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
