package androidx.core.view;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3062 extends AbstractC3049 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Window f6867;

    public AbstractC3062(Window window, C3075 c3075) {
        this.f6867 = window;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4661(int i) {
        View decorView = this.f6867.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4662(int i) {
        View decorView = this.f6867.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    @Override // androidx.core.view.AbstractC3049
    public void addOnControllableInsetsChangedListener(InterfaceC3050 interfaceC3050) {
    }

    @Override // androidx.core.view.AbstractC3049
    public void removeOnControllableInsetsChangedListener(InterfaceC3050 interfaceC3050) {
    }
}
