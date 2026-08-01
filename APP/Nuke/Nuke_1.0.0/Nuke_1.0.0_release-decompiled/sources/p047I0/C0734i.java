package p047I0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* JADX INFO: renamed from: I0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0734i implements InterfaceC0744l0 {

    /* JADX INFO: renamed from: a */
    public final C0737j f2311a;

    public C0734i(C0737j c0737j) {
        this.f2311a = c0737j;
    }

    /* JADX INFO: renamed from: a */
    public final void m1230a(C0741k0 c0741k0) {
        ClipboardManager clipboardManager = this.f2311a.f2315a;
        if (c0741k0 != null) {
            clipboardManager.setPrimaryClip(c0741k0.f2321a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
