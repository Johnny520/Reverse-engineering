package p203n;

import p000A.C0010F;
import p049I2.AbstractC0797o;
import p056K2.EnumC0880f;
import p076P.C1073T;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: n.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2648c0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f8436a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC0797o.m1395t(EnumC0880f.f2767e, new C1073T(19));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [W2.c, X2.k] */
    /* JADX WARN: Type inference failed for: r5v7, types: [W2.c, X2.k] */
    /* JADX INFO: renamed from: a */
    public static final C2636T m4607a(C2642Z c2642z, C2652e0 c2652e0, String str, InterfaceC1373m interfaceC1373m, int i5, int i6) {
        C2635S c2635s;
        if ((i6 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zM2582f = ((C1383r) interfaceC1373m).m2582f(c2642z);
        C1383r c1383r = (C1383r) interfaceC1373m;
        Object objM2558L = c1383r.m2558L();
        C1357e c1357e = C1371l.f4833a;
        if (zM2582f || objM2558L == c1357e) {
            objM2558L = new C2636T(c2642z, c2652e0, str);
            c1383r.m2585g0(objM2558L);
        }
        C2636T c2636t = (C2636T) objM2558L;
        boolean zM2582f2 = c1383r.m2582f(c2642z) | c1383r.m2586h(c2636t);
        Object objM2558L2 = c1383r.m2558L();
        if (zM2582f2 || objM2558L2 == c1357e) {
            objM2558L2 = new C0010F(13, c2642z, c2636t);
            c1383r.m2585g0(objM2558L2);
        }
        AbstractC1385s.m2613c(c2636t, (InterfaceC1601c) objM2558L2, c1383r);
        if (c2642z.m4597g() && (c2635s = (C2635S) c2636t.f8382b.getValue()) != null) {
            C2642Z c2642z2 = c2636t.f8383c;
            c2635s.f8377d.m4590f(c2635s.f8379f.mo1h(c2642z2.m4596f().mo4476a()), c2635s.f8379f.mo1h(c2642z2.m4596f().mo4477c()), (InterfaceC2677v) c2635s.f8378e.mo1h(c2642z2.m4596f()));
        }
        return c2636t;
    }
}
