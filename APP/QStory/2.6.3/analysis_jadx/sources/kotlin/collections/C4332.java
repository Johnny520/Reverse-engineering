package kotlin.collections;

import androidx.core.view.C2268;
import bsh.C2633;
import java.util.ListIterator;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4332 extends C2268 implements ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4330 f12916;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4332(AbstractC4330 abstractC4330, int i) {
        super(abstractC4330, 5);
        this.f12916 = abstractC4330;
        C4333 c4333 = AbstractC4330.Companion;
        int size = abstractC4330.size();
        c4333.getClass();
        C4333.m8763(i, size);
        this.f6585 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6585 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6585;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C2633.m5336();
            return null;
        }
        int i = this.f6585 - 1;
        this.f6585 = i;
        return this.f12916.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6585 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
