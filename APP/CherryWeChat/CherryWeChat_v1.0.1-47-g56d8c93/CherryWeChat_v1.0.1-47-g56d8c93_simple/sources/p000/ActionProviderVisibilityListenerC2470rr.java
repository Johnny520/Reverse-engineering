package p000;

import android.view.ActionProvider;

/* JADX INFO: renamed from: rr */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC2470rr implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public C1017Xm f8694a;

    /* JADX INFO: renamed from: b */
    public final ActionProvider f8695b;

    public ActionProviderVisibilityListenerC2470rr(MenuItemC2599ur r1, ActionProvider r2) {
        this.f8695b = r2;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean r2) {
        C1017Xm r22 = this.f8694a;
        if (r22 == null) goto L6;
        MenuC2204lr r23 = ((C2427qr) r22.f3226b).f8505n;
        r23.f7667h = true;
        r23.m4435p(true);
        return;
    }
}
