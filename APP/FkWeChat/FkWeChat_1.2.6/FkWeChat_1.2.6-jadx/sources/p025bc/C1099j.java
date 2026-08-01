package p025bc;

import java.util.Collection;
import java.util.Iterator;
import p036c9.InterfaceC1401b;
import p185m8.AbstractC5084i;

/* JADX INFO: renamed from: bc.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1099j extends AbstractC5084i implements Collection, InterfaceC1401b {

    /* JADX INFO: renamed from: q */
    public final C1093d f3326q;

    public C1099j(C1093d c1093d) {
        c1093d.getClass();
        this.f3326q = c1093d;
    }

    @Override // p185m8.AbstractC5084i
    /* JADX INFO: renamed from: a */
    public int mo504a() {
        return this.f3326q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f3326q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f3326q.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C1100k(this.f3326q);
    }
}
