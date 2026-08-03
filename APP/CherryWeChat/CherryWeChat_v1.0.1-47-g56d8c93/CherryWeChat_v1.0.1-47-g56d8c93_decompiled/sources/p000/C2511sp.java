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

    public C2511sp(long j, long j2, long j3) {
        this.f8798a = j3;
        this.f8799b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.f8800c = z;
        this.f8801d = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8800c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f8801d;
        if (j != this.f8799b) {
            this.f8801d = this.f8798a + j;
        } else {
            if (!this.f8800c) {
                throw new NoSuchElementException();
            }
            this.f8800c = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
