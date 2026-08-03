package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Fnv {
    public static final long MAGIC_HASH_CODE = -3750763034362895579L;
    public static final long MAGIC_PRIME = 1099511628211L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long hashCode64(String str) {
        int length = str.length();
        if (length <= 8) {
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    int i10 = length - 1;
                    long jCharAt = 0;
                    while (i10 >= 0) {
                        jCharAt = i10 == str.length() + (-1) ? (byte) r8 : (jCharAt << 8) + ((long) str.charAt(i10));
                        i10--;
                    }
                    if (jCharAt != 0) {
                        return jCharAt;
                    }
                } else {
                    char cCharAt = str.charAt(i9);
                    if (cCharAt > 255 || (i9 == 0 && cCharAt == 0)) {
                        break;
                    }
                    i9++;
                }
            }
        }
        long jCharAt2 = MAGIC_HASH_CODE;
        for (int i11 = 0; i11 < length; i11++) {
            jCharAt2 = (jCharAt2 ^ ((long) str.charAt(i11))) * MAGIC_PRIME;
        }
        return jCharAt2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long hashCode64LCase(String str) {
        int i9;
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < length) {
                char cCharAt = str.charAt(i10);
                if (cCharAt > 255 || (i10 == 0 && cCharAt == 0)) {
                    break;
                }
                if (cCharAt == '-' || cCharAt == '_' || cCharAt == ' ') {
                    i11++;
                }
                i10++;
            } else if (length - i11 <= 8) {
                int i12 = length - 1;
                long j3 = 0;
                int i13 = 0;
                while (i12 >= 0) {
                    char cCharAt2 = str.charAt(i12);
                    if (cCharAt2 == '-' || cCharAt2 == '_' || cCharAt2 == ' ') {
                        i9 = i12;
                    } else {
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                            cCharAt2 = (char) (cCharAt2 + ' ');
                        }
                        if (i13 == 0) {
                            j3 = (byte) cCharAt2;
                            i9 = i12;
                        } else {
                            i9 = i12;
                            j3 = (j3 << 8) + ((long) cCharAt2);
                        }
                        i13++;
                    }
                    i12 = i9 - 1;
                }
                if (j3 != 0) {
                    return j3;
                }
            }
        }
        long j4 = -3750763034362895579L;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt3 = str.charAt(i14);
            if (cCharAt3 != '-' && cCharAt3 != '_' && cCharAt3 != ' ') {
                if (cCharAt3 >= 'A' && cCharAt3 <= 'Z') {
                    cCharAt3 = (char) (cCharAt3 + ' ');
                }
                j4 = (j4 ^ ((long) cCharAt3)) * MAGIC_PRIME;
            }
        }
        return j4;
    }
}
