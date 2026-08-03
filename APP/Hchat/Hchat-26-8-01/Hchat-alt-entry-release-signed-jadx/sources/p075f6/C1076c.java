package p075f6;

import bsh.C0353j;
import java.util.Iterator;
import java.util.ListIterator;
import okio.C3193a;
import p219oh.AbstractC3165h;

/* JADX INFO: renamed from: f6.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1076c implements ListIterator, Iterator {

    /* JADX INFO: renamed from: g */
    public final int f3462g;

    /* JADX INFO: renamed from: h */
    public int f3463h;

    /* JADX INFO: renamed from: i */
    public final AbstractC1078e f3464i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1076c(AbstractC1078e abstractC1078e, int i9) {
        int size = abstractC1078e.size();
        if (i9 < 0 || i9 > size) {
            C3193a.m6820i(AbstractC3165h.m6781h(i9, size, "index"));
            throw null;
        }
        this.f3462g = size;
        this.f3463h = i9;
        this.f3464i = abstractC1078e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m2708a(int i9) {
        return this.f3464i.get(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3463h < this.f3462g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3463h > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        int i9 = this.f3463h;
        this.f3463h = i9 + 1;
        return m2708a(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3463h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C0353j.m1307e();
            return null;
        }
        int i9 = this.f3463h - 1;
        this.f3463h = i9;
        return m2708a(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3463h - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
