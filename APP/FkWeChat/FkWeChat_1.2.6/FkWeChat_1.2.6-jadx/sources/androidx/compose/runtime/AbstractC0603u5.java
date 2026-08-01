package androidx.compose.runtime;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.runtime.u5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0603u5 {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m2230a(InterfaceC0184l interfaceC0184l, Object obj, C4700i0 c4700i0) {
        interfaceC0184l.mo27m(obj);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m2232c(InterfaceC0572r interfaceC0572r, Object obj, InterfaceC0188p interfaceC0188p) {
        if (interfaceC0572r.mo2177m()) {
            interfaceC0572r.mo2151J(obj, interfaceC0188p);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2233d(InterfaceC0572r interfaceC0572r, final InterfaceC0184l interfaceC0184l) {
        interfaceC0572r.mo2151J(C4700i0.f13910a, new InterfaceC0188p() { // from class: androidx.compose.runtime.t5
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC0603u5.m2230a(interfaceC0184l, obj, (C4700i0) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static final void m2234e(InterfaceC0572r interfaceC0572r, Object obj, InterfaceC0188p interfaceC0188p) {
        if (interfaceC0572r.mo2177m() || !AbstractC1061t.m3842c(interfaceC0572r.mo2170f(), obj)) {
            interfaceC0572r.mo2153L(obj);
            interfaceC0572r.mo2151J(obj, interfaceC0188p);
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0572r m2231b(InterfaceC0572r interfaceC0572r) {
        return interfaceC0572r;
    }
}
