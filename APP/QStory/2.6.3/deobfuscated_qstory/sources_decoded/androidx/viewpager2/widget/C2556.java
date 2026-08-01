package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C2518;
import androidx.recyclerview.widget.InterfaceC2517;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2556 implements InterfaceC2517 {
    @Override // androidx.recyclerview.widget.InterfaceC2517
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo4880(View view) {
        C2518 c2518 = (C2518) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c2518).width == -1 && ((ViewGroup.MarginLayoutParams) c2518).height == -1) {
            return;
        }
        C5925.m11311("Pages must fill the whole ViewPager2 (use match_parent)");
    }

    @Override // androidx.recyclerview.widget.InterfaceC2517
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo4881(View view) {
    }
}
