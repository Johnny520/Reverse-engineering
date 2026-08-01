package p068h;

import android.view.ActionProvider;
import android.view.View;
import p004C.C0066j;

/* JADX INFO: renamed from: h.p */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0597p implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public final ActionProvider f2086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC0601t f2087b;

    /* JADX INFO: renamed from: c */
    public C0066j f2088c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionProviderVisibilityListenerC0597p(MenuItemC0601t menuItemC0601t, ActionProvider actionProvider) {
        this.f2087b = menuItemC0601t;
        this.f2086a = actionProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final View m1201a(C0596o c0596o) {
        return this.f2086a.onCreateActionView(c0596o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C0066j c0066j = this.f2088c;
        if (c0066j != null) {
            MenuC0594m menuC0594m = ((C0596o) c0066j.f312c).f2073n;
            menuC0594m.f2037h = true;
            menuC0594m.m1189p(true);
        }
    }
}
