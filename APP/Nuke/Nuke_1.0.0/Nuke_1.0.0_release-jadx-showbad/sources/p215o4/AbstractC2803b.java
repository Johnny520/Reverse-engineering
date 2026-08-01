package p215o4;

import p117X2.AbstractC1665j;
import p208n4.C2719r;

/* JADX INFO: renamed from: o4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2803b {

    /* JADX INFO: renamed from: a */
    public static final char[] f8827a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m4988a(char c5) {
        if ('0' <= c5 && c5 < ':') {
            return c5 - '0';
        }
        if ('a' <= c5 && c5 < 'g') {
            return c5 - 'W';
        }
        if ('A' <= c5 && c5 < 'G') {
            return c5 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final int m4989b(C2719r c2719r, int i5) {
        int i6;
        int[] iArr = c2719r.f8664i;
        int i7 = i5 + 1;
        int length = c2719r.f8663h.length;
        AbstractC1665j.m2985e(iArr, "<this>");
        int i8 = length - 1;
        int i9 = 0;
        while (true) {
            if (i9 <= i8) {
                i6 = (i9 + i8) >>> 1;
                int i10 = iArr[i6];
                if (i10 >= i7) {
                    if (i10 <= i7) {
                        break;
                    }
                    i8 = i6 - 1;
                } else {
                    i9 = i6 + 1;
                }
            } else {
                i6 = (-i9) - 1;
                break;
            }
        }
        return i6 >= 0 ? i6 : ~i6;
    }
}
