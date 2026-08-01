package p166l2;

/* JADX INFO: renamed from: l2.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4599x {
    /* JADX INFO: renamed from: a */
    public static final long m18440a(float f10, boolean z10, boolean z11) {
        return AbstractC4581r.m18191b((((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m18441b(float f10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return m18440a(f10, z10, z11);
    }
}
