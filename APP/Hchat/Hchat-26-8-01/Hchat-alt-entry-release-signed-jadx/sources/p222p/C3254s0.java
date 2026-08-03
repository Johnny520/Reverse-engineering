package p222p;

import gg.AbstractC1416l;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: p.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3254s0 implements InterfaceC3252r1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3252r1 f10358a;

    /* JADX INFO: renamed from: b */
    public final int f10359b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3254s0(InterfaceC3252r1 interfaceC3252r1, int i9) {
        this.f10358a = interfaceC3252r1;
        this.f10359b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: a */
    public final int mo6854a(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m) {
        if (((enumC4243m == EnumC4243m.f13919g ? 4 : 1) & this.f10359b) != 0) {
            return this.f10358a.mo6854a(interfaceC4233c, enumC4243m);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: b */
    public final int mo6855b(InterfaceC4233c interfaceC4233c) {
        if ((this.f10359b & 32) != 0) {
            return this.f10358a.mo6855b(interfaceC4233c);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: c */
    public final int mo6856c(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m) {
        if (((enumC4243m == EnumC4243m.f13919g ? 8 : 2) & this.f10359b) != 0) {
            return this.f10358a.mo6856c(interfaceC4233c, enumC4243m);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: d */
    public final int mo6857d(InterfaceC4233c interfaceC4233c) {
        if ((this.f10359b & 16) != 0) {
            return this.f10358a.mo6857d(interfaceC4233c);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3254s0)) {
            return false;
        }
        C3254s0 c3254s0 = (C3254s0) obj;
        return AbstractC1416l.m3825a(this.f10358a, c3254s0.f10358a) && this.f10359b == c3254s0.f10359b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f10359b) + (this.f10358a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f10358a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i9 = AbstractC3208d.f10253h;
        int i10 = this.f10359b;
        if ((i10 & i9) == i9) {
            AbstractC3208d.m6888r(sb4, "Start");
        }
        int i11 = AbstractC3208d.f10255j;
        if ((i10 & i11) == i11) {
            AbstractC3208d.m6888r(sb4, "Left");
        }
        if ((i10 & 16) == 16) {
            AbstractC3208d.m6888r(sb4, "Top");
        }
        int i12 = AbstractC3208d.f10254i;
        if ((i10 & i12) == i12) {
            AbstractC3208d.m6888r(sb4, "End");
        }
        int i13 = AbstractC3208d.f10256k;
        if ((i10 & i13) == i13) {
            AbstractC3208d.m6888r(sb4, "Right");
        }
        if ((i10 & 32) == 32) {
            AbstractC3208d.m6888r(sb4, "Bottom");
        }
        sb3.append(sb4.toString());
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
