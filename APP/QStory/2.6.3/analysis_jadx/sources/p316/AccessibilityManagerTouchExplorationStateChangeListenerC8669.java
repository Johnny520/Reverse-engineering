package p316;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import p201.AbstractC7876;

/* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AccessibilityManagerTouchExplorationStateChangeListenerC8669 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f24455;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7876 f24456;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24457;

    public /* synthetic */ AccessibilityManagerTouchExplorationStateChangeListenerC8669(AbstractC7876 abstractC7876, View view, int i) {
        this.f24457 = i;
        this.f24456 = abstractC7876;
        this.f24455 = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.f24457;
        View view = this.f24455;
        AbstractC7876 abstractC7876 = this.f24456;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) abstractC7876;
                if (z && hideBottomViewOnScrollBehavior.f9995 == 1) {
                    hideBottomViewOnScrollBehavior.m7003(view);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) abstractC7876;
                if (z && hideViewOnScrollBehavior.f10008 == 1) {
                    hideViewOnScrollBehavior.m7005(view);
                    break;
                }
                break;
        }
    }
}
