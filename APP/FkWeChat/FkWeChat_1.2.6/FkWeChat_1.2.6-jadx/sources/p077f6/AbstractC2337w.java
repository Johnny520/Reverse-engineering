package p077f6;

/* JADX INFO: renamed from: f6.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2337w {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2336v m8505a(boolean z10, boolean z11, boolean z12, long j10) {
        return new C2304d(z10, z11, z12, j10);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC2336v m8506b(boolean z10, boolean z11, boolean z12, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        if ((i10 & 8) != 0) {
            j10 = 2000;
        }
        return m8505a(z10, z11, z12, j10);
    }
}
