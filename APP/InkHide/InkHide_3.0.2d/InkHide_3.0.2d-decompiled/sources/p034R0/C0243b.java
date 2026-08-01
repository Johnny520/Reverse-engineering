package p034R0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p029O0.InterfaceC0233a;

/* JADX INFO: renamed from: R0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0243b implements Iterator, InterfaceC0233a {

    /* JADX INFO: renamed from: a */
    public final int f586a;

    /* JADX INFO: renamed from: b */
    public final int f587b;

    /* JADX INFO: renamed from: c */
    public boolean f588c;

    /* JADX INFO: renamed from: d */
    public int f589d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0243b(int i2, int i3, int i4) {
        this.f586a = i4;
        this.f587b = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f588c = z2;
        this.f589d = z2 ? i2 : i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m458a() {
        int i2 = this.f589d;
        if (i2 != this.f587b) {
            this.f589d = this.f586a + i2;
            return i2;
        }
        if (!this.f588c) {
            throw new NoSuchElementException();
        }
        this.f588c = false;
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f588c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(m458a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
