package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8074 {
    /* JADX INFO: renamed from: ۥ */
    public static final int m4107(int i, int i2, int i3) {
        int iRemainderUnsigned = Integer.remainderUnsigned(i, i3);
        int iRemainderUnsigned2 = Integer.remainderUnsigned(i2, i3);
        int iCompareUnsigned = Integer.compareUnsigned(iRemainderUnsigned, iRemainderUnsigned2);
        int iM26318 = C8057.m26318(iRemainderUnsigned - iRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? iM26318 : C8057.m26318(iM26318 + i3);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final long m4108(long j, long j2, long j3) {
        long jRemainderUnsigned = Long.remainderUnsigned(j, j3);
        long jRemainderUnsigned2 = Long.remainderUnsigned(j2, j3);
        int iCompareUnsigned = Long.compareUnsigned(jRemainderUnsigned, jRemainderUnsigned2);
        long jM26408 = C8064.m26408(jRemainderUnsigned - jRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? jM26408 : C8064.m26408(jM26408 + j3);
    }

    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m26521(long j, long j2, long j3) {
        if (j3 > 0) {
            return Long.compareUnsigned(j, j2) >= 0 ? j2 : C8064.m26408(j2 - m4108(j2, j, C8064.m26408(j3)));
        }
        if (j3 < 0) {
            return Long.compareUnsigned(j, j2) <= 0 ? j2 : C8064.m26408(j2 + m4108(j, j2, C8064.m26408(-j3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m26522(int i, int i2, int i3) {
        if (i3 > 0) {
            return Integer.compareUnsigned(i, i2) >= 0 ? i2 : C8057.m26318(i2 - m4107(i2, i, C8057.m26318(i3)));
        }
        if (i3 < 0) {
            return Integer.compareUnsigned(i, i2) <= 0 ? i2 : C8057.m26318(i2 + m4107(i, i2, C8057.m26318(-i3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
