package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.sentry.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1875g implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f6721a;

    /* JADX INFO: renamed from: b */
    public int f6722b;

    /* JADX INFO: renamed from: c */
    public boolean f6723c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1879h f6724d;

    public C1875g(C1879h r2) {
        this.f6724d = r2;
        this.f6721a = r2.f6728b;
        this.f6722b = -1;
        this.f6723c = r2.f6730d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6723c == false) goto L5;
        return true;
    L5:
        if (this.f6721a != this.f6724d.f6729c) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L11;
        int r0 = 0;
        this.f6723c = false;
        int r1 = this.f6721a;
        this.f6722b = r1;
        int r2 = r1 + 1;
        C1879h r3 = this.f6724d;
        if (r2 >= r3.f6731e) goto L8;
        r0 = r2;
    L8:
        this.f6721a = r0;
        return r3.f6727a[r1];
    L11:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1879h r0 = this.f6724d;
        int r1 = r0.f6731e;
        Object[] r2 = r0.f6727a;
        int r3 = this.f6722b;
        if (r3 == (-1)) goto L33;
        int r5 = r0.f6728b;
        if (r3 != r5) goto L8;
        r0.remove();
        this.f6722b = -1;
        return;
    L8:
        int r6 = r3 + 1;
        if (r5 >= r3) goto L14;
        int r52 = r0.f6729c;
        if (r6 >= r52) goto L14;
        System.arraycopy(r2, r6, r2, r3, r52 - r6);
    L24:
        this.f6722b = -1;
        int r32 = r0.f6729c - 1;
        if (r32 >= 0) goto L27;
        r32 = r1 - 1;
    L27:
        r0.f6729c = r32;
        r2[r32] = null;
        r0.f6730d = false;
        int r02 = this.f6721a - 1;
        if (r02 >= 0) goto L30;
        r02 = r1 - 1;
    L30:
        this.f6721a = r02;
        return;
    L14:
        if (r6 == r0.f6729c) goto L24;
        if (r6 >= r1) goto L16;
        int r33 = r6 - 1;
        if (r33 >= 0) goto L21;
        r33 = r1 - 1;
    L21:
        r2[r33] = r2[r6];
        r6 = r6 + 1;
        if (r6 < r1) goto L14;
    L17:
        r6 = 0;
        goto L14
    L16:
        r2[r6 - 1] = r2[0];
        goto L17
    L33:
        throw new IllegalStateException();
    }
}
