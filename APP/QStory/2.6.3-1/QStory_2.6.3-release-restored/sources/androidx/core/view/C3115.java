package androidx.core.view;

import android.view.View;
import androidx.appcompat.widget.C1035;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3115 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WeakReference f6975;

    public C3115(View view) {
        this.f6975 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4828(float f) {
        View view = (View) this.f6975.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4829(InterfaceC3116 interfaceC3116) {
        View view = (View) this.f6975.get();
        if (view != null) {
            if (interfaceC3116 != null) {
                view.animate().setListener(new C1035(interfaceC3116, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4830(long j) {
        View view = (View) this.f6975.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4831() {
        View view = (View) this.f6975.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4832(float f) {
        View view = (View) this.f6975.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }
}
