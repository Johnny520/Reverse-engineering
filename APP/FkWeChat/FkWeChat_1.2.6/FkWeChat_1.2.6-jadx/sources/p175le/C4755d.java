package p175le;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p024b9.AbstractC1041j;
import p036c9.InterfaceC1403d;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: le.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C4755d implements List, InterfaceC1403d {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ ArrayList f14084q = new ArrayList();

    /* JADX INFO: renamed from: a */
    public int m19021a() {
        return this.f14084q.size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.f14084q.add(obj);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        collection.getClass();
        return this.f14084q.addAll(i10, collection);
    }

    /* JADX INFO: renamed from: c */
    public Object m19022c(int i10) {
        return this.f14084q.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f14084q.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f14084q.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f14084q.containsAll(collection);
    }

    @Override // java.util.List
    public Object get(int i10) {
        return this.f14084q.get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f14084q.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f14084q.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        Iterator it = this.f14084q.iterator();
        it.getClass();
        return it;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f14084q.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        ListIterator listIterator = this.f14084q.listIterator();
        listIterator.getClass();
        return listIterator;
    }

    public final Object peek() {
        return AbstractC5081g0.m20587u0(this);
    }

    public final Object pop() {
        Object objM20587u0 = AbstractC5081g0.m20587u0(this);
        remove(size() - 1);
        return objM20587u0;
    }

    public final void push(Object obj) {
        add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f14084q.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        return this.f14084q.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f14084q.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        return this.f14084q.set(i10, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m19021a();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        List listSubList = this.f14084q.subList(i10, i11);
        listSubList.getClass();
        return listSubList;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        this.f14084q.add(i10, obj);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i10) {
        return m19022c(i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        collection.getClass();
        return this.f14084q.addAll(collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        ListIterator listIterator = this.f14084q.listIterator(i10);
        listIterator.getClass();
        return listIterator;
    }
}
