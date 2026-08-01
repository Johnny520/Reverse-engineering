package p227r;

import p000A.C0025M0;
import p034G.C0462g;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p117X2.C1672q;
import p127Z2.AbstractC1784a;
import p169h0.InterfaceC2207p;
import p203n.C2654f0;
import p204n0.C2683b;
import p216p.EnumC2824Q;

/* JADX INFO: renamed from: r.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3005o0 {

    /* JADX INFO: renamed from: a */
    public static final C2654f0 f9509a = new C2654f0(21);

    /* JADX INFO: renamed from: b */
    public static final C2999l0 f9510b = new C2999l0();

    /* JADX INFO: renamed from: c */
    public static final C2997k0 f9511c = new C2997k0();

    /* JADX INFO: renamed from: d */
    public static final C3001m0 f9512d = new C3001m0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5207a(C2940A0 c2940a0, long j5, AbstractC1178c abstractC1178c) {
        C3003n0 c3003n0;
        C1672q c1672q;
        C2940A0 c2940a02;
        if (abstractC1178c instanceof C3003n0) {
            c3003n0 = (C3003n0) abstractC1178c;
            int i5 = c3003n0.f9506j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c3003n0.f9506j = i5 - Integer.MIN_VALUE;
            } else {
                c3003n0 = new C3003n0(abstractC1178c);
            }
        }
        Object obj = c3003n0.f9505i;
        int i6 = c3003n0.f9506j;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj);
            c1672q = new C1672q();
            C0462g c0462g = new C0462g(c2940a0, j5, c1672q, (InterfaceC1046d) null, 3);
            c3003n0.f9503g = c2940a0;
            c3003n0.f9504h = c1672q;
            c3003n0.f9506j = 1;
            Object objM5146f = c2940a0.m5146f(EnumC2824Q.f8890d, c0462g, c3003n0);
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (objM5146f == enumC1152a) {
                return enumC1152a;
            }
            c2940a02 = c2940a0;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1672q c1672q2 = c3003n0.f9504h;
            C2940A0 c2940a03 = c3003n0.f9503g;
            AbstractC1784a.m3205S(obj);
            c1672q = c1672q2;
            c2940a02 = c2940a03;
        }
        return new C2683b(c2940a02.m5148h(c1672q.f5706d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static InterfaceC2207p m5208b(C0025M0 c0025m0, EnumC2983d0 enumC2983d0, boolean z5, boolean z6) {
        return new C2995j0(c0025m0, enumC2983d0, z5, z6);
    }
}
