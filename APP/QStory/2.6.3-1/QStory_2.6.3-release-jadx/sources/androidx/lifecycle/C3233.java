package androidx.lifecycle;

import kotlinx.coroutines.InterfaceC6284;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3232 f7386;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3244 f7387;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Lifecycle$State f7388;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3235 f7389;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.飘花落叶言子世苏楪兰哲, androidx.lifecycle.飘花落叶言子楪兰哲世苏] */
    public C3233(AbstractC3235 abstractC3235, Lifecycle$State lifecycle$State, C3244 c3244, final InterfaceC6284 interfaceC6284) {
        abstractC3235.getClass();
        lifecycle$State.getClass();
        c3244.getClass();
        this.f7389 = abstractC3235;
        this.f7388 = lifecycle$State;
        this.f7387 = c3244;
        ?? r3 = new InterfaceC3213() { // from class: androidx.lifecycle.飘花落叶言子楪兰哲世苏
            @Override // androidx.lifecycle.InterfaceC3213
            /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
            public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
                Lifecycle$State lifecycle$State2 = ((C3219) interfaceC3221.getLifecycle()).f7364;
                Lifecycle$State lifecycle$State3 = Lifecycle$State.DESTROYED;
                C3233 c3233 = this.f7385;
                if (lifecycle$State2 == lifecycle$State3) {
                    interfaceC6284.mo10815(null);
                    c3233.m5073();
                    return;
                }
                int iCompareTo = ((C3219) interfaceC3221.getLifecycle()).f7364.compareTo(c3233.f7388);
                C3244 c32442 = c3233.f7387;
                if (iCompareTo < 0) {
                    c32442.f7396 = true;
                    return;
                }
                if (c32442.f7396) {
                    if (c32442.f7394) {
                        C6755.m11870("Cannot resume a finished dispatcher");
                    } else {
                        c32442.f7396 = false;
                        c32442.m5075();
                    }
                }
            }
        };
        this.f7386 = r3;
        if (((C3219) abstractC3235).f7364 != Lifecycle$State.DESTROYED) {
            abstractC3235.mo5063(r3);
        } else {
            interfaceC6284.mo10815(null);
            m5073();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5073() {
        this.f7389.mo5062(this.f7386);
        C3244 c3244 = this.f7387;
        c3244.f7394 = true;
        c3244.m5075();
    }
}
