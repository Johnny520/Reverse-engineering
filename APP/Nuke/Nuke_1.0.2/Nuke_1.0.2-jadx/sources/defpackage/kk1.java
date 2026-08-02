package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kk1 implements List, q41 {
    public final /* synthetic */ int h;
    public final List i;
    public final int j;
    public int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ kk1(List list, int i, int i2, int i3) {
        this.h = i3;
        this.i = list;
        this.j = i;
        this.k = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.h;
        int i3 = this.j;
        List list = this.i;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.k++;
                break;
            default:
                list.add(i + i3, obj);
                this.k++;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.h;
        int i3 = this.j;
        List list = this.i;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.k = collection.size() + this.k;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.k += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.h;
        List list = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                int i3 = this.k - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.k = i2;
                break;
            default:
                int i4 = this.k - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.k = i2;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.h;
        List list = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                int i3 = this.k;
                while (i2 < i3) {
                    if (!t11.l(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.k;
                while (i2 < i4) {
                    if (!t11.l(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.h) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        int i3 = this.j;
        List list = this.i;
        switch (i2) {
            case 0:
                js1.a(i, this);
                break;
            default:
                al1.a(i, this);
                break;
        }
        return list.get(i + i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.h;
        List list = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                int i3 = this.k;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (t11.l(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.k;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (t11.l(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.h) {
            case 0:
                if (this.k == this.j) {
                }
                break;
            default:
                if (this.k == this.j) {
                }
                break;
        }
        return false;
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
        int i = this.h;
        List list = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                int i3 = this.k - 1;
                if (i2 <= i3) {
                    while (!t11.l(list.get(i3), obj)) {
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                break;
            default:
                int i4 = this.k - 1;
                if (i2 <= i4) {
                    while (!t11.l(list.get(i4), obj)) {
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                break;
        }
        return -1;
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
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.h;
        int i2 = this.j;
        List list = this.i;
        switch (i) {
            case 0:
                int i3 = this.k;
                while (i2 < i3) {
                    if (t11.l(list.get(i2), obj)) {
                        list.remove(i2);
                        this.k--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.k;
                while (i2 < i4) {
                    if (t11.l(list.get(i2), obj)) {
                        list.remove(i2);
                        this.k--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.h) {
            case 0:
                collection.getClass();
                int i = this.k;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.k) {
                }
                break;
            default:
                int i2 = this.k;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.k) {
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.h;
        int i2 = this.j;
        List list = this.i;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.k;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.k--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.k) {
                }
                break;
            default:
                int i5 = this.k;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.k--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.k) {
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.h;
        int i3 = this.j;
        List list = this.i;
        switch (i2) {
            case 0:
                js1.a(i, this);
                break;
            default:
                al1.a(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.h) {
            case 0:
                i = this.k;
                i2 = this.j;
                break;
            default:
                i = this.k;
                i2 = this.j;
                break;
        }
        return i - i2;
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
    public final boolean add(Object obj) {
        int i = this.h;
        List list = this.i;
        switch (i) {
            case 0:
                int i2 = this.k;
                this.k = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.k;
                this.k = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.h;
        List list = this.i;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.k, collection);
                this.k = collection.size() + this.k;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(this.k, collection);
                int size = collection.size();
                this.k += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.h;
        int i3 = this.j;
        List list = this.i;
        switch (i2) {
            case 0:
                js1.a(i, this);
                this.k--;
                return list.remove(i + i3);
            default:
                al1.a(i, this);
                this.k--;
                return list.remove(i + i3);
        }
    }
}
