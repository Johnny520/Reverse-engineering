package kotlinx.coroutines;

import kotlin.collections.C4351;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5394 extends AbstractC5432 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ int f15025 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C4351 f15026;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f15027;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f15028;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public abstract long mo10440();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m10460(boolean z) {
        this.f15027 = (z ? 4294967296L : 1L) + this.f15027;
        if (z) {
            return;
        }
        this.f15028 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m10461(boolean z) {
        long j = this.f15027 - (z ? 4294967296L : 1L);
        this.f15027 = j;
        if (j <= 0 && this.f15028) {
            mo10455();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m10462(AbstractC5396 abstractC5396) {
        C4351 c4351 = this.f15026;
        if (c4351 == null) {
            c4351 = new C4351();
            this.f15026 = c4351;
        }
        c4351.addLast(abstractC5396);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public abstract void mo10455();

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final boolean m10463() {
        C4351 c4351 = this.f15026;
        if (c4351 == null) {
            return false;
        }
        AbstractC5396 abstractC5396 = (AbstractC5396) (c4351.isEmpty() ? null : c4351.removeFirst());
        if (abstractC5396 == null) {
            return false;
        }
        abstractC5396.run();
        return true;
    }
}
