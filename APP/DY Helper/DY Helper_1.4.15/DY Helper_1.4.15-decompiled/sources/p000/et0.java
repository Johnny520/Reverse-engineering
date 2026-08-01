package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class et0 implements android.view.View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View r3, android.view.WindowInsets r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r0 = r2 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L11
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 != 0) goto L15
            goto L27
        L15:
            int r0 = android.view.WindowInsets.Type.navigationBars()
            android.graphics.Insets r0 = r4.getInsets(r0)
            if (r0 == 0) goto L22
            int r0 = r0.bottom
            goto L23
        L22:
            r0 = 0
        L23:
            int r1 = r2.bottomMargin
            if (r1 != r0) goto L28
        L27:
            return r4
        L28:
            r2.bottomMargin = r0
            r3.setLayoutParams(r2)
            return r4
    }
}
