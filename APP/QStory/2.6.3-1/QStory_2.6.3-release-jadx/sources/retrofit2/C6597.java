package retrofit2;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6597 extends AbstractC6615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6615 f16171;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f16172;

    public /* synthetic */ C6597(AbstractC6615 abstractC6615, int i) {
        this.f16172 = i;
        this.f16171 = abstractC6615;
    }

    @Override // retrofit2.AbstractC6615
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11710(C6589 c6589, Object obj) {
        int i = this.f16172;
        AbstractC6615 abstractC6615 = this.f16171;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        abstractC6615.mo11710(c6589, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        abstractC6615.mo11710(c6589, Array.get(obj, i2));
                    }
                    break;
                }
                break;
        }
    }
}
