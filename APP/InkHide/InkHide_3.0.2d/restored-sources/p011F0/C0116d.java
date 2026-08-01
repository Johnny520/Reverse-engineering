package p011F0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: F0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0116d extends C0115c implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0118f f415d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0116d(AbstractC0118f abstractC0118f, int i2) {
        super(abstractC0118f);
        this.f415d = abstractC0118f;
        int iMo250a = abstractC0118f.mo250a();
        if (i2 >= 0 && i2 <= iMo250a) {
            this.f413b = i2;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + iMo250a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f413b > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f413b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f413b - 1;
        this.f413b = i2;
        return this.f415d.get(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f413b - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
