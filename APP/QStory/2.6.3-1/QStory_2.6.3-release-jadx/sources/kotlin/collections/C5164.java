package kotlin.collections;

import androidx.core.view.C3101;
import bsh.C3466;
import java.util.ListIterator;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5164 extends C3101 implements ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5162 f13261;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5164(AbstractC5162 abstractC5162, int i) {
        super(abstractC5162, 5);
        this.f13261 = abstractC5162;
        C5165 c5165 = AbstractC5162.Companion;
        int size = abstractC5162.size();
        c5165.getClass();
        C5165.m9322(i, size);
        this.f6930 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6930 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6930;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C3466.m5896();
            return null;
        }
        int i = this.f6930 - 1;
        this.f6930 = i;
        return this.f13261.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6930 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
