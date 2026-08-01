package p046I;

import p007B0.C0178K;
import p041H0.C0603l;
import p112W2.InterfaceC1599a;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: I.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0655b {

    /* JADX INFO: renamed from: a */
    public static final C0603l f2074a;

    static {
        float f2 = 40;
        float f5 = 10;
        f2074a = new C0603l(f5, f2, f5, f2);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2207p m1127a(boolean z5, boolean z6, InterfaceC1599a interfaceC1599a) {
        InterfaceC2207p c0178k = C2204m.f7185a;
        if (!z5 || !AbstractC0658e.f2084a) {
            return c0178k;
        }
        if (z6) {
            c0178k = new C0178K(f2074a);
        }
        return c0178k.mo4021c(new C0654a(interfaceC1599a));
    }
}
