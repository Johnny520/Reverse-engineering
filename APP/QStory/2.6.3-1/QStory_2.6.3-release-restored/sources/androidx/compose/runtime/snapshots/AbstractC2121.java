package androidx.compose.runtime.snapshots;

import androidx.appcompat.app.C0955;
import androidx.compose.foundation.text.C1833;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2121 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f4105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f4106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f4107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2122 f4108;

    public AbstractC2121(long j, C2122 c2122) {
        int iM2857;
        int iNumberOfTrailingZeros;
        this.f4108 = c2122;
        this.f4107 = j;
        C1833 c1833 = AbstractC2115.f4092;
        if (j != 0) {
            C2122 c2122Mo2764 = mo2764();
            long j2 = c2122Mo2764.f4112;
            long[] jArr = c2122Mo2764.f4110;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = c2122Mo2764.f4111;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = c2122Mo2764.f4113;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (AbstractC2115.f4090) {
                iM2857 = AbstractC2115.f4087.m2857(j);
            }
        } else {
            iM2857 = -1;
        }
        this.f4105 = iM2857;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m2844(AbstractC2121 abstractC2121) {
        AbstractC2115.f4091.m922(abstractC2121);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract boolean mo2762();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract InterfaceC7387 mo2763();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public C2122 mo2764() {
        return this.f4108;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo2765();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo2788() {
        AbstractC2115.f4089 = AbstractC2115.f4089.m2850(mo2770());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2845() {
        synchronized (AbstractC2115.f4090) {
            mo2788();
            mo2790();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo2778(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public void mo2779(long j) {
        this.f4107 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public abstract AbstractC2121 mo2766(InterfaceC7387 interfaceC7387);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract void mo2768(InterfaceC2092 interfaceC2092);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo2769();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo2782(C2122 c2122) {
        this.f4108 = c2122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2846() {
        int i = this.f4105;
        if (i >= 0) {
            AbstractC2115.m2827(i);
            this.f4105 = -1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo2790() {
        m2846();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public int mo2783() {
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public long mo2770() {
        return this.f4107;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract void mo2771();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract void mo2772();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract InterfaceC7387 mo2773();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC2121 m2847() {
        C0955 c0955 = AbstractC2115.f4091;
        AbstractC2121 abstractC2121 = (AbstractC2121) c0955.m953();
        c0955.m922(this);
        return abstractC2121;
    }
}
