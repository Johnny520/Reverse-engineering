package p016b1;

import java.util.Collection;
import java.util.Iterator;
import p036c9.InterfaceC1401b;
import p185m8.AbstractC5084i;

/* JADX INFO: renamed from: b1.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0916l extends AbstractC5084i implements Collection, InterfaceC1401b {

    /* JADX INFO: renamed from: q */
    public final C0910f f2877q;

    public C0916l(C0910f c0910f) {
        this.f2877q = c0910f;
    }

    @Override // p185m8.AbstractC5084i
    /* JADX INFO: renamed from: a */
    public int mo504a() {
        return this.f2877q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f2877q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f2877q.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0917m(this.f2877q);
    }
}
