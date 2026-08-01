package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import p070.InterfaceC7391;
import p070.InterfaceC7395;
import p203.AbstractC8601;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1122 implements Collection, Set, InterfaceC7395, InterfaceC7391 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f1326;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f1327 = AbstractC8601.f21426;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f1325 = AbstractC8601.f21424;

    public C1122(int i) {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM1390;
        int i2 = this.f1326;
        if (obj == null) {
            iM1390 = AbstractC1114.m1390(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM1390 = AbstractC1114.m1390(this, obj, iHashCode);
        }
        if (iM1390 >= 0) {
            return false;
        }
        int i3 = ~iM1390;
        int[] iArr = this.f1327;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f1325;
            int[] iArr2 = new int[i4];
            this.f1327 = iArr2;
            this.f1325 = new Object[i4];
            if (i2 != this.f1326) {
                C1123.m1400();
                return false;
            }
            if (iArr2.length != 0) {
                AbstractC5179.m9400(0, iArr.length, 6, iArr, iArr2);
                AbstractC5179.m9399(0, objArr.length, objArr, 6, this.f1325);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f1327;
            int i5 = i3 + 1;
            AbstractC5179.m9395(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.f1325;
            AbstractC5179.m9394(i5, i3, objArr2, i2, objArr2);
        }
        int i6 = this.f1326;
        if (i2 == i6) {
            int[] iArr4 = this.f1327;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f1325[i3] = obj;
                this.f1326 = i6 + 1;
                return true;
            }
        }
        C1123.m1400();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f1326;
        int i = this.f1326;
        int[] iArr = this.f1327;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1325;
            int[] iArr2 = new int[size];
            this.f1327 = iArr2;
            this.f1325 = new Object[size];
            if (i > 0) {
                AbstractC5179.m9400(0, i, 6, iArr, iArr2);
                AbstractC5179.m9399(0, this.f1326, objArr, 6, this.f1325);
            }
        }
        if (this.f1326 != i) {
            C1123.m1400();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f1326 != 0) {
            this.f1327 = AbstractC8601.f21426;
            this.f1325 = AbstractC8601.f21424;
            this.f1326 = 0;
        }
        if (this.f1326 == 0) {
            return;
        }
        C1123.m1400();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC1114.m1390(this, null, 0) : AbstractC1114.m1390(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f1326 != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f1326;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f1325[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f1327;
        int i = this.f1326;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1326 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1108(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM1390 = obj == null ? AbstractC1114.m1390(this, null, 0) : AbstractC1114.m1390(this, obj, obj.hashCode());
        if (iM1390 < 0) {
            return false;
        }
        m1397(iM1390);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.f1326 - 1; -1 < i; i--) {
            if (!AbstractC5176.m9365(collection, this.f1325[i])) {
                m1397(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1326;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.f1326;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC5179.m9394(0, 0, this.f1325, this.f1326, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1326 * 14);
        sb.append('{');
        int i = this.f1326;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1325[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m1397(int i) {
        int i2 = this.f1326;
        Object[] objArr = this.f1325;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f1327;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC5179.m9395(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.f1325;
                AbstractC5179.m9394(i, i4, objArr2, i2, objArr2);
            }
            this.f1325[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f1327 = iArr2;
            this.f1325 = new Object[i5];
            if (i > 0) {
                AbstractC5179.m9400(0, i, 6, iArr, iArr2);
                AbstractC5179.m9399(0, i, objArr, 6, this.f1325);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC5179.m9395(i, i6, i2, iArr, this.f1327);
                AbstractC5179.m9394(i, i6, objArr, i2, this.f1325);
            }
        }
        if (i2 == this.f1326) {
            this.f1326 = i3;
            return obj;
        }
        C1123.m1400();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC5179.m9390(this.f1325, 0, this.f1326);
    }
}
