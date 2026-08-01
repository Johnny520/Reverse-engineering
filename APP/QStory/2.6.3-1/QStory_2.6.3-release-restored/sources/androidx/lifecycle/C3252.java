package androidx.lifecycle;

import androidx.fragment.app.C3168;
import p158.C8368;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3252 implements InterfaceC3213, AutoCloseable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3253 f7406;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7407;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f7408;

    public C3252(String str, C3253 c3253) {
        this.f7408 = str;
        this.f7406 = c3253;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5078(AbstractC3235 abstractC3235, C8368 c8368) {
        c8368.getClass();
        abstractC3235.getClass();
        if (this.f7407) {
            C6755.m11870("Already attached to lifecycleOwner");
            return;
        }
        this.f7407 = true;
        abstractC3235.mo5063(this);
        c8368.m13320(this.f7408, (C3168) this.f7406.f7409.f3964);
    }

    @Override // androidx.lifecycle.InterfaceC3213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.f7407 = false;
            interfaceC3221.getLifecycle().mo5062(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
