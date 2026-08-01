package p299ub;

import p080f9.C2363j;

/* JADX INFO: renamed from: ub.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8610a {
    /* JADX INFO: renamed from: a */
    public static int m33053a(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new C2363j(2, 36));
    }

    /* JADX INFO: renamed from: b */
    public static final int m33054b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m33055c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }
}
