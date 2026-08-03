package p222p;

import gg.AbstractC1416l;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: p.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3271z implements InterfaceC3252r1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3252r1 f10415a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3252r1 f10416b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3271z(InterfaceC3252r1 interfaceC3252r1, InterfaceC3252r1 interfaceC3252r12) {
        this.f10415a = interfaceC3252r1;
        this.f10416b = interfaceC3252r12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: a */
    public final int mo6854a(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m) {
        int iMo6854a = this.f10415a.mo6854a(interfaceC4233c, enumC4243m) - this.f10416b.mo6854a(interfaceC4233c, enumC4243m);
        if (iMo6854a < 0) {
            return 0;
        }
        return iMo6854a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: b */
    public final int mo6855b(InterfaceC4233c interfaceC4233c) {
        int iMo6855b = this.f10415a.mo6855b(interfaceC4233c) - this.f10416b.mo6855b(interfaceC4233c);
        if (iMo6855b < 0) {
            return 0;
        }
        return iMo6855b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: c */
    public final int mo6856c(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m) {
        int iMo6856c = this.f10415a.mo6856c(interfaceC4233c, enumC4243m) - this.f10416b.mo6856c(interfaceC4233c, enumC4243m);
        if (iMo6856c < 0) {
            return 0;
        }
        return iMo6856c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: d */
    public final int mo6857d(InterfaceC4233c interfaceC4233c) {
        int iMo6857d = this.f10415a.mo6857d(interfaceC4233c) - this.f10416b.mo6857d(interfaceC4233c);
        if (iMo6857d < 0) {
            return 0;
        }
        return iMo6857d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3271z)) {
            return false;
        }
        C3271z c3271z = (C3271z) obj;
        return c3271z.f10415a.equals(this.f10415a) && AbstractC1416l.m3825a(c3271z.f10416b, this.f10416b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10416b.hashCode() + (this.f10415a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f10415a + " - " + this.f10416b + ')';
    }
}
