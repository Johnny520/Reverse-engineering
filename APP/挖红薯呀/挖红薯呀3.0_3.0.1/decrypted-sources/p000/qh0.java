package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qh0 implements List, r40 {

    /* JADX INFO: renamed from: d */
    public final List f5148d;

    /* JADX INFO: renamed from: e */
    public final int f5149e;

    /* JADX INFO: renamed from: f */
    public int f5150f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qh0(List list, int i, int i2) {
        this.f5148d = list;
        this.f5149e = i;
        this.f5150f = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f5148d.add(i + this.f5149e, obj);
        this.f5150f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.f5148d.addAll(i + this.f5149e, collection);
        int size = collection.size();
        this.f5150f += size;
        return size > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f5150f - 1;
        int i2 = this.f5149e;
        if (i2 <= i) {
            while (true) {
                this.f5148d.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.f5150f = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f5150f;
        for (int i2 = this.f5149e; i2 < i; i2++) {
            if (p30.m3002l(this.f5148d.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        th0.m4202a(i, this);
        return this.f5148d.get(i + this.f5149e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f5150f;
        int i2 = this.f5149e;
        for (int i3 = i2; i3 < i; i3++) {
            if (p30.m3002l(this.f5148d.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5150f == this.f5149e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new rh0(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f5150f - 1;
        int i2 = this.f5149e;
        if (i2 > i) {
            return -1;
        }
        while (!p30.m3002l(this.f5148d.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        return new rh0(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f5150f;
        for (int i2 = this.f5149e; i2 < i; i2++) {
            List list = this.f5148d;
            if (p30.m3002l(list.get(i2), obj)) {
                list.remove(i2);
                this.f5150f--;
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f5150f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.f5150f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f5150f;
        int i2 = i - 1;
        int i3 = this.f5149e;
        if (i3 <= i2) {
            while (true) {
                List list = this.f5148d;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.f5150f--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.f5150f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        th0.m4202a(i, this);
        return this.f5148d.set(i + this.f5149e, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5150f - this.f5149e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i, int i2) {
        th0.m4203b(this, i, i2);
        return new qh0(this, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return s91.m4031R(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return s91.m4032S(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new rh0(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f5150f;
        this.f5150f = i + 1;
        this.f5148d.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f5148d.addAll(this.f5150f, collection);
        int size = collection.size();
        this.f5150f += size;
        return size > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        th0.m4202a(i, this);
        this.f5150f--;
        return this.f5148d.remove(i + this.f5149e);
    }
}
