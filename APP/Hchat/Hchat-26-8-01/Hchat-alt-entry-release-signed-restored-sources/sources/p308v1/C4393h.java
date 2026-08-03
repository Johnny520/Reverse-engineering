package p308v1;

import p293u2.C4231a;
import p339x1.EnumC5620k1;
import p339x1.EnumC5623l1;

/* JADX INFO: renamed from: v1.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4393h implements InterfaceC4409m0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14634g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC4409m0 f14635h;

    /* JADX INFO: renamed from: i */
    public final Enum f14636i;

    /* JADX INFO: renamed from: j */
    public final Enum f14637j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4393h(InterfaceC4409m0 interfaceC4409m0, Enum r2, Enum r32, int i9) {
        this.f14634g = i9;
        this.f14635h = interfaceC4409m0;
        this.f14636i = r2;
        this.f14637j = r32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: G */
    public final int mo8829G(int i9) {
        switch (this.f14634g) {
        }
        return this.f14635h.mo8829G(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: M */
    public final int mo8830M(int i9) {
        switch (this.f14634g) {
        }
        return this.f14635h.mo8830M(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: Q */
    public final AbstractC4377b1 mo8831Q(long j3) {
        switch (this.f14634g) {
            case 0:
                EnumC4420q enumC4420q = (EnumC4420q) this.f14637j;
                EnumC4417p enumC4417p = (EnumC4417p) this.f14636i;
                EnumC4417p enumC4417p2 = EnumC4417p.f14703h;
                InterfaceC4409m0 interfaceC4409m0 = this.f14635h;
                if (enumC4420q == EnumC4420q.f14708g) {
                    return new C4396i(enumC4417p == enumC4417p2 ? interfaceC4409m0.mo8830M(C4231a.m8503g(j3)) : interfaceC4409m0.mo8829G(C4231a.m8503g(j3)), C4231a.m8499c(j3) ? C4231a.m8503g(j3) : 32767, 0);
                }
                return new C4396i(C4231a.m8500d(j3) ? C4231a.m8504h(j3) : 32767, enumC4417p == enumC4417p2 ? interfaceC4409m0.mo8832j(C4231a.m8504h(j3)) : interfaceC4409m0.mo8833p0(C4231a.m8504h(j3)), 0);
            case 1:
                EnumC4424r0 enumC4424r0 = (EnumC4424r0) this.f14637j;
                EnumC4421q0 enumC4421q0 = (EnumC4421q0) this.f14636i;
                EnumC4421q0 enumC4421q02 = EnumC4421q0.f14712h;
                InterfaceC4409m0 interfaceC4409m02 = this.f14635h;
                if (enumC4424r0 == EnumC4424r0.f14720g) {
                    return new C4396i(enumC4421q0 == enumC4421q02 ? interfaceC4409m02.mo8830M(C4231a.m8503g(j3)) : interfaceC4409m02.mo8829G(C4231a.m8503g(j3)), C4231a.m8499c(j3) ? C4231a.m8503g(j3) : 32767, 1);
                }
                return new C4396i(C4231a.m8500d(j3) ? C4231a.m8504h(j3) : 32767, enumC4421q0 == enumC4421q02 ? interfaceC4409m02.mo8832j(C4231a.m8504h(j3)) : interfaceC4409m02.mo8833p0(C4231a.m8504h(j3)), 1);
            default:
                EnumC5623l1 enumC5623l1 = (EnumC5623l1) this.f14637j;
                EnumC5620k1 enumC5620k1 = (EnumC5620k1) this.f14636i;
                EnumC5620k1 enumC5620k12 = EnumC5620k1.f22900h;
                InterfaceC4409m0 interfaceC4409m03 = this.f14635h;
                if (enumC5623l1 == EnumC5623l1.f22910g) {
                    return new C4396i(enumC5620k1 == enumC5620k12 ? interfaceC4409m03.mo8830M(C4231a.m8503g(j3)) : interfaceC4409m03.mo8829G(C4231a.m8503g(j3)), C4231a.m8499c(j3) ? C4231a.m8503g(j3) : 32767, 2);
                }
                return new C4396i(C4231a.m8500d(j3) ? C4231a.m8504h(j3) : 32767, enumC5620k1 == enumC5620k12 ? interfaceC4409m03.mo8832j(C4231a.m8504h(j3)) : interfaceC4409m03.mo8833p0(C4231a.m8504h(j3)), 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: X */
    public final Object mo8824X() {
        switch (this.f14634g) {
        }
        return this.f14635h.mo8824X();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: j */
    public final int mo8832j(int i9) {
        switch (this.f14634g) {
        }
        return this.f14635h.mo8832j(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: p0 */
    public final int mo8833p0(int i9) {
        switch (this.f14634g) {
        }
        return this.f14635h.mo8833p0(i9);
    }
}
