package ci;

import p015b0.C0136d0;
import p015b0.C0146l;
import p015b0.C0154t;
import p027c0.C0368m;
import p057e1.C0807b;
import p070f0.C0976h;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p144k.C2209s1;
import p174m.AbstractC2615j0;
import p174m.AbstractC2677y2;
import p174m.C2649r2;
import p174m.C2653s2;
import p174m.C2656t1;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p267s1.C3904k0;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p321w.C4594e1;
import p321w.C4637t0;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0577d extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1775g;

    /* JADX INFO: renamed from: h */
    public int f1776h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f1777i;

    /* JADX INFO: renamed from: j */
    public Object f1778j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1779k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1780l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1781m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1782n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0577d(C2209s1 c2209s1, C0976h c0976h, C0154t c0154t, C4637t0 c4637t0, C0136d0 c0136d0, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f1775g = 1;
        this.f1778j = c2209s1;
        this.f1779k = c0976h;
        this.f1780l = c0154t;
        this.f1781m = c4637t0;
        this.f1782n = c0136d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1775g) {
            case 0:
                C0577d c0577d = new C0577d((InterfaceC3599t) this.f1779k, (C0594l0) this.f1780l, (C0586h0) this.f1781m, (C0581f) this.f1782n, interfaceC5557c, 0);
                c0577d.f1777i = obj;
                return c0577d;
            case 1:
                C0577d c0577d2 = new C0577d((C2209s1) this.f1778j, (C0976h) this.f1779k, (C0154t) this.f1780l, (C4637t0) this.f1781m, (C0136d0) this.f1782n, interfaceC5557c);
                c0577d2.f1777i = obj;
                return c0577d2;
            default:
                C0577d c0577d3 = new C0577d((InterfaceC3599t) this.f1779k, (C4594e1) this.f1780l, (C0146l) this.f1781m, (C2656t1) this.f1782n, interfaceC5557c, 2);
                c0577d3.f1777i = obj;
                return c0577d3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C3904k0 c3904k0 = (C3904k0) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f1775g) {
        }
        return ((C0577d) create(c3904k0, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
    
        if (r14 == r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018b  */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C3560e1 c3560e1;
        C3904k0 c3904k0;
        InterfaceC3596r0 interfaceC3596r0M7563q;
        C3904k0 c3904k02;
        C3914t c3914t;
        switch (this.f1775g) {
            case 0:
                C0594l0 c0594l0 = (C0594l0) this.f1780l;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1779k;
                C0586h0 c0586h0 = (C0586h0) this.f1781m;
                C3904k0 c3904k03 = (C3904k0) this.f1777i;
                int i9 = this.f1776h;
                InterfaceC5557c interfaceC5557c = null;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1089i.m2732I0(obj);
                    } else if (i9 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        c3560e1 = (C3560e1) this.f1778j;
                        AbstractC1089i.m2732I0(obj);
                        if (((C3914t) obj) != null) {
                            C0594l0.m1607n1(c0594l0, interfaceC3599t, c3560e1, new C0573b(c0586h0, interfaceC5557c, 0));
                        } else {
                            C0594l0.m1607n1(c0594l0, interfaceC3599t, c3560e1, new C0573b(c0586h0, interfaceC5557c, 1));
                        }
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    this.f1777i = c3904k03;
                    this.f1776h = 1;
                    obj = AbstractC2677y2.m6117b(c3904k03, this, 2);
                    if (obj == enumC5799a) {
                    }
                }
                C3914t c3914t2 = (C3914t) obj;
                C3560e1 c3560e1M7563q = AbstractC3603v.m7563q(interfaceC3599t, null, new C0575c(c0586h0, interfaceC5557c, 0), 3);
                C0594l0.m1607n1(c0594l0, interfaceC3599t, c3560e1M7563q, new C0368m((C0581f) this.f1782n, c0586h0, c3914t2, interfaceC5557c, 1));
                this.f1777i = null;
                this.f1778j = c3560e1M7563q;
                this.f1776h = 2;
                Object objM6124i = AbstractC2677y2.m6124i(c3904k03, EnumC3905l.f12813h, this);
                if (objM6124i != enumC5799a) {
                    c3560e1 = c3560e1M7563q;
                    obj = objM6124i;
                    if (((C3914t) obj) != null) {
                    }
                    break;
                }
                break;
            case 1:
                int i10 = this.f1776h;
                EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            enumC5799a2 = null;
                        } else {
                            AbstractC1089i.m2732I0(obj);
                        }
                        break;
                    } else {
                        c3904k0 = (C3904k0) this.f1777i;
                        AbstractC1089i.m2732I0(obj);
                        C3904k0 c3904k04 = c3904k0;
                        C3914t c3914t3 = (C3914t) obj;
                        C2209s1 c2209s1 = (C2209s1) this.f1778j;
                        C0976h c0976h = (C0976h) this.f1779k;
                        C0154t c0154t = (C0154t) this.f1780l;
                        C4637t0 c4637t0 = (C4637t0) this.f1781m;
                        C0136d0 c0136d0 = (C0136d0) this.f1782n;
                        this.f1777i = null;
                        this.f1776h = 2;
                        if (AbstractC2615j0.m6070g(c3904k04, c3914t3, c2209s1, c0976h, c0154t, c4637t0, c0136d0, this) == enumC5799a2) {
                        }
                    }
                } else {
                    AbstractC1089i.m2732I0(obj);
                    c3904k0 = (C3904k0) this.f1777i;
                    this.f1777i = c3904k0;
                    this.f1776h = 1;
                    obj = AbstractC2677y2.m6116a(c3904k0, false, EnumC3905l.f12812g, this);
                    break;
                }
                break;
            default:
                InterfaceC3599t interfaceC3599t2 = (InterfaceC3599t) this.f1779k;
                C2656t1 c2656t1 = (C2656t1) this.f1782n;
                int i11 = this.f1776h;
                InterfaceC5557c interfaceC5557c2 = null;
                EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                if (i11 != 0) {
                    if (i11 == 1) {
                        interfaceC3596r0M7563q = (C3560e1) this.f1778j;
                        C3904k0 c3904k05 = (C3904k0) this.f1777i;
                        AbstractC1089i.m2732I0(obj);
                        c3904k02 = c3904k05;
                    } else if (i11 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        interfaceC3596r0M7563q = (InterfaceC3596r0) this.f1777i;
                        AbstractC1089i.m2732I0(obj);
                        c3914t = (C3914t) obj;
                        if (c3914t != null) {
                            AbstractC2677y2.m6121f(interfaceC3599t2, interfaceC3596r0M7563q, new C2649r2(c2656t1, interfaceC5557c2, 0));
                        } else {
                            c3914t.m8118a();
                            AbstractC2677y2.m6121f(interfaceC3599t2, interfaceC3596r0M7563q, new C2649r2(c2656t1, interfaceC5557c2, 1));
                            ((C0146l) this.f1781m).invoke(new C0807b(c3914t.f12836c));
                        }
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    C3904k0 c3904k06 = (C3904k0) this.f1777i;
                    interfaceC3596r0M7563q = AbstractC3603v.m7563q(interfaceC3599t2, null, new C2653s2(c2656t1, interfaceC5557c2, 0), 1);
                    this.f1777i = c3904k06;
                    this.f1778j = interfaceC3596r0M7563q;
                    this.f1776h = 1;
                    Object objM6117b = AbstractC2677y2.m6117b(c3904k06, this, 3);
                    if (objM6117b != enumC5799a3) {
                        c3904k02 = c3904k06;
                        obj = objM6117b;
                    }
                }
                C3914t c3914t4 = (C3914t) obj;
                c3914t4.m8118a();
                C4594e1 c4594e1 = (C4594e1) this.f1780l;
                if (c4594e1 != AbstractC2677y2.f8731a) {
                    AbstractC2677y2.m6121f(interfaceC3599t2, interfaceC3596r0M7563q, new C0368m(c4594e1, c2656t1, c3914t4, interfaceC5557c2, 15));
                }
                this.f1777i = interfaceC3596r0M7563q;
                this.f1778j = null;
                this.f1776h = 2;
                obj = AbstractC2677y2.m6124i(c3904k02, EnumC3905l.f12813h, this);
                if (obj == enumC5799a3) {
                }
                c3914t = (C3914t) obj;
                if (c3914t != null) {
                }
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0577d(InterfaceC3599t interfaceC3599t, Object obj, Object obj2, Object obj3, InterfaceC5557c interfaceC5557c, int i9) {
        super(interfaceC5557c);
        this.f1775g = i9;
        this.f1779k = interfaceC3599t;
        this.f1780l = obj;
        this.f1781m = obj2;
        this.f1782n = obj3;
    }
}
