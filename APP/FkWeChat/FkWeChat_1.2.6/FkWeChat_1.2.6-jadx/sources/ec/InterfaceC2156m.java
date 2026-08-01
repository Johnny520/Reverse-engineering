package ec;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0189q;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: ec.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2156m extends InterfaceC5976f {

    /* JADX INFO: renamed from: ec.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m7838a(InterfaceC2156m interfaceC2156m, Throwable th, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: cancel");
                return false;
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC2156m.mo7833g(th);
        }
    }

    /* JADX INFO: renamed from: B */
    void mo7830B(InterfaceC0184l interfaceC0184l);

    /* JADX INFO: renamed from: O */
    void mo7831O(AbstractC2149k0 abstractC2149k0, Object obj);

    /* JADX INFO: renamed from: Q */
    void mo7832Q(Object obj);

    /* JADX INFO: renamed from: g */
    boolean mo7833g(Throwable th);

    boolean isCancelled();

    /* JADX INFO: renamed from: l */
    boolean mo7834l();

    /* JADX INFO: renamed from: o */
    Object mo7835o(Object obj, Object obj2, InterfaceC0189q interfaceC0189q);

    /* JADX INFO: renamed from: v */
    void mo7836v(Object obj, InterfaceC0189q interfaceC0189q);

    /* JADX INFO: renamed from: z */
    Object mo7837z(Throwable th);
}
