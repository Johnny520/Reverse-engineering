package p370z6;

import p010a9.InterfaceC0184l;
import p172l8.C4700i0;
import p215oc.C5725t;
import p281t6.C8140d;
import p370z6.InterfaceC9878b;

/* JADX INFO: renamed from: z6.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9878b {

    /* JADX INFO: renamed from: z6.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C4700i0 m38359a(InterfaceC9880d interfaceC9880d) {
            interfaceC9880d.getClass();
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m38360b(InterfaceC9878b interfaceC9878b, C8140d c8140d, InterfaceC9880d interfaceC9880d, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: register");
                return;
            }
            if ((i10 & 4) != 0) {
                interfaceC0184l = new InterfaceC0184l() { // from class: z6.a
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj2) {
                        return InterfaceC9878b.a.m38359a((InterfaceC9880d) obj2);
                    }
                };
            }
            interfaceC9878b.mo22347a(c8140d, interfaceC9880d, interfaceC0184l);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo22347a(C8140d c8140d, InterfaceC9880d interfaceC9880d, InterfaceC0184l interfaceC0184l);
}
