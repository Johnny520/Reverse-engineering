package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7698 {
    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ */
    public static /* synthetic */ void m3798() {
    }

    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> T m3799(@InterfaceC6399 Object obj, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        T tInvoke;
        synchronized (obj) {
            try {
                tInvoke = interfaceC5122.invoke();
                C5437.m16930(1);
            } catch (Throwable th) {
                C5437.m16930(1);
                C5437.m16929(1);
                throw th;
            }
        }
        C5437.m16929(1);
        return tInvoke;
    }
}
