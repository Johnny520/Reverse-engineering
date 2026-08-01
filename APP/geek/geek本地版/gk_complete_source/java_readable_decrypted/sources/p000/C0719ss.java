package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ss */
/* JADX INFO: loaded from: classes.dex */
public final class C0719ss implements Iterator {

    /* JADX INFO: renamed from: a */
    public final int f4453a;

    /* JADX INFO: renamed from: b */
    public int f4454b;

    /* JADX INFO: renamed from: c */
    public int f4455c;

    /* JADX INFO: renamed from: d */
    public boolean f4456d = false;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0474m6 f4457e;

    public C0719ss(C0474m6 c0474m6, int i) {
        this.f4457e = c0474m6;
        this.f4453a = i;
        this.f4454b = c0474m6.m1789d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4455c < this.f4454b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM1787b = this.f4457e.m1787b(this.f4455c, this.f4453a);
        this.f4455c++;
        this.f4456d = true;
        return objM1787b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4456d) {
            throw new IllegalStateException();
        }
        int i = this.f4455c - 1;
        this.f4455c = i;
        this.f4454b--;
        this.f4456d = false;
        this.f4457e.m1792g(i);
    }
}
