package tf;

import gg.AbstractC1416l;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import p136j8.C2104o;

/* JADX INFO: renamed from: tf.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4164k extends AbstractC4160g {

    /* JADX INFO: renamed from: j */
    public static final Object[] f13705j = new Object[0];

    /* JADX INFO: renamed from: g */
    public int f13706g;

    /* JADX INFO: renamed from: h */
    public Object[] f13707h = f13705j;

    /* JADX INFO: renamed from: i */
    public int f13708i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4160g
    /* JADX INFO: renamed from: a */
    public final int mo6457a() {
        return this.f13708i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int length;
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f13708i;
        c4153c.getClass();
        C4153c.m8346b(i9, i10);
        if (i9 == this.f13708i) {
            addLast(obj);
            return;
        }
        if (i9 == 0) {
            addFirst(obj);
            return;
        }
        m8363k();
        m8357e(this.f13708i + 1);
        int iM8362j = m8362j(this.f13706g + i9);
        int i11 = this.f13708i;
        if (i9 < ((i11 + 1) >> 1)) {
            if (iM8362j == 0) {
                Object[] objArr = this.f13707h;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iM8362j - 1;
            }
            int length2 = this.f13706g;
            if (length2 == 0) {
                Object[] objArr2 = this.f13707h;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i12 = length2 - 1;
            int i13 = this.f13706g;
            Object[] objArr3 = this.f13707h;
            if (length >= i13) {
                objArr3[i12] = objArr3[i13];
                AbstractC4165l.m8379n0(i13, i13 + 1, objArr3, length + 1, objArr3);
            } else {
                AbstractC4165l.m8379n0(i13 - 1, i13, objArr3, objArr3.length, objArr3);
                Object[] objArr4 = this.f13707h;
                objArr4[objArr4.length - 1] = objArr4[0];
                AbstractC4165l.m8379n0(0, 1, objArr4, length + 1, objArr4);
            }
            this.f13707h[length] = obj;
            this.f13706g = i12;
        } else {
            int iM8362j2 = m8362j(i11 + this.f13706g);
            Object[] objArr5 = this.f13707h;
            if (iM8362j < iM8362j2) {
                AbstractC4165l.m8379n0(iM8362j + 1, iM8362j, objArr5, iM8362j2, objArr5);
            } else {
                AbstractC4165l.m8379n0(1, 0, objArr5, iM8362j2, objArr5);
                Object[] objArr6 = this.f13707h;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC4165l.m8379n0(iM8362j + 1, iM8362j, objArr6, objArr6.length - 1, objArr6);
            }
            this.f13707h[iM8362j] = obj;
        }
        this.f13708i++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        collection.getClass();
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f13708i;
        c4153c.getClass();
        C4153c.m8346b(i9, i10);
        if (collection.isEmpty()) {
            return false;
        }
        if (i9 == this.f13708i) {
            return addAll(collection);
        }
        m8363k();
        m8357e(collection.size() + this.f13708i);
        int iM8362j = m8362j(this.f13708i + this.f13706g);
        int iM8362j2 = m8362j(this.f13706g + i9);
        int size = collection.size();
        if (i9 >= ((this.f13708i + 1) >> 1)) {
            int i11 = iM8362j2 + size;
            Object[] objArr = this.f13707h;
            if (iM8362j2 < iM8362j) {
                int i12 = size + iM8362j;
                if (i12 <= objArr.length) {
                    AbstractC4165l.m8379n0(i11, iM8362j2, objArr, iM8362j, objArr);
                } else if (i11 >= objArr.length) {
                    AbstractC4165l.m8379n0(i11 - objArr.length, iM8362j2, objArr, iM8362j, objArr);
                } else {
                    int length = iM8362j - (i12 - objArr.length);
                    AbstractC4165l.m8379n0(0, length, objArr, iM8362j, objArr);
                    Object[] objArr2 = this.f13707h;
                    AbstractC4165l.m8379n0(i11, iM8362j2, objArr2, length, objArr2);
                }
            } else {
                AbstractC4165l.m8379n0(size, 0, objArr, iM8362j, objArr);
                Object[] objArr3 = this.f13707h;
                if (i11 >= objArr3.length) {
                    AbstractC4165l.m8379n0(i11 - objArr3.length, iM8362j2, objArr3, objArr3.length, objArr3);
                } else {
                    AbstractC4165l.m8379n0(0, objArr3.length - size, objArr3, objArr3.length, objArr3);
                    Object[] objArr4 = this.f13707h;
                    AbstractC4165l.m8379n0(i11, iM8362j2, objArr4, objArr4.length - size, objArr4);
                }
            }
            m8356d(iM8362j2, collection);
            return true;
        }
        int i13 = this.f13706g;
        int length2 = i13 - size;
        Object[] objArr5 = this.f13707h;
        if (iM8362j2 < i13) {
            AbstractC4165l.m8379n0(length2, i13, objArr5, objArr5.length, objArr5);
            Object[] objArr6 = this.f13707h;
            if (size >= iM8362j2) {
                AbstractC4165l.m8379n0(objArr6.length - size, 0, objArr6, iM8362j2, objArr6);
            } else {
                AbstractC4165l.m8379n0(objArr6.length - size, 0, objArr6, size, objArr6);
                Object[] objArr7 = this.f13707h;
                AbstractC4165l.m8379n0(0, size, objArr7, iM8362j2, objArr7);
            }
        } else if (length2 >= 0) {
            AbstractC4165l.m8379n0(length2, i13, objArr5, iM8362j2, objArr5);
        } else {
            length2 += objArr5.length;
            int i14 = iM8362j2 - i13;
            int length3 = objArr5.length - length2;
            if (length3 >= i14) {
                AbstractC4165l.m8379n0(length2, i13, objArr5, iM8362j2, objArr5);
            } else {
                AbstractC4165l.m8379n0(length2, i13, objArr5, i13 + length3, objArr5);
                Object[] objArr8 = this.f13707h;
                AbstractC4165l.m8379n0(0, this.f13706g + length3, objArr8, iM8362j2, objArr8);
            }
        }
        this.f13706g = length2;
        m8356d(m8360h(iM8362j2 - size), collection);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addFirst(Object obj) {
        m8363k();
        m8357e(this.f13708i + 1);
        int length = this.f13706g;
        if (length == 0) {
            Object[] objArr = this.f13707h;
            objArr.getClass();
            length = objArr.length;
        }
        int i9 = length - 1;
        this.f13706g = i9;
        this.f13707h[i9] = obj;
        this.f13708i++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addLast(Object obj) {
        m8363k();
        m8357e(mo6457a() + 1);
        this.f13707h[m8362j(mo6457a() + this.f13706g)] = obj;
        this.f13708i = mo6457a() + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4160g
    /* JADX INFO: renamed from: c */
    public final Object mo6458c(int i9) {
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f13708i;
        c4153c.getClass();
        C4153c.m8345a(i9, i10);
        if (i9 == mo6457a() - 1) {
            return removeLast();
        }
        if (i9 == 0) {
            return removeFirst();
        }
        m8363k();
        int iM8362j = m8362j(this.f13706g + i9);
        Object[] objArr = this.f13707h;
        Object obj = objArr[iM8362j];
        int i11 = this.f13708i >> 1;
        int i12 = this.f13706g;
        if (i9 < i11) {
            if (iM8362j >= i12) {
                AbstractC4165l.m8379n0(i12 + 1, i12, objArr, iM8362j, objArr);
            } else {
                AbstractC4165l.m8379n0(1, 0, objArr, iM8362j, objArr);
                Object[] objArr2 = this.f13707h;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f13706g;
                AbstractC4165l.m8379n0(i13 + 1, i13, objArr2, objArr2.length - 1, objArr2);
            }
            Object[] objArr3 = this.f13707h;
            int i14 = this.f13706g;
            objArr3[i14] = null;
            this.f13706g = m8358f(i14);
        } else {
            int iM8362j2 = m8362j((mo6457a() - 1) + i12);
            Object[] objArr4 = this.f13707h;
            if (iM8362j <= iM8362j2) {
                AbstractC4165l.m8379n0(iM8362j, iM8362j + 1, objArr4, iM8362j2 + 1, objArr4);
            } else {
                AbstractC4165l.m8379n0(iM8362j, iM8362j + 1, objArr4, objArr4.length, objArr4);
                Object[] objArr5 = this.f13707h;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC4165l.m8379n0(0, 1, objArr5, iM8362j2 + 1, objArr5);
            }
            this.f13707h[iM8362j2] = null;
        }
        this.f13708i--;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m8363k();
            m8361i(this.f13706g, m8362j(mo6457a() + this.f13706g));
        }
        this.f13706g = 0;
        this.f13708i = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m8356d(int i9, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f13707h.length;
        while (i9 < length && it.hasNext()) {
            this.f13707h[i9] = it.next();
            i9++;
        }
        int i10 = this.f13706g;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f13707h[i11] = it.next();
        }
        this.f13708i = collection.size() + this.f13708i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m8357e(int i9) {
        if (i9 < 0) {
            C2104o.m5276A("Deque is too big.");
            return;
        }
        Object[] objArr = this.f13707h;
        if (i9 <= objArr.length) {
            return;
        }
        if (objArr == f13705j) {
            if (i9 < 10) {
                i9 = 10;
            }
            this.f13707h = new Object[i9];
            return;
        }
        C4153c c4153c = AbstractC4159f.Companion;
        int length = objArr.length;
        c4153c.getClass();
        Object[] objArr2 = new Object[C4153c.m8348d(length, i9)];
        Object[] objArr3 = this.f13707h;
        AbstractC4165l.m8379n0(0, this.f13706g, objArr3, objArr3.length, objArr2);
        Object[] objArr4 = this.f13707h;
        int length2 = objArr4.length;
        int i10 = this.f13706g;
        AbstractC4165l.m8379n0(length2 - i10, 0, objArr4, i10, objArr2);
        this.f13706g = 0;
        this.f13707h = objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m8358f(int i9) {
        this.f13707h.getClass();
        if (i9 == r0.length - 1) {
            return 0;
        }
        return i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Object m8359g() {
        if (isEmpty()) {
            return null;
        }
        return this.f13707h[m8362j((size() - 1) + this.f13706g)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f13708i;
        c4153c.getClass();
        C4153c.m8345a(i9, i10);
        return this.f13707h[m8362j(this.f13706g + i9)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m8360h(int i9) {
        return i9 < 0 ? i9 + this.f13707h.length : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m8361i(int i9, int i10) {
        Object[] objArr = this.f13707h;
        if (i9 < i10) {
            AbstractC4165l.m8387v0(i9, i10, null, objArr);
        } else {
            AbstractC4165l.m8387v0(i9, objArr.length, null, objArr);
            AbstractC4165l.m8387v0(0, i10, null, this.f13707h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i9;
        int iM8362j = m8362j(mo6457a() + this.f13706g);
        int length = this.f13706g;
        if (length < iM8362j) {
            while (length < iM8362j) {
                if (AbstractC1416l.m3825a(obj, this.f13707h[length])) {
                    i9 = this.f13706g;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f13706g) < iM8362j) {
            return -1;
        }
        int length2 = this.f13707h.length;
        while (true) {
            if (length >= length2) {
                for (int i10 = 0; i10 < iM8362j; i10++) {
                    if (AbstractC1416l.m3825a(obj, this.f13707h[i10])) {
                        length = i10 + this.f13707h.length;
                        i9 = this.f13706g;
                    }
                }
                return -1;
            }
            if (AbstractC1416l.m3825a(obj, this.f13707h[length])) {
                i9 = this.f13706g;
                break;
            }
            length++;
        }
        return length - i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo6457a() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m8362j(int i9) {
        Object[] objArr = this.f13707h;
        return i9 >= objArr.length ? i9 - objArr.length : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m8363k() {
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object last() {
        if (isEmpty()) {
            C2104o.m5287l("ArrayDeque is empty.");
            return null;
        }
        return this.f13707h[m8362j((size() - 1) + this.f13706g)];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:18:0x0031 */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i9;
        int iM8362j = m8362j(this.f13708i + this.f13706g);
        int i10 = this.f13706g;
        if (i10 < iM8362j) {
            length = iM8362j - 1;
            if (i10 <= length) {
                while (!AbstractC1416l.m3825a(obj, this.f13707h[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i9 = this.f13706g;
                return length - i9;
            }
            return -1;
        }
        if (!isEmpty() && this.f13706g >= iM8362j) {
            while (true) {
                iM8362j--;
                Object[] objArr = this.f13707h;
                if (-1 >= iM8362j) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i11 = this.f13706g;
                    if (i11 <= length) {
                        while (!AbstractC1416l.m3825a(obj, this.f13707h[length])) {
                            if (length != i11) {
                                length--;
                            }
                        }
                        i9 = this.f13706g;
                    }
                } else if (AbstractC1416l.m3825a(obj, objArr[iM8362j])) {
                    length = iM8362j + this.f13707h.length;
                    i9 = this.f13706g;
                    break;
                }
            }
            return length - i9;
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
        mo6458c(iIndexOf);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM8362j;
        Object[] objArr;
        collection.getClass();
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f13707h.length != 0) {
            int iM8362j2 = m8362j(mo6457a() + this.f13706g);
            int i9 = this.f13706g;
            if (i9 < iM8362j2) {
                iM8362j = i9;
                while (true) {
                    objArr = this.f13707h;
                    if (i9 >= iM8362j2) {
                        break;
                    }
                    Object obj = objArr[i9];
                    if (collection.contains(obj)) {
                        z9 = true;
                    } else {
                        this.f13707h[iM8362j] = obj;
                        iM8362j++;
                    }
                    i9++;
                }
                AbstractC4165l.m8387v0(iM8362j, iM8362j2, null, objArr);
            } else {
                int length = this.f13707h.length;
                boolean z10 = false;
                int i10 = i9;
                while (i9 < length) {
                    Object[] objArr2 = this.f13707h;
                    Object obj2 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f13707h[i10] = obj2;
                        i10++;
                    }
                    i9++;
                }
                iM8362j = m8362j(i10);
                for (int i11 = 0; i11 < iM8362j2; i11++) {
                    Object[] objArr3 = this.f13707h;
                    Object obj3 = objArr3[i11];
                    objArr3[i11] = null;
                    if (collection.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f13707h[iM8362j] = obj3;
                        iM8362j = m8358f(iM8362j);
                    }
                }
                z9 = z10;
            }
            if (z9) {
                m8363k();
                this.f13708i = m8360h(iM8362j - this.f13706g);
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object removeFirst() {
        if (isEmpty()) {
            C2104o.m5287l("ArrayDeque is empty.");
            return null;
        }
        m8363k();
        Object[] objArr = this.f13707h;
        int i9 = this.f13706g;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.f13706g = m8358f(i9);
        this.f13708i = mo6457a() - 1;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object removeLast() {
        if (isEmpty()) {
            C2104o.m5287l("ArrayDeque is empty.");
            return null;
        }
        m8363k();
        int iM8362j = m8362j((size() - 1) + this.f13706g);
        Object[] objArr = this.f13707h;
        Object obj = objArr[iM8362j];
        objArr[iM8362j] = null;
        this.f13708i = mo6457a() - 1;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        C4153c c4153c = AbstractC4159f.Companion;
        int i11 = this.f13708i;
        c4153c.getClass();
        C4153c.m8347c(i9, i10, i11);
        int i12 = i10 - i9;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f13708i) {
            clear();
            return;
        }
        if (i12 == 1) {
            mo6458c(i9);
            return;
        }
        m8363k();
        int i13 = this.f13708i - i10;
        int i14 = this.f13706g;
        if (i9 < i13) {
            int iM8362j = m8362j((i9 - 1) + i14);
            int iM8362j2 = m8362j(this.f13706g + (i10 - 1));
            while (i9 > 0) {
                int i15 = iM8362j + 1;
                int iMin = Math.min(i9, Math.min(i15, iM8362j2 + 1));
                Object[] objArr = this.f13707h;
                int i16 = iM8362j2 - iMin;
                int i17 = iM8362j - iMin;
                AbstractC4165l.m8379n0(i16 + 1, i17 + 1, objArr, i15, objArr);
                iM8362j = m8360h(i17);
                iM8362j2 = m8360h(i16);
                i9 -= iMin;
            }
            int iM8362j3 = m8362j(this.f13706g + i12);
            m8361i(this.f13706g, iM8362j3);
            this.f13706g = iM8362j3;
        } else {
            int iM8362j4 = m8362j(i14 + i10);
            int iM8362j5 = m8362j(this.f13706g + i9);
            int i18 = this.f13708i;
            while (true) {
                i18 -= i10;
                if (i18 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f13707h;
                i10 = Math.min(i18, Math.min(objArr2.length - iM8362j4, objArr2.length - iM8362j5));
                Object[] objArr3 = this.f13707h;
                int i19 = iM8362j4 + i10;
                AbstractC4165l.m8379n0(iM8362j5, iM8362j4, objArr3, i19, objArr3);
                iM8362j4 = m8362j(i19);
                iM8362j5 = m8362j(iM8362j5 + i10);
            }
            int iM8362j6 = m8362j(this.f13708i + this.f13706g);
            m8361i(m8360h(iM8362j6 - i12), iM8362j6);
        }
        this.f13708i -= i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM8362j;
        Object[] objArr;
        collection.getClass();
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f13707h.length != 0) {
            int iM8362j2 = m8362j(mo6457a() + this.f13706g);
            int i9 = this.f13706g;
            if (i9 < iM8362j2) {
                iM8362j = i9;
                while (true) {
                    objArr = this.f13707h;
                    if (i9 >= iM8362j2) {
                        break;
                    }
                    Object obj = objArr[i9];
                    if (collection.contains(obj)) {
                        this.f13707h[iM8362j] = obj;
                        iM8362j++;
                    } else {
                        z9 = true;
                    }
                    i9++;
                }
                AbstractC4165l.m8387v0(iM8362j, iM8362j2, null, objArr);
            } else {
                int length = this.f13707h.length;
                boolean z10 = false;
                int i10 = i9;
                while (i9 < length) {
                    Object[] objArr2 = this.f13707h;
                    Object obj2 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj2)) {
                        this.f13707h[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i9++;
                }
                iM8362j = m8362j(i10);
                for (int i11 = 0; i11 < iM8362j2; i11++) {
                    Object[] objArr3 = this.f13707h;
                    Object obj3 = objArr3[i11];
                    objArr3[i11] = null;
                    if (collection.contains(obj3)) {
                        this.f13707h[iM8362j] = obj3;
                        iM8362j = m8358f(iM8362j);
                    } else {
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                m8363k();
                this.f13708i = m8360h(iM8362j - this.f13706g);
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        C4153c c4153c = AbstractC4159f.Companion;
        int i10 = this.f13708i;
        c4153c.getClass();
        C4153c.m8345a(i9, i10);
        int iM8362j = m8362j(this.f13706g + i9);
        Object[] objArr = this.f13707h;
        Object obj2 = objArr[iM8362j];
        objArr[iM8362j] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i9 = this.f13708i;
        if (length < i9) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i9);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iM8362j = m8362j(this.f13708i + this.f13706g);
        int i10 = this.f13706g;
        if (i10 < iM8362j) {
            AbstractC4165l.m8383r0(i10, iM8362j, this.f13707h, 2, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f13707h;
            AbstractC4165l.m8379n0(0, this.f13706g, objArr2, objArr2.length, objArr);
            Object[] objArr3 = this.f13707h;
            AbstractC4165l.m8379n0(objArr3.length - this.f13706g, 0, objArr3, iM8362j, objArr);
        }
        int i11 = this.f13708i;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo6457a()]);
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
        m8363k();
        m8357e(collection.size() + mo6457a());
        m8356d(m8362j(mo6457a() + this.f13706g), collection);
        return true;
    }
}
