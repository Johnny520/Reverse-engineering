package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import defpackage.iq;
import defpackage.mq;
import defpackage.oq;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements mq {
    public static int a;

    @Override // defpackage.mq
    public final void b(oq r2, iq r3) {
        if (r3 == iq.ON_DESTROY) goto L6;
        return;
    L6:
        if (a != 0) goto L10;
        a = 2;     // Catch: NoSuchFieldException -> L14
        InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);     // Catch: NoSuchFieldException -> L14
        InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);     // Catch: NoSuchFieldException -> L14
        InputMethodManager.class.getDeclaredField("mH").setAccessible(true);     // Catch: NoSuchFieldException -> L14
        a = 1;     // Catch: NoSuchFieldException -> L14
    L10:
        if (a == 1) goto L13;
        return;
    L13:
        throw null;
    }
}
