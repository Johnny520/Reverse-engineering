package androidx.lifecycle;

import kotlinx.coroutines.InterfaceC5452;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2399 f7041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2411 f7042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Lifecycle$State f7043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2402 f7044;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.飘花落叶言子世苏楪兰哲, androidx.lifecycle.飘花落叶言子楪兰哲世苏] */
    public C2400(AbstractC2402 abstractC2402, Lifecycle$State lifecycle$State, C2411 c2411, final InterfaceC5452 interfaceC5452) {
        abstractC2402.getClass();
        lifecycle$State.getClass();
        c2411.getClass();
        this.f7044 = abstractC2402;
        this.f7043 = lifecycle$State;
        this.f7042 = c2411;
        ?? r3 = new InterfaceC2380() { // from class: androidx.lifecycle.飘花落叶言子楪兰哲世苏
            @Override // androidx.lifecycle.InterfaceC2380
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
                Lifecycle$State lifecycle$State2 = ((C2386) interfaceC2388.getLifecycle()).f7019;
                Lifecycle$State lifecycle$State3 = Lifecycle$State.DESTROYED;
                C2400 c2400 = this.f7040;
                if (lifecycle$State2 == lifecycle$State3) {
                    interfaceC5452.mo10256(null);
                    c2400.m4513();
                    return;
                }
                int iCompareTo = ((C2386) interfaceC2388.getLifecycle()).f7019.compareTo(c2400.f7043);
                C2411 c24112 = c2400.f7042;
                if (iCompareTo < 0) {
                    c24112.f7051 = true;
                    return;
                }
                if (c24112.f7051) {
                    if (c24112.f7049) {
                        C5925.m11311("Cannot resume a finished dispatcher");
                    } else {
                        c24112.f7051 = false;
                        c24112.m4515();
                    }
                }
            }
        };
        this.f7041 = r3;
        if (((C2386) abstractC2402).f7019 != Lifecycle$State.DESTROYED) {
            abstractC2402.mo4503(r3);
        } else {
            interfaceC5452.mo10256(null);
            m4513();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4513() {
        this.f7044.mo4502(this.f7041);
        C2411 c2411 = this.f7042;
        c2411.f7049 = true;
        c2411.m4515();
    }
}
