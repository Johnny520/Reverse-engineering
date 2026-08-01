package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gp */
/* JADX INFO: loaded from: classes.dex */
public final class C0269gp implements Iterator {

    /* JADX INFO: renamed from: a */
    public final int f2162a;

    /* JADX INFO: renamed from: b */
    public final int f2163b;

    /* JADX INFO: renamed from: c */
    public boolean f2164c;

    /* JADX INFO: renamed from: d */
    public int f2165d;

    public C0269gp(int i, int i2, int i3) {
        this.f2162a = i3;
        this.f2163b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f2164c = z;
        this.f2165d = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2164c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2165d;
        if (i != this.f2163b) {
            this.f2165d = this.f2162a + i;
        } else {
            if (!this.f2164c) {
                throw new NoSuchElementException();
            }
            this.f2164c = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
