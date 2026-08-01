package androidx.compose.p001ui.node;

import androidx.collection.C1091;
import androidx.collection.C1102;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.runtime.snapshots.C2111;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7396;
import p160.C8376;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2615 implements List, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1091 f5566 = new C1091(16);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1102 f5564 = new C1102(16);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f5565 = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f5565 = -1;
        this.f5566.m1339();
        this.f5564.f1275 = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof AbstractC2961) && indexOf((AbstractC2961) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC2961) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objM1441 = this.f5566.m1441(i);
        objM1441.getClass();
        return (AbstractC2961) objM1441;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC2961)) {
            return -1;
        }
        AbstractC2961 abstractC2961 = (AbstractC2961) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!AbstractC5227.m9466(this.f5566.m1441(i), abstractC2961)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5566.m1439();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2111(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC2961)) {
            return -1;
        }
        AbstractC2961 abstractC2961 = (AbstractC2961) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (AbstractC5227.m9466(this.f5566.m1441(size), abstractC2961)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2111(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5566.f1349;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new C2614(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC5214.m9434(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3891(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.f5566.m1331(i, i2);
        C1102 c1102 = this.f5564;
        if (i >= 0) {
            int i3 = c1102.f1275;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    C6755.m11869("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = c1102.f1276;
                            AbstractC5179.m9401(jArr, jArr, i, i2, i3);
                        }
                        c1102.f1275 -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            c1102.getClass();
        }
        C8376.m13331("Index must be between 0 and size");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        p160.C8376.m13331("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m3892() {
        long jM3903 = AbstractC2620.m3903(Float.POSITIVE_INFINITY, false, false);
        int i = this.f5565 + 1;
        int i2 = this.f5566.f1349 - 1;
        if (i > i2) {
            return jM3903;
        }
        while (true) {
            C1102 c1102 = this.f5564;
            if (i < 0) {
                c1102.getClass();
                break;
            }
            if (i >= c1102.f1275) {
                break;
            }
            long j = c1102.f1276[i];
            if (AbstractC2620.m3917(j, jM3903) < 0) {
                jM3903 = j;
            }
            if ((AbstractC2620.m3919(jM3903) < 0.0f && AbstractC2620.m3912(jM3903)) || i == i2) {
                break;
            }
            i++;
        }
        return jM3903;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC5214.m9433(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C2111(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
