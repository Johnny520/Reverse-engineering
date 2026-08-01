package p075l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0750h implements Set {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2543a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0743a f2544b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0750h(C0743a c0743a, int i2) {
        this.f2543a = i2;
        this.f2544b = c0743a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2543a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f2543a) {
            case 0:
                C0743a c0743a = this.f2544b;
                int iM1396d = c0743a.m1396d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (c0743a.f2513d) {
                        case 0:
                            ((C0744b) c0743a.f2514e).put(key, value);
                            break;
                        default:
                            ((C0745c) c0743a.f2514e).add(key);
                            break;
                    }
                }
                return iM1396d != c0743a.m1396d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f2543a) {
            case 0:
                this.f2544b.m1393a();
                break;
            default:
                this.f2544b.m1393a();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2543a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0743a c0743a = this.f2544b;
                int iM1397e = c0743a.m1397e(key);
                if (iM1397e < 0) {
                    return false;
                }
                Object objM1394b = c0743a.m1394b(iM1397e, 1);
                Object value = entry.getValue();
                return objM1394b == value || (objM1394b != null && objM1394b.equals(value));
            default:
                return this.f2544b.m1397e(obj) >= 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f2543a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map mapM1395c = this.f2544b.m1395c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mapM1395c.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f2543a) {
        }
        return C0743a.m1392h(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f2543a) {
            case 0:
                C0743a c0743a = this.f2544b;
                int iHashCode = 0;
                for (int iM1396d = c0743a.m1396d() - 1; iM1396d >= 0; iM1396d--) {
                    Object objM1394b = c0743a.m1394b(iM1396d, 0);
                    Object objM1394b2 = c0743a.m1394b(iM1396d, 1);
                    iHashCode += (objM1394b == null ? 0 : objM1394b.hashCode()) ^ (objM1394b2 == null ? 0 : objM1394b2.hashCode());
                }
                return iHashCode;
            default:
                C0743a c0743a2 = this.f2544b;
                int iHashCode2 = 0;
                for (int iM1396d2 = c0743a2.m1396d() - 1; iM1396d2 >= 0; iM1396d2--) {
                    Object objM1394b3 = c0743a2.m1394b(iM1396d2, 0);
                    iHashCode2 += objM1394b3 == null ? 0 : objM1394b3.hashCode();
                }
                return iHashCode2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f2543a) {
            case 0:
                if (this.f2544b.m1396d() == 0) {
                }
                break;
            default:
                if (this.f2544b.m1396d() == 0) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2543a) {
            case 0:
                return new C0751i(this.f2544b);
            default:
                return new C0749g(this.f2544b, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f2543a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0743a c0743a = this.f2544b;
                int iM1397e = c0743a.m1397e(obj);
                if (iM1397e < 0) {
                    return false;
                }
                c0743a.m1399g(iM1397e);
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f2543a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapM1395c = this.f2544b.m1395c();
                int size = mapM1395c.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mapM1395c.remove(it.next());
                }
                return size != mapM1395c.size();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f2543a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapM1395c = this.f2544b.m1395c();
                int size = mapM1395c.size();
                Iterator it = mapM1395c.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != mapM1395c.size();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f2543a) {
        }
        return this.f2544b.m1396d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f2543a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f2544b.m1400i(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f2543a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0743a c0743a = this.f2544b;
                int iM1396d = c0743a.m1396d();
                Object[] objArr = new Object[iM1396d];
                for (int i2 = 0; i2 < iM1396d; i2++) {
                    objArr[i2] = c0743a.m1394b(i2, 0);
                }
                return objArr;
        }
    }
}
