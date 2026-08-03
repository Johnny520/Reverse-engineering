package p000a;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: a.qh */
/* JADX INFO: loaded from: classes.dex */
public class C0791qh extends C0772ph {
    @Override // p000a.C0726n9
    /* JADX INFO: renamed from: y */
    public final void mo1683y(boolean z) {
        if (!z) {
            m1813C(8192);
            return;
        }
        Window window = this.f3045b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }
}
