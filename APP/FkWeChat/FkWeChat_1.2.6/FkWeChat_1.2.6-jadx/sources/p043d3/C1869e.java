package p043d3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: d3.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1869e implements Collection, InterfaceC1400a {

    /* JADX INFO: renamed from: s */
    public static final a f5201s = new a(null);

    /* JADX INFO: renamed from: t */
    public static final C1869e f5202t = new C1869e(AbstractC5114x.m20800o());

    /* JADX INFO: renamed from: q */
    public final List f5203q;

    /* JADX INFO: renamed from: r */
    public final int f5204r;

    public C1869e(List list) {
        this.f5203q = list;
        this.f5204r = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: c */
    public boolean m6629c(C1868d c1868d) {
        return this.f5203q.contains(c1868d);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1868d) {
            return m6629c((C1868d) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f5203q.containsAll(collection);
    }

    /* JADX INFO: renamed from: e */
    public final C1868d m6630e(int i10) {
        return (C1868d) this.f5203q.get(i10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1869e) && AbstractC1061t.m3842c(this.f5203q, ((C1869e) obj).f5203q);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f5203q.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f5203q.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f5203q.iterator();
    }

    /* JADX INFO: renamed from: l */
    public final List m6631l() {
        return this.f5203q;
    }

    /* JADX INFO: renamed from: o */
    public int m6632o() {
        return this.f5204r;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m6632o();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f5203q + ')';
    }

    /* JADX INFO: renamed from: d3.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1869e m6633a() {
            return AbstractC1871g.m6635a().mo6621a();
        }

        /* JADX INFO: renamed from: b */
        public final C1869e m6634b() {
            return C1869e.f5202t;
        }

        public a() {
        }
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC1041j.m3804b(this, objArr);
    }
}
