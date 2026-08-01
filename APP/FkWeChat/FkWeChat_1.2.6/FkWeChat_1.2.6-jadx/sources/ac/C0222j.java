package ac;

import java.util.Iterator;
import java.util.Set;
import p036c9.InterfaceC1405f;
import p185m8.AbstractC5090l;

/* JADX INFO: renamed from: ac.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0222j extends AbstractC5090l implements Set, InterfaceC1405f {

    /* JADX INFO: renamed from: q */
    public final C0218f f575q;

    public C0222j(C0218f c0218f) {
        c0218f.getClass();
        this.f575q = c0218f;
    }

    @Override // p185m8.AbstractC5090l
    /* JADX INFO: renamed from: a */
    public int mo500a() {
        return this.f575q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f575q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f575q.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C0223k(this.f575q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f575q.containsKey(obj)) {
            return false;
        }
        this.f575q.remove(obj);
        return true;
    }
}
