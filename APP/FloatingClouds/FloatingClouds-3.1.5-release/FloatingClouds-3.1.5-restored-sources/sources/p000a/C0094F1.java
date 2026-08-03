package p000a;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p000a.AbstractC0887w;

/* JADX INFO: renamed from: a.F1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0094F1<E> extends AbstractC0906x<E> {

    /* JADX INFO: renamed from: d */
    public static final Object[] f302d = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f303a;

    /* JADX INFO: renamed from: b */
    public Object[] f304b = f302d;

    /* JADX INFO: renamed from: c */
    public int f305c;

    /* JADX INFO: renamed from: a */
    public final void m248a(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f304b.length;
        while (i < length && it.hasNext()) {
            this.f304b[i] = it.next();
            i++;
        }
        int i2 = this.f303a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f304b[i3] = it.next();
        }
        this.f305c = collection.size() + this.f305c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int length;
        int i2 = this.f305c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == i2) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        m254g();
        m249b(this.f305c + 1);
        int iM253f = m253f(this.f303a + i);
        int i3 = this.f305c;
        if (i < ((i3 + 1) >> 1)) {
            if (iM253f == 0) {
                Object[] objArr = this.f304b;
                C0631i9.m1482e(objArr, "<this>");
                iM253f = objArr.length;
            }
            int i4 = iM253f - 1;
            int i5 = this.f303a;
            if (i5 == 0) {
                Object[] objArr2 = this.f304b;
                C0631i9.m1482e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.f303a;
            if (i4 >= i6) {
                Object[] objArr3 = this.f304b;
                objArr3[length] = objArr3[i6];
                C0889w1.m2149h(objArr3, objArr3, i6, i6 + 1, i4 + 1);
            } else {
                Object[] objArr4 = this.f304b;
                C0889w1.m2149h(objArr4, objArr4, i6 - 1, i6, objArr4.length);
                Object[] objArr5 = this.f304b;
                objArr5[objArr5.length - 1] = objArr5[0];
                C0889w1.m2149h(objArr5, objArr5, 0, 1, i4 + 1);
            }
            this.f304b[i4] = e;
            this.f303a = length;
        } else {
            int iM253f2 = m253f(this.f303a + i3);
            if (iM253f < iM253f2) {
                Object[] objArr6 = this.f304b;
                C0889w1.m2149h(objArr6, objArr6, iM253f + 1, iM253f, iM253f2);
            } else {
                Object[] objArr7 = this.f304b;
                C0889w1.m2149h(objArr7, objArr7, 1, 0, iM253f2);
                Object[] objArr8 = this.f304b;
                objArr8[0] = objArr8[objArr8.length - 1];
                C0889w1.m2149h(objArr8, objArr8, iM253f + 1, iM253f, objArr8.length - 1);
            }
            this.f304b[iM253f] = e;
        }
        this.f305c++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        C0631i9.m1482e(collection, "elements");
        int i2 = this.f305c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f305c) {
            return addAll(collection);
        }
        m254g();
        m249b(collection.size() + this.f305c);
        int iM253f = m253f(this.f303a + this.f305c);
        int iM253f2 = m253f(this.f303a + i);
        int size = collection.size();
        if (i >= ((this.f305c + 1) >> 1)) {
            int i3 = iM253f2 + size;
            if (iM253f2 < iM253f) {
                int i4 = size + iM253f;
                Object[] objArr = this.f304b;
                if (i4 <= objArr.length) {
                    C0889w1.m2149h(objArr, objArr, i3, iM253f2, iM253f);
                } else if (i3 >= objArr.length) {
                    C0889w1.m2149h(objArr, objArr, i3 - objArr.length, iM253f2, iM253f);
                } else {
                    int length = iM253f - (i4 - objArr.length);
                    C0889w1.m2149h(objArr, objArr, 0, length, iM253f);
                    Object[] objArr2 = this.f304b;
                    C0889w1.m2149h(objArr2, objArr2, i3, iM253f2, length);
                }
            } else {
                Object[] objArr3 = this.f304b;
                C0889w1.m2149h(objArr3, objArr3, size, 0, iM253f);
                Object[] objArr4 = this.f304b;
                if (i3 >= objArr4.length) {
                    C0889w1.m2149h(objArr4, objArr4, i3 - objArr4.length, iM253f2, objArr4.length);
                } else {
                    C0889w1.m2149h(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f304b;
                    C0889w1.m2149h(objArr5, objArr5, i3, iM253f2, objArr5.length - size);
                }
            }
            m248a(iM253f2, collection);
            return true;
        }
        int i5 = this.f303a;
        int length2 = i5 - size;
        if (iM253f2 < i5) {
            Object[] objArr6 = this.f304b;
            C0889w1.m2149h(objArr6, objArr6, length2, i5, objArr6.length);
            if (size >= iM253f2) {
                Object[] objArr7 = this.f304b;
                C0889w1.m2149h(objArr7, objArr7, objArr7.length - size, 0, iM253f2);
            } else {
                Object[] objArr8 = this.f304b;
                C0889w1.m2149h(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f304b;
                C0889w1.m2149h(objArr9, objArr9, 0, size, iM253f2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f304b;
            C0889w1.m2149h(objArr10, objArr10, length2, i5, iM253f2);
        } else {
            Object[] objArr11 = this.f304b;
            length2 += objArr11.length;
            int i6 = iM253f2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                C0889w1.m2149h(objArr11, objArr11, length2, i5, iM253f2);
            } else {
                C0889w1.m2149h(objArr11, objArr11, length2, i5, i5 + length3);
                Object[] objArr12 = this.f304b;
                C0889w1.m2149h(objArr12, objArr12, 0, this.f303a + length3, iM253f2);
            }
        }
        this.f303a = length2;
        m248a(m251d(iM253f2 - size), collection);
        return true;
    }

    public final void addFirst(E e) {
        m254g();
        m249b(this.f305c + 1);
        int length = this.f303a;
        if (length == 0) {
            Object[] objArr = this.f304b;
            C0631i9.m1482e(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f303a = i;
        this.f304b[i] = e;
        this.f305c++;
    }

    public final void addLast(E e) {
        m254g();
        m249b(this.f305c + 1);
        this.f304b[m253f(this.f303a + this.f305c)] = e;
        this.f305c++;
    }

    /* JADX INFO: renamed from: b */
    public final void m249b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f304b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f302d) {
            if (i < 10) {
                i = 10;
            }
            this.f304b = new Object[i];
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
        C0889w1.m2149h(objArr, objArr2, 0, this.f303a, objArr.length);
        Object[] objArr3 = this.f304b;
        int length2 = objArr3.length;
        int i3 = this.f303a;
        C0889w1.m2149h(objArr3, objArr2, length2 - i3, 0, i3);
        this.f303a = 0;
        this.f304b = objArr2;
    }

    /* JADX INFO: renamed from: c */
    public final int m250c(int i) {
        C0631i9.m1482e(this.f304b, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m254g();
            m252e(this.f303a, m253f(this.f303a + this.f305c));
        }
        this.f303a = 0;
        this.f305c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m251d(int i) {
        return i < 0 ? i + this.f304b.length : i;
    }

    /* JADX INFO: renamed from: e */
    public final void m252e(int i, int i2) {
        if (i < i2) {
            Object[] objArr = this.f304b;
            C0631i9.m1482e(objArr, "<this>");
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Object[] objArr2 = this.f304b;
            Arrays.fill(objArr2, i, objArr2.length, (Object) null);
            Object[] objArr3 = this.f304b;
            C0631i9.m1482e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m253f(int i) {
        Object[] objArr = this.f304b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: g */
    public final void m254g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i2 = this.f305c;
        if (i >= 0 && i < i2) {
            return (E) this.f304b[m253f(this.f303a + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM253f = m253f(this.f303a + this.f305c);
        int length = this.f303a;
        if (length < iM253f) {
            while (length < iM253f) {
                if (C0631i9.m1478a(obj, this.f304b[length])) {
                    i = this.f303a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM253f) {
            return -1;
        }
        int length2 = this.f304b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM253f; i2++) {
                    if (C0631i9.m1478a(obj, this.f304b[i2])) {
                        length = i2 + this.f304b.length;
                        i = this.f303a;
                    }
                }
                return -1;
            }
            if (C0631i9.m1478a(obj, this.f304b[length])) {
                i = this.f303a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f305c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM253f = m253f(this.f303a + this.f305c);
        int i2 = this.f303a;
        if (i2 < iM253f) {
            length = iM253f - 1;
            if (i2 <= length) {
                while (!C0631i9.m1478a(obj, this.f304b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f303a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iM253f) {
            int i3 = iM253f - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.f304b;
                    C0631i9.m1482e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.f303a;
                    if (i4 <= length) {
                        while (!C0631i9.m1478a(obj, this.f304b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f303a;
                    }
                } else {
                    if (C0631i9.m1478a(obj, this.f304b[i3])) {
                        length = i3 + this.f304b.length;
                        i = this.f303a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        int iM253f;
        C0631i9.m1482e(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f304b.length != 0) {
            int iM253f2 = m253f(this.f303a + this.f305c);
            int i = this.f303a;
            if (i < iM253f2) {
                iM253f = i;
                while (i < iM253f2) {
                    Object obj = this.f304b[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f304b[iM253f] = obj;
                        iM253f++;
                    }
                    i++;
                }
                Object[] objArr = this.f304b;
                C0631i9.m1482e(objArr, "<this>");
                Arrays.fill(objArr, iM253f, iM253f2, (Object) null);
            } else {
                int length = this.f304b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f304b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f304b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM253f = m253f(i2);
                for (int i3 = 0; i3 < iM253f2; i3++) {
                    Object[] objArr3 = this.f304b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f304b[iM253f] = obj3;
                        iM253f = m250c(iM253f);
                    }
                }
                z = z2;
            }
            if (z) {
                m254g();
                this.f305c = m251d(iM253f - this.f303a);
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m254g();
        Object[] objArr = this.f304b;
        int i = this.f303a;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.f303a = m250c(i);
        this.f305c--;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m254g();
        int iM253f = m253f(C0739o3.m1756c0(this) + this.f303a);
        Object[] objArr = this.f304b;
        E e = (E) objArr[iM253f];
        objArr[iM253f] = null;
        this.f305c--;
        return e;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC0887w.a.m2111a(i, i2, this.f305c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f305c) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        m254g();
        if (i < this.f305c - i2) {
            int iM253f = m253f((i - 1) + this.f303a);
            int iM253f2 = m253f((i2 - 1) + this.f303a);
            while (i > 0) {
                int i4 = iM253f + 1;
                int iMin = Math.min(i, Math.min(i4, iM253f2 + 1));
                Object[] objArr = this.f304b;
                int i5 = iM253f2 - iMin;
                int i6 = iM253f - iMin;
                C0889w1.m2149h(objArr, objArr, i5 + 1, i6 + 1, i4);
                iM253f = m251d(i6);
                iM253f2 = m251d(i5);
                i -= iMin;
            }
            int iM253f3 = m253f(this.f303a + i3);
            m252e(this.f303a, iM253f3);
            this.f303a = iM253f3;
        } else {
            int iM253f4 = m253f(this.f303a + i2);
            int iM253f5 = m253f(this.f303a + i);
            int i7 = this.f305c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f304b;
                i2 = Math.min(i7, Math.min(objArr2.length - iM253f4, objArr2.length - iM253f5));
                Object[] objArr3 = this.f304b;
                int i8 = iM253f4 + i2;
                C0889w1.m2149h(objArr3, objArr3, iM253f5, iM253f4, i8);
                iM253f4 = m253f(i8);
                iM253f5 = m253f(iM253f5 + i2);
            }
            int iM253f6 = m253f(this.f303a + this.f305c);
            m252e(m251d(iM253f6 - i3), iM253f6);
        }
        this.f305c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        int iM253f;
        C0631i9.m1482e(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f304b.length != 0) {
            int iM253f2 = m253f(this.f303a + this.f305c);
            int i = this.f303a;
            if (i < iM253f2) {
                iM253f = i;
                while (i < iM253f2) {
                    Object obj = this.f304b[i];
                    if (collection.contains(obj)) {
                        this.f304b[iM253f] = obj;
                        iM253f++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Object[] objArr = this.f304b;
                C0631i9.m1482e(objArr, "<this>");
                Arrays.fill(objArr, iM253f, iM253f2, (Object) null);
            } else {
                int length = this.f304b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f304b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f304b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM253f = m253f(i2);
                for (int i3 = 0; i3 < iM253f2; i3++) {
                    Object[] objArr3 = this.f304b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f304b[iM253f] = obj3;
                        iM253f = m250c(iM253f);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m254g();
                this.f305c = m251d(iM253f - this.f303a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        int i2 = this.f305c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int iM253f = m253f(this.f303a + i);
        Object[] objArr = this.f304b;
        E e2 = (E) objArr[iM253f];
        objArr[iM253f] = e;
        return e2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f305c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        C0631i9.m1482e(tArr, "array");
        int length = tArr.length;
        int i = this.f305c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
            C0631i9.m1480c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        T[] tArr2 = tArr;
        int iM253f = m253f(this.f303a + this.f305c);
        int i2 = this.f303a;
        if (i2 < iM253f) {
            C0889w1.m2150i(this.f304b, tArr2, 0, i2, iM253f, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f304b;
            C0889w1.m2149h(objArr, tArr2, 0, this.f303a, objArr.length);
            Object[] objArr2 = this.f304b;
            C0889w1.m2149h(objArr2, tArr2, objArr2.length - this.f303a, 0, iM253f);
        }
        int i3 = this.f305c;
        if (i3 < tArr2.length) {
            tArr2[i3] = null;
        }
        return tArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        C0631i9.m1482e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m254g();
        m249b(collection.size() + this.f305c);
        m248a(m253f(this.f303a + this.f305c), collection);
        return true;
    }
}
