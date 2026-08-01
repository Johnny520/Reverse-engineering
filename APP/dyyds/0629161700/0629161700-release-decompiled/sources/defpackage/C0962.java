package defpackage;

/* JADX INFO: renamed from: ᛵᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0962 extends defpackage.C0136 implements defpackage.InterfaceC1298 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1909 f4270;

    public C0962(defpackage.C1909 r2, android.content.Context r3) {
            r1 = this;
            r1.f4270 = r2
            r2 = 0
            r0 = 1711538209(0x66040021, float:1.5583869E23)
            r1.<init>(r3, r2, r0)
            r2 = 1
            r1.setClickable(r2)
            r1.setFocusable(r2)
            r3 = 0
            r1.setVisibility(r3)
            r1.setEnabled(r2)
            java.lang.CharSequence r2 = r1.getContentDescription()
            defpackage.AbstractC2137.m3557(r1, r2)
            ᛷᛲᛶᲀ r2 = new ᛷᛲᛶᲀ
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
            ᲁᲀᛴᛷ r2 = r2.f4270
            r2.m3342()
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

    @Override // defpackage.InterfaceC1298
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo13() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1298
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo15() {
            r0 = this;
            r0 = 0
            return r0
    }
}
