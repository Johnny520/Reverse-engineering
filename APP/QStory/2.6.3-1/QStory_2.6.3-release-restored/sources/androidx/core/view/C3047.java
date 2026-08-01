package androidx.core.view;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.collection.C1130;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3047 extends AbstractC3049 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Window f6840;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1130 f6841;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowInsetsController f6842;

    public C3047(Window window, C3048 c3048, C3075 c3075) {
        WindowInsetsController insetsController = window.getInsetsController();
        this.f6841 = new C1130(0);
        this.f6842 = insetsController;
        this.f6840 = window;
    }

    @Override // androidx.core.view.AbstractC3049
    public void addOnControllableInsetsChangedListener(InterfaceC3050 interfaceC3050) {
        C1130 c1130 = this.f6841;
        if (c1130.containsKey(interfaceC3050)) {
            return;
        }
        WindowInsetsControllerOnControllableInsetsChangedListenerC3042 windowInsetsControllerOnControllableInsetsChangedListenerC3042 = new WindowInsetsControllerOnControllableInsetsChangedListenerC3042(this, 1);
        c1130.put(interfaceC3050, windowInsetsControllerOnControllableInsetsChangedListenerC3042);
        this.f6842.addOnControllableInsetsChangedListener(windowInsetsControllerOnControllableInsetsChangedListenerC3042);
    }

    @Override // androidx.core.view.AbstractC3049
    public void removeOnControllableInsetsChangedListener(InterfaceC3050 interfaceC3050) {
        WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerM4655 = AbstractC3059.m4655(this.f6841.remove(interfaceC3050));
        if (onControllableInsetsChangedListenerM4655 != null) {
            this.f6842.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerM4655);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4575(int i, int i2, boolean z) {
        Window window = this.f6840;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.f6842;
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

    @Override // androidx.core.view.AbstractC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo4573(boolean z) {
        m4575(8192, 8, z);
    }

    @Override // androidx.core.view.AbstractC3049
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo4574(boolean z) {
        m4575(16, 16, z);
    }
}
