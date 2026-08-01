package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class ActionMenuPresenter$OverflowMenuButton extends androidx.appcompat.widget.AppCompatImageView implements p000.InterfaceC1150 {

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ androidx.appcompat.widget.C0030 f517;

    public ActionMenuPresenter$OverflowMenuButton(androidx.appcompat.widget.C0030 r2, android.content.Context r3) {
            r1 = this;
            r1.f517 = r2
            r2 = 0
            r0 = 2130968607(0x7f04001f, float:1.7545872E38)
            r1.<init>(r3, r2, r0)
            r2 = 1
            r1.setClickable(r2)
            r1.setFocusable(r2)
            r3 = 0
            r1.setVisibility(r3)
            r1.setEnabled(r2)
            java.lang.CharSequence r2 = r1.getContentDescription()
            p000.c52.m1142(r1, r2)
            androidx.appcompat.widget.β r2 = new androidx.appcompat.widget.β
            r2.<init>(r1, r1)
            r1.setOnTouchListener(r2)
            return
    }

    @Override // android.view.View
    public final boolean performClick() {
            r2 = this;
            boolean r0 = super.performClick()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            r2.playSoundEffect(r0)
            androidx.appcompat.widget.γ r2 = r2.f517
            r2.m331()
            return r1
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int r4, int r5, int r6, int r7) {
            r3 = this;
            boolean r4 = super.setFrame(r4, r5, r6, r7)
            android.graphics.drawable.Drawable r5 = r3.getDrawable()
            android.graphics.drawable.Drawable r6 = r3.getBackground()
            if (r5 == 0) goto L3f
            if (r6 == 0) goto L3f
            int r5 = r3.getWidth()
            int r7 = r3.getHeight()
            int r0 = java.lang.Math.max(r5, r7)
            int r0 = r0 / 2
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r3.getPaddingTop()
            int r3 = r3.getPaddingBottom()
            int r2 = r2 - r3
            int r5 = r5 + r1
            int r5 = r5 / 2
            int r7 = r7 + r2
            int r7 = r7 / 2
            int r3 = r5 - r0
            int r1 = r7 - r0
            int r5 = r5 + r0
            int r7 = r7 + r0
            r6.setHotspotBounds(r3, r1, r5, r7)
        L3f:
            return r4
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: β */
    public final boolean mo233() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.InterfaceC1150
    /* JADX INFO: renamed from: γ */
    public final boolean mo234() {
            r0 = this;
            r0 = 0
            return r0
    }
}
