package p125i7;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p034c7.AbstractC1396x;
import p034c7.C1353a;
import p172l8.C4700i0;

/* JADX INFO: renamed from: i7.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3243v0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f8758a = AbstractC1061t.m3842c(System.getProperty("io.ktor.server.engine.ShutdownHook", "true"), "true");

    /* JADX INFO: renamed from: a */
    public static C4700i0 m12330a(C3239t0 c3239t0, C1353a c1353a) {
        c1353a.getClass();
        try {
            Runtime.getRuntime().removeShutdownHook(c3239t0);
        } catch (IllegalStateException unused) {
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m12331b() {
        return f8758a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m12332c(C3205c0 c3205c0, InterfaceC0173a interfaceC0173a) {
        c3205c0.getClass();
        interfaceC0173a.getClass();
        final C3239t0 c3239t0 = new C3239t0(interfaceC0173a);
        c3205c0.m12197z().m28426c(AbstractC1396x.m5479g(), new InterfaceC0184l() { // from class: i7.u0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3243v0.m12330a(c3239t0, (C1353a) obj);
            }
        });
        Runtime.getRuntime().addShutdownHook(c3239t0);
    }
}
