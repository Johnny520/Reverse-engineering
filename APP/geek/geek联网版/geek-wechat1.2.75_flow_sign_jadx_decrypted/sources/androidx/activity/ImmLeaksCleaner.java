package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import p000.EnumC0494mq;
import p000.InterfaceC0642qq;
import p000.InterfaceC0716sq;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0642qq {

    /* JADX INFO: renamed from: a */
    public static int f141a;

    @Override // p000.InterfaceC0642qq
    /* JADX INFO: renamed from: b */
    public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
        if (enumC0494mq != EnumC0494mq.ON_DESTROY) {
            return;
        }
        if (f141a == 0) {
            try {
                f141a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f141a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f141a == 1) {
            throw null;
        }
    }
}
