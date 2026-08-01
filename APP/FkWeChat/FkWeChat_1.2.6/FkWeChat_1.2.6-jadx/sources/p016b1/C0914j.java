package p016b1;

import java.util.Iterator;
import java.util.Set;
import p036c9.InterfaceC1405f;
import p185m8.AbstractC5090l;

/* JADX INFO: renamed from: b1.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0914j extends AbstractC5090l implements Set, InterfaceC1405f {

    /* JADX INFO: renamed from: q */
    public final C0910f f2876q;

    public C0914j(C0910f c0910f) {
        this.f2876q = c0910f;
    }

    @Override // p185m8.AbstractC5090l
    /* JADX INFO: renamed from: a */
    public int mo500a() {
        return this.f2876q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f2876q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f2876q.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C0915k(this.f2876q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f2876q.containsKey(obj)) {
            return false;
        }
        this.f2876q.remove(obj);
        return true;
    }
}
