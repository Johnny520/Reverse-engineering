package defpackage;

/* JADX INFO: renamed from: ᛴᛱᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0603 implements android.view.View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f2987;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2988;

    public /* synthetic */ ViewOnLayoutChangeListenerC0603(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2987 = r1
            r0.f2988 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            int r2 = r0.f2987
            java.lang.Object r0 = r0.f2988
            switch(r2) {
                case 0: goto L63;
                default: goto L7;
            }
        L7:
            androidx.appcompat.widget.SearchView r0 = (androidx.appcompat.widget.SearchView) r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.f161
            android.view.View r2 = r0.f162
            int r3 = r2.getWidth()
            r4 = 1
            if (r3 <= r4) goto L62
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.view.View r4 = r0.f134
            int r4 = r4.getPaddingLeft()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r6 = defpackage.AbstractC1211.m2349(r0)
            boolean r0 = r0.f151
            if (r0 == 0) goto L3f
            r0 = 1711734825(0x66070029, float:1.593806E23)
            int r0 = r3.getDimensionPixelSize(r0)
            r7 = 1711734826(0x6607002a, float:1.5938063E23)
            int r3 = r3.getDimensionPixelSize(r7)
            int r3 = r3 + r0
            goto L40
        L3f:
            r3 = 0
        L40:
            android.graphics.drawable.Drawable r0 = r1.getDropDownBackground()
            r0.getPadding(r5)
            int r0 = r5.left
            if (r6 == 0) goto L4d
            int r0 = -r0
            goto L50
        L4d:
            int r0 = r0 + r3
            int r0 = r4 - r0
        L50:
            r1.setDropDownHorizontalOffset(r0)
            int r0 = r2.getWidth()
            int r2 = r5.left
            int r0 = r0 + r2
            int r2 = r5.right
            int r0 = r0 + r2
            int r0 = r0 + r3
            int r0 = r0 - r4
            r1.setDropDownWidth(r0)
        L62:
            return
        L63:
            android.view.View r1 = r1.getRootView()
            android.view.WindowInsets r1 = r1.getRootWindowInsets()
            ᲈᲈᛴᛶ r0 = (defpackage.ViewOnAttachStateChangeListenerC2367) r0
            java.lang.Object r2 = r0.f10245
            ᛱᛶᛴ r2 = (defpackage.C0112) r2
            if (r1 == 0) goto L87
            int r3 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f387
            r3 = 0
            ᲈᛸᛱᲀ r1 = defpackage.C2300.m3730(r3, r1)
            ᛷᛸᛳᛶ r3 = new ᛷᛸᛳᛶ
            java.lang.Object r0 = r0.f10246
            ᛷᛸᛳᛶ r0 = (defpackage.C1331) r0
            r3.<init>(r0)
            r2.m626(r1, r3)
            goto L89
        L87:
            int r0 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f387
        L89:
            return
    }
}
