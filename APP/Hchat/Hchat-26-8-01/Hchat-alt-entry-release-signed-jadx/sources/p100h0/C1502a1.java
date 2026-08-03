package p100h0;

import ci.C0579e;
import gg.AbstractC1416l;
import p011ab.C0045e;
import p015b0.C0153s;
import p020b5.C0192k;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p119i2.AbstractC1923e0;
import p119i2.C1939m0;
import p136j8.C2104o;
import p174m.C2605g3;
import p174m.C2618k;
import p174m.C2629m2;
import p174m.InterfaceC2596f;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h0.a1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1502a1 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4982h = 0;

    /* JADX INFO: renamed from: i */
    public int f4983i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f4984j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f4985k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f4986l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f4987m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f4988n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f4989o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502a1(C1542p c1542p, String str, long j3, C1939m0 c1939m0, C1511d1 c1511d1, C0192k c0192k, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f4985k = c1542p;
        this.f4986l = str;
        this.f4984j = j3;
        this.f4987m = c1939m0;
        this.f4988n = c1511d1;
        this.f4989o = c0192k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f4982h) {
            case 0:
                return new C1502a1((C1542p) this.f4985k, (String) this.f4986l, this.f4984j, (C1939m0) this.f4987m, (C1511d1) this.f4988n, (C0192k) this.f4989o, interfaceC5557c);
            default:
                C1502a1 c1502a1 = new C1502a1((C2605g3) this.f4986l, (C2618k) this.f4987m, (InterfaceC2596f) this.f4988n, this.f4984j, (InterfaceC3596r0) this.f4989o, interfaceC5557c);
                c1502a1.f4985k = obj;
                return c1502a1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4982h) {
            case 0:
                return ((C1502a1) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
            default:
                return ((C1502a1) create((C2629m2) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        switch (this.f4982h) {
            case 0:
                C0192k c0192k = (C0192k) this.f4989o;
                String str = (String) this.f4986l;
                C1511d1 c1511d1 = (C1511d1) this.f4988n;
                int i9 = this.f4983i;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1542p c1542p = (C1542p) this.f4985k;
                    this.f4983i = 1;
                    c1542p.getClass();
                    if (str.length() == 0) {
                        obj = null;
                        obj2 = EnumC5799a.f23547g;
                        if (obj != obj2) {
                        }
                    } else {
                        long j3 = this.f4984j;
                        if (!C1939m0.m4813c(j3)) {
                            obj = AbstractC3603v.m7570x(c1542p.f5142a, new C0579e(c1542p, new C1540o(str, j3, c1542p, null), (InterfaceC5557c) null), this);
                        }
                        obj2 = EnumC5799a.f23547g;
                        if (obj != obj2) {
                        }
                    }
                    return obj2;
                }
                if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                C1939m0 c1939m0 = (C1939m0) obj;
                obj2 = C3967n.f12976a;
                if (c1939m0 != null) {
                    long j4 = c1939m0.f6575a;
                    int i10 = (int) (j4 >> 32);
                    c0192k.m861n(i10);
                    int i11 = (int) (j4 & 4294967295L);
                    c0192k.m861n(i11);
                    long jM4784b = AbstractC1923e0.m4784b(i10, i11);
                    if (!C1939m0.m4811a((C1939m0) this.f4987m, jM4784b) && AbstractC1416l.m3825a(c1511d1.m4028n().f9316a.f6529h, str) && c0192k == c1511d1.f5030b) {
                        c1511d1.f5031c.invoke(C1511d1.m4018e(c1511d1.m4028n().f9316a, jM4784b));
                        c1511d1.f5050v = new C1939m0(jM4784b);
                    }
                }
                return obj2;
            default:
                InterfaceC2596f interfaceC2596f = (InterfaceC2596f) this.f4988n;
                C2618k c2618k = (C2618k) this.f4987m;
                C2605g3 c2605g3 = (C2605g3) this.f4986l;
                int i12 = this.f4983i;
                if (i12 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2629m2 c2629m2 = (C2629m2) this.f4985k;
                    c2605g3.f8445e = C2618k.m6071k1(c2618k, interfaceC2596f, this.f4984j);
                    C0153s c0153s = new C0153s(c2618k, c2605g3, (InterfaceC3596r0) this.f4989o, c2629m2);
                    C0045e c0045e = new C0045e(c2618k, c2605g3, interfaceC2596f, 9);
                    this.f4983i = 1;
                    Object objM6057a = c2605g3.m6057a(c0153s, c0045e, this);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM6057a == enumC5799a) {
                        return enumC5799a;
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
    public C1502a1(C2605g3 c2605g3, C2618k c2618k, InterfaceC2596f interfaceC2596f, long j3, InterfaceC3596r0 interfaceC3596r0, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f4986l = c2605g3;
        this.f4987m = c2618k;
        this.f4988n = interfaceC2596f;
        this.f4984j = j3;
        this.f4989o = interfaceC3596r0;
    }
}
