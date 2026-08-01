package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m91 implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public Object[] f3889d = l91.f3393e.f3397d;

    /* JADX INFO: renamed from: e */
    public int f3890e;

    /* JADX INFO: renamed from: f */
    public int f3891f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2485a(Object[] objArr, int i, int i2) {
        this.f3889d = objArr;
        this.f3890e = i;
        this.f3891f = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3891f < this.f3890e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
