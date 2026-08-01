package io.ktor.utils.p131io;

import ec.InterfaceC2198w1;
import p010a9.InterfaceC0184l;
import p172l8.C4700i0;

/* JADX INFO: renamed from: io.ktor.utils.io.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3464e {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m12935a(C3456a c3456a, Throwable th) {
        if (th != null) {
            c3456a.mo8543g(th);
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m12936b(final C3456a c3456a, InterfaceC2198w1 interfaceC2198w1) {
        c3456a.getClass();
        interfaceC2198w1.getClass();
        interfaceC2198w1.mo7650D0(new InterfaceC0184l() { // from class: io.ktor.utils.io.d
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3464e.m12935a(c3456a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final void m12937c(C3456a c3456a, InterfaceC3478p interfaceC3478p) {
        c3456a.getClass();
        interfaceC3478p.getClass();
        m12936b(c3456a, interfaceC3478p.mo12931a());
    }
}
