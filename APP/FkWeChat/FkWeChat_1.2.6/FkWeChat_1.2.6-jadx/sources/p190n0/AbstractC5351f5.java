package p190n0;

import p080f9.AbstractC2368o;
import p250r1.C6455e;
import p319w2.C9122q3;

/* JADX INFO: renamed from: n0.f5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5351f5 {
    /* JADX INFO: renamed from: a */
    public static final float m21818a(C9122q3 c9122q3, int i10, boolean z10, boolean z11) {
        return c9122q3.m35391j(i10, c9122q3.m35384c(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 + (-1), 0) : i10) == c9122q3.m35405y(i10));
    }

    /* JADX INFO: renamed from: b */
    public static final long m21819b(C9122q3 c9122q3, int i10, boolean z10, boolean z11) {
        int iM35397q = c9122q3.m35397q(i10);
        if (iM35397q >= c9122q3.m35395n()) {
            return C6455e.f20314b.m25568b();
        }
        return C6455e.m25551e((((long) Float.floatToRawIntBits(AbstractC2368o.m8585l(m21818a(c9122q3, i10, z10, z11), 0.0f, (int) (c9122q3.m35381B() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(AbstractC2368o.m8585l(c9122q3.m35394m(iM35397q), 0.0f, (int) (c9122q3.m35381B() & 4294967295L)))) & 4294967295L));
    }
}
