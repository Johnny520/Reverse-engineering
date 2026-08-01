package ec;

/* JADX INFO: renamed from: ec.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2204y {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2196w m7934a(InterfaceC2198w1 interfaceC2198w1) {
        return new C2200x(interfaceC2198w1);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2196w m7935b(Object obj) {
        C2200x c2200x = new C2200x(null);
        c2200x.mo7918v0(obj);
        return c2200x;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC2196w m7936c(InterfaceC2198w1 interfaceC2198w1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2198w1 = null;
        }
        return m7934a(interfaceC2198w1);
    }
}
