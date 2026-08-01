package p117i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: i.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3038a1 implements Set, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final AbstractC3096y0 f8068q;

    public AbstractC3038a1(AbstractC3096y0 abstractC3096y0) {
        abstractC3096y0.getClass();
        this.f8068q = abstractC3096y0;
    }

    /* JADX INFO: renamed from: a */
    public int m11231a() {
        return this.f8068q.f8251g;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f8068q.m11612a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f8068q.m11612a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AbstractC1061t.m3842c(this.f8068q, ((AbstractC3038a1) obj).f8068q);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f8068q.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f8068q.m11615d();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m11231a();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }

    public String toString() {
        return this.f8068q.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }
}
