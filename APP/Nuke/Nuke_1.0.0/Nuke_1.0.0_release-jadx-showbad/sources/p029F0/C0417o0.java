package p029F0;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import p105V.C1485g;
import p117X2.AbstractC1664i;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p124Z.C1779c;
import p128a.AbstractC1785a;
import p186k.AbstractC2414K;
import p186k.C2405B;
import p186k.C2407D;
import p186k.C2408E;

/* JADX INFO: renamed from: F0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0417o0 implements Collection, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1255d = 0;

    /* JADX INFO: renamed from: e */
    public final Object f1256e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0417o0() {
        int i5 = AbstractC2414K.f7815a;
        this.f1256e = new C2405B(6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f1255d) {
            case 0:
                return ((C2405B) this.f1256e).m4257a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f1255d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final void clear() {
        switch (this.f1255d) {
            case 0:
                ((C2405B) this.f1256e).m4258b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f1255d) {
            case 0:
                return ((C2405B) this.f1256e).m4259c(obj);
            default:
                return ((C2408E) this.f1256e).m4269d(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f1255d) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((C2405B) this.f1256e).m4259c(it.next())) {
                        break;
                    }
                }
                break;
            default:
                AbstractC1665j.m2985e(collection, "elements");
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((C2408E) this.f1256e).m4269d(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f1255d) {
            case 0:
                return ((C2405B) this.f1256e).f7775g == 0;
            default:
                return ((C2408E) this.f1256e).m4274i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1255d) {
            case 0:
                C2405B c2405b = (C2405B) this.f1256e;
                c2405b.getClass();
                return new C1779c(new C2407D(c2405b));
            default:
                return AbstractC1785a.m3252m(new C1485g(this, null, 3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f1255d) {
            case 0:
                return ((C2405B) this.f1256e).m4263g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f1255d) {
            case 0:
                return ((C2405B) this.f1256e).m4263g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f1255d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f1255d) {
            case 0:
                return ((C2405B) this.f1256e).m4265i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final int size() {
        switch (this.f1255d) {
            case 0:
                return ((C2405B) this.f1256e).f7775g;
            default:
                return ((C2408E) this.f1256e).f7791e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f1255d) {
        }
        return AbstractC1664i.m2979a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f1255d) {
            case 0:
                break;
            default:
                AbstractC1665j.m2985e(objArr, "array");
                break;
        }
        return AbstractC1664i.m2980b(this, objArr);
    }

    public C0417o0(C2408E c2408e) {
        AbstractC1665j.m2985e(c2408e, "parent");
        this.f1256e = c2408e;
    }
}
