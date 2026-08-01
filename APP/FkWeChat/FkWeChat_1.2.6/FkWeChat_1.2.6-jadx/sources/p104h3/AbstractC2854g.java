package p104h3;

/* JADX INFO: renamed from: h3.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2854g {
    /* JADX INFO: renamed from: e */
    public static final int m10164e(int i10, int i11, int i12) {
        return i10 | (i11 << 8) | (i12 << 16);
    }

    /* JADX INFO: renamed from: f */
    public static final int m10165f(int i10) {
        return i10 & 255;
    }

    /* JADX INFO: renamed from: g */
    public static final int m10166g(int i10) {
        return (i10 >> 8) & 255;
    }

    /* JADX INFO: renamed from: h */
    public static final int m10167h(int i10) {
        return (i10 >> 16) & 255;
    }
}
