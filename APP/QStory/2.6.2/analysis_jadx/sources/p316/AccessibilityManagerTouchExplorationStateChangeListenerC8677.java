package p316;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import p201.AbstractC7875;

/* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AccessibilityManagerTouchExplorationStateChangeListenerC8677 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f24463;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7875 f24464;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24465;

    public /* synthetic */ AccessibilityManagerTouchExplorationStateChangeListenerC8677(AbstractC7875 abstractC7875, View view, int i) {
        this.f24465 = i;
        this.f24464 = abstractC7875;
        this.f24463 = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.f24465;
        View view = this.f24463;
        AbstractC7875 abstractC7875 = this.f24464;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) abstractC7875;
                if (z && hideBottomViewOnScrollBehavior.f9990 == 1) {
                    hideBottomViewOnScrollBehavior.m7016(view);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) abstractC7875;
                if (z && hideViewOnScrollBehavior.f10003 == 1) {
                    hideViewOnScrollBehavior.m7018(view);
                    break;
                }
                break;
        }
    }
}
