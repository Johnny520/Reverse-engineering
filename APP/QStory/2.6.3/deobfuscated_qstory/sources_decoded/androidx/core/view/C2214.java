package androidx.core.view;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.collection.C0283;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2214 extends AbstractC2216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Window f6495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0283 f6496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowInsetsController f6497;

    public C2214(Window window, C2215 c2215, C2242 c2242) {
        WindowInsetsController insetsController = window.getInsetsController();
        this.f6496 = new C0283(0);
        this.f6497 = insetsController;
        this.f6495 = window;
    }

    @Override // androidx.core.view.AbstractC2216
    public void addOnControllableInsetsChangedListener(InterfaceC2217 interfaceC2217) {
        C0283 c0283 = this.f6496;
        if (c0283.containsKey(interfaceC2217)) {
            return;
        }
        WindowInsetsControllerOnControllableInsetsChangedListenerC2209 windowInsetsControllerOnControllableInsetsChangedListenerC2209 = new WindowInsetsControllerOnControllableInsetsChangedListenerC2209(this, 1);
        c0283.put(interfaceC2217, windowInsetsControllerOnControllableInsetsChangedListenerC2209);
        this.f6497.addOnControllableInsetsChangedListener(windowInsetsControllerOnControllableInsetsChangedListenerC2209);
    }

    @Override // androidx.core.view.AbstractC2216
    public void removeOnControllableInsetsChangedListener(InterfaceC2217 interfaceC2217) {
        WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerM4095 = AbstractC2226.m4095(this.f6496.remove(interfaceC2217));
        if (onControllableInsetsChangedListenerM4095 != null) {
            this.f6497.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerM4095);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4015(int i, int i2, boolean z) {
        Window window = this.f6495;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.f6497;
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
    public void mo4013(boolean z) {
        m4015(8192, 8, z);
    }

    @Override // androidx.core.view.AbstractC2216
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo4014(boolean z) {
        m4015(16, 16, z);
    }
}
