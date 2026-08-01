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
    public static final Object[] f2703d = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f2704a;

    /* JADX INFO: renamed from: b */
    public Object[] f2705b = f2703d;

    /* JADX INFO: renamed from: c */
    public int f2706c;

    /* JADX INFO: renamed from: a */
    public final void m1625a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2705b.length;
        while (i < length && it.hasNext()) {
            this.f2705b[i] = it.next();
            i++;
        }
        int i2 = this.f2704a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f2705b[i3] = it.next();
        }
        this.f2706c = collection.size() + this.f2706c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int length2;
        int i2 = this.f2706c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            m1631g();
            m1626b(this.f2706c + 1);
            int length3 = this.f2704a;
            if (length3 == 0) {
                Object[] objArr = this.f2705b;
                AbstractC0346ip.m1503o("<this>", objArr);
                length3 = objArr.length;
            }
            int i3 = length3 - 1;
            this.f2704a = i3;
            this.f2705b[i3] = obj;
            this.f2706c++;
            return;
        }
        m1631g();
        m1626b(this.f2706c + 1);
        int iM1630f = m1630f(this.f2704a + i);
        int i4 = this.f2706c;
        if (i < ((i4 + 1) >> 1)) {
            if (iM1630f == 0) {
                Object[] objArr2 = this.f2705b;
                AbstractC0346ip.m1503o("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = iM1630f - 1;
            }
            int i5 = this.f2704a;
            if (i5 == 0) {
                Object[] objArr3 = this.f2705b;
                AbstractC0346ip.m1503o("<this>", objArr3);
                length2 = objArr3.length - 1;
            } else {
                length2 = i5 - 1;
            }
            int i6 = this.f2704a;
            if (length >= i6) {
                Object[] objArr4 = this.f2705b;
                objArr4[length2] = objArr4[i6];
                AbstractC0660r6.m2246b0(objArr4, objArr4, i6, i6 + 1, length + 1);
            } else {
                Object[] objArr5 = this.f2705b;
                AbstractC0660r6.m2246b0(objArr5, objArr5, i6 - 1, i6, objArr5.length);
                Object[] objArr6 = this.f2705b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0660r6.m2246b0(objArr6, objArr6, 0, 1, length + 1);
            }
            this.f2705b[length] = obj;
            this.f2704a = length2;
        } else {
            int iM1630f2 = m1630f(this.f2704a + i4);
            if (iM1630f < iM1630f2) {
                Object[] objArr7 = this.f2705b;
                AbstractC0660r6.m2246b0(objArr7, objArr7, iM1630f + 1, iM1630f, iM1630f2);
            } else {
                Object[] objArr8 = this.f2705b;
                AbstractC0660r6.m2246b0(objArr8, objArr8, 1, 0, iM1630f2);
                Object[] objArr9 = this.f2705b;
                objArr9[0] = objArr9[objArr9.length - 1];
                AbstractC0660r6.m2246b0(objArr9, objArr9, iM1630f + 1, iM1630f, objArr9.length - 1);
            }
            this.f2705b[iM1630f] = obj;
        }
        this.f2706c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC0346ip.m1503o("elements", collection);
        int i2 = this.f2706c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f2706c) {
            return addAll(collection);
        }
        m1631g();
        m1626b(collection.size() + this.f2706c);
        int iM1630f = m1630f(this.f2704a + this.f2706c);
        int iM1630f2 = m1630f(this.f2704a + i);
        int size = collection.size();
        if (i >= ((this.f2706c + 1) >> 1)) {
            int i3 = iM1630f2 + size;
            if (iM1630f2 < iM1630f) {
                int i4 = size + iM1630f;
                Object[] objArr = this.f2705b;
                if (i4 <= objArr.length) {
                    AbstractC0660r6.m2246b0(objArr, objArr, i3, iM1630f2, iM1630f);
                } else if (i3 >= objArr.length) {
                    AbstractC0660r6.m2246b0(objArr, objArr, i3 - objArr.length, iM1630f2, iM1630f);
                } else {
                    int length = iM1630f - (i4 - objArr.length);
                    AbstractC0660r6.m2246b0(objArr, objArr, 0, length, iM1630f);
                    Object[] objArr2 = this.f2705b;
                    AbstractC0660r6.m2246b0(objArr2, objArr2, i3, iM1630f2, length);
                }
            } else {
                Object[] objArr3 = this.f2705b;
                AbstractC0660r6.m2246b0(objArr3, objArr3, size, 0, iM1630f);
                Object[] objArr4 = this.f2705b;
                if (i3 >= objArr4.length) {
                    AbstractC0660r6.m2246b0(objArr4, objArr4, i3 - objArr4.length, iM1630f2, objArr4.length);
                } else {
                    AbstractC0660r6.m2246b0(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f2705b;
                    AbstractC0660r6.m2246b0(objArr5, objArr5, i3, iM1630f2, objArr5.length - size);
                }
            }
            m1625a(iM1630f2, collection);
            return true;
        }
        int i5 = this.f2704a;
        int length2 = i5 - size;
        if (iM1630f2 < i5) {
            Object[] objArr6 = this.f2705b;
            AbstractC0660r6.m2246b0(objArr6, objArr6, length2, i5, objArr6.length);
            if (size >= iM1630f2) {
                Object[] objArr7 = this.f2705b;
                AbstractC0660r6.m2246b0(objArr7, objArr7, objArr7.length - size, 0, iM1630f2);
            } else {
                Object[] objArr8 = this.f2705b;
                AbstractC0660r6.m2246b0(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f2705b;
                AbstractC0660r6.m2246b0(objArr9, objArr9, 0, size, iM1630f2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f2705b;
            AbstractC0660r6.m2246b0(objArr10, objArr10, length2, i5, iM1630f2);
        } else {
            Object[] objArr11 = this.f2705b;
            length2 += objArr11.length;
            int i6 = iM1630f2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                AbstractC0660r6.m2246b0(objArr11, objArr11, length2, i5, iM1630f2);
            } else {
                AbstractC0660r6.m2246b0(objArr11, objArr11, length2, i5, i5 + length3);
                Object[] objArr12 = this.f2705b;
                AbstractC0660r6.m2246b0(objArr12, objArr12, 0, this.f2704a + length3, iM1630f2);
            }
        }
        this.f2704a = length2;
        m1625a(m1628d(iM1630f2 - size), collection);
        return true;
    }

    public final void addLast(Object obj) {
        m1631g();
        m1626b(this.f2706c + 1);
        this.f2705b[m1630f(this.f2704a + this.f2706c)] = obj;
        this.f2706c++;
    }

    /* JADX INFO: renamed from: b */
    public final void m1626b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2705b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f2703d) {
            if (i < 10) {
                i = 10;
            }
            this.f2705b = new Object[i];
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
        AbstractC0660r6.m2246b0(objArr, objArr2, 0, this.f2704a, objArr.length);
        Object[] objArr3 = this.f2705b;
        int length2 = objArr3.length;
        int i3 = this.f2704a;
        AbstractC0660r6.m2246b0(objArr3, objArr2, length2 - i3, 0, i3);
        this.f2704a = 0;
        this.f2705b = objArr2;
    }

    /* JADX INFO: renamed from: c */
    public final int m1627c(int i) {
        AbstractC0346ip.m1503o("<this>", this.f2705b);
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m1631g();
            m1629e(this.f2704a, m1630f(this.f2704a + this.f2706c));
        }
        this.f2704a = 0;
        this.f2706c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m1628d(int i) {
        return i < 0 ? i + this.f2705b.length : i;
    }

    /* JADX INFO: renamed from: e */
    public final void m1629e(int i, int i2) {
        if (i < i2) {
            Object[] objArr = this.f2705b;
            AbstractC0346ip.m1503o("<this>", objArr);
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Object[] objArr2 = this.f2705b;
            Arrays.fill(objArr2, i, objArr2.length, (Object) null);
            Object[] objArr3 = this.f2705b;
            AbstractC0346ip.m1503o("<this>", objArr3);
            Arrays.fill(objArr3, 0, i2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m1630f(int i) {
        Object[] objArr = this.f2705b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: g */
    public final void m1631g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f2706c;
        if (i >= 0 && i < i2) {
            return this.f2705b[m1630f(this.f2704a + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM1630f = m1630f(this.f2704a + this.f2706c);
        int length = this.f2704a;
        if (length < iM1630f) {
            while (length < iM1630f) {
                if (AbstractC0346ip.m1497i(obj, this.f2705b[length])) {
                    i = this.f2704a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM1630f) {
            return -1;
        }
        int length2 = this.f2705b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM1630f; i2++) {
                    if (AbstractC0346ip.m1497i(obj, this.f2705b[i2])) {
                        length = i2 + this.f2705b.length;
                        i = this.f2704a;
                    }
                }
                return -1;
            }
            if (AbstractC0346ip.m1497i(obj, this.f2705b[length])) {
                i = this.f2704a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2706c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM1630f = m1630f(this.f2704a + this.f2706c);
        int i2 = this.f2704a;
        if (i2 < iM1630f) {
            length = iM1630f - 1;
            if (i2 <= length) {
                while (!AbstractC0346ip.m1497i(obj, this.f2705b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f2704a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iM1630f) {
            int i3 = iM1630f - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.f2705b;
                    AbstractC0346ip.m1503o("<this>", objArr);
                    length = objArr.length - 1;
                    int i4 = this.f2704a;
                    if (i4 <= length) {
                        while (!AbstractC0346ip.m1497i(obj, this.f2705b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f2704a;
                    }
                } else {
                    if (AbstractC0346ip.m1497i(obj, this.f2705b[i3])) {
                        length = i3 + this.f2705b.length;
                        i = this.f2704a;
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
        int i2 = this.f2706c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == size() - 1) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            m1631g();
            int iM1630f = m1630f((size() - 1) + this.f2704a);
            Object[] objArr = this.f2705b;
            Object obj = objArr[iM1630f];
            objArr[iM1630f] = null;
            this.f2706c--;
            return obj;
        }
        if (i == 0) {
            return removeFirst();
        }
        m1631g();
        int iM1630f2 = m1630f(this.f2704a + i);
        Object[] objArr2 = this.f2705b;
        Object obj2 = objArr2[iM1630f2];
        if (i < (this.f2706c >> 1)) {
            int i3 = this.f2704a;
            if (iM1630f2 >= i3) {
                AbstractC0660r6.m2246b0(objArr2, objArr2, i3 + 1, i3, iM1630f2);
            } else {
                AbstractC0660r6.m2246b0(objArr2, objArr2, 1, 0, iM1630f2);
                Object[] objArr3 = this.f2705b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.f2704a;
                AbstractC0660r6.m2246b0(objArr3, objArr3, i4 + 1, i4, objArr3.length - 1);
            }
            Object[] objArr4 = this.f2705b;
            int i5 = this.f2704a;
            objArr4[i5] = null;
            this.f2704a = m1627c(i5);
        } else {
            int iM1630f3 = m1630f((size() - 1) + this.f2704a);
            if (iM1630f2 <= iM1630f3) {
                Object[] objArr5 = this.f2705b;
                AbstractC0660r6.m2246b0(objArr5, objArr5, iM1630f2, iM1630f2 + 1, iM1630f3 + 1);
            } else {
                Object[] objArr6 = this.f2705b;
                AbstractC0660r6.m2246b0(objArr6, objArr6, iM1630f2, iM1630f2 + 1, objArr6.length);
                Object[] objArr7 = this.f2705b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC0660r6.m2246b0(objArr7, objArr7, 0, 1, iM1630f3 + 1);
            }
            this.f2705b[iM1630f3] = null;
        }
        this.f2706c--;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM1630f;
        AbstractC0346ip.m1503o("elements", collection);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f2705b.length != 0) {
            int iM1630f2 = m1630f(this.f2704a + this.f2706c);
            int i = this.f2704a;
            if (i < iM1630f2) {
                iM1630f = i;
                while (i < iM1630f2) {
                    Object obj = this.f2705b[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f2705b[iM1630f] = obj;
                        iM1630f++;
                    }
                    i++;
                }
                Object[] objArr = this.f2705b;
                AbstractC0346ip.m1503o("<this>", objArr);
                Arrays.fill(objArr, iM1630f, iM1630f2, (Object) null);
            } else {
                int length = this.f2705b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f2705b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f2705b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM1630f = m1630f(i2);
                for (int i3 = 0; i3 < iM1630f2; i3++) {
                    Object[] objArr3 = this.f2705b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f2705b[iM1630f] = obj3;
                        iM1630f = m1627c(iM1630f);
                    }
                }
                z = z2;
            }
            if (z) {
                m1631g();
                this.f2706c = m1628d(iM1630f - this.f2704a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m1631g();
        Object[] objArr = this.f2705b;
        int i = this.f2704a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f2704a = m1627c(i);
        this.f2706c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a80.m40d(i, i2, this.f2706c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f2706c) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        m1631g();
        if (i < this.f2706c - i2) {
            int iM1630f = m1630f((i - 1) + this.f2704a);
            int iM1630f2 = m1630f((i2 - 1) + this.f2704a);
            while (i > 0) {
                int i4 = iM1630f + 1;
                int iMin = Math.min(i, Math.min(i4, iM1630f2 + 1));
                Object[] objArr = this.f2705b;
                int i5 = iM1630f2 - iMin;
                int i6 = iM1630f - iMin;
                AbstractC0660r6.m2246b0(objArr, objArr, i5 + 1, i6 + 1, i4);
                iM1630f = m1628d(i6);
                iM1630f2 = m1628d(i5);
                i -= iMin;
            }
            int iM1630f3 = m1630f(this.f2704a + i3);
            m1629e(this.f2704a, iM1630f3);
            this.f2704a = iM1630f3;
        } else {
            int iM1630f4 = m1630f(this.f2704a + i2);
            int iM1630f5 = m1630f(this.f2704a + i);
            int i7 = this.f2706c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f2705b;
                i2 = Math.min(i7, Math.min(objArr2.length - iM1630f4, objArr2.length - iM1630f5));
                Object[] objArr3 = this.f2705b;
                int i8 = iM1630f4 + i2;
                AbstractC0660r6.m2246b0(objArr3, objArr3, iM1630f5, iM1630f4, i8);
                iM1630f4 = m1630f(i8);
                iM1630f5 = m1630f(iM1630f5 + i2);
            }
            int iM1630f6 = m1630f(this.f2704a + this.f2706c);
            m1629e(m1628d(iM1630f6 - i3), iM1630f6);
        }
        this.f2706c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM1630f;
        AbstractC0346ip.m1503o("elements", collection);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f2705b.length != 0) {
            int iM1630f2 = m1630f(this.f2704a + this.f2706c);
            int i = this.f2704a;
            if (i < iM1630f2) {
                iM1630f = i;
                while (i < iM1630f2) {
                    Object obj = this.f2705b[i];
                    if (collection.contains(obj)) {
                        this.f2705b[iM1630f] = obj;
                        iM1630f++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Object[] objArr = this.f2705b;
                AbstractC0346ip.m1503o("<this>", objArr);
                Arrays.fill(objArr, iM1630f, iM1630f2, (Object) null);
            } else {
                int length = this.f2705b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f2705b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f2705b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM1630f = m1630f(i2);
                for (int i3 = 0; i3 < iM1630f2; i3++) {
                    Object[] objArr3 = this.f2705b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f2705b[iM1630f] = obj3;
                        iM1630f = m1627c(iM1630f);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m1631g();
                this.f2706c = m1628d(iM1630f - this.f2704a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f2706c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int iM1630f = m1630f(this.f2704a + i);
        Object[] objArr = this.f2705b;
        Object obj2 = objArr[iM1630f];
        objArr[iM1630f] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2706c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f2706c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0346ip.m1503o("array", objArr);
        int length = objArr.length;
        int i = this.f2706c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            objArr = (Object[]) objNewInstance;
        }
        int iM1630f = m1630f(this.f2704a + this.f2706c);
        int i2 = this.f2704a;
        if (i2 < iM1630f) {
            AbstractC0660r6.m2246b0(this.f2705b, objArr, 0, i2, iM1630f);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2705b;
            AbstractC0660r6.m2246b0(objArr2, objArr, 0, this.f2704a, objArr2.length);
            Object[] objArr3 = this.f2705b;
            AbstractC0660r6.m2246b0(objArr3, objArr, objArr3.length - this.f2704a, 0, iM1630f);
        }
        int i3 = this.f2706c;
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
        AbstractC0346ip.m1503o("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        m1631g();
        m1626b(collection.size() + this.f2706c);
        m1625a(m1630f(this.f2704a + this.f2706c), collection);
        return true;
    }
}
