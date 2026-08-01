package p140;

import androidx.compose.runtime.AbstractC2227;
import androidx.compose.runtime.snapshots.C2119;
import androidx.core.view.C3101;
import io.ktor.client.plugins.AbstractC4765;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractC5179;
import kotlin.collections.AbstractC5180;
import p068.InterfaceC7387;
import p070.InterfaceC7395;
import p131.C8165;
import p332.C9496;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8240 extends AbstractC5180 implements Collection, InterfaceC7395 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C8165 f20431 = new C8165();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f20432;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f20433;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object[] f20434;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Object[] f20435;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f20436;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object[] f20437;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC8244 f20438;

    public C8240(AbstractC8244 abstractC8244, Object[] objArr, Object[] objArr2, int i) {
        this.f20438 = abstractC8244;
        this.f20436 = objArr;
        this.f20437 = objArr2;
        this.f20432 = i;
        this.f20434 = objArr;
        this.f20435 = objArr2;
        this.f20433 = abstractC8244.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13157(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        C9496.m14931(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM13166 = m13166();
        if (i >= iM13166) {
            m13181(obj, i - iM13166, this.f20434);
            return;
        }
        C8242 c8242 = new C8242(null);
        Object[] objArr = this.f20434;
        objArr.getClass();
        m13181(c8242.f20444, 0, m13182(objArr, this.f20432, i, obj, c8242));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM13179;
        C9496.m14931(i, size());
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
            m13166();
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f20435;
            Object[] objArrM13183 = m13183(objArr);
            AbstractC5179.m9394(size2 + 1, i3, objArr, m13163(), objArrM13183);
            m13157(objArrM13183, i3, collection.iterator());
            this.f20435 = objArrM13183;
            this.f20433 = collection.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM13163 = m13163();
        int size3 = collection.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m13166()) {
            objArrM13179 = m13179();
            collection2 = collection;
            m13164(collection2, i, this.f20435, iM13163, objArr2, size, objArrM13179);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.f20435;
            if (size3 > iM13163) {
                int i4 = size3 - iM13163;
                Object[] objArrM13176 = m13176(i4, objArr3);
                m13167(collection2, i, i4, objArr2, size, objArrM13176);
                objArr2 = objArr2;
                objArrM13179 = objArrM13176;
            } else {
                objArrM13179 = m13179();
                int i5 = iM13163 - size3;
                AbstractC5179.m9394(0, i5, objArr3, iM13163, objArrM13179);
                int i6 = 32 - i5;
                Object[] objArrM131762 = m13176(i6, this.f20435);
                int i7 = size - 1;
                objArr2[i7] = objArrM131762;
                m13167(collection2, i, i6, objArr2, i7, objArrM131762);
                collection2 = collection2;
            }
        }
        this.f20434 = m13174(this.f20434, i2, objArr2);
        this.f20435 = objArrM13179;
        this.f20433 = collection2.size() + size();
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        C9496.m14932(i, size());
        if (m13166() <= i) {
            objArr = this.f20435;
        } else {
            Object[] objArr2 = this.f20434;
            objArr2.getClass();
            for (int i2 = this.f20432; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[AbstractC4765.m8865(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // kotlin.collections.AbstractC5180
    /* JADX INFO: renamed from: getSize */
    public final int getLength() {
        return this.f20433;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C9496.m14931(i, size());
        return new C8246(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m13160(new C2119(collection, 2));
    }

    @Override // kotlin.collections.AbstractC5180
    public final Object removeAt(int i) {
        C9496.m14932(i, size());
        ((AbstractList) this).modCount++;
        int iM13166 = m13166();
        if (i >= iM13166) {
            return m13158(this.f20434, iM13166, this.f20432, i - iM13166);
        }
        C8242 c8242 = new C8242(this.f20435[0]);
        Object[] objArr = this.f20434;
        objArr.getClass();
        m13158(m13159(objArr, this.f20432, i, c8242), iM13166, this.f20432, 0);
        return c8242.f20444;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C9496.m14932(i, size());
        if (m13166() > i) {
            C8242 c8242 = new C8242(null);
            Object[] objArr = this.f20434;
            objArr.getClass();
            this.f20434 = m13165(objArr, this.f20432, i, obj, c8242);
            return c8242.f20444;
        }
        Object[] objArrM13183 = m13183(this.f20435);
        if (objArrM13183 != this.f20435) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM13183[i2];
        objArrM13183[i2] = obj;
        this.f20435 = objArrM13183;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m13158(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        Object[] objArr2 = this.f20435;
        if (size == 1) {
            Object obj = objArr2[0];
            m13171(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM13183 = m13183(objArr2);
        AbstractC5179.m9394(i3, i3 + 1, objArr2, size, objArrM13183);
        objArrM13183[size - 1] = null;
        this.f20434 = objArr;
        this.f20435 = objArrM13183;
        this.f20433 = (i + size) - 1;
        this.f20432 = i2;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Object[] m13159(Object[] objArr, int i, int i2, C8242 c8242) {
        int iM8865 = AbstractC4765.m8865(i2, i);
        if (i == 0) {
            Object obj = objArr[iM8865];
            Object[] objArrM13183 = m13183(objArr);
            AbstractC5179.m9394(iM8865, iM8865 + 1, objArr, 32, objArrM13183);
            objArrM13183[31] = c8242.f20444;
            c8242.f20444 = obj;
            return objArrM13183;
        }
        int iM88652 = objArr[31] == null ? AbstractC4765.m8865(m13166() - 1, i) : 31;
        Object[] objArrM131832 = m13183(objArr);
        int i3 = i - 5;
        int i4 = iM8865 + 1;
        if (i4 <= iM88652) {
            while (true) {
                Object obj2 = objArrM131832[iM88652];
                obj2.getClass();
                objArrM131832[iM88652] = m13159((Object[]) obj2, i3, 0, c8242);
                if (iM88652 == i4) {
                    break;
                }
                iM88652--;
            }
        }
        Object obj3 = objArrM131832[iM8865];
        obj3.getClass();
        objArrM131832[iM8865] = m13159((Object[]) obj3, i3, i2, c8242);
        return objArrM131832;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean m13160(InterfaceC7387 interfaceC7387) {
        int i;
        InterfaceC7387 interfaceC73872 = interfaceC7387;
        int iM13163 = m13163();
        Object[] objArrM13177 = null;
        C8242 c8242 = new C8242(null);
        boolean z = false;
        if (this.f20434 != null) {
            AbstractC8245 abstractC8245M13185 = m13185(0);
            int iM13162 = 32;
            while (iM13162 == 32 && abstractC8245M13185.hasNext()) {
                iM13162 = m13162(interfaceC73872, (Object[]) abstractC8245M13185.next(), 32, c8242);
            }
            if (iM13162 == 32) {
                int iM13161 = m13161(interfaceC73872, iM13163, c8242);
                if (iM13161 == 0) {
                    m13171(this.f20434, size(), this.f20432);
                }
                if (iM13161 != iM13163) {
                }
            } else {
                int i2 = (abstractC8245M13185.f20448 - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM13173 = iM13162;
                while (abstractC8245M13185.hasNext()) {
                    iM13173 = m13173(interfaceC73872, (Object[]) abstractC8245M13185.next(), 32, iM13173, c8242, arrayList2, arrayList);
                    interfaceC73872 = interfaceC7387;
                }
                int iM131732 = m13173(interfaceC7387, this.f20435, iM13163, iM13173, c8242, arrayList2, arrayList);
                Object obj = c8242.f20444;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM131732, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrM13170 = this.f20434;
                if (zIsEmpty) {
                    objArrM13170.getClass();
                } else {
                    objArrM13170 = m13170(objArrM13170, i2, this.f20432, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC2227.m3098("invalid size");
                }
                if (size == 0) {
                    this.f20432 = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f20432;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f20432 = i - 5;
                        Object[] objArr2 = objArrM13170[0];
                        objArr2.getClass();
                        objArrM13170 = objArr2;
                    }
                    objArrM13177 = m13177(objArrM13170, i3, i);
                }
                this.f20434 = objArrM13177;
                this.f20435 = objArr;
                this.f20433 = size + iM131732;
            }
            z = true;
        } else if (m13161(interfaceC73872, iM13163, c8242) != iM13163) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int m13161(InterfaceC7387 interfaceC7387, int i, C8242 c8242) {
        int iM13162 = m13162(interfaceC7387, this.f20435, i, c8242);
        Object obj = c8242.f20444;
        if (iM13162 == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM13162, i, (Object) null);
        this.f20435 = objArr;
        this.f20433 = size() - (i - iM13162);
        return iM13162;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int m13162(InterfaceC7387 interfaceC7387, Object[] objArr, int i, C8242 c8242) {
        Object[] objArrM13183 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) interfaceC7387.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM13183 = m13183(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM13183[i2] = obj;
                i2++;
            }
        }
        c8242.f20444 = objArrM13183;
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final int m13163() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & (-32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m13164(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM13179;
        if (i3 < 1) {
            AbstractC2227.m3098("requires at least one nullBuffer");
        }
        Object[] objArrM13183 = m13183(objArr);
        objArr2[0] = objArrM13183;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC5179.m9394(size + 1, i4, objArrM13183, i2, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM13179 = objArrM13183;
            } else {
                objArrM13179 = m13179();
                i3--;
                objArr2[i3] = objArrM13179;
            }
            int i7 = i2 - i6;
            AbstractC5179.m9394(0, i7, objArrM13183, i2, objArr3);
            AbstractC5179.m9394(size + 1, i4, objArrM13183, i7, objArrM13179);
            objArr3 = objArrM13179;
        }
        Iterator it = collection.iterator();
        m13157(objArrM13183, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM131792 = m13179();
            m13157(objArrM131792, 0, it);
            objArr2[i8] = objArrM131792;
        }
        m13157(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final Object[] m13165(Object[] objArr, int i, int i2, Object obj, C8242 c8242) {
        int iM8865 = AbstractC4765.m8865(i2, i);
        Object[] objArrM13183 = m13183(objArr);
        if (i != 0) {
            Object obj2 = objArrM13183[iM8865];
            obj2.getClass();
            objArrM13183[iM8865] = m13165((Object[]) obj2, i - 5, i2, obj, c8242);
            return objArrM13183;
        }
        if (objArrM13183 != objArr) {
            ((AbstractList) this).modCount++;
        }
        c8242.f20444 = objArrM13183[iM8865];
        objArrM13183[iM8865] = obj;
        return objArrM13183;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int m13166() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13167(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f20434 == null) {
            C6755.m11870("root is null");
            return;
        }
        int i4 = i >> 5;
        AbstractC8245 abstractC8245M13185 = m13185(m13166() >> 5);
        int i5 = i3;
        Object[] objArrM13176 = objArr2;
        while (abstractC8245M13185.f20448 - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC8245M13185.previous();
            AbstractC5179.m9394(0, 32 - i2, objArr3, 32, objArrM13176);
            objArrM13176 = m13176(i2, objArr3);
            i5--;
            objArr[i5] = objArrM13176;
        }
        Object[] objArr4 = (Object[]) abstractC8245M13185.previous();
        int iM13166 = i3 - (((m13166() >> 5) - 1) - i4);
        if (iM13166 < i3) {
            objArr2 = objArr[iM13166];
            objArr2.getClass();
        }
        m13164(collection, i, objArr4, 32, objArr, iM13166, objArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m13168() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC8244 m13169() {
        AbstractC8244 c8248;
        Object[] objArr = this.f20434;
        if (objArr == this.f20436 && this.f20435 == this.f20437) {
            c8248 = this.f20438;
        } else {
            this.f20431 = new C8165();
            this.f20436 = objArr;
            Object[] objArr2 = this.f20435;
            this.f20437 = objArr2;
            c8248 = objArr == null ? objArr2.length == 0 ? C8248.f20455 : new C8248(Arrays.copyOf(objArr2, size())) : new C8241(objArr, objArr2, size(), this.f20432);
        }
        this.f20438 = c8248;
        return c8248;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object[] m13170(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            AbstractC2227.m3098("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            AbstractC2227.m3098("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM13183 = m13183(objArr);
        int iM8865 = AbstractC4765.m8865(i, i2);
        int i3 = i2 - 5;
        objArrM13183[iM8865] = m13170((Object[]) objArrM13183[iM8865], i, i3, it);
        while (true) {
            iM8865++;
            if (iM8865 >= 32 || !it.hasNext()) {
                break;
            }
            objArrM13183[iM8865] = m13170((Object[]) objArrM13183[iM8865], 0, i3, it);
        }
        return objArrM13183;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13171(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f20434 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f20435 = objArr;
            this.f20433 = i;
            this.f20432 = i2;
            return;
        }
        C8242 c8242 = new C8242(null);
        objArr.getClass();
        Object[] objArrM13178 = m13178(objArr, i2, i, c8242);
        objArrM13178.getClass();
        Object obj = c8242.f20444;
        obj.getClass();
        this.f20435 = (Object[]) obj;
        this.f20433 = i;
        if (objArrM13178[1] == null) {
            this.f20434 = (Object[]) objArrM13178[0];
            this.f20432 = i2 - 5;
        } else {
            this.f20434 = objArrM13178;
            this.f20432 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Object[] m13172(int i, Object[] objArr, Object[] objArr2) {
        int iM8865 = AbstractC4765.m8865(size() - 1, i);
        Object[] objArrM13183 = m13183(objArr);
        if (i == 5) {
            objArrM13183[iM8865] = objArr2;
            return objArrM13183;
        }
        objArrM13183[iM8865] = m13172(i - 5, (Object[]) objArrM13183[iM8865], objArr2);
        return objArrM13183;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int m13173(InterfaceC7387 interfaceC7387, Object[] objArr, int i, int i2, C8242 c8242, ArrayList arrayList, ArrayList arrayList2) {
        if (m13184(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c8242.f20444;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM13179 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) interfaceC7387.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM13179 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m13179();
                    i2 = 0;
                }
                objArrM13179[i2] = obj2;
                i2++;
            }
        }
        c8242.f20444 = objArrM13179;
        if (objArr2 != objArrM13179) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object[] m13174(Object[] objArr, int i, Object[][] objArr2) {
        C3101 c3101 = new C3101(objArr2);
        int i2 = i >> 5;
        int i3 = this.f20432;
        Object[] objArrM13170 = i2 < (1 << i3) ? m13170(objArr, i, i3, c3101) : m13183(objArr);
        while (c3101.hasNext()) {
            this.f20432 += 5;
            objArrM13170 = m13180(objArrM13170);
            int i4 = this.f20432;
            m13170(objArrM13170, 1 << i4, i4, c3101);
        }
        return objArrM13170;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m13175(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f20432;
        if (size > (1 << i)) {
            this.f20434 = m13172(this.f20432 + 5, m13180(objArr), objArr2);
            this.f20435 = objArr3;
            this.f20432 += 5;
            this.f20433 = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f20434 = objArr2;
            this.f20435 = objArr3;
            this.f20433 = size() + 1;
        } else {
            this.f20434 = m13172(i, objArr, objArr2);
            this.f20435 = objArr3;
            this.f20433 = size() + 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Object[] m13176(int i, Object[] objArr) {
        if (m13184(objArr)) {
            AbstractC5179.m9394(i, 0, objArr, 32 - i, objArr);
            return objArr;
        }
        Object[] objArrM13179 = m13179();
        AbstractC5179.m9394(i, 0, objArr, 32 - i, objArrM13179);
        return objArrM13179;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object[] m13177(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            AbstractC2227.m3098("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM8865 = AbstractC4765.m8865(i, i2);
        Object obj = objArr[iM8865];
        obj.getClass();
        Object objM13177 = m13177((Object[]) obj, i, i2 - 5);
        if (iM8865 < 31) {
            int i3 = iM8865 + 1;
            if (objArr[i3] != null) {
                if (m13184(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM13179 = m13179();
                AbstractC5179.m9394(0, 0, objArr, i3, objArrM13179);
                objArr = objArrM13179;
            }
        }
        if (objM13177 == objArr[iM8865]) {
            return objArr;
        }
        Object[] objArrM13183 = m13183(objArr);
        objArrM13183[iM8865] = objM13177;
        return objArrM13183;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object[] m13178(Object[] objArr, int i, int i2, C8242 c8242) {
        Object[] objArrM13178;
        int iM8865 = AbstractC4765.m8865(i2 - 1, i);
        if (i == 5) {
            c8242.f20444 = objArr[iM8865];
            objArrM13178 = null;
        } else {
            Object obj = objArr[iM8865];
            obj.getClass();
            objArrM13178 = m13178((Object[]) obj, i - 5, i2, c8242);
        }
        if (objArrM13178 == null && iM8865 == 0) {
            return null;
        }
        Object[] objArrM13183 = m13183(objArr);
        objArrM13183[iM8865] = objArrM13178;
        return objArrM13183;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Object[] m13179() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f20431;
        return objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] m13180(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f20431;
        return objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13181(Object obj, int i, Object[] objArr) {
        int iM13163 = m13163();
        Object[] objArrM13183 = m13183(this.f20435);
        Object[] objArr2 = this.f20435;
        if (iM13163 >= 32) {
            Object obj2 = objArr2[31];
            AbstractC5179.m9394(i + 1, i, objArr2, 31, objArrM13183);
            objArrM13183[i] = obj;
            m13175(objArr, objArrM13183, m13180(obj2));
            return;
        }
        AbstractC5179.m9394(i + 1, i, objArr2, iM13163, objArrM13183);
        objArrM13183[i] = obj;
        this.f20434 = objArr;
        this.f20435 = objArrM13183;
        this.f20433 = size() + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object[] m13182(Object[] objArr, int i, int i2, Object obj, C8242 c8242) {
        Object obj2;
        int iM8865 = AbstractC4765.m8865(i2, i);
        if (i == 0) {
            c8242.f20444 = objArr[31];
            Object[] objArrM13183 = m13183(objArr);
            AbstractC5179.m9394(iM8865 + 1, iM8865, objArr, 31, objArrM13183);
            objArrM13183[iM8865] = obj;
            return objArrM13183;
        }
        Object[] objArrM131832 = m13183(objArr);
        int i3 = i - 5;
        Object obj3 = objArrM131832[iM8865];
        obj3.getClass();
        objArrM131832[iM8865] = m13182((Object[]) obj3, i3, i2, obj, c8242);
        while (true) {
            iM8865++;
            if (iM8865 >= 32 || (obj2 = objArrM131832[iM8865]) == null) {
                break;
            }
            objArrM131832[iM8865] = m13182((Object[]) obj2, i3, 0, c8242.f20444, c8242);
        }
        return objArrM131832;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Object[] m13183(Object[] objArr) {
        if (objArr == null) {
            return m13179();
        }
        if (m13184(objArr)) {
            return objArr;
        }
        Object[] objArrM13179 = m13179();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC5179.m9399(0, length, objArr, 6, objArrM13179);
        return objArrM13179;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m13184(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f20431;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC8245 m13185(int i) {
        Object[] objArr = this.f20434;
        if (objArr == null) {
            C6755.m11870("Invalid root");
            return null;
        }
        int iM13166 = m13166() >> 5;
        C9496.m14931(i, iM13166);
        int i2 = this.f20432;
        return i2 == 0 ? new C8243(objArr, i) : new C8249(objArr, i, iM13166, i2 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM13163 = m13163();
        if (iM13163 < 32) {
            Object[] objArrM13183 = m13183(this.f20435);
            objArrM13183[iM13163] = obj;
            this.f20435 = objArrM13183;
            this.f20433 = size() + 1;
        } else {
            m13175(this.f20434, this.f20435, m13180(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM13163 = m13163();
        Iterator it = collection.iterator();
        if (32 - iM13163 >= collection.size()) {
            Object[] objArrM13183 = m13183(this.f20435);
            m13157(objArrM13183, iM13163, it);
            this.f20435 = objArrM13183;
            this.f20433 = collection.size() + size();
            return true;
        }
        int size = ((collection.size() + iM13163) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM131832 = m13183(this.f20435);
        m13157(objArrM131832, iM13163, it);
        objArr[0] = objArrM131832;
        for (int i = 1; i < size; i++) {
            Object[] objArrM13179 = m13179();
            m13157(objArrM13179, 0, it);
            objArr[i] = objArrM13179;
        }
        this.f20434 = m13174(this.f20434, m13166(), objArr);
        Object[] objArrM131792 = m13179();
        m13157(objArrM131792, 0, it);
        this.f20435 = objArrM131792;
        this.f20433 = collection.size() + size();
        return true;
    }
}
