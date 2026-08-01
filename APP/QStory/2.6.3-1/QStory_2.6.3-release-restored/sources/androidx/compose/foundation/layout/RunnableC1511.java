package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.appcompat.app.C0923;
import androidx.core.view.AbstractC3112;
import androidx.core.view.C3058;
import androidx.core.view.C3071;
import androidx.core.view.C3107;
import androidx.core.view.InterfaceC3038;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1511 extends AbstractC3112 implements Runnable, InterfaceC3038, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f2206;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f2207;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C3058 f2208;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1466 f2209;

    public RunnableC1511(C1466 c1466) {
        super(!c1466.f2093 ? 1 : 0);
        this.f2209 = c1466;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2207) {
            this.f2207 = false;
            this.f2206 = false;
            C3058 c3058 = this.f2208;
            if (c3058 != null) {
                C1466 c1466 = this.f2209;
                c1466.f2098.m1937(AbstractC1469.m1987(c3058.f6866.mo4612(8)));
                C1466.m1949(c1466, c3058);
                this.f2208 = null;
            }
        }
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final C3058 mo2025(C3058 c3058, List list) {
        C1466 c1466 = this.f2209;
        C1466.m1949(c1466, c3058);
        return c1466.f2093 ? C3058.f6865 : c3058;
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final void mo2026(C3107 c3107) {
        this.f2207 = true;
        this.f2206 = true;
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final C0923 mo2027(C3107 c3107, C0923 c0923) {
        this.f2207 = false;
        return c0923;
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final void mo2028(C3107 c3107) {
        this.f2207 = false;
        this.f2206 = false;
        C3058 c3058 = this.f2208;
        if (c3107.f6949.mo4816() > 0 && c3058 != null) {
            C3071 c3071 = c3058.f6866;
            C1466 c1466 = this.f2209;
            c1466.f2098.m1937(AbstractC1469.m1987(c3071.mo4612(8)));
            c1466.f2097.m1937(AbstractC1469.m1987(c3071.mo4612(8)));
            C1466.m1949(c1466, c3058);
        }
        this.f2208 = null;
    }

    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final C3058 mo863(View view, C3058 c3058) {
        this.f2208 = c3058;
        C1466 c1466 = this.f2209;
        C1453 c1453 = c1466.f2097;
        C3071 c3071 = c3058.f6866;
        c1453.m1937(AbstractC1469.m1987(c3071.mo4612(8)));
        if (this.f2207) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f2206) {
            c1466.f2098.m1937(AbstractC1469.m1987(c3071.mo4612(8)));
            C1466.m1949(c1466, c3058);
        }
        return c1466.f2093 ? C3058.f6865 : c3058;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
