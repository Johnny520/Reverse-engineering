package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC1116e;
import androidx.lifecycle.InterfaceC1118g;
import p000a.InterfaceC0935y9;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC1118g {

    /* JADX INFO: renamed from: a */
    public static int f3608a;

    @Override // androidx.lifecycle.InterfaceC1118g
    /* JADX INFO: renamed from: a */
    public final void mo485a(InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar) {
        if (aVar != AbstractC1116e.a.ON_DESTROY) {
            return;
        }
        if (f3608a == 0) {
            try {
                f3608a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f3608a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f3608a == 1) {
            throw null;
        }
    }
}
