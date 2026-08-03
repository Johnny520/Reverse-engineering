package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3593 {
    @InterfaceC6399
    @InterfaceC6501
    /* JADX INFO: renamed from: ۥ */
    public static final <E> InterfaceC3592<E> m642(int i) {
        if (i == -2) {
            return new C3379(InterfaceC3713.f491.m797());
        }
        if (i == -1) {
            return new C4097();
        }
        if (i == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        }
        if (i != Integer.MAX_VALUE) {
            return new C3379(i);
        }
        throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
    }
}
