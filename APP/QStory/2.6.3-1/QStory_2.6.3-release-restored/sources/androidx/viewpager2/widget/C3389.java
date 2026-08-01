package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C3351;
import androidx.recyclerview.widget.InterfaceC3350;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3389 implements InterfaceC3350 {
    @Override // androidx.recyclerview.widget.InterfaceC3350
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5440(View view) {
        C3351 c3351 = (C3351) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c3351).width == -1 && ((ViewGroup.MarginLayoutParams) c3351).height == -1) {
            return;
        }
        C6755.m11870("Pages must fill the whole ViewPager2 (use match_parent)");
    }

    @Override // androidx.recyclerview.widget.InterfaceC3350
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5441(View view) {
    }
}
