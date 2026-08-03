package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7707 {
    /* JADX INFO: renamed from: ۥ */
    public static final int m3809(@InterfaceC6399 String str, int i, int i2, int i3) {
        return (int) C7705.m24500(str, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final long m3810(@InterfaceC6399 String str, long j, long j2, long j3) {
        String strM24501 = C7705.m24501(str);
        if (strM24501 == null) {
            return j;
        }
        Long lM23937 = C7626.m23937(strM24501);
        if (lM23937 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM24501 + '\'').toString());
        }
        long jLongValue = lM23937.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m24505(@InterfaceC6399 String str, boolean z) {
        String strM24501 = C7705.m24501(str);
        return strM24501 != null ? Boolean.parseBoolean(strM24501) : z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ int m24506(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C7705.m3806(str, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ long m24507(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C7705.m24500(str, j, j4, j3);
    }
}
