package p304uf;

import gg.AbstractC1416l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import tf.AbstractC4161h;

/* JADX INFO: renamed from: uf.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4334h extends AbstractC4161h {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14490g;

    /* JADX INFO: renamed from: h */
    public final C4333g f14491h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4334h(C4333g c4333g, int i9) {
        this.f14490g = i9;
        this.f14491h = c4333g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4161h
    /* JADX INFO: renamed from: a */
    public final int mo6942a() {
        switch (this.f14490g) {
        }
        return this.f14491h.f14485o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f14490g) {
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
        int i9 = this.f14490g;
        collection.getClass();
        switch (i9) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f14490g) {
            case 0:
                this.f14491h.clear();
                break;
            default:
                this.f14491h.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f14490g) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C4333g c4333g = this.f14491h;
                c4333g.getClass();
                int iM8785h = c4333g.m8785h(entry.getKey());
                if (iM8785h < 0) {
                    return false;
                }
                Object[] objArr = c4333g.f14478h;
                objArr.getClass();
                return AbstractC1416l.m3825a(objArr[iM8785h], entry.getValue());
            default:
                return this.f14491h.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f14490g) {
            case 0:
                collection.getClass();
                return this.f14491h.m8783f(collection);
            default:
                return super.containsAll(collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f14490g) {
        }
        return this.f14491h.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f14490g) {
            case 0:
                C4333g c4333g = this.f14491h;
                c4333g.getClass();
                return new C4331e(c4333g, 0);
            default:
                C4333g c4333g2 = this.f14491h;
                c4333g2.getClass();
                return new C4331e(c4333g2, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f14490g) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C4333g c4333g = this.f14491h;
                    c4333g.getClass();
                    c4333g.m8781d();
                    int iM8785h = c4333g.m8785h(entry.getKey());
                    if (iM8785h >= 0) {
                        Object[] objArr = c4333g.f14478h;
                        objArr.getClass();
                        if (AbstractC1416l.m3825a(objArr[iM8785h], entry.getValue())) {
                            c4333g.m8789l(iM8785h);
                            break;
                        }
                    }
                }
                break;
            default:
                C4333g c4333g2 = this.f14491h;
                c4333g2.m8781d();
                int iM8785h2 = c4333g2.m8785h(obj);
                if (iM8785h2 >= 0) {
                    c4333g2.m8789l(iM8785h2);
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i9 = this.f14490g;
        collection.getClass();
        switch (i9) {
            case 0:
                this.f14491h.m8781d();
                break;
            default:
                this.f14491h.m8781d();
                break;
        }
        return super.removeAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i9 = this.f14490g;
        collection.getClass();
        switch (i9) {
            case 0:
                this.f14491h.m8781d();
                break;
            default:
                this.f14491h.m8781d();
                break;
        }
        return super.retainAll(collection);
    }
}
