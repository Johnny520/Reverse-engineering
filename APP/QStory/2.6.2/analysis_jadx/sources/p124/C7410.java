package p124;

import androidx.compose.runtime.AbstractC1392;
import androidx.compose.runtime.snapshots.C1284;
import androidx.core.view.C2268;
import com.bumptech.glide.AbstractC3056;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractC4346;
import kotlin.collections.AbstractC4347;
import p033.AbstractC6325;
import p052.InterfaceC6557;
import p054.InterfaceC6565;
import p115.C7335;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7410 extends AbstractC4347 implements Collection, InterfaceC6565 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C7335 f20091 = new C7335();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f20092;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f20093;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object[] f20094;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Object[] f20095;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f20096;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object[] f20097;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC7414 f20098;

    public C7410(AbstractC7414 abstractC7414, Object[] objArr, Object[] objArr2, int i) {
        this.f20098 = abstractC7414;
        this.f20096 = objArr;
        this.f20097 = objArr2;
        this.f20092 = i;
        this.f20094 = objArr;
        this.f20095 = objArr2;
        this.f20093 = abstractC7414.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12571(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        AbstractC6325.m11856(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM12581 = m12581();
        if (i >= iM12581) {
            m12595(obj, i - iM12581, this.f20094);
            return;
        }
        C7412 c7412 = new C7412(null);
        Object[] objArr = this.f20094;
        objArr.getClass();
        m12595(c7412.f20104, 0, m12596(objArr, this.f20092, i, obj, c7412));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM12593;
        AbstractC6325.m11856(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (size() - i2)) - 1) / 32;
        if (size == 0) {
            m12581();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f20095;
            Object[] objArrM12597 = m12597(objArr);
            AbstractC4346.m8839(size2 + 1, i3, objArr, m12578(), objArrM12597);
            m12571(objArrM12597, i3, collection.iterator());
            this.f20095 = objArrM12597;
            this.f20093 = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM12578 = m12578();
        int size3 = collection.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m12581()) {
            objArrM12593 = m12593();
            collection2 = collection;
            m12579(collection2, i, this.f20095, iM12578, objArr2, size, objArrM12593);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.f20095;
            if (size3 > iM12578) {
                int i4 = size3 - iM12578;
                Object[] objArrM12590 = m12590(i4, objArr3);
                m12582(collection2, i, i4, objArr2, size, objArrM12590);
                objArr2 = objArr2;
                objArrM12593 = objArrM12590;
            } else {
                objArrM12593 = m12593();
                int i5 = iM12578 - size3;
                AbstractC4346.m8839(0, i5, objArr3, iM12578, objArrM12593);
                int i6 = 32 - i5;
                Object[] objArrM125902 = m12590(i6, this.f20095);
                int i7 = size - 1;
                objArr2[i7] = objArrM125902;
                m12582(collection2, i, i6, objArr2, i7, objArrM125902);
                collection2 = collection2;
            }
        }
        this.f20094 = m12588(this.f20094, i2, objArr2);
        this.f20095 = objArrM12593;
        this.f20093 = collection2.size() + size();
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC6325.m11857(i, size());
        if (m12581() <= i) {
            objArr = this.f20095;
        } else {
            Object[] objArr2 = this.f20094;
            objArr2.getClass();
            for (int i2 = this.f20092; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[AbstractC3056.m6665(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // kotlin.collections.AbstractC4347
    /* JADX INFO: renamed from: getSize */
    public final int getLength() {
        return this.f20093;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC6325.m11856(i, size());
        return new C7416(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m12574(new C1284(collection, 2));
    }

    @Override // kotlin.collections.AbstractC4347
    public final Object removeAt(int i) {
        AbstractC6325.m11857(i, size());
        ((AbstractList) this).modCount++;
        int iM12581 = m12581();
        if (i >= iM12581) {
            return m12572(this.f20094, iM12581, this.f20092, i - iM12581);
        }
        C7412 c7412 = new C7412(this.f20095[0]);
        Object[] objArr = this.f20094;
        objArr.getClass();
        m12572(m12573(objArr, this.f20092, i, c7412), iM12581, this.f20092, 0);
        return c7412.f20104;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        AbstractC6325.m11857(i, size());
        if (m12581() > i) {
            C7412 c7412 = new C7412(null);
            Object[] objArr = this.f20094;
            objArr.getClass();
            this.f20094 = m12580(objArr, this.f20092, i, obj, c7412);
            return c7412.f20104;
        }
        Object[] objArrM12597 = m12597(this.f20095);
        if (objArrM12597 != this.f20095) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM12597[i2];
        objArrM12597[i2] = obj;
        this.f20095 = objArrM12597;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m12572(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        Object[] objArr2 = this.f20095;
        if (size == 1) {
            Object obj = objArr2[0];
            m12586(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM12597 = m12597(objArr2);
        AbstractC4346.m8839(i3, i3 + 1, objArr2, size, objArrM12597);
        objArrM12597[size - 1] = null;
        this.f20094 = objArr;
        this.f20095 = objArrM12597;
        this.f20093 = (i + size) - 1;
        this.f20092 = i2;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Object[] m12573(Object[] objArr, int i, int i2, C7412 c7412) {
        int iM6665 = AbstractC3056.m6665(i2, i);
        if (i == 0) {
            Object obj = objArr[iM6665];
            Object[] objArrM12597 = m12597(objArr);
            AbstractC4346.m8839(iM6665, iM6665 + 1, objArr, 32, objArrM12597);
            objArrM12597[31] = c7412.f20104;
            c7412.f20104 = obj;
            return objArrM12597;
        }
        int iM66652 = objArr[31] == null ? AbstractC3056.m6665(m12581() - 1, i) : 31;
        Object[] objArrM125972 = m12597(objArr);
        int i3 = i - 5;
        int i4 = iM6665 + 1;
        if (i4 <= iM66652) {
            while (true) {
                Object obj2 = objArrM125972[iM66652];
                obj2.getClass();
                objArrM125972[iM66652] = m12573((Object[]) obj2, i3, 0, c7412);
                if (iM66652 == i4) {
                    break;
                }
                iM66652--;
            }
        }
        Object obj3 = objArrM125972[iM6665];
        obj3.getClass();
        objArrM125972[iM6665] = m12573((Object[]) obj3, i3, i2, c7412);
        return objArrM125972;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m12574(InterfaceC6557 interfaceC6557) {
        int i;
        InterfaceC6557 interfaceC65572 = interfaceC6557;
        int iM12578 = m12578();
        Object[] objArrM12591 = null;
        C7412 c7412 = new C7412(null);
        boolean z = false;
        if (this.f20094 != null) {
            AbstractC7415 abstractC7415M12599 = m12599(0);
            int iM12576 = 32;
            while (iM12576 == 32 && abstractC7415M12599.hasNext()) {
                iM12576 = m12576(interfaceC65572, (Object[]) abstractC7415M12599.next(), 32, c7412);
            }
            if (iM12576 == 32) {
                int iM12575 = m12575(interfaceC65572, iM12578, c7412);
                if (iM12575 == 0) {
                    m12586(this.f20094, size(), this.f20092);
                }
                if (iM12575 != iM12578) {
                }
            } else {
                int i2 = (abstractC7415M12599.f20108 - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM12577 = iM12576;
                while (abstractC7415M12599.hasNext()) {
                    iM12577 = m12577(interfaceC65572, (Object[]) abstractC7415M12599.next(), 32, iM12577, c7412, arrayList2, arrayList);
                    interfaceC65572 = interfaceC6557;
                }
                int iM125772 = m12577(interfaceC6557, this.f20095, iM12578, iM12577, c7412, arrayList2, arrayList);
                Object obj = c7412.f20104;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM125772, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrM12585 = this.f20094;
                if (zIsEmpty) {
                    objArrM12585.getClass();
                } else {
                    objArrM12585 = m12585(objArrM12585, i2, this.f20092, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC1392.m2528("invalid size");
                }
                if (size == 0) {
                    this.f20092 = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f20092;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f20092 = i - 5;
                        Object[] objArr2 = objArrM12585[0];
                        objArr2.getClass();
                        objArrM12585 = objArr2;
                    }
                    objArrM12591 = m12591(objArrM12585, i3, i);
                }
                this.f20094 = objArrM12591;
                this.f20095 = objArr;
                this.f20093 = size + iM125772;
            }
            z = true;
        } else if (m12575(interfaceC65572, iM12578, c7412) != iM12578) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int m12575(InterfaceC6557 interfaceC6557, int i, C7412 c7412) {
        int iM12576 = m12576(interfaceC6557, this.f20095, i, c7412);
        Object obj = c7412.f20104;
        if (iM12576 == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM12576, i, (Object) null);
        this.f20095 = objArr;
        this.f20093 = size() - (i - iM12576);
        return iM12576;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int m12576(InterfaceC6557 interfaceC6557, Object[] objArr, int i, C7412 c7412) {
        Object[] objArrM12597 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) interfaceC6557.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM12597 = m12597(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM12597[i2] = obj;
                i2++;
            }
        }
        c7412.f20104 = objArrM12597;
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int m12577(InterfaceC6557 interfaceC6557, Object[] objArr, int i, int i2, C7412 c7412, ArrayList arrayList, ArrayList arrayList2) {
        if (m12598(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c7412.f20104;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM12593 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) interfaceC6557.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM12593 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m12593();
                    i2 = 0;
                }
                objArrM12593[i2] = obj2;
                i2++;
            }
        }
        c7412.f20104 = objArrM12593;
        if (objArr2 != objArrM12593) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final int m12578() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & (-32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m12579(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM12593;
        if (i3 < 1) {
            AbstractC1392.m2528("requires at least one nullBuffer");
        }
        Object[] objArrM12597 = m12597(objArr);
        objArr2[0] = objArrM12597;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC4346.m8839(size + 1, i4, objArrM12597, i2, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM12593 = objArrM12597;
            } else {
                objArrM12593 = m12593();
                i3--;
                objArr2[i3] = objArrM12593;
            }
            int i7 = i2 - i6;
            AbstractC4346.m8839(0, i7, objArrM12597, i2, objArr3);
            AbstractC4346.m8839(size + 1, i4, objArrM12597, i7, objArrM12593);
            objArr3 = objArrM12593;
        }
        Iterator it = collection.iterator();
        m12571(objArrM12597, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM125932 = m12593();
            m12571(objArrM125932, 0, it);
            objArr2[i8] = objArrM125932;
        }
        m12571(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final Object[] m12580(Object[] objArr, int i, int i2, Object obj, C7412 c7412) {
        int iM6665 = AbstractC3056.m6665(i2, i);
        Object[] objArrM12597 = m12597(objArr);
        if (i != 0) {
            Object obj2 = objArrM12597[iM6665];
            obj2.getClass();
            objArrM12597[iM6665] = m12580((Object[]) obj2, i - 5, i2, obj, c7412);
            return objArrM12597;
        }
        if (objArrM12597 != objArr) {
            ((AbstractList) this).modCount++;
        }
        c7412.f20104 = objArrM12597[iM6665];
        objArrM12597[iM6665] = obj;
        return objArrM12597;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int m12581() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12582(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f20094 == null) {
            C5919.m11250("root is null");
            return;
        }
        int i4 = i >> 5;
        AbstractC7415 abstractC7415M12599 = m12599(m12581() >> 5);
        int i5 = i3;
        Object[] objArrM12590 = objArr2;
        while (abstractC7415M12599.f20108 - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC7415M12599.previous();
            AbstractC4346.m8839(0, 32 - i2, objArr3, 32, objArrM12590);
            objArrM12590 = m12590(i2, objArr3);
            i5--;
            objArr[i5] = objArrM12590;
        }
        Object[] objArr4 = (Object[]) abstractC7415M12599.previous();
        int iM12581 = i3 - (((m12581() >> 5) - 1) - i4);
        if (iM12581 < i3) {
            objArr2 = objArr[iM12581];
            objArr2.getClass();
        }
        m12579(collection, i, objArr4, 32, objArr, iM12581, objArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m12583() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7414 m12584() {
        AbstractC7414 c7418;
        Object[] objArr = this.f20094;
        if (objArr == this.f20096 && this.f20095 == this.f20097) {
            c7418 = this.f20098;
        } else {
            this.f20091 = new C7335();
            this.f20096 = objArr;
            Object[] objArr2 = this.f20095;
            this.f20097 = objArr2;
            c7418 = objArr == null ? objArr2.length == 0 ? C7418.f20115 : new C7418(Arrays.copyOf(objArr2, size())) : new C7411(objArr, objArr2, size(), this.f20092);
        }
        this.f20098 = c7418;
        return c7418;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object[] m12585(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            AbstractC1392.m2528("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            AbstractC1392.m2528("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM12597 = m12597(objArr);
        int iM6665 = AbstractC3056.m6665(i, i2);
        int i3 = i2 - 5;
        objArrM12597[iM6665] = m12585((Object[]) objArrM12597[iM6665], i, i3, it);
        while (true) {
            iM6665++;
            if (iM6665 >= 32 || !it.hasNext()) {
                break;
            }
            objArrM12597[iM6665] = m12585((Object[]) objArrM12597[iM6665], 0, i3, it);
        }
        return objArrM12597;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m12586(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f20094 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f20095 = objArr;
            this.f20093 = i;
            this.f20092 = i2;
            return;
        }
        C7412 c7412 = new C7412(null);
        objArr.getClass();
        Object[] objArrM12592 = m12592(objArr, i2, i, c7412);
        objArrM12592.getClass();
        Object obj = c7412.f20104;
        obj.getClass();
        this.f20095 = (Object[]) obj;
        this.f20093 = i;
        if (objArrM12592[1] == null) {
            this.f20094 = (Object[]) objArrM12592[0];
            this.f20092 = i2 - 5;
        } else {
            this.f20094 = objArrM12592;
            this.f20092 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Object[] m12587(int i, Object[] objArr, Object[] objArr2) {
        int iM6665 = AbstractC3056.m6665(size() - 1, i);
        Object[] objArrM12597 = m12597(objArr);
        if (i == 5) {
            objArrM12597[iM6665] = objArr2;
            return objArrM12597;
        }
        objArrM12597[iM6665] = m12587(i - 5, (Object[]) objArrM12597[iM6665], objArr2);
        return objArrM12597;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object[] m12588(Object[] objArr, int i, Object[][] objArr2) {
        C2268 c2268 = new C2268(objArr2);
        int i2 = i >> 5;
        int i3 = this.f20092;
        Object[] objArrM12585 = i2 < (1 << i3) ? m12585(objArr, i, i3, c2268) : m12597(objArr);
        while (c2268.hasNext()) {
            this.f20092 += 5;
            objArrM12585 = m12594(objArrM12585);
            int i4 = this.f20092;
            m12585(objArrM12585, 1 << i4, i4, c2268);
        }
        return objArrM12585;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m12589(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f20092;
        if (size > (1 << i)) {
            this.f20094 = m12587(this.f20092 + 5, m12594(objArr), objArr2);
            this.f20095 = objArr3;
            this.f20092 += 5;
            this.f20093 = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f20094 = objArr2;
            this.f20095 = objArr3;
            this.f20093 = size() + 1;
        } else {
            this.f20094 = m12587(i, objArr, objArr2);
            this.f20095 = objArr3;
            this.f20093 = size() + 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Object[] m12590(int i, Object[] objArr) {
        if (m12598(objArr)) {
            AbstractC4346.m8839(i, 0, objArr, 32 - i, objArr);
            return objArr;
        }
        Object[] objArrM12593 = m12593();
        AbstractC4346.m8839(i, 0, objArr, 32 - i, objArrM12593);
        return objArrM12593;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object[] m12591(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            AbstractC1392.m2528("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM6665 = AbstractC3056.m6665(i, i2);
        Object obj = objArr[iM6665];
        obj.getClass();
        Object objM12591 = m12591((Object[]) obj, i, i2 - 5);
        if (iM6665 < 31) {
            int i3 = iM6665 + 1;
            if (objArr[i3] != null) {
                if (m12598(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM12593 = m12593();
                AbstractC4346.m8839(0, 0, objArr, i3, objArrM12593);
                objArr = objArrM12593;
            }
        }
        if (objM12591 == objArr[iM6665]) {
            return objArr;
        }
        Object[] objArrM12597 = m12597(objArr);
        objArrM12597[iM6665] = objM12591;
        return objArrM12597;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object[] m12592(Object[] objArr, int i, int i2, C7412 c7412) {
        Object[] objArrM12592;
        int iM6665 = AbstractC3056.m6665(i2 - 1, i);
        if (i == 5) {
            c7412.f20104 = objArr[iM6665];
            objArrM12592 = null;
        } else {
            Object obj = objArr[iM6665];
            obj.getClass();
            objArrM12592 = m12592((Object[]) obj, i - 5, i2, c7412);
        }
        if (objArrM12592 == null && iM6665 == 0) {
            return null;
        }
        Object[] objArrM12597 = m12597(objArr);
        objArrM12597[iM6665] = objArrM12592;
        return objArrM12597;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Object[] m12593() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f20091;
        return objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] m12594(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f20091;
        return objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12595(Object obj, int i, Object[] objArr) {
        int iM12578 = m12578();
        Object[] objArrM12597 = m12597(this.f20095);
        Object[] objArr2 = this.f20095;
        if (iM12578 >= 32) {
            Object obj2 = objArr2[31];
            AbstractC4346.m8839(i + 1, i, objArr2, 31, objArrM12597);
            objArrM12597[i] = obj;
            m12589(objArr, objArrM12597, m12594(obj2));
            return;
        }
        AbstractC4346.m8839(i + 1, i, objArr2, iM12578, objArrM12597);
        objArrM12597[i] = obj;
        this.f20094 = objArr;
        this.f20095 = objArrM12597;
        this.f20093 = size() + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object[] m12596(Object[] objArr, int i, int i2, Object obj, C7412 c7412) {
        Object obj2;
        int iM6665 = AbstractC3056.m6665(i2, i);
        if (i == 0) {
            c7412.f20104 = objArr[31];
            Object[] objArrM12597 = m12597(objArr);
            AbstractC4346.m8839(iM6665 + 1, iM6665, objArr, 31, objArrM12597);
            objArrM12597[iM6665] = obj;
            return objArrM12597;
        }
        Object[] objArrM125972 = m12597(objArr);
        int i3 = i - 5;
        Object obj3 = objArrM125972[iM6665];
        obj3.getClass();
        objArrM125972[iM6665] = m12596((Object[]) obj3, i3, i2, obj, c7412);
        while (true) {
            iM6665++;
            if (iM6665 >= 32 || (obj2 = objArrM125972[iM6665]) == null) {
                break;
            }
            objArrM125972[iM6665] = m12596((Object[]) obj2, i3, 0, c7412.f20104, c7412);
        }
        return objArrM125972;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Object[] m12597(Object[] objArr) {
        if (objArr == null) {
            return m12593();
        }
        if (m12598(objArr)) {
            return objArr;
        }
        Object[] objArrM12593 = m12593();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC4346.m8837(0, length, objArr, 6, objArrM12593);
        return objArrM12593;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m12598(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f20091;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC7415 m12599(int i) {
        Object[] objArr = this.f20094;
        if (objArr == null) {
            C5919.m11250("Invalid root");
            return null;
        }
        int iM12581 = m12581() >> 5;
        AbstractC6325.m11856(i, iM12581);
        int i2 = this.f20092;
        return i2 == 0 ? new C7413(objArr, i) : new C7419(objArr, i, iM12581, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM12578 = m12578();
        if (iM12578 < 32) {
            Object[] objArrM12597 = m12597(this.f20095);
            objArrM12597[iM12578] = obj;
            this.f20095 = objArrM12597;
            this.f20093 = size() + 1;
        } else {
            m12589(this.f20094, this.f20095, m12594(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM12578 = m12578();
        Iterator it = collection.iterator();
        if (32 - iM12578 >= collection.size()) {
            Object[] objArrM12597 = m12597(this.f20095);
            m12571(objArrM12597, iM12578, it);
            this.f20095 = objArrM12597;
            this.f20093 = collection.size() + size();
            return true;
        }
        int size = ((collection.size() + iM12578) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM125972 = m12597(this.f20095);
        m12571(objArrM125972, iM12578, it);
        objArr[0] = objArrM125972;
        for (int i = 1; i < size; i++) {
            Object[] objArrM12593 = m12593();
            m12571(objArrM12593, 0, it);
            objArr[i] = objArrM12593;
        }
        this.f20094 = m12588(this.f20094, m12581(), objArr);
        Object[] objArrM125932 = m12593();
        m12571(objArrM125932, 0, it);
        this.f20095 = objArrM125932;
        this.f20093 = collection.size() + size();
        return true;
    }
}
