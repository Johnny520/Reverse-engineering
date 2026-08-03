package p028c1;

import gg.AbstractC1416l;
import p014b.C0126e;
import p071f1.InterfaceC1026r0;
import p160l1.C2433b;
import p160l1.C2435d;
import p339x1.AbstractC5618k;
import p339x1.C5610h0;
import p339x1.InterfaceC5624m;
import p339x1.InterfaceC5626m1;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: c1.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0388r extends AbstractC5852n implements InterfaceC5624m, InterfaceC5626m1 {

    /* JADX INFO: renamed from: u */
    public InterfaceC1026r0 f1080u;

    /* JADX INFO: renamed from: v */
    public C2435d f1081v;

    /* JADX INFO: renamed from: w */
    public C2433b f1082w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    public final void mo1326B(C5610h0 c5610h0) {
        C2433b c2433b;
        C2433b c2433b2 = this.f1082w;
        if (c2433b2 == null) {
            C0126e c0126eMo2556b = AbstractC5618k.m10165u(this).mo2556b();
            InterfaceC1026r0 interfaceC1026r0 = this.f1080u;
            C2435d c2435d = this.f1081v;
            c0126eMo2556b.getClass();
            C2433b c2433b3 = new C2433b(interfaceC1026r0, c2435d, c0126eMo2556b);
            this.f1082w = c2433b3;
            c2433b = c2433b3;
        } else {
            c2433b = c2433b2;
        }
        c2433b.m5471c(c5610h0, c5610h0.f22833g.mo4091a(), 1.0f, null);
        c5610h0.m10064e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5626m1
    /* JADX INFO: renamed from: C0 */
    public final void mo1327C0() {
        this.f1082w = null;
        AbstractC5618k.m10156l(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0388r)) {
            return false;
        }
        C0388r c0388r = (C0388r) obj;
        return AbstractC1416l.m3825a(this.f1080u, c0388r.f1080u) && AbstractC1416l.m3825a(this.f1081v, c0388r.f1081v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1081v.hashCode() + (this.f1080u.hashCode() * 31);
    }
}
