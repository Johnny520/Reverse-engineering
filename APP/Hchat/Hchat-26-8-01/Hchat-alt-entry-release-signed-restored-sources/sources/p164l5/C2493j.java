package p164l5;

import p074f5.EnumC1070f;
import p150k5.C2270u;
import p283t5.InterfaceC4124g;
import p283t5.InterfaceC4131n;

/* JADX INFO: renamed from: l5.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2493j extends AbstractC2479a0 implements InterfaceC4124g, InterfaceC4131n {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8131d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2493j(C2270u c2270u, EnumC1070f enumC1070f, int i9, int i10) {
        super(c2270u, enumC1070f, i9);
        this.f8131d = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4131n
    /* JADX INFO: renamed from: g */
    public final long mo5884g() {
        switch (this.f8131d) {
            case 0:
                return ((long) ((short) this.f8116a.f7532b.m582M(this.f8118c + 2))) << 48;
            default:
                return this.f8116a.f7532b.m580K(this.f8118c + 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4124g
    /* JADX INFO: renamed from: h */
    public final int mo5885h() {
        switch (this.f8131d) {
        }
        return this.f8116a.f7532b.m584O(this.f8118c + 1);
    }
}
