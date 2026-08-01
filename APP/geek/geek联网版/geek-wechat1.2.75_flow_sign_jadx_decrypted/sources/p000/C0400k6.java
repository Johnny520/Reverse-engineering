package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: k6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0400k6 extends AbstractList implements List {

    /* JADX INFO: renamed from: d */
    public static final Object[] f2785d = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f2786a;

    /* JADX INFO: renamed from: b */
    public Object[] f2787b = f2785d;

    /* JADX INFO: renamed from: c */
    public int f2788c;

    /* JADX INFO: renamed from: a */
    public final void m1650a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2787b.length;
        while (i < length && it.hasNext()) {
            this.f2787b[i] = it.next();
            i++;
        }
        int i2 = this.f2786a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f2787b[i3] = it.next();
        }
        this.f2788c = collection.size() + this.f2788c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int length2;
        int i2 = this.f2788c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            m1656g();
            m1651b(this.f2788c + 1);
            int length3 = this.f2786a;
            if (length3 == 0) {
                Object[] objArr = this.f2787b;
                AbstractC0493mp.m1857g("<this>", objArr);
                length3 = objArr.length;
            }
            int i3 = length3 - 1;
            this.f2786a = i3;
            this.f2787b[i3] = obj;
            this.f2788c++;
            return;
        }
        m1656g();
        m1651b(this.f2788c + 1);
        int iM1655f = m1655f(this.f2786a + i);
        int i4 = this.f2788c;
        if (i < ((i4 + 1) >> 1)) {
            if (iM1655f == 0) {
                Object[] objArr2 = this.f2787b;
                AbstractC0493mp.m1857g("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = iM1655f - 1;
            }
            int i5 = this.f2786a;
            if (i5 == 0) {
                Object[] objArr3 = this.f2787b;
                AbstractC0493mp.m1857g("<this>", objArr3);
                length2 = objArr3.length - 1;
            } else {
                length2 = i5 - 1;
            }
            int i6 = this.f2786a;
            if (length >= i6) {
                Object[] objArr4 = this.f2787b;
                objArr4[length2] = objArr4[i6];
                AbstractC0659r6.m2255f0(objArr4, objArr4, i6, i6 + 1, length + 1);
            } else {
                Object[] objArr5 = this.f2787b;
                AbstractC0659r6.m2255f0(objArr5, objArr5, i6 - 1, i6, objArr5.length);
                Object[] objArr6 = this.f2787b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0659r6.m2255f0(objArr6, objArr6, 0, 1, length + 1);
            }
            this.f2787b[length] = obj;
            this.f2786a = length2;
        } else {
            int iM1655f2 = m1655f(this.f2786a + i4);
            if (iM1655f < iM1655f2) {
                Object[] objArr7 = this.f2787b;
                AbstractC0659r6.m2255f0(objArr7, objArr7, iM1655f + 1, iM1655f, iM1655f2);
            } else {
                Object[] objArr8 = this.f2787b;
                AbstractC0659r6.m2255f0(objArr8, objArr8, 1, 0, iM1655f2);
                Object[] objArr9 = this.f2787b;
                objArr9[0] = objArr9[objArr9.length - 1];
                AbstractC0659r6.m2255f0(objArr9, objArr9, iM1655f + 1, iM1655f, objArr9.length - 1);
            }
            this.f2787b[iM1655f] = obj;
        }
        this.f2788c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC0493mp.m1857g("elements", collection);
        int i2 = this.f2788c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f2788c) {
            return addAll(collection);
        }
        m1656g();
        m1651b(collection.size() + this.f2788c);
        int iM1655f = m1655f(this.f2786a + this.f2788c);
        int iM1655f2 = m1655f(this.f2786a + i);
        int size = collection.size();
        if (i >= ((this.f2788c + 1) >> 1)) {
            int i3 = iM1655f2 + size;
            if (iM1655f2 < iM1655f) {
                int i4 = size + iM1655f;
                Object[] objArr = this.f2787b;
                if (i4 <= objArr.length) {
                    AbstractC0659r6.m2255f0(objArr, objArr, i3, iM1655f2, iM1655f);
                } else if (i3 >= objArr.length) {
                    AbstractC0659r6.m2255f0(objArr, objArr, i3 - objArr.length, iM1655f2, iM1655f);
                } else {
                    int length = iM1655f - (i4 - objArr.length);
                    AbstractC0659r6.m2255f0(objArr, objArr, 0, length, iM1655f);
                    Object[] objArr2 = this.f2787b;
                    AbstractC0659r6.m2255f0(objArr2, objArr2, i3, iM1655f2, length);
                }
            } else {
                Object[] objArr3 = this.f2787b;
                AbstractC0659r6.m2255f0(objArr3, objArr3, size, 0, iM1655f);
                Object[] objArr4 = this.f2787b;
                if (i3 >= objArr4.length) {
                    AbstractC0659r6.m2255f0(objArr4, objArr4, i3 - objArr4.length, iM1655f2, objArr4.length);
                } else {
                    AbstractC0659r6.m2255f0(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f2787b;
                    AbstractC0659r6.m2255f0(objArr5, objArr5, i3, iM1655f2, objArr5.length - size);
                }
            }
            m1650a(iM1655f2, collection);
            return true;
        }
        int i5 = this.f2786a;
        int length2 = i5 - size;
        if (iM1655f2 < i5) {
            Object[] objArr6 = this.f2787b;
            AbstractC0659r6.m2255f0(objArr6, objArr6, length2, i5, objArr6.length);
            if (size >= iM1655f2) {
                Object[] objArr7 = this.f2787b;
                AbstractC0659r6.m2255f0(objArr7, objArr7, objArr7.length - size, 0, iM1655f2);
            } else {
                Object[] objArr8 = this.f2787b;
                AbstractC0659r6.m2255f0(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f2787b;
                AbstractC0659r6.m2255f0(objArr9, objArr9, 0, size, iM1655f2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f2787b;
            AbstractC0659r6.m2255f0(objArr10, objArr10, length2, i5, iM1655f2);
        } else {
            Object[] objArr11 = this.f2787b;
            length2 += objArr11.length;
            int i6 = iM1655f2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                AbstractC0659r6.m2255f0(objArr11, objArr11, length2, i5, iM1655f2);
            } else {
                AbstractC0659r6.m2255f0(objArr11, objArr11, length2, i5, i5 + length3);
                Object[] objArr12 = this.f2787b;
                AbstractC0659r6.m2255f0(objArr12, objArr12, 0, this.f2786a + length3, iM1655f2);
            }
        }
        this.f2786a = length2;
        m1650a(m1653d(iM1655f2 - size), collection);
        return true;
    }

    public final void addLast(Object obj) {
        m1656g();
        m1651b(this.f2788c + 1);
        this.f2787b[m1655f(this.f2786a + this.f2788c)] = obj;
        this.f2788c++;
    }

    /* JADX INFO: renamed from: b */
    public final void m1651b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2787b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f2785d) {
            if (i < 10) {
                i = 10;
            }
            this.f2787b = new Object[i];
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
        AbstractC0659r6.m2255f0(objArr, objArr2, 0, this.f2786a, objArr.length);
        Object[] objArr3 = this.f2787b;
        int length2 = objArr3.length;
        int i3 = this.f2786a;
        AbstractC0659r6.m2255f0(objArr3, objArr2, length2 - i3, 0, i3);
        this.f2786a = 0;
        this.f2787b = objArr2;
    }

    /* JADX INFO: renamed from: c */
    public final int m1652c(int i) {
        AbstractC0493mp.m1857g("<this>", this.f2787b);
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m1656g();
            m1654e(this.f2786a, m1655f(this.f2786a + this.f2788c));
        }
        this.f2786a = 0;
        this.f2788c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m1653d(int i) {
        return i < 0 ? i + this.f2787b.length : i;
    }

    /* JADX INFO: renamed from: e */
    public final void m1654e(int i, int i2) {
        if (i < i2) {
            Object[] objArr = this.f2787b;
            AbstractC0493mp.m1857g("<this>", objArr);
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Object[] objArr2 = this.f2787b;
            Arrays.fill(objArr2, i, objArr2.length, (Object) null);
            Object[] objArr3 = this.f2787b;
            AbstractC0493mp.m1857g("<this>", objArr3);
            Arrays.fill(objArr3, 0, i2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m1655f(int i) {
        Object[] objArr = this.f2787b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: g */
    public final void m1656g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f2788c;
        if (i >= 0 && i < i2) {
            return this.f2787b[m1655f(this.f2786a + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM1655f = m1655f(this.f2786a + this.f2788c);
        int length = this.f2786a;
        if (length < iM1655f) {
            while (length < iM1655f) {
                if (AbstractC0493mp.m1853c(obj, this.f2787b[length])) {
                    i = this.f2786a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM1655f) {
            return -1;
        }
        int length2 = this.f2787b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM1655f; i2++) {
                    if (AbstractC0493mp.m1853c(obj, this.f2787b[i2])) {
                        length = i2 + this.f2787b.length;
                        i = this.f2786a;
                    }
                }
                return -1;
            }
            if (AbstractC0493mp.m1853c(obj, this.f2787b[length])) {
                i = this.f2786a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2788c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM1655f = m1655f(this.f2786a + this.f2788c);
        int i2 = this.f2786a;
        if (i2 < iM1655f) {
            length = iM1655f - 1;
            if (i2 <= length) {
                while (!AbstractC0493mp.m1853c(obj, this.f2787b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f2786a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iM1655f) {
            int i3 = iM1655f - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.f2787b;
                    AbstractC0493mp.m1857g("<this>", objArr);
                    length = objArr.length - 1;
                    int i4 = this.f2786a;
                    if (i4 <= length) {
                        while (!AbstractC0493mp.m1853c(obj, this.f2787b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f2786a;
                    }
                } else {
                    if (AbstractC0493mp.m1853c(obj, this.f2787b[i3])) {
                        length = i3 + this.f2787b.length;
                        i = this.f2786a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.f2788c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == size() - 1) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            m1656g();
            int iM1655f = m1655f((size() - 1) + this.f2786a);
            Object[] objArr = this.f2787b;
            Object obj = objArr[iM1655f];
            objArr[iM1655f] = null;
            this.f2788c--;
            return obj;
        }
        if (i == 0) {
            return removeFirst();
        }
        m1656g();
        int iM1655f2 = m1655f(this.f2786a + i);
        Object[] objArr2 = this.f2787b;
        Object obj2 = objArr2[iM1655f2];
        if (i < (this.f2788c >> 1)) {
            int i3 = this.f2786a;
            if (iM1655f2 >= i3) {
                AbstractC0659r6.m2255f0(objArr2, objArr2, i3 + 1, i3, iM1655f2);
            } else {
                AbstractC0659r6.m2255f0(objArr2, objArr2, 1, 0, iM1655f2);
                Object[] objArr3 = this.f2787b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.f2786a;
                AbstractC0659r6.m2255f0(objArr3, objArr3, i4 + 1, i4, objArr3.length - 1);
            }
            Object[] objArr4 = this.f2787b;
            int i5 = this.f2786a;
            objArr4[i5] = null;
            this.f2786a = m1652c(i5);
        } else {
            int iM1655f3 = m1655f((size() - 1) + this.f2786a);
            if (iM1655f2 <= iM1655f3) {
                Object[] objArr5 = this.f2787b;
                AbstractC0659r6.m2255f0(objArr5, objArr5, iM1655f2, iM1655f2 + 1, iM1655f3 + 1);
            } else {
                Object[] objArr6 = this.f2787b;
                AbstractC0659r6.m2255f0(objArr6, objArr6, iM1655f2, iM1655f2 + 1, objArr6.length);
                Object[] objArr7 = this.f2787b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC0659r6.m2255f0(objArr7, objArr7, 0, 1, iM1655f3 + 1);
            }
            this.f2787b[iM1655f3] = null;
        }
        this.f2788c--;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM1655f;
        AbstractC0493mp.m1857g("elements", collection);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f2787b.length != 0) {
            int iM1655f2 = m1655f(this.f2786a + this.f2788c);
            int i = this.f2786a;
            if (i < iM1655f2) {
                iM1655f = i;
                while (i < iM1655f2) {
                    Object obj = this.f2787b[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f2787b[iM1655f] = obj;
                        iM1655f++;
                    }
                    i++;
                }
                Object[] objArr = this.f2787b;
                AbstractC0493mp.m1857g("<this>", objArr);
                Arrays.fill(objArr, iM1655f, iM1655f2, (Object) null);
            } else {
                int length = this.f2787b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f2787b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f2787b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM1655f = m1655f(i2);
                for (int i3 = 0; i3 < iM1655f2; i3++) {
                    Object[] objArr3 = this.f2787b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f2787b[iM1655f] = obj3;
                        iM1655f = m1652c(iM1655f);
                    }
                }
                z = z2;
            }
            if (z) {
                m1656g();
                this.f2788c = m1653d(iM1655f - this.f2786a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m1656g();
        Object[] objArr = this.f2787b;
        int i = this.f2786a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f2786a = m1652c(i);
        this.f2788c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        g80.m1189d(i, i2, this.f2788c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f2788c) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        m1656g();
        if (i < this.f2788c - i2) {
            int iM1655f = m1655f((i - 1) + this.f2786a);
            int iM1655f2 = m1655f((i2 - 1) + this.f2786a);
            while (i > 0) {
                int i4 = iM1655f + 1;
                int iMin = Math.min(i, Math.min(i4, iM1655f2 + 1));
                Object[] objArr = this.f2787b;
                int i5 = iM1655f2 - iMin;
                int i6 = iM1655f - iMin;
                AbstractC0659r6.m2255f0(objArr, objArr, i5 + 1, i6 + 1, i4);
                iM1655f = m1653d(i6);
                iM1655f2 = m1653d(i5);
                i -= iMin;
            }
            int iM1655f3 = m1655f(this.f2786a + i3);
            m1654e(this.f2786a, iM1655f3);
            this.f2786a = iM1655f3;
        } else {
            int iM1655f4 = m1655f(this.f2786a + i2);
            int iM1655f5 = m1655f(this.f2786a + i);
            int i7 = this.f2788c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f2787b;
                i2 = Math.min(i7, Math.min(objArr2.length - iM1655f4, objArr2.length - iM1655f5));
                Object[] objArr3 = this.f2787b;
                int i8 = iM1655f4 + i2;
                AbstractC0659r6.m2255f0(objArr3, objArr3, iM1655f5, iM1655f4, i8);
                iM1655f4 = m1655f(i8);
                iM1655f5 = m1655f(iM1655f5 + i2);
            }
            int iM1655f6 = m1655f(this.f2786a + this.f2788c);
            m1654e(m1653d(iM1655f6 - i3), iM1655f6);
        }
        this.f2788c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM1655f;
        AbstractC0493mp.m1857g("elements", collection);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f2787b.length != 0) {
            int iM1655f2 = m1655f(this.f2786a + this.f2788c);
            int i = this.f2786a;
            if (i < iM1655f2) {
                iM1655f = i;
                while (i < iM1655f2) {
                    Object obj = this.f2787b[i];
                    if (collection.contains(obj)) {
                        this.f2787b[iM1655f] = obj;
                        iM1655f++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Object[] objArr = this.f2787b;
                AbstractC0493mp.m1857g("<this>", objArr);
                Arrays.fill(objArr, iM1655f, iM1655f2, (Object) null);
            } else {
                int length = this.f2787b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f2787b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f2787b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM1655f = m1655f(i2);
                for (int i3 = 0; i3 < iM1655f2; i3++) {
                    Object[] objArr3 = this.f2787b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f2787b[iM1655f] = obj3;
                        iM1655f = m1652c(iM1655f);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m1656g();
                this.f2788c = m1653d(iM1655f - this.f2786a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f2788c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int iM1655f = m1655f(this.f2786a + i);
        Object[] objArr = this.f2787b;
        Object obj2 = objArr[iM1655f];
        objArr[iM1655f] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2788c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f2788c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0493mp.m1857g("array", objArr);
        int length = objArr.length;
        int i = this.f2788c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            objArr = (Object[]) objNewInstance;
        }
        int iM1655f = m1655f(this.f2786a + this.f2788c);
        int i2 = this.f2786a;
        if (i2 < iM1655f) {
            AbstractC0659r6.m2255f0(this.f2787b, objArr, 0, i2, iM1655f);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2787b;
            AbstractC0659r6.m2255f0(objArr2, objArr, 0, this.f2786a, objArr2.length);
            Object[] objArr3 = this.f2787b;
            AbstractC0659r6.m2255f0(objArr3, objArr, objArr3.length - this.f2786a, 0, iM1655f);
        }
        int i3 = this.f2788c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0493mp.m1857g("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        m1656g();
        m1651b(collection.size() + this.f2788c);
        m1650a(m1655f(this.f2786a + this.f2788c), collection);
        return true;
    }
}
