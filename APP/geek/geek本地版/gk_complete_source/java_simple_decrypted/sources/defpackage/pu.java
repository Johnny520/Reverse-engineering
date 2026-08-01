package defpackage;

import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class pu implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public l0 b;

    public pu(su r1, ActionProvider r2) {
        this.a = r2;
    }

    public final View a(ou r2) {
        return this.a.onCreateActionView(r2);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean r2) {
        l0 r22 = this.b;
        if (r22 == null) goto L6;
        ku r23 = ((ou) r22.b).n;
        r23.h = true;
        r23.p(true);
        return;
    }
}
