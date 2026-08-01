package retrofit2;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5767 extends AbstractC5785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5785 f15826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15827;

    public /* synthetic */ C5767(AbstractC5785 abstractC5785, int i) {
        this.f15827 = i;
        this.f15826 = abstractC5785;
    }

    @Override // retrofit2.AbstractC5785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11151(C5759 c5759, Object obj) {
        int i = this.f15827;
        AbstractC5785 abstractC5785 = this.f15826;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        abstractC5785.mo11151(c5759, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        abstractC5785.mo11151(c5759, Array.get(obj, i2));
                    }
                    break;
                }
                break;
        }
    }
}
