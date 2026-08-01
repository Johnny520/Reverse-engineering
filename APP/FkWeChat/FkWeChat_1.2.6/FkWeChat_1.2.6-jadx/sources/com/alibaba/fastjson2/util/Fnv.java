package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class Fnv {
    public static final long MAGIC_HASH_CODE = -3750763034362895579L;
    public static final long MAGIC_PRIME = 1099511628211L;

    public static long hashCode64(String str) {
        if (str.length() <= 8) {
            int i10 = 0;
            while (true) {
                if (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt > 255 || (i10 == 0 && cCharAt == 0)) {
                        break;
                    }
                    i10++;
                } else {
                    long jCharAt = 0;
                    for (int length = str.length() - 1; length >= 0; length--) {
                        jCharAt = (jCharAt << 8) | ((long) str.charAt(length));
                    }
                    if (jCharAt != 0) {
                        return jCharAt;
                    }
                }
            }
        }
        long jCharAt2 = MAGIC_HASH_CODE;
        for (int i11 = 0; i11 < str.length(); i11++) {
            jCharAt2 = (jCharAt2 ^ ((long) str.charAt(i11))) * MAGIC_PRIME;
        }
        return jCharAt2;
    }

    public static long hashCode64LCase(String str) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < str.length()) {
                char cCharAt = str.charAt(i10);
                if (cCharAt > 255 || (i10 == 0 && cCharAt == 0)) {
                    break;
                }
                if (cCharAt == '-' || cCharAt == '_' || cCharAt == ' ') {
                    i11++;
                }
                i10++;
            } else if (str.length() - i11 <= 8) {
                long j10 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char cCharAt2 = str.charAt(length);
                    if (cCharAt2 != '-' && cCharAt2 != '_' && cCharAt2 != ' ') {
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                            cCharAt2 = (char) (cCharAt2 + ' ');
                        }
                        j10 = (j10 << 8) | ((long) cCharAt2);
                    }
                }
                if (j10 != 0) {
                    return j10;
                }
            }
        }
        long j11 = MAGIC_HASH_CODE;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt3 = str.charAt(i12);
            if (cCharAt3 != '-' && cCharAt3 != '_' && cCharAt3 != ' ') {
                if (cCharAt3 >= 'A' && cCharAt3 <= 'Z') {
                    cCharAt3 = (char) (cCharAt3 + ' ');
                }
                j11 = (j11 ^ ((long) cCharAt3)) * MAGIC_PRIME;
            }
        }
        return j11;
    }

    private static long hashCode64UTF8(byte[] bArr, int i10, int i11) {
        char[] cArr = new char[i11];
        return hashCode64(cArr, 0, IOUtils.decodeUTF8(bArr, i10, i11, cArr));
    }

    public static long hashCode64(byte[] bArr, int i10, int i11, boolean z10) {
        if (!z10) {
            return hashCode64UTF8(bArr, i10, i11);
        }
        if (i11 > 0 && i11 <= 8) {
            long longLE = IOUtils.getLongLE(bArr, i10) & ((-1) >>> ((8 - i11) << 3));
            if (longLE != 0) {
                return longLE;
            }
        }
        long j10 = MAGIC_HASH_CODE;
        for (int i12 = 0; i12 < i11; i12++) {
            j10 = (j10 ^ ((long) bArr[i10 + i12])) * MAGIC_PRIME;
        }
        return j10;
    }

    public static long hashCode64(char[] cArr, int i10, int i11) {
        if (i11 <= 8) {
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    long j10 = 0;
                    for (int i13 = i11 - 1; i13 >= 0; i13--) {
                        j10 = (j10 << 8) | ((long) cArr[i10 + i13]);
                    }
                    if (j10 != 0) {
                        return j10;
                    }
                } else {
                    char c10 = cArr[i10 + i12];
                    if (c10 > 255 || (i12 == 0 && c10 == 0)) {
                        break;
                    }
                    i12++;
                }
            }
        }
        long j11 = MAGIC_HASH_CODE;
        for (int i14 = 0; i14 < i11; i14++) {
            j11 = (j11 ^ ((long) cArr[i10 + i14])) * MAGIC_PRIME;
        }
        return j11;
    }

    public static long hashCode64(String... strArr) {
        if (strArr.length == 1) {
            return hashCode64(strArr[0]);
        }
        long jHashCode64 = MAGIC_HASH_CODE;
        for (String str : strArr) {
            jHashCode64 = (jHashCode64 ^ hashCode64(str)) * MAGIC_PRIME;
        }
        return jHashCode64;
    }
}
