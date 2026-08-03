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

    public C0200El(int i, int i2, int i3) {
        this.f603a = i3;
        this.f604b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f605c = z;
        this.f606d = z ? i : i2;
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
        int i = this.f606d;
        if (i != this.f604b) {
            this.f606d = this.f603a + i;
            return i;
        }
        if (!this.f605c) {
            throw new NoSuchElementException();
        }
        this.f605c = false;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
