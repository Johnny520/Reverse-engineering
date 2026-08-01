package defpackage;

/* JADX INFO: renamed from: ᛶᛴᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1064 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f4714;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public android.graphics.Paint f4715;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public android.graphics.Rect f4716;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int f4717;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f4718;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f4719;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0241 f4720;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public boolean f4721;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f4722;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f4723;

    public C1064(defpackage.C0241 r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f4723 = r0
            r0 = -1
            r1.f4717 = r0
            r1.f4720 = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.f4722
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r5.f4721
            if (r0 == 0) goto L28
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            android.graphics.Rect r2 = r5.getBounds()
            android.graphics.Rect r3 = r5.f4716
            if (r3 != 0) goto L20
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r5.f4716 = r3
        L20:
            r4 = 119(0x77, float:1.67E-43)
            android.view.Gravity.apply(r4, r0, r1, r2, r3)
            r0 = 0
            r5.f4721 = r0
        L28:
            ᛲᛱᲀᲈ r0 = r5.f4720
            ᛲᲀᲁᛲ r0 = r0.f1435
            ᛱᲁᲇᛵ r1 = r0.f1820
            if (r1 == 0) goto L33
            android.graphics.Bitmap r0 = r1.f1259
            goto L35
        L33:
            android.graphics.Bitmap r0 = r0.f1819
        L35:
            android.graphics.Rect r1 = r5.f4716
            if (r1 != 0) goto L40
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r5.f4716 = r1
        L40:
            android.graphics.Paint r2 = r5.f4715
            if (r2 != 0) goto L4c
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 2
            r2.<init>(r3)
            r5.f4715 = r2
        L4c:
            r5 = 0
            r6.drawBitmap(r0, r5, r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r0 = this;
            ᛲᛱᲀᲈ r0 = r0.f4720
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
            r0 = this;
            ᛲᛱᲀᲈ r0 = r0.f4720
            ᛲᲀᲁᛲ r0 = r0.f1435
            int r0 = r0.f1831
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
            r0 = this;
            ᛲᛱᲀᲈ r0 = r0.f4720
            ᛲᲀᲁᛲ r0 = r0.f1435
            int r0 = r0.f1821
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            r0 = -2
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
            r0 = this;
            boolean r0 = r0.f4719
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r1 = 1
            r0.f4721 = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.f4715
            if (r0 != 0) goto Lc
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 2
            r0.<init>(r1)
            r2.f4715 = r0
        Lc:
            r0.setAlpha(r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.f4715
            if (r0 != 0) goto Lc
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 2
            r0.<init>(r1)
            r2.f4715 = r0
        Lc:
            r0.setColorFilter(r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.f4722
            r0 = r0 ^ 1
            java.lang.String r1 = "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility."
            defpackage.C0292.m945(r1, r0)
            r3.f4723 = r4
            if (r4 != 0) goto L22
            r0 = 0
            r3.f4719 = r0
            ᛲᛱᲀᲈ r1 = r3.f4720
            ᛲᲀᲁᛲ r1 = r1.f1435
            java.util.ArrayList r2 = r1.f1825
            r2.remove(r3)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L29
            r1.f1830 = r0
            goto L29
        L22:
            boolean r0 = r3.f4718
            if (r0 == 0) goto L29
            r3.m2017()
        L29:
            boolean r3 = super.setVisible(r4, r5)
            return r3
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
            r1 = this;
            r0 = 1
            r1.f4718 = r0
            r0 = 0
            r1.f4714 = r0
            boolean r0 = r1.f4723
            if (r0 == 0) goto Ld
            r1.m2017()
        Ld:
            return
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
            r3 = this;
            r0 = 0
            r3.f4718 = r0
            r3.f4719 = r0
            ᛲᛱᲀᲈ r1 = r3.f4720
            ᛲᲀᲁᛲ r1 = r1.f1435
            java.util.ArrayList r2 = r1.f1825
            r2.remove(r3)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L16
            r1.f1830 = r0
        L16:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2017() {
            r4 = this;
            boolean r0 = r4.f4722
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request."
            defpackage.C0292.m945(r2, r0)
            ᛲᛱᲀᲈ r0 = r4.f4720
            ᛲᲀᲁᛲ r0 = r0.f1435
            ᛱᛷᛴᛷ r2 = r0.f1826
            ᲀᛷᛵᲈ r2 = r2.f1040
            int r2 = r2.f7607
            if (r2 != r1) goto L19
            r4.invalidateSelf()
            return
        L19:
            boolean r2 = r4.f4719
            if (r2 != 0) goto L50
            r4.f4719 = r1
            java.util.ArrayList r2 = r0.f1825
            boolean r3 = r0.f1827
            if (r3 != 0) goto L4b
            boolean r3 = r2.contains(r4)
            if (r3 != 0) goto L45
            boolean r3 = r2.isEmpty()
            r2.add(r4)
            if (r3 == 0) goto L41
            boolean r2 = r0.f1830
            if (r2 == 0) goto L39
            goto L41
        L39:
            r0.f1830 = r1
            r1 = 0
            r0.f1827 = r1
            r0.m1064()
        L41:
            r4.invalidateSelf()
            return
        L45:
            java.lang.String r4 = "Cannot subscribe twice in a row"
            defpackage.C2264.m3676(r4)
            return
        L4b:
            java.lang.String r4 = "Cannot subscribe to a cleared frame loader"
            defpackage.C2264.m3676(r4)
        L50:
            return
    }
}
