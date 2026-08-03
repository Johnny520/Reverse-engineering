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
    public boolean f3417d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0956a f3418e;

    public C0962g(C0956a r2, int r3) {
        this.f3418e = r2;
        this.f3417d = false;
        this.f3414a = r3;
        this.f3415b = r2.m2292d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3416c >= this.f3415b) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        Object r02 = this.f3418e.m2290b(this.f3416c, this.f3414a);
        this.f3416c++;
        this.f3417d = true;
        return r02;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f3417d == false) goto L7;
        int r02 = this.f3416c - 1;
        this.f3416c = r02;
        this.f3415b--;
        this.f3417d = false;
        this.f3418e.m2296h(r02);
        return;
    L7:
        throw new IllegalStateException();
    }
}
