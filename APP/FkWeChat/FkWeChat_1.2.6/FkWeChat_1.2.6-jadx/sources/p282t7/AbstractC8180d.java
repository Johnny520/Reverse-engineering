package p282t7;

/* JADX INFO: renamed from: t7.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8180d {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC8176b m31846a(boolean z10) {
        return z10 ? new C8190n() : new C8193q();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC8176b m31847b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m31846a(z10);
    }
}
