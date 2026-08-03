package p000;

import android.view.ActionProvider;

/* JADX INFO: renamed from: rr */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC2470rr implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public C1017Xm f8694a;

    /* JADX INFO: renamed from: b */
    public final ActionProvider f8695b;

    public ActionProviderVisibilityListenerC2470rr(MenuItemC2599ur menuItemC2599ur, ActionProvider actionProvider) {
        this.f8695b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C1017Xm c1017Xm = this.f8694a;
        if (c1017Xm != null) {
            MenuC2204lr menuC2204lr = ((C2427qr) c1017Xm.f3226b).f8505n;
            menuC2204lr.f7667h = true;
            menuC2204lr.m4435p(true);
        }
    }
}
