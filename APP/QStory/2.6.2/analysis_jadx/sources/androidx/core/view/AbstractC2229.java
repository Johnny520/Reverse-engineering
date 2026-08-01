package androidx.core.view;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2229 extends AbstractC2216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Window f6521;

    public AbstractC2229(Window window, C2242 c2242) {
        this.f6521 = window;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4091(int i) {
        View decorView = this.f6521.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4092(int i) {
        View decorView = this.f6521.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    @Override // androidx.core.view.AbstractC2216
    public void addOnControllableInsetsChangedListener(InterfaceC2217 interfaceC2217) {
    }

    @Override // androidx.core.view.AbstractC2216
    public void removeOnControllableInsetsChangedListener(InterfaceC2217 interfaceC2217) {
    }
}
