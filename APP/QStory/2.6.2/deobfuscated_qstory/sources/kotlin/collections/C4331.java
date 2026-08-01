package kotlin.collections;

import androidx.core.view.C2268;
import bsh.C2632;
import java.util.ListIterator;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4331 extends C2268 implements ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4329 f12912;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4331(AbstractC4329 abstractC4329, int i) {
        super(abstractC4329, 5);
        this.f12912 = abstractC4329;
        C4332 c4332 = AbstractC4329.Companion;
        int size = abstractC4329.size();
        c4332.getClass();
        C4332.m8773(i, size);
        this.f6584 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6584 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6584;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C2632.m5291();
            return null;
        }
        int i = this.f6584 - 1;
        this.f6584 = i;
        return this.f12912.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6584 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
