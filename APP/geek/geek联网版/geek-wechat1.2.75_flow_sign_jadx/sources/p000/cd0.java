package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class cd0 extends AbstractC0498mu {

    /* JADX INFO: renamed from: a */
    public final Window f890a;

    public cd0(Window window, View view) {
        this.f890a = window;
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: E */
    public final void mo629E(boolean z) {
        if (!z) {
            m631J(16);
            return;
        }
        Window window = this.f890a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: F */
    public final void mo630F(boolean z) {
        if (!z) {
            m631J(8192);
            return;
        }
        Window window = this.f890a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: J */
    public final void m631J(int i) {
        View decorView = this.f890a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
