package androidx.compose.runtime.snapshots;

import androidx.appcompat.app.C0108;
import androidx.compose.foundation.text.C0995;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1286 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f3759;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f3760;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f3761;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1287 f3762;

    public AbstractC1286(long j, C1287 c1287) {
        int iM2287;
        int iNumberOfTrailingZeros;
        this.f3762 = c1287;
        this.f3761 = j;
        C0995 c0995 = AbstractC1280.f3746;
        if (j != 0) {
            C1287 c1287Mo2194 = mo2194();
            long j2 = c1287Mo2194.f3766;
            long[] jArr = c1287Mo2194.f3764;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = c1287Mo2194.f3765;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = c1287Mo2194.f3767;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (AbstractC1280.f3744) {
                iM2287 = AbstractC1280.f3741.m2287(j);
            }
        } else {
            iM2287 = -1;
        }
        this.f3759 = iM2287;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m2274(AbstractC1286 abstractC1286) {
        AbstractC1280.f3745.m361(abstractC1286);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract boolean mo2192();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract InterfaceC6557 mo2193();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public C1287 mo2194() {
        return this.f3762;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo2195();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo2218() {
        AbstractC1280.f3743 = AbstractC1280.f3743.m2280(mo2200());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2275() {
        synchronized (AbstractC1280.f3744) {
            mo2218();
            mo2220();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo2208(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public void mo2209(long j) {
        this.f3761 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public abstract AbstractC1286 mo2196(InterfaceC6557 interfaceC6557);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract void mo2198(InterfaceC1257 interfaceC1257);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo2199();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo2212(C1287 c1287) {
        this.f3762 = c1287;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2276() {
        int i = this.f3759;
        if (i >= 0) {
            AbstractC1280.m2257(i);
            this.f3759 = -1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo2220() {
        m2276();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public int mo2213() {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public long mo2200() {
        return this.f3761;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract void mo2201();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract void mo2202();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract InterfaceC6557 mo2203();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC1286 m2277() {
        C0108 c0108 = AbstractC1280.f3745;
        AbstractC1286 abstractC1286 = (AbstractC1286) c0108.m391();
        c0108.m361(this);
        return abstractC1286;
    }
}
