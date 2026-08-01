package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: x8 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0917x8 extends AbstractC0001a0 {

    /* JADX INFO: renamed from: g */
    public static final Object[] f7281g = new Object[0];

    /* JADX INFO: renamed from: d */
    public int f7282d;

    /* JADX INFO: renamed from: e */
    public Object[] f7283e = f7281g;

    /* JADX INFO: renamed from: f */
    public int f7284f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0001a0
    /* JADX INFO: renamed from: a */
    public final int mo0a() {
        return this.f7284f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.f7284f;
        if (i < 0 || i > i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
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
        m5102j();
        m5096d(this.f7284f + 1);
        int iM5101i = m5101i(this.f7282d + i);
        int i3 = this.f7284f;
        if (i < ((i3 + 1) >> 1)) {
            if (iM5101i == 0) {
                Object[] objArr = this.f7283e;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iM5101i - 1;
            }
            int length2 = this.f7282d;
            if (length2 == 0) {
                Object[] objArr2 = this.f7283e;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.f7282d;
            Object[] objArr3 = this.f7283e;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                AbstractC0201f9.m1057c0(objArr3, objArr3, i5, i5 + 1, length + 1);
            } else {
                AbstractC0201f9.m1057c0(objArr3, objArr3, i5 - 1, i5, objArr3.length);
                Object[] objArr4 = this.f7283e;
                objArr4[objArr4.length - 1] = objArr4[0];
                AbstractC0201f9.m1057c0(objArr4, objArr4, 0, 1, length + 1);
            }
            this.f7283e[length] = obj;
            this.f7282d = i4;
        } else {
            int iM5101i2 = m5101i(i3 + this.f7282d);
            Object[] objArr5 = this.f7283e;
            if (iM5101i < iM5101i2) {
                AbstractC0201f9.m1057c0(objArr5, objArr5, iM5101i + 1, iM5101i, iM5101i2);
            } else {
                AbstractC0201f9.m1057c0(objArr5, objArr5, 1, 0, iM5101i2);
                Object[] objArr6 = this.f7283e;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC0201f9.m1057c0(objArr6, objArr6, iM5101i + 1, iM5101i, objArr6.length - 1);
            }
            this.f7283e[iM5101i] = obj;
        }
        this.f7284f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.f7284f;
        if (i < 0 || i > i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f7284f) {
            return addAll(collection);
        }
        m5102j();
        m5096d(collection.size() + this.f7284f);
        int iM5101i = m5101i(this.f7284f + this.f7282d);
        int iM5101i2 = m5101i(this.f7282d + i);
        int size = collection.size();
        if (i >= ((this.f7284f + 1) >> 1)) {
            int i3 = iM5101i2 + size;
            Object[] objArr = this.f7283e;
            if (iM5101i2 < iM5101i) {
                int i4 = size + iM5101i;
                if (i4 <= objArr.length) {
                    AbstractC0201f9.m1057c0(objArr, objArr, i3, iM5101i2, iM5101i);
                } else if (i3 >= objArr.length) {
                    AbstractC0201f9.m1057c0(objArr, objArr, i3 - objArr.length, iM5101i2, iM5101i);
                } else {
                    int length = iM5101i - (i4 - objArr.length);
                    AbstractC0201f9.m1057c0(objArr, objArr, 0, length, iM5101i);
                    Object[] objArr2 = this.f7283e;
                    AbstractC0201f9.m1057c0(objArr2, objArr2, i3, iM5101i2, length);
                }
            } else {
                AbstractC0201f9.m1057c0(objArr, objArr, size, 0, iM5101i);
                Object[] objArr3 = this.f7283e;
                if (i3 >= objArr3.length) {
                    AbstractC0201f9.m1057c0(objArr3, objArr3, i3 - objArr3.length, iM5101i2, objArr3.length);
                } else {
                    AbstractC0201f9.m1057c0(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.f7283e;
                    AbstractC0201f9.m1057c0(objArr4, objArr4, i3, iM5101i2, objArr4.length - size);
                }
            }
            m5095c(iM5101i2, collection);
            return true;
        }
        int i5 = this.f7282d;
        int length2 = i5 - size;
        Object[] objArr5 = this.f7283e;
        if (iM5101i2 < i5) {
            AbstractC0201f9.m1057c0(objArr5, objArr5, length2, i5, objArr5.length);
            Object[] objArr6 = this.f7283e;
            if (size >= iM5101i2) {
                AbstractC0201f9.m1057c0(objArr6, objArr6, objArr6.length - size, 0, iM5101i2);
            } else {
                AbstractC0201f9.m1057c0(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.f7283e;
                AbstractC0201f9.m1057c0(objArr7, objArr7, 0, size, iM5101i2);
            }
        } else if (length2 >= 0) {
            AbstractC0201f9.m1057c0(objArr5, objArr5, length2, i5, iM5101i2);
        } else {
            length2 += objArr5.length;
            int i6 = iM5101i2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                AbstractC0201f9.m1057c0(objArr5, objArr5, length2, i5, iM5101i2);
            } else {
                AbstractC0201f9.m1057c0(objArr5, objArr5, length2, i5, i5 + length3);
                Object[] objArr8 = this.f7283e;
                AbstractC0201f9.m1057c0(objArr8, objArr8, 0, this.f7282d + length3, iM5101i2);
            }
        }
        this.f7282d = length2;
        m5095c(m5099g(iM5101i2 - size), collection);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addFirst(Object obj) {
        m5102j();
        m5096d(this.f7284f + 1);
        int length = this.f7282d;
        if (length == 0) {
            Object[] objArr = this.f7283e;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.f7282d = i;
        this.f7283e[i] = obj;
        this.f7284f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addLast(Object obj) {
        m5102j();
        m5096d(mo0a() + 1);
        this.f7283e[m5101i(mo0a() + this.f7282d)] = obj;
        this.f7284f = mo0a() + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0001a0
    /* JADX INFO: renamed from: b */
    public final Object mo1b(int i) {
        int i2 = this.f7284f;
        if (i < 0 || i >= i2) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == mo0a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m5102j();
        int iM5101i = m5101i(this.f7282d + i);
        Object[] objArr = this.f7283e;
        Object obj = objArr[iM5101i];
        int i3 = this.f7284f >> 1;
        int i4 = this.f7282d;
        if (i < i3) {
            if (iM5101i >= i4) {
                AbstractC0201f9.m1057c0(objArr, objArr, i4 + 1, i4, iM5101i);
            } else {
                AbstractC0201f9.m1057c0(objArr, objArr, 1, 0, iM5101i);
                Object[] objArr2 = this.f7283e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f7282d;
                AbstractC0201f9.m1057c0(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f7283e;
            int i6 = this.f7282d;
            objArr3[i6] = null;
            this.f7282d = m5097e(i6);
        } else {
            int iM5101i2 = m5101i((mo0a() - 1) + i4);
            Object[] objArr4 = this.f7283e;
            if (iM5101i <= iM5101i2) {
                AbstractC0201f9.m1057c0(objArr4, objArr4, iM5101i, iM5101i + 1, iM5101i2 + 1);
            } else {
                AbstractC0201f9.m1057c0(objArr4, objArr4, iM5101i, iM5101i + 1, objArr4.length);
                Object[] objArr5 = this.f7283e;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0201f9.m1057c0(objArr5, objArr5, 0, 1, iM5101i2 + 1);
            }
            this.f7283e[iM5101i2] = null;
        }
        this.f7284f--;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5095c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f7283e.length;
        while (i < length && it.hasNext()) {
            this.f7283e[i] = it.next();
            i++;
        }
        int i2 = this.f7282d;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f7283e[i3] = it.next();
        }
        this.f7284f = collection.size() + this.f7284f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m5102j();
            m5100h(this.f7282d, m5101i(mo0a() + this.f7282d));
        }
        this.f7282d = 0;
        this.f7284f = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5096d(int i) {
        if (i < 0) {
            C0921xc.m5134o("Deque is too big.");
            return;
        }
        Object[] objArr = this.f7283e;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f7281g) {
            if (i < 10) {
                i = 10;
            }
            this.f7283e = new Object[i];
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
        AbstractC0201f9.m1057c0(objArr, objArr2, 0, this.f7282d, objArr.length);
        Object[] objArr3 = this.f7283e;
        int length2 = objArr3.length;
        int i3 = this.f7282d;
        AbstractC0201f9.m1057c0(objArr3, objArr2, length2 - i3, 0, i3);
        this.f7282d = 0;
        this.f7283e = objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m5097e(int i) {
        this.f7283e.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m5098f() {
        if (isEmpty()) {
            return null;
        }
        return this.f7283e[m5101i((size() - 1) + this.f7282d)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f7283e[this.f7282d];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m5099g(int i) {
        return i < 0 ? i + this.f7283e.length : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo0a = mo0a();
        if (i >= 0 && i < iMo0a) {
            return this.f7283e[m5101i(this.f7282d + i)];
        }
        C0921xc.m5125f(AbstractC0748t1.m4153k(i, iMo0a, "index: ", ", size: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m5100h(int i, int i2) {
        Object[] objArr = this.f7283e;
        if (i < i2) {
            AbstractC0201f9.m1061g0(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            AbstractC0201f9.m1061g0(this.f7283e, 0, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m5101i(int i) {
        Object[] objArr = this.f7283e;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM5101i = m5101i(mo0a() + this.f7282d);
        int length = this.f7282d;
        if (length < iM5101i) {
            while (length < iM5101i) {
                if (p30.m3002l(obj, this.f7283e[length])) {
                    i = this.f7282d;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f7282d) < iM5101i) {
            return -1;
        }
        int length2 = this.f7283e.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM5101i; i2++) {
                    if (p30.m3002l(obj, this.f7283e[i2])) {
                        length = i2 + this.f7283e.length;
                        i = this.f7282d;
                    }
                }
                return -1;
            }
            if (p30.m3002l(obj, this.f7283e[length])) {
                i = this.f7282d;
                break;
            }
            length++;
        }
        return length - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo0a() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m5102j() {
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f7283e[m5101i((size() - 1) + this.f7282d)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:18:0x0031 */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM5101i = m5101i(this.f7284f + this.f7282d);
        int i2 = this.f7282d;
        if (i2 < iM5101i) {
            length = iM5101i - 1;
            if (i2 <= length) {
                while (!p30.m3002l(obj, this.f7283e[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f7282d;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f7282d >= iM5101i) {
            while (true) {
                iM5101i--;
                Object[] objArr = this.f7283e;
                if (-1 >= iM5101i) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.f7282d;
                    if (i3 <= length) {
                        while (!p30.m3002l(obj, this.f7283e[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f7282d;
                    }
                } else if (p30.m3002l(obj, objArr[iM5101i])) {
                    length = iM5101i + this.f7283e.length;
                    i = this.f7282d;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo1b(iIndexOf);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM5101i;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f7283e.length != 0) {
            int iM5101i2 = m5101i(this.f7284f + this.f7282d);
            int i = this.f7282d;
            if (i < iM5101i2) {
                iM5101i = i;
                while (true) {
                    objArr = this.f7283e;
                    if (i >= iM5101i2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f7283e[iM5101i] = obj;
                        iM5101i++;
                    }
                    i++;
                }
                AbstractC0201f9.m1061g0(objArr, iM5101i, iM5101i2);
            } else {
                int length = this.f7283e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f7283e;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f7283e[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM5101i = m5101i(i2);
                for (int i3 = 0; i3 < iM5101i2; i3++) {
                    Object[] objArr3 = this.f7283e;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f7283e[iM5101i] = obj3;
                        iM5101i = m5097e(iM5101i);
                    }
                }
                z = z2;
            }
            if (z) {
                m5102j();
                this.f7284f = m5099g(iM5101i - this.f7282d);
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m5102j();
        Object[] objArr = this.f7283e;
        int i = this.f7282d;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f7282d = m5097e(i);
        this.f7284f = mo0a() - 1;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m5102j();
        int iM5101i = m5101i((size() - 1) + this.f7282d);
        Object[] objArr = this.f7283e;
        Object obj = objArr[iM5101i];
        objArr[iM5101i] = null;
        this.f7284f = mo0a() - 1;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        s91.m4050o(i, i2, this.f7284f);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f7284f) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo1b(i);
            return;
        }
        m5102j();
        int i4 = this.f7284f - i2;
        int i5 = this.f7282d;
        if (i < i4) {
            int iM5101i = m5101i((i - 1) + i5);
            int iM5101i2 = m5101i(this.f7282d + (i2 - 1));
            while (i > 0) {
                int i6 = iM5101i + 1;
                int iMin = Math.min(i, Math.min(i6, iM5101i2 + 1));
                Object[] objArr = this.f7283e;
                int i7 = iM5101i2 - iMin;
                int i8 = iM5101i - iMin;
                AbstractC0201f9.m1057c0(objArr, objArr, i7 + 1, i8 + 1, i6);
                iM5101i = m5099g(i8);
                iM5101i2 = m5099g(i7);
                i -= iMin;
            }
            int iM5101i3 = m5101i(this.f7282d + i3);
            m5100h(this.f7282d, iM5101i3);
            this.f7282d = iM5101i3;
        } else {
            int iM5101i4 = m5101i(i5 + i2);
            int iM5101i5 = m5101i(this.f7282d + i);
            int i9 = this.f7284f;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f7283e;
                i2 = Math.min(i9, Math.min(objArr2.length - iM5101i4, objArr2.length - iM5101i5));
                Object[] objArr3 = this.f7283e;
                int i10 = iM5101i4 + i2;
                AbstractC0201f9.m1057c0(objArr3, objArr3, iM5101i5, iM5101i4, i10);
                iM5101i4 = m5101i(i10);
                iM5101i5 = m5101i(iM5101i5 + i2);
            }
            int iM5101i6 = m5101i(this.f7284f + this.f7282d);
            m5100h(m5099g(iM5101i6 - i3), iM5101i6);
        }
        this.f7284f -= i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM5101i;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f7283e.length != 0) {
            int iM5101i2 = m5101i(this.f7284f + this.f7282d);
            int i = this.f7282d;
            if (i < iM5101i2) {
                iM5101i = i;
                while (true) {
                    objArr = this.f7283e;
                    if (i >= iM5101i2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f7283e[iM5101i] = obj;
                        iM5101i++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC0201f9.m1061g0(objArr, iM5101i, iM5101i2);
            } else {
                int length = this.f7283e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f7283e;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f7283e[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM5101i = m5101i(i2);
                for (int i3 = 0; i3 < iM5101i2; i3++) {
                    Object[] objArr3 = this.f7283e;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f7283e[iM5101i] = obj3;
                        iM5101i = m5097e(iM5101i);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m5102j();
                this.f7284f = m5099g(iM5101i - this.f7282d);
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo0a = mo0a();
        if (i < 0 || i >= iMo0a) {
            C0921xc.m5125f(AbstractC0748t1.m4153k(i, iMo0a, "index: ", ", size: "));
            return null;
        }
        int iM5101i = m5101i(this.f7282d + i);
        Object[] objArr = this.f7283e;
        Object obj2 = objArr[iM5101i];
        objArr[iM5101i] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f7284f;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iM5101i = m5101i(this.f7284f + this.f7282d);
        int i2 = this.f7282d;
        if (i2 < iM5101i) {
            AbstractC0201f9.m1059e0(this.f7283e, objArr, i2, iM5101i, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f7283e;
            AbstractC0201f9.m1057c0(objArr2, objArr, 0, this.f7282d, objArr2.length);
            Object[] objArr3 = this.f7283e;
            AbstractC0201f9.m1057c0(objArr3, objArr, objArr3.length - this.f7282d, 0, iM5101i);
        }
        int i3 = this.f7284f;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo0a()]);
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
        m5102j();
        m5096d(collection.size() + mo0a());
        m5095c(m5101i(mo0a() + this.f7282d), collection);
        return true;
    }
}
