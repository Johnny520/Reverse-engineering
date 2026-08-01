package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends defpackage.a4 implements defpackage.k1 {
    public final /* synthetic */ defpackage.j1 d;

    public i1(defpackage.j1 r2, android.content.Context r3) {
            r1 = this;
            r1.d = r2
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
            defpackage.l70.a(r1, r2)
            d1 r2 = new d1
            r2.<init>(r1, r1)
            r1.setOnTouchListener(r2)
            return
    }

    @Override // defpackage.k1
    public final boolean a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.k1
    public final boolean b() {
            r1 = this;
            r0 = 0
            return r0
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
            j1 r0 = r2.d
            r0.l()
            return r1
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int r5, int r6, int r7, int r8) {
            r4 = this;
            boolean r5 = super.setFrame(r5, r6, r7, r8)
            android.graphics.drawable.Drawable r6 = r4.getDrawable()
            android.graphics.drawable.Drawable r7 = r4.getBackground()
            if (r6 == 0) goto L3f
            if (r7 == 0) goto L3f
            int r6 = r4.getWidth()
            int r8 = r4.getHeight()
            int r0 = java.lang.Math.max(r6, r8)
            int r0 = r0 / 2
            int r1 = r4.getPaddingLeft()
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getPaddingTop()
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r6 = r6 + r1
            int r6 = r6 / 2
            int r8 = r8 + r2
            int r8 = r8 / 2
            int r1 = r6 - r0
            int r2 = r8 - r0
            int r6 = r6 + r0
            int r8 = r8 + r0
            defpackage.ch.f(r7, r1, r2, r6, r8)
        L3f:
            return r5
    }
}
