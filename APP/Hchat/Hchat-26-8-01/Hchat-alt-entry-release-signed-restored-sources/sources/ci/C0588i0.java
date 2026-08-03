package ci;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p144k.InterfaceC2226y0;
import p187n.C2857k;
import p222p.AbstractC3199a;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p339x1.InterfaceC5612i;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: ci.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C0588i0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C2857k f1834a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2226y0 f1835b;

    /* JADX INFO: renamed from: c */
    public final boolean f1836c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0588i0(C2857k c2857k, InterfaceC2226y0 interfaceC2226y0, boolean z9) {
        this.f1834a = c2857k;
        this.f1835b = interfaceC2226y0;
        this.f1836c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0588i0)) {
            return false;
        }
        C0588i0 c0588i0 = (C0588i0) obj;
        return AbstractC1416l.m3825a(this.f1834a, c0588i0.f1834a) && AbstractC1416l.m3825a(this.f1835b, c0588i0.f1835b) && this.f1836c == c0588i0.f1836c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C0594l0(this.f1834a, this.f1835b, this.f1836c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        boolean z9;
        C0594l0 c0594l0 = (C0594l0) abstractC5852n;
        c0594l0.getClass();
        C2857k c2857k = c0594l0.f1856C;
        C2857k c2857k2 = this.f1834a;
        boolean z10 = true;
        boolean z11 = false;
        if (AbstractC1416l.m3825a(c2857k, c2857k2)) {
            z9 = false;
        } else {
            c0594l0.m1612o1();
            c0594l0.f1856C = c2857k2;
            c0594l0.f1859w = c2857k2;
            z9 = true;
        }
        InterfaceC2226y0 interfaceC2226y0 = c0594l0.f1860x;
        InterfaceC2226y0 interfaceC2226y02 = this.f1835b;
        if (!AbstractC1416l.m3825a(interfaceC2226y0, interfaceC2226y02)) {
            c0594l0.f1860x = interfaceC2226y02;
            z9 = true;
        }
        boolean z12 = c0594l0.f1861y;
        boolean z13 = this.f1836c;
        if (z12 != z13) {
            if (!z13) {
                c0594l0.m1612o1();
            }
            AbstractC5618k.m10158n(c0594l0);
            c0594l0.f1861y = z13;
        }
        boolean z14 = c0594l0.f1857D;
        C2857k c2857k3 = c0594l0.f1856C;
        if (z14 == (c2857k3 == null && c0594l0.f1860x != null)) {
            z10 = z9;
        } else {
            if (c2857k3 == null && c0594l0.f1860x != null) {
                z11 = true;
            }
            c0594l0.f1857D = z11;
            if (z11 || c0594l0.f1854A != null) {
            }
        }
        if (z10) {
            InterfaceC5612i interfaceC5612i = c0594l0.f1854A;
            if (interfaceC5612i == null && c0594l0.f1857D) {
                return;
            }
            if (interfaceC5612i != null) {
                c0594l0.m10123l1(interfaceC5612i);
            }
            c0594l0.f1854A = null;
            c0594l0.m1613p1();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C2857k c2857k = this.f1834a;
        int iHashCode = (c2857k == null ? 0 : c2857k.hashCode()) * 31;
        InterfaceC2226y0 interfaceC2226y0 = this.f1835b;
        return AbstractC0921a.m2245h((iHashCode + (interfaceC2226y0 != null ? interfaceC2226y0.hashCode() : 0)) * 31, 961, this.f1836c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PressableElement(interactionSource=");
        sb2.append(this.f1834a);
        sb2.append(", indicationNodeFactory=");
        sb2.append(this.f1835b);
        sb2.append(", enabled=");
        return AbstractC3199a.m6840m(", role=null, delay=null)", sb2, this.f1836c);
    }
}
