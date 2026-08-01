package androidx.collection;

import androidx.compose.runtime.collection.AbstractC2058;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7394;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1088 implements List, InterfaceC7394 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f1235;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f1236;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f1237;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1238;

    public /* synthetic */ C1088(List list, int i, int i2, int i3) {
        this.f1238 = i3;
        this.f1236 = list;
        this.f1237 = i;
        this.f1235 = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f1238;
        int i3 = this.f1237;
        List list = this.f1236;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.f1235++;
                break;
            default:
                list.add(i + i3, obj);
                this.f1235++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f1238;
        int i3 = this.f1237;
        List list = this.f1236;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.f1235 = collection.size() + this.f1235;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.f1235 += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f1238;
        List list = this.f1236;
        int i2 = this.f1237;
        switch (i) {
            case 0:
                int i3 = this.f1235 - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.f1235 = i2;
                break;
            default:
                int i4 = this.f1235 - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.f1235 = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f1238;
        List list = this.f1236;
        int i2 = this.f1237;
        switch (i) {
            case 0:
                int i3 = this.f1235;
                while (i2 < i3) {
                    if (!AbstractC5227.m9466(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.f1235;
                while (i2 < i4) {
                    if (!AbstractC5227.m9466(list.get(i2), obj)) {
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
        switch (this.f1238) {
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
        int i2 = this.f1238;
        int i3 = this.f1237;
        List list = this.f1236;
        switch (i2) {
            case 0:
                AbstractC1134.m1436(i, this);
                break;
            default:
                AbstractC2058.m2602(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f1238;
        List list = this.f1236;
        int i2 = this.f1237;
        switch (i) {
            case 0:
                int i3 = this.f1235;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (AbstractC5227.m9466(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.f1235;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (AbstractC5227.m9466(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f1238) {
            case 0:
                if (this.f1235 == this.f1237) {
                }
                break;
            default:
                if (this.f1235 == this.f1237) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1238) {
            case 0:
                return new C1098(this, 0, 0);
            default:
                return new C1098(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f1238;
        List list = this.f1236;
        int i2 = this.f1237;
        switch (i) {
            case 0:
                int i3 = this.f1235 - 1;
                if (i2 <= i3) {
                    while (!AbstractC5227.m9466(list.get(i3), obj)) {
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                break;
            default:
                int i4 = this.f1235 - 1;
                if (i2 <= i4) {
                    while (!AbstractC5227.m9466(list.get(i4), obj)) {
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
        switch (this.f1238) {
            case 0:
                return new C1098(this, 0, 0);
            default:
                return new C1098(this, 0, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f1238;
        int i2 = this.f1237;
        List list = this.f1236;
        switch (i) {
            case 0:
                int i3 = this.f1235;
                while (i2 < i3) {
                    if (AbstractC5227.m9466(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f1235--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.f1235;
                while (i2 < i4) {
                    if (AbstractC5227.m9466(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f1235--;
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
        switch (this.f1238) {
            case 0:
                collection.getClass();
                int i = this.f1235;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.f1235) {
                }
                break;
            default:
                int i2 = this.f1235;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.f1235) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f1238;
        int i2 = this.f1237;
        List list = this.f1236;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.f1235;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.f1235--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.f1235) {
                }
                break;
            default:
                int i5 = this.f1235;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.f1235--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.f1235) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f1238;
        int i3 = this.f1237;
        List list = this.f1236;
        switch (i2) {
            case 0:
                AbstractC1134.m1436(i, this);
                break;
            default:
                AbstractC2058.m2602(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.f1238) {
            case 0:
                i = this.f1235;
                i2 = this.f1237;
                break;
            default:
                i = this.f1235;
                i2 = this.f1237;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f1238) {
            case 0:
                AbstractC1134.m1435(this, i, i2);
                return new C1088(this, i, i2, 0);
            default:
                AbstractC2058.m2601(this, i, i2);
                return new C1088(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f1238) {
            case 0:
                objArr.getClass();
                break;
        }
        return AbstractC5214.m9433(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f1238) {
        }
        return AbstractC5214.m9434(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f1238) {
            case 0:
                return new C1098(this, i, 0);
            default:
                return new C1098(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f1238;
        List list = this.f1236;
        switch (i) {
            case 0:
                int i2 = this.f1235;
                this.f1235 = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.f1235;
                this.f1235 = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f1238;
        List list = this.f1236;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.f1235, collection);
                this.f1235 = collection.size() + this.f1235;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(this.f1235, collection);
                int size = collection.size();
                this.f1235 += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f1238;
        int i3 = this.f1237;
        List list = this.f1236;
        switch (i2) {
            case 0:
                AbstractC1134.m1436(i, this);
                this.f1235--;
                return list.remove(i + i3);
            default:
                AbstractC2058.m2602(i, this);
                this.f1235--;
                return list.remove(i + i3);
        }
    }
}
