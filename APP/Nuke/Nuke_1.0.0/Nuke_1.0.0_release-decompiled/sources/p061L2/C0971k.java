package p061L2;

import com.bumptech.glide.AbstractC1925g;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: L2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0971k extends AbstractC0967g {

    /* JADX INFO: renamed from: g */
    public static final Object[] f3040g = new Object[0];

    /* JADX INFO: renamed from: d */
    public int f3041d;

    /* JADX INFO: renamed from: e */
    public Object[] f3042e = f3040g;

    /* JADX INFO: renamed from: f */
    public int f3043f;

    @Override // p061L2.AbstractC0967g
    /* JADX INFO: renamed from: a */
    public final int mo1976a() {
        return this.f3043f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int length;
        int i6 = this.f3043f;
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        if (i5 == i6) {
            addLast(obj);
            return;
        }
        if (i5 == 0) {
            addFirst(obj);
            return;
        }
        m1986j();
        m1980d(this.f3043f + 1);
        int iM1985i = m1985i(this.f3041d + i5);
        int i7 = this.f3043f;
        if (i5 < ((i7 + 1) >> 1)) {
            if (iM1985i == 0) {
                Object[] objArr = this.f3042e;
                AbstractC1665j.m2985e(objArr, "<this>");
                iM1985i = objArr.length;
            }
            int i8 = iM1985i - 1;
            int i9 = this.f3041d;
            if (i9 == 0) {
                Object[] objArr2 = this.f3042e;
                AbstractC1665j.m2985e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i9 - 1;
            }
            int i10 = this.f3041d;
            if (i8 >= i10) {
                Object[] objArr3 = this.f3042e;
                objArr3[length] = objArr3[i10];
                AbstractC0972l.m1993Q(objArr3, objArr3, i10, i10 + 1, i8 + 1);
            } else {
                Object[] objArr4 = this.f3042e;
                AbstractC0972l.m1993Q(objArr4, objArr4, i10 - 1, i10, objArr4.length);
                Object[] objArr5 = this.f3042e;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0972l.m1993Q(objArr5, objArr5, 0, 1, i8 + 1);
            }
            this.f3042e[i8] = obj;
            this.f3041d = length;
        } else {
            int iM1985i2 = m1985i(i7 + this.f3041d);
            if (iM1985i < iM1985i2) {
                Object[] objArr6 = this.f3042e;
                AbstractC0972l.m1993Q(objArr6, objArr6, iM1985i + 1, iM1985i, iM1985i2);
            } else {
                Object[] objArr7 = this.f3042e;
                AbstractC0972l.m1993Q(objArr7, objArr7, 1, 0, iM1985i2);
                Object[] objArr8 = this.f3042e;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC0972l.m1993Q(objArr8, objArr8, iM1985i + 1, iM1985i, objArr8.length - 1);
            }
            this.f3042e[iM1985i] = obj;
        }
        this.f3043f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        int i6 = this.f3043f;
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i5 == this.f3043f) {
            return addAll(collection);
        }
        m1986j();
        m1980d(collection.size() + this.f3043f);
        int iM1985i = m1985i(this.f3043f + this.f3041d);
        int iM1985i2 = m1985i(this.f3041d + i5);
        int size = collection.size();
        if (i5 >= ((this.f3043f + 1) >> 1)) {
            int i7 = iM1985i2 + size;
            if (iM1985i2 < iM1985i) {
                int i8 = size + iM1985i;
                Object[] objArr = this.f3042e;
                if (i8 <= objArr.length) {
                    AbstractC0972l.m1993Q(objArr, objArr, i7, iM1985i2, iM1985i);
                } else if (i7 >= objArr.length) {
                    AbstractC0972l.m1993Q(objArr, objArr, i7 - objArr.length, iM1985i2, iM1985i);
                } else {
                    int length = iM1985i - (i8 - objArr.length);
                    AbstractC0972l.m1993Q(objArr, objArr, 0, length, iM1985i);
                    Object[] objArr2 = this.f3042e;
                    AbstractC0972l.m1993Q(objArr2, objArr2, i7, iM1985i2, length);
                }
            } else {
                Object[] objArr3 = this.f3042e;
                AbstractC0972l.m1993Q(objArr3, objArr3, size, 0, iM1985i);
                Object[] objArr4 = this.f3042e;
                if (i7 >= objArr4.length) {
                    AbstractC0972l.m1993Q(objArr4, objArr4, i7 - objArr4.length, iM1985i2, objArr4.length);
                } else {
                    AbstractC0972l.m1993Q(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f3042e;
                    AbstractC0972l.m1993Q(objArr5, objArr5, i7, iM1985i2, objArr5.length - size);
                }
            }
            m1979c(iM1985i2, collection);
            return true;
        }
        int i9 = this.f3041d;
        int length2 = i9 - size;
        if (iM1985i2 < i9) {
            Object[] objArr6 = this.f3042e;
            AbstractC0972l.m1993Q(objArr6, objArr6, length2, i9, objArr6.length);
            if (size >= iM1985i2) {
                Object[] objArr7 = this.f3042e;
                AbstractC0972l.m1993Q(objArr7, objArr7, objArr7.length - size, 0, iM1985i2);
            } else {
                Object[] objArr8 = this.f3042e;
                AbstractC0972l.m1993Q(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f3042e;
                AbstractC0972l.m1993Q(objArr9, objArr9, 0, size, iM1985i2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f3042e;
            AbstractC0972l.m1993Q(objArr10, objArr10, length2, i9, iM1985i2);
        } else {
            Object[] objArr11 = this.f3042e;
            length2 += objArr11.length;
            int i10 = iM1985i2 - i9;
            int length3 = objArr11.length - length2;
            if (length3 >= i10) {
                AbstractC0972l.m1993Q(objArr11, objArr11, length2, i9, iM1985i2);
            } else {
                AbstractC0972l.m1993Q(objArr11, objArr11, length2, i9, i9 + length3);
                Object[] objArr12 = this.f3042e;
                AbstractC0972l.m1993Q(objArr12, objArr12, 0, this.f3041d + length3, iM1985i2);
            }
        }
        this.f3041d = length2;
        m1979c(m1983g(iM1985i2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m1986j();
        m1980d(this.f3043f + 1);
        int length = this.f3041d;
        if (length == 0) {
            Object[] objArr = this.f3042e;
            AbstractC1665j.m2985e(objArr, "<this>");
            length = objArr.length;
        }
        int i5 = length - 1;
        this.f3041d = i5;
        this.f3042e[i5] = obj;
        this.f3043f++;
    }

    public final void addLast(Object obj) {
        m1986j();
        m1980d(mo1976a() + 1);
        this.f3042e[m1985i(mo1976a() + this.f3041d)] = obj;
        this.f3043f = mo1976a() + 1;
    }

    @Override // p061L2.AbstractC0967g
    /* JADX INFO: renamed from: b */
    public final Object mo1977b(int i5) {
        int i6 = this.f3043f;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", i6));
        }
        if (i5 == AbstractC2352g.m4208u(this)) {
            return removeLast();
        }
        if (i5 == 0) {
            return removeFirst();
        }
        m1986j();
        int iM1985i = m1985i(this.f3041d + i5);
        Object[] objArr = this.f3042e;
        Object obj = objArr[iM1985i];
        if (i5 < (this.f3043f >> 1)) {
            int i7 = this.f3041d;
            if (iM1985i >= i7) {
                AbstractC0972l.m1993Q(objArr, objArr, i7 + 1, i7, iM1985i);
            } else {
                AbstractC0972l.m1993Q(objArr, objArr, 1, 0, iM1985i);
                Object[] objArr2 = this.f3042e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i8 = this.f3041d;
                AbstractC0972l.m1993Q(objArr2, objArr2, i8 + 1, i8, objArr2.length - 1);
            }
            Object[] objArr3 = this.f3042e;
            int i9 = this.f3041d;
            objArr3[i9] = null;
            this.f3041d = m1981e(i9);
        } else {
            int iM1985i2 = m1985i(AbstractC2352g.m4208u(this) + this.f3041d);
            if (iM1985i <= iM1985i2) {
                Object[] objArr4 = this.f3042e;
                AbstractC0972l.m1993Q(objArr4, objArr4, iM1985i, iM1985i + 1, iM1985i2 + 1);
            } else {
                Object[] objArr5 = this.f3042e;
                AbstractC0972l.m1993Q(objArr5, objArr5, iM1985i, iM1985i + 1, objArr5.length);
                Object[] objArr6 = this.f3042e;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0972l.m1993Q(objArr6, objArr6, 0, 1, iM1985i2 + 1);
            }
            this.f3042e[iM1985i2] = null;
        }
        this.f3043f--;
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m1979c(int i5, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f3042e.length;
        while (i5 < length && it.hasNext()) {
            this.f3042e[i5] = it.next();
            i5++;
        }
        int i6 = this.f3041d;
        for (int i7 = 0; i7 < i6 && it.hasNext(); i7++) {
            this.f3042e[i7] = it.next();
        }
        this.f3043f = collection.size() + this.f3043f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m1986j();
            m1984h(this.f3041d, m1985i(mo1976a() + this.f3041d));
        }
        this.f3041d = 0;
        this.f3043f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m1980d(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f3042e;
        if (i5 <= objArr.length) {
            return;
        }
        if (objArr == f3040g) {
            if (i5 < 10) {
                i5 = 10;
            }
            this.f3042e = new Object[i5];
            return;
        }
        int length = objArr.length;
        int i6 = length + (length >> 1);
        if (i6 - i5 < 0) {
            i6 = i5;
        }
        if (i6 - 2147483639 > 0) {
            i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i6];
        AbstractC0972l.m1993Q(objArr, objArr2, 0, this.f3041d, objArr.length);
        Object[] objArr3 = this.f3042e;
        int length2 = objArr3.length;
        int i7 = this.f3041d;
        AbstractC0972l.m1993Q(objArr3, objArr2, length2 - i7, 0, i7);
        this.f3041d = 0;
        this.f3042e = objArr2;
    }

    /* JADX INFO: renamed from: e */
    public final int m1981e(int i5) {
        AbstractC1665j.m2985e(this.f3042e, "<this>");
        if (i5 == r0.length - 1) {
            return 0;
        }
        return i5 + 1;
    }

    /* JADX INFO: renamed from: f */
    public final Object m1982f() {
        if (isEmpty()) {
            return null;
        }
        return this.f3042e[m1985i(AbstractC2352g.m4208u(this) + this.f3041d)];
    }

    /* JADX INFO: renamed from: g */
    public final int m1983g(int i5) {
        return i5 < 0 ? i5 + this.f3042e.length : i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        int iMo1976a = mo1976a();
        if (i5 < 0 || i5 >= iMo1976a) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", iMo1976a));
        }
        return this.f3042e[m1985i(this.f3041d + i5)];
    }

    /* JADX INFO: renamed from: h */
    public final void m1984h(int i5, int i6) {
        if (i5 < i6) {
            AbstractC0972l.m1998V(this.f3042e, i5, i6);
            return;
        }
        Object[] objArr = this.f3042e;
        AbstractC0972l.m1998V(objArr, i5, objArr.length);
        AbstractC0972l.m1998V(this.f3042e, 0, i6);
    }

    /* JADX INFO: renamed from: i */
    public final int m1985i(int i5) {
        Object[] objArr = this.f3042e;
        return i5 >= objArr.length ? i5 - objArr.length : i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i5;
        int iM1985i = m1985i(mo1976a() + this.f3041d);
        int length = this.f3041d;
        if (length < iM1985i) {
            while (length < iM1985i) {
                if (AbstractC1665j.m2981a(obj, this.f3042e[length])) {
                    i5 = this.f3041d;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f3041d) < iM1985i) {
            return -1;
        }
        int length2 = this.f3042e.length;
        while (true) {
            if (length >= length2) {
                for (int i6 = 0; i6 < iM1985i; i6++) {
                    if (AbstractC1665j.m2981a(obj, this.f3042e[i6])) {
                        length = i6 + this.f3042e.length;
                        i5 = this.f3041d;
                    }
                }
                return -1;
            }
            if (AbstractC1665j.m2981a(obj, this.f3042e[length])) {
                i5 = this.f3041d;
                break;
            }
            length++;
        }
        return length - i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo1976a() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m1986j() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f3042e[m1985i(AbstractC2352g.m4208u(this) + this.f3041d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i5;
        int iM1985i = m1985i(this.f3043f + this.f3041d);
        int i6 = this.f3041d;
        if (i6 < iM1985i) {
            length = iM1985i - 1;
            if (i6 <= length) {
                while (!AbstractC1665j.m2981a(obj, this.f3042e[length])) {
                    if (length != i6) {
                        length--;
                    }
                }
                i5 = this.f3041d;
                return length - i5;
            }
            return -1;
        }
        if (!isEmpty() && this.f3041d >= iM1985i) {
            int i7 = iM1985i - 1;
            while (true) {
                if (-1 >= i7) {
                    Object[] objArr = this.f3042e;
                    AbstractC1665j.m2985e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i8 = this.f3041d;
                    if (i8 <= length) {
                        while (!AbstractC1665j.m2981a(obj, this.f3042e[length])) {
                            if (length != i8) {
                                length--;
                            }
                        }
                        i5 = this.f3041d;
                    }
                } else {
                    if (AbstractC1665j.m2981a(obj, this.f3042e[i7])) {
                        length = i7 + this.f3042e.length;
                        i5 = this.f3041d;
                        break;
                    }
                    i7--;
                }
            }
            return length - i5;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo1977b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM1985i;
        AbstractC1665j.m2985e(collection, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f3042e.length != 0) {
            int iM1985i2 = m1985i(this.f3043f + this.f3041d);
            int i5 = this.f3041d;
            if (i5 < iM1985i2) {
                iM1985i = i5;
                while (i5 < iM1985i2) {
                    Object obj = this.f3042e[i5];
                    if (collection.contains(obj)) {
                        z5 = true;
                    } else {
                        this.f3042e[iM1985i] = obj;
                        iM1985i++;
                    }
                    i5++;
                }
                AbstractC0972l.m1998V(this.f3042e, iM1985i, iM1985i2);
            } else {
                int length = this.f3042e.length;
                boolean z6 = false;
                int i6 = i5;
                while (i5 < length) {
                    Object[] objArr = this.f3042e;
                    Object obj2 = objArr[i5];
                    objArr[i5] = null;
                    if (collection.contains(obj2)) {
                        z6 = true;
                    } else {
                        this.f3042e[i6] = obj2;
                        i6++;
                    }
                    i5++;
                }
                iM1985i = m1985i(i6);
                for (int i7 = 0; i7 < iM1985i2; i7++) {
                    Object[] objArr2 = this.f3042e;
                    Object obj3 = objArr2[i7];
                    objArr2[i7] = null;
                    if (collection.contains(obj3)) {
                        z6 = true;
                    } else {
                        this.f3042e[iM1985i] = obj3;
                        iM1985i = m1981e(iM1985i);
                    }
                }
                z5 = z6;
            }
            if (z5) {
                m1986j();
                this.f3043f = m1983g(iM1985i - this.f3041d);
            }
        }
        return z5;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m1986j();
        Object[] objArr = this.f3042e;
        int i5 = this.f3041d;
        Object obj = objArr[i5];
        objArr[i5] = null;
        this.f3041d = m1981e(i5);
        this.f3043f = mo1976a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m1986j();
        int iM1985i = m1985i(AbstractC2352g.m4208u(this) + this.f3041d);
        Object[] objArr = this.f3042e;
        Object obj = objArr[iM1985i];
        objArr[iM1985i] = null;
        this.f3043f = mo1976a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i6) {
        AbstractC1925g.m3532i(i5, i6, this.f3043f);
        int i7 = i6 - i5;
        if (i7 == 0) {
            return;
        }
        if (i7 == this.f3043f) {
            clear();
            return;
        }
        if (i7 == 1) {
            mo1977b(i5);
            return;
        }
        m1986j();
        if (i5 < this.f3043f - i6) {
            int iM1985i = m1985i(this.f3041d + (i5 - 1));
            int iM1985i2 = m1985i(this.f3041d + (i6 - 1));
            while (i5 > 0) {
                int i8 = iM1985i + 1;
                int iMin = Math.min(i5, Math.min(i8, iM1985i2 + 1));
                Object[] objArr = this.f3042e;
                int i9 = iM1985i2 - iMin;
                int i10 = iM1985i - iMin;
                AbstractC0972l.m1993Q(objArr, objArr, i9 + 1, i10 + 1, i8);
                iM1985i = m1983g(i10);
                iM1985i2 = m1983g(i9);
                i5 -= iMin;
            }
            int iM1985i3 = m1985i(this.f3041d + i7);
            m1984h(this.f3041d, iM1985i3);
            this.f3041d = iM1985i3;
        } else {
            int iM1985i4 = m1985i(this.f3041d + i6);
            int iM1985i5 = m1985i(this.f3041d + i5);
            int i11 = this.f3043f;
            while (true) {
                i11 -= i6;
                if (i11 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f3042e;
                i6 = Math.min(i11, Math.min(objArr2.length - iM1985i4, objArr2.length - iM1985i5));
                Object[] objArr3 = this.f3042e;
                int i12 = iM1985i4 + i6;
                AbstractC0972l.m1993Q(objArr3, objArr3, iM1985i5, iM1985i4, i12);
                iM1985i4 = m1985i(i12);
                iM1985i5 = m1985i(iM1985i5 + i6);
            }
            int iM1985i6 = m1985i(this.f3043f + this.f3041d);
            m1984h(m1983g(iM1985i6 - i7), iM1985i6);
        }
        this.f3043f -= i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM1985i;
        AbstractC1665j.m2985e(collection, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f3042e.length != 0) {
            int iM1985i2 = m1985i(this.f3043f + this.f3041d);
            int i5 = this.f3041d;
            if (i5 < iM1985i2) {
                iM1985i = i5;
                while (i5 < iM1985i2) {
                    Object obj = this.f3042e[i5];
                    if (collection.contains(obj)) {
                        this.f3042e[iM1985i] = obj;
                        iM1985i++;
                    } else {
                        z5 = true;
                    }
                    i5++;
                }
                AbstractC0972l.m1998V(this.f3042e, iM1985i, iM1985i2);
            } else {
                int length = this.f3042e.length;
                boolean z6 = false;
                int i6 = i5;
                while (i5 < length) {
                    Object[] objArr = this.f3042e;
                    Object obj2 = objArr[i5];
                    objArr[i5] = null;
                    if (collection.contains(obj2)) {
                        this.f3042e[i6] = obj2;
                        i6++;
                    } else {
                        z6 = true;
                    }
                    i5++;
                }
                iM1985i = m1985i(i6);
                for (int i7 = 0; i7 < iM1985i2; i7++) {
                    Object[] objArr2 = this.f3042e;
                    Object obj3 = objArr2[i7];
                    objArr2[i7] = null;
                    if (collection.contains(obj3)) {
                        this.f3042e[iM1985i] = obj3;
                        iM1985i = m1981e(iM1985i);
                    } else {
                        z6 = true;
                    }
                }
                z5 = z6;
            }
            if (z5) {
                m1986j();
                this.f3043f = m1983g(iM1985i - this.f3041d);
            }
        }
        return z5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        int iMo1976a = mo1976a();
        if (i5 < 0 || i5 >= iMo1976a) {
            throw new IndexOutOfBoundsException(AbstractC0231b.m399j("index: ", i5, ", size: ", iMo1976a));
        }
        int iM1985i = m1985i(this.f3041d + i5);
        Object[] objArr = this.f3042e;
        Object obj2 = objArr[iM1985i];
        objArr[iM1985i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo1976a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "array");
        int length = objArr.length;
        int i5 = this.f3043f;
        if (length < i5) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i5);
            AbstractC1665j.m2983c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM1985i = m1985i(this.f3043f + this.f3041d);
        int i6 = this.f3041d;
        if (i6 < iM1985i) {
            AbstractC0972l.m1995S(this.f3042e, objArr, i6, iM1985i, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f3042e;
            AbstractC0972l.m1993Q(objArr2, objArr, 0, this.f3041d, objArr2.length);
            Object[] objArr3 = this.f3042e;
            AbstractC0972l.m1993Q(objArr3, objArr, objArr3.length - this.f3041d, 0, iM1985i);
        }
        int i7 = this.f3043f;
        if (i7 < objArr.length) {
            objArr[i7] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m1986j();
        m1980d(collection.size() + mo1976a());
        m1979c(m1985i(mo1976a() + this.f3041d), collection);
        return true;
    }
}
