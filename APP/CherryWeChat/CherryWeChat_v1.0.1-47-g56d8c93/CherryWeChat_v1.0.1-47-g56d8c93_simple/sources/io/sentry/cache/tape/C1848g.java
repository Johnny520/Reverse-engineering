package io.sentry.cache.tape;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.sentry.cache.tape.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1848g implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f6654a;

    /* JADX INFO: renamed from: b */
    public long f6655b;

    /* JADX INFO: renamed from: c */
    public int f6656c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1849h f6657d;

    public C1848g(C1849h r3) {
        this.f6657d = r3;
        this.f6654a = 0;
        this.f6655b = r3.f6663e.f6652a;
        this.f6656c = r3.f6666h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C1849h r0 = this.f6657d;
        if (r0.f6668j == true) goto L15;
        if (r0.f6666h != this.f6656c) goto L13;
        if (this.f6654a == r0.f6662d) goto L10;
        return true;
    L10:
        return false;
    L13:
        throw new ConcurrentModificationException();
    L15:
        throw new IllegalStateException("closed");
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte[] r0 = C1849h.f6658k;
        C1849h r1 = this.f6657d;
        if (r1.f6668j == true) goto L28;
        if (r1.f6666h != this.f6656c) goto L26;
        int r2 = r1.f6662d;
        if (r2 == 0) goto L24;
        if (this.f6654a >= r2) goto L22;
        C1847f r22 = r1.m4023r(this.f6655b);     // Catch: IOException -> L14 OutOfMemoryError -> L18
        int r3 = r22.f6653b;     // Catch: IOException -> L14 OutOfMemoryError -> L18
        long r4 = r22.f6652a;     // Catch: IOException -> L14 OutOfMemoryError -> L18
        byte[] r23 = new byte[r3];     // Catch: IOException -> L14 OutOfMemoryError -> L18
        long r42 = r4 + 4;     // Catch: IOException -> L14 OutOfMemoryError -> L18
        long r6 = r1.m4028y(r42);     // Catch: IOException -> L14 OutOfMemoryError -> L18
        this.f6655b = r6;     // Catch: IOException -> L14 OutOfMemoryError -> L18
        if (r1.m4026w(r3, r6, r23) == true) goto L16;
        this.f6654a = r1.f6662d;     // Catch: IOException -> L14 OutOfMemoryError -> L18
        return r0;
    L16:
        this.f6655b = r1.m4028y(r42 + ((long) r3));     // Catch: IOException -> L14 OutOfMemoryError -> L18
        this.f6654a++;
        return r23;
    L14:
        e = move-exception;
        throw e;
    L18:
        r1.m4025v();
        this.f6654a = r1.f6662d;
        return r0;
    L22:
        throw new NoSuchElementException();
    L24:
        throw new NoSuchElementException();
    L26:
        throw new ConcurrentModificationException();
    L28:
        throw new IllegalStateException("closed");
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1849h r0 = this.f6657d;
        if (r0.f6666h != this.f6656c) goto L15;
        if (r0.f6662d == 0) goto L13;
        if (this.f6654a != 1) goto L11;
        r0.remove(1);
        this.f6656c = r0.f6666h;
        this.f6654a--;
        return;
    L11:
        throw new UnsupportedOperationException("Removal is only permitted from the head.");
    L13:
        throw new NoSuchElementException();
    L15:
        throw new ConcurrentModificationException();
    }
}
