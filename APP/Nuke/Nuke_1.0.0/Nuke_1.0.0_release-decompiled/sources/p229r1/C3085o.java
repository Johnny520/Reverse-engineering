package p229r1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
import p121Y1.C1753n;

/* JADX INFO: renamed from: r1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3085o extends C1753n {

    /* JADX INFO: renamed from: f */
    public View f9803f;

    /* JADX WARN: Type inference failed for: r4v0, types: [r1.n] */
    @Override // p121Y1.C1753n
    /* JADX INFO: renamed from: C */
    public final void mo3109C() {
        View view = this.f9803f;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.mo3109C();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: r1.n
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i5) {
                atomicBoolean.set((i5 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r4);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r4);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // p121Y1.C1753n
    /* JADX INFO: renamed from: K */
    public final void mo3114K() {
        View view = this.f9803f;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.mo3114K();
    }
}
