package p185m8;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p376zd.C10010p0;

/* JADX INFO: renamed from: m8.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5096o extends AbstractC5086j {

    /* JADX INFO: renamed from: t */
    public static final a f15407t = new a(null);

    /* JADX INFO: renamed from: u */
    public static final Object[] f15408u = new Object[0];

    /* JADX INFO: renamed from: q */
    public int f15409q;

    /* JADX INFO: renamed from: r */
    public Object[] f15410r = f15408u;

    /* JADX INFO: renamed from: s */
    public int f15411s;

    /* JADX INFO: renamed from: p */
    private final void m20623p(int i10) {
        if (i10 < 0) {
            C10010p0.m38820a("Deque is too big.");
            return;
        }
        Object[] objArr = this.f15410r;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f15408u) {
            this.f15410r = new Object[AbstractC2368o.m8578e(i10, 10)];
        } else {
            m20626l(AbstractC5078f.f15387q.m20524e(objArr.length, i10));
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m20624A(int i10, int i11) {
        int iM20633v = m20633v(this.f15409q + i11);
        int iM20633v2 = m20633v(this.f15409q + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f15410r;
            i11 = Math.min(size, Math.min(objArr.length - iM20633v, objArr.length - iM20633v2));
            Object[] objArr2 = this.f15410r;
            int i12 = iM20633v + i11;
            AbstractC5102r.m20660l(objArr2, objArr2, iM20633v2, iM20633v, i12);
            iM20633v = m20633v(i12);
            iM20633v2 = m20633v(iM20633v2 + i11);
        }
    }

    @Override // p185m8.AbstractC5086j
    /* JADX INFO: renamed from: a */
    public int mo72a() {
        return this.f15411s;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        AbstractC5078f.f15387q.m20522c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        m20634w();
        m20623p(size() + 1);
        int iM20633v = m20633v(this.f15409q + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iM20627o = m20627o(iM20633v);
            int iM20627o2 = m20627o(this.f15409q);
            int i11 = this.f15409q;
            Object[] objArr = this.f15410r;
            if (iM20627o >= i11) {
                objArr[iM20627o2] = objArr[i11];
                AbstractC5102r.m20660l(objArr, objArr, i11, i11 + 1, iM20627o + 1);
            } else {
                AbstractC5102r.m20660l(objArr, objArr, i11 - 1, i11, objArr.length);
                Object[] objArr2 = this.f15410r;
                objArr2[objArr2.length - 1] = objArr2[0];
                AbstractC5102r.m20660l(objArr2, objArr2, 0, 1, iM20627o + 1);
            }
            this.f15410r[iM20627o] = obj;
            this.f15409q = iM20627o2;
        } else {
            int iM20633v2 = m20633v(this.f15409q + size());
            Object[] objArr3 = this.f15410r;
            if (iM20633v < iM20633v2) {
                AbstractC5102r.m20660l(objArr3, objArr3, iM20633v + 1, iM20633v, iM20633v2);
            } else {
                AbstractC5102r.m20660l(objArr3, objArr3, 1, 0, iM20633v2);
                Object[] objArr4 = this.f15410r;
                objArr4[0] = objArr4[objArr4.length - 1];
                AbstractC5102r.m20660l(objArr4, objArr4, iM20633v + 1, iM20633v, objArr4.length - 1);
            }
            this.f15410r[iM20633v] = obj;
        }
        this.f15411s = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        collection.getClass();
        AbstractC5078f.f15387q.m20522c(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        m20634w();
        m20623p(size() + collection.size());
        int iM20633v = m20633v(this.f15409q + size());
        int iM20633v2 = m20633v(this.f15409q + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f15409q;
            int length = i11 - size;
            if (iM20633v2 >= i11) {
                Object[] objArr = this.f15410r;
                if (length >= 0) {
                    AbstractC5102r.m20660l(objArr, objArr, length, i11, iM20633v2);
                } else {
                    length += objArr.length;
                    int i12 = iM20633v2 - i11;
                    int length2 = objArr.length - length;
                    if (length2 >= i12) {
                        AbstractC5102r.m20660l(objArr, objArr, length, i11, iM20633v2);
                    } else {
                        AbstractC5102r.m20660l(objArr, objArr, length, i11, i11 + length2);
                        Object[] objArr2 = this.f15410r;
                        AbstractC5102r.m20660l(objArr2, objArr2, 0, this.f15409q + length2, iM20633v2);
                    }
                }
            } else {
                Object[] objArr3 = this.f15410r;
                AbstractC5102r.m20660l(objArr3, objArr3, length, i11, objArr3.length);
                Object[] objArr4 = this.f15410r;
                if (size >= iM20633v2) {
                    AbstractC5102r.m20660l(objArr4, objArr4, objArr4.length - size, 0, iM20633v2);
                } else {
                    AbstractC5102r.m20660l(objArr4, objArr4, objArr4.length - size, 0, size);
                    Object[] objArr5 = this.f15410r;
                    AbstractC5102r.m20660l(objArr5, objArr5, 0, size, iM20633v2);
                }
            }
            this.f15409q = length;
            m20625e(m20631t(iM20633v2 - size), collection);
        } else {
            int i13 = iM20633v2 + size;
            Object[] objArr6 = this.f15410r;
            if (iM20633v2 < iM20633v) {
                int i14 = size + iM20633v;
                if (i14 <= objArr6.length) {
                    AbstractC5102r.m20660l(objArr6, objArr6, i13, iM20633v2, iM20633v);
                } else if (i13 >= objArr6.length) {
                    AbstractC5102r.m20660l(objArr6, objArr6, i13 - objArr6.length, iM20633v2, iM20633v);
                } else {
                    int length3 = iM20633v - (i14 - objArr6.length);
                    AbstractC5102r.m20660l(objArr6, objArr6, 0, length3, iM20633v);
                    Object[] objArr7 = this.f15410r;
                    AbstractC5102r.m20660l(objArr7, objArr7, i13, iM20633v2, length3);
                }
            } else {
                AbstractC5102r.m20660l(objArr6, objArr6, size, 0, iM20633v);
                Object[] objArr8 = this.f15410r;
                if (i13 >= objArr8.length) {
                    AbstractC5102r.m20660l(objArr8, objArr8, i13 - objArr8.length, iM20633v2, objArr8.length);
                } else {
                    AbstractC5102r.m20660l(objArr8, objArr8, 0, objArr8.length - size, objArr8.length);
                    Object[] objArr9 = this.f15410r;
                    AbstractC5102r.m20660l(objArr9, objArr9, i13, iM20633v2, objArr9.length - size);
                }
            }
            m20625e(iM20633v2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        m20634w();
        m20623p(size() + 1);
        int iM20627o = m20627o(this.f15409q);
        this.f15409q = iM20627o;
        this.f15410r[iM20627o] = obj;
        this.f15411s = size() + 1;
    }

    public final void addLast(Object obj) {
        m20634w();
        m20623p(size() + 1);
        this.f15410r[m20633v(this.f15409q + size())] = obj;
        this.f15411s = size() + 1;
    }

    @Override // p185m8.AbstractC5086j
    /* JADX INFO: renamed from: c */
    public Object mo73c(int i10) {
        AbstractC5078f.f15387q.m20521b(i10, size());
        if (i10 == AbstractC5114x.m20802q(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        m20634w();
        int iM20633v = m20633v(this.f15409q + i10);
        Object obj = this.f15410r[iM20633v];
        int size = size() >> 1;
        int i11 = this.f15409q;
        if (i10 < size) {
            Object[] objArr = this.f15410r;
            if (iM20633v >= i11) {
                AbstractC5102r.m20660l(objArr, objArr, i11 + 1, i11, iM20633v);
            } else {
                AbstractC5102r.m20660l(objArr, objArr, 1, 0, iM20633v);
                Object[] objArr2 = this.f15410r;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f15409q;
                AbstractC5102r.m20660l(objArr2, objArr2, i12 + 1, i12, objArr2.length - 1);
            }
            Object[] objArr3 = this.f15410r;
            int i13 = this.f15409q;
            objArr3[i13] = null;
            this.f15409q = m20629r(i13);
        } else {
            int iM20633v2 = m20633v(i11 + AbstractC5114x.m20802q(this));
            Object[] objArr4 = this.f15410r;
            if (iM20633v <= iM20633v2) {
                AbstractC5102r.m20660l(objArr4, objArr4, iM20633v, iM20633v + 1, iM20633v2 + 1);
            } else {
                AbstractC5102r.m20660l(objArr4, objArr4, iM20633v, iM20633v + 1, objArr4.length);
                Object[] objArr5 = this.f15410r;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC5102r.m20660l(objArr5, objArr5, 0, 1, iM20633v2 + 1);
            }
            this.f15410r[iM20633v2] = null;
        }
        this.f15411s = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            m20634w();
            m20632u(this.f15409q, m20633v(this.f15409q + size()));
        }
        this.f15409q = 0;
        this.f15411s = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m20625e(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f15410r.length;
        while (i10 < length && it.hasNext()) {
            this.f15410r[i10] = it.next();
            i10++;
        }
        int i11 = this.f15409q;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f15410r[i12] = it.next();
        }
        this.f15411s = size() + collection.size();
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f15410r[this.f15409q];
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC5078f.f15387q.m20521b(i10, size());
        return this.f15410r[m20633v(this.f15409q + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iM20633v = m20633v(this.f15409q + size());
        int length = this.f15409q;
        if (length < iM20633v) {
            while (length < iM20633v) {
                if (AbstractC1061t.m3842c(obj, this.f15410r[length])) {
                    i10 = this.f15409q;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f15409q) < iM20633v) {
            return -1;
        }
        int length2 = this.f15410r.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iM20633v; i11++) {
                    if (AbstractC1061t.m3842c(obj, this.f15410r[i11])) {
                        length = i11 + this.f15410r.length;
                        i10 = this.f15409q;
                    }
                }
                return -1;
            }
            if (AbstractC1061t.m3842c(obj, this.f15410r[length])) {
                i10 = this.f15409q;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m20626l(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f15410r;
        AbstractC5102r.m20660l(objArr2, objArr, 0, this.f15409q, objArr2.length);
        Object[] objArr3 = this.f15410r;
        int length = objArr3.length;
        int i11 = this.f15409q;
        AbstractC5102r.m20660l(objArr3, objArr, length - i11, 0, i11);
        this.f15409q = 0;
        this.f15410r = objArr;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f15410r[m20633v(this.f15409q + AbstractC5114x.m20802q(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iM20732f0;
        int i10;
        int iM20633v = m20633v(this.f15409q + size());
        int i11 = this.f15409q;
        if (i11 < iM20633v) {
            iM20732f0 = iM20633v - 1;
            if (i11 <= iM20732f0) {
                while (!AbstractC1061t.m3842c(obj, this.f15410r[iM20732f0])) {
                    if (iM20732f0 != i11) {
                        iM20732f0--;
                    }
                }
                i10 = this.f15409q;
                return iM20732f0 - i10;
            }
            return -1;
        }
        if (!isEmpty() && this.f15409q >= iM20633v) {
            while (true) {
                iM20633v--;
                Object[] objArr = this.f15410r;
                if (-1 >= iM20633v) {
                    iM20732f0 = AbstractC5106t.m20732f0(objArr);
                    int i12 = this.f15409q;
                    if (i12 <= iM20732f0) {
                        while (!AbstractC1061t.m3842c(obj, this.f15410r[iM20732f0])) {
                            if (iM20732f0 != i12) {
                                iM20732f0--;
                            }
                        }
                        i10 = this.f15409q;
                    }
                } else if (AbstractC1061t.m3842c(obj, objArr[iM20633v])) {
                    iM20732f0 = iM20633v + this.f15410r.length;
                    i10 = this.f15409q;
                    break;
                }
            }
            return iM20732f0 - i10;
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public final int m20627o(int i10) {
        return i10 == 0 ? AbstractC5106t.m20732f0(this.f15410r) : i10 - 1;
    }

    /* JADX INFO: renamed from: q */
    public final Object m20628q() {
        if (isEmpty()) {
            return null;
        }
        return this.f15410r[this.f15409q];
    }

    /* JADX INFO: renamed from: r */
    public final int m20629r(int i10) {
        if (i10 == AbstractC5106t.m20732f0(this.f15410r)) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo73c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int iM20633v;
        Object[] objArr;
        collection.getClass();
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f15410r.length != 0) {
            int iM20633v2 = m20633v(this.f15409q + size());
            int i10 = this.f15409q;
            if (i10 < iM20633v2) {
                iM20633v = i10;
                while (true) {
                    objArr = this.f15410r;
                    if (i10 >= iM20633v2) {
                        break;
                    }
                    Object obj = objArr[i10];
                    if (collection.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f15410r[iM20633v] = obj;
                        iM20633v++;
                    }
                    i10++;
                }
                AbstractC5102r.m20672x(objArr, null, iM20633v, iM20633v2);
            } else {
                int length = this.f15410r.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr2 = this.f15410r;
                    Object obj2 = objArr2[i10];
                    objArr2[i10] = null;
                    if (collection.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f15410r[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iM20633v = m20633v(i11);
                for (int i12 = 0; i12 < iM20633v2; i12++) {
                    Object[] objArr3 = this.f15410r;
                    Object obj3 = objArr3[i12];
                    objArr3[i12] = null;
                    if (collection.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f15410r[iM20633v] = obj3;
                        iM20633v = m20629r(iM20633v);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                m20634w();
                this.f15411s = m20631t(iM20633v - this.f15409q);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m20634w();
        Object[] objArr = this.f15410r;
        int i10 = this.f15409q;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f15409q = m20629r(i10);
        this.f15411s = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m20634w();
        int iM20633v = m20633v(this.f15409q + AbstractC5114x.m20802q(this));
        Object[] objArr = this.f15410r;
        Object obj = objArr[iM20633v];
        objArr[iM20633v] = null;
        this.f15411s = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        AbstractC5078f.f15387q.m20523d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            mo73c(i10);
            return;
        }
        m20634w();
        if (i10 < size() - i11) {
            m20637z(i10, i11);
            int iM20633v = m20633v(this.f15409q + i12);
            m20632u(this.f15409q, iM20633v);
            this.f15409q = iM20633v;
        } else {
            m20624A(i10, i11);
            int iM20633v2 = m20633v(this.f15409q + size());
            m20632u(m20631t(iM20633v2 - i12), iM20633v2);
        }
        this.f15411s = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int iM20633v;
        Object[] objArr;
        collection.getClass();
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f15410r.length != 0) {
            int iM20633v2 = m20633v(this.f15409q + size());
            int i10 = this.f15409q;
            if (i10 < iM20633v2) {
                iM20633v = i10;
                while (true) {
                    objArr = this.f15410r;
                    if (i10 >= iM20633v2) {
                        break;
                    }
                    Object obj = objArr[i10];
                    if (collection.contains(obj)) {
                        this.f15410r[iM20633v] = obj;
                        iM20633v++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                AbstractC5102r.m20672x(objArr, null, iM20633v, iM20633v2);
            } else {
                int length = this.f15410r.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr2 = this.f15410r;
                    Object obj2 = objArr2[i10];
                    objArr2[i10] = null;
                    if (collection.contains(obj2)) {
                        this.f15410r[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iM20633v = m20633v(i11);
                for (int i12 = 0; i12 < iM20633v2; i12++) {
                    Object[] objArr3 = this.f15410r;
                    Object obj3 = objArr3[i12];
                    objArr3[i12] = null;
                    if (collection.contains(obj3)) {
                        this.f15410r[iM20633v] = obj3;
                        iM20633v = m20629r(iM20633v);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                m20634w();
                this.f15411s = m20631t(iM20633v - this.f15409q);
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: s */
    public final Object m20630s() {
        if (isEmpty()) {
            return null;
        }
        return this.f15410r[m20633v(this.f15409q + AbstractC5114x.m20802q(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        AbstractC5078f.f15387q.m20521b(i10, size());
        int iM20633v = m20633v(this.f15409q + i10);
        Object[] objArr = this.f15410r;
        Object obj2 = objArr[iM20633v];
        objArr[iM20633v] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final int m20631t(int i10) {
        return i10 < 0 ? i10 + this.f15410r.length : i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = AbstractC5098p.m20638a(objArr, size());
        }
        Object[] objArr2 = objArr;
        int iM20633v = m20633v(this.f15409q + size());
        int i10 = this.f15409q;
        if (i10 < iM20633v) {
            AbstractC5102r.m20665q(this.f15410r, objArr2, 0, i10, iM20633v, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.f15410r;
            AbstractC5102r.m20660l(objArr3, objArr2, 0, this.f15409q, objArr3.length);
            Object[] objArr4 = this.f15410r;
            AbstractC5102r.m20660l(objArr4, objArr2, objArr4.length - this.f15409q, 0, iM20633v);
        }
        return AbstractC5112w.m20791g(size(), objArr2);
    }

    /* JADX INFO: renamed from: u */
    public final void m20632u(int i10, int i11) {
        Object[] objArr = this.f15410r;
        if (i10 < i11) {
            AbstractC5102r.m20672x(objArr, null, i10, i11);
        } else {
            AbstractC5102r.m20672x(objArr, null, i10, objArr.length);
            AbstractC5102r.m20672x(this.f15410r, null, 0, i11);
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m20633v(int i10) {
        Object[] objArr = this.f15410r;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    /* JADX INFO: renamed from: w */
    public final void m20634w() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: x */
    public final Object m20635x() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    /* JADX INFO: renamed from: y */
    public final Object m20636y() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    /* JADX INFO: renamed from: z */
    public final void m20637z(int i10, int i11) {
        int iM20633v = m20633v(this.f15409q + (i10 - 1));
        int iM20633v2 = m20633v(this.f15409q + (i11 - 1));
        while (i10 > 0) {
            int i12 = iM20633v + 1;
            int iMin = Math.min(i10, Math.min(i12, iM20633v2 + 1));
            Object[] objArr = this.f15410r;
            int i13 = iM20633v2 - iMin;
            int i14 = iM20633v - iMin;
            AbstractC5102r.m20660l(objArr, objArr, i13 + 1, i14 + 1, i12);
            iM20633v = m20631t(i14);
            iM20633v2 = m20631t(i13);
            i10 -= iMin;
        }
    }

    /* JADX INFO: renamed from: m8.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        m20634w();
        m20623p(size() + collection.size());
        m20625e(m20633v(this.f15409q + size()), collection);
        return true;
    }
}
