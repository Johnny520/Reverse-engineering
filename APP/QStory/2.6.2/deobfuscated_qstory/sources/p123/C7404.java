package p123;

import java.util.Iterator;
import kotlin.collections.AbstractC4348;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7404 extends AbstractC4348 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7398 f20080;

    public C7404(C7398 c7398) {
        this.f20080 = c7398;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20080.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20080.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        AbstractC7407[] abstractC7407Arr = new AbstractC7407[8];
        for (int i = 0; i < 8; i++) {
            abstractC7407Arr[i] = new C7403(2);
        }
        return new C7405(this.f20080, abstractC7407Arr);
    }

    @Override // kotlin.collections.AbstractC4348
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo8768() {
        return this.f20080.f20066;
    }
}
