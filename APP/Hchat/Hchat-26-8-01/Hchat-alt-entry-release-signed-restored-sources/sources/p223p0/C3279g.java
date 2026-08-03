package p223p0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p114hg.InterfaceC1712b;
import p266s0.C3877g;
import p304uf.C4331e;
import p304uf.C4333g;

/* JADX INFO: renamed from: p0.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3279g extends AbstractCollection implements Collection, InterfaceC1712b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10435g;

    /* JADX INFO: renamed from: h */
    public final Object f10436h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3279g(Object obj, int i9) {
        this.f10435g = i9;
        this.f10436h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f10435g) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f10435g) {
            case 1:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f10435g) {
            case 0:
                ((C3877g) this.f10436h).clear();
                break;
            default:
                ((C4333g) this.f10436h).clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f10435g) {
            case 0:
                return ((C3877g) this.f10436h).containsValue(obj);
            default:
                return ((C4333g) this.f10436h).containsValue(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f10435g) {
            case 1:
                return ((C4333g) this.f10436h).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f10435g) {
            case 0:
                C3877g c3877g = (C3877g) this.f10436h;
                AbstractC3283k[] abstractC3283kArr = new AbstractC3283k[8];
                for (int i9 = 0; i9 < 8; i9++) {
                    abstractC3283kArr[i9] = new C3284l(2);
                }
                return new C3278f(c3877g, abstractC3283kArr);
            default:
                C4333g c4333g = (C4333g) this.f10436h;
                c4333g.getClass();
                return new C4331e(c4333g, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f10435g) {
            case 1:
                C4333g c4333g = (C4333g) this.f10436h;
                c4333g.m8781d();
                int iM8786i = c4333g.m8786i(obj);
                if (iM8786i < 0) {
                    return false;
                }
                c4333g.m8789l(iM8786i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f10435g) {
            case 1:
                collection.getClass();
                ((C4333g) this.f10436h).m8781d();
                break;
        }
        return super.removeAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f10435g) {
            case 1:
                collection.getClass();
                ((C4333g) this.f10436h).m8781d();
                break;
        }
        return super.retainAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f10435g) {
            case 0:
                return ((C3877g) this.f10436h).f12731k;
            default:
                return ((C4333g) this.f10436h).f14485o;
        }
    }
}
