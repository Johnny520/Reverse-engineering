package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public final class h extends android.view.View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f874a;
    public android.view.View b;
    public int c;

    public android.view.View getContent() {
            r1 = this;
            android.view.View r0 = r1.b
            return r0
    }

    public int getEmptyVisibility() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r8) {
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
            float r5 = r5 + r3
            int r1 = r1.bottom
            float r1 = (float) r1
            float r5 = r5 - r1
            r8.drawText(r6, r2, r5, r0)
        L68:
            return
    }

    public void setContentId(int r3) {
            r2 = this;
            int r0 = r2.f874a
            if (r0 != r3) goto L5
            goto L30
        L5:
            android.view.View r0 = r2.b
            if (r0 == 0) goto L1a
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r2.b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.a) r0
            r0.a0 = r1
            r0 = 0
            r2.b = r0
        L1a:
            r2.f874a = r3
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
            r0.c = r1
            return
    }
}
