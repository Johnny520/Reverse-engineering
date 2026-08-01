package p167g4;

import p191k4.C2475a;
import p208n4.C2709h;

/* JADX INFO: renamed from: g4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2190b {

    /* JADX INFO: renamed from: a */
    public static final C2709h f7156a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2709h c2709h = C2709h.f8630g;
        f7156a = C2475a.m4416e("xn--");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m4012a(int i5, int i6, boolean z5) {
        int i7 = z5 ? i5 / 700 : i5 / 2;
        int i8 = (i7 / i6) + i7;
        int i9 = 0;
        while (i8 > 455) {
            i8 /= 35;
            i9 += 36;
        }
        return ((i8 * 36) / (i8 + 38)) + i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m4013b(int i5) {
        if (i5 < 26) {
            return i5 + 97;
        }
        if (i5 < 36) {
            return i5 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i5).toString());
    }
}
