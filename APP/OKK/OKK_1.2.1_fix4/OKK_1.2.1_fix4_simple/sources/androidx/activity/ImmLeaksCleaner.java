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
    public final void mo981b(InterfaceC0541r r2, EnumC0535l r3) {
        if (r3 == EnumC0535l.ON_DESTROY) goto L6;
        return;
    L6:
        if (f1061a != 0) goto L10;
        f1061a = 2;     // Catch: NoSuchFieldException -> L14
        InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);     // Catch: NoSuchFieldException -> L14
        InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);     // Catch: NoSuchFieldException -> L14
        InputMethodManager.class.getDeclaredField("mH").setAccessible(true);     // Catch: NoSuchFieldException -> L14
        f1061a = 1;     // Catch: NoSuchFieldException -> L14
    L10:
        if (f1061a == 1) goto L13;
        return;
    L13:
        throw null;
    }
}
