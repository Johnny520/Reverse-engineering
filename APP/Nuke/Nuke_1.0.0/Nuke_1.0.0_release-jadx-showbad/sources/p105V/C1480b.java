package p105V;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1664i;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1767b;
import p179i4.AbstractC2352g;
import p186k.AbstractC2413J;
import p186k.C2404A;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: V.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1480b implements List, InterfaceC1767b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5172d;

    /* JADX INFO: renamed from: e */
    public final Object f5173e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1480b(int i5, Object obj) {
        this.f5172d = i5;
        this.f5173e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5172d) {
            case 0:
                ((C1483e) this.f5173e).m2753b(obj);
                break;
            default:
                ((C2404A) this.f5173e).m4243a(obj);
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        switch (this.f5172d) {
            case 0:
                return ((C1483e) this.f5173e).m2756e(i5, collection);
            default:
                AbstractC1665j.m2985e(collection, "elements");
                C2404A c2404a = (C2404A) this.f5173e;
                if (i5 < 0 || i5 > c2404a.f7767b) {
                    StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Index ", " must be in 0..");
                    sbM404o.append(c2404a.f7767b);
                    AbstractC2477a.m4423d(sbM404o.toString());
                    throw null;
                }
                int i6 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + c2404a.f7767b;
                Object[] objArr = c2404a.f7766a;
                if (objArr.length < size) {
                    c2404a.m4255m(size, objArr);
                }
                Object[] objArr2 = c2404a.f7766a;
                if (i5 != c2404a.f7767b) {
                    AbstractC0972l.m1993Q(objArr2, objArr2, collection.size() + i5, i5, c2404a.f7767b);
                }
                for (Object obj : collection) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        AbstractC2352g.m4187J();
                        throw null;
                    }
                    objArr2[i6 + i5] = obj;
                    i6 = i7;
                }
                c2404a.f7767b = collection.size() + c2404a.f7767b;
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f5172d) {
            case 0:
                ((C1483e) this.f5173e).m2758g();
                break;
            default:
                ((C2404A) this.f5173e).m4246d();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5172d) {
            case 0:
                return ((C1483e) this.f5173e).m2759h(obj);
            default:
                return ((C2404A) this.f5173e).m4249g(obj) >= 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f5172d) {
            case 0:
                C1483e c1483e = (C1483e) this.f5173e;
                c1483e.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!c1483e.m2759h(it.next())) {
                        break;
                    }
                }
                break;
            default:
                AbstractC1665j.m2985e(collection, "elements");
                C2404A c2404a = (C2404A) this.f5173e;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (c2404a.m4249g(it2.next()) < 0) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i5) {
        switch (this.f5172d) {
            case 0:
                AbstractC1484f.m2765a(i5, this);
                return ((C1483e) this.f5173e).f5181d[i5];
            default:
                AbstractC2413J.m4293a(i5, this);
                return ((C2404A) this.f5173e).m4248f(i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f5172d) {
            case 0:
                return ((C1483e) this.f5173e).m2760i(obj);
            default:
                return ((C2404A) this.f5173e).m4249g(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f5172d) {
            case 0:
                return ((C1483e) this.f5173e).f5183f == 0;
            default:
                return ((C2404A) this.f5173e).m4250h();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5172d) {
            case 0:
                return new C1482d(this, 0, 0);
            default:
                return new C1482d(this, 0, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i5;
        switch (this.f5172d) {
            case 0:
                C1483e c1483e = (C1483e) this.f5173e;
                Object[] objArr = c1483e.f5181d;
                for (int i6 = c1483e.f5183f - 1; i6 >= 0; i6--) {
                    if (AbstractC1665j.m2981a(obj, objArr[i6])) {
                        return i6;
                    }
                }
                return -1;
            default:
                C2404A c2404a = (C2404A) this.f5173e;
                if (obj == null) {
                    Object[] objArr2 = c2404a.f7766a;
                    i5 = c2404a.f7767b - 1;
                    while (-1 < i5) {
                        if (objArr2[i5] != null) {
                            i5--;
                        }
                    }
                    return -1;
                }
                Object[] objArr3 = c2404a.f7766a;
                i5 = c2404a.f7767b - 1;
                while (-1 < i5) {
                    if (!obj.equals(objArr3[i5])) {
                        i5--;
                    }
                }
                return -1;
                return i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f5172d) {
            case 0:
                return new C1482d(this, 0, 0);
            default:
                return new C1482d(this, 0, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f5172d) {
            case 0:
                return ((C1483e) this.f5173e).m2761j(obj);
            default:
                return ((C2404A) this.f5173e).m4252j(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f5172d) {
            case 0:
                C1483e c1483e = (C1483e) this.f5173e;
                c1483e.getClass();
                if (!collection.isEmpty()) {
                    int i5 = c1483e.f5183f;
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        c1483e.m2761j(it.next());
                    }
                    if (i5 != c1483e.f5183f) {
                    }
                }
                break;
            default:
                AbstractC1665j.m2985e(collection, "elements");
                C2404A c2404a = (C2404A) this.f5173e;
                c2404a.getClass();
                int i6 = c2404a.f7767b;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    c2404a.m4252j(it2.next());
                }
                if (i6 != c2404a.f7767b) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f5172d) {
            case 0:
                C1483e c1483e = (C1483e) this.f5173e;
                int i5 = c1483e.f5183f;
                for (int i6 = i5 - 1; -1 < i6; i6--) {
                    if (!collection.contains(c1483e.f5181d[i6])) {
                        c1483e.m2762k(i6);
                    }
                }
                if (i5 != c1483e.f5183f) {
                }
                break;
            default:
                AbstractC1665j.m2985e(collection, "elements");
                C2404A c2404a = (C2404A) this.f5173e;
                c2404a.getClass();
                int i7 = c2404a.f7767b;
                Object[] objArr = c2404a.f7766a;
                for (int i8 = i7 - 1; -1 < i8; i8--) {
                    if (!collection.contains(objArr[i8])) {
                        c2404a.m4253k(i8);
                    }
                }
                if (i7 != c2404a.f7767b) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        switch (this.f5172d) {
            case 0:
                AbstractC1484f.m2765a(i5, this);
                Object[] objArr = ((C1483e) this.f5173e).f5181d;
                Object obj2 = objArr[i5];
                objArr[i5] = obj;
                return obj2;
            default:
                AbstractC2413J.m4293a(i5, this);
                C2404A c2404a = (C2404A) this.f5173e;
                if (i5 < 0 || i5 >= c2404a.f7767b) {
                    c2404a.m4256n(i5);
                    throw null;
                }
                Object[] objArr2 = c2404a.f7766a;
                Object obj3 = objArr2[i5];
                objArr2[i5] = obj;
                return obj3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f5172d) {
            case 0:
                return ((C1483e) this.f5173e).f5183f;
            default:
                return ((C2404A) this.f5173e).f7767b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i5, int i6) {
        switch (this.f5172d) {
            case 0:
                AbstractC1484f.m2766b(this, i5, i6);
                return new C1481c(this, i5, i6, 0);
            default:
                AbstractC2413J.m4294b(this, i5, i6);
                return new C1481c(this, i5, i6, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f5172d) {
        }
        return AbstractC1664i.m2979a(this);
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        int i6;
        switch (this.f5172d) {
            case 0:
                ((C1483e) this.f5173e).m2752a(i5, obj);
                return;
            default:
                C2404A c2404a = (C2404A) this.f5173e;
                if (i5 >= 0 && i5 <= (i6 = c2404a.f7767b)) {
                    int i7 = i6 + 1;
                    Object[] objArr = c2404a.f7766a;
                    if (objArr.length < i7) {
                        c2404a.m4255m(i7, objArr);
                    }
                    Object[] objArr2 = c2404a.f7766a;
                    int i8 = c2404a.f7767b;
                    if (i5 != i8) {
                        AbstractC0972l.m1993Q(objArr2, objArr2, i5 + 1, i5, i8);
                    }
                    objArr2[i5] = obj;
                    c2404a.f7767b++;
                    return;
                }
                StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Index ", " must be in 0..");
                sbM404o.append(c2404a.f7767b);
                AbstractC2477a.m4423d(sbM404o.toString());
                throw null;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        switch (this.f5172d) {
            case 0:
                return new C1482d(this, i5, 0);
            default:
                return new C1482d(this, i5, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        switch (this.f5172d) {
            case 0:
                AbstractC1484f.m2765a(i5, this);
                return ((C1483e) this.f5173e).m2762k(i5);
            default:
                AbstractC2413J.m4293a(i5, this);
                return ((C2404A) this.f5173e).m4253k(i5);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5172d) {
            case 0:
                break;
            default:
                AbstractC1665j.m2985e(objArr, "array");
                break;
        }
        return AbstractC1664i.m2980b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5172d) {
            case 0:
                C1483e c1483e = (C1483e) this.f5173e;
                return c1483e.m2756e(c1483e.f5183f, collection);
            default:
                AbstractC1665j.m2985e(collection, "elements");
                C2404A c2404a = (C2404A) this.f5173e;
                int i5 = c2404a.f7767b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c2404a.m4243a(it.next());
                }
                return i5 != c2404a.f7767b;
        }
    }
}
