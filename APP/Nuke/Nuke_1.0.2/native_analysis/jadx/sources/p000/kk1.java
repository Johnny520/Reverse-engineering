package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kk1 implements List, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5614h;

    /* JADX INFO: renamed from: i */
    public final List f5615i;

    /* JADX INFO: renamed from: j */
    public final int f5616j;

    /* JADX INFO: renamed from: k */
    public int f5617k;

    public /* synthetic */ kk1(List list, int i, int i2, int i3) {
        this.f5614h = i3;
        this.f5615i = list;
        this.f5616j = i;
        this.f5617k = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f5614h;
        int i3 = this.f5616j;
        List list = this.f5615i;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.f5617k++;
                break;
            default:
                list.add(i + i3, obj);
                this.f5617k++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f5614h;
        int i3 = this.f5616j;
        List list = this.f5615i;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.f5617k = collection.size() + this.f5617k;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.f5617k += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f5614h;
        List list = this.f5615i;
        int i2 = this.f5616j;
        switch (i) {
            case 0:
                int i3 = this.f5617k - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.f5617k = i2;
                break;
            default:
                int i4 = this.f5617k - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.f5617k = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f5614h;
        List list = this.f5615i;
        int i2 = this.f5616j;
        switch (i) {
            case 0:
                int i3 = this.f5617k;
                while (i2 < i3) {
                    if (!t11.m5086l(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.f5617k;
                while (i2 < i4) {
                    if (!t11.m5086l(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f5614h) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f5614h;
        int i3 = this.f5616j;
        List list = this.f5615i;
        switch (i2) {
            case 0:
                js1.m2561a(i, this);
                break;
            default:
                al1.m193a(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f5614h;
        List list = this.f5615i;
        int i2 = this.f5616j;
        switch (i) {
            case 0:
                int i3 = this.f5617k;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (t11.m5086l(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.f5617k;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (t11.m5086l(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f5614h) {
            case 0:
                if (this.f5617k == this.f5616j) {
                }
                break;
            default:
                if (this.f5617k == this.f5616j) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5614h) {
            case 0:
                return new ik1(this, 0, 0);
            default:
                return new ik1(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f5614h;
        List list = this.f5615i;
        int i2 = this.f5616j;
        switch (i) {
            case 0:
                int i3 = this.f5617k - 1;
                if (i2 <= i3) {
                    while (!t11.m5086l(list.get(i3), obj)) {
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                break;
            default:
                int i4 = this.f5617k - 1;
                if (i2 <= i4) {
                    while (!t11.m5086l(list.get(i4), obj)) {
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                break;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f5614h) {
            case 0:
                return new ik1(this, 0, 0);
            default:
                return new ik1(this, 0, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f5614h;
        int i2 = this.f5616j;
        List list = this.f5615i;
        switch (i) {
            case 0:
                int i3 = this.f5617k;
                while (i2 < i3) {
                    if (t11.m5086l(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f5617k--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.f5617k;
                while (i2 < i4) {
                    if (t11.m5086l(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f5617k--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f5614h) {
            case 0:
                collection.getClass();
                int i = this.f5617k;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.f5617k) {
                }
                break;
            default:
                int i2 = this.f5617k;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.f5617k) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f5614h;
        int i2 = this.f5616j;
        List list = this.f5615i;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.f5617k;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.f5617k--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.f5617k) {
                }
                break;
            default:
                int i5 = this.f5617k;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.f5617k--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.f5617k) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f5614h;
        int i3 = this.f5616j;
        List list = this.f5615i;
        switch (i2) {
            case 0:
                js1.m2561a(i, this);
                break;
            default:
                al1.m193a(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.f5614h) {
            case 0:
                i = this.f5617k;
                i2 = this.f5616j;
                break;
            default:
                i = this.f5617k;
                i2 = this.f5616j;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f5614h) {
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
        switch (this.f5614h) {
            case 0:
                objArr.getClass();
                break;
        }
        return AbstractC0738tl.m5301b0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f5614h) {
        }
        return AbstractC0738tl.m5299a0(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f5614h) {
            case 0:
                return new ik1(this, i, 0);
            default:
                return new ik1(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f5614h;
        List list = this.f5615i;
        switch (i) {
            case 0:
                int i2 = this.f5617k;
                this.f5617k = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.f5617k;
                this.f5617k = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f5614h;
        List list = this.f5615i;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.f5617k, collection);
                this.f5617k = collection.size() + this.f5617k;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(this.f5617k, collection);
                int size = collection.size();
                this.f5617k += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f5614h;
        int i3 = this.f5616j;
        List list = this.f5615i;
        switch (i2) {
            case 0:
                js1.m2561a(i, this);
                this.f5617k--;
                return list.remove(i + i3);
            default:
                al1.m193a(i, this);
                this.f5617k--;
                return list.remove(i + i3);
        }
    }
}
