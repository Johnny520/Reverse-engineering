package p000;

import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: renamed from: xu */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0906xu implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public final ActionProvider f5309a;

    /* JADX INFO: renamed from: b */
    public C0431l0 f5310b;

    public ActionProviderVisibilityListenerC0906xu(MenuItemC0045av menuItemC0045av, ActionProvider actionProvider) {
        this.f5309a = actionProvider;
    }

    /* JADX INFO: renamed from: a */
    public final View m2708a(C0869wu c0869wu) {
        return this.f5309a.onCreateActionView(c0869wu);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C0431l0 c0431l0 = this.f5310b;
        if (c0431l0 != null) {
            MenuC0646qu menuC0646qu = ((C0869wu) c0431l0.f2886b).f5125n;
            menuC0646qu.f3958h = true;
            menuC0646qu.m2172p(true);
        }
    }
}
