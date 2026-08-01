package p332;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import p217.AbstractC8705;

/* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AccessibilityManagerTouchExplorationStateChangeListenerC9498 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f24800;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8705 f24801;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24802;

    public /* synthetic */ AccessibilityManagerTouchExplorationStateChangeListenerC9498(AbstractC8705 abstractC8705, View view, int i) {
        this.f24802 = i;
        this.f24801 = abstractC8705;
        this.f24800 = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.f24802;
        View view = this.f24800;
        AbstractC8705 abstractC8705 = this.f24801;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) abstractC8705;
                if (z && hideBottomViewOnScrollBehavior.f10340 == 1) {
                    hideBottomViewOnScrollBehavior.m7562(view);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) abstractC8705;
                if (z && hideViewOnScrollBehavior.f10353 == 1) {
                    hideViewOnScrollBehavior.m7564(view);
                    break;
                }
                break;
        }
    }
}
