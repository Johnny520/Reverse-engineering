package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class j70 extends oe0 implements InterfaceC0775tq {

    /* JADX INFO: renamed from: r */
    public l70 f2767r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0775tq
    /* JADX INFO: renamed from: B */
    public final void mo1679B(d60 d60Var) {
        ArrayList arrayList = this.f2767r.f3378h;
        if (arrayList.size() <= 0) {
            d60Var.m648a();
        } else {
            AbstractC0748t1.m4160r(arrayList.get(0));
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j70) && p30.m3002l(this.f2767r, ((j70) obj).f2767r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2767r.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: o0 */
    public final void mo656o0() {
        this.f2767r.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
        l70 l70Var = this.f2767r;
        l70Var.m1981c();
        l70Var.f3372b = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f2767r + ')';
    }
}
