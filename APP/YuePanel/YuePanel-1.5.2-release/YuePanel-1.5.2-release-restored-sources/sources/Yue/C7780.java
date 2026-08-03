package Yue;

import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥۢۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6839
public final class C7780 implements InterfaceC4225.InterfaceC4228<C7778<?>> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final ThreadLocal<?> f23323;

    public C7780(@InterfaceC6399 ThreadLocal<?> threadLocal) {
        this.f23323 = threadLocal;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥۢۡۢ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ C7780 m24724(C7780 c7780, ThreadLocal threadLocal, int i, Object obj) {
        if ((i & 1) != 0) {
            threadLocal = c7780.f23323;
        }
        return c7780.m3879(threadLocal);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7780) && C5499.m17094(this.f23323, ((C7780) obj).f23323);
    }

    public int hashCode() {
        return this.f23323.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f23323 + ')';
    }

    /* JADX INFO: renamed from: ۥ */
    public final ThreadLocal<?> m3878() {
        return this.f23323;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final C7780 m3879(@InterfaceC6399 ThreadLocal<?> threadLocal) {
        return new C7780(threadLocal);
    }
}
