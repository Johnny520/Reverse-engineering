package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.appcompat.app.C0076;
import androidx.core.view.AbstractC2279;
import androidx.core.view.C2225;
import androidx.core.view.C2238;
import androidx.core.view.C2274;
import androidx.core.view.InterfaceC2205;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0670 extends AbstractC2279 implements Runnable, InterfaceC2205, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f1860;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f1861;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2225 f1862;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0625 f1863;

    public RunnableC0670(C0625 c0625) {
        super(!c0625.f1747 ? 1 : 0);
        this.f1863 = c0625;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1861) {
            this.f1861 = false;
            this.f1860 = false;
            C2225 c2225 = this.f1862;
            if (c2225 != null) {
                C0625 c0625 = this.f1863;
                c0625.f1752.m1367(AbstractC0628.m1417(c2225.f6520.mo4042(8)));
                C0625.m1379(c0625, c2225);
                this.f1862 = null;
            }
        }
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final C2225 mo1455(C2225 c2225, List list) {
        C0625 c0625 = this.f1863;
        C0625.m1379(c0625, c2225);
        return c0625.f1747 ? C2225.f6519 : c2225;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final void mo1456(C2274 c2274) {
        this.f1861 = true;
        this.f1860 = true;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final C0076 mo1457(C2274 c2274, C0076 c0076) {
        this.f1861 = false;
        return c0076;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final void mo1458(C2274 c2274) {
        this.f1861 = false;
        this.f1860 = false;
        C2225 c2225 = this.f1862;
        if (c2274.f6603.mo4246() > 0 && c2225 != null) {
            C2238 c2238 = c2225.f6520;
            C0625 c0625 = this.f1863;
            c0625.f1752.m1367(AbstractC0628.m1417(c2238.mo4042(8)));
            c0625.f1751.m1367(AbstractC0628.m1417(c2238.mo4042(8)));
            C0625.m1379(c0625, c2225);
        }
        this.f1862 = null;
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final C2225 mo302(View view, C2225 c2225) {
        this.f1862 = c2225;
        C0625 c0625 = this.f1863;
        C0612 c0612 = c0625.f1751;
        C2238 c2238 = c2225.f6520;
        c0612.m1367(AbstractC0628.m1417(c2238.mo4042(8)));
        if (this.f1861) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f1860) {
            c0625.f1752.m1367(AbstractC0628.m1417(c2238.mo4042(8)));
            C0625.m1379(c0625, c2225);
        }
        return c0625.f1747 ? C2225.f6519 : c2225;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
