package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "AutoCloseableKt")
public final class C3479 {
    @InterfaceC6839
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ */
    public static final void m545(@InterfaceC6489 AutoCloseable autoCloseable, @InterfaceC6489 Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                C4741.m1656(th, th2);
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T extends AutoCloseable, R> R m546(T t, InterfaceC5124<? super T, ? extends R> interfaceC5124) throws Exception {
        C5499.m17103(interfaceC5124, "block");
        try {
            R rInvoke = interfaceC5124.invoke(t);
            C5437.m16930(1);
            m545(t, null);
            C5437.m16929(1);
            return rInvoke;
        } finally {
        }
    }
}
