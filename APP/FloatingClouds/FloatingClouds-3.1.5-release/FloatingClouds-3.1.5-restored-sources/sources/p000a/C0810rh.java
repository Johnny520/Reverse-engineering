package p000a;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: a.rh */
/* JADX INFO: loaded from: classes.dex */
public final class C0810rh extends C0791qh {
    @Override // p000a.C0726n9
    /* JADX INFO: renamed from: x */
    public final void mo1682x(boolean z) {
        if (!z) {
            m1813C(16);
            return;
        }
        Window window = this.f3045b;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
