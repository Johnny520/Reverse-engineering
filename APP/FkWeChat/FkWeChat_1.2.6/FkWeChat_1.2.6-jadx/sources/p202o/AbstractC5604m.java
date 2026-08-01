package p202o;

/* JADX INFO: renamed from: o.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5604m {
    /* JADX INFO: renamed from: a */
    public static final int m22712a(int i10, int i11, boolean z10) {
        return m22717f(i10, i11, !z10);
    }

    /* JADX INFO: renamed from: b */
    public static final int m22713b(int i10, int i11, int i12, boolean z10) {
        return i11 >= i12 ? m22717f(i11, i12, z10) : m22718g(i10, i11, i12, z10) ? m22716e(i10, i11, z10) : m22719h(i10, i11, i12, z10) ? m22715d(i10, i11, z10) : m22712a(i11, i12, z10);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m22714c(int i10, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        return m22713b(i10, i11, i12, z10);
    }

    /* JADX INFO: renamed from: d */
    public static final int m22715d(int i10, int i11, boolean z10) {
        return m22716e(i10, i11, !z10);
    }

    /* JADX INFO: renamed from: e */
    public static final int m22716e(int i10, int i11, boolean z10) {
        return z10 ? i10 : i10 - i11;
    }

    /* JADX INFO: renamed from: f */
    public static final int m22717f(int i10, int i11, boolean z10) {
        if (z10) {
            return 0;
        }
        return i11 - i10;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m22718g(int i10, int i11, int i12, boolean z10) {
        return m22719h(i10, i11, i12, !z10);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m22719h(int i10, int i11, int i12, boolean z10) {
        return z10 ? i11 <= i10 : i12 - i11 > i10;
    }
}
