package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class xc0 extends AbstractC0273gt {

    /* JADX INFO: renamed from: a */
    public final Window f5157a;

    public xc0(Window window, View view) {
        this.f5157a = window;
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: B */
    public final void mo1318B(boolean z) {
        if (!z) {
            m2623I(16);
            return;
        }
        Window window = this.f5157a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: C */
    public final void mo1319C(boolean z) {
        if (!z) {
            m2623I(8192);
            return;
        }
        Window window = this.f5157a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: I */
    public final void m2623I(int i) {
        View decorView = this.f5157a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
