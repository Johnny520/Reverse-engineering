package p164l5;

import androidx.lifecycle.C0119x;
import p074f5.EnumC1070f;
import p150k5.C2270u;
import p283t5.InterfaceC4122e;
import p283t5.InterfaceC4124g;

/* JADX INFO: renamed from: l5.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2486e extends AbstractC2479a0 implements InterfaceC4124g, InterfaceC4122e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8128d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2486e(C2270u c2270u, EnumC1070f enumC1070f, int i9, int i10) {
        super(c2270u, enumC1070f, i9);
        this.f8128d = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4131n
    /* JADX INFO: renamed from: g */
    public final long mo5884g() {
        int iMo5886k;
        switch (this.f8128d) {
            case 0:
                iMo5886k = mo5886k();
                break;
            case 1:
                iMo5886k = mo5886k();
                break;
            case 2:
                iMo5886k = mo5886k();
                break;
            default:
                iMo5886k = mo5886k();
                break;
        }
        return iMo5886k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4124g
    /* JADX INFO: renamed from: h */
    public final int mo5885h() {
        switch (this.f8128d) {
            case 0:
                C0119x c0119x = this.f8116a.f7532b;
                break;
        }
        return this.f8116a.f7532b.m584O(this.f8118c + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4122e
    /* JADX INFO: renamed from: k */
    public final int mo5886k() {
        switch (this.f8128d) {
            case 0:
                C0119x c0119x = this.f8116a.f7532b;
                return (((byte[]) c0119x.f310h)[this.f8118c + 1] << 24) >> 28;
            case 1:
                return ((short) this.f8116a.f7532b.m582M(this.f8118c + 2)) << 16;
            case 2:
                return this.f8116a.f7532b.m582M(this.f8118c + 2);
            default:
                return this.f8116a.f7532b.m579J(this.f8118c + 2);
        }
    }
}
