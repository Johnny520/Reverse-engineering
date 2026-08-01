package p120;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.C5745;
import kotlin.sequences.C5958;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8122 extends AbstractC8112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f19762;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5745 f19763;

    public C8122(int i, C5745 c5745) {
        this.f19763 = c5745;
        this.f19762 = i;
    }

    @Override // p120.AbstractC8112
    public final Object get(int i) {
        if (i == this.f19762) {
            return this.f19763;
        }
        return null;
    }

    @Override // p120.AbstractC8112, java.lang.Iterable
    public final Iterator iterator() {
        return new C5958(this, 2);
    }

    @Override // p120.AbstractC8112
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo13058(int i, C5745 c5745) {
        throw new IllegalStateException();
    }

    @Override // p120.AbstractC8112
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo13059() {
        return 1;
    }
}
