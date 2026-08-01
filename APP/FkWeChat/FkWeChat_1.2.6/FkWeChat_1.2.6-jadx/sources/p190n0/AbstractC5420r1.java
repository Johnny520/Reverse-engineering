package p190n0;

import p104h3.EnumC2856i;
import p319w2.C9122q3;

/* JADX INFO: renamed from: n0.r1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5420r1 {
    /* JADX INFO: renamed from: a */
    public static final EnumC2856i m22122a(C9122q3 c9122q3, int i10) {
        return m22123b(c9122q3, i10) ? c9122q3.m35405y(i10) : c9122q3.m35384c(i10);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m22123b(C9122q3 c9122q3, int i10) {
        if (c9122q3.m35393l().m35370j().length() != 0) {
            int iM35397q = c9122q3.m35397q(i10);
            if (i10 != 0 && iM35397q == c9122q3.m35397q(i10 - 1)) {
                return false;
            }
            if (i10 != c9122q3.m35393l().m35370j().length() && iM35397q == c9122q3.m35397q(i10 + 1)) {
                return false;
            }
        }
        return true;
    }
}
