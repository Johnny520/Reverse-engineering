package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class er1 implements android.view.View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f3650;

    public er1(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.f3650 = r1
            return
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            androidx.appcompat.widget.SearchView r0 = r0.f3650
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.f671
            android.view.View r2 = r0.f650
            int r3 = r2.getWidth()
            r4 = 1
            if (r3 <= r4) goto L5f
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.view.View r5 = r0.f673
            int r5 = r5.getPaddingLeft()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            int r7 = r0.getLayoutDirection()
            r8 = 0
            if (r7 != r4) goto L28
            goto L29
        L28:
            r4 = r8
        L29:
            boolean r0 = r0.f665
            if (r0 == 0) goto L3d
            r0 = 2131165225(0x7f070029, float:1.7944661E38)
            int r0 = r3.getDimensionPixelSize(r0)
            r7 = 2131165226(0x7f07002a, float:1.7944663E38)
            int r3 = r3.getDimensionPixelSize(r7)
            int r8 = r3 + r0
        L3d:
            android.graphics.drawable.Drawable r0 = r1.getDropDownBackground()
            r0.getPadding(r6)
            int r0 = r6.left
            if (r4 == 0) goto L4a
            int r0 = -r0
            goto L4d
        L4a:
            int r0 = r0 + r8
            int r0 = r5 - r0
        L4d:
            r1.setDropDownHorizontalOffset(r0)
            int r0 = r2.getWidth()
            int r2 = r6.left
            int r0 = r0 + r2
            int r2 = r6.right
            int r0 = r0 + r2
            int r0 = r0 + r8
            int r0 = r0 - r5
            r1.setDropDownWidth(r0)
        L5f:
            return
    }
}
