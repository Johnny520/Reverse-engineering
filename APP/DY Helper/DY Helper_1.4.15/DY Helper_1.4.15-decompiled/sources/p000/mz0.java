package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mz0 extends p000.AbstractC1154 implements android.view.ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: β */
    public p000.C0568n f7332;

    /* JADX INFO: renamed from: γ */
    public final android.view.ActionProvider f7333;

    public mz0(androidx.appcompat.view.menu.MenuItemC0027 r1, android.view.ActionProvider r2) {
            r0 = this;
            r0.<init>()
            r0.f7333 = r2
            return
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean r1) {
            r0 = this;
            n r0 = r0.f7332
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.f7336
            lz0 r0 = (p000.lz0) r0
            iz0 r0 = r0.f6866
            r1 = 1
            r0.f5258 = r1
            r0.m2836(r1)
        L10:
            return
    }
}
