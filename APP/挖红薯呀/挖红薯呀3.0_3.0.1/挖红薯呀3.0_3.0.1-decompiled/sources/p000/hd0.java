package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class hd0 extends AbstractCollection implements Collection, q40 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2214d;

    /* JADX INFO: renamed from: e */
    public final Object f2215e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ hd0(int i, Object obj) {
        this.f2214d = i;
        this.f2215e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2214d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f2214d) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f2214d) {
            case 0:
                ((fd0) this.f2215e).clear();
                break;
            default:
                ((eq0) this.f2215e).clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2214d) {
            case 0:
                return ((fd0) this.f2215e).containsValue(obj);
            default:
                return ((eq0) this.f2215e).containsValue(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f2214d) {
            case 0:
                return ((fd0) this.f2215e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f2214d;
        Object obj = this.f2215e;
        switch (i) {
            case 0:
                fd0 fd0Var = (fd0) obj;
                fd0Var.getClass();
                return new cd0(fd0Var, 2);
            default:
                eq0 eq0Var = (eq0) obj;
                m91[] m91VarArr = new m91[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    m91VarArr[i2] = new n91(2);
                }
                return new kq0(eq0Var, m91VarArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f2214d) {
            case 0:
                fd0 fd0Var = (fd0) this.f2215e;
                fd0Var.m1081b();
                int iM1086g = fd0Var.m1086g(obj);
                if (iM1086g < 0) {
                    return false;
                }
                fd0Var.m1089j(iM1086g);
                return true;
            default:
                return super.remove(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f2214d) {
            case 0:
                collection.getClass();
                ((fd0) this.f2215e).m1081b();
                break;
        }
        return super.removeAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f2214d) {
            case 0:
                collection.getClass();
                ((fd0) this.f2215e).m1081b();
                break;
        }
        return super.retainAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f2214d) {
            case 0:
                return ((fd0) this.f2215e).f1691l;
            default:
                return ((eq0) this.f2215e).f1508h;
        }
    }
}
