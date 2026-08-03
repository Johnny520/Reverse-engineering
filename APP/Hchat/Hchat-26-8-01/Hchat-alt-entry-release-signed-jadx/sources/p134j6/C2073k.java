package p134j6;

import bsh.C0353j;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: j6.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2073k implements Iterator {

    /* JADX INFO: renamed from: g */
    public C2075m f6955g;

    /* JADX INFO: renamed from: h */
    public C2075m f6956h = null;

    /* JADX INFO: renamed from: i */
    public int f6957i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2076n f6958j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f6959k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2073k(C2076n c2076n, int i9) {
        this.f6959k = i9;
        this.f6958j = c2076n;
        this.f6955g = c2076n.f6977l.f6965j;
        this.f6957i = c2076n.f6976k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m5132a() {
        return m5133b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C2075m m5133b() {
        C2075m c2075m = this.f6955g;
        C2076n c2076n = this.f6958j;
        if (c2075m == c2076n.f6977l) {
            C0353j.m1307e();
            return null;
        }
        if (c2076n.f6976k != this.f6957i) {
            throw new ConcurrentModificationException();
        }
        this.f6955g = c2075m.f6965j;
        this.f6956h = c2075m;
        return c2075m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6955g != this.f6958j.f6977l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public Object next() {
        switch (this.f6959k) {
            case 1:
                return m5133b().f6967l;
            default:
                return m5132a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        C2075m c2075m = this.f6956h;
        if (c2075m == null) {
            throw new IllegalStateException();
        }
        C2076n c2076n = this.f6958j;
        c2076n.m5136d(c2075m, true);
        this.f6956h = null;
        this.f6957i = c2076n.f6976k;
    }
}
