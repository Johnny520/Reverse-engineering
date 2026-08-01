package androidx.lifecycle;

import androidx.fragment.app.C2335;
import p142.C7538;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2419 implements InterfaceC2380, AutoCloseable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2420 f7060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7061;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f7062;

    public C2419(String str, C2420 c2420) {
        this.f7062 = str;
        this.f7060 = c2420;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4508(AbstractC2402 abstractC2402, C7538 c7538) {
        c7538.getClass();
        abstractC2402.getClass();
        if (this.f7061) {
            C5919.m11250("Already attached to lifecycleOwner");
            return;
        }
        this.f7061 = true;
        abstractC2402.mo4493(this);
        c7538.m12732(this.f7062, (C2335) this.f7060.f7063.f3618);
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.f7061 = false;
            interfaceC2388.getLifecycle().mo4492(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
