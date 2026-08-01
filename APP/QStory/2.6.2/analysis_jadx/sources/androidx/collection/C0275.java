package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import p054.InterfaceC6561;
import p054.InterfaceC6565;
import p187.AbstractC7771;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0275 implements Collection, Set, InterfaceC6565, InterfaceC6561 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f981;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f982 = AbstractC7771.f21084;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f980 = AbstractC7771.f21082;

    public C0275(int i) {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM829;
        int i2 = this.f981;
        if (obj == null) {
            iM829 = AbstractC0267.m829(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM829 = AbstractC0267.m829(this, obj, iHashCode);
        }
        if (iM829 >= 0) {
            return false;
        }
        int i3 = ~iM829;
        int[] iArr = this.f982;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f980;
            int[] iArr2 = new int[i4];
            this.f982 = iArr2;
            this.f980 = new Object[i4];
            if (i2 != this.f981) {
                C0276.m839();
                return false;
            }
            if (iArr2.length != 0) {
                AbstractC4346.m8838(0, iArr.length, 6, iArr, iArr2);
                AbstractC4346.m8837(0, objArr.length, objArr, 6, this.f980);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f982;
            int i5 = i3 + 1;
            AbstractC4346.m8842(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.f980;
            AbstractC4346.m8839(i5, i3, objArr2, i2, objArr2);
        }
        int i6 = this.f981;
        if (i2 == i6) {
            int[] iArr4 = this.f982;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f980[i3] = obj;
                this.f981 = i6 + 1;
                return true;
            }
        }
        C0276.m839();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f981;
        int i = this.f981;
        int[] iArr = this.f982;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f980;
            int[] iArr2 = new int[size];
            this.f982 = iArr2;
            this.f980 = new Object[size];
            if (i > 0) {
                AbstractC4346.m8838(0, i, 6, iArr, iArr2);
                AbstractC4346.m8837(0, this.f981, objArr, 6, this.f980);
            }
        }
        if (this.f981 != i) {
            C0276.m839();
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
        if (this.f981 != 0) {
            this.f982 = AbstractC7771.f21084;
            this.f980 = AbstractC7771.f21082;
            this.f981 = 0;
        }
        if (this.f981 == 0) {
            return;
        }
        C0276.m839();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC0267.m829(this, null, 0) : AbstractC0267.m829(this, obj, obj.hashCode())) >= 0;
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
        if (!(obj instanceof Set) || this.f981 != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f981;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f980[i2])) {
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
        int[] iArr = this.f982;
        int i = this.f981;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f981 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0261(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM829 = obj == null ? AbstractC0267.m829(this, null, 0) : AbstractC0267.m829(this, obj, obj.hashCode());
        if (iM829 < 0) {
            return false;
        }
        m836(iM829);
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
        for (int i = this.f981 - 1; -1 < i; i--) {
            if (!AbstractC4343.m8789(collection, this.f980[i])) {
                m836(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f981;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.f981;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC4346.m8839(0, 0, this.f980, this.f981, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f981 * 14);
        sb.append('{');
        int i = this.f981;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f980[i2];
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
    public final Object m836(int i) {
        int i2 = this.f981;
        Object[] objArr = this.f980;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f982;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC4346.m8842(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.f980;
                AbstractC4346.m8839(i, i4, objArr2, i2, objArr2);
            }
            this.f980[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f982 = iArr2;
            this.f980 = new Object[i5];
            if (i > 0) {
                AbstractC4346.m8838(0, i, 6, iArr, iArr2);
                AbstractC4346.m8837(0, i, objArr, 6, this.f980);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC4346.m8842(i, i6, i2, iArr, this.f982);
                AbstractC4346.m8839(i, i6, objArr, i2, this.f980);
            }
        }
        if (i2 == this.f981) {
            this.f981 = i3;
            return obj;
        }
        C0276.m839();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC4346.m8862(this.f980, 0, this.f981);
    }
}
