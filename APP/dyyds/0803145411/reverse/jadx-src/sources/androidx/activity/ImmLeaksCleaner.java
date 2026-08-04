package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import yyds.EnumC0637;
import yyds.InterfaceC0657;
import yyds.InterfaceC2345;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0657 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int f33;

    @Override // yyds.InterfaceC0657
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
        if (enumC0637 != EnumC0637.ON_DESTROY) {
            return;
        }
        if (f33 == 0) {
            try {
                f33 = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f33 = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f33 == 1) {
            throw null;
        }
    }
}
