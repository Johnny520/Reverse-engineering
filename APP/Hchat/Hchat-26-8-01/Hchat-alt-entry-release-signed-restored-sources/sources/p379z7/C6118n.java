package p379z7;

import bsh.C0353j;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: z7.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6118n implements ListIterator {

    /* JADX INFO: renamed from: j */
    public static C6118n f24677j;

    /* JADX INFO: renamed from: g */
    public final List f24678g;

    /* JADX INFO: renamed from: h */
    public int f24679h;

    /* JADX INFO: renamed from: i */
    public int f24680i = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6118n(int i9, List list) {
        this.f24678g = list;
        this.f24679h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i9 = this.f24679h;
        this.f24678g.add(i9, obj);
        this.f24679h = i9 + 1;
        this.f24680i = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f24679h < this.f24678g.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24679h != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i9 = this.f24679h;
        this.f24680i = i9;
        this.f24679h = i9 + 1;
        return this.f24678g.get(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24679h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i9 = this.f24679h - 1;
        if (i9 < 0) {
            C0353j.m1307e();
            return null;
        }
        this.f24679h = i9;
        this.f24680i = i9;
        return this.f24678g.get(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24679h - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i9 = this.f24680i;
        this.f24678g.remove(i9);
        this.f24679h = i9;
        this.f24680i = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f24678g.set(this.f24680i, obj);
    }
}
