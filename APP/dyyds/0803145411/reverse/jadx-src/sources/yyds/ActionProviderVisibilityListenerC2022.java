package yyds;

import android.view.ActionProvider;

/* JADX INFO: renamed from: yyds.ᲀᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC2022 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ActionProvider f10095;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public C2014 f10096;

    public ActionProviderVisibilityListenerC2022(MenuItemC1806 menuItemC1806, ActionProvider actionProvider) {
        this.f10095 = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C2014 c2014 = this.f10096;
        if (c2014 != null) {
            MenuC0836 menuC0836 = ((C1148) c2014.f10074).f5276;
            menuC0836.f3839 = true;
            menuC0836.m1915(true);
        }
    }
}
