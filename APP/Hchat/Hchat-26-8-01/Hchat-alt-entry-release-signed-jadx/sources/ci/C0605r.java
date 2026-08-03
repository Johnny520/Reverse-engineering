package ci;

import p012ah.C0086a;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;
import p339x1.AbstractC5618k;
import sh.AbstractC4013h0;

/* JADX INFO: renamed from: ci.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0605r implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1909g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0607s f1910h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0605r(C0607s c0607s, int i9) {
        this.f1909g = i9;
        this.f1910h = c0607s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f1909g) {
            case 0:
                if (AbstractC5618k.m10152h(this.f1910h, AbstractC4013h0.f13138a) == null) {
                    return null;
                }
                C0086a.m445d();
                return null;
            case 1:
                return (C0614z) AbstractC5618k.m10152h(this.f1910h, AbstractC0574b0.f1767a);
            default:
                AbstractC5618k.m10167w(this.f1910h).m10022U(false);
                return C3967n.f12976a;
        }
    }
}
