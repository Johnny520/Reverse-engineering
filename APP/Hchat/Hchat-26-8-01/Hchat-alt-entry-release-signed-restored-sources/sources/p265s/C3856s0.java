package p265s;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p174m.EnumC2640p1;
import p251r.C3621f;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: s.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C3856s0 extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1220a f12626a;

    /* JADX INFO: renamed from: b */
    public final C3621f f12627b;

    /* JADX INFO: renamed from: c */
    public final EnumC2640p1 f12628c;

    /* JADX INFO: renamed from: d */
    public final boolean f12629d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3856s0(InterfaceC1220a interfaceC1220a, C3621f c3621f, EnumC2640p1 enumC2640p1, boolean z9) {
        this.f12626a = interfaceC1220a;
        this.f12627b = c3621f;
        this.f12628c = enumC2640p1;
        this.f12629d = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3856s0)) {
            return false;
        }
        C3856s0 c3856s0 = (C3856s0) obj;
        return this.f12626a == c3856s0.f12626a && AbstractC1416l.m3825a(this.f12627b, c3856s0.f12627b) && this.f12628c == c3856s0.f12628c && this.f12629d == c3856s0.f12629d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C3864w0(this.f12626a, this.f12627b, this.f12628c, this.f12629d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C3864w0 c3864w0 = (C3864w0) abstractC5852n;
        c3864w0.f12659u = this.f12626a;
        c3864w0.f12660v = this.f12627b;
        EnumC2640p1 enumC2640p1 = c3864w0.f12661w;
        EnumC2640p1 enumC2640p12 = this.f12628c;
        if (enumC2640p1 != enumC2640p12) {
            c3864w0.f12661w = enumC2640p12;
            AbstractC5618k.m10158n(c3864w0);
        }
        boolean z9 = c3864w0.f12662x;
        boolean z10 = this.f12629d;
        if (z9 == z10) {
            return;
        }
        c3864w0.f12662x = z10;
        c3864w0.m8033k1();
        AbstractC5618k.m10158n(c3864w0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0921a.m2245h((this.f12628c.hashCode() + ((this.f12627b.hashCode() + (this.f12626a.hashCode() * 31)) * 31)) * 31, 31, this.f12629d);
    }
}
