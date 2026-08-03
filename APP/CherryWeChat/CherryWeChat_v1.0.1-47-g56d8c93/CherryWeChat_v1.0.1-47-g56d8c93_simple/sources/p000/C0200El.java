package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: El */
/* JADX INFO: loaded from: classes.dex */
public final class C0200El implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final int f603a;

    /* JADX INFO: renamed from: b */
    public final int f604b;

    /* JADX INFO: renamed from: c */
    public boolean f605c;

    /* JADX INFO: renamed from: d */
    public int f606d;

    public C0200El(int r3, int r4, int r5) {
        this.f603a = r5;
        this.f604b = r4;
        boolean r0 = false;
        if (r5 <= 0) goto L6;
        if (r3 > r4) goto L8;
    L5:
        r0 = true;
    L8:
        this.f605c = r0;
        if (r0 == true) goto L12;
        r3 = r4;
    L12:
        this.f606d = r3;
        return;
    L6:
        if (r3 < r4) goto L8;
        goto L8
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f605c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int r0 = this.f606d;
        if (r0 == this.f604b) goto L5;
        this.f606d = this.f603a + r0;
        return r0;
    L5:
        if (this.f605c == false) goto L9;
        this.f605c = false;
        return r0;
    L9:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
