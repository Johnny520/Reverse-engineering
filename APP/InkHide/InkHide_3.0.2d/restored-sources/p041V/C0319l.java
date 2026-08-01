package p041V;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: V.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0319l implements Iterator {

    /* JADX INFO: renamed from: a */
    public C0321n f701a;

    /* JADX INFO: renamed from: b */
    public C0321n f702b = null;

    /* JADX INFO: renamed from: c */
    public int f703c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0322o f704d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f705e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0319l(C0322o c0322o, int i2) {
        this.f705e = i2;
        this.f704d = c0322o;
        this.f701a = c0322o.f723f.f711d;
        this.f703c = c0322o.f722e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m552a() {
        return m553b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0321n m553b() {
        C0321n c0321n = this.f701a;
        C0322o c0322o = this.f704d;
        if (c0321n == c0322o.f723f) {
            throw new NoSuchElementException();
        }
        if (c0322o.f722e != this.f703c) {
            throw new ConcurrentModificationException();
        }
        this.f701a = c0321n.f711d;
        this.f702b = c0321n;
        return c0321n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f701a != this.f704d.f723f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public Object next() {
        switch (this.f705e) {
            case 1:
                return m553b().f713f;
            default:
                return m552a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        C0321n c0321n = this.f702b;
        if (c0321n == null) {
            throw new IllegalStateException();
        }
        C0322o c0322o = this.f704d;
        c0322o.m556c(c0321n, true);
        this.f702b = null;
        this.f703c = c0322o.f722e;
    }
}
