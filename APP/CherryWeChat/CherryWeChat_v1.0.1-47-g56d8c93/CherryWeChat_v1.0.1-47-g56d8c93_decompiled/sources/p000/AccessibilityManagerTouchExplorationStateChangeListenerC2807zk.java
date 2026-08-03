package p000;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: renamed from: zk */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AccessibilityManagerTouchExplorationStateChangeListenerC2807zk implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f9520b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0706Qb f9521c;

    public /* synthetic */ AccessibilityManagerTouchExplorationStateChangeListenerC2807zk(AbstractC0706Qb abstractC0706Qb, View view, int i) {
        this.f9519a = i;
        this.f9521c = abstractC0706Qb;
        this.f9520b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.f9519a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f9521c;
                if (z && hideBottomViewOnScrollBehavior.f4389j == 1) {
                    hideBottomViewOnScrollBehavior.m2423r(this.f9520b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f9521c;
                if (z && hideViewOnScrollBehavior.f4400j == 1) {
                    hideViewOnScrollBehavior.m2425s(this.f9520b);
                    break;
                }
                break;
        }
    }
}
