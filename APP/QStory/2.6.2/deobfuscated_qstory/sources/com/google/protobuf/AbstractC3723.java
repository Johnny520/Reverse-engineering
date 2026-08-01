package com.google.protobuf;

import p007.AbstractC6136;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪世哲兰子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3723 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC3412 f11538;

    static {
        f11538 = (AbstractC3725.f11541 && AbstractC3725.f11542 && !AbstractC3546.m7799()) ? new C3724(1) : new C3724(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m7997(String str) throws Exception {
        int length = str.length();
        int i = 0;
        final int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                try {
                    final int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new Exception(i2, length2) { // from class: com.google.protobuf.Utf8$UnpairedSurrogateException
                                        {
                                            super(AbstractC6136.m11559(i2, length2, "Unpaired surrogate at index ", " of "));
                                        }
                                    };
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                } catch (Utf8$UnpairedSurrogateException unused) {
                    return str.getBytes(AbstractC3401.f11054).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }
}
