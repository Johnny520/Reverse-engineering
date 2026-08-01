package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.AbstractC3049;
import androidx.core.view.AbstractC3100;
import androidx.core.view.C3048;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0874 extends C0876 {
    @Override // androidx.activity.C0891
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo591(C0860 c0860, C0860 c08602, Window window, View view, boolean z, boolean z2) {
        c0860.getClass();
        c08602.getClass();
        window.getClass();
        view.getClass();
        AbstractC3100.m4790(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        AbstractC3049 abstractC3049 = new C3048(window, view).f6843;
        abstractC3049.mo4573(!z);
        abstractC3049.mo4574(!z2);
    }
}
