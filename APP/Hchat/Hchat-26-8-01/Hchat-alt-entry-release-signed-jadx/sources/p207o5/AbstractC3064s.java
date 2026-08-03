package p207o5;

import androidx.lifecycle.C0119x;
import bsh.C0353j;
import java.util.ListIterator;
import p005a5.C0016a;

/* JADX INFO: renamed from: o5.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3064s implements ListIterator {

    /* JADX INFO: renamed from: g */
    public final C0016a f9905g;

    /* JADX INFO: renamed from: h */
    public final int f9906h;

    /* JADX INFO: renamed from: i */
    public final int f9907i;

    /* JADX INFO: renamed from: j */
    public int f9908j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3064s(C0119x c0119x, int i9, int i10) {
        c0119x.getClass();
        this.f9905g = new C0016a(i9, 5, c0119x);
        this.f9907i = i9;
        this.f9906h = i10;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo5503a(C0016a c0016a, int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9908j < this.f9906h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9908j > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        int i9 = this.f9908j;
        if (i9 < this.f9906h) {
            this.f9908j = i9 + 1;
            return mo5503a(this.f9905g, i9);
        }
        C0353j.m1307e();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9908j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i9 = this.f9908j - 1;
        int i10 = this.f9907i;
        C0016a c0016a = this.f9905g;
        c0016a.f55h = i10;
        this.f9908j = 0;
        while (true) {
            int i11 = this.f9908j;
            if (i11 >= i9) {
                this.f9908j = i11 + 1;
                return mo5503a(c0016a, i11);
            }
            this.f9908j = i11 + 1;
            mo5503a(c0016a, i11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9908j - 1;
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
