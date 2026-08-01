package p104;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7396;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010(with = C7984.class)
public final class C7986 extends AbstractC8005 implements List<AbstractC8005>, InterfaceC7396 {
    public static final C7987 Companion = new C7987();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f19469;

    public C7986(List list) {
        list.getClass();
        this.f19469 = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, AbstractC8005 abstractC8005) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC8005> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC8005)) {
            return false;
        }
        return this.f19469.contains((AbstractC8005) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f19469.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC5227.m9466(this.f19469, obj);
    }

    @Override // java.util.List
    public final AbstractC8005 get(int i) {
        return (AbstractC8005) this.f19469.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f19469.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC8005)) {
            return -1;
        }
        return this.f19469.indexOf((AbstractC8005) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f19469.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f19469.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC8005)) {
            return -1;
        }
        return this.f19469.lastIndexOf((AbstractC8005) obj);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC8005> listIterator() {
        return this.f19469.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC8005 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC8005> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC8005 set(int i, AbstractC8005 abstractC8005) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f19469.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC8005> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<AbstractC8005> subList(int i, int i2) {
        return this.f19469.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC5214.m9433(this, objArr);
    }

    public final String toString() {
        return AbstractC5176.m9369(this.f19469, ",", "[", "]", null, 56);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC8005> listIterator(int i) {
        return this.f19469.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC5214.m9434(this);
    }
}
