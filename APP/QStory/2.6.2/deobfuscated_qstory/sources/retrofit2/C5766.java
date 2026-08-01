package retrofit2;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5766 extends AbstractC5784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5784 f15826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15827;

    public /* synthetic */ C5766(AbstractC5784 abstractC5784, int i) {
        this.f15827 = i;
        this.f15826 = abstractC5784;
    }

    @Override // retrofit2.AbstractC5784
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11094(C5758 c5758, Object obj) {
        int i = this.f15827;
        AbstractC5784 abstractC5784 = this.f15826;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        abstractC5784.mo11094(c5758, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        abstractC5784.mo11094(c5758, Array.get(obj, i2));
                    }
                    break;
                }
                break;
        }
    }
}
