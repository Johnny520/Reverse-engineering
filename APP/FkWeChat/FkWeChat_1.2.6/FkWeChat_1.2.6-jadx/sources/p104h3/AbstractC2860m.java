package p104h3;

import p010a9.InterfaceC0173a;
import p152k3.AbstractC3950d;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7138s1;
import p265s1.C7128q1;
import p319w2.AbstractC9077h3;

/* JADX INFO: renamed from: h3.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2860m {
    /* JADX INFO: renamed from: b */
    public static final InterfaceC2863p m10261b(InterfaceC2863p interfaceC2863p, InterfaceC2863p interfaceC2863p2, float f10) {
        boolean z10 = interfaceC2863p instanceof C2850c;
        if (!z10 && !(interfaceC2863p2 instanceof C2850c)) {
            return InterfaceC2863p.f7495a.m10269b(AbstractC7138s1.m28204h(interfaceC2863p.mo10103b(), interfaceC2863p2.mo10103b(), f10));
        }
        if (!z10 || !(interfaceC2863p2 instanceof C2850c)) {
            return (InterfaceC2863p) AbstractC9077h3.m35278d(interfaceC2863p, interfaceC2863p2, f10);
        }
        C2850c c2850c = (C2850c) interfaceC2863p;
        C2850c c2850c2 = (C2850c) interfaceC2863p2;
        return InterfaceC2863p.f7495a.m10268a((AbstractC7078g1) AbstractC9077h3.m35278d(c2850c.mo10104f(), c2850c2.mo10104f(), f10), AbstractC3950d.m15660b(c2850c.mo10102a(), c2850c2.mo10102a(), f10));
    }

    /* JADX INFO: renamed from: c */
    public static final long m10262c(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : C7128q1.m28129o(j10, C7128q1.m28132r(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: renamed from: d */
    public static final float m10263d(float f10, InterfaceC0173a interfaceC0173a) {
        return Float.isNaN(f10) ? ((Number) interfaceC0173a.invoke()).floatValue() : f10;
    }
}
