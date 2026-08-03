package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: sp */
/* JADX INFO: loaded from: classes.dex */
public final class C2511sp implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final long f8798a;

    /* JADX INFO: renamed from: b */
    public final long f8799b;

    /* JADX INFO: renamed from: c */
    public boolean f8800c;

    /* JADX INFO: renamed from: d */
    public long f8801d;

    public C2511sp(long r3, long r5, long r7) {
        this.f8798a = r7;
        this.f8799b = r5;
        boolean r8 = false;
        if (r7 <= 0) goto L8;
        if (r3 > r5) goto L10;
    L6:
        r8 = true;
    L10:
        this.f8800c = r8;
        if (r8 == true) goto L14;
        r3 = r5;
    L14:
        this.f8801d = r3;
        return;
    L8:
        if (r3 < r5) goto L10;
        goto L10
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8800c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long r0 = this.f8801d;
        if (r0 == this.f8799b) goto L5;
        this.f8801d = this.f8798a + r0;
    L11:
        return Long.valueOf(r0);
    L5:
        if (this.f8800c == false) goto L8;
        this.f8800c = false;
        goto L11
    L8:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
