package p001;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ۟.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0162c<E> implements Collection<E>, InterfaceC0321n4 {

    /* JADX INFO: renamed from: ۟.c$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0222g3<E, CharSequence> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ AbstractC0162c<E> f715;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ۟.c<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC0162c<? extends E> abstractC0162c) {
            this.f715 = abstractC0162c;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final CharSequence mo984(Object obj) {
            return obj == this.f715 ? "(this Collection)" : String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C0237h4.m864(it.next(), e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ۟.c<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C0237h4.m1090("elements", collection);
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return mo828() == 0;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo828();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C0272jb.m1110(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C0237h4.m1090("array", tArr);
        return (T[]) C0272jb.m1111(this, tArr);
    }

    public final String toString() {
        return C0331o0.m1177(this, ", ", "[", "]", new a(this), 24);
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract int mo828();
}
