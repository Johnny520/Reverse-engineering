package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C2246;
import p155.C7607;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2482 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2485 f7434;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final RecyclerView f7435;

    public C2482(RecyclerView recyclerView) {
        this.f7435 = recyclerView;
        C2485 c2485 = this.f7434;
        if (c2485 != null) {
            this.f7434 = c2485;
        } else {
            this.f7434 = new C2485(this);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3591(View view, C7607 c7607) {
        this.f6547.onInitializeAccessibilityNodeInfo(view, c7607.f20630);
        RecyclerView recyclerView = this.f7435;
        if (recyclerView.m4702() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC2519 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7592;
        layoutManager.mo4628(recyclerView2.f7231, recyclerView2.f7241, c7607);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo4197(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4197(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f7435.m4702()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo4677(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo4200(View view, int i, Bundle bundle) {
        if (super.mo4200(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f7435;
        if (recyclerView.m4702() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().mo4613(i, bundle);
    }
}
