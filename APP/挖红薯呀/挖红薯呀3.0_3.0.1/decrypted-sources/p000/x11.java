package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class x11 implements InterfaceC0804ui, Iterable, p40 {

    /* JADX INFO: renamed from: d */
    public final w11 f7233d;

    /* JADX INFO: renamed from: e */
    public final int f7234e;

    /* JADX INFO: renamed from: f */
    public final int f7235f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x11(w11 w11Var, int i, int i2) {
        this.f7233d = w11Var;
        this.f7234e = i;
        this.f7235f = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof x11)) {
            return false;
        }
        x11 x11Var = (x11) obj;
        return x11Var.f7234e == this.f7234e && x11Var.f7235f == this.f7235f && x11Var.f7233d == this.f7233d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f7233d.hashCode() * 31) + this.f7234e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        w11 w11Var = this.f7233d;
        if (w11Var.f6900k != this.f7235f) {
            y11.m5203e();
        }
        int i = this.f7234e;
        w11Var.m4832f(i);
        return new C0152dy(w11Var, i + 1, w11Var.f6893d[(i * 5) + 3] + i);
    }
}
