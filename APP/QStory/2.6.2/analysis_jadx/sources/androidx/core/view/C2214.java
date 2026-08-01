package androidx.core.view;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.collection.C0283;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2214 extends AbstractC2216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Window f6494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0283 f6495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowInsetsController f6496;

    public C2214(Window window, C2215 c2215, C2242 c2242) {
        WindowInsetsController insetsController = window.getInsetsController();
        this.f6495 = new C0283(0);
        this.f6496 = insetsController;
        this.f6494 = window;
    }

    @Override // androidx.core.view.AbstractC2216
    public void addOnControllableInsetsChangedListener(InterfaceC2217 interfaceC2217) {
        C0283 c0283 = this.f6495;
        if (c0283.containsKey(interfaceC2217)) {
            return;
        }
        WindowInsetsControllerOnControllableInsetsChangedListenerC2209 windowInsetsControllerOnControllableInsetsChangedListenerC2209 = new WindowInsetsControllerOnControllableInsetsChangedListenerC2209(this, 1);
        c0283.put(interfaceC2217, windowInsetsControllerOnControllableInsetsChangedListenerC2209);
        this.f6496.addOnControllableInsetsChangedListener(windowInsetsControllerOnControllableInsetsChangedListenerC2209);
    }

    @Override // androidx.core.view.AbstractC2216
    public void removeOnControllableInsetsChangedListener(InterfaceC2217 interfaceC2217) {
        WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerM4085 = AbstractC2226.m4085(this.f6495.remove(interfaceC2217));
        if (onControllableInsetsChangedListenerM4085 != null) {
            this.f6496.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerM4085);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4005(int i, int i2, boolean z) {
        Window window = this.f6494;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.f6496;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }

    @Override // androidx.core.view.AbstractC2216
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo4003(boolean z) {
        m4005(8192, 8, z);
    }

    @Override // androidx.core.view.AbstractC2216
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo4004(boolean z) {
        m4005(16, 16, z);
    }
}
