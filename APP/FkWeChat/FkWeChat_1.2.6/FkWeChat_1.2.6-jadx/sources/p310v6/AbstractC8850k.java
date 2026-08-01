package p310v6;

import p299ub.AbstractC8610a;

/* JADX INFO: renamed from: v6.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8850k {
    /* JADX INFO: renamed from: a */
    public static final int m33989a(CharSequence charSequence, C8849j c8849j) {
        charSequence.getClass();
        c8849j.getClass();
        int iM33986b = c8849j.m33986b();
        int iM33985a = c8849j.m33985a();
        if (iM33986b < iM33985a && !AbstractC8610a.m33055c(charSequence.charAt(iM33986b))) {
            do {
                iM33986b++;
                if (iM33986b >= iM33985a) {
                    break;
                }
            } while (!AbstractC8610a.m33055c(charSequence.charAt(iM33986b)));
        }
        return iM33986b;
    }

    /* JADX INFO: renamed from: b */
    public static final CharSequence m33990b(CharSequence charSequence, C8849j c8849j) {
        charSequence.getClass();
        c8849j.getClass();
        int iM33989a = m33989a(charSequence, c8849j);
        CharSequence charSequenceSubSequence = charSequence.subSequence(c8849j.m33986b(), iM33989a);
        c8849j.m33988d(iM33989a);
        return charSequenceSubSequence;
    }

    /* JADX INFO: renamed from: c */
    public static final void m33991c(CharSequence charSequence, C8849j c8849j) {
        charSequence.getClass();
        c8849j.getClass();
        int iM33986b = c8849j.m33986b();
        int iM33985a = c8849j.m33985a();
        if (iM33986b >= iM33985a || !AbstractC8610a.m33055c(charSequence.charAt(iM33986b))) {
            return;
        }
        do {
            iM33986b++;
            if (iM33986b >= iM33985a) {
                break;
            }
        } while (AbstractC8610a.m33055c(charSequence.charAt(iM33986b)));
        c8849j.m33988d(iM33986b);
    }

    /* JADX INFO: renamed from: d */
    public static final int m33992d(C8843d c8843d, int i10, int i11) {
        c8843d.getClass();
        while (i10 < i11) {
            char cCharAt = c8843d.charAt(i10);
            if (!AbstractC8610a.m33055c(cCharAt) && cCharAt != '\t') {
                break;
            }
            i10++;
        }
        return i10;
    }
}
