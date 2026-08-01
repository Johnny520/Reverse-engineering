package androidx.cardview.widget;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final int[] f220 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final android.graphics.Rect f221;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f222;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f223;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final android.graphics.Rect f224;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0682 f225;

    static {
            r0 = 16842801(0x1010031, float:2.3693695E-38)
            int[] r0 = new int[]{r0}
            androidx.cardview.widget.CardView.f220 = r0
            return
    }

    public CardView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CardView(android.content.Context r10, android.util.AttributeSet r11) {
            r9 = this;
            r0 = 1711538307(0x66040083, float:1.5584045E23)
            r9.<init>(r10, r11, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.f221 = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r9.f224 = r2
            ᛴᛵᲇᲇ r2 = new ᛴᛵᲇᲇ
            r2.<init>(r9)
            r9.f225 = r2
            int[] r3 = defpackage.AbstractC0596.f2974
            r4 = 1712259267(0x660f00c3, float:1.6882811E23)
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r3, r0, r4)
            r11 = 2
            boolean r0 = r10.hasValue(r11)
            r3 = 3
            r4 = 0
            if (r0 == 0) goto L32
            android.content.res.ColorStateList r11 = r10.getColorStateList(r11)
            goto L6b
        L32:
            android.content.Context r0 = r9.getContext()
            int[] r5 = androidx.cardview.widget.CardView.f220
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r5)
            int r5 = r0.getColor(r4, r4)
            r0.recycle()
            float[] r0 = new float[r3]
            android.graphics.Color.colorToHSV(r5, r0)
            r11 = r0[r11]
            r0 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 <= 0) goto L5c
            android.content.res.Resources r11 = r9.getResources()
            r0 = 1711669326(0x6606004e, float:1.5820068E23)
            int r11 = r11.getColor(r0)
            goto L67
        L5c:
            android.content.res.Resources r11 = r9.getResources()
            r0 = 1711669325(0x6606004d, float:1.5820066E23)
            int r11 = r11.getColor(r0)
        L67:
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
        L6b:
            r0 = 0
            float r3 = r10.getDimension(r3, r0)
            r5 = 4
            float r5 = r10.getDimension(r5, r0)
            r6 = 5
            float r0 = r10.getDimension(r6, r0)
            r6 = 7
            boolean r6 = r10.getBoolean(r6, r4)
            r9.f223 = r6
            r6 = 6
            r7 = 1
            boolean r6 = r10.getBoolean(r6, r7)
            r9.f222 = r6
            r6 = 8
            int r6 = r10.getDimensionPixelSize(r6, r4)
            r8 = 10
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.left = r8
            r8 = 12
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.top = r8
            r8 = 11
            int r8 = r10.getDimensionPixelSize(r8, r6)
            r1.right = r8
            r8 = 9
            int r6 = r10.getDimensionPixelSize(r8, r6)
            r1.bottom = r6
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb4
            r0 = r5
        Lb4:
            r10.getDimensionPixelSize(r4, r4)
            r10.getDimensionPixelSize(r7, r4)
            r10.recycle()
            ᛴᲀᛳᲇ r10 = new ᛴᲀᛳᲇ
            r10.<init>(r11, r3)
            r2.f3286 = r10
            r9.setBackgroundDrawable(r10)
            r9.setClipToOutline(r7)
            r9.setElevation(r5)
            defpackage.AbstractC0069.m522(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static /* synthetic */ void m82(androidx.cardview.widget.CardView r0, int r1, int r2, int r3, int r4) {
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public android.content.res.ColorStateList getCardBackgroundColor() {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f225
            java.lang.Object r0 = r0.f3286
            ᛴᲀᛳᲇ r0 = (defpackage.C0744) r0
            android.content.res.ColorStateList r0 = r0.f3505
            return r0
    }

    public float getCardElevation() {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f225
            java.lang.Object r0 = r0.f3285
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            float r0 = r0.getElevation()
            return r0
    }

    public int getContentPaddingBottom() {
            r0 = this;
            android.graphics.Rect r0 = r0.f221
            int r0 = r0.bottom
            return r0
    }

    public int getContentPaddingLeft() {
            r0 = this;
            android.graphics.Rect r0 = r0.f221
            int r0 = r0.left
            return r0
    }

    public int getContentPaddingRight() {
            r0 = this;
            android.graphics.Rect r0 = r0.f221
            int r0 = r0.right
            return r0
    }

    public int getContentPaddingTop() {
            r0 = this;
            android.graphics.Rect r0 = r0.f221
            int r0 = r0.top
            return r0
    }

    public float getMaxCardElevation() {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f225
            java.lang.Object r0 = r0.f3286
            ᛴᲀᛳᲇ r0 = (defpackage.C0744) r0
            float r0 = r0.f3508
            return r0
    }

    public boolean getPreventCornerOverlap() {
            r0 = this;
            boolean r0 = r0.f222
            return r0
    }

    public float getRadius() {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f225
            java.lang.Object r0 = r0.f3286
            ᛴᲀᛳᲇ r0 = (defpackage.C0744) r0
            float r0 = r0.f3511
            return r0
    }

    public boolean getUseCompatPadding() {
            r0 = this;
            boolean r0 = r0.f223
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            return
    }

    public void setCardBackgroundColor(int r4) {
            r3 = this;
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            ᛴᛵᲇᲇ r3 = r3.f225
            java.lang.Object r3 = r3.f3286
            ᛴᲀᛳᲇ r3 = (defpackage.C0744) r3
            if (r4 != 0) goto L14
            r3.getClass()
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L14:
            r3.f3505 = r4
            android.graphics.Paint r0 = r3.f3513
            int[] r1 = r3.getState()
            android.content.res.ColorStateList r2 = r3.f3505
            int r2 = r2.getDefaultColor()
            int r4 = r4.getColorForState(r1, r2)
            r0.setColor(r4)
            r3.invalidateSelf()
            return
    }

    public void setCardBackgroundColor(android.content.res.ColorStateList r4) {
            r3 = this;
            ᛴᛵᲇᲇ r3 = r3.f225
            java.lang.Object r3 = r3.f3286
            ᛴᲀᛳᲇ r3 = (defpackage.C0744) r3
            if (r4 != 0) goto L10
            r3.getClass()
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L10:
            r3.f3505 = r4
            android.graphics.Paint r0 = r3.f3513
            int[] r1 = r3.getState()
            android.content.res.ColorStateList r2 = r3.f3505
            int r2 = r2.getDefaultColor()
            int r4 = r4.getColorForState(r1, r2)
            r0.setColor(r4)
            r3.invalidateSelf()
            return
    }

    public void setCardElevation(float r1) {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f225
            java.lang.Object r0 = r0.f3285
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setElevation(r1)
            return
    }

    public void setMaxCardElevation(float r1) {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f225
            defpackage.AbstractC0069.m522(r0, r1)
            return
    }

    @Override // android.view.View
    public void setMinimumHeight(int r1) {
            r0 = this;
            super.setMinimumHeight(r1)
            return
    }

    @Override // android.view.View
    public void setMinimumWidth(int r1) {
            r0 = this;
            super.setMinimumWidth(r1)
            return
    }

    @Override // android.view.View
    public final void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void setPaddingRelative(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public void setPreventCornerOverlap(boolean r2) {
            r1 = this;
            boolean r0 = r1.f222
            if (r2 == r0) goto L11
            r1.f222 = r2
            ᛴᛵᲇᲇ r1 = r1.f225
            java.lang.Object r2 = r1.f3286
            ᛴᲀᛳᲇ r2 = (defpackage.C0744) r2
            float r2 = r2.f3508
            defpackage.AbstractC0069.m522(r1, r2)
        L11:
            return
    }

    public void setRadius(float r2) {
            r1 = this;
            ᛴᛵᲇᲇ r1 = r1.f225
            java.lang.Object r1 = r1.f3286
            ᛴᲀᛳᲇ r1 = (defpackage.C0744) r1
            float r0 = r1.f3511
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            return
        Ld:
            r1.f3511 = r2
            r2 = 0
            r1.m1663(r2)
            r1.invalidateSelf()
            return
    }

    public void setUseCompatPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.f223
            if (r0 == r2) goto L11
            r1.f223 = r2
            ᛴᛵᲇᲇ r1 = r1.f225
            java.lang.Object r2 = r1.f3286
            ᛴᲀᛳᲇ r2 = (defpackage.C0744) r2
            float r2 = r2.f3508
            defpackage.AbstractC0069.m522(r1, r2)
        L11:
            return
    }
}
