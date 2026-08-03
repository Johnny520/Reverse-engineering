package io.sentry.cache.tape;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.sentry.cache.tape.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1848g implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f6654a = 0;

    /* JADX INFO: renamed from: b */
    public long f6655b;

    /* JADX INFO: renamed from: c */
    public int f6656c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1849h f6657d;

    public C1848g(C1849h c1849h) {
        this.f6657d = c1849h;
        this.f6655b = c1849h.f6663e.f6652a;
        this.f6656c = c1849h.f6666h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C1849h c1849h = this.f6657d;
        if (c1849h.f6668j) {
            throw new IllegalStateException("closed");
        }
        if (c1849h.f6666h == this.f6656c) {
            return this.f6654a != c1849h.f6662d;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        byte[] bArr = C1849h.f6658k;
        C1849h c1849h = this.f6657d;
        if (c1849h.f6668j) {
            throw new IllegalStateException("closed");
        }
        if (c1849h.f6666h != this.f6656c) {
            throw new ConcurrentModificationException();
        }
        int i = c1849h.f6662d;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        if (this.f6654a >= i) {
            throw new NoSuchElementException();
        }
        try {
            C1847f c1847fM4023r = c1849h.m4023r(this.f6655b);
            int i2 = c1847fM4023r.f6653b;
            long j = c1847fM4023r.f6652a;
            byte[] bArr2 = new byte[i2];
            long j2 = j + 4;
            long jM4028y = c1849h.m4028y(j2);
            this.f6655b = jM4028y;
            if (!c1849h.m4026w(i2, jM4028y, bArr2)) {
                this.f6654a = c1849h.f6662d;
                return bArr;
            }
            this.f6655b = c1849h.m4028y(j2 + ((long) i2));
            this.f6654a++;
            return bArr2;
        } catch (IOException e) {
            throw e;
        } catch (OutOfMemoryError unused) {
            c1849h.m4025v();
            this.f6654a = c1849h.f6662d;
            return bArr;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1849h c1849h = this.f6657d;
        if (c1849h.f6666h != this.f6656c) {
            throw new ConcurrentModificationException();
        }
        if (c1849h.f6662d == 0) {
            throw new NoSuchElementException();
        }
        if (this.f6654a != 1) {
            throw new UnsupportedOperationException("Removal is only permitted from the head.");
        }
        c1849h.remove(1);
        this.f6656c = c1849h.f6666h;
        this.f6654a--;
    }
}
