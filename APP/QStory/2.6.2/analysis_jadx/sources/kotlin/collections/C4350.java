package kotlin.collections;

import io.ktor.util.C4210;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4394;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4350 extends AbstractC4347 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Object[] f12928 = new Object[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f12929 = f12928;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12930;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f12931;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        C4332 c4332 = AbstractC4329.Companion;
        int size = size();
        c4332.getClass();
        C4332.m8773(i, size);
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        registerModification();
        m8869(size() + 1);
        int iM8873 = m8873(this.f12931 + i);
        if (i < ((size() + 1) >> 1)) {
            if (iM8873 == 0) {
                Object[] objArr = this.f12929;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iM8873 - 1;
            }
            int length2 = this.f12931;
            if (length2 == 0) {
                Object[] objArr2 = this.f12929;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i2 = length2 - 1;
            int i3 = this.f12931;
            Object[] objArr3 = this.f12929;
            if (length >= i3) {
                objArr3[i2] = objArr3[i3];
                AbstractC4346.m8839(i3, i3 + 1, objArr3, length + 1, objArr3);
            } else {
                AbstractC4346.m8839(i3 - 1, i3, objArr3, objArr3.length, objArr3);
                Object[] objArr4 = this.f12929;
                objArr4[objArr4.length - 1] = objArr4[0];
                AbstractC4346.m8839(0, 1, objArr4, length + 1, objArr4);
            }
            this.f12929[length] = obj;
            this.f12931 = i2;
        } else {
            int iM88732 = m8873(size() + this.f12931);
            Object[] objArr5 = this.f12929;
            if (iM8873 < iM88732) {
                AbstractC4346.m8839(iM8873 + 1, iM8873, objArr5, iM88732, objArr5);
            } else {
                AbstractC4346.m8839(1, 0, objArr5, iM88732, objArr5);
                Object[] objArr6 = this.f12929;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC4346.m8839(iM8873 + 1, iM8873, objArr6, objArr6.length - 1, objArr6);
            }
            this.f12929[iM8873] = obj;
        }
        this.f12930 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        C4332 c4332 = AbstractC4329.Companion;
        int size = size();
        c4332.getClass();
        C4332.m8773(i, size);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        registerModification();
        m8869(collection.size() + size());
        int iM8873 = m8873(size() + this.f12931);
        int iM88732 = m8873(this.f12931 + i);
        int size2 = collection.size();
        if (i >= ((size() + 1) >> 1)) {
            int i2 = iM88732 + size2;
            Object[] objArr = this.f12929;
            if (iM88732 < iM8873) {
                int i3 = size2 + iM8873;
                if (i3 <= objArr.length) {
                    AbstractC4346.m8839(i2, iM88732, objArr, iM8873, objArr);
                } else if (i2 >= objArr.length) {
                    AbstractC4346.m8839(i2 - objArr.length, iM88732, objArr, iM8873, objArr);
                } else {
                    int length = iM8873 - (i3 - objArr.length);
                    AbstractC4346.m8839(0, length, objArr, iM8873, objArr);
                    Object[] objArr2 = this.f12929;
                    AbstractC4346.m8839(i2, iM88732, objArr2, length, objArr2);
                }
            } else {
                AbstractC4346.m8839(size2, 0, objArr, iM8873, objArr);
                Object[] objArr3 = this.f12929;
                if (i2 >= objArr3.length) {
                    AbstractC4346.m8839(i2 - objArr3.length, iM88732, objArr3, objArr3.length, objArr3);
                } else {
                    AbstractC4346.m8839(0, objArr3.length - size2, objArr3, objArr3.length, objArr3);
                    Object[] objArr4 = this.f12929;
                    AbstractC4346.m8839(i2, iM88732, objArr4, objArr4.length - size2, objArr4);
                }
            }
            m8870(iM88732, collection);
            return true;
        }
        int i4 = this.f12931;
        int length2 = i4 - size2;
        Object[] objArr5 = this.f12929;
        if (iM88732 < i4) {
            AbstractC4346.m8839(length2, i4, objArr5, objArr5.length, objArr5);
            Object[] objArr6 = this.f12929;
            if (size2 >= iM88732) {
                AbstractC4346.m8839(objArr6.length - size2, 0, objArr6, iM88732, objArr6);
            } else {
                AbstractC4346.m8839(objArr6.length - size2, 0, objArr6, size2, objArr6);
                Object[] objArr7 = this.f12929;
                AbstractC4346.m8839(0, size2, objArr7, iM88732, objArr7);
            }
        } else if (length2 >= 0) {
            AbstractC4346.m8839(length2, i4, objArr5, iM88732, objArr5);
        } else {
            length2 += objArr5.length;
            int i5 = iM88732 - i4;
            int length3 = objArr5.length - length2;
            if (length3 >= i5) {
                AbstractC4346.m8839(length2, i4, objArr5, iM88732, objArr5);
            } else {
                AbstractC4346.m8839(length2, i4, objArr5, i4 + length3, objArr5);
                Object[] objArr8 = this.f12929;
                AbstractC4346.m8839(0, this.f12931 + length3, objArr8, iM88732, objArr8);
            }
        }
        this.f12931 = length2;
        m8870(m8872(iM88732 - size2), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        registerModification();
        m8869(size() + 1);
        int length = this.f12931;
        if (length == 0) {
            Object[] objArr = this.f12929;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.f12931 = i;
        this.f12929[i] = obj;
        this.f12930 = size() + 1;
    }

    public final void addLast(Object obj) {
        registerModification();
        m8869(size() + 1);
        this.f12929[m8873(size() + this.f12931)] = obj;
        this.f12930 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            registerModification();
            m8871(this.f12931, m8873(size() + this.f12931));
        }
        this.f12931 = 0;
        this.f12930 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f12929[this.f12931];
        }
        C4210.m8627("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C4332 c4332 = AbstractC4329.Companion;
        int size = size();
        c4332.getClass();
        C4332.m8774(i, size);
        return this.f12929[m8873(this.f12931 + i)];
    }

    @Override // kotlin.collections.AbstractC4347
    public final int getSize() {
        return this.f12930;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM8873 = m8873(size() + this.f12931);
        int length = this.f12931;
        if (length < iM8873) {
            while (length < iM8873) {
                if (AbstractC4394.m8917(obj, this.f12929[length])) {
                    i = this.f12931;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f12931) < iM8873) {
            return -1;
        }
        int length2 = this.f12929.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM8873; i2++) {
                    if (AbstractC4394.m8917(obj, this.f12929[i2])) {
                        length = i2 + this.f12929.length;
                        i = this.f12931;
                    }
                }
                return -1;
            }
            if (AbstractC4394.m8917(obj, this.f12929[length])) {
                i = this.f12931;
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
            C4210.m8627("ArrayDeque is empty.");
            return null;
        }
        return this.f12929[m8873((size() - 1) + this.f12931)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM8873 = m8873(size() + this.f12931);
        int i2 = this.f12931;
        if (i2 < iM8873) {
            length = iM8873 - 1;
            if (i2 <= length) {
                while (!AbstractC4394.m8917(obj, this.f12929[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f12931;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f12931 >= iM8873) {
            while (true) {
                iM8873--;
                Object[] objArr = this.f12929;
                if (-1 >= iM8873) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.f12931;
                    if (i3 <= length) {
                        while (!AbstractC4394.m8917(obj, this.f12929[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f12931;
                    }
                } else if (AbstractC4394.m8917(obj, objArr[iM8873])) {
                    length = iM8873 + this.f12929.length;
                    i = this.f12931;
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
        int iM8873;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f12929.length != 0) {
            int iM88732 = m8873(size() + this.f12931);
            int i = this.f12931;
            if (i < iM88732) {
                iM8873 = i;
                while (true) {
                    objArr = this.f12929;
                    if (i >= iM88732) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f12929[iM8873] = obj;
                        iM8873++;
                    }
                    i++;
                }
                AbstractC4346.m8861(iM8873, iM88732, null, objArr);
            } else {
                int length = this.f12929.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f12929;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f12929[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM8873 = m8873(i2);
                for (int i3 = 0; i3 < iM88732; i3++) {
                    Object[] objArr3 = this.f12929;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f12929[iM8873] = obj3;
                        iM8873 = m8868(iM8873);
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.f12930 = m8872(iM8873 - this.f12931);
            }
        }
        return z;
    }

    @Override // kotlin.collections.AbstractC4347
    public final Object removeAt(int i) {
        C4332 c4332 = AbstractC4329.Companion;
        int size = size();
        c4332.getClass();
        C4332.m8774(i, size);
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        registerModification();
        int iM8873 = m8873(this.f12931 + i);
        Object obj = this.f12929[iM8873];
        int size2 = size() >> 1;
        int i2 = this.f12931;
        if (i < size2) {
            Object[] objArr = this.f12929;
            if (iM8873 >= i2) {
                AbstractC4346.m8839(i2 + 1, i2, objArr, iM8873, objArr);
            } else {
                AbstractC4346.m8839(1, 0, objArr, iM8873, objArr);
                Object[] objArr2 = this.f12929;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i3 = this.f12931;
                AbstractC4346.m8839(i3 + 1, i3, objArr2, objArr2.length - 1, objArr2);
            }
            Object[] objArr3 = this.f12929;
            int i4 = this.f12931;
            objArr3[i4] = null;
            this.f12931 = m8868(i4);
        } else {
            int iM88732 = m8873((size() - 1) + i2);
            Object[] objArr4 = this.f12929;
            if (iM8873 <= iM88732) {
                AbstractC4346.m8839(iM8873, iM8873 + 1, objArr4, iM88732 + 1, objArr4);
            } else {
                AbstractC4346.m8839(iM8873, iM8873 + 1, objArr4, objArr4.length, objArr4);
                Object[] objArr5 = this.f12929;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC4346.m8839(0, 1, objArr5, iM88732 + 1, objArr5);
            }
            this.f12929[iM88732] = null;
        }
        this.f12930 = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            C4210.m8627("ArrayDeque is empty.");
            return null;
        }
        registerModification();
        Object[] objArr = this.f12929;
        int i = this.f12931;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f12931 = m8868(i);
        this.f12930 = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            C4210.m8627("ArrayDeque is empty.");
            return null;
        }
        registerModification();
        int iM8873 = m8873((size() - 1) + this.f12931);
        Object[] objArr = this.f12929;
        Object obj = objArr[iM8873];
        objArr[iM8873] = null;
        this.f12930 = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        C4332 c4332 = AbstractC4329.Companion;
        int size = size();
        c4332.getClass();
        C4332.m8772(i, i2, size);
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
        int i4 = this.f12931;
        if (i < size2) {
            int iM8873 = m8873((i - 1) + i4);
            int iM88732 = m8873(this.f12931 + (i2 - 1));
            while (i > 0) {
                int i5 = iM8873 + 1;
                int iMin = Math.min(i, Math.min(i5, iM88732 + 1));
                Object[] objArr = this.f12929;
                int i6 = iM88732 - iMin;
                int i7 = iM8873 - iMin;
                AbstractC4346.m8839(i6 + 1, i7 + 1, objArr, i5, objArr);
                iM8873 = m8872(i7);
                iM88732 = m8872(i6);
                i -= iMin;
            }
            int iM88733 = m8873(this.f12931 + i3);
            m8871(this.f12931, iM88733);
            this.f12931 = iM88733;
        } else {
            int iM88734 = m8873(i4 + i2);
            int iM88735 = m8873(this.f12931 + i);
            int size3 = size();
            while (true) {
                size3 -= i2;
                if (size3 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f12929;
                i2 = Math.min(size3, Math.min(objArr2.length - iM88734, objArr2.length - iM88735));
                Object[] objArr3 = this.f12929;
                int i8 = iM88734 + i2;
                AbstractC4346.m8839(iM88735, iM88734, objArr3, i8, objArr3);
                iM88734 = m8873(i8);
                iM88735 = m8873(iM88735 + i2);
            }
            int iM88736 = m8873(size() + this.f12931);
            m8871(m8872(iM88736 - i3), iM88736);
        }
        this.f12930 = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM8873;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f12929.length != 0) {
            int iM88732 = m8873(size() + this.f12931);
            int i = this.f12931;
            if (i < iM88732) {
                iM8873 = i;
                while (true) {
                    objArr = this.f12929;
                    if (i >= iM88732) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f12929[iM8873] = obj;
                        iM8873++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC4346.m8861(iM8873, iM88732, null, objArr);
            } else {
                int length = this.f12929.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f12929;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f12929[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM8873 = m8873(i2);
                for (int i3 = 0; i3 < iM88732; i3++) {
                    Object[] objArr3 = this.f12929;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f12929[iM8873] = obj3;
                        iM8873 = m8868(iM8873);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.f12930 = m8872(iM8873 - this.f12931);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C4332 c4332 = AbstractC4329.Companion;
        int size = size();
        c4332.getClass();
        C4332.m8774(i, size);
        int iM8873 = m8873(this.f12931 + i);
        Object[] objArr = this.f12929;
        Object obj2 = objArr[iM8873];
        objArr[iM8873] = obj;
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
        int iM8873 = m8873(size() + this.f12931);
        int i = this.f12931;
        if (i < iM8873) {
            AbstractC4346.m8837(i, iM8873, this.f12929, 2, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f12929;
            AbstractC4346.m8839(0, this.f12931, objArr2, objArr2.length, objArr);
            Object[] objArr3 = this.f12929;
            AbstractC4346.m8839(objArr3.length - this.f12931, 0, objArr3, iM8873, objArr);
        }
        int size = size();
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m8867() {
        if (isEmpty()) {
            return null;
        }
        return this.f12929[m8873((size() - 1) + this.f12931)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m8868(int i) {
        this.f12929.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8869(int i) {
        if (i < 0) {
            C5919.m11250("Deque is too big.");
            return;
        }
        Object[] objArr = this.f12929;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f12928) {
            if (i < 10) {
                i = 10;
            }
            this.f12929 = new Object[i];
            return;
        }
        C4332 c4332 = AbstractC4329.Companion;
        int length = objArr.length;
        c4332.getClass();
        Object[] objArr2 = new Object[C4332.m8771(length, i)];
        Object[] objArr3 = this.f12929;
        AbstractC4346.m8839(0, this.f12931, objArr3, objArr3.length, objArr2);
        Object[] objArr4 = this.f12929;
        int length2 = objArr4.length;
        int i2 = this.f12931;
        AbstractC4346.m8839(length2 - i2, 0, objArr4, i2, objArr2);
        this.f12931 = 0;
        this.f12929 = objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8870(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f12929.length;
        while (i < length && it.hasNext()) {
            this.f12929[i] = it.next();
            i++;
        }
        int i2 = this.f12931;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f12929[i3] = it.next();
        }
        this.f12930 = collection.size() + size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m8871(int i, int i2) {
        Object[] objArr = this.f12929;
        if (i < i2) {
            AbstractC4346.m8861(i, i2, null, objArr);
        } else {
            AbstractC4346.m8861(i, objArr.length, null, objArr);
            AbstractC4346.m8861(0, i2, null, this.f12929);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m8872(int i) {
        return i < 0 ? i + this.f12929.length : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m8873(int i) {
        Object[] objArr = this.f12929;
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
        m8869(collection.size() + size());
        m8870(m8873(size() + this.f12931), collection);
        return true;
    }
}
