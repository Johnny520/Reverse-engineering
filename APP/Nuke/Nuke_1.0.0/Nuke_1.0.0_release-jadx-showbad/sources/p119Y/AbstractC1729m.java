package p119Y;

import java.util.Iterator;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: Y.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1729m implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public Object[] f5981d = C1728l.f5976e.f5980d;

    /* JADX INFO: renamed from: e */
    public int f5982e;

    /* JADX INFO: renamed from: f */
    public int f5983f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3084a(Object[] objArr, int i5, int i6) {
        this.f5981d = objArr;
        this.f5982e = i5;
        this.f5983f = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5983f < this.f5982e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
