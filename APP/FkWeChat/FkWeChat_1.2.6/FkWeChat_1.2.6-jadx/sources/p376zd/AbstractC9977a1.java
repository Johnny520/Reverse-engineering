package p376zd;

/* JADX INFO: renamed from: zd.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9977a1 {
    /* JADX INFO: renamed from: a */
    public static final long m38612a(String str, int i10, int i11) {
        int i12;
        str.getClass();
        if (i10 < 0) {
            C10030z0.m38853a("beginIndex < 0: ", i10);
            return 0L;
        }
        if (i11 < i10) {
            C10028y0.m38849a("endIndex < beginIndex: ", i11, " < ", i10);
            return 0L;
        }
        if (i11 > str.length()) {
            C10028y0.m38849a("endIndex > string.length: ", i11, " > ", str.length());
            return 0L;
        }
        long j10 = 0;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                j10++;
            } else {
                if (cCharAt < 2048) {
                    i12 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i12 = 3;
                } else {
                    int i13 = i10 + 1;
                    char cCharAt2 = i13 < i11 ? str.charAt(i13) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j10++;
                        i10 = i13;
                    } else {
                        j10 += (long) 4;
                        i10 += 2;
                    }
                }
                j10 += (long) i12;
            }
            i10++;
        }
        return j10;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m38613b(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return m38612a(str, i10, i11);
    }
}
