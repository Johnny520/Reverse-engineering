package androidx.constraintlayout.widget;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7472 extends android.view.View {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f26418;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.view.View f26419;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f26420;

    public C7472(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = -1
            r1.f26418 = r2
            r2 = 0
            r1.f26419 = r2
            r0 = 4
            r1.f26420 = r0
            r1.m28747(r2)
            return
    }

    public C7472(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1
            r0.f26418 = r1
            r1 = 0
            r0.f26419 = r1
            r1 = 4
            r0.f26420 = r1
            r0.m28747(r2)
            return
    }

    public C7472(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.f26418 = r1
            r1 = 0
            r0.f26419 = r1
            r1 = 4
            r0.f26420 = r1
            r0.m28747(r2)
            return
    }

    public C7472(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1
            r0.f26418 = r1
            r1 = 0
            r0.f26419 = r1
            r1 = 4
            r0.f26420 = r1
            r0.m28747(r2)
            return
    }

    public android.view.View getContent() {
            r1 = this;
            android.view.View r0 = r1.f26419
            return r0
    }

    public int getEmptyVisibility() {
            r1 = this;
            int r0 = r1.f26420
            return r0
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            boolean r0 = r7.isInEditMode()
            if (r0 == 0) goto L68
            r0 = 223(0xdf, float:3.12E-43)
            r8.drawRGB(r0, r0, r0)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 210(0xd2, float:2.94E-43)
            r0.setARGB(r1, r2, r2, r2)
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            r2 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r2)
            r0.setTypeface(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r8.getClipBounds(r1)
            int r3 = r1.height()
            float r3 = (float) r3
            r0.setTextSize(r3)
            int r3 = r1.height()
            int r4 = r1.width()
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.LEFT
            r0.setTextAlign(r5)
            r5 = 1
            java.lang.String r6 = "?"
            r0.getTextBounds(r6, r2, r5, r1)
            float r2 = (float) r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            int r5 = r1.width()
            float r5 = (float) r5
            float r5 = r5 / r4
            float r2 = r2 - r5
            int r5 = r1.left
            float r5 = (float) r5
            float r2 = r2 - r5
            float r3 = (float) r3
            float r3 = r3 / r4
            int r5 = r1.height()
            float r5 = (float) r5
            float r5 = r5 / r4
            float r3 = r3 + r5
            int r1 = r1.bottom
            float r1 = (float) r1
            float r3 = r3 - r1
            r8.drawText(r6, r2, r3, r0)
        L68:
            return
    }

    public void setContentId(int r3) {
            r2 = this;
            int r0 = r2.f26418
            if (r0 != r3) goto L5
            return
        L5:
            android.view.View r0 = r2.f26419
            if (r0 == 0) goto L1a
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r2.f26419
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r0
            r0.f25976 = r1
            r0 = 0
            r2.f26419 = r0
        L1a:
            r2.f26418 = r3
            r0 = -1
            if (r3 == r0) goto L30
            android.view.ViewParent r0 = r2.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r3 = r0.findViewById(r3)
            if (r3 == 0) goto L30
            r0 = 8
            r3.setVisibility(r0)
        L30:
            return
    }

    public void setEmptyVisibility(int r1) {
            r0 = this;
            r0.f26420 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m28747(android.util.AttributeSet r5) {
            r4 = this;
            int r0 = r4.f26420
            super.setVisibility(r0)
            r0 = -1
            r4.f26418 = r0
            if (r5 == 0) goto L3e
            android.content.Context r0 = r4.getContext()
            int[] r1 = androidx.constraintlayout.widget.C7473.C7486.f28308
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L19:
            if (r1 >= r0) goto L3b
            int r2 = r5.getIndex(r1)
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28309
            if (r2 != r3) goto L2c
            int r3 = r4.f26418
            int r2 = r5.getResourceId(r2, r3)
            r4.f26418 = r2
            goto L38
        L2c:
            int r3 = androidx.constraintlayout.widget.C7473.C7486.f28310
            if (r2 != r3) goto L38
            int r3 = r4.f26420
            int r2 = r5.getInt(r2, r3)
            r4.f26420 = r2
        L38:
            int r1 = r1 + 1
            goto L19
        L3b:
            r5.recycle()
        L3e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m28748(androidx.constraintlayout.widget.ConstraintLayout r5) {
            r4 = this;
            android.view.View r5 = r4.f26419
            if (r5 != 0) goto L5
            return
        L5:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r5 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r5
            android.view.View r0 = r4.f26419
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r0
            Yue.ۥ۟ۧ۟ۢ r1 = r0.f25988
            r2 = 0
            r1.m7617(r2)
            Yue.ۥ۟ۧ۟ۢ r1 = r5.f25988
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = r1.m7516()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = Yue.C1517.EnumC1519.f4911
            if (r1 == r2) goto L2e
            Yue.ۥ۟ۧ۟ۢ r1 = r5.f25988
            Yue.ۥ۟ۧ۟ۢ r3 = r0.f25988
            int r3 = r3.m7544()
            r1.m7618(r3)
        L2e:
            Yue.ۥ۟ۧ۟ۢ r1 = r5.f25988
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = r1.m7541()
            if (r1 == r2) goto L41
            Yue.ۥ۟ۧ۟ۢ r5 = r5.f25988
            Yue.ۥ۟ۧ۟ۢ r1 = r0.f25988
            int r1 = r1.m7512()
            r5.m7588(r1)
        L41:
            Yue.ۥ۟ۧ۟ۢ r5 = r0.f25988
            r0 = 8
            r5.m7617(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m28749(androidx.constraintlayout.widget.ConstraintLayout r3) {
            r2 = this;
            int r0 = r2.f26418
            r1 = -1
            if (r0 != r1) goto L10
            boolean r0 = r2.isInEditMode()
            if (r0 != 0) goto L10
            int r0 = r2.f26420
            r2.setVisibility(r0)
        L10:
            int r0 = r2.f26418
            android.view.View r3 = r3.findViewById(r0)
            r2.f26419 = r3
            if (r3 == 0) goto L2c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r3 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r3
            r0 = 1
            r3.f25976 = r0
            android.view.View r3 = r2.f26419
            r0 = 0
            r3.setVisibility(r0)
            r2.setVisibility(r0)
        L2c:
            return
    }
}
