package p198n8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: n8.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5512e extends AbstractC5508a {

    /* JADX INFO: renamed from: q */
    public final C5511d f17235q;

    public C5512e(C5511d c5511d) {
        c5511d.getClass();
        this.f17235q = c5511d;
    }

    @Override // p185m8.AbstractC5090l
    /* JADX INFO: renamed from: a */
    public int mo500a() {
        return this.f17235q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f17235q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f17235q.m22464t(collection);
    }

    @Override // p198n8.AbstractC5508a
    /* JADX INFO: renamed from: e */
    public boolean mo22377e(Map.Entry entry) {
        entry.getClass();
        return this.f17235q.m22465u(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f17235q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f17235q.m22467y();
    }

    @Override // p198n8.AbstractC5508a
    /* JADX INFO: renamed from: l */
    public boolean mo22378l(Map.Entry entry) {
        entry.getClass();
        return this.f17235q.m22452P(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        entry.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        collection.getClass();
        this.f17235q.m22462r();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        this.f17235q.m22462r();
        return super.retainAll(collection);
    }
}
