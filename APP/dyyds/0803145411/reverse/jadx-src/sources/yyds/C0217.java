package yyds;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛱᲁᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0217 extends AbstractC0212 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final Object[] f1226 = new Object[0];

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f1227;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f1228;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object[] f1229;

    public C0217(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f1226;
        } else {
            if (i <= 0) {
                C0188.m798(AbstractC0897.m1989(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.f1229 = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f1227;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m873();
        m878(this.f1227 + 1);
        int iM872 = m872(this.f1228 + i);
        int i3 = this.f1227;
        int i4 = (i3 + 1) >> 1;
        int i5 = this.f1228;
        if (i < i4) {
            int length = iM872 == 0 ? this.f1229.length - 1 : iM872 - 1;
            int length2 = i5 == 0 ? this.f1229.length - 1 : i5 - 1;
            Object[] objArr = this.f1229;
            if (length >= i5) {
                objArr[length2] = objArr[i5];
                AbstractC2070.m3939(i5, i5 + 1, length + 1, objArr, objArr);
            } else {
                AbstractC2070.m3939(i5 - 1, i5, objArr.length, objArr, objArr);
                Object[] objArr2 = this.f1229;
                objArr2[objArr2.length - 1] = objArr2[0];
                AbstractC2070.m3939(0, 1, length + 1, objArr2, objArr2);
            }
            this.f1229[length] = obj;
            this.f1228 = length2;
        } else {
            int iM8722 = m872(i3 + i5);
            Object[] objArr3 = this.f1229;
            if (iM872 < iM8722) {
                AbstractC2070.m3939(iM872 + 1, iM872, iM8722, objArr3, objArr3);
            } else {
                AbstractC2070.m3939(1, 0, iM8722, objArr3, objArr3);
                Object[] objArr4 = this.f1229;
                objArr4[0] = objArr4[objArr4.length - 1];
                AbstractC2070.m3939(iM872 + 1, iM872, objArr4.length - 1, objArr4, objArr4);
            }
            this.f1229[iM872] = obj;
        }
        this.f1227++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f1227;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f1227) {
            return addAll(collection);
        }
        m873();
        m878(collection.size() + this.f1227);
        int iM872 = m872(this.f1227 + this.f1228);
        int iM8722 = m872(this.f1228 + i);
        int size = collection.size();
        if (i >= ((this.f1227 + 1) >> 1)) {
            int i3 = iM8722 + size;
            Object[] objArr = this.f1229;
            if (iM8722 < iM872) {
                int i4 = size + iM872;
                if (i4 <= objArr.length) {
                    AbstractC2070.m3939(i3, iM8722, iM872, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    AbstractC2070.m3939(i3 - objArr.length, iM8722, iM872, objArr, objArr);
                } else {
                    int length = iM872 - (i4 - objArr.length);
                    AbstractC2070.m3939(0, length, iM872, objArr, objArr);
                    Object[] objArr2 = this.f1229;
                    AbstractC2070.m3939(i3, iM8722, length, objArr2, objArr2);
                }
            } else {
                AbstractC2070.m3939(size, 0, iM872, objArr, objArr);
                Object[] objArr3 = this.f1229;
                if (i3 >= objArr3.length) {
                    AbstractC2070.m3939(i3 - objArr3.length, iM8722, objArr3.length, objArr3, objArr3);
                } else {
                    AbstractC2070.m3939(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.f1229;
                    AbstractC2070.m3939(i3, iM8722, objArr4.length - size, objArr4, objArr4);
                }
            }
            m876(iM8722, collection);
            return true;
        }
        int i5 = this.f1228;
        int length2 = i5 - size;
        Object[] objArr5 = this.f1229;
        if (iM8722 < i5) {
            AbstractC2070.m3939(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.f1229;
            if (size >= iM8722) {
                AbstractC2070.m3939(objArr6.length - size, 0, iM8722, objArr6, objArr6);
            } else {
                AbstractC2070.m3939(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.f1229;
                AbstractC2070.m3939(0, size, iM8722, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            AbstractC2070.m3939(length2, i5, iM8722, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iM8722 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                AbstractC2070.m3939(length2, i5, iM8722, objArr5, objArr5);
            } else {
                AbstractC2070.m3939(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.f1229;
                AbstractC2070.m3939(0, this.f1228 + length3, iM8722, objArr8, objArr8);
            }
        }
        this.f1228 = length2;
        m876(m877(iM8722 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m873();
        m878(this.f1227 + 1);
        int length = this.f1228;
        if (length == 0) {
            length = this.f1229.length;
        }
        int i = length - 1;
        this.f1228 = i;
        this.f1229[i] = obj;
        this.f1227++;
    }

    public final void addLast(Object obj) {
        m873();
        m878(this.f1227 + 1);
        this.f1229[m872(this.f1227 + this.f1228)] = obj;
        this.f1227++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m873();
            m875(this.f1228, m872(this.f1227 + this.f1228));
        }
        this.f1228 = 0;
        this.f1227 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f1227;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        return this.f1229[m872(this.f1228 + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM872 = m872(this.f1227 + this.f1228);
        int length = this.f1228;
        if (length < iM872) {
            while (length < iM872) {
                if (AbstractC1544.m3188(obj, this.f1229[length])) {
                    i = this.f1228;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f1228) < iM872) {
            return -1;
        }
        int length2 = this.f1229.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM872; i2++) {
                    if (AbstractC1544.m3188(obj, this.f1229[i2])) {
                        length = i2 + this.f1229.length;
                        i = this.f1228;
                    }
                }
                return -1;
            }
            if (AbstractC1544.m3188(obj, this.f1229[length])) {
                i = this.f1228;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo868() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM872 = m872(this.f1227 + this.f1228);
        int i2 = this.f1228;
        if (i2 < iM872) {
            length = iM872 - 1;
            if (i2 <= length) {
                while (!AbstractC1544.m3188(obj, this.f1229[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f1228;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f1228 >= iM872) {
            while (true) {
                iM872--;
                Object[] objArr = this.f1229;
                if (-1 >= iM872) {
                    length = objArr.length - 1;
                    int i3 = this.f1228;
                    if (i3 <= length) {
                        while (!AbstractC1544.m3188(obj, this.f1229[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f1228;
                    }
                } else if (AbstractC1544.m3188(obj, objArr[iM872])) {
                    length = iM872 + this.f1229.length;
                    i = this.f1228;
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
        mo869(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM872;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f1229.length != 0) {
            int iM8722 = m872(this.f1227 + this.f1228);
            int i = this.f1228;
            if (i < iM8722) {
                iM872 = i;
                while (true) {
                    objArr = this.f1229;
                    if (i >= iM8722) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f1229[iM872] = obj;
                        iM872++;
                    }
                    i++;
                }
                Arrays.fill(objArr, iM872, iM8722, (Object) null);
            } else {
                int length = this.f1229.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f1229;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f1229[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM872 = m872(i2);
                for (int i3 = 0; i3 < iM8722; i3++) {
                    Object[] objArr3 = this.f1229;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f1229[iM872] = obj3;
                        iM872 = m874(iM872);
                    }
                }
                z = z2;
            }
            if (z) {
                m873();
                this.f1227 = m877(iM872 - this.f1228);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m873();
        Object[] objArr = this.f1229;
        int i = this.f1228;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f1228 = m874(i);
        this.f1227--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m873();
        int iM872 = m872(AbstractC2725.m4850(this) + this.f1228);
        Object[] objArr = this.f1229;
        Object obj = objArr[iM872];
        objArr[iM872] = null;
        this.f1227--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC1960.m3783(i, i2, this.f1227);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f1227) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo869(i);
            return;
        }
        m873();
        int i4 = this.f1227 - i2;
        int i5 = this.f1228;
        int i6 = this.f1228;
        if (i < i4) {
            int iM872 = m872((i - 1) + i5);
            int iM8722 = m872((i2 - 1) + i6);
            while (i > 0) {
                int i7 = iM872 + 1;
                int iMin = Math.min(i, Math.min(i7, iM8722 + 1));
                Object[] objArr = this.f1229;
                int i8 = iM8722 - iMin;
                int i9 = iM872 - iMin;
                AbstractC2070.m3939(i8 + 1, i9 + 1, i7, objArr, objArr);
                iM872 = m877(i9);
                iM8722 = m877(i8);
                i -= iMin;
            }
            int iM8723 = m872(this.f1228 + i3);
            m875(this.f1228, iM8723);
            this.f1228 = iM8723;
        } else {
            int iM8724 = m872(i5 + i2);
            int iM8725 = m872(i6 + i);
            int i10 = this.f1227;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f1229;
                i2 = Math.min(i10, Math.min(objArr2.length - iM8724, objArr2.length - iM8725));
                Object[] objArr3 = this.f1229;
                int i11 = iM8724 + i2;
                AbstractC2070.m3939(iM8725, iM8724, i11, objArr3, objArr3);
                iM8724 = m872(i11);
                iM8725 = m872(iM8725 + i2);
            }
            int iM8726 = m872(this.f1227 + this.f1228);
            m875(m877(iM8726 - i3), iM8726);
        }
        this.f1227 -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM872;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f1229.length != 0) {
            int iM8722 = m872(this.f1227 + this.f1228);
            int i = this.f1228;
            if (i < iM8722) {
                iM872 = i;
                while (true) {
                    objArr = this.f1229;
                    if (i >= iM8722) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f1229[iM872] = obj;
                        iM872++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, iM872, iM8722, (Object) null);
            } else {
                int length = this.f1229.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f1229;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f1229[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM872 = m872(i2);
                for (int i3 = 0; i3 < iM8722; i3++) {
                    Object[] objArr3 = this.f1229;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f1229[iM872] = obj3;
                        iM872 = m874(iM872);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m873();
                this.f1227 = m877(iM872 - this.f1228);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f1227;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        int iM872 = m872(this.f1228 + i);
        Object[] objArr = this.f1229;
        Object obj2 = objArr[iM872];
        objArr[iM872] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f1227;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iM872 = m872(this.f1227 + this.f1228);
        int i2 = this.f1228;
        if (i2 < iM872) {
            AbstractC2070.m3937(i2, iM872, 2, this.f1229, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1229;
            AbstractC2070.m3939(0, this.f1228, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f1229;
            AbstractC2070.m3939(objArr3.length - this.f1228, 0, iM872, objArr3, objArr);
        }
        int i3 = this.f1227;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int m872(int i) {
        Object[] objArr = this.f1229;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m873() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int m874(int i) {
        if (i == this.f1229.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // yyds.AbstractC0212
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final int mo868() {
        return this.f1227;
    }

    @Override // yyds.AbstractC0212
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo869(int i) {
        int i2 = this.f1227;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0897.m1987(i, i2, "index: ", ", size: "));
        }
        if (i == AbstractC2725.m4850(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m873();
        int iM872 = m872(this.f1228 + i);
        Object[] objArr = this.f1229;
        Object obj = objArr[iM872];
        int i3 = this.f1227 >> 1;
        int i4 = this.f1228;
        if (i < i3) {
            if (iM872 >= i4) {
                AbstractC2070.m3939(i4 + 1, i4, iM872, objArr, objArr);
            } else {
                AbstractC2070.m3939(1, 0, iM872, objArr, objArr);
                Object[] objArr2 = this.f1229;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f1228;
                AbstractC2070.m3939(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f1229;
            int i6 = this.f1228;
            objArr3[i6] = null;
            this.f1228 = m874(i6);
        } else {
            int iM8722 = m872(AbstractC2725.m4850(this) + i4);
            Object[] objArr4 = this.f1229;
            if (iM872 <= iM8722) {
                AbstractC2070.m3939(iM872, iM872 + 1, iM8722 + 1, objArr4, objArr4);
            } else {
                AbstractC2070.m3939(iM872, iM872 + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f1229;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC2070.m3939(0, 1, iM8722 + 1, objArr5, objArr5);
            }
            this.f1229[iM8722] = null;
        }
        this.f1227--;
        return obj;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m875(int i, int i2) {
        Object[] objArr = this.f1229;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.f1229, 0, i2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m876(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1229.length;
        while (i < length && it.hasNext()) {
            this.f1229[i] = it.next();
            i++;
        }
        int i2 = this.f1228;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f1229[i3] = it.next();
        }
        this.f1227 = collection.size() + this.f1227;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int m877(int i) {
        return i < 0 ? i + this.f1229.length : i;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m878(int i) {
        if (i < 0) {
            C0188.m800("Deque is too big.");
            return;
        }
        Object[] objArr = this.f1229;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f1226) {
            if (i < 10) {
                i = 10;
            }
            this.f1229 = new Object[i];
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
        AbstractC2070.m3939(0, this.f1228, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f1229;
        int length2 = objArr3.length;
        int i3 = this.f1228;
        AbstractC2070.m3939(length2 - i3, 0, i3, objArr3, objArr2);
        this.f1228 = 0;
        this.f1229 = objArr2;
    }

    public C0217() {
        this.f1229 = f1226;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo868()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        m873();
        m878(collection.size() + this.f1227);
        m876(m872(this.f1227 + this.f1228), collection);
        return true;
    }
}
