package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rr2 implements InterfaceC0035ay, Iterable, q41 {

    /* JADX INFO: renamed from: h */
    public final qr2 f9739h;

    /* JADX INFO: renamed from: i */
    public final int f9740i;

    /* JADX INFO: renamed from: j */
    public final int f9741j;

    public rr2(qr2 qr2Var, int i, int i2) {
        this.f9739h = qr2Var;
        this.f9740i = i;
        this.f9741j = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rr2)) {
            return false;
        }
        rr2 rr2Var = (rr2) obj;
        return rr2Var.f9740i == this.f9740i && rr2Var.f9741j == this.f9741j && rr2Var.f9739h == this.f9739h;
    }

    public final int hashCode() {
        return (this.f9739h.hashCode() * 31) + this.f9740i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        qr2 qr2Var = this.f9739h;
        if (qr2Var.f9139o != this.f9741j) {
            sr2.m4994f();
        }
        int i = this.f9740i;
        qr2Var.m4277f(i);
        return new dr0(qr2Var, i + 1, qr2Var.f9132h[(i * 5) + 3] + i);
    }
}
