package androidx.collection;

import androidx.compose.runtime.collection.AbstractC1223;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4382;
import kotlin.jvm.internal.AbstractC4395;
import p054.InterfaceC6565;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0241 implements List, InterfaceC6565 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f891;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f893;

    public /* synthetic */ C0241(List list, int i, int i2, int i3) {
        this.f893 = i3;
        this.f891 = list;
        this.f892 = i;
        this.f890 = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f893;
        int i3 = this.f892;
        List list = this.f891;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.f890++;
                break;
            default:
                list.add(i + i3, obj);
                this.f890++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f893;
        int i3 = this.f892;
        List list = this.f891;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.f890 = collection.size() + this.f890;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.f890 += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f893;
        List list = this.f891;
        int i2 = this.f892;
        switch (i) {
            case 0:
                int i3 = this.f890 - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.f890 = i2;
                break;
            default:
                int i4 = this.f890 - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.f890 = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f893;
        List list = this.f891;
        int i2 = this.f892;
        switch (i) {
            case 0:
                int i3 = this.f890;
                while (i2 < i3) {
                    if (!AbstractC4395.m8907(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.f890;
                while (i2 < i4) {
                    if (!AbstractC4395.m8907(list.get(i2), obj)) {
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
        switch (this.f893) {
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
        int i2 = this.f893;
        int i3 = this.f892;
        List list = this.f891;
        switch (i2) {
            case 0:
                AbstractC0287.m876(i, this);
                break;
            default:
                AbstractC1223.m2042(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f893;
        List list = this.f891;
        int i2 = this.f892;
        switch (i) {
            case 0:
                int i3 = this.f890;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (AbstractC4395.m8907(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.f890;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (AbstractC4395.m8907(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f893) {
            case 0:
                if (this.f890 == this.f892) {
                }
                break;
            default:
                if (this.f890 == this.f892) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f893) {
            case 0:
                return new C0251(this, 0, 0);
            default:
                return new C0251(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f893;
        List list = this.f891;
        int i2 = this.f892;
        switch (i) {
            case 0:
                int i3 = this.f890 - 1;
                if (i2 <= i3) {
                    while (!AbstractC4395.m8907(list.get(i3), obj)) {
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                break;
            default:
                int i4 = this.f890 - 1;
                if (i2 <= i4) {
                    while (!AbstractC4395.m8907(list.get(i4), obj)) {
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
        switch (this.f893) {
            case 0:
                return new C0251(this, 0, 0);
            default:
                return new C0251(this, 0, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f893;
        int i2 = this.f892;
        List list = this.f891;
        switch (i) {
            case 0:
                int i3 = this.f890;
                while (i2 < i3) {
                    if (AbstractC4395.m8907(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f890--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.f890;
                while (i2 < i4) {
                    if (AbstractC4395.m8907(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f890--;
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
        switch (this.f893) {
            case 0:
                collection.getClass();
                int i = this.f890;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.f890) {
                }
                break;
            default:
                int i2 = this.f890;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.f890) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f893;
        int i2 = this.f892;
        List list = this.f891;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.f890;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.f890--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.f890) {
                }
                break;
            default:
                int i5 = this.f890;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.f890--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.f890) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f893;
        int i3 = this.f892;
        List list = this.f891;
        switch (i2) {
            case 0:
                AbstractC0287.m876(i, this);
                break;
            default:
                AbstractC1223.m2042(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.f893) {
            case 0:
                i = this.f890;
                i2 = this.f892;
                break;
            default:
                i = this.f890;
                i2 = this.f892;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f893) {
            case 0:
                AbstractC0287.m875(this, i, i2);
                return new C0241(this, i, i2, 0);
            default:
                AbstractC1223.m2041(this, i, i2);
                return new C0241(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f893) {
            case 0:
                objArr.getClass();
                break;
        }
        return AbstractC4382.m8874(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f893) {
        }
        return AbstractC4382.m8875(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f893) {
            case 0:
                return new C0251(this, i, 0);
            default:
                return new C0251(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f893;
        List list = this.f891;
        switch (i) {
            case 0:
                int i2 = this.f890;
                this.f890 = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.f890;
                this.f890 = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f893;
        List list = this.f891;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.f890, collection);
                this.f890 = collection.size() + this.f890;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(this.f890, collection);
                int size = collection.size();
                this.f890 += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f893;
        int i3 = this.f892;
        List list = this.f891;
        switch (i2) {
            case 0:
                AbstractC0287.m876(i, this);
                this.f890--;
                return list.remove(i + i3);
            default:
                AbstractC1223.m2042(i, this);
                this.f890--;
                return list.remove(i + i3);
        }
    }
}
