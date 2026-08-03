package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7571 extends C7570 {
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <R> R m23705(Object obj, InterfaceC5122<? extends R> interfaceC5122) {
        R rInvoke;
        C5499.m17103(obj, "lock");
        C5499.m17103(interfaceC5122, "block");
        synchronized (obj) {
            try {
                rInvoke = interfaceC5122.invoke();
                C5437.m16930(1);
            } catch (Throwable th) {
                C5437.m16930(1);
                C5437.m16929(1);
                throw th;
            }
        }
        C5437.m16929(1);
        return rInvoke;
    }
}
