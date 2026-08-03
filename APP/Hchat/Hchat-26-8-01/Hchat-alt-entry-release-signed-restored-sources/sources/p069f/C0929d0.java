package p069f;

import gg.AbstractC1415k;
import gg.AbstractC1416l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p000a.AbstractC0000a;
import p114hg.InterfaceC1713c;
import p131j0.AbstractC2047c;
import p131j0.C2046b;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0929d0 implements List, InterfaceC1713c {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2908g;

    /* JADX INFO: renamed from: h */
    public final Object f2909h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0929d0(Object obj, int i9) {
        this.f2908g = i9;
        this.f2909h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        switch (this.f2908g) {
            case 0:
                C0933f0 c0933f0 = (C0933f0) this.f2909h;
                if (i9 < 0 || i9 > (i10 = c0933f0.f2924b)) {
                    c0933f0.m2301p(i9);
                    throw null;
                }
                int i11 = i10 + 1;
                Object[] objArr = c0933f0.f2923a;
                if (objArr.length < i11) {
                    c0933f0.m2298m(i11, objArr);
                }
                Object[] objArr2 = c0933f0.f2923a;
                int i12 = c0933f0.f2924b;
                if (i9 != i12) {
                    AbstractC4165l.m8379n0(i9 + 1, i9, objArr2, i12, objArr2);
                }
                objArr2[i9] = obj;
                c0933f0.f2924b++;
                return;
            default:
                ((C2046b) this.f2909h).m5055a(i9, obj);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        switch (this.f2908g) {
            case 0:
                collection.getClass();
                C0933f0 c0933f0 = (C0933f0) this.f2909h;
                if (i9 < 0 || i9 > c0933f0.f2924b) {
                    c0933f0.m2301p(i9);
                    throw null;
                }
                int i10 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + c0933f0.f2924b;
                Object[] objArr = c0933f0.f2923a;
                if (objArr.length < size) {
                    c0933f0.m2298m(size, objArr);
                }
                Object[] objArr2 = c0933f0.f2923a;
                if (i9 != c0933f0.f2924b) {
                    AbstractC4165l.m8379n0(collection.size() + i9, i9, objArr2, c0933f0.f2924b, objArr2);
                }
                for (Object obj : collection) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    objArr2[i10 + i9] = obj;
                    i10 = i11;
                }
                c0933f0.f2924b = collection.size() + c0933f0.f2924b;
                return true;
            default:
                return ((C2046b) this.f2909h).m5059e(i9, collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f2908g) {
            case 0:
                ((C0933f0) this.f2909h).m2289d();
                break;
            default:
                ((C2046b) this.f2909h).m5061g();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2908g) {
            case 0:
                return ((C0933f0) this.f2909h).m2292g(obj) >= 0;
            default:
                return ((C2046b) this.f2909h).m5062h(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f2908g) {
            case 0:
                collection.getClass();
                C0933f0 c0933f0 = (C0933f0) this.f2909h;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (c0933f0.m2292g(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                C2046b c2046b = (C2046b) this.f2909h;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c2046b.m5062h(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        switch (this.f2908g) {
            case 0:
                AbstractC0953p0.m2347a(i9, this);
                return ((C0933f0) this.f2909h).m2291f(i9);
            default:
                AbstractC2047c.m5068a(i9, this);
                return ((C2046b) this.f2909h).f6891g[i9];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f2908g) {
            case 0:
                return ((C0933f0) this.f2909h).m2292g(obj);
            default:
                return ((C2046b) this.f2909h).m5063i(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f2908g) {
            case 0:
                return ((C0933f0) this.f2909h).m2293h();
            default:
                return ((C2046b) this.f2909h).f6893i == 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2908g) {
            case 0:
                return new C0927c0(this, 0, 0);
            default:
                return new C0927c0(this, 0, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i9;
        switch (this.f2908g) {
            case 0:
                C0933f0 c0933f0 = (C0933f0) this.f2909h;
                Object[] objArr = c0933f0.f2923a;
                int i10 = c0933f0.f2924b;
                if (obj == null) {
                    i9 = i10 - 1;
                    while (-1 < i9) {
                        if (objArr[i9] != null) {
                            i9--;
                        }
                    }
                    return -1;
                }
                i9 = i10 - 1;
                while (-1 < i9) {
                    if (!obj.equals(objArr[i9])) {
                        i9--;
                    }
                }
                return -1;
                return i9;
            default:
                C2046b c2046b = (C2046b) this.f2909h;
                Object[] objArr2 = c2046b.f6891g;
                for (int i11 = c2046b.f6893i - 1; i11 >= 0; i11--) {
                    if (AbstractC1416l.m3825a(obj, objArr2[i11])) {
                        return i11;
                    }
                }
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f2908g) {
            case 0:
                return new C0927c0(this, 0, 0);
            default:
                return new C0927c0(this, 0, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object remove(int i9) {
        switch (this.f2908g) {
            case 0:
                AbstractC0953p0.m2347a(i9, this);
                return ((C0933f0) this.f2909h).m2296k(i9);
            default:
                AbstractC2047c.m5068a(i9, this);
                return ((C2046b) this.f2909h).m5065k(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f2908g) {
            case 0:
                collection.getClass();
                C0933f0 c0933f0 = (C0933f0) this.f2909h;
                int i9 = c0933f0.f2924b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c0933f0.m2295j(it.next());
                }
                if (i9 != c0933f0.f2924b) {
                }
                break;
            default:
                C2046b c2046b = (C2046b) this.f2909h;
                if (!collection.isEmpty()) {
                    int i10 = c2046b.f6893i;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        c2046b.m5064j(it2.next());
                    }
                    if (i10 != c2046b.f6893i) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f2908g) {
            case 0:
                collection.getClass();
                C0933f0 c0933f0 = (C0933f0) this.f2909h;
                int i9 = c0933f0.f2924b;
                Object[] objArr = c0933f0.f2923a;
                for (int i10 = i9 - 1; -1 < i10; i10--) {
                    if (!collection.contains(objArr[i10])) {
                        c0933f0.m2296k(i10);
                    }
                }
                if (i9 != c0933f0.f2924b) {
                }
                break;
            default:
                C2046b c2046b = (C2046b) this.f2909h;
                int i11 = c2046b.f6893i;
                for (int i12 = i11 - 1; -1 < i12; i12--) {
                    if (!collection.contains(c2046b.f6891g[i12])) {
                        c2046b.m5065k(i12);
                    }
                }
                if (i11 != c2046b.f6893i) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        switch (this.f2908g) {
            case 0:
                AbstractC0953p0.m2347a(i9, this);
                return ((C0933f0) this.f2909h).m2299n(i9, obj);
            default:
                AbstractC2047c.m5068a(i9, this);
                Object[] objArr = ((C2046b) this.f2909h).f6891g;
                Object obj2 = objArr[i9];
                objArr[i9] = obj;
                return obj2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f2908g) {
            case 0:
                return ((C0933f0) this.f2909h).f2924b;
            default:
                return ((C2046b) this.f2909h).f6893i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i9, int i10) {
        switch (this.f2908g) {
            case 0:
                AbstractC0953p0.m2348b(this, i9, i10);
                return new C0931e0(this, i9, i10, 0);
            default:
                AbstractC2047c.m5069b(this, i9, i10);
                return new C0931e0(this, i9, i10, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f2908g) {
            case 0:
                objArr.getClass();
                break;
        }
        return AbstractC1415k.m3824b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f2908g) {
        }
        return AbstractC1415k.m3823a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        switch (this.f2908g) {
            case 0:
                return new C0927c0(this, i9, 0);
            default:
                return new C0927c0(this, i9, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f2908g) {
            case 0:
                return ((C0933f0) this.f2909h).m2295j(obj);
            default:
                return ((C2046b) this.f2909h).m5064j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2908g) {
            case 0:
                ((C0933f0) this.f2909h).m2286a(obj);
                break;
            default:
                ((C2046b) this.f2909h).m5056b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f2908g) {
            case 0:
                collection.getClass();
                C0933f0 c0933f0 = (C0933f0) this.f2909h;
                int i9 = c0933f0.f2924b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c0933f0.m2286a(it.next());
                }
                return i9 != c0933f0.f2924b;
            default:
                C2046b c2046b = (C2046b) this.f2909h;
                return c2046b.m5059e(c2046b.f6893i, collection);
        }
    }
}
