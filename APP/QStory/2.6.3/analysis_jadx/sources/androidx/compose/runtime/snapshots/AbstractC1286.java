package androidx.compose.runtime.snapshots;

import androidx.appcompat.app.C0108;
import androidx.compose.foundation.text.C0995;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1286 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f3760;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f3761;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f3762;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1287 f3763;

    public AbstractC1286(long j, C1287 c1287) {
        int iM2297;
        int iNumberOfTrailingZeros;
        this.f3763 = c1287;
        this.f3762 = j;
        C0995 c0995 = AbstractC1280.f3747;
        if (j != 0) {
            C1287 c1287Mo2204 = mo2204();
            long j2 = c1287Mo2204.f3767;
            long[] jArr = c1287Mo2204.f3765;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = c1287Mo2204.f3766;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = c1287Mo2204.f3768;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (AbstractC1280.f3745) {
                iM2297 = AbstractC1280.f3742.m2297(j);
            }
        } else {
            iM2297 = -1;
        }
        this.f3760 = iM2297;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m2284(AbstractC1286 abstractC1286) {
        AbstractC1280.f3746.m362(abstractC1286);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract boolean mo2202();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract InterfaceC6558 mo2203();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public C1287 mo2204() {
        return this.f3763;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo2205();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo2228() {
        AbstractC1280.f3744 = AbstractC1280.f3744.m2290(mo2210());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2285() {
        synchronized (AbstractC1280.f3745) {
            mo2228();
            mo2230();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo2218(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public void mo2219(long j) {
        this.f3762 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public abstract AbstractC1286 mo2206(InterfaceC6558 interfaceC6558);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract void mo2208(InterfaceC1257 interfaceC1257);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo2209();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo2222(C1287 c1287) {
        this.f3763 = c1287;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2286() {
        int i = this.f3760;
        if (i >= 0) {
            AbstractC1280.m2267(i);
            this.f3760 = -1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo2230() {
        m2286();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public int mo2223() {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public long mo2210() {
        return this.f3762;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract void mo2211();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract void mo2212();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract InterfaceC6558 mo2213();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC1286 m2287() {
        C0108 c0108 = AbstractC1280.f3746;
        AbstractC1286 abstractC1286 = (AbstractC1286) c0108.m393();
        c0108.m362(this);
        return abstractC1286;
    }
}
