package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0478m;
import androidx.lifecycle.InterfaceC0482q;
import androidx.lifecycle.InterfaceC0484s;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0482q {

    /* JADX INFO: renamed from: a */
    public static int f872a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0482q
    /* JADX INFO: renamed from: c */
    public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
        if (enumC0478m != EnumC0478m.ON_DESTROY) {
            return;
        }
        if (f872a == 0) {
            try {
                f872a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f872a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f872a == 1) {
            throw null;
        }
    }
}
