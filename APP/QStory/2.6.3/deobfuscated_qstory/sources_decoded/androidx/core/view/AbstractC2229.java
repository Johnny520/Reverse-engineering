package androidx.core.view;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2229 extends AbstractC2216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Window f6522;

    public AbstractC2229(Window window, C2242 c2242) {
        this.f6522 = window;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4101(int i) {
        View decorView = this.f6522.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4102(int i) {
        View decorView = this.f6522.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    @Override // androidx.core.view.AbstractC2216
    public void addOnControllableInsetsChangedListener(InterfaceC2217 interfaceC2217) {
    }

    @Override // androidx.core.view.AbstractC2216
    public void removeOnControllableInsetsChangedListener(InterfaceC2217 interfaceC2217) {
    }
}
