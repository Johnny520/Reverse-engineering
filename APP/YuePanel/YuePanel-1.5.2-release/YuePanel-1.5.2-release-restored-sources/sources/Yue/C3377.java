package Yue;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,481:1\n1726#2,3:482\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n61#1:482,3\n*E\n"})
public final class C3377<T> implements Collection<T>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final T[] f5414;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f5415;

    public C3377(@InterfaceC6399 T[] tArr, boolean z) {
        C5499.m17103(tArr, "values");
        this.f5414 = tArr;
        this.f5415 = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C3411.m7560(this.f5414, obj);
    }

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
        return this.f5414.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @InterfaceC6399
    public Iterator<T> iterator() {
        return C3390.m474(this.f5414);
    }

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
        return m463();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C5499.m17103(tArr, "array");
        return (T[]) C3876.m914(this, tArr);
    }

    /* JADX INFO: renamed from: ۥ */
    public int m463() {
        return this.f5414.length;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final T[] m464() {
        return this.f5414;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m6932() {
        return this.f5415;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Collection
    @InterfaceC6399
    public final Object[] toArray() {
        return C3879.m10712(this.f5414, this.f5415);
    }
}
