package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C3079;
import p171.C8436;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3315 extends C3079 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3318 f7779;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final RecyclerView f7780;

    public C3315(RecyclerView recyclerView) {
        this.f7780 = recyclerView;
        C3318 c3318 = this.f7779;
        if (c3318 != null) {
            this.f7779 = c3318;
        } else {
            this.f7779 = new C3318(this);
        }
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4151(View view, C8436 c8436) {
        this.f6892.onInitializeAccessibilityNodeInfo(view, c8436.f20975);
        RecyclerView recyclerView = this.f7780;
        if (recyclerView.m5262() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC3352 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7937;
        layoutManager.mo5188(recyclerView2.f7576, recyclerView2.f7586, c8436);
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo4757(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4757(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f7780.m5262()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo5237(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo4760(View view, int i, Bundle bundle) {
        if (super.mo4760(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f7780;
        if (recyclerView.m5262() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().mo5173(i, bundle);
    }
}
