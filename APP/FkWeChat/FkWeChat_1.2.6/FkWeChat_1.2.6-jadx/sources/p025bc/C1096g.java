package p025bc;

import java.util.Iterator;
import java.util.Set;
import p036c9.InterfaceC1405f;
import p185m8.AbstractC5090l;

/* JADX INFO: renamed from: bc.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1096g extends AbstractC5090l implements Set, InterfaceC1405f {

    /* JADX INFO: renamed from: q */
    public final C1093d f3318q;

    public C1096g(C1093d c1093d) {
        c1093d.getClass();
        this.f3318q = c1093d;
    }

    @Override // p185m8.AbstractC5090l
    /* JADX INFO: renamed from: a */
    public int mo500a() {
        return this.f3318q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f3318q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f3318q.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C1097h(this.f3318q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f3318q.containsKey(obj)) {
            return false;
        }
        this.f3318q.remove(obj);
        return true;
    }
}
