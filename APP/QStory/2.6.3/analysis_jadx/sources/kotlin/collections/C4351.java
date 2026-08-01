package kotlin.collections;

import io.ktor.util.C4211;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4395;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4351 extends AbstractC4348 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Object[] f12932 = new Object[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f12933 = f12932;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12934;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f12935;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        C4333 c4333 = AbstractC4330.Companion;
        int size = size();
        c4333.getClass();
        C4333.m8763(i, size);
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        registerModification();
        m8859(size() + 1);
        int iM8863 = m8863(this.f12935 + i);
        if (i < ((size() + 1) >> 1)) {
            if (iM8863 == 0) {
                Object[] objArr = this.f12933;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iM8863 - 1;
            }
            int length2 = this.f12935;
            if (length2 == 0) {
                Object[] objArr2 = this.f12933;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i2 = length2 - 1;
            int i3 = this.f12935;
            Object[] objArr3 = this.f12933;
            if (length >= i3) {
                objArr3[i2] = objArr3[i3];
                AbstractC4347.m8835(i3, i3 + 1, objArr3, length + 1, objArr3);
            } else {
                AbstractC4347.m8835(i3 - 1, i3, objArr3, objArr3.length, objArr3);
                Object[] objArr4 = this.f12933;
                objArr4[objArr4.length - 1] = objArr4[0];
                AbstractC4347.m8835(0, 1, objArr4, length + 1, objArr4);
            }
            this.f12933[length] = obj;
            this.f12935 = i2;
        } else {
            int iM88632 = m8863(size() + this.f12935);
            Object[] objArr5 = this.f12933;
            if (iM8863 < iM88632) {
                AbstractC4347.m8835(iM8863 + 1, iM8863, objArr5, iM88632, objArr5);
            } else {
                AbstractC4347.m8835(1, 0, objArr5, iM88632, objArr5);
                Object[] objArr6 = this.f12933;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC4347.m8835(iM8863 + 1, iM8863, objArr6, objArr6.length - 1, objArr6);
            }
            this.f12933[iM8863] = obj;
        }
        this.f12934 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        C4333 c4333 = AbstractC4330.Companion;
        int size = size();
        c4333.getClass();
        C4333.m8763(i, size);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        registerModification();
        m8859(collection.size() + size());
        int iM8863 = m8863(size() + this.f12935);
        int iM88632 = m8863(this.f12935 + i);
        int size2 = collection.size();
        if (i >= ((size() + 1) >> 1)) {
            int i2 = iM88632 + size2;
            Object[] objArr = this.f12933;
            if (iM88632 < iM8863) {
                int i3 = size2 + iM8863;
                if (i3 <= objArr.length) {
                    AbstractC4347.m8835(i2, iM88632, objArr, iM8863, objArr);
                } else if (i2 >= objArr.length) {
                    AbstractC4347.m8835(i2 - objArr.length, iM88632, objArr, iM8863, objArr);
                } else {
                    int length = iM8863 - (i3 - objArr.length);
                    AbstractC4347.m8835(0, length, objArr, iM8863, objArr);
                    Object[] objArr2 = this.f12933;
                    AbstractC4347.m8835(i2, iM88632, objArr2, length, objArr2);
                }
            } else {
                AbstractC4347.m8835(size2, 0, objArr, iM8863, objArr);
                Object[] objArr3 = this.f12933;
                if (i2 >= objArr3.length) {
                    AbstractC4347.m8835(i2 - objArr3.length, iM88632, objArr3, objArr3.length, objArr3);
                } else {
                    AbstractC4347.m8835(0, objArr3.length - size2, objArr3, objArr3.length, objArr3);
                    Object[] objArr4 = this.f12933;
                    AbstractC4347.m8835(i2, iM88632, objArr4, objArr4.length - size2, objArr4);
                }
            }
            m8860(iM88632, collection);
            return true;
        }
        int i4 = this.f12935;
        int length2 = i4 - size2;
        Object[] objArr5 = this.f12933;
        if (iM88632 < i4) {
            AbstractC4347.m8835(length2, i4, objArr5, objArr5.length, objArr5);
            Object[] objArr6 = this.f12933;
            if (size2 >= iM88632) {
                AbstractC4347.m8835(objArr6.length - size2, 0, objArr6, iM88632, objArr6);
            } else {
                AbstractC4347.m8835(objArr6.length - size2, 0, objArr6, size2, objArr6);
                Object[] objArr7 = this.f12933;
                AbstractC4347.m8835(0, size2, objArr7, iM88632, objArr7);
            }
        } else if (length2 >= 0) {
            AbstractC4347.m8835(length2, i4, objArr5, iM88632, objArr5);
        } else {
            length2 += objArr5.length;
            int i5 = iM88632 - i4;
            int length3 = objArr5.length - length2;
            if (length3 >= i5) {
                AbstractC4347.m8835(length2, i4, objArr5, iM88632, objArr5);
            } else {
                AbstractC4347.m8835(length2, i4, objArr5, i4 + length3, objArr5);
                Object[] objArr8 = this.f12933;
                AbstractC4347.m8835(0, this.f12935 + length3, objArr8, iM88632, objArr8);
            }
        }
        this.f12935 = length2;
        m8860(m8862(iM88632 - size2), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        registerModification();
        m8859(size() + 1);
        int length = this.f12935;
        if (length == 0) {
            Object[] objArr = this.f12933;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.f12935 = i;
        this.f12933[i] = obj;
        this.f12934 = size() + 1;
    }

    public final void addLast(Object obj) {
        registerModification();
        m8859(size() + 1);
        this.f12933[m8863(size() + this.f12935)] = obj;
        this.f12934 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            registerModification();
            m8861(this.f12935, m8863(size() + this.f12935));
        }
        this.f12935 = 0;
        this.f12934 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f12933[this.f12935];
        }
        C4211.m8617("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C4333 c4333 = AbstractC4330.Companion;
        int size = size();
        c4333.getClass();
        C4333.m8764(i, size);
        return this.f12933[m8863(this.f12935 + i)];
    }

    @Override // kotlin.collections.AbstractC4348
    public final int getSize() {
        return this.f12934;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM8863 = m8863(size() + this.f12935);
        int length = this.f12935;
        if (length < iM8863) {
            while (length < iM8863) {
                if (AbstractC4395.m8907(obj, this.f12933[length])) {
                    i = this.f12935;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f12935) < iM8863) {
            return -1;
        }
        int length2 = this.f12933.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM8863; i2++) {
                    if (AbstractC4395.m8907(obj, this.f12933[i2])) {
                        length = i2 + this.f12933.length;
                        i = this.f12935;
                    }
                }
                return -1;
            }
            if (AbstractC4395.m8907(obj, this.f12933[length])) {
                i = this.f12935;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            C4211.m8617("ArrayDeque is empty.");
            return null;
        }
        return this.f12933[m8863((size() - 1) + this.f12935)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM8863 = m8863(size() + this.f12935);
        int i2 = this.f12935;
        if (i2 < iM8863) {
            length = iM8863 - 1;
            if (i2 <= length) {
                while (!AbstractC4395.m8907(obj, this.f12933[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f12935;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f12935 >= iM8863) {
            while (true) {
                iM8863--;
                Object[] objArr = this.f12933;
                if (-1 >= iM8863) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.f12935;
                    if (i3 <= length) {
                        while (!AbstractC4395.m8907(obj, this.f12933[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f12935;
                    }
                } else if (AbstractC4395.m8907(obj, objArr[iM8863])) {
                    length = iM8863 + this.f12933.length;
                    i = this.f12935;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    public final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM8863;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f12933.length != 0) {
            int iM88632 = m8863(size() + this.f12935);
            int i = this.f12935;
            if (i < iM88632) {
                iM8863 = i;
                while (true) {
                    objArr = this.f12933;
                    if (i >= iM88632) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f12933[iM8863] = obj;
                        iM8863++;
                    }
                    i++;
                }
                AbstractC4347.m8834(iM8863, iM88632, null, objArr);
            } else {
                int length = this.f12933.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f12933;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f12933[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM8863 = m8863(i2);
                for (int i3 = 0; i3 < iM88632; i3++) {
                    Object[] objArr3 = this.f12933;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f12933[iM8863] = obj3;
                        iM8863 = m8858(iM8863);
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.f12934 = m8862(iM8863 - this.f12935);
            }
        }
        return z;
    }

    @Override // kotlin.collections.AbstractC4348
    public final Object removeAt(int i) {
        C4333 c4333 = AbstractC4330.Companion;
        int size = size();
        c4333.getClass();
        C4333.m8764(i, size);
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        registerModification();
        int iM8863 = m8863(this.f12935 + i);
        Object obj = this.f12933[iM8863];
        int size2 = size() >> 1;
        int i2 = this.f12935;
        if (i < size2) {
            Object[] objArr = this.f12933;
            if (iM8863 >= i2) {
                AbstractC4347.m8835(i2 + 1, i2, objArr, iM8863, objArr);
            } else {
                AbstractC4347.m8835(1, 0, objArr, iM8863, objArr);
                Object[] objArr2 = this.f12933;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i3 = this.f12935;
                AbstractC4347.m8835(i3 + 1, i3, objArr2, objArr2.length - 1, objArr2);
            }
            Object[] objArr3 = this.f12933;
            int i4 = this.f12935;
            objArr3[i4] = null;
            this.f12935 = m8858(i4);
        } else {
            int iM88632 = m8863((size() - 1) + i2);
            Object[] objArr4 = this.f12933;
            if (iM8863 <= iM88632) {
                AbstractC4347.m8835(iM8863, iM8863 + 1, objArr4, iM88632 + 1, objArr4);
            } else {
                AbstractC4347.m8835(iM8863, iM8863 + 1, objArr4, objArr4.length, objArr4);
                Object[] objArr5 = this.f12933;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC4347.m8835(0, 1, objArr5, iM88632 + 1, objArr5);
            }
            this.f12933[iM88632] = null;
        }
        this.f12934 = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            C4211.m8617("ArrayDeque is empty.");
            return null;
        }
        registerModification();
        Object[] objArr = this.f12933;
        int i = this.f12935;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f12935 = m8858(i);
        this.f12934 = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            C4211.m8617("ArrayDeque is empty.");
            return null;
        }
        registerModification();
        int iM8863 = m8863((size() - 1) + this.f12935);
        Object[] objArr = this.f12933;
        Object obj = objArr[iM8863];
        objArr[iM8863] = null;
        this.f12934 = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        C4333 c4333 = AbstractC4330.Companion;
        int size = size();
        c4333.getClass();
        C4333.m8762(i, i2, size);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            removeAt(i);
            return;
        }
        registerModification();
        int size2 = size() - i2;
        int i4 = this.f12935;
        if (i < size2) {
            int iM8863 = m8863((i - 1) + i4);
            int iM88632 = m8863(this.f12935 + (i2 - 1));
            while (i > 0) {
                int i5 = iM8863 + 1;
                int iMin = Math.min(i, Math.min(i5, iM88632 + 1));
                Object[] objArr = this.f12933;
                int i6 = iM88632 - iMin;
                int i7 = iM8863 - iMin;
                AbstractC4347.m8835(i6 + 1, i7 + 1, objArr, i5, objArr);
                iM8863 = m8862(i7);
                iM88632 = m8862(i6);
                i -= iMin;
            }
            int iM88633 = m8863(this.f12935 + i3);
            m8861(this.f12935, iM88633);
            this.f12935 = iM88633;
        } else {
            int iM88634 = m8863(i4 + i2);
            int iM88635 = m8863(this.f12935 + i);
            int size3 = size();
            while (true) {
                size3 -= i2;
                if (size3 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f12933;
                i2 = Math.min(size3, Math.min(objArr2.length - iM88634, objArr2.length - iM88635));
                Object[] objArr3 = this.f12933;
                int i8 = iM88634 + i2;
                AbstractC4347.m8835(iM88635, iM88634, objArr3, i8, objArr3);
                iM88634 = m8863(i8);
                iM88635 = m8863(iM88635 + i2);
            }
            int iM88636 = m8863(size() + this.f12935);
            m8861(m8862(iM88636 - i3), iM88636);
        }
        this.f12934 = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM8863;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f12933.length != 0) {
            int iM88632 = m8863(size() + this.f12935);
            int i = this.f12935;
            if (i < iM88632) {
                iM8863 = i;
                while (true) {
                    objArr = this.f12933;
                    if (i >= iM88632) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f12933[iM8863] = obj;
                        iM8863++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC4347.m8834(iM8863, iM88632, null, objArr);
            } else {
                int length = this.f12933.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f12933;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f12933[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM8863 = m8863(i2);
                for (int i3 = 0; i3 < iM88632; i3++) {
                    Object[] objArr3 = this.f12933;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f12933[iM8863] = obj3;
                        iM8863 = m8858(iM8863);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.f12934 = m8862(iM8863 - this.f12935);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C4333 c4333 = AbstractC4330.Companion;
        int size = size();
        c4333.getClass();
        C4333.m8764(i, size);
        int iM8863 = m8863(this.f12935 + i);
        Object[] objArr = this.f12933;
        Object obj2 = objArr[iM8863];
        objArr[iM8863] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        if (objArr.length < size()) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size());
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iM8863 = m8863(size() + this.f12935);
        int i = this.f12935;
        if (i < iM8863) {
            AbstractC4347.m8840(i, iM8863, this.f12933, 2, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f12933;
            AbstractC4347.m8835(0, this.f12935, objArr2, objArr2.length, objArr);
            Object[] objArr3 = this.f12933;
            AbstractC4347.m8835(objArr3.length - this.f12935, 0, objArr3, iM8863, objArr);
        }
        int size = size();
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m8857() {
        if (isEmpty()) {
            return null;
        }
        return this.f12933[m8863((size() - 1) + this.f12935)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m8858(int i) {
        this.f12933.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8859(int i) {
        if (i < 0) {
            C5925.m11311("Deque is too big.");
            return;
        }
        Object[] objArr = this.f12933;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f12932) {
            if (i < 10) {
                i = 10;
            }
            this.f12933 = new Object[i];
            return;
        }
        C4333 c4333 = AbstractC4330.Companion;
        int length = objArr.length;
        c4333.getClass();
        Object[] objArr2 = new Object[C4333.m8761(length, i)];
        Object[] objArr3 = this.f12933;
        AbstractC4347.m8835(0, this.f12935, objArr3, objArr3.length, objArr2);
        Object[] objArr4 = this.f12933;
        int length2 = objArr4.length;
        int i2 = this.f12935;
        AbstractC4347.m8835(length2 - i2, 0, objArr4, i2, objArr2);
        this.f12935 = 0;
        this.f12933 = objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8860(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f12933.length;
        while (i < length && it.hasNext()) {
            this.f12933[i] = it.next();
            i++;
        }
        int i2 = this.f12935;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f12933[i3] = it.next();
        }
        this.f12934 = collection.size() + size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m8861(int i, int i2) {
        Object[] objArr = this.f12933;
        if (i < i2) {
            AbstractC4347.m8834(i, i2, null, objArr);
        } else {
            AbstractC4347.m8834(i, objArr.length, null, objArr);
            AbstractC4347.m8834(0, i2, null, this.f12933);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m8862(int i) {
        return i < 0 ? i + this.f12933.length : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m8863(int i) {
        Object[] objArr = this.f12933;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
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
        registerModification();
        m8859(collection.size() + size());
        m8860(m8863(size() + this.f12935), collection);
        return true;
    }
}
