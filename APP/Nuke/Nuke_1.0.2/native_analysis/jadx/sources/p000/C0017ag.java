package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ag */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0017ag extends AbstractC0947z2 {

    /* JADX INFO: renamed from: k */
    public static final Object[] f187k = new Object[0];

    /* JADX INFO: renamed from: h */
    public int f188h;

    /* JADX INFO: renamed from: i */
    public Object[] f189i = f187k;

    /* JADX INFO: renamed from: j */
    public int f190j;

    @Override // p000.AbstractC0947z2
    /* JADX INFO: renamed from: a */
    public final int mo152a() {
        return this.f190j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.f190j;
        if (i < 0 || i > i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m161j();
        m155d(this.f190j + 1);
        int iM160i = m160i(this.f188h + i);
        int i3 = this.f190j;
        if (i < ((i3 + 1) >> 1)) {
            if (iM160i == 0) {
                Object[] objArr = this.f189i;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iM160i - 1;
            }
            int length2 = this.f188h;
            if (length2 == 0) {
                Object[] objArr2 = this.f189i;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.f188h;
            Object[] objArr3 = this.f189i;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                AbstractC0460mg.m3088c0(objArr3, objArr3, i5, i5 + 1, length + 1);
            } else {
                AbstractC0460mg.m3088c0(objArr3, objArr3, i5 - 1, i5, objArr3.length);
                Object[] objArr4 = this.f189i;
                objArr4[objArr4.length - 1] = objArr4[0];
                AbstractC0460mg.m3088c0(objArr4, objArr4, 0, 1, length + 1);
            }
            this.f189i[length] = obj;
            this.f188h = i4;
        } else {
            int iM160i2 = m160i(i3 + this.f188h);
            Object[] objArr5 = this.f189i;
            if (iM160i < iM160i2) {
                AbstractC0460mg.m3088c0(objArr5, objArr5, iM160i + 1, iM160i, iM160i2);
            } else {
                AbstractC0460mg.m3088c0(objArr5, objArr5, 1, 0, iM160i2);
                Object[] objArr6 = this.f189i;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC0460mg.m3088c0(objArr6, objArr6, iM160i + 1, iM160i, objArr6.length - 1);
            }
            this.f189i[iM160i] = obj;
        }
        this.f190j++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.f190j;
        if (i < 0 || i > i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f190j) {
            return addAll(collection);
        }
        m161j();
        m155d(collection.size() + this.f190j);
        int iM160i = m160i(this.f190j + this.f188h);
        int iM160i2 = m160i(this.f188h + i);
        int size = collection.size();
        if (i >= ((this.f190j + 1) >> 1)) {
            int i3 = iM160i2 + size;
            Object[] objArr = this.f189i;
            if (iM160i2 < iM160i) {
                int i4 = size + iM160i;
                if (i4 <= objArr.length) {
                    AbstractC0460mg.m3088c0(objArr, objArr, i3, iM160i2, iM160i);
                } else if (i3 >= objArr.length) {
                    AbstractC0460mg.m3088c0(objArr, objArr, i3 - objArr.length, iM160i2, iM160i);
                } else {
                    int length = iM160i - (i4 - objArr.length);
                    AbstractC0460mg.m3088c0(objArr, objArr, 0, length, iM160i);
                    Object[] objArr2 = this.f189i;
                    AbstractC0460mg.m3088c0(objArr2, objArr2, i3, iM160i2, length);
                }
            } else {
                AbstractC0460mg.m3088c0(objArr, objArr, size, 0, iM160i);
                Object[] objArr3 = this.f189i;
                if (i3 >= objArr3.length) {
                    AbstractC0460mg.m3088c0(objArr3, objArr3, i3 - objArr3.length, iM160i2, objArr3.length);
                } else {
                    AbstractC0460mg.m3088c0(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.f189i;
                    AbstractC0460mg.m3088c0(objArr4, objArr4, i3, iM160i2, objArr4.length - size);
                }
            }
            m154c(iM160i2, collection);
            return true;
        }
        int i5 = this.f188h;
        int length2 = i5 - size;
        Object[] objArr5 = this.f189i;
        if (iM160i2 < i5) {
            AbstractC0460mg.m3088c0(objArr5, objArr5, length2, i5, objArr5.length);
            Object[] objArr6 = this.f189i;
            if (size >= iM160i2) {
                AbstractC0460mg.m3088c0(objArr6, objArr6, objArr6.length - size, 0, iM160i2);
            } else {
                AbstractC0460mg.m3088c0(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.f189i;
                AbstractC0460mg.m3088c0(objArr7, objArr7, 0, size, iM160i2);
            }
        } else if (length2 >= 0) {
            AbstractC0460mg.m3088c0(objArr5, objArr5, length2, i5, iM160i2);
        } else {
            length2 += objArr5.length;
            int i6 = iM160i2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                AbstractC0460mg.m3088c0(objArr5, objArr5, length2, i5, iM160i2);
            } else {
                AbstractC0460mg.m3088c0(objArr5, objArr5, length2, i5, i5 + length3);
                Object[] objArr8 = this.f189i;
                AbstractC0460mg.m3088c0(objArr8, objArr8, 0, this.f188h + length3, iM160i2);
            }
        }
        this.f188h = length2;
        m154c(m158g(iM160i2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m161j();
        m155d(this.f190j + 1);
        int length = this.f188h;
        if (length == 0) {
            Object[] objArr = this.f189i;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.f188h = i;
        this.f189i[i] = obj;
        this.f190j++;
    }

    public final void addLast(Object obj) {
        m161j();
        m155d(mo152a() + 1);
        this.f189i[m160i(mo152a() + this.f188h)] = obj;
        this.f190j = mo152a() + 1;
    }

    @Override // p000.AbstractC0947z2
    /* JADX INFO: renamed from: b */
    public final Object mo153b(int i) {
        int i2 = this.f190j;
        if (i < 0 || i >= i2) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", i2));
            return null;
        }
        if (i == mo152a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m161j();
        int iM160i = m160i(this.f188h + i);
        Object[] objArr = this.f189i;
        Object obj = objArr[iM160i];
        int i3 = this.f190j >> 1;
        int i4 = this.f188h;
        if (i < i3) {
            if (iM160i >= i4) {
                AbstractC0460mg.m3088c0(objArr, objArr, i4 + 1, i4, iM160i);
            } else {
                AbstractC0460mg.m3088c0(objArr, objArr, 1, 0, iM160i);
                Object[] objArr2 = this.f189i;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f188h;
                AbstractC0460mg.m3088c0(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f189i;
            int i6 = this.f188h;
            objArr3[i6] = null;
            this.f188h = m156e(i6);
        } else {
            int iM160i2 = m160i((mo152a() - 1) + i4);
            Object[] objArr4 = this.f189i;
            if (iM160i <= iM160i2) {
                AbstractC0460mg.m3088c0(objArr4, objArr4, iM160i, iM160i + 1, iM160i2 + 1);
            } else {
                AbstractC0460mg.m3088c0(objArr4, objArr4, iM160i, iM160i + 1, objArr4.length);
                Object[] objArr5 = this.f189i;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0460mg.m3088c0(objArr5, objArr5, 0, 1, iM160i2 + 1);
            }
            this.f189i[iM160i2] = null;
        }
        this.f190j--;
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m154c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f189i.length;
        while (i < length && it.hasNext()) {
            this.f189i[i] = it.next();
            i++;
        }
        int i2 = this.f188h;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f189i[i3] = it.next();
        }
        this.f190j = collection.size() + this.f190j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m161j();
            m159h(this.f188h, m160i(mo152a() + this.f188h));
        }
        this.f188h = 0;
        this.f190j = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m155d(int i) {
        if (i < 0) {
            C0676s.m4653l("Deque is too big.");
            return;
        }
        Object[] objArr = this.f189i;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f187k) {
            if (i < 10) {
                i = 10;
            }
            this.f189i = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC0460mg.m3088c0(objArr, objArr2, 0, this.f188h, objArr.length);
        Object[] objArr3 = this.f189i;
        int length2 = objArr3.length;
        int i3 = this.f188h;
        AbstractC0460mg.m3088c0(objArr3, objArr2, length2 - i3, 0, i3);
        this.f188h = 0;
        this.f189i = objArr2;
    }

    /* JADX INFO: renamed from: e */
    public final int m156e(int i) {
        this.f189i.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: f */
    public final Object m157f() {
        if (isEmpty()) {
            return null;
        }
        return this.f189i[m160i((size() - 1) + this.f188h)];
    }

    /* JADX INFO: renamed from: g */
    public final int m158g(int i) {
        return i < 0 ? i + this.f189i.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo152a = mo152a();
        if (i >= 0 && i < iMo152a) {
            return this.f189i[m160i(this.f188h + i)];
        }
        C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", iMo152a));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m159h(int i, int i2) {
        Object[] objArr = this.f189i;
        if (i < i2) {
            AbstractC0460mg.m3094i0(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            AbstractC0460mg.m3094i0(this.f189i, 0, i2);
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m160i(int i) {
        Object[] objArr = this.f189i;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM160i = m160i(mo152a() + this.f188h);
        int length = this.f188h;
        if (length < iM160i) {
            while (length < iM160i) {
                if (t11.m5086l(obj, this.f189i[length])) {
                    i = this.f188h;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f188h) < iM160i) {
            return -1;
        }
        int length2 = this.f189i.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM160i; i2++) {
                    if (t11.m5086l(obj, this.f189i[i2])) {
                        length = i2 + this.f189i.length;
                        i = this.f188h;
                    }
                }
                return -1;
            }
            if (t11.m5086l(obj, this.f189i[length])) {
                i = this.f188h;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo152a() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m161j() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            um2.m5519i("ArrayDeque is empty.");
            return null;
        }
        return this.f189i[m160i((size() - 1) + this.f188h)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM160i = m160i(this.f190j + this.f188h);
        int i2 = this.f188h;
        if (i2 < iM160i) {
            length = iM160i - 1;
            if (i2 <= length) {
                while (!t11.m5086l(obj, this.f189i[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f188h;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f188h >= iM160i) {
            while (true) {
                iM160i--;
                Object[] objArr = this.f189i;
                if (-1 >= iM160i) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.f188h;
                    if (i3 <= length) {
                        while (!t11.m5086l(obj, this.f189i[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f188h;
                    }
                } else if (t11.m5086l(obj, objArr[iM160i])) {
                    length = iM160i + this.f189i.length;
                    i = this.f188h;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo153b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM160i;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f189i.length != 0) {
            int iM160i2 = m160i(this.f190j + this.f188h);
            int i = this.f188h;
            if (i < iM160i2) {
                iM160i = i;
                while (true) {
                    objArr = this.f189i;
                    if (i >= iM160i2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f189i[iM160i] = obj;
                        iM160i++;
                    }
                    i++;
                }
                AbstractC0460mg.m3094i0(objArr, iM160i, iM160i2);
            } else {
                int length = this.f189i.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f189i;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f189i[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM160i = m160i(i2);
                for (int i3 = 0; i3 < iM160i2; i3++) {
                    Object[] objArr3 = this.f189i;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f189i[iM160i] = obj3;
                        iM160i = m156e(iM160i);
                    }
                }
                z = z2;
            }
            if (z) {
                m161j();
                this.f190j = m158g(iM160i - this.f188h);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            um2.m5519i("ArrayDeque is empty.");
            return null;
        }
        m161j();
        Object[] objArr = this.f189i;
        int i = this.f188h;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f188h = m156e(i);
        this.f190j = mo152a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            um2.m5519i("ArrayDeque is empty.");
            return null;
        }
        m161j();
        int iM160i = m160i((size() - 1) + this.f188h);
        Object[] objArr = this.f189i;
        Object obj = objArr[iM160i];
        objArr[iM160i] = null;
        this.f190j = mo152a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        sp0.m4963u(i, i2, this.f190j);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f190j) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo153b(i);
            return;
        }
        m161j();
        int i4 = this.f190j - i2;
        int i5 = this.f188h;
        if (i < i4) {
            int iM160i = m160i((i - 1) + i5);
            int iM160i2 = m160i(this.f188h + (i2 - 1));
            while (i > 0) {
                int i6 = iM160i + 1;
                int iMin = Math.min(i, Math.min(i6, iM160i2 + 1));
                Object[] objArr = this.f189i;
                int i7 = iM160i2 - iMin;
                int i8 = iM160i - iMin;
                AbstractC0460mg.m3088c0(objArr, objArr, i7 + 1, i8 + 1, i6);
                iM160i = m158g(i8);
                iM160i2 = m158g(i7);
                i -= iMin;
            }
            int iM160i3 = m160i(this.f188h + i3);
            m159h(this.f188h, iM160i3);
            this.f188h = iM160i3;
        } else {
            int iM160i4 = m160i(i5 + i2);
            int iM160i5 = m160i(this.f188h + i);
            int i9 = this.f190j;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f189i;
                i2 = Math.min(i9, Math.min(objArr2.length - iM160i4, objArr2.length - iM160i5));
                Object[] objArr3 = this.f189i;
                int i10 = iM160i4 + i2;
                AbstractC0460mg.m3088c0(objArr3, objArr3, iM160i5, iM160i4, i10);
                iM160i4 = m160i(i10);
                iM160i5 = m160i(iM160i5 + i2);
            }
            int iM160i6 = m160i(this.f190j + this.f188h);
            m159h(m158g(iM160i6 - i3), iM160i6);
        }
        this.f190j -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM160i;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f189i.length != 0) {
            int iM160i2 = m160i(this.f190j + this.f188h);
            int i = this.f188h;
            if (i < iM160i2) {
                iM160i = i;
                while (true) {
                    objArr = this.f189i;
                    if (i >= iM160i2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f189i[iM160i] = obj;
                        iM160i++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC0460mg.m3094i0(objArr, iM160i, iM160i2);
            } else {
                int length = this.f189i.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f189i;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f189i[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM160i = m160i(i2);
                for (int i3 = 0; i3 < iM160i2; i3++) {
                    Object[] objArr3 = this.f189i;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f189i[iM160i] = obj3;
                        iM160i = m156e(iM160i);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m161j();
                this.f190j = m158g(iM160i - this.f188h);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo152a = mo152a();
        if (i < 0 || i >= iMo152a) {
            C0676s.m4646d(vi0.m5689h("index: ", i, ", size: ", iMo152a));
            return null;
        }
        int iM160i = m160i(this.f188h + i);
        Object[] objArr = this.f189i;
        Object obj2 = objArr[iM160i];
        objArr[iM160i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f190j;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iM160i = m160i(this.f190j + this.f188h);
        int i2 = this.f188h;
        if (i2 < iM160i) {
            AbstractC0460mg.m3091f0(this.f189i, objArr, i2, iM160i, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f189i;
            AbstractC0460mg.m3088c0(objArr2, objArr, 0, this.f188h, objArr2.length);
            Object[] objArr3 = this.f189i;
            AbstractC0460mg.m3088c0(objArr3, objArr, objArr3.length - this.f188h, 0, iM160i);
        }
        int i3 = this.f190j;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo152a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        m161j();
        m155d(collection.size() + mo152a());
        m154c(m160i(mo152a() + this.f188h), collection);
        return true;
    }
}
