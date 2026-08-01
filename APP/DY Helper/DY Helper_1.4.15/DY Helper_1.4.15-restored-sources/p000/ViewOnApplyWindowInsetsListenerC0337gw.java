package p000;

/* JADX INFO: renamed from: gw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0337gw implements android.view.View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View r3, android.view.WindowInsets r4) {
            r2 = this;
            androidx.drawerlayout.widget.DrawerLayout r3 = (androidx.drawerlayout.widget.DrawerLayout) r3
            int r2 = r4.getSystemWindowInsetTop()
            r0 = 0
            r1 = 1
            if (r2 <= 0) goto Lc
            r2 = r1
            goto Ld
        Lc:
            r2 = r0
        Ld:
            r3.f1067 = r4
            r3.f1068 = r2
            if (r2 != 0) goto L1a
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            if (r2 != 0) goto L1a
            r0 = r1
        L1a:
            r3.setWillNotDraw(r0)
            r3.requestLayout()
            android.view.WindowInsets r2 = r4.consumeSystemWindowInsets()
            return r2
    }
}
