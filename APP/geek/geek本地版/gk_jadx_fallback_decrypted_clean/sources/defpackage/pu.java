package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pu implements android.view.ActionProvider.VisibilityListener {
    public final android.view.ActionProvider a;
    public defpackage.l0 b;

    public pu(defpackage.su r1, android.view.ActionProvider r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            return
    }

    public final android.view.View a(defpackage.ou r2) {
            r1 = this;
            android.view.ActionProvider r0 = r1.a
            android.view.View r2 = r0.onCreateActionView(r2)
            return r2
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean r2) {
            r1 = this;
            l0 r2 = r1.b
            if (r2 == 0) goto L10
            java.lang.Object r2 = r2.b
            ou r2 = (defpackage.ou) r2
            ku r2 = r2.n
            r0 = 1
            r2.h = r0
            r2.p(r0)
        L10:
            return
    }
}
