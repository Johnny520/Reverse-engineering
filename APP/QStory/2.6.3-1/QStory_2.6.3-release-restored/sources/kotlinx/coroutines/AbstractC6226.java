package kotlinx.coroutines;

import kotlin.collections.C5183;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6226 extends AbstractC6264 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ int f15370 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C5183 f15371;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f15372;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f15373;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public abstract long mo10999();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m11019(boolean z) {
        this.f15372 = (z ? 4294967296L : 1L) + this.f15372;
        if (z) {
            return;
        }
        this.f15373 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m11020(boolean z) {
        long j = this.f15372 - (z ? 4294967296L : 1L);
        this.f15372 = j;
        if (j <= 0 && this.f15373) {
            mo11014();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m11021(AbstractC6228 abstractC6228) {
        C5183 c5183 = this.f15371;
        if (c5183 == null) {
            c5183 = new C5183();
            this.f15371 = c5183;
        }
        c5183.addLast(abstractC6228);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public abstract void mo11014();

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final boolean m11022() {
        C5183 c5183 = this.f15371;
        if (c5183 == null) {
            return false;
        }
        AbstractC6228 abstractC6228 = (AbstractC6228) (c5183.isEmpty() ? null : c5183.removeFirst());
        if (abstractC6228 == null) {
            return false;
        }
        abstractC6228.run();
        return true;
    }
}
