package p139;

import java.util.Iterator;
import kotlin.collections.AbstractC5181;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8234 extends AbstractC5181 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8228 f20420;

    public C8234(C8228 c8228) {
        this.f20420 = c8228;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20420.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20420.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        AbstractC8237[] abstractC8237Arr = new AbstractC8237[8];
        for (int i = 0; i < 8; i++) {
            abstractC8237Arr[i] = new C8233(2);
        }
        return new C8235(this.f20420, abstractC8237Arr);
    }

    @Override // kotlin.collections.AbstractC5181
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo9317() {
        return this.f20420.f20406;
    }
}
