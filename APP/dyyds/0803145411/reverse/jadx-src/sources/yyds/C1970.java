package yyds;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᲀᛳᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1970 implements Collection, Set, InterfaceC1654, InterfaceC1750 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f9886;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int[] f9887 = AbstractC0024.f8167;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object[] f9888 = AbstractC0024.f8168;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM1453;
        int i2 = this.f9886;
        if (obj == null) {
            iM1453 = AbstractC0578.m1453(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM1453 = AbstractC0578.m1453(this, obj, iHashCode);
        }
        if (iM1453 >= 0) {
            return false;
        }
        int i3 = ~iM1453;
        int[] iArr = this.f9887;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f9888;
            int[] iArr2 = new int[i4];
            this.f9887 = iArr2;
            this.f9888 = new Object[i4];
            if (i2 != this.f9886) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                AbstractC2070.m3937(0, objArr.length, 6, objArr, this.f9888);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f9887;
            int i5 = i3 + 1;
            AbstractC2070.m3934(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.f9888;
            AbstractC2070.m3939(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.f9886;
        if (i2 == i6) {
            int[] iArr4 = this.f9887;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f9888[i3] = obj;
                this.f9886 = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f9886;
        int i = this.f9886;
        int[] iArr = this.f9887;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f9888;
            int[] iArr2 = new int[size];
            this.f9887 = iArr2;
            this.f9888 = new Object[size];
            if (i > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i);
                AbstractC2070.m3937(0, this.f9886, 6, objArr, this.f9888);
            }
        }
        if (this.f9886 != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f9886;
        if (i != 0) {
            this.f9887 = AbstractC0024.f8167;
            this.f9888 = AbstractC0024.f8168;
            i = 0;
            this.f9886 = 0;
        }
        if (i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC0578.m1453(this, null, 0) : AbstractC0578.m1453(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
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
        if ((obj instanceof Set) && this.f9886 == ((Set) obj).size()) {
            try {
                int i = this.f9886;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(this.f9888[i2])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f9887;
        int i = this.f9886;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f9886 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1070(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM1453 = obj == null ? AbstractC0578.m1453(this, null, 0) : AbstractC0578.m1453(this, obj, obj.hashCode());
        if (iM1453 < 0) {
            return false;
        }
        m3802(iM1453);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f9886 - 1; -1 < i; i--) {
            if (!AbstractC1595.m3286(collection, this.f9888[i])) {
                m3802(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f9886;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int i = this.f9886;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC2070.m3939(0, 0, this.f9886, this.f9888, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9886 * 14);
        sb.append('{');
        int i = this.f9886;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f9888[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object m3802(int i) {
        int i2 = this.f9886;
        Object[] objArr = this.f9888;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f9887;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC2070.m3934(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.f9888;
                AbstractC2070.m3939(i, i4, i2, objArr2, objArr2);
            }
            this.f9888[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f9887 = iArr2;
            this.f9888 = new Object[i5];
            if (i > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i);
                AbstractC2070.m3937(0, i, 6, objArr, this.f9888);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC2070.m3934(i, i6, i2, iArr, this.f9887);
                AbstractC2070.m3939(i, i6, i2, objArr, this.f9888);
            }
        }
        if (i2 != this.f9886) {
            throw new ConcurrentModificationException();
        }
        this.f9886 = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f9888;
        int i = this.f9886;
        AbstractC0476.m1329(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }
}
