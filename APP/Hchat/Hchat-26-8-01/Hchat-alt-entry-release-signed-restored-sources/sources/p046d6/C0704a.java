package p046d6;

import bsh.C0353j;
import java.util.ListIterator;
import p150k5.C2273x;
import p207o5.C3062q;

/* JADX INFO: renamed from: d6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0704a implements ListIterator {

    /* JADX INFO: renamed from: g */
    public int f2122g;

    /* JADX INFO: renamed from: h */
    public C3062q f2123h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2273x f2124i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0704a(C2273x c2273x, int i9, C3062q c3062q) {
        this.f2124i = c2273x;
        this.f2122g = i9 - 1;
        this.f2123h = c3062q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f2123h == null) {
            try {
                this.f2123h = this.f2124i.m5526a(this.f2122g + 1);
            } catch (IndexOutOfBoundsException unused) {
                C0353j.m1307e();
                return false;
            }
        }
        return this.f2123h.f9899g.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2122g >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.f2123h == null) {
            try {
                this.f2123h = this.f2124i.m5526a(this.f2122g + 1);
            } catch (IndexOutOfBoundsException unused) {
                C0353j.m1307e();
                return null;
            }
        }
        Object next = this.f2123h.next();
        this.f2122g++;
        return next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2122g + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        this.f2123h = null;
        try {
            C2273x c2273x = this.f2124i;
            int i9 = this.f2122g;
            this.f2122g = i9 - 1;
            return c2273x.m5526a(i9).next();
        } catch (IndexOutOfBoundsException unused) {
            C0353j.m1307e();
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2122g;
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
