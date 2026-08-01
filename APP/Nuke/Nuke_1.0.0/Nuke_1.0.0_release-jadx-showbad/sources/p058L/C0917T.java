package p058L;

import p000A.C0042V0;
import p000A.C0075n;
import p016C3.C0244a;
import p051J.C0810b;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p227r.C2962L0;
import p227r.C2992i;
import p227r.C3025y0;
import p227r.InterfaceC2982d;

/* JADX INFO: renamed from: L.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0917T extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2848h = 0;

    /* JADX INFO: renamed from: i */
    public int f2849i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f2850j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f2851k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2852l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f2853m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f2854n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f2855o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0917T(C0943o c0943o, String str, long j5, C1259L c1259l, C0920W c0920w, C0042V0 c0042v0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2851k = c0943o;
        this.f2852l = str;
        this.f2850j = j5;
        this.f2853m = c1259l;
        this.f2854n = c0920w;
        this.f2855o = c0042v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f2848h) {
            case 0:
                return ((C0917T) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C0917T) mo7n((InterfaceC1046d) obj2, (C3025y0) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2848h) {
            case 0:
                return new C0917T((C0943o) this.f2851k, (String) this.f2852l, this.f2850j, (C1259L) this.f2853m, (C0920W) this.f2854n, (C0042V0) this.f2855o, interfaceC1046d);
            default:
                C0917T c0917t = new C0917T((C2962L0) this.f2852l, (C2992i) this.f2853m, (InterfaceC2982d) this.f2854n, this.f2850j, (InterfaceC2115S) this.f2855o, interfaceC1046d);
                c0917t.f2851k = obj;
                return c0917t;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) throws Throwable {
        Object obj2;
        switch (this.f2848h) {
            case 0:
                C0042V0 c0042v0 = (C0042V0) this.f2855o;
                String str = (String) this.f2852l;
                C0920W c0920w = (C0920W) this.f2854n;
                int i5 = this.f2849i;
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C0943o c0943o = (C0943o) this.f2851k;
                    this.f2849i = 1;
                    c0943o.getClass();
                    if (str.length() == 0) {
                        obj = null;
                        obj2 = EnumC1152a.f3788d;
                        if (obj != obj2) {
                        }
                    } else {
                        long j5 = this.f2850j;
                        if (!C1259L.m2335c(j5)) {
                            obj = AbstractC2162v.m4001w(c0943o.f2964a, new C0810b(c0943o, new C0942n(j5, c0943o, null, str), null), this);
                        }
                        obj2 = EnumC1152a.f3788d;
                        if (obj != obj2) {
                        }
                    }
                    return obj2;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1784a.m3205S(obj);
                C1259L c1259l = (C1259L) obj;
                obj2 = C0891q.f2780a;
                if (c1259l != null) {
                    long j6 = c1259l.f4538a;
                    int i6 = (int) (j6 >> 32);
                    c0042v0.m58b(i6);
                    int i7 = (int) (j6 & 4294967295L);
                    c0042v0.m58b(i7);
                    long jM2313b = AbstractC1251D.m2313b(i6, i7);
                    if (!C1259L.m2333a(jM2313b, (C1259L) this.f2853m) && AbstractC1665j.m2981a(c0920w.m1939n().f5650a.f4563e, str) && c0042v0 == c0920w.f2866b) {
                        c0920w.f2867c.mo1h(C0920W.m1929e(c0920w.m1939n().f5650a, jM2313b));
                        c0920w.f2886v = new C1259L(jM2313b);
                    }
                }
                return obj2;
            default:
                InterfaceC2982d interfaceC2982d = (InterfaceC2982d) this.f2854n;
                C2992i c2992i = (C2992i) this.f2853m;
                C2962L0 c2962l0 = (C2962L0) this.f2852l;
                int i8 = this.f2849i;
                if (i8 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C3025y0 c3025y0 = (C3025y0) this.f2851k;
                    c2962l0.f9380e = C2992i.m5203J0(c2992i, interfaceC2982d, this.f2850j);
                    C0075n c0075n = new C0075n(c2992i, c2962l0, (InterfaceC2115S) this.f2855o, c3025y0);
                    C0244a c0244a = new C0244a(c2992i, c2962l0, interfaceC2982d, 8);
                    this.f2849i = 1;
                    Object objM5163a = c2962l0.m5163a(c0075n, c0244a, this);
                    EnumC1152a enumC1152a = EnumC1152a.f3788d;
                    if (objM5163a == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0917T(C2962L0 c2962l0, C2992i c2992i, InterfaceC2982d interfaceC2982d, long j5, InterfaceC2115S interfaceC2115S, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2852l = c2962l0;
        this.f2853m = c2992i;
        this.f2854n = interfaceC2982d;
        this.f2850j = j5;
        this.f2855o = interfaceC2115S;
    }
}
