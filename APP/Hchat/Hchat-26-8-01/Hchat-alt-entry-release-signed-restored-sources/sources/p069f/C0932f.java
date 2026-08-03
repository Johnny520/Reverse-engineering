package p069f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p087g.AbstractC1256a;
import p114hg.InterfaceC1712b;
import p114hg.InterfaceC1715e;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: f.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0932f implements Collection, Set, InterfaceC1712b, InterfaceC1715e {

    /* JADX INFO: renamed from: g */
    public int[] f2920g = AbstractC1256a.f4113a;

    /* JADX INFO: renamed from: h */
    public Object[] f2921h = AbstractC1256a.f4115c;

    /* JADX INFO: renamed from: i */
    public int f2922i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m2285a(int i9) {
        int i10 = this.f2922i;
        Object[] objArr = this.f2921h;
        Object obj = objArr[i9];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f2920g;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i9 < i11) {
                int i12 = i9 + 1;
                AbstractC4165l.m8381p0(iArr, iArr, i9, i12, i10);
                Object[] objArr2 = this.f2921h;
                AbstractC4165l.m8379n0(i9, i12, objArr2, i10, objArr2);
            }
            this.f2921h[i11] = null;
        } else {
            int i13 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArr2 = new int[i13];
            this.f2920g = iArr2;
            this.f2921h = new Object[i13];
            if (i9 > 0) {
                AbstractC4165l.m8384s0(iArr, iArr2, 0, i9, 6);
                AbstractC4165l.m8383r0(0, i9, objArr, 6, this.f2921h);
            }
            if (i9 < i11) {
                int i14 = i9 + 1;
                AbstractC4165l.m8381p0(iArr, this.f2920g, i9, i14, i10);
                AbstractC4165l.m8379n0(i9, i14, objArr, i10, this.f2921h);
            }
        }
        if (i10 != this.f2922i) {
            throw new ConcurrentModificationException();
        }
        this.f2922i = i11;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i9;
        int iM2349a;
        int i10 = this.f2922i;
        if (obj == null) {
            iM2349a = AbstractC0954q.m2349a(this, null, 0);
            i9 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i9 = iHashCode;
            iM2349a = AbstractC0954q.m2349a(this, obj, iHashCode);
        }
        if (iM2349a >= 0) {
            return false;
        }
        int i11 = ~iM2349a;
        int[] iArr = this.f2920g;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f2921h;
            int[] iArr2 = new int[i12];
            this.f2920g = iArr2;
            this.f2921h = new Object[i12];
            if (i10 != this.f2922i) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC4165l.m8384s0(iArr, iArr2, 0, iArr.length, 6);
                AbstractC4165l.m8383r0(0, objArr.length, objArr, 6, this.f2921h);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f2920g;
            int i13 = i11 + 1;
            AbstractC4165l.m8381p0(iArr3, iArr3, i13, i11, i10);
            Object[] objArr2 = this.f2921h;
            AbstractC4165l.m8379n0(i13, i11, objArr2, i10, objArr2);
        }
        int i14 = this.f2922i;
        if (i10 == i14) {
            int[] iArr4 = this.f2920g;
            if (i11 < iArr4.length) {
                iArr4[i11] = i9;
                this.f2921h[i11] = obj;
                this.f2922i = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f2922i;
        int i9 = this.f2922i;
        int[] iArr = this.f2920g;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f2921h;
            int[] iArr2 = new int[size];
            this.f2920g = iArr2;
            this.f2921h = new Object[size];
            if (i9 > 0) {
                AbstractC4165l.m8384s0(iArr, iArr2, 0, i9, 6);
                AbstractC4165l.m8383r0(0, this.f2922i, objArr, 6, this.f2921h);
            }
        }
        if (this.f2922i != i9) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f2922i != 0) {
            this.f2920g = AbstractC1256a.f4113a;
            this.f2921h = AbstractC1256a.f4115c;
            this.f2922i = 0;
        }
        if (this.f2922i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC0954q.m2349a(this, null, 0) : AbstractC0954q.m2349a(this, obj, obj.hashCode())) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f2922i != ((Set) obj).size()) {
            return false;
        }
        try {
            int i9 = this.f2922i;
            for (int i10 = 0; i10 < i9; i10++) {
                if (!((Set) obj).contains(this.f2921h[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f2920g;
        int i9 = this.f2922i;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2922i <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0922a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM2349a = obj == null ? AbstractC0954q.m2349a(this, null, 0) : AbstractC0954q.m2349a(this, obj, obj.hashCode());
        if (iM2349a < 0) {
            return false;
        }
        m2285a(iM2349a);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z9 = false;
        for (int i9 = this.f2922i - 1; -1 < i9; i9--) {
            if (!AbstractC4166m.m8417o1(collection, this.f2921h[i9])) {
                m2285a(i9);
                z9 = true;
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f2922i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i9 = this.f2922i;
        if (objArr.length < i9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        } else if (objArr.length > i9) {
            objArr[i9] = null;
        }
        AbstractC4165l.m8379n0(0, 0, this.f2921h, this.f2922i, objArr);
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2922i * 14);
        sb2.append('{');
        int i9 = this.f2922i;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f2921h[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC4165l.m8386u0(this.f2921h, 0, this.f2922i);
    }
}
