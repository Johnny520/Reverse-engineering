package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3041 extends C3075 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public View f6834;

    @Override // androidx.core.view.C3075
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo4571() {
        View view = this.f6834;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.mo4571();
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        WindowInsetsControllerOnControllableInsetsChangedListenerC3042 windowInsetsControllerOnControllableInsetsChangedListenerC3042 = new WindowInsetsControllerOnControllableInsetsChangedListenerC3042(atomicBoolean, 0);
        windowInsetsController.addOnControllableInsetsChangedListener(windowInsetsControllerOnControllableInsetsChangedListenerC3042);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(windowInsetsControllerOnControllableInsetsChangedListenerC3042);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // androidx.core.view.C3075
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void mo4572() {
        View view = this.f6834;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.mo4572();
    }
}
