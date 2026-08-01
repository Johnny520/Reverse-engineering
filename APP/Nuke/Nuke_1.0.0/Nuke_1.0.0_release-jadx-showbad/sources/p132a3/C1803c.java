package p132a3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: a3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1803c implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final int f6143d;

    /* JADX INFO: renamed from: e */
    public final int f6144e;

    /* JADX INFO: renamed from: f */
    public boolean f6145f;

    /* JADX INFO: renamed from: g */
    public int f6146g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1803c(int i5, int i6, int i7) {
        this.f6143d = i7;
        this.f6144e = i6;
        boolean z5 = false;
        if (i7 <= 0 ? i5 >= i6 : i5 <= i6) {
            z5 = true;
        }
        this.f6145f = z5;
        this.f6146g = z5 ? i5 : i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6145f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f6146g;
        if (i5 != this.f6144e) {
            this.f6146g = this.f6143d + i5;
        } else {
            if (!this.f6145f) {
                throw new NoSuchElementException();
            }
            this.f6145f = false;
        }
        return Integer.valueOf(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
