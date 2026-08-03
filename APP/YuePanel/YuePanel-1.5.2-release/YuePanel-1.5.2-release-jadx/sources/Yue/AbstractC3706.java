package Yue;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3706<E> extends ArrayList<E> {
    public AbstractC3706(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        mo10156();
        return super.add(e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        mo10156();
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo10156();
        super.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public E remove(int i) {
        mo10156();
        return (E) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        mo10156();
        return super.removeAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i, int i2) {
        mo10156();
        super.removeRange(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        mo10156();
        return super.retainAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        mo10156();
        return (E) super.set(i, e);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract void mo10156();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        mo10156();
        super.add(i, e);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        mo10156();
        return super.addAll(i, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        mo10156();
        return super.remove(obj);
    }
}
