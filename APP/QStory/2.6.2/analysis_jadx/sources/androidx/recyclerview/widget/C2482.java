package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C2246;
import p155.C7606;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2482 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2485 f7433;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final RecyclerView f7434;

    public C2482(RecyclerView recyclerView) {
        this.f7434 = recyclerView;
        C2485 c2485 = this.f7433;
        if (c2485 != null) {
            this.f7433 = c2485;
        } else {
            this.f7433 = new C2485(this);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3581(View view, C7606 c7606) {
        this.f6546.onInitializeAccessibilityNodeInfo(view, c7606.f20635);
        RecyclerView recyclerView = this.f7434;
        if (recyclerView.m4692() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC2519 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f7591;
        layoutManager.mo4618(recyclerView2.f7230, recyclerView2.f7240, c7606);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo4187(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4187(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f7434.m4692()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo4667(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo4190(View view, int i, Bundle bundle) {
        if (super.mo4190(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f7434;
        if (recyclerView.m4692() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().mo4603(i, bundle);
    }
}
