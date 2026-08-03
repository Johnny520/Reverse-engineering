package p314v7;

import p152k7.AbstractC2331a;
import p257r7.AbstractC3712b;
import p257r7.InterfaceC3723m;

/* JADX INFO: renamed from: v7.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4499h0 implements InterfaceC3723m {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14852g;

    /* JADX INFO: renamed from: h */
    public final AbstractC3712b f14853h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4499h0(AbstractC3712b abstractC3712b, int i9) {
        this.f14852g = i9;
        this.f14853h = abstractC3712b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3723m
    /* JADX INFO: renamed from: d */
    public final AbstractC2331a mo7733d(Class cls) {
        switch (this.f14852g) {
            case 0:
                AbstractC4501i0 abstractC4501i0 = (AbstractC4501i0) this.f14853h;
                return cls.isInstance(abstractC4501i0) ? abstractC4501i0 : abstractC4501i0.m5554v(cls);
            default:
                AbstractC4503j0 abstractC4503j0 = (AbstractC4503j0) this.f14853h;
                return cls.isInstance(abstractC4503j0) ? abstractC4503j0 : abstractC4503j0.m5554v(cls);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    public final int get() {
        switch (this.f14852g) {
            case 0:
                return ((AbstractC4501i0) this.f14853h).m8934N();
            default:
                return ((AbstractC4503j0) this.f14853h).mo8928O();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    /* JADX INFO: renamed from: k */
    public final void mo633k(int i9) {
        switch (this.f14852g) {
            case 0:
                AbstractC4501i0 abstractC4501i0 = (AbstractC4501i0) this.f14853h;
                boolean zM5538q = AbstractC2331a.m5538q(abstractC4501i0.f12076k, 2, 3);
                byte[] bArr = abstractC4501i0.f12076k;
                if (!zM5538q) {
                    AbstractC2331a.m5534D(bArr, 4, i9);
                } else {
                    AbstractC2331a.m5535E(bArr, 0, i9);
                }
                break;
            default:
                ((AbstractC4503j0) this.f14853h).mo8931X(i9);
                break;
        }
    }
}
