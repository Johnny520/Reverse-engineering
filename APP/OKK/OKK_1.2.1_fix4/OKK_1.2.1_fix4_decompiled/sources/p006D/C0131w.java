package p006D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: D.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0131w extends C0095d {

    /* JADX INFO: renamed from: c */
    public View f320c;

    /* JADX INFO: renamed from: d */
    public WindowInsetsController f321d;

    @Override // p006D.C0095d
    /* JADX INFO: renamed from: A */
    public final void mo338A() {
        View view = this.f320c;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f321d;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        } else {
            super.mo338A();
        }
    }
}
