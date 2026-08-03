package p069f;

import gg.AbstractC1415k;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import p080fb.AbstractC1184v0;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: f.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0963u0 implements Collection, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3033g = 1;

    /* JADX INFO: renamed from: h */
    public final Object f3034h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0963u0() {
        int i9 = AbstractC0955q0.f3007a;
        this.f3034h = new C0935g0(6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3033g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C0935g0) this.f3034h).m2302a(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3033g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final void clear() {
        switch (this.f3033g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((C0935g0) this.f3034h).m2303b();
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3033g) {
            case 0:
                return ((C0943k0) this.f3034h).m2317d(obj);
            default:
                return ((C0935g0) this.f3034h).m2304c(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f3033g) {
            case 0:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!((C0943k0) this.f3034h).m2317d(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((C0935g0) this.f3034h).m2304c(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f3033g) {
            case 0:
                return ((C0943k0) this.f3034h).m2322i();
            default:
                return ((C0935g0) this.f3034h).f2943g == 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3033g) {
            case 0:
                return AbstractC1184v0.m3175B(new C0934g(this, null, 2));
            default:
                C0935g0 c0935g0 = (C0935g0) this.f3034h;
                c0935g0.getClass();
                return new C0939i0(new C0941j0(c0935g0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f3033g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C0935g0) this.f3034h).m2308g(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f3033g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C0935g0) this.f3034h).m2308g(collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f3033g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f3033g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((C0935g0) this.f3034h).m2310i(collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final int size() {
        switch (this.f3033g) {
            case 0:
                return ((C0943k0) this.f3034h).f2972e;
            default:
                return ((C0935g0) this.f3034h).f2943g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f3033g) {
            case 0:
                objArr.getClass();
                break;
        }
        return AbstractC1415k.m3824b(this, objArr);
    }

    public C0963u0(C0943k0 c0943k0) {
        c0943k0.getClass();
        this.f3034h = c0943k0;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f3033g) {
        }
        return AbstractC1415k.m3823a(this);
    }
}
