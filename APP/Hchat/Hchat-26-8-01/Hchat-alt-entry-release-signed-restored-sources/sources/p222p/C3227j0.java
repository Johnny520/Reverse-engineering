package p222p;

import gg.AbstractC1416l;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: p.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3227j0 implements InterfaceC3268x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3252r1 f10304a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4233c f10305b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3227j0(InterfaceC3252r1 interfaceC3252r1, InterfaceC4233c interfaceC4233c) {
        this.f10304a = interfaceC3252r1;
        this.f10305b = interfaceC4233c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3268x0
    /* JADX INFO: renamed from: a */
    public final float mo6922a() {
        InterfaceC3252r1 interfaceC3252r1 = this.f10304a;
        InterfaceC4233c interfaceC4233c = this.f10305b;
        return interfaceC4233c.mo1599i0(interfaceC3252r1.mo6855b(interfaceC4233c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3268x0
    /* JADX INFO: renamed from: b */
    public final float mo6923b(EnumC4243m enumC4243m) {
        InterfaceC3252r1 interfaceC3252r1 = this.f10304a;
        InterfaceC4233c interfaceC4233c = this.f10305b;
        return interfaceC4233c.mo1599i0(interfaceC3252r1.mo6854a(interfaceC4233c, enumC4243m));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3268x0
    /* JADX INFO: renamed from: c */
    public final float mo6924c() {
        InterfaceC3252r1 interfaceC3252r1 = this.f10304a;
        InterfaceC4233c interfaceC4233c = this.f10305b;
        return interfaceC4233c.mo1599i0(interfaceC3252r1.mo6857d(interfaceC4233c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3268x0
    /* JADX INFO: renamed from: d */
    public final float mo6925d(EnumC4243m enumC4243m) {
        InterfaceC3252r1 interfaceC3252r1 = this.f10304a;
        InterfaceC4233c interfaceC4233c = this.f10305b;
        return interfaceC4233c.mo1599i0(interfaceC3252r1.mo6856c(interfaceC4233c, enumC4243m));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3227j0)) {
            return false;
        }
        C3227j0 c3227j0 = (C3227j0) obj;
        return AbstractC1416l.m3825a(this.f10304a, c3227j0.f10304a) && AbstractC1416l.m3825a(this.f10305b, c3227j0.f10305b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10305b.hashCode() + (this.f10304a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f10304a + ", density=" + this.f10305b + ')';
    }
}
