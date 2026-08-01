package ac;

import java.util.Iterator;
import java.util.Map;
import p052dc.C1947e;

/* JADX INFO: renamed from: ac.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0220h extends AbstractC0213a {

    /* JADX INFO: renamed from: q */
    public final C0218f f573q;

    public C0220h(C0218f c0218f) {
        c0218f.getClass();
        this.f573q = c0218f;
    }

    @Override // p185m8.AbstractC5090l
    /* JADX INFO: renamed from: a */
    public int mo500a() {
        return this.f573q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f573q.clear();
    }

    @Override // ac.AbstractC0213a
    /* JADX INFO: renamed from: e */
    public boolean mo450e(Map.Entry entry) {
        entry.getClass();
        return C1947e.f5423a.m7056a(this.f573q, entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C0221i(this.f573q);
    }

    @Override // ac.AbstractC0213a
    /* JADX INFO: renamed from: o */
    public boolean mo452o(Map.Entry entry) {
        entry.getClass();
        return this.f573q.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        entry.getClass();
        throw new UnsupportedOperationException();
    }
}
