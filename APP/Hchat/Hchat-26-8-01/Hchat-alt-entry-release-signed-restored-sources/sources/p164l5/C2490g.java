package p164l5;

import androidx.lifecycle.C0119x;
import p046d6.AbstractC0707d;
import p074f5.EnumC1070f;
import p150k5.C2270u;
import p283t5.InterfaceC4128k;

/* JADX INFO: renamed from: l5.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2490g extends AbstractC2479a0 implements InterfaceC4128k {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8130d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2490g(C2270u c2270u, EnumC1070f enumC1070f, int i9, int i10) {
        super(c2270u, enumC1070f, i9);
        this.f8130d = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4128k
    /* JADX INFO: renamed from: e */
    public final int mo5887e() {
        switch (this.f8130d) {
            case 0:
                C0119x c0119x = this.f8116a.f7532b;
                return AbstractC0707d.m1877d(((byte[]) c0119x.f310h)[this.f8118c + 1]);
            case 1:
                return this.f8116a.f7532b.m585P(this.f8118c + 2);
            default:
                return this.f8116a.f7532b.m585P(this.f8118c + 4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4124g
    /* JADX INFO: renamed from: h */
    public final int mo5885h() {
        switch (this.f8130d) {
            case 0:
                C0119x c0119x = this.f8116a.f7532b;
                return ((byte[]) c0119x.f310h)[this.f8118c + 1] & 15;
            case 1:
                return this.f8116a.f7532b.m584O(this.f8118c + 1);
            default:
                return this.f8116a.f7532b.m585P(this.f8118c + 2);
        }
    }
}
