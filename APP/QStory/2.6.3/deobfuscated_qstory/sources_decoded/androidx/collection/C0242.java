package androidx.collection;

import androidx.compose.runtime.collection.AbstractC1223;
import androidx.compose.runtime.collection.C1224;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4382;
import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6347;
import p054.InterfaceC6565;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0242 implements List, InterfaceC6565 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f894;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f895;

    public /* synthetic */ C0242(Object obj, int i) {
        this.f895 = i;
        this.f894 = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f895;
        Object obj2 = this.f894;
        switch (i3) {
            case 0:
                C0244 c0244 = (C0244) obj2;
                if (i < 0 || i > (i2 = c0244.f1004)) {
                    c0244.m773(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = c0244.f1005;
                if (objArr.length < i4) {
                    c0244.m770(i4, objArr);
                }
                Object[] objArr2 = c0244.f1005;
                int i5 = c0244.f1004;
                if (i != i5) {
                    AbstractC4347.m8835(i + 1, i, objArr2, i5, objArr2);
                }
                objArr2[i] = obj;
                c0244.f1004++;
                return;
            default:
                ((C1224) obj2).m2048(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f895;
        Object obj = this.f894;
        switch (i2) {
            case 0:
                collection.getClass();
                C0244 c0244 = (C0244) obj;
                if (i < 0 || i > c0244.f1004) {
                    c0244.m773(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + c0244.f1004;
                Object[] objArr = c0244.f1005;
                if (objArr.length < size) {
                    c0244.m770(size, objArr);
                }
                Object[] objArr2 = c0244.f1005;
                if (i != c0244.f1004) {
                    AbstractC4347.m8835(collection.size() + i, i, objArr2, c0244.f1004, objArr2);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC6347.m11920();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                c0244.f1004 = collection.size() + c0244.f1004;
                return true;
            default:
                return ((C1224) obj).m2044(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f895;
        Object obj = this.f894;
        switch (i) {
            case 0:
                ((C0244) obj).m779();
                break;
            default:
                ((C1224) obj).m2052();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f895;
        Object obj2 = this.f894;
        switch (i) {
            case 0:
                return ((C0244) obj2).m880(obj) >= 0;
            default:
                return ((C1224) obj2).m2051(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f895;
        Object obj = this.f894;
        switch (i) {
            case 0:
                collection.getClass();
                C0244 c0244 = (C0244) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (c0244.m880(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                C1224 c1224 = (C1224) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c1224.m2051(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f895;
        Object obj = this.f894;
        switch (i2) {
            case 0:
                AbstractC0287.m876(i, this);
                return ((C0244) obj).m881(i);
            default:
                AbstractC1223.m2042(i, this);
                return ((C1224) obj).f3521[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f895;
        Object obj2 = this.f894;
        switch (i) {
            case 0:
                return ((C0244) obj2).m880(obj);
            default:
                return ((C1224) obj2).m2054(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f895;
        Object obj = this.f894;
        switch (i) {
            case 0:
                return ((C0244) obj).m879();
            default:
                return ((C1224) obj).f3520 == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f895) {
            case 0:
                return new C0251(this, 0, 0);
            default:
                return new C0251(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.f895;
        Object obj2 = this.f894;
        switch (i2) {
            case 0:
                C0244 c0244 = (C0244) obj2;
                Object[] objArr = c0244.f1005;
                int i3 = c0244.f1004;
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
                C1224 c1224 = (C1224) obj2;
                Object[] objArr2 = c1224.f3521;
                for (int i4 = c1224.f3520 - 1; i4 >= 0; i4--) {
                    if (AbstractC4395.m8907(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f895) {
            case 0:
                return new C0251(this, 0, 0);
            default:
                return new C0251(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f895;
        Object obj = this.f894;
        switch (i2) {
            case 0:
                AbstractC0287.m876(i, this);
                return ((C0244) obj).m777(i);
            default:
                AbstractC1223.m2042(i, this);
                return ((C1224) obj).m2053(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f895;
        Object obj = this.f894;
        switch (i) {
            case 0:
                collection.getClass();
                C0244 c0244 = (C0244) obj;
                int i2 = c0244.f1004;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c0244.m776(it.next());
                }
                if (i2 == c0244.f1004) {
                    break;
                }
                break;
            default:
                C1224 c1224 = (C1224) obj;
                if (!collection.isEmpty()) {
                    int i3 = c1224.f3520;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        c1224.m2055(it2.next());
                    }
                    if (i3 != c1224.f3520) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f895;
        Object obj = this.f894;
        switch (i) {
            case 0:
                collection.getClass();
                C0244 c0244 = (C0244) obj;
                int i2 = c0244.f1004;
                Object[] objArr = c0244.f1005;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        c0244.m777(i3);
                    }
                }
                if (i2 != c0244.f1004) {
                }
                break;
            default:
                C1224 c1224 = (C1224) obj;
                int i4 = c1224.f3520;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(c1224.f3521[i5])) {
                        c1224.m2053(i5);
                    }
                }
                if (i4 != c1224.f3520) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f895;
        Object obj2 = this.f894;
        switch (i2) {
            case 0:
                AbstractC0287.m876(i, this);
                return ((C0244) obj2).m772(i, obj);
            default:
                AbstractC1223.m2042(i, this);
                Object[] objArr = ((C1224) obj2).f3521;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.f895;
        Object obj = this.f894;
        switch (i) {
            case 0:
                return ((C0244) obj).f1004;
            default:
                return ((C1224) obj).f3520;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f895) {
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
        switch (this.f895) {
            case 0:
                objArr.getClass();
                break;
        }
        return AbstractC4382.m8874(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f895) {
        }
        return AbstractC4382.m8875(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f895) {
            case 0:
                return new C0251(this, i, 0);
            default:
                return new C0251(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f895;
        Object obj2 = this.f894;
        switch (i) {
            case 0:
                return ((C0244) obj2).m776(obj);
            default:
                return ((C1224) obj2).m2055(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f895;
        Object obj2 = this.f894;
        switch (i) {
            case 0:
                ((C0244) obj2).m775(obj);
                break;
            default:
                ((C1224) obj2).m2047(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f895;
        Object obj = this.f894;
        switch (i) {
            case 0:
                collection.getClass();
                C0244 c0244 = (C0244) obj;
                int i2 = c0244.f1004;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c0244.m775(it.next());
                }
                return i2 != c0244.f1004;
            default:
                C1224 c1224 = (C1224) obj;
                return c1224.m2044(c1224.f3520, collection);
        }
    }
}
