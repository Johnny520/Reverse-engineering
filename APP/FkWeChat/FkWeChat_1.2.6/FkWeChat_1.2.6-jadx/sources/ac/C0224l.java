package ac;

import java.util.Collection;
import java.util.Iterator;
import p036c9.InterfaceC1401b;
import p185m8.AbstractC5084i;

/* JADX INFO: renamed from: ac.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0224l extends AbstractC5084i implements Collection, InterfaceC1401b {

    /* JADX INFO: renamed from: q */
    public final C0218f f576q;

    public C0224l(C0218f c0218f) {
        c0218f.getClass();
        this.f576q = c0218f;
    }

    @Override // p185m8.AbstractC5084i
    /* JADX INFO: renamed from: a */
    public int mo504a() {
        return this.f576q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f576q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f576q.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0225m(this.f576q);
    }
}
