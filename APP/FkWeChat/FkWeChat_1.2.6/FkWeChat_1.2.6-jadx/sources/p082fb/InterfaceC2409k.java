package p082fb;

import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: fb.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2409k {

    /* JADX INFO: renamed from: a */
    public static final a f6541a = a.f6542a;

    /* JADX INFO: renamed from: fb.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f6542a = new a();

        /* JADX INFO: renamed from: a */
        public final C2402d m8699a(Runnable runnable, InterfaceC0184l interfaceC0184l) {
            return (runnable == null || interfaceC0184l == null) ? new C2402d(null, 1, null) : new C2401c(runnable, interfaceC0184l);
        }
    }

    void lock();

    void unlock();
}
