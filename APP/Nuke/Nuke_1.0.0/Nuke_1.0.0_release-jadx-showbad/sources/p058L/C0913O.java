package p058L;

import p034G.C0462g;
import p051J.C0810b;
import p056K2.C0882h;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p092S0.C1259L;
import p112W2.InterfaceC1601c;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;

/* JADX INFO: renamed from: L.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0913O extends AbstractC1184i implements InterfaceC1601c {

    /* JADX INFO: renamed from: h */
    public int f2841h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0920W f2842i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0913O(C0920W c0920w, InterfaceC1046d interfaceC1046d) {
        super(1, interfaceC1046d);
        this.f2842i = c0920w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        return new C0913O(this.f2842i, (InterfaceC1046d) obj).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r13 == r5) goto L28;
     */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) throws Throwable {
        Object objM4001w;
        int i5 = this.f2841h;
        C0891q c0891q = C0891q.f2780a;
        C0920W c0920w = this.f2842i;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i5 == 0) {
            AbstractC1784a.m3205S(obj);
            this.f2841h = 1;
            if (c0920w.m1944s(this) != enumC1152a) {
            }
            return enumC1152a;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
            c0920w.f2864A = true;
            return c0891q;
        }
        AbstractC1784a.m3205S(obj);
        C0882h c0882hM1926a = C0920W.m1926a(c0920w);
        if (c0882hM1926a != null) {
            String str = (String) c0882hM1926a.f2769d;
            long j5 = ((C1259L) c0882hM1926a.f2770e).f4538a;
            C0943o c0943o = c0920w.f2873i;
            if (c0943o != null) {
                this.f2841h = 2;
                if (str.length() == 0 || C1259L.m2335c(j5)) {
                    objM4001w = c0891q;
                } else {
                    objM4001w = AbstractC2162v.m4001w(c0943o.f2964a, new C0810b(c0943o, new C0462g(j5, c0943o, null, str), null), this);
                }
                if (objM4001w != enumC1152a) {
                    objM4001w = c0891q;
                }
            }
        }
        c0920w.f2864A = true;
        return c0891q;
    }
}
