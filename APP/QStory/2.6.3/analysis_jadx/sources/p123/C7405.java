package p123;

import java.util.Iterator;
import kotlin.collections.AbstractC4349;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7405 extends AbstractC4349 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7399 f20075;

    public C7405(C7399 c7399) {
        this.f20075 = c7399;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20075.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20075.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        AbstractC7408[] abstractC7408Arr = new AbstractC7408[8];
        for (int i = 0; i < 8; i++) {
            abstractC7408Arr[i] = new C7404(2);
        }
        return new C7406(this.f20075, abstractC7408Arr);
    }

    @Override // kotlin.collections.AbstractC4349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo8758() {
        return this.f20075.f20061;
    }
}
