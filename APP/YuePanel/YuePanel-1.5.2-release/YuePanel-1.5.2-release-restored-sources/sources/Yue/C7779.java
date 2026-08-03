package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7779 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C7779 f3076 = new C7779();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final ThreadLocal<AbstractC4714> f3077 = new ThreadLocal<>();

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final AbstractC4714 m3876() {
        return f3077.get();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final AbstractC4714 m3877() {
        ThreadLocal<AbstractC4714> threadLocal = f3077;
        AbstractC4714 abstractC4714 = threadLocal.get();
        if (abstractC4714 != null) {
            return abstractC4714;
        }
        AbstractC4714 abstractC4714M1628 = C4719.m1628();
        threadLocal.set(abstractC4714M1628);
        return abstractC4714M1628;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m24722() {
        f3077.set(null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m24723(@InterfaceC6399 AbstractC4714 abstractC4714) {
        f3077.set(abstractC4714);
    }
}
