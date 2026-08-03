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

    public /* synthetic */ AccessibilityManagerTouchExplorationStateChangeListenerC2807zk(AbstractC0706Qb r1, View r2, int r3) {
        this.f9519a = r3;
        this.f9521c = r1;
        this.f9520b = r2;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r3) {
        switch(this.f9519a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        HideViewOnScrollBehavior r0 = (HideViewOnScrollBehavior) this.f9521c;
        if (r3 == true) goto L7;
        return;
    L7:
        if (r0.f4400j != 1) goto L17;
        r0.m2425s(this.f9520b);
        return;
    L17:
        return;
    L10:
        HideBottomViewOnScrollBehavior r02 = (HideBottomViewOnScrollBehavior) this.f9521c;
        if (r3 == true) goto L13;
        return;
    L13:
        if (r02.f4389j != 1) goto L19;
        r02.m2423r(this.f9520b);
        return;
    }
}
