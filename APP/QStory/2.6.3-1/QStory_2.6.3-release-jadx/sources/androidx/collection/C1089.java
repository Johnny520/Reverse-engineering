package androidx.collection;

import androidx.compose.runtime.collection.AbstractC2058;
import androidx.compose.runtime.collection.C2059;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.AbstractC5227;
import p050.AbstractC7176;
import p070.InterfaceC7394;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1089 implements List, InterfaceC7394 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f1239;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1240;

    public /* synthetic */ C1089(Object obj, int i) {
        this.f1240 = i;
        this.f1239 = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f1240;
        Object obj2 = this.f1239;
        switch (i3) {
            case 0:
                C1091 c1091 = (C1091) obj2;
                if (i < 0 || i > (i2 = c1091.f1349)) {
                    c1091.m1333(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = c1091.f1350;
                if (objArr.length < i4) {
                    c1091.m1330(i4, objArr);
                }
                Object[] objArr2 = c1091.f1350;
                int i5 = c1091.f1349;
                if (i != i5) {
                    AbstractC5179.m9394(i + 1, i, objArr2, i5, objArr2);
                }
                objArr2[i] = obj;
                c1091.f1349++;
                return;
            default:
                ((C2059) obj2).m2608(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f1240;
        Object obj = this.f1239;
        switch (i2) {
            case 0:
                collection.getClass();
                C1091 c1091 = (C1091) obj;
                if (i < 0 || i > c1091.f1349) {
                    c1091.m1333(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + c1091.f1349;
                Object[] objArr = c1091.f1350;
                if (objArr.length < size) {
                    c1091.m1330(size, objArr);
                }
                Object[] objArr2 = c1091.f1350;
                if (i != c1091.f1349) {
                    AbstractC5179.m9394(collection.size() + i, i, objArr2, c1091.f1349, objArr2);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC7176.m12479();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                c1091.f1349 = collection.size() + c1091.f1349;
                return true;
            default:
                return ((C2059) obj).m2604(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f1240;
        Object obj = this.f1239;
        switch (i) {
            case 0:
                ((C1091) obj).m1339();
                break;
            default:
                ((C2059) obj).m2612();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f1240;
        Object obj2 = this.f1239;
        switch (i) {
            case 0:
                return ((C1091) obj2).m1440(obj) >= 0;
            default:
                return ((C2059) obj2).m2611(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f1240;
        Object obj = this.f1239;
        switch (i) {
            case 0:
                collection.getClass();
                C1091 c1091 = (C1091) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (c1091.m1440(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                C2059 c2059 = (C2059) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c2059.m2611(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f1240;
        Object obj = this.f1239;
        switch (i2) {
            case 0:
                AbstractC1134.m1436(i, this);
                return ((C1091) obj).m1441(i);
            default:
                AbstractC2058.m2602(i, this);
                return ((C2059) obj).f3866[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f1240;
        Object obj2 = this.f1239;
        switch (i) {
            case 0:
                return ((C1091) obj2).m1440(obj);
            default:
                return ((C2059) obj2).m2614(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f1240;
        Object obj = this.f1239;
        switch (i) {
            case 0:
                return ((C1091) obj).m1439();
            default:
                return ((C2059) obj).f3865 == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1240) {
            case 0:
                return new C1098(this, 0, 0);
            default:
                return new C1098(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.f1240;
        Object obj2 = this.f1239;
        switch (i2) {
            case 0:
                C1091 c1091 = (C1091) obj2;
                Object[] objArr = c1091.f1350;
                int i3 = c1091.f1349;
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
                C2059 c2059 = (C2059) obj2;
                Object[] objArr2 = c2059.f3866;
                for (int i4 = c2059.f3865 - 1; i4 >= 0; i4--) {
                    if (AbstractC5227.m9466(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f1240) {
            case 0:
                return new C1098(this, 0, 0);
            default:
                return new C1098(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f1240;
        Object obj = this.f1239;
        switch (i2) {
            case 0:
                AbstractC1134.m1436(i, this);
                return ((C1091) obj).m1337(i);
            default:
                AbstractC2058.m2602(i, this);
                return ((C2059) obj).m2613(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f1240;
        Object obj = this.f1239;
        switch (i) {
            case 0:
                collection.getClass();
                C1091 c1091 = (C1091) obj;
                int i2 = c1091.f1349;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c1091.m1336(it.next());
                }
                if (i2 == c1091.f1349) {
                    break;
                }
                break;
            default:
                C2059 c2059 = (C2059) obj;
                if (!collection.isEmpty()) {
                    int i3 = c2059.f3865;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        c2059.m2615(it2.next());
                    }
                    if (i3 != c2059.f3865) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f1240;
        Object obj = this.f1239;
        switch (i) {
            case 0:
                collection.getClass();
                C1091 c1091 = (C1091) obj;
                int i2 = c1091.f1349;
                Object[] objArr = c1091.f1350;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        c1091.m1337(i3);
                    }
                }
                if (i2 != c1091.f1349) {
                }
                break;
            default:
                C2059 c2059 = (C2059) obj;
                int i4 = c2059.f3865;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(c2059.f3866[i5])) {
                        c2059.m2613(i5);
                    }
                }
                if (i4 != c2059.f3865) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f1240;
        Object obj2 = this.f1239;
        switch (i2) {
            case 0:
                AbstractC1134.m1436(i, this);
                return ((C1091) obj2).m1332(i, obj);
            default:
                AbstractC2058.m2602(i, this);
                Object[] objArr = ((C2059) obj2).f3866;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.f1240;
        Object obj = this.f1239;
        switch (i) {
            case 0:
                return ((C1091) obj).f1349;
            default:
                return ((C2059) obj).f3865;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f1240) {
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
        switch (this.f1240) {
            case 0:
                objArr.getClass();
                break;
        }
        return AbstractC5214.m9433(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f1240) {
        }
        return AbstractC5214.m9434(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f1240) {
            case 0:
                return new C1098(this, i, 0);
            default:
                return new C1098(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f1240;
        Object obj2 = this.f1239;
        switch (i) {
            case 0:
                return ((C1091) obj2).m1336(obj);
            default:
                return ((C2059) obj2).m2615(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f1240;
        Object obj2 = this.f1239;
        switch (i) {
            case 0:
                ((C1091) obj2).m1335(obj);
                break;
            default:
                ((C2059) obj2).m2607(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f1240;
        Object obj = this.f1239;
        switch (i) {
            case 0:
                collection.getClass();
                C1091 c1091 = (C1091) obj;
                int i2 = c1091.f1349;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c1091.m1335(it.next());
                }
                return i2 != c1091.f1349;
            default:
                C2059 c2059 = (C2059) obj;
                return c2059.m2604(c2059.f3865, collection);
        }
    }
}
