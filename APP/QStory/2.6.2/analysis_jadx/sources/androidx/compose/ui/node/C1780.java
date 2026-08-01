package androidx.compose.ui.node;

import androidx.collection.C0244;
import androidx.collection.C0255;
import androidx.compose.runtime.snapshots.C1276;
import androidx.compose.ui.AbstractC2128;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4381;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6566;
import p144.C7546;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1780 implements List, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0244 f5220 = new C0244(16);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0255 f5218 = new C0255(16);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f5219 = -1;

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
        this.f5219 = -1;
        this.f5220.m778();
        this.f5218.f930 = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof AbstractC2128) && indexOf((AbstractC2128) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC2128) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objM880 = this.f5220.m880(i);
        objM880.getClass();
        return (AbstractC2128) objM880;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC2128)) {
            return -1;
        }
        AbstractC2128 abstractC2128 = (AbstractC2128) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!AbstractC4394.m8917(this.f5220.m880(i), abstractC2128)) {
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
        return this.f5220.m878();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1276(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC2128)) {
            return -1;
        }
        AbstractC2128 abstractC2128 = (AbstractC2128) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (AbstractC4394.m8917(this.f5220.m880(size), abstractC2128)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C1276(this, 0, 7);
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
        return this.f5220.f1004;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new C1779(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4381.m8885(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3321(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.f5220.m770(i, i2);
        C0255 c0255 = this.f5218;
        if (i >= 0) {
            int i3 = c0255.f930;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    C5919.m11249("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = c0255.f931;
                            AbstractC4346.m8835(jArr, jArr, i, i2, i3);
                        }
                        c0255.f930 -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            c0255.getClass();
        }
        C7546.m12743("Index must be between 0 and size");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        p144.C7546.m12743("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m3322() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = androidx.compose.ui.node.AbstractC1785.m3333(r0, r1, r1)
            int r2 = r7.f5219
            int r2 = r2 + 1
            androidx.collection.飘花落叶言子世哲苏楪兰 r3 = r7.f5220
            int r3 = r3.f1004
            int r3 = r3 + (-1)
            if (r2 > r3) goto L46
        L13:
            androidx.collection.飘花落叶言子世苏楪兰哲 r4 = r7.f5218
            if (r2 < 0) goto L3c
            int r5 = r4.f930
            if (r2 >= r5) goto L3f
            long[] r4 = r4.f931
            r5 = r4[r2]
            int r4 = androidx.compose.ui.node.AbstractC1785.m3347(r5, r0)
            if (r4 >= 0) goto L26
            r0 = r5
        L26:
            float r4 = androidx.compose.ui.node.AbstractC1785.m3349(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L36
            boolean r4 = androidx.compose.ui.node.AbstractC1785.m3342(r0)
            if (r4 == 0) goto L36
            goto L3b
        L36:
            if (r2 == r3) goto L3b
            int r2 = r2 + 1
            goto L13
        L3b:
            return r0
        L3c:
            r4.getClass()
        L3f:
            java.lang.String r7 = "Index must be between 0 and size"
            p144.C7546.m12743(r7)
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C1780.m3322():long");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4381.m8884(this, objArr);
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
        return new C1276(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
