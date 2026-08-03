package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6823 {
    /* JADX INFO: renamed from: ۥ */
    public static final int m3279(int i, int i2, int i3) {
        return m21578(m21578(i, i3) - m21578(i2, i3), i3);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final long m3280(long j, long j2, long j3) {
        return m21579(m21579(j, j3) - m21579(j2, j3), j3);
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m21576(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m3279(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m3279(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final long m21577(long j, long j2, long j3) {
        if (j3 > 0) {
            return j >= j2 ? j2 : j2 - m3280(j2, j, j3);
        }
        if (j3 < 0) {
            return j <= j2 ? j2 : j2 + m3280(j, j2, -j3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m21578(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final long m21579(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }
}
