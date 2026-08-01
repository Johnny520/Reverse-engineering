package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class y20 implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public final int f7495d;

    /* JADX INFO: renamed from: e */
    public final int f7496e;

    /* JADX INFO: renamed from: f */
    public boolean f7497f;

    /* JADX INFO: renamed from: g */
    public int f7498g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y20(int i, int i2, int i3) {
        this.f7495d = i3;
        this.f7496e = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f7497f = z;
        this.f7498g = z ? i : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7497f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int nextInt() {
        int i = this.f7498g;
        if (i != this.f7496e) {
            this.f7498g = this.f7495d + i;
            return i;
        }
        if (this.f7497f) {
            this.f7497f = false;
            return i;
        }
        C0921xc.m5132m();
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
