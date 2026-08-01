package ec;

import p010a9.InterfaceC0188p;
import p024b9.C1050n0;
import p228p8.C5981k;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5977g;
import p228p8.InterfaceC5980j;
import p257r8.InterfaceC6536e;

/* JADX INFO: renamed from: ec.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2141i0 {
    /* JADX INFO: renamed from: a */
    public static InterfaceC5980j m7763a(C1050n0 c1050n0, boolean z10, InterfaceC5980j interfaceC5980j, InterfaceC5980j.b bVar) {
        return interfaceC5980j.mo1651c0(bVar);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5980j m7764b(InterfaceC5980j interfaceC5980j, InterfaceC5980j.b bVar) {
        return interfaceC5980j.mo1651c0(bVar);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC5980j m7766d(InterfaceC5980j interfaceC5980j, InterfaceC5980j interfaceC5980j2, final boolean z10) {
        boolean zM7768f = m7768f(interfaceC5980j);
        boolean zM7768f2 = m7768f(interfaceC5980j2);
        if (!zM7768f && !zM7768f2) {
            return interfaceC5980j.mo1651c0(interfaceC5980j2);
        }
        final C1050n0 c1050n0 = new C1050n0();
        c1050n0.f3208q = interfaceC5980j2;
        C5981k c5981k = C5981k.f18917q;
        InterfaceC5980j interfaceC5980j3 = (InterfaceC5980j) interfaceC5980j.mo1655q(c5981k, new InterfaceC0188p() { // from class: ec.g0
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC2141i0.m7763a(c1050n0, z10, (InterfaceC5980j) obj, (InterfaceC5980j.b) obj2);
            }
        });
        if (zM7768f2) {
            c1050n0.f3208q = ((InterfaceC5980j) c1050n0.f3208q).mo1655q(c5981k, new InterfaceC0188p() { // from class: ec.h0
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2141i0.m7764b((InterfaceC5980j) obj, (InterfaceC5980j.b) obj2);
                }
            });
        }
        return interfaceC5980j3.mo1651c0((InterfaceC5980j) c1050n0.f3208q);
    }

    /* JADX INFO: renamed from: e */
    public static final String m7767e(InterfaceC5980j interfaceC5980j) {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m7768f(InterfaceC5980j interfaceC5980j) {
        return ((Boolean) interfaceC5980j.mo1655q(Boolean.FALSE, new InterfaceC0188p() { // from class: ec.f0
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(AbstractC2141i0.m7765c(((Boolean) obj).booleanValue(), (InterfaceC5980j.b) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC5980j m7769g(InterfaceC2165o0 interfaceC2165o0, InterfaceC5980j interfaceC5980j) {
        InterfaceC5980j interfaceC5980jM7766d = m7766d(interfaceC2165o0.getCoroutineContext(), interfaceC5980j, true);
        return (interfaceC5980jM7766d == C2122d1.m7726a() || interfaceC5980jM7766d.mo1654h(InterfaceC5977g.f18915n) != null) ? interfaceC5980jM7766d : interfaceC5980jM7766d.mo1651c0(C2122d1.m7726a());
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC5980j m7770h(InterfaceC5980j interfaceC5980j, InterfaceC5980j interfaceC5980j2) {
        return !m7768f(interfaceC5980j2) ? interfaceC5980j.mo1651c0(interfaceC5980j2) : m7766d(interfaceC5980j, interfaceC5980j2, false);
    }

    /* JADX INFO: renamed from: i */
    public static final C2207y2 m7771i(InterfaceC6536e interfaceC6536e) {
        while (!(interfaceC6536e instanceof C2107a1) && (interfaceC6536e = interfaceC6536e.getCallerFrame()) != null) {
            if (interfaceC6536e instanceof C2207y2) {
                return (C2207y2) interfaceC6536e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final C2207y2 m7772j(InterfaceC5976f interfaceC5976f, InterfaceC5980j interfaceC5980j, Object obj) {
        if (!(interfaceC5976f instanceof InterfaceC6536e) || interfaceC5980j.mo1654h(C2211z2.f6036q) == null) {
            return null;
        }
        C2207y2 c2207y2M7771i = m7771i((InterfaceC6536e) interfaceC5976f);
        if (c2207y2M7771i != null) {
            c2207y2M7771i.m7947n1(interfaceC5980j, obj);
        }
        return c2207y2M7771i;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7765c(boolean z10, InterfaceC5980j.b bVar) {
        return z10;
    }
}
