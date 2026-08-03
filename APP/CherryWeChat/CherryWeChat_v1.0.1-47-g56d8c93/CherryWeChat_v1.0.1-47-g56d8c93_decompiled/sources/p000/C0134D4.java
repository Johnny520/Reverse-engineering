package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: D4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0134D4 extends AbstractList implements List, InterfaceC0588Nm {

    /* JADX INFO: renamed from: d */
    public static final Object[] f345d = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f346a;

    /* JADX INFO: renamed from: b */
    public Object[] f347b = f345d;

    /* JADX INFO: renamed from: c */
    public int f348c;

    /* JADX INFO: renamed from: a */
    public final void m252a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f347b.length;
        while (i < length && it.hasNext()) {
            this.f347b[i] = it.next();
            i++;
        }
        int i2 = this.f346a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f347b[i3] = it.next();
        }
        this.f348c = collection.size() + this.f348c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f348c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m258j();
        m253b(this.f348c + 1);
        int iM257h = m257h(this.f346a + i);
        int i3 = this.f348c;
        if (i < ((i3 + 1) >> 1)) {
            int length = iM257h == 0 ? this.f347b.length - 1 : iM257h - 1;
            int i4 = this.f346a;
            int length2 = i4 == 0 ? this.f347b.length - 1 : i4 - 1;
            if (length >= i4) {
                Object[] objArr = this.f347b;
                objArr[length2] = objArr[i4];
                AbstractC0650P4.m1310E(objArr, objArr, i4, i4 + 1, length + 1);
            } else {
                Object[] objArr2 = this.f347b;
                AbstractC0650P4.m1310E(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                Object[] objArr3 = this.f347b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC0650P4.m1310E(objArr3, objArr3, 0, 1, length + 1);
            }
            this.f347b[length] = obj;
            this.f346a = length2;
        } else {
            int iM257h2 = m257h(this.f346a + i3);
            if (iM257h < iM257h2) {
                Object[] objArr4 = this.f347b;
                AbstractC0650P4.m1310E(objArr4, objArr4, iM257h + 1, iM257h, iM257h2);
            } else {
                Object[] objArr5 = this.f347b;
                AbstractC0650P4.m1310E(objArr5, objArr5, 1, 0, iM257h2);
                Object[] objArr6 = this.f347b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC0650P4.m1310E(objArr6, objArr6, iM257h + 1, iM257h, objArr6.length - 1);
            }
            this.f347b[iM257h] = obj;
        }
        this.f348c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f348c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f348c) {
            return addAll(collection);
        }
        m258j();
        m253b(collection.size() + this.f348c);
        int iM257h = m257h(this.f346a + this.f348c);
        int iM257h2 = m257h(this.f346a + i);
        int size = collection.size();
        if (i >= ((this.f348c + 1) >> 1)) {
            int i3 = iM257h2 + size;
            if (iM257h2 < iM257h) {
                int i4 = size + iM257h;
                Object[] objArr = this.f347b;
                if (i4 <= objArr.length) {
                    AbstractC0650P4.m1310E(objArr, objArr, i3, iM257h2, iM257h);
                } else if (i3 >= objArr.length) {
                    AbstractC0650P4.m1310E(objArr, objArr, i3 - objArr.length, iM257h2, iM257h);
                } else {
                    int length = iM257h - (i4 - objArr.length);
                    AbstractC0650P4.m1310E(objArr, objArr, 0, length, iM257h);
                    Object[] objArr2 = this.f347b;
                    AbstractC0650P4.m1310E(objArr2, objArr2, i3, iM257h2, length);
                }
            } else {
                Object[] objArr3 = this.f347b;
                AbstractC0650P4.m1310E(objArr3, objArr3, size, 0, iM257h);
                Object[] objArr4 = this.f347b;
                if (i3 >= objArr4.length) {
                    AbstractC0650P4.m1310E(objArr4, objArr4, i3 - objArr4.length, iM257h2, objArr4.length);
                } else {
                    AbstractC0650P4.m1310E(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f347b;
                    AbstractC0650P4.m1310E(objArr5, objArr5, i3, iM257h2, objArr5.length - size);
                }
            }
            m252a(iM257h2, collection);
            return true;
        }
        int i5 = this.f346a;
        int length2 = i5 - size;
        if (iM257h2 < i5) {
            Object[] objArr6 = this.f347b;
            AbstractC0650P4.m1310E(objArr6, objArr6, length2, i5, objArr6.length);
            if (size >= iM257h2) {
                Object[] objArr7 = this.f347b;
                AbstractC0650P4.m1310E(objArr7, objArr7, objArr7.length - size, 0, iM257h2);
            } else {
                Object[] objArr8 = this.f347b;
                AbstractC0650P4.m1310E(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f347b;
                AbstractC0650P4.m1310E(objArr9, objArr9, 0, size, iM257h2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f347b;
            AbstractC0650P4.m1310E(objArr10, objArr10, length2, i5, iM257h2);
        } else {
            Object[] objArr11 = this.f347b;
            length2 += objArr11.length;
            int i6 = iM257h2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                AbstractC0650P4.m1310E(objArr11, objArr11, length2, i5, iM257h2);
            } else {
                AbstractC0650P4.m1310E(objArr11, objArr11, length2, i5, i5 + length3);
                Object[] objArr12 = this.f347b;
                AbstractC0650P4.m1310E(objArr12, objArr12, 0, this.f346a + length3, iM257h2);
            }
        }
        this.f346a = length2;
        m252a(m255e(iM257h2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m258j();
        m253b(this.f348c + 1);
        int length = this.f346a;
        if (length == 0) {
            length = this.f347b.length;
        }
        int i = length - 1;
        this.f346a = i;
        this.f347b[i] = obj;
        this.f348c++;
    }

    public final void addLast(Object obj) {
        m258j();
        m253b(this.f348c + 1);
        this.f347b[m257h(this.f346a + this.f348c)] = obj;
        this.f348c++;
    }

    /* JADX INFO: renamed from: b */
    public final void m253b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f347b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f345d) {
            if (i < 10) {
                i = 10;
            }
            this.f347b = new Object[i];
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
        AbstractC0650P4.m1310E(objArr, objArr2, 0, this.f346a, objArr.length);
        Object[] objArr3 = this.f347b;
        int length2 = objArr3.length;
        int i3 = this.f346a;
        AbstractC0650P4.m1310E(objArr3, objArr2, length2 - i3, 0, i3);
        this.f346a = 0;
        this.f347b = objArr2;
    }

    /* JADX INFO: renamed from: c */
    public final int m254c(int i) {
        if (i == this.f347b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m258j();
            m256g(this.f346a, m257h(this.f346a + this.f348c));
        }
        this.f346a = 0;
        this.f348c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: e */
    public final int m255e(int i) {
        return i < 0 ? i + this.f347b.length : i;
    }

    /* JADX INFO: renamed from: g */
    public final void m256g(int i, int i2) {
        if (i < i2) {
            Arrays.fill(this.f347b, i, i2, (Object) null);
            return;
        }
        Object[] objArr = this.f347b;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Arrays.fill(this.f347b, 0, i2, (Object) null);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f348c;
        if (i >= 0 && i < i2) {
            return this.f347b[m257h(this.f346a + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    /* JADX INFO: renamed from: h */
    public final int m257h(int i) {
        Object[] objArr = this.f347b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM257h = m257h(this.f346a + this.f348c);
        int length = this.f346a;
        if (length < iM257h) {
            while (length < iM257h) {
                if (AbstractC0585Nj.m1134a(obj, this.f347b[length])) {
                    i = this.f346a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM257h) {
            return -1;
        }
        int length2 = this.f347b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM257h; i2++) {
                    if (AbstractC0585Nj.m1134a(obj, this.f347b[i2])) {
                        length = i2 + this.f347b.length;
                        i = this.f346a;
                    }
                }
                return -1;
            }
            if (AbstractC0585Nj.m1134a(obj, this.f347b[length])) {
                i = this.f346a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f348c == 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m258j() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: k */
    public final Object m259k(int i) {
        int i2 = this.f348c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == AbstractC2496sa.m4976a0(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m258j();
        int iM257h = m257h(this.f346a + i);
        Object[] objArr = this.f347b;
        Object obj = objArr[iM257h];
        if (i < (this.f348c >> 1)) {
            int i3 = this.f346a;
            if (iM257h >= i3) {
                AbstractC0650P4.m1310E(objArr, objArr, i3 + 1, i3, iM257h);
            } else {
                AbstractC0650P4.m1310E(objArr, objArr, 1, 0, iM257h);
                Object[] objArr2 = this.f347b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f346a;
                AbstractC0650P4.m1310E(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f347b;
            int i5 = this.f346a;
            objArr3[i5] = null;
            this.f346a = m254c(i5);
        } else {
            int iM257h2 = m257h(AbstractC2496sa.m4976a0(this) + this.f346a);
            if (iM257h <= iM257h2) {
                Object[] objArr4 = this.f347b;
                AbstractC0650P4.m1310E(objArr4, objArr4, iM257h, iM257h + 1, iM257h2 + 1);
            } else {
                Object[] objArr5 = this.f347b;
                AbstractC0650P4.m1310E(objArr5, objArr5, iM257h, iM257h + 1, objArr5.length);
                Object[] objArr6 = this.f347b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0650P4.m1310E(objArr6, objArr6, 0, 1, iM257h2 + 1);
            }
            this.f347b[iM257h2] = null;
        }
        this.f348c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM257h = m257h(this.f346a + this.f348c);
        int i2 = this.f346a;
        if (i2 < iM257h) {
            length = iM257h - 1;
            if (i2 <= length) {
                while (!AbstractC0585Nj.m1134a(obj, this.f347b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f346a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iM257h) {
            int i3 = iM257h - 1;
            while (true) {
                if (-1 >= i3) {
                    length = this.f347b.length - 1;
                    int i4 = this.f346a;
                    if (i4 <= length) {
                        while (!AbstractC0585Nj.m1134a(obj, this.f347b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f346a;
                    }
                } else {
                    if (AbstractC0585Nj.m1134a(obj, this.f347b[i3])) {
                        length = i3 + this.f347b.length;
                        i = this.f346a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return m259k(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM257h;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f347b.length != 0) {
            int iM257h2 = m257h(this.f346a + this.f348c);
            int i = this.f346a;
            if (i < iM257h2) {
                iM257h = i;
                while (i < iM257h2) {
                    Object obj = this.f347b[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f347b[iM257h] = obj;
                        iM257h++;
                    }
                    i++;
                }
                Arrays.fill(this.f347b, iM257h, iM257h2, (Object) null);
            } else {
                int length = this.f347b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f347b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f347b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM257h = m257h(i2);
                for (int i3 = 0; i3 < iM257h2; i3++) {
                    Object[] objArr2 = this.f347b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f347b[iM257h] = obj3;
                        iM257h = m254c(iM257h);
                    }
                }
                z = z2;
            }
            if (z) {
                m258j();
                this.f348c = m255e(iM257h - this.f346a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m258j();
        Object[] objArr = this.f347b;
        int i = this.f346a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f346a = m254c(i);
        this.f348c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m258j();
        int iM257h = m257h(AbstractC2496sa.m4976a0(this) + this.f346a);
        Object[] objArr = this.f347b;
        Object obj = objArr[iM257h];
        objArr[iM257h] = null;
        this.f348c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC0585Nj.m1136d(i, i2, this.f348c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f348c) {
            clear();
            return;
        }
        if (i3 == 1) {
            m259k(i);
            return;
        }
        m258j();
        if (i < this.f348c - i2) {
            int iM257h = m257h(this.f346a + (i - 1));
            int iM257h2 = m257h(this.f346a + (i2 - 1));
            while (i > 0) {
                int i4 = iM257h + 1;
                int iMin = Math.min(i, Math.min(i4, iM257h2 + 1));
                Object[] objArr = this.f347b;
                int i5 = iM257h2 - iMin;
                int i6 = iM257h - iMin;
                AbstractC0650P4.m1310E(objArr, objArr, i5 + 1, i6 + 1, i4);
                iM257h = m255e(i6);
                iM257h2 = m255e(i5);
                i -= iMin;
            }
            int iM257h3 = m257h(this.f346a + i3);
            m256g(this.f346a, iM257h3);
            this.f346a = iM257h3;
        } else {
            int iM257h4 = m257h(this.f346a + i2);
            int iM257h5 = m257h(this.f346a + i);
            int i7 = this.f348c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f347b;
                i2 = Math.min(i7, Math.min(objArr2.length - iM257h4, objArr2.length - iM257h5));
                Object[] objArr3 = this.f347b;
                int i8 = iM257h4 + i2;
                AbstractC0650P4.m1310E(objArr3, objArr3, iM257h5, iM257h4, i8);
                iM257h4 = m257h(i8);
                iM257h5 = m257h(iM257h5 + i2);
            }
            int iM257h6 = m257h(this.f346a + this.f348c);
            m256g(m255e(iM257h6 - i3), iM257h6);
        }
        this.f348c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM257h;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f347b.length != 0) {
            int iM257h2 = m257h(this.f346a + this.f348c);
            int i = this.f346a;
            if (i < iM257h2) {
                iM257h = i;
                while (i < iM257h2) {
                    Object obj = this.f347b[i];
                    if (collection.contains(obj)) {
                        this.f347b[iM257h] = obj;
                        iM257h++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.f347b, iM257h, iM257h2, (Object) null);
            } else {
                int length = this.f347b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f347b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f347b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM257h = m257h(i2);
                for (int i3 = 0; i3 < iM257h2; i3++) {
                    Object[] objArr2 = this.f347b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f347b[iM257h] = obj3;
                        iM257h = m254c(iM257h);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m258j();
                this.f348c = m255e(iM257h - this.f346a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f348c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int iM257h = m257h(this.f346a + i);
        Object[] objArr = this.f347b;
        Object obj2 = objArr[iM257h];
        objArr[iM257h] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f348c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f348c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        m259k(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f348c;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iM257h = m257h(this.f346a + this.f348c);
        int i2 = this.f346a;
        if (i2 < iM257h) {
            AbstractC0650P4.m1311F(this.f347b, objArr, i2, iM257h, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f347b;
            AbstractC0650P4.m1310E(objArr2, objArr, 0, this.f346a, objArr2.length);
            Object[] objArr3 = this.f347b;
            AbstractC0650P4.m1310E(objArr3, objArr, objArr3.length - this.f346a, 0, iM257h);
        }
        int i3 = this.f348c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
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
        if (collection.isEmpty()) {
            return false;
        }
        m258j();
        m253b(collection.size() + this.f348c);
        m252a(m257h(this.f346a + this.f348c), collection);
        return true;
    }
}
