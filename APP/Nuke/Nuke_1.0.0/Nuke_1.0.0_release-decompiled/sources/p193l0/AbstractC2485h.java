package p193l0;

import p112W2.InterfaceC1601c;
import p153e1.C2010f;
import p169h0.InterfaceC2207p;
import p211o0.AbstractC2726A;
import p211o0.AbstractC2767z;
import p211o0.C2753l;
import p211o0.InterfaceC2738M;
import p239t0.AbstractC3207b;

/* JADX INFO: renamed from: l0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2485h {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2207p m4427a(InterfaceC2207p interfaceC2207p, InterfaceC2738M interfaceC2738M) {
        return AbstractC2767z.m4943n(interfaceC2207p, 0.0f, interfaceC2738M, 518143);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2207p m4428b(InterfaceC2207p interfaceC2207p) {
        return AbstractC2767z.m4943n(interfaceC2207p, 0.0f, null, 520191);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2207p m4429c(InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c) {
        return interfaceC2207p.mo4021c(new C2483f(interfaceC1601c));
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2207p m4430d(InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c) {
        return interfaceC2207p.mo4021c(new C2486i(interfaceC1601c));
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2207p m4431e(InterfaceC2207p interfaceC2207p, InterfaceC1601c interfaceC1601c) {
        return interfaceC2207p.mo4021c(new C2487j(interfaceC1601c));
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC2207p m4432f(InterfaceC2207p interfaceC2207p, AbstractC3207b abstractC3207b, C2753l c2753l) {
        return interfaceC2207p.mo4021c(new C2490m(abstractC3207b, c2753l));
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC2207p m4433g(InterfaceC2207p interfaceC2207p, float f2, InterfaceC2738M interfaceC2738M, int i5) {
        boolean z5;
        if ((i5 & 4) != 0) {
            z5 = C2010f.m3695a(f2, (float) 0) > 0;
        } else {
            z5 = false;
        }
        long j5 = AbstractC2726A.f8670a;
        return (C2010f.m3695a(f2, (float) 0) > 0 || z5) ? interfaceC2207p.mo4021c(new C2492o(f2, interfaceC2738M, z5, j5, j5)) : interfaceC2207p;
    }
}
