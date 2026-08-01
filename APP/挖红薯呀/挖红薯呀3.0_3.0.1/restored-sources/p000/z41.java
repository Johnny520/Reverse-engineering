package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class z41 implements Collection, p40 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7798d = 0;

    /* JADX INFO: renamed from: e */
    public final Object f7799e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z41() {
        int i = tm0.f6015a;
        this.f7799e = new eh0(6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f7798d) {
            case 0:
                return ((eh0) this.f7799e).m929a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f7798d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final void clear() {
        switch (this.f7798d) {
            case 0:
                ((eh0) this.f7799e).m930b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f7798d) {
            case 0:
                return ((eh0) this.f7799e).m931c(obj);
            default:
                return ((jh0) this.f7799e).m1698d(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f7798d;
        Object obj = this.f7799e;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((eh0) obj).m931c(it.next())) {
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
                        if (!((jh0) obj).m1698d(it2.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f7798d) {
            case 0:
                return ((eh0) this.f7799e).f1454g == 0;
            default:
                return ((jh0) this.f7799e).m1703i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7798d) {
            case 0:
                eh0 eh0Var = (eh0) this.f7799e;
                eh0Var.getClass();
                return new C0410kx(new gh0(eh0Var));
            default:
                return v50.m4408n(new C0900ws(this, null, 3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f7798d) {
            case 0:
                return ((eh0) this.f7799e).m935g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f7798d) {
            case 0:
                return ((eh0) this.f7799e).m935g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f7798d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f7798d) {
            case 0:
                return ((eh0) this.f7799e).m937i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final int size() {
        switch (this.f7798d) {
            case 0:
                return ((eh0) this.f7799e).f1454g;
            default:
                return ((jh0) this.f7799e).f2882e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f7798d) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return s91.m4032S(this, objArr);
    }

    public z41(jh0 jh0Var) {
        jh0Var.getClass();
        this.f7799e = jh0Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f7798d) {
        }
        return s91.m4031R(this);
    }
}
