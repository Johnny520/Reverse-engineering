package androidx.activity;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.C3219;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import p160.C8379;
import p160.C8383;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0870 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f395 = AbstractC6019.m10773(new C0898(this, 2));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Runnable f396;

    public C0870(Runnable runnable) {
        this.f396 = runnable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m586(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        m587().f405.m13344(new C8383(onBackInvokedDispatcher, 0), 1);
        m587().f405.m13344(new C8383(onBackInvokedDispatcher, 1000000), 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0877 m587() {
        return (C0877) this.f395.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m588(AbstractC0881 abstractC0881, InterfaceC3221 interfaceC3221) {
        abstractC0881.getClass();
        final AbstractC3235 lifecycle = interfaceC3221.getLifecycle();
        if (((C3219) lifecycle).f7364 == Lifecycle$State.DESTROYED) {
            return;
        }
        C0882 c0882 = new C0882(abstractC0881, new C0880(abstractC0881, interfaceC3221));
        abstractC0881.f413.add(c0882);
        c0882.m630(false);
        C8379.m13342(m587().f405, c0882);
        final C0867 c0867 = new C0867(c0882, this, lifecycle);
        lifecycle.mo5063(c0867);
        abstractC0881.f411.add(new AutoCloseable() { // from class: androidx.activity.飘花落叶言子世苏哲兰楪
            @Override // java.lang.AutoCloseable
            public final void close() {
                lifecycle.mo5062(c0867);
            }
        });
    }
}
