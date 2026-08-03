package p063j;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0962g implements Iterator {

    /* JADX INFO: renamed from: a */
    public final int f3414a;

    /* JADX INFO: renamed from: b */
    public int f3415b;

    /* JADX INFO: renamed from: c */
    public int f3416c;

    /* JADX INFO: renamed from: d */
    public boolean f3417d = false;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0956a f3418e;

    public C0962g(C0956a c0956a, int i2) {
        this.f3418e = c0956a;
        this.f3414a = i2;
        this.f3415b = c0956a.m2292d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3416c < this.f3415b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM2290b = this.f3418e.m2290b(this.f3416c, this.f3414a);
        this.f3416c++;
        this.f3417d = true;
        return objM2290b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3417d) {
            throw new IllegalStateException();
        }
        int i2 = this.f3416c - 1;
        this.f3416c = i2;
        this.f3415b--;
        this.f3417d = false;
        this.f3418e.m2296h(i2);
    }
}
