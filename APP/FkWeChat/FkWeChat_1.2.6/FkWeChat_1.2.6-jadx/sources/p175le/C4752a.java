package p175le;

/* JADX INFO: renamed from: le.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4752a {

    /* JADX INFO: renamed from: a */
    public static final C4752a f14072a = new C4752a();

    /* JADX INFO: renamed from: a */
    public final int m19003a(int i10) {
        return i10 >= 65536 ? 2 : 1;
    }

    /* JADX INFO: renamed from: b */
    public final int m19004b(CharSequence charSequence, int i10) {
        int i11;
        charSequence.getClass();
        char cCharAt = charSequence.charAt(i10);
        if (Character.isHighSurrogate(cCharAt) && (i11 = i10 + 1) < charSequence.length()) {
            char cCharAt2 = charSequence.charAt(i11);
            if (Character.isLowSurrogate(cCharAt2)) {
                return m19007e(cCharAt, cCharAt2);
            }
        }
        return cCharAt;
    }

    /* JADX INFO: renamed from: c */
    public final int m19005c(CharSequence charSequence, int i10) {
        charSequence.getClass();
        int i11 = i10 - 1;
        char cCharAt = charSequence.charAt(i11);
        if (Character.isLowSurrogate(cCharAt) && i11 > 0) {
            char cCharAt2 = charSequence.charAt(i10 - 2);
            if (Character.isHighSurrogate(cCharAt2)) {
                return m19007e(cCharAt2, cCharAt);
            }
        }
        return cCharAt;
    }

    /* JADX INFO: renamed from: d */
    public final int m19006d(CharSequence charSequence, int i10, int i11) {
        charSequence.getClass();
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 < 0) {
            while (i10 > 0 && i11 < 0) {
                int i12 = i10 - 1;
                i10 = (Character.isLowSurrogate(charSequence.charAt(i12)) && i12 > 0 && Character.isHighSurrogate(charSequence.charAt(i10 + (-2)))) ? i10 - 2 : i12;
                i11++;
            }
            if (i11 >= 0) {
                return i10;
            }
            throw new IndexOutOfBoundsException();
        }
        int i13 = 0;
        while (i10 < length && i13 < i11) {
            int i14 = i10 + 1;
            i10 = (Character.isHighSurrogate(charSequence.charAt(i10)) && i14 < length && Character.isLowSurrogate(charSequence.charAt(i14))) ? i10 + 2 : i14;
            i13++;
        }
        if (i13 >= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: e */
    public final int m19007e(char c10, char c11) {
        return ((c10 << '\n') + c11) - 56613888;
    }
}
