package androidx.compose.runtime.snapshots;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC4343;
import kotlin.collections.C4327;
import kotlin.collections.C4328;
import kotlin.jvm.internal.Ref$IntRef;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1264 implements ListIterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f3675;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3676;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3677 = 2;

    public C1264(C4327 c4327, int i) {
        this.f3676 = c4327;
        this.f3675 = ((List) c4327.f12906).listIterator(AbstractC4343.m8793(i, c4327));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f3677) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ListIterator listIterator = (ListIterator) this.f3675;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f3677;
        Object obj = this.f3675;
        switch (i) {
            case 0:
                if (((Ref$IntRef) obj).element < ((C1263) this.f3676).f3671 - 1) {
                }
                break;
        }
        return ((ListIterator) obj).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.f3677;
        Object obj = this.f3675;
        switch (i) {
            case 0:
                if (((Ref$IntRef) obj).element >= 0) {
                }
                break;
        }
        return ((ListIterator) obj).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f3677;
        Object obj = this.f3675;
        switch (i) {
            case 0:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                int i2 = ref$IntRef.element + 1;
                C1263 c1263 = (C1263) this.f3676;
                AbstractC1274.m2225(i2, c1263.f3671);
                ref$IntRef.element = i2;
                break;
        }
        return ((ListIterator) obj).previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        int i = this.f3677;
        Object obj = this.f3676;
        Object obj2 = this.f3675;
        switch (i) {
            case 0:
                return ((Ref$IntRef) obj2).element + 1;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((C4328) obj).size();
                break;
            default:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((C4327) obj).size();
                break;
        }
        return (size - 1) - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f3677;
        Object obj = this.f3675;
        switch (i) {
            case 0:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                int i2 = ref$IntRef.element;
                C1263 c1263 = (C1263) this.f3676;
                AbstractC1274.m2225(i2, c1263.f3671);
                ref$IntRef.element = i2 - 1;
                break;
        }
        return ((ListIterator) obj).next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        int i = this.f3677;
        Object obj = this.f3676;
        Object obj2 = this.f3675;
        switch (i) {
            case 0:
                return ((Ref$IntRef) obj2).element;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((C4328) obj).size();
                break;
            default:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((C4327) obj).size();
                break;
        }
        return (size - 1) - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f3677) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f3675).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f3677) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f3675).set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1264(C4328 c4328, int i) {
        this.f3676 = c4328;
        this.f3675 = c4328.f12908.listIterator(AbstractC4343.m8793(i, c4328));
    }

    public C1264(Ref$IntRef ref$IntRef, C1263 c1263) {
        this.f3675 = ref$IntRef;
        this.f3676 = c1263;
    }
}
