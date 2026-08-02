package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ag extends z2 {
    public static final Object[] k = new Object[0];
    public int h;
    public Object[] i = k;
    public int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.z2
    public final int a() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.j;
        if (i < 0 || i > i2) {
            s.d(vi0.h("index: ", i, ", size: ", i2));
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
        j();
        d(this.j + 1);
        int i3 = i(this.h + i);
        int i4 = this.j;
        if (i < ((i4 + 1) >> 1)) {
            if (i3 == 0) {
                Object[] objArr = this.i;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = i3 - 1;
            }
            int length2 = this.h;
            if (length2 == 0) {
                Object[] objArr2 = this.i;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i5 = length2 - 1;
            int i6 = this.h;
            Object[] objArr3 = this.i;
            if (length >= i6) {
                objArr3[i5] = objArr3[i6];
                mg.c0(objArr3, objArr3, i6, i6 + 1, length + 1);
            } else {
                mg.c0(objArr3, objArr3, i6 - 1, i6, objArr3.length);
                Object[] objArr4 = this.i;
                objArr4[objArr4.length - 1] = objArr4[0];
                mg.c0(objArr4, objArr4, 0, 1, length + 1);
            }
            this.i[length] = obj;
            this.h = i5;
        } else {
            int i7 = i(i4 + this.h);
            Object[] objArr5 = this.i;
            if (i3 < i7) {
                mg.c0(objArr5, objArr5, i3 + 1, i3, i7);
            } else {
                mg.c0(objArr5, objArr5, 1, 0, i7);
                Object[] objArr6 = this.i;
                objArr6[0] = objArr6[objArr6.length - 1];
                mg.c0(objArr6, objArr6, i3 + 1, i3, objArr6.length - 1);
            }
            this.i[i3] = obj;
        }
        this.j++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.j;
        if (i < 0 || i > i2) {
            s.d(vi0.h("index: ", i, ", size: ", i2));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.j) {
            return addAll(collection);
        }
        j();
        d(collection.size() + this.j);
        int i3 = i(this.j + this.h);
        int i4 = i(this.h + i);
        int size = collection.size();
        if (i >= ((this.j + 1) >> 1)) {
            int i5 = i4 + size;
            Object[] objArr = this.i;
            if (i4 < i3) {
                int i6 = size + i3;
                if (i6 <= objArr.length) {
                    mg.c0(objArr, objArr, i5, i4, i3);
                } else if (i5 >= objArr.length) {
                    mg.c0(objArr, objArr, i5 - objArr.length, i4, i3);
                } else {
                    int length = i3 - (i6 - objArr.length);
                    mg.c0(objArr, objArr, 0, length, i3);
                    Object[] objArr2 = this.i;
                    mg.c0(objArr2, objArr2, i5, i4, length);
                }
            } else {
                mg.c0(objArr, objArr, size, 0, i3);
                Object[] objArr3 = this.i;
                if (i5 >= objArr3.length) {
                    mg.c0(objArr3, objArr3, i5 - objArr3.length, i4, objArr3.length);
                } else {
                    mg.c0(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.i;
                    mg.c0(objArr4, objArr4, i5, i4, objArr4.length - size);
                }
            }
            c(i4, collection);
            return true;
        }
        int i7 = this.h;
        int length2 = i7 - size;
        Object[] objArr5 = this.i;
        if (i4 < i7) {
            mg.c0(objArr5, objArr5, length2, i7, objArr5.length);
            Object[] objArr6 = this.i;
            if (size >= i4) {
                mg.c0(objArr6, objArr6, objArr6.length - size, 0, i4);
            } else {
                mg.c0(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.i;
                mg.c0(objArr7, objArr7, 0, size, i4);
            }
        } else if (length2 >= 0) {
            mg.c0(objArr5, objArr5, length2, i7, i4);
        } else {
            length2 += objArr5.length;
            int i8 = i4 - i7;
            int length3 = objArr5.length - length2;
            if (length3 >= i8) {
                mg.c0(objArr5, objArr5, length2, i7, i4);
            } else {
                mg.c0(objArr5, objArr5, length2, i7, i7 + length3);
                Object[] objArr8 = this.i;
                mg.c0(objArr8, objArr8, 0, this.h + length3, i4);
            }
        }
        this.h = length2;
        c(g(i4 - size), collection);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addFirst(Object obj) {
        j();
        d(this.j + 1);
        int length = this.h;
        if (length == 0) {
            Object[] objArr = this.i;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.h = i;
        this.i[i] = obj;
        this.j++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addLast(Object obj) {
        j();
        d(a() + 1);
        this.i[i(a() + this.h)] = obj;
        this.j = a() + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.z2
    public final Object b(int i) {
        int i2 = this.j;
        if (i < 0 || i >= i2) {
            s.d(vi0.h("index: ", i, ", size: ", i2));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        j();
        int i3 = i(this.h + i);
        Object[] objArr = this.i;
        Object obj = objArr[i3];
        int i4 = this.j >> 1;
        int i5 = this.h;
        if (i < i4) {
            if (i3 >= i5) {
                mg.c0(objArr, objArr, i5 + 1, i5, i3);
            } else {
                mg.c0(objArr, objArr, 1, 0, i3);
                Object[] objArr2 = this.i;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.h;
                mg.c0(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
            }
            Object[] objArr3 = this.i;
            int i7 = this.h;
            objArr3[i7] = null;
            this.h = e(i7);
        } else {
            int i8 = i((a() - 1) + i5);
            Object[] objArr4 = this.i;
            if (i3 <= i8) {
                mg.c0(objArr4, objArr4, i3, i3 + 1, i8 + 1);
            } else {
                mg.c0(objArr4, objArr4, i3, i3 + 1, objArr4.length);
                Object[] objArr5 = this.i;
                objArr5[objArr5.length - 1] = objArr5[0];
                mg.c0(objArr5, objArr5, 0, 1, i8 + 1);
            }
            this.i[i8] = null;
        }
        this.j--;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.i.length;
        while (i < length && it.hasNext()) {
            this.i[i] = it.next();
            i++;
        }
        int i2 = this.h;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.i[i3] = it.next();
        }
        this.j = collection.size() + this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.h, i(a() + this.h));
        }
        this.h = 0;
        this.j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i) {
        if (i < 0) {
            s.l("Deque is too big.");
            return;
        }
        Object[] objArr = this.i;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == k) {
            if (i < 10) {
                i = 10;
            }
            this.i = new Object[i];
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
        mg.c0(objArr, objArr2, 0, this.h, objArr.length);
        Object[] objArr3 = this.i;
        int length2 = objArr3.length;
        int i3 = this.h;
        mg.c0(objArr3, objArr2, length2 - i3, 0, i3);
        this.h = 0;
        this.i = objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(int i) {
        this.i.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.i[i((size() - 1) + this.h)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g(int i) {
        return i < 0 ? i + this.i.length : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i >= 0 && i < iA) {
            return this.i[i(this.h + i)];
        }
        s.d(vi0.h("index: ", i, ", size: ", iA));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(int i, int i2) {
        Object[] objArr = this.i;
        if (i < i2) {
            mg.i0(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            mg.i0(this.i, 0, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int i(int i) {
        Object[] objArr = this.i;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i2 = i(a() + this.h);
        int length = this.h;
        if (length < i2) {
            while (length < i2) {
                if (t11.l(obj, this.i[length])) {
                    i = this.h;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.h) < i2) {
            return -1;
        }
        int length2 = this.i.length;
        while (true) {
            if (length >= length2) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (t11.l(obj, this.i[i3])) {
                        length = i3 + this.i.length;
                        i = this.h;
                    }
                }
                return -1;
            }
            if (t11.l(obj, this.i[length])) {
                i = this.h;
                break;
            }
            length++;
        }
        return length - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object last() {
        if (isEmpty()) {
            um2.i("ArrayDeque is empty.");
            return null;
        }
        return this.i[i((size() - 1) + this.h)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:18:0x0031 */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int i2 = i(this.j + this.h);
        int i3 = this.h;
        if (i3 < i2) {
            length = i2 - 1;
            if (i3 <= length) {
                while (!t11.l(obj, this.i[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i = this.h;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.h >= i2) {
            while (true) {
                i2--;
                Object[] objArr = this.i;
                if (-1 >= i2) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i4 = this.h;
                    if (i4 <= length) {
                        while (!t11.l(obj, this.i[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.h;
                    }
                } else if (t11.l(obj, objArr[i2])) {
                    length = i2 + this.i.length;
                    i = this.h;
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
        b(iIndexOf);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.i.length != 0) {
            int i2 = i(this.j + this.h);
            int i3 = this.h;
            if (i3 < i2) {
                i = i3;
                while (true) {
                    objArr = this.i;
                    if (i3 >= i2) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.i[i] = obj;
                        i++;
                    }
                    i3++;
                }
                mg.i0(objArr, i, i2);
            } else {
                int length = this.i.length;
                boolean z2 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.i;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.i[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                i = i(i4);
                for (int i5 = 0; i5 < i2; i5++) {
                    Object[] objArr3 = this.i;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.i[i] = obj3;
                        i = e(i);
                    }
                }
                z = z2;
            }
            if (z) {
                j();
                this.j = g(i - this.h);
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object removeFirst() {
        if (isEmpty()) {
            um2.i("ArrayDeque is empty.");
            return null;
        }
        j();
        Object[] objArr = this.i;
        int i = this.h;
        Object obj = objArr[i];
        objArr[i] = null;
        this.h = e(i);
        this.j = a() - 1;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object removeLast() {
        if (isEmpty()) {
            um2.i("ArrayDeque is empty.");
            return null;
        }
        j();
        int i = i((size() - 1) + this.h);
        Object[] objArr = this.i;
        Object obj = objArr[i];
        objArr[i] = null;
        this.j = a() - 1;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        sp0.u(i, i2, this.j);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.j) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        j();
        int i4 = this.j - i2;
        int i5 = this.h;
        if (i < i4) {
            int i6 = i((i - 1) + i5);
            int i7 = i(this.h + (i2 - 1));
            while (i > 0) {
                int i8 = i6 + 1;
                int iMin = Math.min(i, Math.min(i8, i7 + 1));
                Object[] objArr = this.i;
                int i9 = i7 - iMin;
                int i10 = i6 - iMin;
                mg.c0(objArr, objArr, i9 + 1, i10 + 1, i8);
                i6 = g(i10);
                i7 = g(i9);
                i -= iMin;
            }
            int i11 = i(this.h + i3);
            h(this.h, i11);
            this.h = i11;
        } else {
            int i12 = i(i5 + i2);
            int i13 = i(this.h + i);
            int i14 = this.j;
            while (true) {
                i14 -= i2;
                if (i14 <= 0) {
                    break;
                }
                Object[] objArr2 = this.i;
                i2 = Math.min(i14, Math.min(objArr2.length - i12, objArr2.length - i13));
                Object[] objArr3 = this.i;
                int i15 = i12 + i2;
                mg.c0(objArr3, objArr3, i13, i12, i15);
                i12 = i(i15);
                i13 = i(i13 + i2);
            }
            int i16 = i(this.j + this.h);
            h(g(i16 - i3), i16);
        }
        this.j -= i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.i.length != 0) {
            int i2 = i(this.j + this.h);
            int i3 = this.h;
            if (i3 < i2) {
                i = i3;
                while (true) {
                    objArr = this.i;
                    if (i3 >= i2) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (collection.contains(obj)) {
                        this.i[i] = obj;
                        i++;
                    } else {
                        z = true;
                    }
                    i3++;
                }
                mg.i0(objArr, i, i2);
            } else {
                int length = this.i.length;
                boolean z2 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.i;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        this.i[i4] = obj2;
                        i4++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                i = i(i4);
                for (int i5 = 0; i5 < i2; i5++) {
                    Object[] objArr3 = this.i;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        this.i[i] = obj3;
                        i = e(i);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                j();
                this.j = g(i - this.h);
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iA = a();
        if (i < 0 || i >= iA) {
            s.d(vi0.h("index: ", i, ", size: ", iA));
            return null;
        }
        int i2 = i(this.h + i);
        Object[] objArr = this.i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.j;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int i2 = i(this.j + this.h);
        int i3 = this.h;
        if (i3 < i2) {
            mg.f0(this.i, objArr, i3, i2, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.i;
            mg.c0(objArr2, objArr, 0, this.h, objArr2.length);
            Object[] objArr3 = this.i;
            mg.c0(objArr3, objArr, objArr3.length - this.h, 0, i2);
        }
        int i4 = this.j;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
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
        j();
        d(collection.size() + a());
        c(i(a() + this.h), collection);
        return true;
    }
}
