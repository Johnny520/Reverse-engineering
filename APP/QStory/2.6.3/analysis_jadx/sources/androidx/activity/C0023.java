package androidx.activity;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import p144.C7550;
import p144.C7554;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0023 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f50 = AbstractC5187.m10214(new C0051(this, 2));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Runnable f51;

    public C0023(Runnable runnable) {
        this.f51 = runnable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m26(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        m27().f60.m12785(new C7554(onBackInvokedDispatcher, 0), 1);
        m27().f60.m12785(new C7554(onBackInvokedDispatcher, 1000000), 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0030 m27() {
        return (C0030) this.f50.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m28(AbstractC0034 abstractC0034, InterfaceC2388 interfaceC2388) {
        abstractC0034.getClass();
        final AbstractC2402 lifecycle = interfaceC2388.getLifecycle();
        if (((C2386) lifecycle).f7019 == Lifecycle$State.DESTROYED) {
            return;
        }
        C0035 c0035 = new C0035(abstractC0034, new C0033(abstractC0034, interfaceC2388));
        abstractC0034.f68.add(c0035);
        c0035.m70(false);
        C7550.m12783(m27().f60, c0035);
        final C0020 c0020 = new C0020(c0035, this, lifecycle);
        lifecycle.mo4503(c0020);
        abstractC0034.f66.add(new AutoCloseable() { // from class: androidx.activity.飘花落叶言子世苏哲兰楪
            @Override // java.lang.AutoCloseable
            public final void close() {
                lifecycle.mo4502(c0020);
            }
        });
    }
}
