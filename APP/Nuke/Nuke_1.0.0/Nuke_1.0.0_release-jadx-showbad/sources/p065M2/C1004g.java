package p065M2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p117X2.AbstractC1665j;
import p119Y.AbstractC1729m;
import p119Y.C1724h;
import p119Y.C1730n;
import p122Y2.InterfaceC1767b;
import p136b0.C1846h;

/* JADX INFO: renamed from: M2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1004g extends AbstractCollection implements Collection, InterfaceC1767b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3115d;

    /* JADX INFO: renamed from: e */
    public final Object f3116e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1004g(int i5, Object obj) {
        this.f3115d = i5;
        this.f3116e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3115d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f3115d) {
            case 0:
                AbstractC1665j.m2985e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f3115d) {
            case 0:
                ((C1002e) this.f3116e).clear();
                break;
            default:
                ((C1846h) this.f3116e).clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3115d) {
            case 0:
                return ((C1002e) this.f3116e).containsValue(obj);
            default:
                return ((C1846h) this.f3116e).containsValue(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f3115d) {
            case 0:
                return ((C1002e) this.f3116e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3115d) {
            case 0:
                C1002e c1002e = (C1002e) this.f3116e;
                c1002e.getClass();
                return new C1000c(c1002e, 2);
            default:
                C1846h c1846h = (C1846h) this.f3116e;
                AbstractC1729m[] abstractC1729mArr = new AbstractC1729m[8];
                for (int i5 = 0; i5 < 8; i5++) {
                    abstractC1729mArr[i5] = new C1730n(2);
                }
                return new C1724h(c1846h, abstractC1729mArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f3115d) {
            case 0:
                C1002e c1002e = (C1002e) this.f3116e;
                c1002e.m2069b();
                int iM2075h = c1002e.m2075h(obj);
                if (iM2075h < 0) {
                    return false;
                }
                c1002e.m2078k(iM2075h);
                return true;
            default:
                return super.remove(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f3115d) {
            case 0:
                AbstractC1665j.m2985e(collection, "elements");
                ((C1002e) this.f3116e).m2069b();
                break;
        }
        return super.removeAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f3115d) {
            case 0:
                AbstractC1665j.m2985e(collection, "elements");
                ((C1002e) this.f3116e).m2069b();
                break;
        }
        return super.retainAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f3115d) {
            case 0:
                return ((C1002e) this.f3116e).f3108l;
            default:
                C1846h c1846h = (C1846h) this.f3116e;
                c1846h.getClass();
                return c1846h.f6253h;
        }
    }
}
