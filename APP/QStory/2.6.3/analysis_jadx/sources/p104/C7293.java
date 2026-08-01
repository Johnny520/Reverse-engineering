package p104;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.C4913;
import kotlin.sequences.C5126;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7293 extends AbstractC7283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f19417;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4913 f19418;

    public C7293(int i, C4913 c4913) {
        this.f19418 = c4913;
        this.f19417 = i;
    }

    @Override // p104.AbstractC7283
    public final Object get(int i) {
        if (i == this.f19417) {
            return this.f19418;
        }
        return null;
    }

    @Override // p104.AbstractC7283, java.lang.Iterable
    public final Iterator iterator() {
        return new C5126(this, 2);
    }

    @Override // p104.AbstractC7283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12499(int i, C4913 c4913) {
        throw new IllegalStateException();
    }

    @Override // p104.AbstractC7283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo12500() {
        return 1;
    }
}
