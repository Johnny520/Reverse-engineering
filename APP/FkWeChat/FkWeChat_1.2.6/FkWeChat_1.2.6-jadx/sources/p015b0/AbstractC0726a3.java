package p015b0;

import p319w2.AbstractC9142u3;

/* JADX INFO: renamed from: b0.a3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0726a3 {
    /* JADX INFO: renamed from: a */
    public static final int m2837a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: b */
    public static final int m2838b(CharSequence charSequence, int i10) {
        while (i10 > 0) {
            if (charSequence.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static final long m2839c(CharSequence charSequence, int i10) {
        return AbstractC9142u3.m35530b(m2838b(charSequence, i10), m2837a(charSequence, i10));
    }
}
