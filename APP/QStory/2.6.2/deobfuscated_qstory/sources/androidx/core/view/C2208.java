package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2208 extends C2242 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public View f6488;

    @Override // androidx.core.view.C2242
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo4001() {
        View view = this.f6488;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.mo4001();
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        WindowInsetsControllerOnControllableInsetsChangedListenerC2209 windowInsetsControllerOnControllableInsetsChangedListenerC2209 = new WindowInsetsControllerOnControllableInsetsChangedListenerC2209(atomicBoolean, 0);
        windowInsetsController.addOnControllableInsetsChangedListener(windowInsetsControllerOnControllableInsetsChangedListenerC2209);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(windowInsetsControllerOnControllableInsetsChangedListenerC2209);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // androidx.core.view.C2242
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void mo4002() {
        View view = this.f6488;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.mo4002();
    }
}
