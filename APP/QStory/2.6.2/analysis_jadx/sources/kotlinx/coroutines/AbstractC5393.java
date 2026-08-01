package kotlinx.coroutines;

import kotlin.collections.C4350;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5393 extends AbstractC5431 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ int f15025 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C4350 f15026;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f15027;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f15028;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public abstract long mo10436();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m10456(boolean z) {
        this.f15027 = (z ? 4294967296L : 1L) + this.f15027;
        if (z) {
            return;
        }
        this.f15028 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m10457(AbstractC5395 abstractC5395) {
        C4350 c4350 = this.f15026;
        if (c4350 == null) {
            c4350 = new C4350();
            this.f15026 = c4350;
        }
        c4350.addLast(abstractC5395);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m10458(boolean z) {
        long j = this.f15027 - (z ? 4294967296L : 1L);
        this.f15027 = j;
        if (j <= 0 && this.f15028) {
            mo10451();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public abstract void mo10451();

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final boolean m10459() {
        C4350 c4350 = this.f15026;
        if (c4350 == null) {
            return false;
        }
        AbstractC5395 abstractC5395 = (AbstractC5395) (c4350.isEmpty() ? null : c4350.removeFirst());
        if (abstractC5395 == null) {
            return false;
        }
        abstractC5395.run();
        return true;
    }
}
