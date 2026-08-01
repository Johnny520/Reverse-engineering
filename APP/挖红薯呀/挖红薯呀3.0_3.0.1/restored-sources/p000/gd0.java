package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class gd0 extends AbstractC0038b0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1926d;

    /* JADX INFO: renamed from: e */
    public final fd0 f1927e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gd0(fd0 fd0Var, int i) {
        this.f1926d = i;
        this.f1927e = fd0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0038b0
    /* JADX INFO: renamed from: a */
    public final int mo230a() {
        switch (this.f1926d) {
        }
        return this.f1927e.f1691l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f1926d) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.f1926d;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f1926d) {
            case 0:
                this.f1927e.clear();
                break;
            default:
                this.f1927e.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f1926d;
        fd0 fd0Var = this.f1927e;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                fd0Var.getClass();
                int iM1085f = fd0Var.m1085f(entry.getKey());
                if (iM1085f < 0) {
                    return false;
                }
                Object[] objArr = fd0Var.f1684e;
                objArr.getClass();
                return p30.m3002l(objArr[iM1085f], entry.getValue());
            default:
                return fd0Var.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f1926d) {
            case 0:
                collection.getClass();
                return this.f1927e.m1083d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f1926d) {
        }
        return this.f1927e.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f1926d;
        fd0 fd0Var = this.f1927e;
        switch (i) {
            case 0:
                fd0Var.getClass();
                return new cd0(fd0Var, 0);
            default:
                fd0Var.getClass();
                return new cd0(fd0Var, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f1926d;
        fd0 fd0Var = this.f1927e;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    fd0Var.getClass();
                    fd0Var.m1081b();
                    int iM1085f = fd0Var.m1085f(entry.getKey());
                    if (iM1085f >= 0) {
                        Object[] objArr = fd0Var.f1684e;
                        objArr.getClass();
                        if (p30.m3002l(objArr[iM1085f], entry.getValue())) {
                            fd0Var.m1089j(iM1085f);
                        }
                    }
                }
                break;
            default:
                fd0Var.m1081b();
                int iM1085f2 = fd0Var.m1085f(obj);
                if (iM1085f2 >= 0) {
                    fd0Var.m1089j(iM1085f2);
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.f1926d;
        fd0 fd0Var = this.f1927e;
        collection.getClass();
        switch (i) {
            case 0:
                fd0Var.m1081b();
                break;
            default:
                fd0Var.m1081b();
                break;
        }
        return super.removeAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.f1926d;
        fd0 fd0Var = this.f1927e;
        collection.getClass();
        switch (i) {
            case 0:
                fd0Var.m1081b();
                break;
            default:
                fd0Var.m1081b();
                break;
        }
        return super.retainAll(collection);
    }
}
