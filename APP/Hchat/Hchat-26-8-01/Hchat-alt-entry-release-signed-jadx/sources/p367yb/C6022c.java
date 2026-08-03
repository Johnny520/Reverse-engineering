package p367yb;

import gg.AbstractC1416l;
import p071f1.InterfaceC1026r0;
import p085fg.InterfaceC1220a;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: yb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C6022c extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1026r0 f24461a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1220a f24462b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6022c(InterfaceC1026r0 interfaceC1026r0, InterfaceC1220a interfaceC1220a) {
        interfaceC1026r0.getClass();
        interfaceC1220a.getClass();
        this.f24461a = interfaceC1026r0;
        this.f24462b = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6022c)) {
            return false;
        }
        C6022c c6022c = (C6022c) obj;
        return AbstractC1416l.m3825a(this.f24461a, c6022c.f24461a) && AbstractC1416l.m3825a(this.f24462b, c6022c.f24462b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C6025f(this.f24461a, this.f24462b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C6025f c6025f = (C6025f) abstractC5852n;
        c6025f.getClass();
        InterfaceC1026r0 interfaceC1026r0 = this.f24461a;
        interfaceC1026r0.getClass();
        c6025f.f24468u = interfaceC1026r0;
        InterfaceC1220a interfaceC1220a = this.f24462b;
        interfaceC1220a.getClass();
        c6025f.f24469v = interfaceC1220a;
        AbstractC5618k.m10156l(c6025f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f24462b.hashCode() + (this.f24461a.hashCode() * 31);
    }
}
