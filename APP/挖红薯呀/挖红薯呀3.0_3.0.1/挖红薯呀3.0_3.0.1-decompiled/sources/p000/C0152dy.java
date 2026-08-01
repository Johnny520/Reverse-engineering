package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: dy */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0152dy implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public final w11 f1208d;

    /* JADX INFO: renamed from: e */
    public final int f1209e;

    /* JADX INFO: renamed from: f */
    public int f1210f;

    /* JADX INFO: renamed from: g */
    public final int f1211g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0152dy(w11 w11Var, int i, int i2) {
        this.f1208d = w11Var;
        this.f1209e = i2;
        this.f1210f = i;
        this.f1211g = w11Var.f6900k;
        if (w11Var.f6899j) {
            y11.m5203e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1210f < this.f1209e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        w11 w11Var = this.f1208d;
        int i = w11Var.f6900k;
        int i2 = this.f1211g;
        if (i != i2) {
            y11.m5203e();
        }
        int i3 = this.f1210f;
        this.f1210f = w11Var.f6893d[(i3 * 5) + 3] + i3;
        return new x11(w11Var, i3, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
