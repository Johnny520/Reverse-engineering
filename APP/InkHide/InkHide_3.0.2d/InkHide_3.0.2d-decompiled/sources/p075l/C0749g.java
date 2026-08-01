package p075l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0749g implements Iterator {

    /* JADX INFO: renamed from: a */
    public final int f2538a;

    /* JADX INFO: renamed from: b */
    public int f2539b;

    /* JADX INFO: renamed from: c */
    public int f2540c;

    /* JADX INFO: renamed from: d */
    public boolean f2541d = false;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0743a f2542e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0749g(C0743a c0743a, int i2) {
        this.f2542e = c0743a;
        this.f2538a = i2;
        this.f2539b = c0743a.m1396d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2540c < this.f2539b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM1394b = this.f2542e.m1394b(this.f2540c, this.f2538a);
        this.f2540c++;
        this.f2541d = true;
        return objM1394b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2541d) {
            throw new IllegalStateException();
        }
        int i2 = this.f2540c - 1;
        this.f2540c = i2;
        this.f2539b--;
        this.f2541d = false;
        this.f2542e.m1399g(i2);
    }
}
