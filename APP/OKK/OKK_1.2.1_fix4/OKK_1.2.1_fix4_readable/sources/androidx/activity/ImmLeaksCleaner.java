package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0535l;
import androidx.lifecycle.InterfaceC0539p;
import androidx.lifecycle.InterfaceC0541r;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0539p {

    /* JADX INFO: renamed from: a */
    public static int f1061a;

    @Override // androidx.lifecycle.InterfaceC0539p
    /* JADX INFO: renamed from: b */
    public final void mo981b(InterfaceC0541r interfaceC0541r, EnumC0535l enumC0535l) {
        if (enumC0535l != EnumC0535l.ON_DESTROY) {
            return;
        }
        if (f1061a == 0) {
            try {
                f1061a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f1061a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f1061a == 1) {
            throw null;
        }
    }
}
