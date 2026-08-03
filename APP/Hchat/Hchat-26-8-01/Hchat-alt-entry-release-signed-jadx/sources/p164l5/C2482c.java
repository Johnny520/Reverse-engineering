package p164l5;

import androidx.lifecycle.C0119x;
import p074f5.EnumC1070f;
import p150k5.C2270u;
import p283t5.InterfaceC4123f;

/* JADX INFO: renamed from: l5.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2482c extends AbstractC2479a0 implements InterfaceC4123f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8125d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2482c(C2270u c2270u, EnumC1070f enumC1070f, int i9, int i10) {
        super(c2270u, enumC1070f, i9);
        this.f8125d = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4123f
    /* JADX INFO: renamed from: l */
    public final int mo5882l() {
        switch (this.f8125d) {
            case 0:
                C0119x c0119x = this.f8116a.f7532b;
                return ((byte[]) c0119x.f310h)[this.f8118c + 1];
            case 1:
                return this.f8116a.f7532b.m582M(this.f8118c + 2);
            default:
                return this.f8116a.f7532b.m579J(this.f8118c + 2);
        }
    }
}
