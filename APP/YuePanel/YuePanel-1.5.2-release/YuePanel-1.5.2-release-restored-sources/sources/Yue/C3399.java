package Yue;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3399<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final boolean f5474 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String f5475 = "ArraySet";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int[] f5476 = new int[0];

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final Object[] f5477 = new Object[0];

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f5478 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f5479 = 10;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    @InterfaceC6490
    public static Object[] f5480;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static int f5481;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    @InterfaceC6490
    public static Object[] f5482;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static int f5483;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int[] f5484;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Object[] f5485;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f5486;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public AbstractC5934<E, E> f5487;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۨۦ$ۥ */
    public class C0130 extends AbstractC5934<E, E> {
        public C0130() {
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ */
        public void mo480() {
            C3399.this.clear();
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟ */
        public Object mo481(int i, int i2) {
            return C3399.this.f5485[i];
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟ */
        public Map<E, E> mo7003() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public int mo7004() {
            return C3399.this.f5486;
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public int mo7005(Object obj) {
            return C3399.this.indexOf(obj);
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public int mo7006(Object obj) {
            return C3399.this.indexOf(obj);
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo7007(E e, E e2) {
            C3399.this.add(e);
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo7008(int i) {
            C3399.this.m7050(i);
        }

        @Override // Yue.AbstractC5934
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public E mo7009(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3399() {
        this(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m7044(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C3399.class) {
                try {
                    if (f5483 < 10) {
                        objArr[0] = f5482;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f5482 = objArr;
                        f5483++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C3399.class) {
                try {
                    if (f5481 < 10) {
                        objArr[0] = f5480;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f5480 = objArr;
                        f5481++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@InterfaceC6490 E e) {
        int i;
        int iM7047;
        if (e == null) {
            iM7047 = m7048();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iM7047 = m7047(e, iHashCode);
        }
        if (iM7047 >= 0) {
            return false;
        }
        int i2 = ~iM7047;
        int i3 = this.f5486;
        int[] iArr = this.f5484;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f5485;
            m487(i4);
            int[] iArr2 = this.f5484;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f5485, 0, objArr.length);
            }
            m7044(iArr, objArr, this.f5486);
        }
        int i5 = this.f5486;
        if (i2 < i5) {
            int[] iArr3 = this.f5484;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f5485;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f5486 - i2);
        }
        this.f5484[i2] = i;
        this.f5485[i2] = e;
        this.f5486++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@InterfaceC6391 Collection<? extends E> collection) {
        m7045(this.f5486 + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f5486;
        if (i != 0) {
            m7044(this.f5484, this.f5485, i);
            this.f5484 = f5476;
            this.f5485 = f5477;
            this.f5486 = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@InterfaceC6490 Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@InterfaceC6391 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f5486; i++) {
                try {
                    if (!set.contains(m7051(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f5484;
        int i = this.f5486;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(@InterfaceC6490 Object obj) {
        return obj == null ? m7048() : m7047(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f5486 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m7046().m18554().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@InterfaceC6490 Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m7050(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@InterfaceC6391 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@InterfaceC6391 Collection<?> collection) {
        boolean z = false;
        for (int i = this.f5486 - 1; i >= 0; i--) {
            if (!collection.contains(this.f5485[i])) {
                m7050(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f5486;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    @InterfaceC6391
    public Object[] toArray() {
        int i = this.f5486;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f5485, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return C6193.f15213;
        }
        StringBuilder sb = new StringBuilder(this.f5486 * 14);
        sb.append(C6193.f1884);
        for (int i = 0; i < this.f5486; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eM7051 = m7051(i);
            if (eM7051 != this) {
                sb.append(eM7051);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(C6193.f1885);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public void m486(@InterfaceC6391 C3399<? extends E> c3399) {
        int i = c3399.f5486;
        m7045(this.f5486 + i);
        if (this.f5486 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(c3399.m7051(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c3399.f5484, 0, this.f5484, 0, i);
            System.arraycopy(c3399.f5485, 0, this.f5485, 0, i);
            this.f5486 = i;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m487(int i) {
        if (i == 8) {
            synchronized (C3399.class) {
                try {
                    Object[] objArr = f5482;
                    if (objArr != null) {
                        this.f5485 = objArr;
                        f5482 = (Object[]) objArr[0];
                        this.f5484 = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5483--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C3399.class) {
                try {
                    Object[] objArr2 = f5480;
                    if (objArr2 != null) {
                        this.f5485 = objArr2;
                        f5480 = (Object[]) objArr2[0];
                        this.f5484 = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5481--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f5484 = new int[i];
        this.f5485 = new Object[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m7045(int i) {
        int[] iArr = this.f5484;
        if (iArr.length < i) {
            Object[] objArr = this.f5485;
            m487(i);
            int i2 = this.f5486;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f5484, 0, i2);
                System.arraycopy(objArr, 0, this.f5485, 0, this.f5486);
            }
            m7044(iArr, objArr, this.f5486);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final AbstractC5934<E, E> m7046() {
        if (this.f5487 == null) {
            this.f5487 = new C0130();
        }
        return this.f5487;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m7047(Object obj, int i) {
        int i2 = this.f5486;
        if (i2 == 0) {
            return -1;
        }
        int iM1100 = C4146.m1100(this.f5484, i2, i);
        if (iM1100 < 0 || obj.equals(this.f5485[iM1100])) {
            return iM1100;
        }
        int i3 = iM1100 + 1;
        while (i3 < i2 && this.f5484[i3] == i) {
            if (obj.equals(this.f5485[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM1100 - 1; i4 >= 0 && this.f5484[i4] == i; i4--) {
            if (obj.equals(this.f5485[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m7048() {
        int i = this.f5486;
        if (i == 0) {
            return -1;
        }
        int iM1100 = C4146.m1100(this.f5484, i, 0);
        if (iM1100 < 0 || this.f5485[iM1100] == null) {
            return iM1100;
        }
        int i2 = iM1100 + 1;
        while (i2 < i && this.f5484[i2] == 0) {
            if (this.f5485[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM1100 - 1; i3 >= 0 && this.f5484[i3] == 0; i3--) {
            if (this.f5485[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m7049(@InterfaceC6391 C3399<? extends E> c3399) {
        int i = c3399.f5486;
        int i2 = this.f5486;
        for (int i3 = 0; i3 < i; i3++) {
            remove(c3399.m7051(i3));
        }
        return i2 != this.f5486;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public E m7050(int i) {
        Object[] objArr = this.f5485;
        E e = (E) objArr[i];
        int i2 = this.f5486;
        if (i2 <= 1) {
            m7044(this.f5484, objArr, i2);
            this.f5484 = f5476;
            this.f5485 = f5477;
            this.f5486 = 0;
        } else {
            int[] iArr = this.f5484;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.f5486 = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.f5485;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f5486 - i);
                }
                this.f5485[this.f5486] = null;
            } else {
                m487(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.f5486--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f5484, 0, i);
                    System.arraycopy(objArr, 0, this.f5485, 0, i);
                }
                int i5 = this.f5486;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.f5484, i, i5 - i);
                    System.arraycopy(objArr, i6, this.f5485, i, this.f5486 - i);
                }
            }
        }
        return e;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public E m7051(int i) {
        return (E) this.f5485[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3399(int i) {
        if (i == 0) {
            this.f5484 = f5476;
            this.f5485 = f5477;
        } else {
            m487(i);
        }
        this.f5486 = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @InterfaceC6391
    public <T> T[] toArray(@InterfaceC6391 T[] tArr) {
        if (tArr.length < this.f5486) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f5486));
        }
        System.arraycopy(this.f5485, 0, tArr, 0, this.f5486);
        int length = tArr.length;
        int i = this.f5486;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۡۨۦ<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3399(@InterfaceC6490 C3399<E> c3399) {
        this();
        if (c3399 != 0) {
            m486(c3399);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Collection<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3399(@InterfaceC6490 Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }
}
