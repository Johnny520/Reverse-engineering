package p124;

import androidx.compose.runtime.AbstractC1392;
import androidx.compose.runtime.snapshots.C1284;
import androidx.core.view.C2268;
import io.ktor.client.plugins.AbstractC3933;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractC4347;
import kotlin.collections.AbstractC4348;
import p052.InterfaceC6558;
import p054.InterfaceC6566;
import p115.C7336;
import p316.C8667;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7411 extends AbstractC4348 implements Collection, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C7336 f20086 = new C7336();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f20087;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f20088;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object[] f20089;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Object[] f20090;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f20091;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object[] f20092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC7415 f20093;

    public C7411(AbstractC7415 abstractC7415, Object[] objArr, Object[] objArr2, int i) {
        this.f20093 = abstractC7415;
        this.f20091 = objArr;
        this.f20092 = objArr2;
        this.f20087 = i;
        this.f20089 = objArr;
        this.f20090 = objArr2;
        this.f20088 = abstractC7415.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12598(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        C8667.m14372(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM12607 = m12607();
        if (i >= iM12607) {
            m12622(obj, i - iM12607, this.f20089);
            return;
        }
        C7413 c7413 = new C7413(null);
        Object[] objArr = this.f20089;
        objArr.getClass();
        m12622(c7413.f20099, 0, m12623(objArr, this.f20087, i, obj, c7413));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM12620;
        C8667.m14372(i, size());
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
            m12607();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f20090;
            Object[] objArrM12624 = m12624(objArr);
            AbstractC4347.m8835(size2 + 1, i3, objArr, m12604(), objArrM12624);
            m12598(objArrM12624, i3, collection.iterator());
            this.f20090 = objArrM12624;
            this.f20088 = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM12604 = m12604();
        int size3 = collection.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m12607()) {
            objArrM12620 = m12620();
            collection2 = collection;
            m12605(collection2, i, this.f20090, iM12604, objArr2, size, objArrM12620);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.f20090;
            if (size3 > iM12604) {
                int i4 = size3 - iM12604;
                Object[] objArrM12617 = m12617(i4, objArr3);
                m12608(collection2, i, i4, objArr2, size, objArrM12617);
                objArr2 = objArr2;
                objArrM12620 = objArrM12617;
            } else {
                objArrM12620 = m12620();
                int i5 = iM12604 - size3;
                AbstractC4347.m8835(0, i5, objArr3, iM12604, objArrM12620);
                int i6 = 32 - i5;
                Object[] objArrM126172 = m12617(i6, this.f20090);
                int i7 = size - 1;
                objArr2[i7] = objArrM126172;
                m12608(collection2, i, i6, objArr2, i7, objArrM126172);
                collection2 = collection2;
            }
        }
        this.f20089 = m12615(this.f20089, i2, objArr2);
        this.f20090 = objArrM12620;
        this.f20088 = collection2.size() + size();
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        C8667.m14373(i, size());
        if (m12607() <= i) {
            objArr = this.f20090;
        } else {
            Object[] objArr2 = this.f20089;
            objArr2.getClass();
            for (int i2 = this.f20087; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[AbstractC3933.m8306(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // kotlin.collections.AbstractC4348
    /* JADX INFO: renamed from: getSize */
    public final int getLength() {
        return this.f20088;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C8667.m14372(i, size());
        return new C7417(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m12601(new C1284(collection, 2));
    }

    @Override // kotlin.collections.AbstractC4348
    public final Object removeAt(int i) {
        C8667.m14373(i, size());
        ((AbstractList) this).modCount++;
        int iM12607 = m12607();
        if (i >= iM12607) {
            return m12599(this.f20089, iM12607, this.f20087, i - iM12607);
        }
        C7413 c7413 = new C7413(this.f20090[0]);
        Object[] objArr = this.f20089;
        objArr.getClass();
        m12599(m12600(objArr, this.f20087, i, c7413), iM12607, this.f20087, 0);
        return c7413.f20099;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C8667.m14373(i, size());
        if (m12607() > i) {
            C7413 c7413 = new C7413(null);
            Object[] objArr = this.f20089;
            objArr.getClass();
            this.f20089 = m12606(objArr, this.f20087, i, obj, c7413);
            return c7413.f20099;
        }
        Object[] objArrM12624 = m12624(this.f20090);
        if (objArrM12624 != this.f20090) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM12624[i2];
        objArrM12624[i2] = obj;
        this.f20090 = objArrM12624;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m12599(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        Object[] objArr2 = this.f20090;
        if (size == 1) {
            Object obj = objArr2[0];
            m12612(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM12624 = m12624(objArr2);
        AbstractC4347.m8835(i3, i3 + 1, objArr2, size, objArrM12624);
        objArrM12624[size - 1] = null;
        this.f20089 = objArr;
        this.f20090 = objArrM12624;
        this.f20088 = (i + size) - 1;
        this.f20087 = i2;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Object[] m12600(Object[] objArr, int i, int i2, C7413 c7413) {
        int iM8306 = AbstractC3933.m8306(i2, i);
        if (i == 0) {
            Object obj = objArr[iM8306];
            Object[] objArrM12624 = m12624(objArr);
            AbstractC4347.m8835(iM8306, iM8306 + 1, objArr, 32, objArrM12624);
            objArrM12624[31] = c7413.f20099;
            c7413.f20099 = obj;
            return objArrM12624;
        }
        int iM83062 = objArr[31] == null ? AbstractC3933.m8306(m12607() - 1, i) : 31;
        Object[] objArrM126242 = m12624(objArr);
        int i3 = i - 5;
        int i4 = iM8306 + 1;
        if (i4 <= iM83062) {
            while (true) {
                Object obj2 = objArrM126242[iM83062];
                obj2.getClass();
                objArrM126242[iM83062] = m12600((Object[]) obj2, i3, 0, c7413);
                if (iM83062 == i4) {
                    break;
                }
                iM83062--;
            }
        }
        Object obj3 = objArrM126242[iM8306];
        obj3.getClass();
        objArrM126242[iM8306] = m12600((Object[]) obj3, i3, i2, c7413);
        return objArrM126242;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m12601(InterfaceC6558 interfaceC6558) {
        int i;
        InterfaceC6558 interfaceC65582 = interfaceC6558;
        int iM12604 = m12604();
        Object[] objArrM12618 = null;
        C7413 c7413 = new C7413(null);
        boolean z = false;
        if (this.f20089 != null) {
            AbstractC7416 abstractC7416M12626 = m12626(0);
            int iM12603 = 32;
            while (iM12603 == 32 && abstractC7416M12626.hasNext()) {
                iM12603 = m12603(interfaceC65582, (Object[]) abstractC7416M12626.next(), 32, c7413);
            }
            if (iM12603 == 32) {
                int iM12602 = m12602(interfaceC65582, iM12604, c7413);
                if (iM12602 == 0) {
                    m12612(this.f20089, size(), this.f20087);
                }
                if (iM12602 != iM12604) {
                }
            } else {
                int i2 = (abstractC7416M12626.f20103 - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM12614 = iM12603;
                while (abstractC7416M12626.hasNext()) {
                    iM12614 = m12614(interfaceC65582, (Object[]) abstractC7416M12626.next(), 32, iM12614, c7413, arrayList2, arrayList);
                    interfaceC65582 = interfaceC6558;
                }
                int iM126142 = m12614(interfaceC6558, this.f20090, iM12604, iM12614, c7413, arrayList2, arrayList);
                Object obj = c7413.f20099;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM126142, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrM12611 = this.f20089;
                if (zIsEmpty) {
                    objArrM12611.getClass();
                } else {
                    objArrM12611 = m12611(objArrM12611, i2, this.f20087, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC1392.m2538("invalid size");
                }
                if (size == 0) {
                    this.f20087 = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f20087;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f20087 = i - 5;
                        Object[] objArr2 = objArrM12611[0];
                        objArr2.getClass();
                        objArrM12611 = objArr2;
                    }
                    objArrM12618 = m12618(objArrM12611, i3, i);
                }
                this.f20089 = objArrM12618;
                this.f20090 = objArr;
                this.f20088 = size + iM126142;
            }
            z = true;
        } else if (m12602(interfaceC65582, iM12604, c7413) != iM12604) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int m12602(InterfaceC6558 interfaceC6558, int i, C7413 c7413) {
        int iM12603 = m12603(interfaceC6558, this.f20090, i, c7413);
        Object obj = c7413.f20099;
        if (iM12603 == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM12603, i, (Object) null);
        this.f20090 = objArr;
        this.f20088 = size() - (i - iM12603);
        return iM12603;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int m12603(InterfaceC6558 interfaceC6558, Object[] objArr, int i, C7413 c7413) {
        Object[] objArrM12624 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) interfaceC6558.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM12624 = m12624(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM12624[i2] = obj;
                i2++;
            }
        }
        c7413.f20099 = objArrM12624;
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final int m12604() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & (-32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m12605(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM12620;
        if (i3 < 1) {
            AbstractC1392.m2538("requires at least one nullBuffer");
        }
        Object[] objArrM12624 = m12624(objArr);
        objArr2[0] = objArrM12624;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC4347.m8835(size + 1, i4, objArrM12624, i2, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM12620 = objArrM12624;
            } else {
                objArrM12620 = m12620();
                i3--;
                objArr2[i3] = objArrM12620;
            }
            int i7 = i2 - i6;
            AbstractC4347.m8835(0, i7, objArrM12624, i2, objArr3);
            AbstractC4347.m8835(size + 1, i4, objArrM12624, i7, objArrM12620);
            objArr3 = objArrM12620;
        }
        Iterator it = collection.iterator();
        m12598(objArrM12624, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM126202 = m12620();
            m12598(objArrM126202, 0, it);
            objArr2[i8] = objArrM126202;
        }
        m12598(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final Object[] m12606(Object[] objArr, int i, int i2, Object obj, C7413 c7413) {
        int iM8306 = AbstractC3933.m8306(i2, i);
        Object[] objArrM12624 = m12624(objArr);
        if (i != 0) {
            Object obj2 = objArrM12624[iM8306];
            obj2.getClass();
            objArrM12624[iM8306] = m12606((Object[]) obj2, i - 5, i2, obj, c7413);
            return objArrM12624;
        }
        if (objArrM12624 != objArr) {
            ((AbstractList) this).modCount++;
        }
        c7413.f20099 = objArrM12624[iM8306];
        objArrM12624[iM8306] = obj;
        return objArrM12624;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int m12607() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12608(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f20089 == null) {
            C5925.m11311("root is null");
            return;
        }
        int i4 = i >> 5;
        AbstractC7416 abstractC7416M12626 = m12626(m12607() >> 5);
        int i5 = i3;
        Object[] objArrM12617 = objArr2;
        while (abstractC7416M12626.f20103 - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC7416M12626.previous();
            AbstractC4347.m8835(0, 32 - i2, objArr3, 32, objArrM12617);
            objArrM12617 = m12617(i2, objArr3);
            i5--;
            objArr[i5] = objArrM12617;
        }
        Object[] objArr4 = (Object[]) abstractC7416M12626.previous();
        int iM12607 = i3 - (((m12607() >> 5) - 1) - i4);
        if (iM12607 < i3) {
            objArr2 = objArr[iM12607];
            objArr2.getClass();
        }
        m12605(collection, i, objArr4, 32, objArr, iM12607, objArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m12609() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7415 m12610() {
        AbstractC7415 c7419;
        Object[] objArr = this.f20089;
        if (objArr == this.f20091 && this.f20090 == this.f20092) {
            c7419 = this.f20093;
        } else {
            this.f20086 = new C7336();
            this.f20091 = objArr;
            Object[] objArr2 = this.f20090;
            this.f20092 = objArr2;
            c7419 = objArr == null ? objArr2.length == 0 ? C7419.f20110 : new C7419(Arrays.copyOf(objArr2, size())) : new C7412(objArr, objArr2, size(), this.f20087);
        }
        this.f20093 = c7419;
        return c7419;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object[] m12611(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            AbstractC1392.m2538("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            AbstractC1392.m2538("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM12624 = m12624(objArr);
        int iM8306 = AbstractC3933.m8306(i, i2);
        int i3 = i2 - 5;
        objArrM12624[iM8306] = m12611((Object[]) objArrM12624[iM8306], i, i3, it);
        while (true) {
            iM8306++;
            if (iM8306 >= 32 || !it.hasNext()) {
                break;
            }
            objArrM12624[iM8306] = m12611((Object[]) objArrM12624[iM8306], 0, i3, it);
        }
        return objArrM12624;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m12612(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f20089 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f20090 = objArr;
            this.f20088 = i;
            this.f20087 = i2;
            return;
        }
        C7413 c7413 = new C7413(null);
        objArr.getClass();
        Object[] objArrM12619 = m12619(objArr, i2, i, c7413);
        objArrM12619.getClass();
        Object obj = c7413.f20099;
        obj.getClass();
        this.f20090 = (Object[]) obj;
        this.f20088 = i;
        if (objArrM12619[1] == null) {
            this.f20089 = (Object[]) objArrM12619[0];
            this.f20087 = i2 - 5;
        } else {
            this.f20089 = objArrM12619;
            this.f20087 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Object[] m12613(int i, Object[] objArr, Object[] objArr2) {
        int iM8306 = AbstractC3933.m8306(size() - 1, i);
        Object[] objArrM12624 = m12624(objArr);
        if (i == 5) {
            objArrM12624[iM8306] = objArr2;
            return objArrM12624;
        }
        objArrM12624[iM8306] = m12613(i - 5, (Object[]) objArrM12624[iM8306], objArr2);
        return objArrM12624;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int m12614(InterfaceC6558 interfaceC6558, Object[] objArr, int i, int i2, C7413 c7413, ArrayList arrayList, ArrayList arrayList2) {
        if (m12625(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c7413.f20099;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM12620 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) interfaceC6558.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM12620 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m12620();
                    i2 = 0;
                }
                objArrM12620[i2] = obj2;
                i2++;
            }
        }
        c7413.f20099 = objArrM12620;
        if (objArr2 != objArrM12620) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object[] m12615(Object[] objArr, int i, Object[][] objArr2) {
        C2268 c2268 = new C2268(objArr2);
        int i2 = i >> 5;
        int i3 = this.f20087;
        Object[] objArrM12611 = i2 < (1 << i3) ? m12611(objArr, i, i3, c2268) : m12624(objArr);
        while (c2268.hasNext()) {
            this.f20087 += 5;
            objArrM12611 = m12621(objArrM12611);
            int i4 = this.f20087;
            m12611(objArrM12611, 1 << i4, i4, c2268);
        }
        return objArrM12611;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m12616(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f20087;
        if (size > (1 << i)) {
            this.f20089 = m12613(this.f20087 + 5, m12621(objArr), objArr2);
            this.f20090 = objArr3;
            this.f20087 += 5;
            this.f20088 = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f20089 = objArr2;
            this.f20090 = objArr3;
            this.f20088 = size() + 1;
        } else {
            this.f20089 = m12613(i, objArr, objArr2);
            this.f20090 = objArr3;
            this.f20088 = size() + 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Object[] m12617(int i, Object[] objArr) {
        if (m12625(objArr)) {
            AbstractC4347.m8835(i, 0, objArr, 32 - i, objArr);
            return objArr;
        }
        Object[] objArrM12620 = m12620();
        AbstractC4347.m8835(i, 0, objArr, 32 - i, objArrM12620);
        return objArrM12620;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object[] m12618(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            AbstractC1392.m2538("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM8306 = AbstractC3933.m8306(i, i2);
        Object obj = objArr[iM8306];
        obj.getClass();
        Object objM12618 = m12618((Object[]) obj, i, i2 - 5);
        if (iM8306 < 31) {
            int i3 = iM8306 + 1;
            if (objArr[i3] != null) {
                if (m12625(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM12620 = m12620();
                AbstractC4347.m8835(0, 0, objArr, i3, objArrM12620);
                objArr = objArrM12620;
            }
        }
        if (objM12618 == objArr[iM8306]) {
            return objArr;
        }
        Object[] objArrM12624 = m12624(objArr);
        objArrM12624[iM8306] = objM12618;
        return objArrM12624;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object[] m12619(Object[] objArr, int i, int i2, C7413 c7413) {
        Object[] objArrM12619;
        int iM8306 = AbstractC3933.m8306(i2 - 1, i);
        if (i == 5) {
            c7413.f20099 = objArr[iM8306];
            objArrM12619 = null;
        } else {
            Object obj = objArr[iM8306];
            obj.getClass();
            objArrM12619 = m12619((Object[]) obj, i - 5, i2, c7413);
        }
        if (objArrM12619 == null && iM8306 == 0) {
            return null;
        }
        Object[] objArrM12624 = m12624(objArr);
        objArrM12624[iM8306] = objArrM12619;
        return objArrM12624;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Object[] m12620() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f20086;
        return objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] m12621(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f20086;
        return objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12622(Object obj, int i, Object[] objArr) {
        int iM12604 = m12604();
        Object[] objArrM12624 = m12624(this.f20090);
        Object[] objArr2 = this.f20090;
        if (iM12604 >= 32) {
            Object obj2 = objArr2[31];
            AbstractC4347.m8835(i + 1, i, objArr2, 31, objArrM12624);
            objArrM12624[i] = obj;
            m12616(objArr, objArrM12624, m12621(obj2));
            return;
        }
        AbstractC4347.m8835(i + 1, i, objArr2, iM12604, objArrM12624);
        objArrM12624[i] = obj;
        this.f20089 = objArr;
        this.f20090 = objArrM12624;
        this.f20088 = size() + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object[] m12623(Object[] objArr, int i, int i2, Object obj, C7413 c7413) {
        Object obj2;
        int iM8306 = AbstractC3933.m8306(i2, i);
        if (i == 0) {
            c7413.f20099 = objArr[31];
            Object[] objArrM12624 = m12624(objArr);
            AbstractC4347.m8835(iM8306 + 1, iM8306, objArr, 31, objArrM12624);
            objArrM12624[iM8306] = obj;
            return objArrM12624;
        }
        Object[] objArrM126242 = m12624(objArr);
        int i3 = i - 5;
        Object obj3 = objArrM126242[iM8306];
        obj3.getClass();
        objArrM126242[iM8306] = m12623((Object[]) obj3, i3, i2, obj, c7413);
        while (true) {
            iM8306++;
            if (iM8306 >= 32 || (obj2 = objArrM126242[iM8306]) == null) {
                break;
            }
            objArrM126242[iM8306] = m12623((Object[]) obj2, i3, 0, c7413.f20099, c7413);
        }
        return objArrM126242;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Object[] m12624(Object[] objArr) {
        if (objArr == null) {
            return m12620();
        }
        if (m12625(objArr)) {
            return objArr;
        }
        Object[] objArrM12620 = m12620();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC4347.m8840(0, length, objArr, 6, objArrM12620);
        return objArrM12620;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m12625(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f20086;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC7416 m12626(int i) {
        Object[] objArr = this.f20089;
        if (objArr == null) {
            C5925.m11311("Invalid root");
            return null;
        }
        int iM12607 = m12607() >> 5;
        C8667.m14372(i, iM12607);
        int i2 = this.f20087;
        return i2 == 0 ? new C7414(objArr, i) : new C7420(objArr, i, iM12607, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM12604 = m12604();
        if (iM12604 < 32) {
            Object[] objArrM12624 = m12624(this.f20090);
            objArrM12624[iM12604] = obj;
            this.f20090 = objArrM12624;
            this.f20088 = size() + 1;
        } else {
            m12616(this.f20089, this.f20090, m12621(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM12604 = m12604();
        Iterator it = collection.iterator();
        if (32 - iM12604 >= collection.size()) {
            Object[] objArrM12624 = m12624(this.f20090);
            m12598(objArrM12624, iM12604, it);
            this.f20090 = objArrM12624;
            this.f20088 = collection.size() + size();
            return true;
        }
        int size = ((collection.size() + iM12604) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM126242 = m12624(this.f20090);
        m12598(objArrM126242, iM12604, it);
        objArr[0] = objArrM126242;
        for (int i = 1; i < size; i++) {
            Object[] objArrM12620 = m12620();
            m12598(objArrM12620, 0, it);
            objArr[i] = objArrM12620;
        }
        this.f20089 = m12615(this.f20089, m12607(), objArr);
        Object[] objArrM126202 = m12620();
        m12598(objArrM126202, 0, it);
        this.f20090 = objArrM126202;
        this.f20088 = collection.size() + size();
        return true;
    }
}
