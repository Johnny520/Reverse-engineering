package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import p000.EnumC0347iq;
import p000.InterfaceC0494mq;
import p000.InterfaceC0568oq;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0494mq {

    /* JADX INFO: renamed from: a */
    public static int f178a;

    @Override // p000.InterfaceC0494mq
    /* JADX INFO: renamed from: b */
    public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
        if (enumC0347iq != EnumC0347iq.ON_DESTROY) {
            return;
        }
        if (f178a == 0) {
            try {
                f178a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f178a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f178a == 1) {
            throw null;
        }
    }
}
