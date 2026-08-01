package androidx.lifecycle;

import kotlinx.coroutines.InterfaceC5451;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2399 f7040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2411 f7041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Lifecycle$State f7042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2402 f7043;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.飘花落叶言子世苏楪兰哲, androidx.lifecycle.飘花落叶言子楪兰哲世苏] */
    public C2400(AbstractC2402 abstractC2402, Lifecycle$State lifecycle$State, C2411 c2411, final InterfaceC5451 interfaceC5451) {
        abstractC2402.getClass();
        lifecycle$State.getClass();
        c2411.getClass();
        this.f7043 = abstractC2402;
        this.f7042 = lifecycle$State;
        this.f7041 = c2411;
        ?? r3 = new InterfaceC2380() { // from class: androidx.lifecycle.飘花落叶言子楪兰哲世苏
            @Override // androidx.lifecycle.InterfaceC2380
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
                Lifecycle$State lifecycle$State2 = ((C2386) interfaceC2388.getLifecycle()).f7018;
                Lifecycle$State lifecycle$State3 = Lifecycle$State.DESTROYED;
                C2400 c2400 = this.f7039;
                if (lifecycle$State2 == lifecycle$State3) {
                    interfaceC5451.mo10252(null);
                    c2400.m4503();
                    return;
                }
                int iCompareTo = ((C2386) interfaceC2388.getLifecycle()).f7018.compareTo(c2400.f7042);
                C2411 c24112 = c2400.f7041;
                if (iCompareTo < 0) {
                    c24112.f7050 = true;
                    return;
                }
                if (c24112.f7050) {
                    if (c24112.f7048) {
                        C5919.m11250("Cannot resume a finished dispatcher");
                    } else {
                        c24112.f7050 = false;
                        c24112.m4505();
                    }
                }
            }
        };
        this.f7040 = r3;
        if (((C2386) abstractC2402).f7018 != Lifecycle$State.DESTROYED) {
            abstractC2402.mo4493(r3);
        } else {
            interfaceC5451.mo10252(null);
            m4503();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4503() {
        this.f7043.mo4492(this.f7040);
        C2411 c2411 = this.f7041;
        c2411.f7048 = true;
        c2411.m4505();
    }
}
