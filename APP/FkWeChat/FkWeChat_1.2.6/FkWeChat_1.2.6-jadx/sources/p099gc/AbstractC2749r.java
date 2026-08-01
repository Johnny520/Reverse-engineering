package p099gc;

import ec.AbstractC2141i0;
import ec.EnumC2173q0;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p228p8.C5981k;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: gc.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2749r {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2753v m9868a(InterfaceC2165o0 interfaceC2165o0, InterfaceC5980j interfaceC5980j, int i10, InterfaceC0188p interfaceC0188p) {
        return m9869b(interfaceC2165o0, interfaceC5980j, i10, EnumC2732a.f7138q, EnumC2173q0.f5998q, null, interfaceC0188p);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2753v m9869b(InterfaceC2165o0 interfaceC2165o0, InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a, EnumC2173q0 enumC2173q0, InterfaceC0184l interfaceC0184l, InterfaceC0188p interfaceC0188p) {
        C2750s c2750s = new C2750s(AbstractC2141i0.m7769g(interfaceC2165o0, interfaceC5980j), AbstractC2741j.m9834b(i10, enumC2732a, null, 4, null));
        if (interfaceC0184l != null) {
            c2750s.mo7650D0(interfaceC0184l);
        }
        c2750s.m7590j1(enumC2173q0, c2750s, interfaceC0188p);
        return c2750s;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC2753v m9870c(InterfaceC2165o0 interfaceC2165o0, InterfaceC5980j interfaceC5980j, int i10, InterfaceC0188p interfaceC0188p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC5980j = C5981k.f18917q;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m9868a(interfaceC2165o0, interfaceC5980j, i10, interfaceC0188p);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC2753v m9871d(InterfaceC2165o0 interfaceC2165o0, InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a, EnumC2173q0 enumC2173q0, InterfaceC0184l interfaceC0184l, InterfaceC0188p interfaceC0188p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC5980j = C5981k.f18917q;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            enumC2732a = EnumC2732a.f7138q;
        }
        if ((i11 & 8) != 0) {
            enumC2173q0 = EnumC2173q0.f5998q;
        }
        if ((i11 & 16) != 0) {
            interfaceC0184l = null;
        }
        InterfaceC0184l interfaceC0184l2 = interfaceC0184l;
        return m9869b(interfaceC2165o0, interfaceC5980j, i10, enumC2732a, enumC2173q0, interfaceC0184l2, interfaceC0188p);
    }
}
