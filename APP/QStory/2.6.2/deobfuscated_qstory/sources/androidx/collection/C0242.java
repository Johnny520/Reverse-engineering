package androidx.collection;

import androidx.compose.runtime.collection.AbstractC1223;
import androidx.compose.runtime.collection.C1224;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4381;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6564;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0242 implements List, InterfaceC6564 {

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
                    c0244.m772(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = c0244.f1005;
                if (objArr.length < i4) {
                    c0244.m769(i4, objArr);
                }
                Object[] objArr2 = c0244.f1005;
                int i5 = c0244.f1004;
                if (i != i5) {
                    AbstractC4346.m8839(i + 1, i, objArr2, i5, objArr2);
                }
                objArr2[i] = obj;
                c0244.f1004++;
                return;
            default:
                ((C1224) obj2).m2038(i, obj);
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
                    c0244.m772(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + c0244.f1004;
                Object[] objArr = c0244.f1005;
                if (objArr.length < size) {
                    c0244.m769(size, objArr);
                }
                Object[] objArr2 = c0244.f1005;
                if (i != c0244.f1004) {
                    AbstractC4346.m8839(collection.size() + i, i, objArr2, c0244.f1004, objArr2);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC8189.m13662();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                c0244.f1004 = collection.size() + c0244.f1004;
                return true;
            default:
                return ((C1224) obj).m2034(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f895;
        Object obj = this.f894;
        switch (i) {
            case 0:
                ((C0244) obj).m778();
                break;
            default:
                ((C1224) obj).m2042();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f895;
        Object obj2 = this.f894;
        switch (i) {
            case 0:
                return ((C0244) obj2).m879(obj) >= 0;
            default:
                return ((C1224) obj2).m2041(obj);
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
                    if (c0244.m879(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                C1224 c1224 = (C1224) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c1224.m2041(it2.next())) {
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
                AbstractC0287.m875(i, this);
                return ((C0244) obj).m880(i);
            default:
                AbstractC1223.m2032(i, this);
                return ((C1224) obj).f3520[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f895;
        Object obj2 = this.f894;
        switch (i) {
            case 0:
                return ((C0244) obj2).m879(obj);
            default:
                return ((C1224) obj2).m2044(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f895;
        Object obj = this.f894;
        switch (i) {
            case 0:
                return ((C0244) obj).m878();
            default:
                return ((C1224) obj).f3519 == 0;
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
                Object[] objArr2 = c1224.f3520;
                for (int i4 = c1224.f3519 - 1; i4 >= 0; i4--) {
                    if (AbstractC4394.m8917(obj, objArr2[i4])) {
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
                AbstractC0287.m875(i, this);
                return ((C0244) obj).m776(i);
            default:
                AbstractC1223.m2032(i, this);
                return ((C1224) obj).m2043(i);
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
                    c0244.m775(it.next());
                }
                if (i2 == c0244.f1004) {
                    break;
                }
                break;
            default:
                C1224 c1224 = (C1224) obj;
                if (!collection.isEmpty()) {
                    int i3 = c1224.f3519;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        c1224.m2045(it2.next());
                    }
                    if (i3 != c1224.f3519) {
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
                        c0244.m776(i3);
                    }
                }
                if (i2 != c0244.f1004) {
                }
                break;
            default:
                C1224 c1224 = (C1224) obj;
                int i4 = c1224.f3519;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(c1224.f3520[i5])) {
                        c1224.m2043(i5);
                    }
                }
                if (i4 != c1224.f3519) {
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
                AbstractC0287.m875(i, this);
                return ((C0244) obj2).m771(i, obj);
            default:
                AbstractC1223.m2032(i, this);
                Object[] objArr = ((C1224) obj2).f3520;
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
                return ((C1224) obj).f3519;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f895) {
            case 0:
                AbstractC0287.m874(this, i, i2);
                return new C0241(this, i, i2, 0);
            default:
                AbstractC1223.m2031(this, i, i2);
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
        return AbstractC4381.m8884(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f895) {
        }
        return AbstractC4381.m8885(this);
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
                return ((C0244) obj2).m775(obj);
            default:
                return ((C1224) obj2).m2045(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f895;
        Object obj2 = this.f894;
        switch (i) {
            case 0:
                ((C0244) obj2).m774(obj);
                break;
            default:
                ((C1224) obj2).m2037(obj);
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
                    c0244.m774(it.next());
                }
                return i2 != c0244.f1004;
            default:
                C1224 c1224 = (C1224) obj;
                return c1224.m2034(c1224.f3519, collection);
        }
    }
}
