package p009E0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: E0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0178i extends AbstractC0176g {

    /* JADX INFO: renamed from: d */
    public static final Object[] f393d = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f394a;

    /* JADX INFO: renamed from: b */
    public Object[] f395b = f393d;

    /* JADX INFO: renamed from: c */
    public int f396c;

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: a */
    public final int mo521a() {
        return this.f396c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int length;
        int i3 = this.f396c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        if (i2 == i3) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        m529i();
        m524d(this.f396c + 1);
        int iM528h = m528h(this.f394a + i2);
        int i4 = this.f396c;
        if (i2 < ((i4 + 1) >> 1)) {
            if (iM528h == 0) {
                Object[] objArr = this.f395b;
                AbstractC0307g.m703e(objArr, "<this>");
                iM528h = objArr.length;
            }
            int i5 = iM528h - 1;
            int i6 = this.f394a;
            if (i6 == 0) {
                Object[] objArr2 = this.f395b;
                AbstractC0307g.m703e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i7 = this.f394a;
            if (i5 >= i7) {
                Object[] objArr3 = this.f395b;
                objArr3[length] = objArr3[i7];
                AbstractC0179j.m533j0(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f395b;
                AbstractC0179j.m533j0(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.f395b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0179j.m533j0(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.f395b[i5] = obj;
            this.f394a = length;
        } else {
            int iM528h2 = m528h(i4 + this.f394a);
            if (iM528h < iM528h2) {
                Object[] objArr6 = this.f395b;
                AbstractC0179j.m533j0(objArr6, objArr6, iM528h + 1, iM528h, iM528h2);
            } else {
                Object[] objArr7 = this.f395b;
                AbstractC0179j.m533j0(objArr7, objArr7, 1, 0, iM528h2);
                Object[] objArr8 = this.f395b;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC0179j.m533j0(objArr8, objArr8, iM528h + 1, iM528h, objArr8.length - 1);
            }
            this.f395b[iM528h] = obj;
        }
        this.f396c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        AbstractC0307g.m703e(collection, "elements");
        int i3 = this.f396c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == this.f396c) {
            return addAll(collection);
        }
        m529i();
        m524d(collection.size() + this.f396c);
        int iM528h = m528h(this.f396c + this.f394a);
        int iM528h2 = m528h(this.f394a + i2);
        int size = collection.size();
        if (i2 < ((this.f396c + 1) >> 1)) {
            int i4 = this.f394a;
            int length = i4 - size;
            if (iM528h2 < i4) {
                Object[] objArr = this.f395b;
                AbstractC0179j.m533j0(objArr, objArr, length, i4, objArr.length);
                if (size >= iM528h2) {
                    Object[] objArr2 = this.f395b;
                    AbstractC0179j.m533j0(objArr2, objArr2, objArr2.length - size, 0, iM528h2);
                } else {
                    Object[] objArr3 = this.f395b;
                    AbstractC0179j.m533j0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f395b;
                    AbstractC0179j.m533j0(objArr4, objArr4, 0, size, iM528h2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f395b;
                AbstractC0179j.m533j0(objArr5, objArr5, length, i4, iM528h2);
            } else {
                Object[] objArr6 = this.f395b;
                length += objArr6.length;
                int i5 = iM528h2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    AbstractC0179j.m533j0(objArr6, objArr6, length, i4, iM528h2);
                } else {
                    AbstractC0179j.m533j0(objArr6, objArr6, length, i4, i4 + length2);
                    Object[] objArr7 = this.f395b;
                    AbstractC0179j.m533j0(objArr7, objArr7, 0, this.f394a + length2, iM528h2);
                }
            }
            this.f394a = length;
            m523c(m526f(iM528h2 - size), collection);
        } else {
            int i6 = iM528h2 + size;
            if (iM528h2 < iM528h) {
                int i7 = size + iM528h;
                Object[] objArr8 = this.f395b;
                if (i7 <= objArr8.length) {
                    AbstractC0179j.m533j0(objArr8, objArr8, i6, iM528h2, iM528h);
                } else if (i6 >= objArr8.length) {
                    AbstractC0179j.m533j0(objArr8, objArr8, i6 - objArr8.length, iM528h2, iM528h);
                } else {
                    int length3 = iM528h - (i7 - objArr8.length);
                    AbstractC0179j.m533j0(objArr8, objArr8, 0, length3, iM528h);
                    Object[] objArr9 = this.f395b;
                    AbstractC0179j.m533j0(objArr9, objArr9, i6, iM528h2, length3);
                }
            } else {
                Object[] objArr10 = this.f395b;
                AbstractC0179j.m533j0(objArr10, objArr10, size, 0, iM528h);
                Object[] objArr11 = this.f395b;
                if (i6 >= objArr11.length) {
                    AbstractC0179j.m533j0(objArr11, objArr11, i6 - objArr11.length, iM528h2, objArr11.length);
                } else {
                    AbstractC0179j.m533j0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f395b;
                    AbstractC0179j.m533j0(objArr12, objArr12, i6, iM528h2, objArr12.length - size);
                }
            }
            m523c(iM528h2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        m529i();
        m524d(this.f396c + 1);
        int length = this.f394a;
        if (length == 0) {
            Object[] objArr = this.f395b;
            AbstractC0307g.m703e(objArr, "<this>");
            length = objArr.length;
        }
        int i2 = length - 1;
        this.f394a = i2;
        this.f395b[i2] = obj;
        this.f396c++;
    }

    public final void addLast(Object obj) {
        m529i();
        m524d(mo521a() + 1);
        this.f395b[m528h(mo521a() + this.f394a)] = obj;
        this.f396c = mo521a() + 1;
    }

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: b */
    public final Object mo522b(int i2) {
        int i3 = this.f396c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        if (i2 == AbstractC0182m.m555g0(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        m529i();
        int iM528h = m528h(this.f394a + i2);
        Object[] objArr = this.f395b;
        Object obj = objArr[iM528h];
        if (i2 < (this.f396c >> 1)) {
            int i4 = this.f394a;
            if (iM528h >= i4) {
                AbstractC0179j.m533j0(objArr, objArr, i4 + 1, i4, iM528h);
            } else {
                AbstractC0179j.m533j0(objArr, objArr, 1, 0, iM528h);
                Object[] objArr2 = this.f395b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f394a;
                AbstractC0179j.m533j0(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f395b;
            int i6 = this.f394a;
            objArr3[i6] = null;
            this.f394a = m525e(i6);
        } else {
            int iM528h2 = m528h(AbstractC0182m.m555g0(this) + this.f394a);
            if (iM528h <= iM528h2) {
                Object[] objArr4 = this.f395b;
                AbstractC0179j.m533j0(objArr4, objArr4, iM528h, iM528h + 1, iM528h2 + 1);
            } else {
                Object[] objArr5 = this.f395b;
                AbstractC0179j.m533j0(objArr5, objArr5, iM528h, iM528h + 1, objArr5.length);
                Object[] objArr6 = this.f395b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0179j.m533j0(objArr6, objArr6, 0, 1, iM528h2 + 1);
            }
            this.f395b[iM528h2] = null;
        }
        this.f396c--;
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m523c(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f395b.length;
        while (i2 < length && it.hasNext()) {
            this.f395b[i2] = it.next();
            i2++;
        }
        int i3 = this.f394a;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f395b[i4] = it.next();
        }
        this.f396c = collection.size() + mo521a();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m529i();
            m527g(this.f394a, m528h(mo521a() + this.f394a));
        }
        this.f394a = 0;
        this.f396c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m524d(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f395b;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f393d) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f395b = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        AbstractC0179j.m533j0(objArr, objArr2, 0, this.f394a, objArr.length);
        Object[] objArr3 = this.f395b;
        int length2 = objArr3.length;
        int i4 = this.f394a;
        AbstractC0179j.m533j0(objArr3, objArr2, length2 - i4, 0, i4);
        this.f394a = 0;
        this.f395b = objArr2;
    }

    /* JADX INFO: renamed from: e */
    public final int m525e(int i2) {
        AbstractC0307g.m703e(this.f395b, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    /* JADX INFO: renamed from: f */
    public final int m526f(int i2) {
        return i2 < 0 ? i2 + this.f395b.length : i2;
    }

    /* JADX INFO: renamed from: g */
    public final void m527g(int i2, int i3) {
        if (i2 < i3) {
            AbstractC0179j.m534k0(this.f395b, i2, i3);
            return;
        }
        Object[] objArr = this.f395b;
        AbstractC0179j.m534k0(objArr, i2, objArr.length);
        AbstractC0179j.m534k0(this.f395b, 0, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int iMo521a = mo521a();
        if (i2 < 0 || i2 >= iMo521a) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", iMo521a));
        }
        return this.f395b[m528h(this.f394a + i2)];
    }

    /* JADX INFO: renamed from: h */
    public final int m528h(int i2) {
        Object[] objArr = this.f395b;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    /* JADX INFO: renamed from: i */
    public final void m529i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iM528h = m528h(mo521a() + this.f394a);
        int length = this.f394a;
        if (length < iM528h) {
            while (length < iM528h) {
                if (AbstractC0307g.m699a(obj, this.f395b[length])) {
                    i2 = this.f394a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM528h) {
            return -1;
        }
        int length2 = this.f395b.length;
        while (true) {
            if (length >= length2) {
                for (int i3 = 0; i3 < iM528h; i3++) {
                    if (AbstractC0307g.m699a(obj, this.f395b[i3])) {
                        length = i3 + this.f395b.length;
                        i2 = this.f394a;
                    }
                }
                return -1;
            }
            if (AbstractC0307g.m699a(obj, this.f395b[length])) {
                i2 = this.f394a;
                break;
            }
            length++;
        }
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo521a() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int iM528h = m528h(this.f396c + this.f394a);
        int i3 = this.f394a;
        if (i3 < iM528h) {
            length = iM528h - 1;
            if (i3 <= length) {
                while (!AbstractC0307g.m699a(obj, this.f395b[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f394a;
                return length - i2;
            }
            return -1;
        }
        if (i3 > iM528h) {
            int i4 = iM528h - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f395b;
                    AbstractC0307g.m703e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f394a;
                    if (i5 <= length) {
                        while (!AbstractC0307g.m699a(obj, this.f395b[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f394a;
                    }
                } else {
                    if (AbstractC0307g.m699a(obj, this.f395b[i4])) {
                        length = i4 + this.f395b.length;
                        i2 = this.f394a;
                        break;
                    }
                    i4--;
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
        mo522b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM528h;
        AbstractC0307g.m703e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f395b.length != 0) {
            int iM528h2 = m528h(this.f396c + this.f394a);
            int i2 = this.f394a;
            if (i2 < iM528h2) {
                iM528h = i2;
                while (i2 < iM528h2) {
                    Object obj = this.f395b[i2];
                    if (!collection.contains(obj)) {
                        this.f395b[iM528h] = obj;
                        iM528h++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                AbstractC0179j.m534k0(this.f395b, iM528h, iM528h2);
            } else {
                int length = this.f395b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f395b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (!collection.contains(obj2)) {
                        this.f395b[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                iM528h = m528h(i3);
                for (int i4 = 0; i4 < iM528h2; i4++) {
                    Object[] objArr2 = this.f395b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (!collection.contains(obj3)) {
                        this.f395b[iM528h] = obj3;
                        iM528h = m525e(iM528h);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                m529i();
                this.f396c = m526f(iM528h - this.f394a);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m529i();
        Object[] objArr = this.f395b;
        int i2 = this.f394a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f394a = m525e(i2);
        this.f396c = mo521a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m529i();
        int iM528h = m528h(AbstractC0182m.m555g0(this) + this.f394a);
        Object[] objArr = this.f395b;
        Object obj = objArr[iM528h];
        objArr[iM528h] = null;
        this.f396c = mo521a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        AbstractC0040p.m107j(i2, i3, this.f396c);
        int i4 = i3 - i2;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.f396c) {
            clear();
            return;
        }
        if (i4 == 1) {
            mo522b(i2);
            return;
        }
        m529i();
        if (i2 < this.f396c - i3) {
            int iM528h = m528h((i2 - 1) + this.f394a);
            int iM528h2 = m528h((i3 - 1) + this.f394a);
            while (i2 > 0) {
                int i5 = iM528h + 1;
                int iMin = Math.min(i2, Math.min(i5, iM528h2 + 1));
                Object[] objArr = this.f395b;
                int i6 = iM528h2 - iMin;
                int i7 = iM528h - iMin;
                AbstractC0179j.m533j0(objArr, objArr, i6 + 1, i7 + 1, i5);
                iM528h = m526f(i7);
                iM528h2 = m526f(i6);
                i2 -= iMin;
            }
            int iM528h3 = m528h(this.f394a + i4);
            m527g(this.f394a, iM528h3);
            this.f394a = iM528h3;
        } else {
            int iM528h4 = m528h(this.f394a + i3);
            int iM528h5 = m528h(this.f394a + i2);
            int i8 = this.f396c;
            while (true) {
                i8 -= i3;
                if (i8 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f395b;
                i3 = Math.min(i8, Math.min(objArr2.length - iM528h4, objArr2.length - iM528h5));
                Object[] objArr3 = this.f395b;
                int i9 = iM528h4 + i3;
                AbstractC0179j.m533j0(objArr3, objArr3, iM528h5, iM528h4, i9);
                iM528h4 = m528h(i9);
                iM528h5 = m528h(iM528h5 + i3);
            }
            int iM528h6 = m528h(this.f396c + this.f394a);
            m527g(m526f(iM528h6 - i4), iM528h6);
        }
        this.f396c -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM528h;
        AbstractC0307g.m703e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f395b.length != 0) {
            int iM528h2 = m528h(this.f396c + this.f394a);
            int i2 = this.f394a;
            if (i2 < iM528h2) {
                iM528h = i2;
                while (i2 < iM528h2) {
                    Object obj = this.f395b[i2];
                    if (collection.contains(obj)) {
                        this.f395b[iM528h] = obj;
                        iM528h++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                AbstractC0179j.m534k0(this.f395b, iM528h, iM528h2);
            } else {
                int length = this.f395b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f395b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f395b[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                iM528h = m528h(i3);
                for (int i4 = 0; i4 < iM528h2; i4++) {
                    Object[] objArr2 = this.f395b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f395b[iM528h] = obj3;
                        iM528h = m525e(iM528h);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                m529i();
                this.f396c = m526f(iM528h - this.f394a);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int iMo521a = mo521a();
        if (i2 < 0 || i2 >= iMo521a) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", iMo521a));
        }
        int iM528h = m528h(this.f394a + i2);
        Object[] objArr = this.f395b;
        Object obj2 = objArr[iM528h];
        objArr[iM528h] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo521a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0307g.m703e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f396c;
        if (length < i2) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            AbstractC0307g.m701c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM528h = m528h(this.f396c + this.f394a);
        int i3 = this.f394a;
        if (i3 < iM528h) {
            Object[] objArr2 = this.f395b;
            if ((2 & 4) != 0) {
                i3 = 0;
            }
            if ((2 & 8) != 0) {
                iM528h = objArr2.length;
            }
            AbstractC0179j.m533j0(objArr2, objArr, 0, i3, iM528h);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.f395b;
            AbstractC0179j.m533j0(objArr3, objArr, 0, this.f394a, objArr3.length);
            Object[] objArr4 = this.f395b;
            AbstractC0179j.m533j0(objArr4, objArr, objArr4.length - this.f394a, 0, iM528h);
        }
        AbstractC0040p.m95a0(this.f396c, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0307g.m703e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m529i();
        m524d(collection.size() + mo521a());
        m523c(m528h(mo521a() + this.f394a), collection);
        return true;
    }
}
