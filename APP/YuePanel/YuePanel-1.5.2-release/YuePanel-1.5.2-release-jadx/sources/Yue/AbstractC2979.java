package Yue;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
@InterfaceC7507({"SMAP\nAbstractCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1747#2,3:43\n1726#2,3:46\n*S KotlinDebug\n*F\n+ 1 AbstractCollection.kt\nkotlin/collections/AbstractCollection\n*L\n19#1:43,3\n22#1:46,3\n*E\n"})
public abstract class AbstractC2979<E> implements Collection<E>, InterfaceC5591 {

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۦ$ۥ */
    public static final class C0011 extends AbstractC5673 implements InterfaceC5124<E, CharSequence> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ AbstractC2979<E> f4315;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟۟۠ۦ<? extends E> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0011(AbstractC2979<? extends E> abstractC2979) {
            super(1);
            this.f4315 = abstractC2979;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e) {
            return e == this.f4315 ? "(this Collection)" : String.valueOf(e);
        }
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C5499.m17094(it.next(), e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥ۟۟۠ۦ<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(@InterfaceC6399 Collection<? extends Object> collection) {
        C5499.m17103(collection, "elements");
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
        return size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @InterfaceC6399
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo41();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    @InterfaceC6399
    public Object[] toArray() {
        return C3876.m913(this);
    }

    @InterfaceC6399
    public String toString() {
        return C3888.m10923(this, ", ", "[", "]", 0, null, new C0011(this), 24, null);
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract int mo41();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Collection
    @InterfaceC6399
    public <T> T[] toArray(@InterfaceC6399 T[] tArr) {
        C5499.m17103(tArr, "array");
        return (T[]) C3876.m914(this, tArr);
    }
}
