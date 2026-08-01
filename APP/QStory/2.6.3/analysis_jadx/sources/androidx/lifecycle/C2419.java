package androidx.lifecycle;

import androidx.fragment.app.C2335;
import p142.C7539;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2419 implements InterfaceC2380, AutoCloseable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2420 f7061;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7062;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f7063;

    public C2419(String str, C2420 c2420) {
        this.f7063 = str;
        this.f7061 = c2420;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4518(AbstractC2402 abstractC2402, C7539 c7539) {
        c7539.getClass();
        abstractC2402.getClass();
        if (this.f7062) {
            C5925.m11311("Already attached to lifecycleOwner");
            return;
        }
        this.f7062 = true;
        abstractC2402.mo4503(this);
        c7539.m12761(this.f7063, (C2335) this.f7061.f7064.f3619);
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.f7062 = false;
            interfaceC2388.getLifecycle().mo4502(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
