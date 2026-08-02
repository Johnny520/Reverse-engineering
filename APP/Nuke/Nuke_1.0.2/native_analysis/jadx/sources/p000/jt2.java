package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jt2 implements InterfaceC0035ay, Iterable, q41 {

    /* JADX INFO: renamed from: h */
    public final qr2 f5209h;

    /* JADX INFO: renamed from: i */
    public final int f5210i;

    /* JADX INFO: renamed from: j */
    public final w72 f5211j;

    public jt2(qr2 qr2Var, int i, io0 io0Var, w72 w72Var) {
        this.f5209h = qr2Var;
        this.f5210i = i;
        this.f5211j = w72Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jt2)) {
            return false;
        }
        jt2 jt2Var = (jt2) obj;
        return jt2Var.f5210i == this.f5210i && jt2Var.f5209h == this.f5209h && jt2Var.f5211j.equals(this.f5211j);
    }

    public final int hashCode() {
        return this.f5211j.hashCode() + ((this.f5209h.hashCode() + (this.f5210i * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b70(this.f5209h, this.f5210i, null, this.f5211j);
    }
}
