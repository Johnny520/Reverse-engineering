package p025bc;

import ac.AbstractC0213a;
import java.util.Iterator;
import java.util.Map;
import p052dc.C1947e;

/* JADX INFO: renamed from: bc.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1094e extends AbstractC0213a {

    /* JADX INFO: renamed from: q */
    public final C1093d f3316q;

    public C1094e(C1093d c1093d) {
        c1093d.getClass();
        this.f3316q = c1093d;
    }

    @Override // p185m8.AbstractC5090l
    /* JADX INFO: renamed from: a */
    public int mo500a() {
        return this.f3316q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f3316q.clear();
    }

    @Override // ac.AbstractC0213a
    /* JADX INFO: renamed from: e */
    public boolean mo450e(Map.Entry entry) {
        entry.getClass();
        return C1947e.f5423a.m7056a(this.f3316q, entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C1095f(this.f3316q);
    }

    @Override // ac.AbstractC0213a
    /* JADX INFO: renamed from: o */
    public boolean mo452o(Map.Entry entry) {
        entry.getClass();
        return this.f3316q.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        entry.getClass();
        throw new UnsupportedOperationException();
    }
}
