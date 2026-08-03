package p251r;

import gg.AbstractC1420p;
import gg.AbstractC1426v;
import mg.InterfaceC2839a;
import mg.InterfaceC2842d;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1854l2;

/* JADX INFO: renamed from: r.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3627l extends AbstractC1420p implements InterfaceC2842d, InterfaceC1220a {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f11695n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3627l(int i9, int i10, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i9);
        this.f11695n = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.AbstractC1408d
    /* JADX INFO: renamed from: e */
    public final InterfaceC2839a mo3816e() {
        AbstractC1426v.f4739a.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f11695n) {
            case 0:
                return ((InterfaceC1854l2) this.f4723h).getValue();
            default:
                return this.f4723h.getClass().getSimpleName();
        }
    }
}
