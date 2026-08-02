package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jk1 implements List, q41 {
    public final /* synthetic */ int h;
    public final Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ jk1(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.h;
        Object obj2 = this.i;
        switch (i3) {
            case 0:
                lk1 lk1Var = (lk1) obj2;
                if (i < 0 || i > (i2 = lk1Var.b)) {
                    lk1Var.p(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = lk1Var.a;
                if (objArr.length < i4) {
                    lk1Var.m(i4, objArr);
                }
                Object[] objArr2 = lk1Var.a;
                int i5 = lk1Var.b;
                if (i != i5) {
                    mg.c0(objArr2, objArr2, i + 1, i, i5);
                }
                objArr2[i] = obj;
                lk1Var.b++;
                return;
            default:
                ((zk1) obj2).a(i, obj);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                collection.getClass();
                lk1 lk1Var = (lk1) obj;
                if (i < 0 || i > lk1Var.b) {
                    lk1Var.p(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + lk1Var.b;
                Object[] objArr = lk1Var.a;
                if (objArr.length < size) {
                    lk1Var.m(size, objArr);
                }
                Object[] objArr2 = lk1Var.a;
                if (i != lk1Var.b) {
                    mg.c0(objArr2, objArr2, collection.size() + i, i, lk1Var.b);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        eu.a0();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                lk1Var.b = collection.size() + lk1Var.b;
                return true;
            default:
                return ((zk1) obj).e(i, collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((lk1) obj).d();
                break;
            default:
                ((zk1) obj).g();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return ((lk1) obj2).g(obj) >= 0;
            default:
                return ((zk1) obj2).h(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                collection.getClass();
                lk1 lk1Var = (lk1) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (lk1Var.g(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                zk1 zk1Var = (zk1) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!zk1Var.h(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                js1.a(i, this);
                return ((lk1) obj).f(i);
            default:
                al1.a(i, this);
                return ((zk1) obj).h[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return ((lk1) obj2).g(obj);
            default:
                return ((zk1) obj2).i(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                return ((lk1) obj).h();
            default:
                return ((zk1) obj).j == 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                return new ik1(this, 0, 0);
            default:
                return new ik1(this, 0, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.h;
        Object obj2 = this.i;
        switch (i2) {
            case 0:
                lk1 lk1Var = (lk1) obj2;
                Object[] objArr = lk1Var.a;
                int i3 = lk1Var.b;
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
                Object[] objArr2 = zk1Var.h;
                for (int i4 = zk1Var.j - 1; i4 >= 0; i4--) {
                    if (t11.l(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.h) {
            case 0:
                return new ik1(this, 0, 0);
            default:
                return new ik1(this, 0, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                js1.a(i, this);
                return ((lk1) obj).k(i);
            default:
                al1.a(i, this);
                return ((zk1) obj).k(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                collection.getClass();
                lk1 lk1Var = (lk1) obj;
                int i2 = lk1Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    lk1Var.j(it.next());
                }
                if (i2 == lk1Var.b) {
                    break;
                }
                break;
            default:
                zk1 zk1Var = (zk1) obj;
                if (!collection.isEmpty()) {
                    int i3 = zk1Var.j;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        zk1Var.j(it2.next());
                    }
                    if (i3 != zk1Var.j) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                collection.getClass();
                lk1 lk1Var = (lk1) obj;
                int i2 = lk1Var.b;
                Object[] objArr = lk1Var.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        lk1Var.k(i3);
                    }
                }
                if (i2 != lk1Var.b) {
                }
                break;
            default:
                zk1 zk1Var = (zk1) obj;
                int i4 = zk1Var.j;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(zk1Var.h[i5])) {
                        zk1Var.k(i5);
                    }
                }
                if (i4 != zk1Var.j) {
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.h;
        Object obj2 = this.i;
        switch (i2) {
            case 0:
                js1.a(i, this);
                return ((lk1) obj2).n(i, obj);
            default:
                al1.a(i, this);
                Object[] objArr = ((zk1) obj2).h;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                return ((lk1) obj).b;
            default:
                return ((zk1) obj).j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.h) {
            case 0:
                js1.b(this, i, i2);
                return new kk1(this, i, i2, 0);
            default:
                al1.b(this, i, i2);
                return new kk1(this, i, i2, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.h) {
            case 0:
                objArr.getClass();
                break;
        }
        return tl.b0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.h) {
        }
        return tl.a0(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.h) {
            case 0:
                return new ik1(this, i, 0);
            default:
                return new ik1(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return ((lk1) obj2).j(obj);
            default:
                return ((zk1) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                ((lk1) obj2).a(obj);
                break;
            default:
                ((zk1) obj2).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                collection.getClass();
                lk1 lk1Var = (lk1) obj;
                int i2 = lk1Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    lk1Var.a(it.next());
                }
                return i2 != lk1Var.b;
            default:
                zk1 zk1Var = (zk1) obj;
                return zk1Var.e(zk1Var.j, collection);
        }
    }
}
