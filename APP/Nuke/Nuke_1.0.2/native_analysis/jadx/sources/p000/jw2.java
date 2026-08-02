package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jw2 implements Collection, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5248h = 0;

    /* JADX INFO: renamed from: i */
    public final Object f5249i;

    public jw2() {
        int i = pv1.f8619a;
        this.f5249i = new mk1(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5248h) {
            case 0:
                return ((mk1) this.f5249i).m3124a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5248h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f5248h) {
            case 0:
                ((mk1) this.f5249i).m3125b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5248h) {
            case 0:
                return ((mk1) this.f5249i).m3126c(obj);
            default:
                return ((rk1) this.f5249i).m4502d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f5248h;
        Object obj = this.f5249i;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((mk1) obj).m3126c(it.next())) {
                        break;
                    }
                }
                break;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((rk1) obj).m4502d(it2.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f5248h) {
            case 0:
                return ((mk1) this.f5249i).f6708g == 0;
            default:
                return ((rk1) this.f5249i).m4507i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5248h) {
            case 0:
                mk1 mk1Var = (mk1) this.f5249i;
                mk1Var.getClass();
                return new ro0(new ok1(mk1Var));
            default:
                return tp0.m5340B(new tf0(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f5248h) {
            case 0:
                return ((mk1) this.f5249i).m3130g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f5248h) {
            case 0:
                return ((mk1) this.f5249i).m3130g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f5248h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f5248h) {
            case 0:
                return ((mk1) this.f5249i).m3132i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f5248h) {
            case 0:
                return ((mk1) this.f5249i).f6708g;
            default:
                return ((rk1) this.f5249i).f9622e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5248h) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return AbstractC0738tl.m5301b0(this, objArr);
    }

    public jw2(rk1 rk1Var) {
        rk1Var.getClass();
        this.f5249i = rk1Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f5248h) {
        }
        return AbstractC0738tl.m5299a0(this);
    }
}
