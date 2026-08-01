package kotlin.collections;

import io.ktor.util.C5043;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5183 extends AbstractC5180 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Object[] f13277 = new Object[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f13278 = f13277;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13279;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f13280;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        C5165 c5165 = AbstractC5162.Companion;
        int size = size();
        c5165.getClass();
        C5165.m9322(i, size);
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        registerModification();
        m9418(size() + 1);
        int iM9422 = m9422(this.f13280 + i);
        if (i < ((size() + 1) >> 1)) {
            if (iM9422 == 0) {
                Object[] objArr = this.f13278;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iM9422 - 1;
            }
            int length2 = this.f13280;
            if (length2 == 0) {
                Object[] objArr2 = this.f13278;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i2 = length2 - 1;
            int i3 = this.f13280;
            Object[] objArr3 = this.f13278;
            if (length >= i3) {
                objArr3[i2] = objArr3[i3];
                AbstractC5179.m9394(i3, i3 + 1, objArr3, length + 1, objArr3);
            } else {
                AbstractC5179.m9394(i3 - 1, i3, objArr3, objArr3.length, objArr3);
                Object[] objArr4 = this.f13278;
                objArr4[objArr4.length - 1] = objArr4[0];
                AbstractC5179.m9394(0, 1, objArr4, length + 1, objArr4);
            }
            this.f13278[length] = obj;
            this.f13280 = i2;
        } else {
            int iM94222 = m9422(size() + this.f13280);
            Object[] objArr5 = this.f13278;
            if (iM9422 < iM94222) {
                AbstractC5179.m9394(iM9422 + 1, iM9422, objArr5, iM94222, objArr5);
            } else {
                AbstractC5179.m9394(1, 0, objArr5, iM94222, objArr5);
                Object[] objArr6 = this.f13278;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC5179.m9394(iM9422 + 1, iM9422, objArr6, objArr6.length - 1, objArr6);
            }
            this.f13278[iM9422] = obj;
        }
        this.f13279 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        C5165 c5165 = AbstractC5162.Companion;
        int size = size();
        c5165.getClass();
        C5165.m9322(i, size);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        registerModification();
        m9418(collection.size() + size());
        int iM9422 = m9422(size() + this.f13280);
        int iM94222 = m9422(this.f13280 + i);
        int size2 = collection.size();
        if (i >= ((size() + 1) >> 1)) {
            int i2 = iM94222 + size2;
            Object[] objArr = this.f13278;
            if (iM94222 < iM9422) {
                int i3 = size2 + iM9422;
                if (i3 <= objArr.length) {
                    AbstractC5179.m9394(i2, iM94222, objArr, iM9422, objArr);
                } else if (i2 >= objArr.length) {
                    AbstractC5179.m9394(i2 - objArr.length, iM94222, objArr, iM9422, objArr);
                } else {
                    int length = iM9422 - (i3 - objArr.length);
                    AbstractC5179.m9394(0, length, objArr, iM9422, objArr);
                    Object[] objArr2 = this.f13278;
                    AbstractC5179.m9394(i2, iM94222, objArr2, length, objArr2);
                }
            } else {
                AbstractC5179.m9394(size2, 0, objArr, iM9422, objArr);
                Object[] objArr3 = this.f13278;
                if (i2 >= objArr3.length) {
                    AbstractC5179.m9394(i2 - objArr3.length, iM94222, objArr3, objArr3.length, objArr3);
                } else {
                    AbstractC5179.m9394(0, objArr3.length - size2, objArr3, objArr3.length, objArr3);
                    Object[] objArr4 = this.f13278;
                    AbstractC5179.m9394(i2, iM94222, objArr4, objArr4.length - size2, objArr4);
                }
            }
            m9419(iM94222, collection);
            return true;
        }
        int i4 = this.f13280;
        int length2 = i4 - size2;
        Object[] objArr5 = this.f13278;
        if (iM94222 < i4) {
            AbstractC5179.m9394(length2, i4, objArr5, objArr5.length, objArr5);
            Object[] objArr6 = this.f13278;
            if (size2 >= iM94222) {
                AbstractC5179.m9394(objArr6.length - size2, 0, objArr6, iM94222, objArr6);
            } else {
                AbstractC5179.m9394(objArr6.length - size2, 0, objArr6, size2, objArr6);
                Object[] objArr7 = this.f13278;
                AbstractC5179.m9394(0, size2, objArr7, iM94222, objArr7);
            }
        } else if (length2 >= 0) {
            AbstractC5179.m9394(length2, i4, objArr5, iM94222, objArr5);
        } else {
            length2 += objArr5.length;
            int i5 = iM94222 - i4;
            int length3 = objArr5.length - length2;
            if (length3 >= i5) {
                AbstractC5179.m9394(length2, i4, objArr5, iM94222, objArr5);
            } else {
                AbstractC5179.m9394(length2, i4, objArr5, i4 + length3, objArr5);
                Object[] objArr8 = this.f13278;
                AbstractC5179.m9394(0, this.f13280 + length3, objArr8, iM94222, objArr8);
            }
        }
        this.f13280 = length2;
        m9419(m9421(iM94222 - size2), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        registerModification();
        m9418(size() + 1);
        int length = this.f13280;
        if (length == 0) {
            Object[] objArr = this.f13278;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.f13280 = i;
        this.f13278[i] = obj;
        this.f13279 = size() + 1;
    }

    public final void addLast(Object obj) {
        registerModification();
        m9418(size() + 1);
        this.f13278[m9422(size() + this.f13280)] = obj;
        this.f13279 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            registerModification();
            m9420(this.f13280, m9422(size() + this.f13280));
        }
        this.f13280 = 0;
        this.f13279 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f13278[this.f13280];
        }
        C5043.m9176("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C5165 c5165 = AbstractC5162.Companion;
        int size = size();
        c5165.getClass();
        C5165.m9323(i, size);
        return this.f13278[m9422(this.f13280 + i)];
    }

    @Override // kotlin.collections.AbstractC5180
    public final int getSize() {
        return this.f13279;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM9422 = m9422(size() + this.f13280);
        int length = this.f13280;
        if (length < iM9422) {
            while (length < iM9422) {
                if (AbstractC5227.m9466(obj, this.f13278[length])) {
                    i = this.f13280;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f13280) < iM9422) {
            return -1;
        }
        int length2 = this.f13278.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM9422; i2++) {
                    if (AbstractC5227.m9466(obj, this.f13278[i2])) {
                        length = i2 + this.f13278.length;
                        i = this.f13280;
                    }
                }
                return -1;
            }
            if (AbstractC5227.m9466(obj, this.f13278[length])) {
                i = this.f13280;
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
            C5043.m9176("ArrayDeque is empty.");
            return null;
        }
        return this.f13278[m9422((size() - 1) + this.f13280)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM9422 = m9422(size() + this.f13280);
        int i2 = this.f13280;
        if (i2 < iM9422) {
            length = iM9422 - 1;
            if (i2 <= length) {
                while (!AbstractC5227.m9466(obj, this.f13278[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f13280;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f13280 >= iM9422) {
            while (true) {
                iM9422--;
                Object[] objArr = this.f13278;
                if (-1 >= iM9422) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.f13280;
                    if (i3 <= length) {
                        while (!AbstractC5227.m9466(obj, this.f13278[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f13280;
                    }
                } else if (AbstractC5227.m9466(obj, objArr[iM9422])) {
                    length = iM9422 + this.f13278.length;
                    i = this.f13280;
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
        int iM9422;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f13278.length != 0) {
            int iM94222 = m9422(size() + this.f13280);
            int i = this.f13280;
            if (i < iM94222) {
                iM9422 = i;
                while (true) {
                    objArr = this.f13278;
                    if (i >= iM94222) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f13278[iM9422] = obj;
                        iM9422++;
                    }
                    i++;
                }
                AbstractC5179.m9393(iM9422, iM94222, null, objArr);
            } else {
                int length = this.f13278.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f13278;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f13278[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM9422 = m9422(i2);
                for (int i3 = 0; i3 < iM94222; i3++) {
                    Object[] objArr3 = this.f13278;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f13278[iM9422] = obj3;
                        iM9422 = m9417(iM9422);
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.f13279 = m9421(iM9422 - this.f13280);
            }
        }
        return z;
    }

    @Override // kotlin.collections.AbstractC5180
    public final Object removeAt(int i) {
        C5165 c5165 = AbstractC5162.Companion;
        int size = size();
        c5165.getClass();
        C5165.m9323(i, size);
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        registerModification();
        int iM9422 = m9422(this.f13280 + i);
        Object obj = this.f13278[iM9422];
        int size2 = size() >> 1;
        int i2 = this.f13280;
        if (i < size2) {
            Object[] objArr = this.f13278;
            if (iM9422 >= i2) {
                AbstractC5179.m9394(i2 + 1, i2, objArr, iM9422, objArr);
            } else {
                AbstractC5179.m9394(1, 0, objArr, iM9422, objArr);
                Object[] objArr2 = this.f13278;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i3 = this.f13280;
                AbstractC5179.m9394(i3 + 1, i3, objArr2, objArr2.length - 1, objArr2);
            }
            Object[] objArr3 = this.f13278;
            int i4 = this.f13280;
            objArr3[i4] = null;
            this.f13280 = m9417(i4);
        } else {
            int iM94222 = m9422((size() - 1) + i2);
            Object[] objArr4 = this.f13278;
            if (iM9422 <= iM94222) {
                AbstractC5179.m9394(iM9422, iM9422 + 1, objArr4, iM94222 + 1, objArr4);
            } else {
                AbstractC5179.m9394(iM9422, iM9422 + 1, objArr4, objArr4.length, objArr4);
                Object[] objArr5 = this.f13278;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC5179.m9394(0, 1, objArr5, iM94222 + 1, objArr5);
            }
            this.f13278[iM94222] = null;
        }
        this.f13279 = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            C5043.m9176("ArrayDeque is empty.");
            return null;
        }
        registerModification();
        Object[] objArr = this.f13278;
        int i = this.f13280;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f13280 = m9417(i);
        this.f13279 = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            C5043.m9176("ArrayDeque is empty.");
            return null;
        }
        registerModification();
        int iM9422 = m9422((size() - 1) + this.f13280);
        Object[] objArr = this.f13278;
        Object obj = objArr[iM9422];
        objArr[iM9422] = null;
        this.f13279 = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        C5165 c5165 = AbstractC5162.Companion;
        int size = size();
        c5165.getClass();
        C5165.m9321(i, i2, size);
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
        int i4 = this.f13280;
        if (i < size2) {
            int iM9422 = m9422((i - 1) + i4);
            int iM94222 = m9422(this.f13280 + (i2 - 1));
            while (i > 0) {
                int i5 = iM9422 + 1;
                int iMin = Math.min(i, Math.min(i5, iM94222 + 1));
                Object[] objArr = this.f13278;
                int i6 = iM94222 - iMin;
                int i7 = iM9422 - iMin;
                AbstractC5179.m9394(i6 + 1, i7 + 1, objArr, i5, objArr);
                iM9422 = m9421(i7);
                iM94222 = m9421(i6);
                i -= iMin;
            }
            int iM94223 = m9422(this.f13280 + i3);
            m9420(this.f13280, iM94223);
            this.f13280 = iM94223;
        } else {
            int iM94224 = m9422(i4 + i2);
            int iM94225 = m9422(this.f13280 + i);
            int size3 = size();
            while (true) {
                size3 -= i2;
                if (size3 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f13278;
                i2 = Math.min(size3, Math.min(objArr2.length - iM94224, objArr2.length - iM94225));
                Object[] objArr3 = this.f13278;
                int i8 = iM94224 + i2;
                AbstractC5179.m9394(iM94225, iM94224, objArr3, i8, objArr3);
                iM94224 = m9422(i8);
                iM94225 = m9422(iM94225 + i2);
            }
            int iM94226 = m9422(size() + this.f13280);
            m9420(m9421(iM94226 - i3), iM94226);
        }
        this.f13279 = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM9422;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f13278.length != 0) {
            int iM94222 = m9422(size() + this.f13280);
            int i = this.f13280;
            if (i < iM94222) {
                iM9422 = i;
                while (true) {
                    objArr = this.f13278;
                    if (i >= iM94222) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f13278[iM9422] = obj;
                        iM9422++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC5179.m9393(iM9422, iM94222, null, objArr);
            } else {
                int length = this.f13278.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f13278;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f13278[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM9422 = m9422(i2);
                for (int i3 = 0; i3 < iM94222; i3++) {
                    Object[] objArr3 = this.f13278;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f13278[iM9422] = obj3;
                        iM9422 = m9417(iM9422);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.f13279 = m9421(iM9422 - this.f13280);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C5165 c5165 = AbstractC5162.Companion;
        int size = size();
        c5165.getClass();
        C5165.m9323(i, size);
        int iM9422 = m9422(this.f13280 + i);
        Object[] objArr = this.f13278;
        Object obj2 = objArr[iM9422];
        objArr[iM9422] = obj;
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
        int iM9422 = m9422(size() + this.f13280);
        int i = this.f13280;
        if (i < iM9422) {
            AbstractC5179.m9399(i, iM9422, this.f13278, 2, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f13278;
            AbstractC5179.m9394(0, this.f13280, objArr2, objArr2.length, objArr);
            Object[] objArr3 = this.f13278;
            AbstractC5179.m9394(objArr3.length - this.f13280, 0, objArr3, iM9422, objArr);
        }
        int size = size();
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m9416() {
        if (isEmpty()) {
            return null;
        }
        return this.f13278[m9422((size() - 1) + this.f13280)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m9417(int i) {
        this.f13278.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m9418(int i) {
        if (i < 0) {
            C6755.m11870("Deque is too big.");
            return;
        }
        Object[] objArr = this.f13278;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f13277) {
            if (i < 10) {
                i = 10;
            }
            this.f13278 = new Object[i];
            return;
        }
        C5165 c5165 = AbstractC5162.Companion;
        int length = objArr.length;
        c5165.getClass();
        Object[] objArr2 = new Object[C5165.m9320(length, i)];
        Object[] objArr3 = this.f13278;
        AbstractC5179.m9394(0, this.f13280, objArr3, objArr3.length, objArr2);
        Object[] objArr4 = this.f13278;
        int length2 = objArr4.length;
        int i2 = this.f13280;
        AbstractC5179.m9394(length2 - i2, 0, objArr4, i2, objArr2);
        this.f13280 = 0;
        this.f13278 = objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9419(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f13278.length;
        while (i < length && it.hasNext()) {
            this.f13278[i] = it.next();
            i++;
        }
        int i2 = this.f13280;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f13278[i3] = it.next();
        }
        this.f13279 = collection.size() + size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m9420(int i, int i2) {
        Object[] objArr = this.f13278;
        if (i < i2) {
            AbstractC5179.m9393(i, i2, null, objArr);
        } else {
            AbstractC5179.m9393(i, objArr.length, null, objArr);
            AbstractC5179.m9393(0, i2, null, this.f13278);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m9421(int i) {
        return i < 0 ? i + this.f13278.length : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m9422(int i) {
        Object[] objArr = this.f13278;
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
        m9418(collection.size() + size());
        m9419(m9422(size() + this.f13280), collection);
        return true;
    }
}
