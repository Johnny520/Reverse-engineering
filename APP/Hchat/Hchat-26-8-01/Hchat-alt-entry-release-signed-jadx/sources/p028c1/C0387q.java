package p028c1;

import gg.AbstractC1416l;
import p071f1.InterfaceC1026r0;
import p160l1.C2435d;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: c1.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0387q extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1026r0 f1078a;

    /* JADX INFO: renamed from: b */
    public final C2435d f1079b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0387q(InterfaceC1026r0 interfaceC1026r0, C2435d c2435d) {
        this.f1078a = interfaceC1026r0;
        this.f1079b = c2435d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0387q)) {
            return false;
        }
        C0387q c0387q = (C0387q) obj;
        return AbstractC1416l.m3825a(this.f1078a, c0387q.f1078a) && this.f1079b.equals(c0387q.f1079b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C0388r c0388r = new C0388r();
        c0388r.f1080u = this.f1078a;
        c0388r.f1081v = this.f1079b;
        return c0388r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C0388r c0388r = (C0388r) abstractC5852n;
        InterfaceC1026r0 interfaceC1026r0 = c0388r.f1080u;
        InterfaceC1026r0 interfaceC1026r02 = this.f1078a;
        boolean zM3825a = AbstractC1416l.m3825a(interfaceC1026r0, interfaceC1026r02);
        C2435d c2435d = this.f1079b;
        if (!zM3825a || !AbstractC1416l.m3825a(c0388r.f1081v, c2435d)) {
            c0388r.f1082w = null;
        }
        c0388r.f1080u = interfaceC1026r02;
        c0388r.f1081v = c2435d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1079b.hashCode() + (this.f1078a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.f1078a + ", shadow=" + this.f1079b + ')';
    }
}
