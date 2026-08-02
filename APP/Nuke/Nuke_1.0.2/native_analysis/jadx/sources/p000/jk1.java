package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jk1 implements List, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5083h;

    /* JADX INFO: renamed from: i */
    public final Object f5084i;

    public /* synthetic */ jk1(int i, Object obj) {
        this.f5083h = i;
        this.f5084i = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f5083h;
        Object obj2 = this.f5084i;
        switch (i3) {
            case 0:
                lk1 lk1Var = (lk1) obj2;
                if (i < 0 || i > (i2 = lk1Var.f6164b)) {
                    lk1Var.m2940p(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = lk1Var.f6163a;
                if (objArr.length < i4) {
                    lk1Var.m2937m(i4, objArr);
                }
                Object[] objArr2 = lk1Var.f6163a;
                int i5 = lk1Var.f6164b;
                if (i != i5) {
                    AbstractC0460mg.m3088c0(objArr2, objArr2, i + 1, i, i5);
                }
                objArr2[i] = obj;
                lk1Var.f6164b++;
                return;
            default:
                ((zk1) obj2).m6422a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f5083h;
        Object obj = this.f5084i;
        switch (i2) {
            case 0:
                collection.getClass();
                lk1 lk1Var = (lk1) obj;
                if (i < 0 || i > lk1Var.f6164b) {
                    lk1Var.m2940p(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + lk1Var.f6164b;
                Object[] objArr = lk1Var.f6163a;
                if (objArr.length < size) {
                    lk1Var.m2937m(size, objArr);
                }
                Object[] objArr2 = lk1Var.f6163a;
                if (i != lk1Var.f6164b) {
                    AbstractC0460mg.m3088c0(objArr2, objArr2, collection.size() + i, i, lk1Var.f6164b);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC0179eu.m1447a0();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                lk1Var.f6164b = collection.size() + lk1Var.f6164b;
                return true;
            default:
                return ((zk1) obj).m6426e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f5083h;
        Object obj = this.f5084i;
        switch (i) {
            case 0:
                ((lk1) obj).m2928d();
                break;
            default:
                ((zk1) obj).m6428g();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f5083h;
        Object obj2 = this.f5084i;
        switch (i) {
            case 0:
                return ((lk1) obj2).m2931g(obj) >= 0;
            default:
                return ((zk1) obj2).m6429h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f5083h;
        Object obj = this.f5084i;
        switch (i) {
            case 0:
                collection.getClass();
                lk1 lk1Var = (lk1) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (lk1Var.m2931g(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                zk1 zk1Var = (zk1) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!zk1Var.m6429h(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f5083h;
        Object obj = this.f5084i;
        switch (i2) {
            case 0:
                js1.m2561a(i, this);
                return ((lk1) obj).m2930f(i);
            default:
                al1.m193a(i, this);
                return ((zk1) obj).f13934h[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f5083h;
        Object obj2 = this.f5084i;
        switch (i) {
            case 0:
                return ((lk1) obj2).m2931g(obj);
            default:
                return ((zk1) obj2).m6430i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f5083h;
        Object obj = this.f5084i;
        switch (i) {
            case 0:
                return ((lk1) obj).m2932h();
            default:
                return ((zk1) obj).f13936j == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5083h) {
            case 0:
                return new ik1(this, 0, 0);
            default:
                return new ik1(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.f5083h;
        Object obj2 = this.f5084i;
        switch (i2) {
            case 0:
                lk1 lk1Var = (lk1) obj2;
                Object[] objArr = lk1Var.f6163a;
                int i3 = lk1Var.f6164b;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                zk1 zk1Var = (zk1) obj2;
                Object[] objArr2 = zk1Var.f13934h;
                for (int i4 = zk1Var.f13936j - 1; i4 >= 0; i4--) {
                    if (t11.m5086l(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f5083h) {
            case 0:
                return new ik1(this, 0, 0);
            default:
                return new ik1(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f5083h;
        Object obj = this.f5084i;
        switch (i2) {
            case 0:
                js1.m2561a(i, this);
                return ((lk1) obj).m2935k(i);
            default:
                al1.m193a(i, this);
                return ((zk1) obj).m6432k(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f5083h;
        Object obj = this.f5084i;
        switch (i) {
            case 0:
                collection.getClass();
                lk1 lk1Var = (lk1) obj;
                int i2 = lk1Var.f6164b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    lk1Var.m2934j(it.next());
                }
                if (i2 == lk1Var.f6164b) {
                    break;
                }
                break;
            default:
                zk1 zk1Var = (zk1) obj;
                if (!collection.isEmpty()) {
                    int i3 = zk1Var.f13936j;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        zk1Var.m6431j(it2.next());
                    }
                    if (i3 != zk1Var.f13936j) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f5083h;
        Object obj = this.f5084i;
        switch (i) {
            case 0:
                collection.getClass();
                lk1 lk1Var = (lk1) obj;
                int i2 = lk1Var.f6164b;
                Object[] objArr = lk1Var.f6163a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        lk1Var.m2935k(i3);
                    }
                }
                if (i2 != lk1Var.f6164b) {
                }
                break;
            default:
                zk1 zk1Var = (zk1) obj;
                int i4 = zk1Var.f13936j;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(zk1Var.f13934h[i5])) {
                        zk1Var.m6432k(i5);
                    }
                }
                if (i4 != zk1Var.f13936j) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f5083h;
        Object obj2 = this.f5084i;
        switch (i2) {
            case 0:
                js1.m2561a(i, this);
                return ((lk1) obj2).m2938n(i, obj);
            default:
                al1.m193a(i, this);
                Object[] objArr = ((zk1) obj2).f13934h;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.f5083h;
        Object obj = this.f5084i;
        switch (i) {
            case 0:
                return ((lk1) obj).f6164b;
            default:
                return ((zk1) obj).f13936j;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f5083h) {
            case 0:
                js1.m2562b(this, i, i2);
                return new kk1(this, i, i2, 0);
            default:
                al1.m194b(this, i, i2);
                return new kk1(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5083h) {
            case 0:
                objArr.getClass();
                break;
        }
        return AbstractC0738tl.m5301b0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f5083h) {
        }
        return AbstractC0738tl.m5299a0(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f5083h) {
            case 0:
                return new ik1(this, i, 0);
            default:
                return new ik1(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f5083h;
        Object obj2 = this.f5084i;
        switch (i) {
            case 0:
                return ((lk1) obj2).m2934j(obj);
            default:
                return ((zk1) obj2).m6431j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f5083h;
        Object obj2 = this.f5084i;
        switch (i) {
            case 0:
                ((lk1) obj2).m2925a(obj);
                break;
            default:
                ((zk1) obj2).m6423b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f5083h;
        Object obj = this.f5084i;
        switch (i) {
            case 0:
                collection.getClass();
                lk1 lk1Var = (lk1) obj;
                int i2 = lk1Var.f6164b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    lk1Var.m2925a(it.next());
                }
                return i2 != lk1Var.f6164b;
            default:
                zk1 zk1Var = (zk1) obj;
                return zk1Var.m6426e(zk1Var.f13936j, collection);
        }
    }
}
