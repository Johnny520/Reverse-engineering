package p000;

import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: renamed from: pu */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0610pu implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public final ActionProvider f3950a;

    /* JADX INFO: renamed from: b */
    public C0431l0 f3951b;

    public ActionProviderVisibilityListenerC0610pu(MenuItemC0721su menuItemC0721su, ActionProvider actionProvider) {
        this.f3950a = actionProvider;
    }

    /* JADX INFO: renamed from: a */
    public final View m2130a(C0572ou c0572ou) {
        return this.f3950a.onCreateActionView(c0572ou);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C0431l0 c0431l0 = this.f3951b;
        if (c0431l0 != null) {
            MenuC0424ku menuC0424ku = ((C0572ou) c0431l0.f2980b).f3599n;
            menuC0424ku.f2957h = true;
            menuC0424ku.m1723p(true);
        }
    }
}
