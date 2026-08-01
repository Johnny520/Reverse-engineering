package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ys */
/* JADX INFO: loaded from: classes.dex */
public final class C0941ys implements Iterator {

    /* JADX INFO: renamed from: a */
    public final int f5487a;

    /* JADX INFO: renamed from: b */
    public int f5488b;

    /* JADX INFO: renamed from: c */
    public int f5489c;

    /* JADX INFO: renamed from: d */
    public boolean f5490d = false;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0474m6 f5491e;

    public C0941ys(C0474m6 c0474m6, int i) {
        this.f5491e = c0474m6;
        this.f5487a = i;
        this.f5488b = c0474m6.m1811d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5489c < this.f5488b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM1809b = this.f5491e.m1809b(this.f5489c, this.f5487a);
        this.f5489c++;
        this.f5490d = true;
        return objM1809b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5490d) {
            throw new IllegalStateException();
        }
        int i = this.f5489c - 1;
        this.f5489c = i;
        this.f5488b--;
        this.f5490d = false;
        this.f5491e.m1814g(i);
    }
}
