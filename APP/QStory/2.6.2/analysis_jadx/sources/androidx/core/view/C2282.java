package androidx.core.view;

import android.view.View;
import androidx.appcompat.widget.C0188;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2282 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WeakReference f6629;

    public C2282(View view) {
        this.f6629 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4258(float f) {
        View view = (View) this.f6629.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4259(InterfaceC2283 interfaceC2283) {
        View view = (View) this.f6629.get();
        if (view != null) {
            if (interfaceC2283 != null) {
                view.animate().setListener(new C0188(interfaceC2283, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4260(long j) {
        View view = (View) this.f6629.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4261() {
        View view = (View) this.f6629.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4262(float f) {
        View view = (View) this.f6629.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }
}
