package p000;

/* JADX INFO: renamed from: d */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0194d implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2826;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f2827;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0194d(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2826 = r1
            r0.f2827 = r2
            r0.<init>()
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r4 = this;
            int r0 = r4.f2826
            switch(r0) {
                case 0: goto Lb0;
                case 1: goto L8b;
                case 2: goto L6c;
                case 3: goto L28;
                default: goto L5;
            }
        L5:
            java.lang.Object r4 = r4.f2827
            yz1 r4 = (p000.yz1) r4
            androidx.appcompat.widget.ι r0 = r4.f12899
            boolean r1 = r4.mo340()
            if (r1 == 0) goto L27
            boolean r1 = r0.f830
            if (r1 != 0) goto L27
            android.view.View r1 = r4.f12904
            if (r1 == 0) goto L24
            boolean r1 = r1.isShown()
            if (r1 != 0) goto L20
            goto L24
        L20:
            r0.mo342()
            goto L27
        L24:
            r4.dismiss()
        L27:
            return
        L28:
            java.lang.Object r4 = r4.f2827
            ie r4 = (p000.ViewOnKeyListenerC0393ie) r4
            java.util.ArrayList r0 = r4.f5047
            boolean r1 = r4.mo340()
            if (r1 == 0) goto L6b
            int r1 = r0.size()
            if (r1 <= 0) goto L6b
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            he r1 = (p000.C0356he) r1
            androidx.appcompat.widget.ι r1 = r1.f4703
            boolean r1 = r1.f830
            if (r1 != 0) goto L6b
            android.view.View r1 = r4.f5054
            if (r1 == 0) goto L68
            boolean r1 = r1.isShown()
            if (r1 != 0) goto L52
            goto L68
        L52:
            java.util.Iterator r4 = r0.iterator()
        L56:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r4.next()
            he r0 = (p000.C0356he) r0
            androidx.appcompat.widget.ι r0 = r0.f4703
            r0.mo342()
            goto L56
        L68:
            r4.dismiss()
        L6b:
            return
        L6c:
            java.lang.Object r4 = r4.f2827
            androidx.appcompat.widget.δ r4 = (androidx.appcompat.widget.C0031) r4
            androidx.appcompat.widget.AppCompatSpinner r0 = r4.f814
            boolean r1 = r0.isAttachedToWindow()
            if (r1 == 0) goto L87
            android.graphics.Rect r1 = r4.f812
            boolean r0 = r0.getGlobalVisibleRect(r1)
            if (r0 == 0) goto L87
            r4.m337()
            r4.mo342()
            goto L8a
        L87:
            r4.dismiss()
        L8a:
            return
        L8b:
            java.lang.Object r0 = r4.f2827
            androidx.appcompat.widget.AppCompatSpinner r0 = (androidx.appcompat.widget.AppCompatSpinner) r0
            x5 r1 = r0.getInternalPopup()
            boolean r1 = r1.mo5365()
            if (r1 != 0) goto La6
            x5 r1 = r0.f583
            int r2 = r0.getTextDirection()
            int r3 = r0.getTextAlignment()
            r1.mo334(r2, r3)
        La6:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto Laf
            r0.removeOnGlobalLayoutListener(r4)
        Laf:
            return
        Lb0:
            java.lang.Object r4 = r4.f2827
            androidx.appcompat.widget.ActivityChooserView r4 = (androidx.appcompat.widget.ActivityChooserView) r4
            boolean r0 = r4.m268()
            if (r0 == 0) goto Le0
            boolean r0 = r4.isShown()
            if (r0 != 0) goto Lc8
            androidx.appcompat.widget.θ r4 = r4.getListPopupWindow()
            r4.dismiss()
            goto Le0
        Lc8:
            androidx.appcompat.widget.θ r0 = r4.getListPopupWindow()
            r0.mo342()
            ｘ r4 = r4.f535
            if (r4 == 0) goto Le0
            androidx.appcompat.widget.γ r4 = r4.f13522
            if (r4 == 0) goto Le0
            tz0 r0 = r4.f794
            if (r0 == 0) goto Le0
            iz0 r4 = r4.f792
            r0.mo3079(r4)
        Le0:
            return
    }
}
