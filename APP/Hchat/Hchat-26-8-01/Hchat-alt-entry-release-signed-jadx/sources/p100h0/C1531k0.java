package p100h0;

import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p116i.C1739c;
import p116i.C1785r0;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p249qg.C3564g;
import p249qg.InterfaceC3599t;
import p253r1.C3647d;
import p267s1.C3904k0;
import p267s1.C3907m;
import p276sf.C3959f;
import p276sf.C3967n;
import p340x2.AbstractC5673h;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h0.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1531k0 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5107h;

    /* JADX INFO: renamed from: i */
    public int f5108i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f5109j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5110k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1531k0(long j3, Object obj, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f5107h = i9;
        this.f5109j = j3;
        this.f5110k = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f5107h) {
            case 0:
                return new C1531k0((C1739c) this.f5110k, this.f5109j, interfaceC5557c, 0);
            case 1:
                return new C1531k0(this.f5109j, (C3904k0) this.f5110k, interfaceC5557c, 1);
            case 2:
                return new C1531k0(this.f5109j, (InterfaceC1809a1) this.f5110k, interfaceC5557c, 2);
            default:
                return new C1531k0((AbstractC5673h) this.f5110k, this.f5109j, interfaceC5557c, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f5107h) {
            case 0:
                return ((C1531k0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 1:
                return ((C1531k0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
            case 2:
                ((C1531k0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
                return EnumC5799a.f23547g;
            default:
                return ((C1531k0) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C3564g c3564g;
        Object objM7552f;
        EnumC5799a enumC5799a;
        switch (this.f5107h) {
            case 0:
                int i9 = this.f5108i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1739c c1739c = (C1739c) this.f5110k;
                    C0807b c0807b = new C0807b(this.f5109j);
                    C1785r0 c1785r0 = AbstractC1537m0.f5127d;
                    this.f5108i = 1;
                    Object objM4359c = C1739c.m4359c(c1739c, c0807b, c1785r0, null, this, 12);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objM4359c == enumC5799a2) {
                        return enumC5799a2;
                    }
                } else {
                    if (i9 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 1:
                int i10 = this.f5108i;
                long j3 = this.f5109j;
                EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    this.f5108i = 1;
                    if (AbstractC3603v.m7552f(j3 - 8, this) == enumC5799a3) {
                        return enumC5799a3;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC1089i.m2732I0(obj);
                        c3564g = ((C3904k0) this.f5110k).f12808i;
                        if (c3564g != null) {
                            c3564g.resumeWith(new C3959f(new C3907m(j3)));
                        }
                        return C3967n.f12976a;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                this.f5108i = 2;
                if (AbstractC3603v.m7552f(8L, this) == enumC5799a3) {
                    return enumC5799a3;
                }
                c3564g = ((C3904k0) this.f5110k).f12808i;
                if (c3564g != null) {
                }
                return C3967n.f12976a;
            case 2:
                int i11 = this.f5108i;
                if (i11 != 0 && i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                do {
                    InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f5110k;
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f5109j;
                    if (jCurrentTimeMillis < 0) {
                        jCurrentTimeMillis = 0;
                    }
                    interfaceC1809a1.setValue(Long.valueOf(jCurrentTimeMillis / 1000));
                    this.f5108i = 1;
                    objM7552f = AbstractC3603v.m7552f(1000L, this);
                    enumC5799a = EnumC5799a.f23547g;
                } while (objM7552f != enumC5799a);
                return enumC5799a;
            default:
                int i12 = this.f5108i;
                if (i12 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C3647d c3647d = ((AbstractC5673h) this.f5110k).f23085g;
                    this.f5108i = 1;
                    Object objM7628c = c3647d.m7628c(this.f5109j, this);
                    EnumC5799a enumC5799a4 = EnumC5799a.f23547g;
                    if (objM7628c == enumC5799a4) {
                        return enumC5799a4;
                    }
                } else {
                    if (i12 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1531k0(Object obj, long j3, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f5107h = i9;
        this.f5110k = obj;
        this.f5109j = j3;
    }
}
