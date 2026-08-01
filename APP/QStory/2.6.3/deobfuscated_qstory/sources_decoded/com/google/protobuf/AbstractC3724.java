package com.google.protobuf;

import p009.AbstractC6183;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪世哲兰子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3724 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC3413 f11543;

    static {
        f11543 = (AbstractC3726.f11546 && AbstractC3726.f11547 && !AbstractC3547.m7786()) ? new C3725(1) : new C3725(0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m7984(String str) throws Exception {
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
                                            super(AbstractC6183.m11591(i2, length2, "Unpaired surrogate at index ", " of "));
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
                    return str.getBytes(AbstractC3402.f11059).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }
}
