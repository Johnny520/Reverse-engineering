package p121i3;

import p024b9.AbstractC1061t;
import p136j3.InterfaceC3590a;
import p376zd.C10010p0;

/* JADX INFO: renamed from: i3.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3178h implements InterfaceC3175e {

    /* JADX INFO: renamed from: q */
    public final float f8455q;

    /* JADX INFO: renamed from: r */
    public final float f8456r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC3590a f8457s;

    public C3178h(float f10, float f11, InterfaceC3590a interfaceC3590a) {
        this.f8455q = f10;
        this.f8456r = f11;
        this.f8457s = interfaceC3590a;
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: a0 */
    public long mo1229a0(float f10) {
        return AbstractC3194x.m12113e(this.f8457s.mo12094a(f10));
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: c1 */
    public float mo1231c1() {
        return this.f8456r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3178h)) {
            return false;
        }
        C3178h c3178h = (C3178h) obj;
        return Float.compare(this.f8455q, c3178h.f8455q) == 0 && Float.compare(this.f8456r, c3178h.f8456r) == 0 && AbstractC1061t.m3842c(this.f8457s, c3178h.f8457s);
    }

    @Override // p121i3.InterfaceC3175e
    public float getDensity() {
        return this.f8455q;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f8455q) * 31) + Float.hashCode(this.f8456r)) * 31) + this.f8457s.hashCode();
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: m0 */
    public float mo1234m0(long j10) {
        if (C3195y.m12123g(C3193w.m12102g(j10), C3195y.f8493b.m12128b())) {
            return C3179i.m12003k(this.f8457s.mo12095b(C3193w.m12103h(j10)));
        }
        C10010p0.m38820a("Only Sp can convert to Px");
        return 0.0f;
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.f8455q + ", fontScale=" + this.f8456r + ", converter=" + this.f8457s + ')';
    }
}
