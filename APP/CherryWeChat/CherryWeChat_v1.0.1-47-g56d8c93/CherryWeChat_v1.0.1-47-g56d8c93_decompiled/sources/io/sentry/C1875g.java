package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.sentry.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1875g implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f6721a;

    /* JADX INFO: renamed from: b */
    public int f6722b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f6723c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1879h f6724d;

    public C1875g(C1879h c1879h) {
        this.f6724d = c1879h;
        this.f6721a = c1879h.f6728b;
        this.f6723c = c1879h.f6730d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6723c || this.f6721a != this.f6724d.f6729c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6723c = false;
        int i = this.f6721a;
        this.f6722b = i;
        int i2 = i + 1;
        C1879h c1879h = this.f6724d;
        this.f6721a = i2 < c1879h.f6731e ? i2 : 0;
        return c1879h.f6727a[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        C1879h c1879h = this.f6724d;
        int i2 = c1879h.f6731e;
        Object[] objArr = c1879h.f6727a;
        int i3 = this.f6722b;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        int i4 = c1879h.f6728b;
        if (i3 == i4) {
            c1879h.remove();
            this.f6722b = -1;
            return;
        }
        int i5 = i3 + 1;
        if (i4 >= i3 || i5 >= (i = c1879h.f6729c)) {
            while (i5 != c1879h.f6729c) {
                if (i5 >= i2) {
                    objArr[i5 - 1] = objArr[0];
                } else {
                    int i6 = i5 - 1;
                    if (i6 < 0) {
                        i6 = i2 - 1;
                    }
                    objArr[i6] = objArr[i5];
                    i5++;
                    if (i5 >= i2) {
                    }
                }
                i5 = 0;
            }
        } else {
            System.arraycopy(objArr, i5, objArr, i3, i - i5);
        }
        this.f6722b = -1;
        int i7 = c1879h.f6729c - 1;
        if (i7 < 0) {
            i7 = i2 - 1;
        }
        c1879h.f6729c = i7;
        objArr[i7] = null;
        c1879h.f6730d = false;
        int i8 = this.f6721a - 1;
        if (i8 < 0) {
            i8 = i2 - 1;
        }
        this.f6721a = i8;
    }
}
