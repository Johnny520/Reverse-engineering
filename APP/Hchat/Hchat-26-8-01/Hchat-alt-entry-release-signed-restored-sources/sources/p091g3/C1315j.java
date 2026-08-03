package p091g3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0119x;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: g3.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1315j extends C0119x {

    /* JADX INFO: renamed from: i */
    public View f4384i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.C0119x
    /* JADX INFO: renamed from: b0 */
    public final void mo596b0() {
        View view = this.f4384i;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.mo596b0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v0, types: [g3.i] */
    @Override // androidx.lifecycle.C0119x
    /* JADX INFO: renamed from: y */
    public final void mo614y() {
        View view = this.f4384i;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.mo614y();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: g3.i
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i9) {
                atomicBoolean.set((i9 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r42);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r42);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }
}
