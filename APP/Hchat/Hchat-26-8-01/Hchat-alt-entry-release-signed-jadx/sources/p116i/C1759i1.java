package p116i;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1837h1;
import p117i0.C1845j1;
import p136j8.C2104o;
import p144k.C2176h1;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p348xb.C5757c;
import p348xb.C5763i;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: i.i1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1759i1 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5871h = 0;

    /* JADX INFO: renamed from: i */
    public int f5872i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f5873j;

    /* JADX INFO: renamed from: k */
    public float f5874k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f5875l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1759i1(C5763i c5763i, float f3, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f5875l = c5763i;
        this.f5874k = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f5871h) {
            case 0:
                C1759i1 c1759i1 = new C1759i1((C1765k1) this.f5875l, interfaceC5557c);
                c1759i1.f5873j = obj;
                return c1759i1;
            default:
                C1759i1 c1759i12 = new C1759i1((C5763i) this.f5875l, this.f5874k, interfaceC5557c);
                c1759i12.f5873j = obj;
                return c1759i12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f5871h) {
        }
        return ((C1759i1) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        final float fM4378n;
        InterfaceC3599t interfaceC3599t;
        switch (this.f5871h) {
            case 0:
                int i9 = this.f5872i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC3599t interfaceC3599t2 = (InterfaceC3599t) this.f5873j;
                    fM4378n = AbstractC1742d.m4378n(interfaceC3599t2.mo4457n());
                    interfaceC3599t = interfaceC3599t2;
                } else if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fM4378n = this.f5874k;
                    interfaceC3599t = (InterfaceC3599t) this.f5873j;
                    AbstractC1089i.m2732I0(obj);
                }
                while (AbstractC3603v.m7561o(interfaceC3599t)) {
                    final C1765k1 c1765k1 = (C1765k1) this.f5875l;
                    InterfaceC1231l interfaceC1231l = new InterfaceC1231l() { // from class: i.h1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1231l
                        public final Object invoke(Object obj2) {
                            long jLongValue = ((Long) obj2).longValue();
                            C1765k1 c1765k12 = c1765k1;
                            boolean zM4418g = c1765k12.m4418g();
                            C1837h1 c1837h1 = c1765k12.f5895g;
                            if (!zM4418g) {
                                if (c1837h1.m4564g() == Long.MIN_VALUE) {
                                    c1837h1.m4565h(jLongValue);
                                    ((C1845j1) c1765k12.f5889a.f332h).setValue(Boolean.TRUE);
                                }
                                long jM4564g = jLongValue - c1837h1.m4564g();
                                float f3 = fM4378n;
                                if (f3 != 0.0f) {
                                    double d10 = jM4564g / ((double) f3);
                                    if (Double.isNaN(d10)) {
                                        C2104o.m5294t("Cannot round NaN value.");
                                        return null;
                                    }
                                    jM4564g = Math.round(d10);
                                }
                                if (c1765k12.f5890b == null) {
                                    c1765k12.f5894f.m4565h(jM4564g);
                                }
                                c1765k12.m4419h(jM4564g, f3 == 0.0f);
                            }
                            return C3967n.f12976a;
                        }
                    };
                    this.f5873j = interfaceC3599t;
                    this.f5874k = fM4378n;
                    this.f5872i = 1;
                    Object objM4458d = AbstractC1874r.m4637s(getContext()).m4458d(interfaceC1231l, this);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM4458d == enumC5799a) {
                        break;
                    }
                }
                break;
            default:
                InterfaceC3599t interfaceC3599t3 = (InterfaceC3599t) this.f5873j;
                int i10 = this.f5872i;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5763i c5763i = (C5763i) this.f5875l;
                    C2176h1 c2176h1 = c5763i.f23465p;
                    C5757c c5757c = new C5757c(c5763i, this.f5874k, interfaceC3599t3, null);
                    this.f5873j = null;
                    this.f5872i = 1;
                    Object objM5407b = C2176h1.m5407b(c2176h1, c5757c, this);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objM5407b == enumC5799a2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1759i1(C1765k1 c1765k1, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f5875l = c1765k1;
    }
}
