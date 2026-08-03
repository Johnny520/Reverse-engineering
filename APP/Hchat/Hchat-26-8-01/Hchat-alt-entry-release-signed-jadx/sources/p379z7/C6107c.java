package p379z7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Predicate;
import p063e9.C0830a;
import p136j8.C2095f;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2336f;
import p174m.C2571a;
import p209o7.C3068b;

/* JADX INFO: renamed from: z7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C6107c implements List, Set {

    /* JADX INFO: renamed from: n */
    public static final Object[] f24640n = new Object[0];

    /* JADX INFO: renamed from: o */
    public static final C6106b f24641o = new C6106b(0);

    /* JADX INFO: renamed from: g */
    public Object[] f24642g;

    /* JADX INFO: renamed from: h */
    public C0830a f24643h;

    /* JADX INFO: renamed from: i */
    public int f24644i;

    /* JADX INFO: renamed from: j */
    public int f24645j;

    /* JADX INFO: renamed from: k */
    public int f24646k;

    /* JADX INFO: renamed from: l */
    public boolean f24647l;

    /* JADX INFO: renamed from: m */
    public C2571a f24648m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6107c(int i9) {
        this.f24642g = i9 == 0 ? f24640n : new Object[i9];
        this.f24644i = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m10864a(int i9, Object[] objArr, Object[] objArr2) {
        for (int i10 = 0; i10 < i9; i10++) {
            objArr2[i10] = objArr[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Object[] m10865e(int i9) {
        return i9 == 0 ? f24640n : new Object[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // java.util.List, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean add(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z9 = this.f24647l;
        this.f24647l = true;
        int length = this.f24642g.length;
        int i9 = this.f24644i;
        if (length - i9 <= 0) {
            if (i9 != 0) {
                int i10 = this.f24645j;
                if (i10 < 8192) {
                    if (i10 == 0) {
                        i10 = 1;
                    }
                    int i11 = i10 << 1;
                    if (i11 > 32) {
                        i11 = i10 << 2;
                    }
                    if (i11 > 32 && i11 < 256) {
                        i11 <<= 1;
                    }
                    i10 = i11 > 8192 ? 8192 : i11;
                    this.f24645j = i10;
                    if (i9 < 4) {
                        i10 = 1;
                    }
                }
                mo10861d(i10);
            }
        }
        int i12 = this.f24644i;
        this.f24642g[i12] = obj;
        this.f24644i = i12 + 1;
        this.f24647l = z9;
        this.f24646k = 0;
        if (this.f24648m != null) {
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        if (collection == null) {
            return false;
        }
        if (size() == 0) {
            Object[] array = collection.toArray();
            int size = collection.size();
            Object[] objArrM10865e = m10865e(size);
            m10864a(size, array, objArrM10865e);
            int length = objArrM10865e.length;
            this.f24642g = objArrM10865e;
            this.f24644i = length;
            this.f24646k = 0;
            return true;
        }
        int size2 = collection.size();
        this.f24647l = true;
        boolean z9 = false;
        for (Object obj : collection) {
            if (this.f24642g.length - this.f24644i == 0) {
                mo10861d(size2);
            }
            if (add(obj)) {
                z9 = true;
            }
        }
        this.f24647l = false;
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Iterator m10866b() {
        int size = size();
        if (!isEmpty()) {
            Object[] objArr = (Object[]) this.f24642g.clone();
            if (objArr.length != 0) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        return new C6108d(objArr, size, null);
                    }
                }
            }
        }
        return C6112h.f24664g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m10867c(Object obj) {
        return m10868f(obj, true, 0) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public void clear() {
        int i9 = this.f24644i;
        this.f24644i = 0;
        Object[] objArr = this.f24642g;
        this.f24642g = f24640n;
        this.f24645j = 0;
        this.f24647l = false;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        this.f24646k = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return m10867c(obj) || m10868f(obj, false, 0) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return !collection.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void mo10861d(int i9) {
        if (i9 <= 0) {
            return;
        }
        int length = this.f24642g.length;
        int i10 = this.f24644i;
        int i11 = i9 - (length - i10);
        if (i11 <= 0) {
            return;
        }
        Object[] objArrM10865e = m10865e(i11 + i10);
        Object[] objArr = this.f24642g;
        if (objArr.length == 0 || i10 == 0) {
            this.f24642g = objArrM10865e;
        } else {
            m10864a(i10, objArr, objArrM10865e);
            this.f24642g = objArrM10865e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6107c c6107c = (C6107c) obj;
            int size = size();
            if (size == c6107c.size() && hashCode() == c6107c.hashCode()) {
                for (int i9 = 0; i9 < size; i9++) {
                    if (Objects.equals(this.f24642g[i9], c6107c.f24642g[i9])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m10868f(Object obj, boolean z9, int i9) {
        if (obj == null) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = this.f24644i;
        if (i10 == 0) {
            return -1;
        }
        Object[] objArr = this.f24642g;
        for (int i11 = i9; i11 < i10; i11++) {
            Object obj2 = objArr[i11];
            if (obj2 != null && obj == obj2) {
                return i11;
            }
        }
        if (z9) {
            return -1;
        }
        while (i9 < i10) {
            Object obj3 = objArr[i9];
            if (obj3 == null ? false : obj == obj3 ? true : obj.equals(obj3)) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m10869g(Object obj) {
        C2571a c2571a = this.f24648m;
        if (c2571a != null) {
            AbstractC2331a abstractC2331a = (AbstractC2331a) obj;
            C3068b c3068b = (C3068b) c2571a.f8339h;
            if (abstractC2331a == null || abstractC2331a.f7658h != c3068b) {
                return;
            }
            c3068b.mo1894W(abstractC2331a);
            abstractC2331a.m5546H(-1);
            abstractC2331a.m5548J(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        return this.f24642g[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void mo10862h(int i9, boolean z9) {
        int i10 = this.f24644i;
        if (i9 == i10) {
            return;
        }
        if (i9 < i10) {
            if (!z9) {
                this.f24644i = i9;
                this.f24646k = 0;
                return;
            }
            boolean z10 = this.f24647l;
            this.f24647l = true;
            int i11 = i9 - 1;
            Object[] objArr = this.f24642g;
            for (int i12 = i10 - 1; i12 > i11; i12--) {
                Object obj = objArr[i12];
                this.f24644i--;
                objArr[i12] = null;
                m10869g(obj);
            }
            this.f24647l = z10;
            this.f24646k = 0;
            return;
        }
        boolean z11 = this.f24647l;
        this.f24647l = true;
        int i13 = i9 - i10;
        mo10861d(i13);
        this.f24644i = i9;
        Object[] objArr2 = this.f24642g;
        C0830a c0830a = this.f24643h;
        if (c0830a != null) {
            int i14 = i13 + i10;
            while (i10 < i14) {
                C3068b c3068b = (C3068b) c0830a.f2507i;
                AbstractC2331a abstractC2331aMo1892n = ((InterfaceC2336f) c0830a.f2506h).mo1892n();
                if (abstractC2331aMo1892n != null) {
                    abstractC2331aMo1892n.m5546H(i10);
                    abstractC2331aMo1892n.m5548J(c3068b);
                }
                objArr2[i10] = abstractC2331aMo1892n;
                i10++;
            }
        }
        this.f24647l = z11;
        this.f24646k = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public int hashCode() {
        int i9 = this.f24646k;
        if (i9 != 0) {
            return i9;
        }
        int size = size();
        int i10 = 0;
        if (size != 0) {
            Object[] objArr = this.f24642g;
            int iHashCode = 1;
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = objArr[i11];
                iHashCode = (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
            }
            this.f24646k = iHashCode;
            i10 = iHashCode;
        }
        this.f24646k = i10;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m10870i(int i9, int i10) {
        if (i10 == 0 || i9 < 0) {
            return;
        }
        boolean z9 = this.f24647l;
        this.f24647l = true;
        Object[] objArr = this.f24642g;
        int i11 = this.f24644i;
        int i12 = i11 - i10;
        while (i9 < i12) {
            objArr[i9] = objArr[i9 + i10];
            i9++;
        }
        for (int i13 = i12; i13 < i11; i13++) {
            objArr[i13] = null;
        }
        this.f24644i = i12;
        this.f24647l = z9;
        this.f24646k = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        return m10868f(obj, false, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return size() == 0 ? C6112h.f24664g : new C6109e(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m10871j(int i9, int i10) {
        boolean z9 = this.f24647l;
        this.f24647l = true;
        mo10861d(i10);
        Object[] objArr = this.f24642g;
        int i11 = this.f24644i;
        for (int i12 = i11 - 1; i12 >= i9; i12--) {
            objArr[i12 + i10] = objArr[i12];
        }
        this.f24644i = i11 + i10;
        int i13 = i10 + i9;
        while (i9 < i13) {
            objArr[i9] = null;
            i9++;
        }
        this.f24647l = z9;
        this.f24646k = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m10872k(InterfaceC6124t interfaceC6124t) {
        int size;
        if (!this.f24647l && (size = size()) >= 2) {
            C6105a c6105a = new C6105a(this.f24642g, size, interfaceC6124t);
            c6105a.f7000a = false;
            c6105a.m5218u(0, size - 1);
            if (c6105a.f7000a) {
                this.f24646k = 0;
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: subList(II)Ljava/util/List; */
    @Override // java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C6107c subList(int i9, int i10) {
        int i11 = i9 + i10;
        int size = size();
        if (i11 > size) {
            i11 = size;
        }
        if (i9 == 0 && i11 == size) {
            return this;
        }
        Object[] objArrM10865e = m10865e(i10);
        Object[] objArr = this.f24642g;
        while (i9 < i11) {
            objArrM10865e[i9] = objArr[i9];
            i9++;
        }
        return new C6107c(objArrM10865e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i9 = -1;
        if (obj == null) {
            return -1;
        }
        Object[] objArr = this.f24642g;
        int i10 = this.f24644i;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj2 = objArr[i11];
            if (obj2 != null && obj.equals(obj2)) {
                i9 = i11;
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        if (size() - i9 > 0) {
            return new C6118n(i9, this);
        }
        C6118n c6118n = C6118n.f24677j;
        if (c6118n != null) {
            return c6118n;
        }
        C6118n c6118n2 = new C6118n(0, C6113i.f24665g);
        C6118n.f24677j = c6118n2;
        return c6118n2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void mo10863m() {
        if (!this.f24647l) {
            Object[] objArrM10865e = this.f24642g;
            int length = objArrM10865e.length;
            int i9 = this.f24644i;
            if (length - i9 != 0) {
                if (i9 < objArrM10865e.length) {
                    if (i9 == 0) {
                        objArrM10865e = m10865e(0);
                    } else {
                        Object[] objArrM10865e2 = m10865e(i9);
                        m10864a(i9, objArrM10865e, objArrM10865e2);
                        objArrM10865e = objArrM10865e2;
                    }
                }
                this.f24642g = objArrM10865e;
                this.f24645j = this.f24644i / 4;
                return;
            }
        }
        if (this.f24645j == 0) {
            this.f24645j = size() / 3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object obj2;
        int iM10868f = m10868f(obj, false, 0);
        if (iM10868f < 0) {
            obj2 = null;
        } else {
            Object obj3 = this.f24642g[iM10868f];
            remove(iM10868f);
            this.f24646k = 0;
            obj2 = obj3;
        }
        return obj2 != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        int i9;
        Object[] objArr = this.f24642g;
        if (objArr != null && (i9 = this.f24644i) != 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (obj == it.next()) {
                        objArr[i11] = null;
                        m10869g(obj);
                        i10++;
                        break;
                    }
                }
            }
            if (i10 != 0) {
                if (this.f24642g != objArr) {
                    throw new ConcurrentModificationException();
                }
                int i12 = this.f24644i - i10;
                this.f24644i = i12;
                if (i12 == 0) {
                    this.f24642g = f24640n;
                    return true;
                }
                Object[] objArrM10865e = m10865e(i12);
                int i13 = 0;
                for (int i14 = 0; i14 < i9; i14++) {
                    Object obj2 = objArr[i14];
                    if (obj2 != null) {
                        objArrM10865e[i13] = obj2;
                        i13++;
                    }
                }
                this.f24644i = i13;
                this.f24642g = objArrM10865e;
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        int i9;
        Object[] objArr = this.f24642g;
        if (objArr != null && (i9 = this.f24644i) != 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (predicate.test(obj)) {
                    objArr[i11] = null;
                    m10869g(obj);
                    i10++;
                }
            }
            if (i10 != 0) {
                if (this.f24642g != objArr) {
                    throw new ConcurrentModificationException();
                }
                int i12 = this.f24644i - i10;
                this.f24644i = i12;
                if (i12 == 0) {
                    this.f24642g = f24640n;
                    return true;
                }
                Object[] objArrM10865e = m10865e(i12);
                int i13 = 0;
                for (int i14 = 0; i14 < i9; i14++) {
                    Object obj2 = objArr[i14];
                    if (obj2 != null) {
                        objArrM10865e[i13] = obj2;
                        i13++;
                    }
                }
                this.f24644i = i13;
                this.f24642g = objArrM10865e;
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new RuntimeException("Method not implemented");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public Object set(int i9, Object obj) {
        if (obj == null || i9 < 0) {
            return null;
        }
        int i10 = i9 + 1;
        if (i10 > size()) {
            mo10862h(i10, false);
        }
        Object[] objArr = this.f24642g;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        if (obj != obj2) {
            this.f24646k = 0;
        }
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public int size() {
        return this.f24644i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public void sort(Comparator comparator) {
        int size;
        if (!this.f24647l && (size = size()) >= 2) {
            C2095f c2095f = new C2095f(this.f24642g, size, comparator);
            c2095f.f7000a = false;
            c2095f.m5218u(0, size - 1);
            if (c2095f.f7000a) {
                this.f24646k = 0;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Spliterator spliterator() {
        throw new IllegalArgumentException("Not implemented");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.util.Set
    public Object[] toArray() {
        Object[] objArrM10865e = this.f24642g;
        int size = size();
        if (size < objArrM10865e.length) {
            if (size == 0) {
                objArrM10865e = m10865e(0);
            } else {
                Object[] objArrM10865e2 = m10865e(size);
                m10864a(size, objArrM10865e, objArrM10865e2);
                objArrM10865e = objArrM10865e2;
            }
        }
        return objArrM10865e == this.f24642g ? (Object[]) objArrM10865e.clone() : objArrM10865e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (size() == 0) {
            return "EMPTY";
        }
        return size() + "{" + this.f24642g[0] + "}";
    }

    public C6107c(Object[] objArr) {
        objArr = objArr.length == 0 ? f24640n : objArr;
        this.f24642g = objArr;
        this.f24644i = objArr.length;
    }

    @Override // java.util.List
    public Object remove(int i9) {
        Object obj = this.f24642g[i9];
        m10870i(i9, 1);
        m10869g(obj);
        return obj;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        if (size() <= 0) {
            C6118n c6118n = C6118n.f24677j;
            if (c6118n != null) {
                return c6118n;
            }
            C6118n c6118n2 = new C6118n(0, C6113i.f24665g);
            C6118n.f24677j = c6118n2;
            return c6118n2;
        }
        return new C6118n(0, this);
    }

    @Override // java.util.List, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (size == 0) {
            return objArr;
        }
        Object[] objArr2 = this.f24642g;
        int length = objArr.length;
        if (length != 0 && length <= size) {
            m10864a(length, objArr2, objArr);
            return objArr;
        }
        return Arrays.copyOf(objArr2, size, objArr.getClass());
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        int size;
        if (collection == null || (size = collection.size()) == 0) {
            return false;
        }
        boolean z9 = this.f24647l;
        this.f24647l = true;
        m10871j(i9, size);
        Object[] objArr = this.f24642g;
        int i10 = i9;
        for (Object obj : collection) {
            if (obj != null && !m10867c(obj)) {
                objArr[i10] = obj;
                if (this.f24648m != null) {
                }
                i10++;
            }
        }
        int i11 = size - (i10 - i9);
        m10870i(i10, i11);
        this.f24647l = z9;
        return i11 < size;
    }

    @Override // java.util.List
    public void add(int i9, Object obj) {
        if (obj == null) {
            return;
        }
        boolean z9 = this.f24647l;
        this.f24647l = true;
        m10871j(i9, 1);
        this.f24642g[i9] = obj;
        if (this.f24648m != null) {
        }
        this.f24647l = z9;
        this.f24646k = 0;
    }
}
