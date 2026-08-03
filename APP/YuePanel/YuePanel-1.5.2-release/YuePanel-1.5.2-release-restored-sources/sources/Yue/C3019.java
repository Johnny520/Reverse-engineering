package Yue;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3019 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public static AbstractC3018 f37;

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final long m83() {
        AbstractC3018 abstractC3018M84 = m84();
        return abstractC3018M84 != null ? abstractC3018M84.m81() : System.currentTimeMillis();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public static final AbstractC3018 m84() {
        return f37;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m5899() {
        AbstractC3018 abstractC3018M84 = m84();
        return abstractC3018M84 != null ? abstractC3018M84.m82() : System.nanoTime();
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m5900(Object obj, long j) {
        C8107 c8107;
        AbstractC3018 abstractC3018M84 = m84();
        if (abstractC3018M84 != null) {
            abstractC3018M84.m5892(obj, j);
            c8107 = C8107.f3222;
        } else {
            c8107 = null;
        }
        if (c8107 == null) {
            LockSupport.parkNanos(obj, j);
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m5901() {
        AbstractC3018 abstractC3018M84 = m84();
        if (abstractC3018M84 != null) {
            abstractC3018M84.m5893();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m5902(@InterfaceC6489 AbstractC3018 abstractC3018) {
        f37 = abstractC3018;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m5903() {
        AbstractC3018 abstractC3018M84 = m84();
        if (abstractC3018M84 != null) {
            abstractC3018M84.m5894();
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m5904() {
        AbstractC3018 abstractC3018M84 = m84();
        if (abstractC3018M84 != null) {
            abstractC3018M84.m5895();
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final void m5905(Thread thread) {
        C8107 c8107;
        AbstractC3018 abstractC3018M84 = m84();
        if (abstractC3018M84 != null) {
            abstractC3018M84.m5896(thread);
            c8107 = C8107.f3222;
        } else {
            c8107 = null;
        }
        if (c8107 == null) {
            LockSupport.unpark(thread);
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m5906() {
        AbstractC3018 abstractC3018M84 = m84();
        if (abstractC3018M84 != null) {
            abstractC3018M84.m5897();
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Runnable m5907(Runnable runnable) {
        Runnable runnableM5898;
        AbstractC3018 abstractC3018M84 = m84();
        return (abstractC3018M84 == null || (runnableM5898 = abstractC3018M84.m5898(runnable)) == null) ? runnable : runnableM5898;
    }
}
