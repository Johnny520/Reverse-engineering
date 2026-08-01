package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.AbstractC2216;
import androidx.core.view.AbstractC2267;
import androidx.core.view.C2215;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0027 extends C0029 {
    @Override // androidx.activity.C0044
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo31(C0013 c0013, C0013 c00132, Window window, View view, boolean z, boolean z2) {
        c0013.getClass();
        c00132.getClass();
        window.getClass();
        view.getClass();
        AbstractC2267.m4230(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        AbstractC2216 abstractC2216 = new C2215(window, view).f6498;
        abstractC2216.mo4013(!z);
        abstractC2216.mo4014(!z2);
    }
}
