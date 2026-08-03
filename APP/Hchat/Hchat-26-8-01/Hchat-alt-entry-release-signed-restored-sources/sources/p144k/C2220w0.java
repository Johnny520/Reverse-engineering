package p144k;

import gg.AbstractC1416l;
import p187n.C2857k;
import p339x1.AbstractC5658x0;
import p339x1.InterfaceC5612i;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: k.w0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C2220w0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final C2857k f7350a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2226y0 f7351b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2220w0(C2857k c2857k, InterfaceC2226y0 interfaceC2226y0) {
        this.f7350a = c2857k;
        this.f7351b = interfaceC2226y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2220w0)) {
            return false;
        }
        C2220w0 c2220w0 = (C2220w0) obj;
        return AbstractC1416l.m3825a(this.f7350a, c2220w0.f7350a) && AbstractC1416l.m3825a(this.f7351b, c2220w0.f7351b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        InterfaceC5612i interfaceC5612iMo1606a = this.f7351b.mo1606a(this.f7350a);
        C2223x0 c2223x0 = new C2223x0();
        c2223x0.f7363w = interfaceC5612iMo1606a;
        c2223x0.m10122k1(interfaceC5612iMo1606a);
        return c2223x0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C2223x0 c2223x0 = (C2223x0) abstractC5852n;
        InterfaceC5612i interfaceC5612iMo1606a = this.f7351b.mo1606a(this.f7350a);
        c2223x0.m10123l1(c2223x0.f7363w);
        c2223x0.f7363w = interfaceC5612iMo1606a;
        c2223x0.m10122k1(interfaceC5612iMo1606a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7351b.hashCode() + (this.f7350a.hashCode() * 31);
    }
}
