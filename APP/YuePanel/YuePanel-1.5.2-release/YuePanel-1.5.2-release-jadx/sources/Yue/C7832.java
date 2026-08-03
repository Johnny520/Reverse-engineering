package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "TimingKt")
public final class C7832 {
    /* JADX INFO: renamed from: ۥ */
    public static final long m3928(@InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        C5499.m17103(interfaceC5122, "block");
        long jNanoTime = System.nanoTime();
        interfaceC5122.invoke();
        return System.nanoTime() - jNanoTime;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final long m3929(@InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        C5499.m17103(interfaceC5122, "block");
        long jCurrentTimeMillis = System.currentTimeMillis();
        interfaceC5122.invoke();
        return System.currentTimeMillis() - jCurrentTimeMillis;
    }
}
