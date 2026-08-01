package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends android.widget.CompoundButton {

    /* JADX INFO: renamed from: Ω */
    public static final p000.f22 f691 = null;

    /* JADX INFO: renamed from: а */
    public static final int[] f692 = null;

    /* JADX INFO: renamed from: Α */
    public final int f693;

    /* JADX INFO: renamed from: Β */
    public float f694;

    /* JADX INFO: renamed from: Γ */
    public float f695;

    /* JADX INFO: renamed from: Δ */
    public final android.view.VelocityTracker f696;

    /* JADX INFO: renamed from: Ε */
    public final int f697;

    /* JADX INFO: renamed from: Ζ */
    public float f698;

    /* JADX INFO: renamed from: Η */
    public int f699;

    /* JADX INFO: renamed from: Θ */
    public int f700;

    /* JADX INFO: renamed from: Ι */
    public int f701;

    /* JADX INFO: renamed from: Κ */
    public int f702;

    /* JADX INFO: renamed from: Λ */
    public int f703;

    /* JADX INFO: renamed from: Μ */
    public int f704;

    /* JADX INFO: renamed from: Ν */
    public int f705;

    /* JADX INFO: renamed from: Ξ */
    public boolean f706;

    /* JADX INFO: renamed from: Ο */
    public final android.text.TextPaint f707;

    /* JADX INFO: renamed from: Π */
    public final android.content.res.ColorStateList f708;

    /* JADX INFO: renamed from: Ρ */
    public android.text.StaticLayout f709;

    /* JADX INFO: renamed from: Σ */
    public android.text.StaticLayout f710;

    /* JADX INFO: renamed from: Τ */
    public final p000.C0195d0 f711;

    /* JADX INFO: renamed from: Υ */
    public android.animation.ObjectAnimator f712;

    /* JADX INFO: renamed from: Φ */
    public p000.C0500l5 f713;

    /* JADX INFO: renamed from: Χ */
    public p000.g22 f714;

    /* JADX INFO: renamed from: Ψ */
    public final android.graphics.Rect f715;

    /* JADX INFO: renamed from: ε */
    public android.graphics.drawable.Drawable f716;

    /* JADX INFO: renamed from: ζ */
    public android.content.res.ColorStateList f717;

    /* JADX INFO: renamed from: η */
    public android.graphics.PorterDuff.Mode f718;

    /* JADX INFO: renamed from: θ */
    public boolean f719;

    /* JADX INFO: renamed from: ι */
    public boolean f720;

    /* JADX INFO: renamed from: κ */
    public android.graphics.drawable.Drawable f721;

    /* JADX INFO: renamed from: λ */
    public android.content.res.ColorStateList f722;

    /* JADX INFO: renamed from: μ */
    public android.graphics.PorterDuff.Mode f723;

    /* JADX INFO: renamed from: ν */
    public boolean f724;

    /* JADX INFO: renamed from: ξ */
    public boolean f725;

    /* JADX INFO: renamed from: ο */
    public int f726;

    /* JADX INFO: renamed from: π */
    public int f727;

    /* JADX INFO: renamed from: ρ */
    public int f728;

    /* JADX INFO: renamed from: σ */
    public boolean f729;

    /* JADX INFO: renamed from: τ */
    public java.lang.CharSequence f730;

    /* JADX INFO: renamed from: υ */
    public java.lang.CharSequence f731;

    /* JADX INFO: renamed from: φ */
    public java.lang.CharSequence f732;

    /* JADX INFO: renamed from: χ */
    public java.lang.CharSequence f733;

    /* JADX INFO: renamed from: ψ */
    public boolean f734;

    /* JADX INFO: renamed from: ω */
    public int f735;

    static {
            f22 r0 = new f22
            java.lang.String r1 = "thumbPos"
            r2 = 0
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            r0.<init>(r2, r3, r1)
            androidx.appcompat.widget.SwitchCompat.f691 = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.SwitchCompat.f692 = r0
            return
    }

    public SwitchCompat(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 2130968850(0x7f040112, float:1.7546365E38)
            r2.<init>(r3, r0, r1)
            return
    }

    public SwitchCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968850(0x7f040112, float:1.7546365E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public SwitchCompat(android.content.Context r13, android.util.AttributeSet r14, int r15) {
            r12 = this;
            r12.<init>(r13, r14, r15)
            r0 = 0
            r12.f717 = r0
            r12.f718 = r0
            r1 = 0
            r12.f719 = r1
            r12.f720 = r1
            r12.f722 = r0
            r12.f723 = r0
            r12.f724 = r1
            r12.f725 = r1
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r12.f696 = r2
            r2 = 1
            r12.f706 = r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r12.f715 = r3
            android.content.Context r3 = r12.getContext()
            p000.b42.m739(r12, r3)
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>(r2)
            r12.f707 = r3
            android.content.res.Resources r4 = r12.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r3.density = r4
            int[] r7 = p000.kk1.f5990
            m6 r4 = p000.C0538m6.m3752(r13, r14, r7, r15)
            java.lang.Object r5 = r4.f6967
            r9 = r5
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            java.util.WeakHashMap r5 = p000.b92.f1572
            r11 = 0
            r5 = r12
            r6 = r13
            r8 = r14
            r10 = r15
            p000.y82.m6840(r5, r6, r7, r8, r9, r10, r11)
            r12 = 2
            android.graphics.drawable.Drawable r13 = r4.m3754(r12)
            r5.f716 = r13
            if (r13 == 0) goto L60
            r13.setCallback(r5)
        L60:
            r13 = 11
            android.graphics.drawable.Drawable r13 = r4.m3754(r13)
            r5.f721 = r13
            if (r13 == 0) goto L6d
            r13.setCallback(r5)
        L6d:
            java.lang.CharSequence r13 = r9.getText(r1)
            r5.setTextOnInternal(r13)
            java.lang.CharSequence r13 = r9.getText(r2)
            r5.setTextOffInternal(r13)
            r13 = 3
            boolean r14 = r9.getBoolean(r13, r2)
            r5.f734 = r14
            r14 = 8
            int r14 = r9.getDimensionPixelSize(r14, r1)
            r5.f726 = r14
            r14 = 5
            int r14 = r9.getDimensionPixelSize(r14, r1)
            r5.f727 = r14
            r14 = 6
            int r14 = r9.getDimensionPixelSize(r14, r1)
            r5.f728 = r14
            r14 = 4
            boolean r14 = r9.getBoolean(r14, r1)
            r5.f729 = r14
            r14 = 9
            android.content.res.ColorStateList r14 = r4.m3790(r14)
            if (r14 == 0) goto Lab
            r5.f717 = r14
            r5.f719 = r2
        Lab:
            r14 = 10
            r15 = -1
            int r14 = r9.getInt(r14, r15)
            android.graphics.PorterDuff$Mode r14 = p000.AbstractC0300fw.m2207(r14, r0)
            android.graphics.PorterDuff$Mode r7 = r5.f718
            if (r7 == r14) goto Lbe
            r5.f718 = r14
            r5.f720 = r2
        Lbe:
            boolean r14 = r5.f719
            if (r14 != 0) goto Lc6
            boolean r14 = r5.f720
            if (r14 == 0) goto Lc9
        Lc6:
            r5.m292()
        Lc9:
            r14 = 12
            android.content.res.ColorStateList r14 = r4.m3790(r14)
            if (r14 == 0) goto Ld5
            r5.f722 = r14
            r5.f724 = r2
        Ld5:
            r14 = 13
            int r14 = r9.getInt(r14, r15)
            android.graphics.PorterDuff$Mode r14 = p000.AbstractC0300fw.m2207(r14, r0)
            android.graphics.PorterDuff$Mode r7 = r5.f723
            if (r7 == r14) goto Le7
            r5.f723 = r14
            r5.f725 = r2
        Le7:
            boolean r14 = r5.f724
            if (r14 != 0) goto Lef
            boolean r14 = r5.f725
            if (r14 == 0) goto Lf2
        Lef:
            r5.m293()
        Lf2:
            r14 = 7
            int r14 = r9.getResourceId(r14, r1)
            if (r14 == 0) goto L1b3
            int[] r7 = p000.kk1.f5962
            android.content.res.TypedArray r14 = r6.obtainStyledAttributes(r14, r7)
            boolean r7 = r14.hasValue(r13)
            if (r7 == 0) goto L112
            int r7 = r14.getResourceId(r13, r1)
            if (r7 == 0) goto L112
            android.content.res.ColorStateList r7 = p000.ln0.m3600(r6, r7)
            if (r7 == 0) goto L112
            goto L116
        L112:
            android.content.res.ColorStateList r7 = r14.getColorStateList(r13)
        L116:
            if (r7 == 0) goto L11b
            r5.f708 = r7
            goto L121
        L11b:
            android.content.res.ColorStateList r7 = r5.getTextColors()
            r5.f708 = r7
        L121:
            int r7 = r14.getDimensionPixelSize(r1, r1)
            if (r7 == 0) goto L136
            float r7 = (float) r7
            float r9 = r3.getTextSize()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 == 0) goto L136
            r3.setTextSize(r7)
            r5.requestLayout()
        L136:
            int r7 = r14.getInt(r2, r15)
            int r15 = r14.getInt(r12, r15)
            if (r7 == r2) goto L14c
            if (r7 == r12) goto L149
            if (r7 == r13) goto L146
            r13 = r0
            goto L14e
        L146:
            android.graphics.Typeface r13 = android.graphics.Typeface.MONOSPACE
            goto L14e
        L149:
            android.graphics.Typeface r13 = android.graphics.Typeface.SERIF
            goto L14e
        L14c:
            android.graphics.Typeface r13 = android.graphics.Typeface.SANS_SERIF
        L14e:
            r7 = 0
            if (r15 <= 0) goto L17b
            if (r13 != 0) goto L158
            android.graphics.Typeface r13 = android.graphics.Typeface.defaultFromStyle(r15)
            goto L15c
        L158:
            android.graphics.Typeface r13 = android.graphics.Typeface.create(r13, r15)
        L15c:
            r5.setSwitchTypeface(r13)
            if (r13 == 0) goto L166
            int r13 = r13.getStyle()
            goto L167
        L166:
            r13 = r1
        L167:
            int r13 = ~r13
            r13 = r13 & r15
            r15 = r13 & 1
            if (r15 == 0) goto L16e
            goto L16f
        L16e:
            r2 = r1
        L16f:
            r3.setFakeBoldText(r2)
            r12 = r12 & r13
            if (r12 == 0) goto L177
            r7 = -1098907648(0xffffffffbe800000, float:-0.25)
        L177:
            r3.setTextSkewX(r7)
            goto L184
        L17b:
            r3.setFakeBoldText(r1)
            r3.setTextSkewX(r7)
            r5.setSwitchTypeface(r13)
        L184:
            r12 = 14
            boolean r12 = r14.getBoolean(r12, r1)
            if (r12 == 0) goto L1a4
            d0 r12 = new d0
            android.content.Context r13 = r5.getContext()
            r12.<init>()
            android.content.res.Resources r13 = r13.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            java.util.Locale r13 = r13.locale
            r12.f2828 = r13
            r5.f711 = r12
            goto L1a6
        L1a4:
            r5.f711 = r0
        L1a6:
            java.lang.CharSequence r12 = r5.f730
            r5.setTextOnInternal(r12)
            java.lang.CharSequence r12 = r5.f732
            r5.setTextOffInternal(r12)
            r14.recycle()
        L1b3:
            d6 r12 = new d6
            r12.<init>(r5)
            r12.m1661(r8, r10)
            r4.m3765()
            android.view.ViewConfiguration r12 = android.view.ViewConfiguration.get(r6)
            int r13 = r12.getScaledTouchSlop()
            r5.f693 = r13
            int r12 = r12.getScaledMinimumFlingVelocity()
            r5.f697 = r12
            l5 r12 = r5.getEmojiTextViewHelper()
            r12.m3497(r8, r10)
            r5.refreshDrawableState()
            boolean r12 = r5.isChecked()
            r5.setChecked(r12)
            return
    }

    private p000.C0500l5 getEmojiTextViewHelper() {
            r1 = this;
            l5 r0 = r1.f713
            if (r0 != 0) goto Lb
            l5 r0 = new l5
            r0.<init>(r1)
            r1.f713 = r0
        Lb:
            l5 r1 = r1.f713
            return r1
    }

    private boolean getTargetCheckedState() {
            r1 = this;
            float r1 = r1.f698
            r0 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private int getThumbOffset() {
            r3 = this;
            int r0 = r3.getLayoutDirection()
            float r1 = r3.f698
            r2 = 1
            if (r0 != r2) goto Ld
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r0 - r1
        Ld:
            int r3 = r3.getThumbScrollRange()
            float r3 = (float) r3
            float r1 = r1 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r3
            int r3 = (int) r1
            return r3
    }

    private int getThumbScrollRange() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f721
            if (r0 == 0) goto L26
            android.graphics.Rect r1 = r3.f715
            r0.getPadding(r1)
            android.graphics.drawable.Drawable r0 = r3.f716
            if (r0 == 0) goto L12
            android.graphics.Rect r0 = p000.AbstractC0300fw.m2206(r0)
            goto L14
        L12:
            android.graphics.Rect r0 = p000.AbstractC0300fw.f4148
        L14:
            int r2 = r3.f699
            int r3 = r3.f701
            int r2 = r2 - r3
            int r3 = r1.left
            int r2 = r2 - r3
            int r3 = r1.right
            int r2 = r2 - r3
            int r3 = r0.left
            int r2 = r2 - r3
            int r3 = r0.right
            int r2 = r2 - r3
            return r2
        L26:
            r3 = 0
            return r3
    }

    private void setTextOffInternal(java.lang.CharSequence r3) {
            r2 = this;
            r2.f732 = r3
            l5 r0 = r2.getEmojiTextViewHelper()
            n r0 = r0.f6423
            java.lang.Object r0 = r0.f7336
            bd r0 = (p000.AbstractC0073bd) r0
            d0 r1 = r2.f711
            android.text.method.TransformationMethod r0 = r0.mo907(r1)
            if (r0 == 0) goto L18
            java.lang.CharSequence r3 = r0.getTransformation(r3, r2)
        L18:
            r2.f733 = r3
            r3 = 0
            r2.f710 = r3
            boolean r3 = r2.f734
            if (r3 == 0) goto L24
            r2.m295()
        L24:
            return
    }

    private void setTextOnInternal(java.lang.CharSequence r3) {
            r2 = this;
            r2.f730 = r3
            l5 r0 = r2.getEmojiTextViewHelper()
            n r0 = r0.f6423
            java.lang.Object r0 = r0.f7336
            bd r0 = (p000.AbstractC0073bd) r0
            d0 r1 = r2.f711
            android.text.method.TransformationMethod r0 = r0.mo907(r1)
            if (r0 == 0) goto L18
            java.lang.CharSequence r3 = r0.getTransformation(r3, r2)
        L18:
            r2.f731 = r3
            r3 = 0
            r2.f709 = r3
            boolean r3 = r2.f734
            if (r3 == 0) goto L24
            r2.m295()
        L24:
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r11) {
            r10 = this;
            int r0 = r10.f702
            int r1 = r10.f703
            int r2 = r10.f704
            int r3 = r10.f705
            int r4 = r10.getThumbOffset()
            int r4 = r4 + r0
            android.graphics.drawable.Drawable r5 = r10.f716
            if (r5 == 0) goto L16
            android.graphics.Rect r5 = p000.AbstractC0300fw.m2206(r5)
            goto L18
        L16:
            android.graphics.Rect r5 = p000.AbstractC0300fw.f4148
        L18:
            android.graphics.drawable.Drawable r6 = r10.f721
            android.graphics.Rect r7 = r10.f715
            if (r6 == 0) goto L51
            r6.getPadding(r7)
            int r6 = r7.left
            int r4 = r4 + r6
            if (r5 == 0) goto L4a
            int r8 = r5.left
            if (r8 <= r6) goto L2c
            int r8 = r8 - r6
            int r0 = r0 + r8
        L2c:
            int r6 = r5.top
            int r8 = r7.top
            if (r6 <= r8) goto L35
            int r6 = r6 - r8
            int r6 = r6 + r1
            goto L36
        L35:
            r6 = r1
        L36:
            int r8 = r5.right
            int r9 = r7.right
            if (r8 <= r9) goto L3e
            int r8 = r8 - r9
            int r2 = r2 - r8
        L3e:
            int r5 = r5.bottom
            int r8 = r7.bottom
            if (r5 <= r8) goto L48
            int r5 = r5 - r8
            int r5 = r3 - r5
            goto L4c
        L48:
            r5 = r3
            goto L4c
        L4a:
            r6 = r1
            goto L48
        L4c:
            android.graphics.drawable.Drawable r8 = r10.f721
            r8.setBounds(r0, r6, r2, r5)
        L51:
            android.graphics.drawable.Drawable r0 = r10.f716
            if (r0 == 0) goto L70
            r0.getPadding(r7)
            int r0 = r7.left
            int r0 = r4 - r0
            int r2 = r10.f701
            int r4 = r4 + r2
            int r2 = r7.right
            int r4 = r4 + r2
            android.graphics.drawable.Drawable r2 = r10.f716
            r2.setBounds(r0, r1, r4, r3)
            android.graphics.drawable.Drawable r2 = r10.getBackground()
            if (r2 == 0) goto L70
            r2.setHotspotBounds(r0, r1, r4, r3)
        L70:
            super.draw(r11)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float r2, float r3) {
            r1 = this;
            super.drawableHotspotChanged(r2, r3)
            android.graphics.drawable.Drawable r0 = r1.f716
            if (r0 == 0) goto La
            r0.setHotspot(r2, r3)
        La:
            android.graphics.drawable.Drawable r1 = r1.f721
            if (r1 == 0) goto L11
            r1.setHotspot(r2, r3)
        L11:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            android.graphics.drawable.Drawable r1 = r4.f716
            if (r1 == 0) goto L16
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L16
            boolean r1 = r1.setState(r0)
            goto L17
        L16:
            r1 = 0
        L17:
            android.graphics.drawable.Drawable r2 = r4.f721
            if (r2 == 0) goto L26
            boolean r3 = r2.isStateful()
            if (r3 == 0) goto L26
            boolean r0 = r2.setState(r0)
            r1 = r1 | r0
        L26:
            if (r1 == 0) goto L2b
            r4.invalidate()
        L2b:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L1c
            int r0 = super.getCompoundPaddingLeft()
            int r1 = r2.f699
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1b
            int r2 = r2.f728
            int r0 = r0 + r2
        L1b:
            return r0
        L1c:
            int r2 = super.getCompoundPaddingLeft()
            return r2
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r2 = super.getCompoundPaddingRight()
            return r2
        Lc:
            int r0 = super.getCompoundPaddingRight()
            int r1 = r2.f699
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r2.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L20
            int r2 = r2.f728
            int r0 = r0 + r2
        L20:
            return r0
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r0 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            return r0
    }

    public boolean getShowText() {
            r0 = this;
            boolean r0 = r0.f734
            return r0
    }

    public boolean getSplitTrack() {
            r0 = this;
            boolean r0 = r0.f729
            return r0
    }

    public int getSwitchMinWidth() {
            r0 = this;
            int r0 = r0.f727
            return r0
    }

    public int getSwitchPadding() {
            r0 = this;
            int r0 = r0.f728
            return r0
    }

    public java.lang.CharSequence getTextOff() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f732
            return r0
    }

    public java.lang.CharSequence getTextOn() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f730
            return r0
    }

    public android.graphics.drawable.Drawable getThumbDrawable() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f716
            return r0
    }

    public final float getThumbPosition() {
            r0 = this;
            float r0 = r0.f698
            return r0
    }

    public int getThumbTextPadding() {
            r0 = this;
            int r0 = r0.f726
            return r0
    }

    public android.content.res.ColorStateList getThumbTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.f717
            return r0
    }

    public android.graphics.PorterDuff.Mode getThumbTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.f718
            return r0
    }

    public android.graphics.drawable.Drawable getTrackDrawable() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f721
            return r0
    }

    public android.content.res.ColorStateList getTrackTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.f722
            return r0
    }

    public android.graphics.PorterDuff.Mode getTrackTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.f723
            return r0
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.f716
            if (r0 == 0) goto La
            r0.jumpToCurrentState()
        La:
            android.graphics.drawable.Drawable r0 = r1.f721
            if (r0 == 0) goto L11
            r0.jumpToCurrentState()
        L11:
            android.animation.ObjectAnimator r0 = r1.f712
            if (r0 == 0) goto L23
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L23
            android.animation.ObjectAnimator r0 = r1.f712
            r0.end()
            r0 = 0
            r1.f712 = r0
        L23:
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r1) {
            r0 = this;
            int r1 = r1 + 1
            int[] r1 = super.onCreateDrawableState(r1)
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L11
            int[] r0 = androidx.appcompat.widget.SwitchCompat.f692
            android.view.View.mergeDrawableStates(r1, r0)
        L11:
            return r1
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            android.graphics.drawable.Drawable r0 = r9.f721
            android.graphics.Rect r1 = r9.f715
            if (r0 == 0) goto Ld
            r0.getPadding(r1)
            goto L10
        Ld:
            r1.setEmpty()
        L10:
            int r2 = r9.f703
            int r3 = r9.f705
            int r4 = r1.top
            int r2 = r2 + r4
            int r4 = r1.bottom
            int r3 = r3 - r4
            android.graphics.drawable.Drawable r4 = r9.f716
            if (r0 == 0) goto L4c
            boolean r5 = r9.f729
            if (r5 == 0) goto L49
            if (r4 == 0) goto L49
            android.graphics.Rect r5 = p000.AbstractC0300fw.m2206(r4)
            r4.copyBounds(r1)
            int r6 = r1.left
            int r7 = r5.left
            int r6 = r6 + r7
            r1.left = r6
            int r6 = r1.right
            int r5 = r5.right
            int r6 = r6 - r5
            r1.right = r6
            int r5 = r10.save()
            android.graphics.Region$Op r6 = android.graphics.Region.Op.DIFFERENCE
            r10.clipRect(r1, r6)
            r0.draw(r10)
            r10.restoreToCount(r5)
            goto L4c
        L49:
            r0.draw(r10)
        L4c:
            int r0 = r10.save()
            if (r4 == 0) goto L55
            r4.draw(r10)
        L55:
            boolean r1 = r9.getTargetCheckedState()
            if (r1 == 0) goto L5e
            android.text.StaticLayout r1 = r9.f709
            goto L60
        L5e:
            android.text.StaticLayout r1 = r9.f710
        L60:
            if (r1 == 0) goto La1
            int[] r5 = r9.getDrawableState()
            android.text.TextPaint r6 = r9.f707
            android.content.res.ColorStateList r7 = r9.f708
            if (r7 == 0) goto L74
            r8 = 0
            int r7 = r7.getColorForState(r5, r8)
            r6.setColor(r7)
        L74:
            r6.drawableState = r5
            if (r4 == 0) goto L82
            android.graphics.Rect r9 = r4.getBounds()
            int r4 = r9.left
            int r9 = r9.right
            int r4 = r4 + r9
            goto L86
        L82:
            int r4 = r9.getWidth()
        L86:
            int r4 = r4 / 2
            int r9 = r1.getWidth()
            int r9 = r9 / 2
            int r4 = r4 - r9
            int r2 = r2 + r3
            int r2 = r2 / 2
            int r9 = r1.getHeight()
            int r9 = r9 / 2
            int r2 = r2 - r9
            float r9 = (float) r4
            float r2 = (float) r2
            r10.translate(r9, r2)
            r1.draw(r10)
        La1:
            r10.restoreToCount(r0)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1)
            java.lang.String r0 = "android.widget.Switch"
            r1.setClassName(r0)
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)
            java.lang.String r0 = "android.widget.Switch"
            r1.setClassName(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            android.graphics.drawable.Drawable r2 = r1.f716
            r3 = 0
            if (r2 == 0) goto L2e
            android.graphics.drawable.Drawable r2 = r1.f721
            android.graphics.Rect r4 = r1.f715
            if (r2 == 0) goto L12
            r2.getPadding(r4)
            goto L15
        L12:
            r4.setEmpty()
        L15:
            android.graphics.drawable.Drawable r2 = r1.f716
            android.graphics.Rect r2 = p000.AbstractC0300fw.m2206(r2)
            int r5 = r2.left
            int r6 = r4.left
            int r5 = r5 - r6
            int r5 = java.lang.Math.max(r3, r5)
            int r2 = r2.right
            int r4 = r4.right
            int r2 = r2 - r4
            int r3 = java.lang.Math.max(r3, r2)
            goto L2f
        L2e:
            r5 = r3
        L2f:
            int r2 = r1.getLayoutDirection()
            r4 = 1
            if (r2 != r4) goto L41
            int r2 = r1.getPaddingLeft()
            int r2 = r2 + r5
            int r4 = r1.f699
            int r4 = r4 + r2
            int r4 = r4 - r5
            int r4 = r4 - r3
            goto L52
        L41:
            int r2 = r1.getWidth()
            int r4 = r1.getPaddingRight()
            int r2 = r2 - r4
            int r4 = r2 - r3
            int r2 = r1.f699
            int r2 = r4 - r2
            int r2 = r2 + r5
            int r2 = r2 + r3
        L52:
            int r3 = r1.getGravity()
            r3 = r3 & 112(0x70, float:1.57E-43)
            r5 = 16
            if (r3 == r5) goto L77
            r5 = 80
            if (r3 == r5) goto L68
            int r3 = r1.getPaddingTop()
            int r5 = r1.f700
            int r5 = r5 + r3
            goto L90
        L68:
            int r3 = r1.getHeight()
            int r5 = r1.getPaddingBottom()
            int r5 = r3 - r5
            int r3 = r1.f700
            int r3 = r5 - r3
            goto L90
        L77:
            int r3 = r1.getPaddingTop()
            int r5 = r1.getHeight()
            int r5 = r5 + r3
            int r3 = r1.getPaddingBottom()
            int r5 = r5 - r3
            int r5 = r5 / 2
            int r3 = r1.f700
            int r6 = r3 / 2
            int r5 = r5 - r6
            int r3 = r3 + r5
            r0 = r5
            r5 = r3
            r3 = r0
        L90:
            r1.f702 = r2
            r1.f703 = r3
            r1.f705 = r5
            r1.f704 = r4
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r11, int r12) {
            r10 = this;
            boolean r0 = r10.f734
            r1 = 0
            if (r0 == 0) goto L4b
            android.text.StaticLayout r0 = r10.f709
            android.text.TextPaint r4 = r10.f707
            if (r0 != 0) goto L29
            java.lang.CharSequence r3 = r10.f731
            android.text.StaticLayout r2 = new android.text.StaticLayout
            if (r3 == 0) goto L1d
            float r0 = android.text.Layout.getDesiredWidth(r3, r4)
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            int r0 = (int) r5
            r5 = r0
            goto L1e
        L1d:
            r5 = r1
        L1e:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            r8 = 0
            r9 = 1
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.f709 = r2
        L29:
            android.text.StaticLayout r0 = r10.f710
            if (r0 != 0) goto L4b
            java.lang.CharSequence r3 = r10.f733
            android.text.StaticLayout r2 = new android.text.StaticLayout
            if (r3 == 0) goto L3f
            float r0 = android.text.Layout.getDesiredWidth(r3, r4)
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            int r0 = (int) r5
            r5 = r0
            goto L40
        L3f:
            r5 = r1
        L40:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            r8 = 0
            r9 = 1
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.f710 = r2
        L4b:
            android.graphics.drawable.Drawable r0 = r10.f716
            android.graphics.Rect r2 = r10.f715
            if (r0 == 0) goto L67
            r0.getPadding(r2)
            android.graphics.drawable.Drawable r0 = r10.f716
            int r0 = r0.getIntrinsicWidth()
            int r3 = r2.left
            int r0 = r0 - r3
            int r3 = r2.right
            int r0 = r0 - r3
            android.graphics.drawable.Drawable r3 = r10.f716
            int r3 = r3.getIntrinsicHeight()
            goto L69
        L67:
            r0 = r1
            r3 = r0
        L69:
            boolean r4 = r10.f734
            if (r4 == 0) goto L83
            android.text.StaticLayout r4 = r10.f709
            int r4 = r4.getWidth()
            android.text.StaticLayout r5 = r10.f710
            int r5 = r5.getWidth()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r10.f726
            int r5 = r5 * 2
            int r5 = r5 + r4
            goto L84
        L83:
            r5 = r1
        L84:
            int r0 = java.lang.Math.max(r5, r0)
            r10.f701 = r0
            android.graphics.drawable.Drawable r0 = r10.f721
            if (r0 == 0) goto L98
            r0.getPadding(r2)
            android.graphics.drawable.Drawable r0 = r10.f721
            int r1 = r0.getIntrinsicHeight()
            goto L9b
        L98:
            r2.setEmpty()
        L9b:
            int r0 = r2.left
            int r2 = r2.right
            android.graphics.drawable.Drawable r4 = r10.f716
            if (r4 == 0) goto Lb3
            android.graphics.Rect r4 = p000.AbstractC0300fw.m2206(r4)
            int r5 = r4.left
            int r0 = java.lang.Math.max(r0, r5)
            int r4 = r4.right
            int r2 = java.lang.Math.max(r2, r4)
        Lb3:
            boolean r4 = r10.f706
            int r5 = r10.f727
            if (r4 == 0) goto Lc3
            int r4 = r10.f701
            int r4 = r4 * 2
            int r4 = r4 + r0
            int r4 = r4 + r2
            int r5 = java.lang.Math.max(r5, r4)
        Lc3:
            int r0 = java.lang.Math.max(r1, r3)
            r10.f699 = r5
            r10.f700 = r0
            super.onMeasure(r11, r12)
            int r11 = r10.getMeasuredHeight()
            if (r11 >= r0) goto Ldb
            int r11 = r10.getMeasuredWidthAndState()
            r10.setMeasuredDimension(r11, r0)
        Ldb:
            return
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onPopulateAccessibilityEvent(r2)
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto Lc
            java.lang.CharSequence r1 = r1.f730
            goto Le
        Lc:
            java.lang.CharSequence r1 = r1.f732
        Le:
            if (r1 == 0) goto L17
            java.util.List r2 = r2.getText()
            r2.add(r1)
        L17:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            android.view.VelocityTracker r0 = r9.f696
            r0.addMovement(r10)
            int r1 = r10.getActionMasked()
            int r2 = r9.f693
            r3 = 1
            if (r1 == 0) goto Lf4
            r4 = 3
            r5 = 0
            r6 = 2
            if (r1 == r3) goto L8c
            if (r1 == r6) goto L19
            if (r1 == r4) goto L8c
            goto L140
        L19:
            int r0 = r9.f735
            if (r0 == r3) goto L5d
            if (r0 == r6) goto L21
            goto L140
        L21:
            float r10 = r10.getX()
            int r0 = r9.getThumbScrollRange()
            float r1 = r9.f694
            float r1 = r10 - r1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L34
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L3d
        L34:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r1 = r2
            goto L3d
        L3a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r0
        L3d:
            int r0 = r9.getLayoutDirection()
            if (r0 != r3) goto L44
            float r1 = -r1
        L44:
            float r0 = r9.f698
            float r1 = r1 + r0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto L4c
            goto L53
        L4c:
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L52
            r5 = r2
            goto L53
        L52:
            r5 = r1
        L53:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L5c
            r9.f694 = r10
            r9.setThumbPosition(r5)
        L5c:
            return r3
        L5d:
            float r0 = r10.getX()
            float r1 = r10.getY()
            float r4 = r9.f694
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            float r2 = (float) r2
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L7e
            float r4 = r9.f695
            float r4 = r1 - r4
            float r4 = java.lang.Math.abs(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L140
        L7e:
            r9.f735 = r6
            android.view.ViewParent r10 = r9.getParent()
            r10.requestDisallowInterceptTouchEvent(r3)
            r9.f694 = r0
            r9.f695 = r1
            return r3
        L8c:
            int r1 = r9.f735
            r2 = 0
            if (r1 != r6) goto Lee
            r9.f735 = r2
            int r1 = r10.getAction()
            if (r1 != r3) goto La1
            boolean r1 = r9.isEnabled()
            if (r1 == 0) goto La1
            r1 = r3
            goto La2
        La1:
            r1 = r2
        La2:
            boolean r6 = r9.isChecked()
            if (r1 == 0) goto Ld4
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
            float r0 = r0.getXVelocity()
            float r1 = java.lang.Math.abs(r0)
            int r7 = r9.f697
            float r7 = (float) r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto Lcf
            int r1 = r9.getLayoutDirection()
            if (r1 != r3) goto Lca
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lc8
        Lc6:
            r0 = r3
            goto Ld5
        Lc8:
            r0 = r2
            goto Ld5
        Lca:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lc8
            goto Lc6
        Lcf:
            boolean r0 = r9.getTargetCheckedState()
            goto Ld5
        Ld4:
            r0 = r6
        Ld5:
            if (r0 == r6) goto Lda
            r9.playSoundEffect(r2)
        Lda:
            r9.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            r0.setAction(r4)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r10)
            return r3
        Lee:
            r9.f735 = r2
            r0.clear()
            goto L140
        Lf4:
            float r0 = r10.getX()
            float r1 = r10.getY()
            boolean r4 = r9.isEnabled()
            if (r4 == 0) goto L140
            android.graphics.drawable.Drawable r4 = r9.f716
            if (r4 != 0) goto L107
            goto L140
        L107:
            int r4 = r9.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r9.f716
            android.graphics.Rect r6 = r9.f715
            r5.getPadding(r6)
            int r5 = r9.f703
            int r5 = r5 - r2
            int r7 = r9.f702
            int r7 = r7 + r4
            int r7 = r7 - r2
            int r4 = r9.f701
            int r4 = r4 + r7
            int r8 = r6.left
            int r4 = r4 + r8
            int r6 = r6.right
            int r4 = r4 + r6
            int r4 = r4 + r2
            int r6 = r9.f705
            int r6 = r6 + r2
            float r2 = (float) r7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L140
            float r2 = (float) r4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L140
            float r2 = (float) r5
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L140
            float r2 = (float) r6
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L140
            r9.f735 = r3
            r9.f694 = r0
            r9.f695 = r1
        L140:
            boolean r9 = super.onTouchEvent(r10)
            return r9
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r1) {
            r0 = this;
            super.setAllCaps(r1)
            l5 r0 = r0.getEmojiTextViewHelper()
            r0.m3498(r1)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r8) {
            r7 = this;
            super.setChecked(r8)
            boolean r8 = r7.isChecked()
            r4 = 30
            r3 = 64
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r1 = 2131296992(0x7f0902e0, float:1.8211916E38)
            if (r8 == 0) goto L2e
            java.lang.CharSequence r0 = r7.f730
            if (r0 != 0) goto L21
            android.content.res.Resources r0 = r7.getResources()
            r5 = 2131689479(0x7f0f0007, float:1.9007975E38)
            java.lang.String r0 = r0.getString(r5)
        L21:
            r6 = r0
            java.util.WeakHashMap r0 = p000.b92.f1572
            q82 r0 = new q82
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            r0.m7043(r7, r6)
            goto L49
        L2e:
            java.lang.CharSequence r0 = r7.f732
            if (r0 != 0) goto L3d
            android.content.res.Resources r0 = r7.getResources()
            r5 = 2131689478(0x7f0f0006, float:1.9007973E38)
            java.lang.String r0 = r0.getString(r5)
        L3d:
            r6 = r0
            java.util.WeakHashMap r0 = p000.b92.f1572
            q82 r0 = new q82
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            r0.m7043(r7, r6)
        L49:
            android.os.IBinder r0 = r7.getWindowToken()
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L79
            boolean r0 = r7.isLaidOut()
            if (r0 == 0) goto L79
            if (r8 == 0) goto L5b
            r1 = r2
        L5b:
            r8 = 1
            float[] r0 = new float[r8]
            r2 = 0
            r0[r2] = r1
            f22 r1 = androidx.appcompat.widget.SwitchCompat.f691
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r1, r0)
            r7.f712 = r0
            r1 = 250(0xfa, double:1.235E-321)
            r0.setDuration(r1)
            android.animation.ObjectAnimator r0 = r7.f712
            r0.setAutoCancel(r8)
            android.animation.ObjectAnimator r7 = r7.f712
            r7.start()
            return
        L79:
            android.animation.ObjectAnimator r0 = r7.f712
            if (r0 == 0) goto L80
            r0.cancel()
        L80:
            if (r8 == 0) goto L83
            r1 = r2
        L83:
            r7.setThumbPosition(r1)
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            l5 r0 = r1.getEmojiTextViewHelper()
            r0.m3499(r2)
            java.lang.CharSequence r2 = r1.f730
            r1.setTextOnInternal(r2)
            java.lang.CharSequence r2 = r1.f732
            r1.setTextOffInternal(r2)
            r1.requestLayout()
            return
    }

    public final void setEnforceSwitchWidth(boolean r1) {
            r0 = this;
            r0.f706 = r1
            r0.invalidate()
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            l5 r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r2 = r0.m3496(r2)
            super.setFilters(r2)
            return
    }

    public void setShowText(boolean r2) {
            r1 = this;
            boolean r0 = r1.f734
            if (r0 == r2) goto Le
            r1.f734 = r2
            r1.requestLayout()
            if (r2 == 0) goto Le
            r1.m295()
        Le:
            return
    }

    public void setSplitTrack(boolean r1) {
            r0 = this;
            r0.f729 = r1
            r0.invalidate()
            return
    }

    public void setSwitchMinWidth(int r1) {
            r0 = this;
            r0.f727 = r1
            r0.requestLayout()
            return
    }

    public void setSwitchPadding(int r1) {
            r0 = this;
            r0.f728 = r1
            r0.requestLayout()
            return
    }

    public void setSwitchTypeface(android.graphics.Typeface r3) {
            r2 = this;
            android.text.TextPaint r0 = r2.f707
            android.graphics.Typeface r1 = r0.getTypeface()
            if (r1 == 0) goto L12
            android.graphics.Typeface r1 = r0.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1a
        L12:
            android.graphics.Typeface r1 = r0.getTypeface()
            if (r1 != 0) goto L23
            if (r3 == 0) goto L23
        L1a:
            r0.setTypeface(r3)
            r2.requestLayout()
            r2.invalidate()
        L23:
            return
    }

    public void setTextOff(java.lang.CharSequence r8) {
            r7 = this;
            r7.setTextOffInternal(r8)
            r7.requestLayout()
            boolean r8 = r7.isChecked()
            if (r8 != 0) goto L2f
            java.lang.CharSequence r8 = r7.f732
            if (r8 != 0) goto L1b
            android.content.res.Resources r8 = r7.getResources()
            r0 = 2131689478(0x7f0f0006, float:1.9007973E38)
            java.lang.String r8 = r8.getString(r0)
        L1b:
            java.util.WeakHashMap r0 = p000.b92.f1572
            q82 r1 = new q82
            r5 = 30
            r6 = 1
            r2 = 2131296992(0x7f0902e0, float:1.8211916E38)
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r4 = 64
            r1.<init>(r2, r3, r4, r5, r6)
            r1.m7043(r7, r8)
        L2f:
            return
    }

    public void setTextOn(java.lang.CharSequence r8) {
            r7 = this;
            r7.setTextOnInternal(r8)
            r7.requestLayout()
            boolean r8 = r7.isChecked()
            if (r8 == 0) goto L2f
            java.lang.CharSequence r8 = r7.f730
            if (r8 != 0) goto L1b
            android.content.res.Resources r8 = r7.getResources()
            r0 = 2131689479(0x7f0f0007, float:1.9007975E38)
            java.lang.String r8 = r8.getString(r0)
        L1b:
            java.util.WeakHashMap r0 = p000.b92.f1572
            q82 r1 = new q82
            r5 = 30
            r6 = 1
            r2 = 2131296992(0x7f0902e0, float:1.8211916E38)
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r4 = 64
            r1.<init>(r2, r3, r4, r5, r6)
            r1.m7043(r7, r8)
        L2f:
            return
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f716
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.f716 = r3
            if (r3 == 0) goto Lf
            r3.setCallback(r2)
        Lf:
            r2.requestLayout()
            return
    }

    public void setThumbPosition(float r1) {
            r0 = this;
            r0.f698 = r1
            r0.invalidate()
            return
    }

    public void setThumbResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000.ln0.m3603(r0, r2)
            r1.setThumbDrawable(r2)
            return
    }

    public void setThumbTextPadding(int r1) {
            r0 = this;
            r0.f726 = r1
            r0.requestLayout()
            return
    }

    public void setThumbTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f717 = r1
            r1 = 1
            r0.f719 = r1
            r0.m292()
            return
    }

    public void setThumbTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f718 = r1
            r1 = 1
            r0.f720 = r1
            r0.m292()
            return
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f721
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.f721 = r3
            if (r3 == 0) goto Lf
            r3.setCallback(r2)
        Lf:
            r2.requestLayout()
            return
    }

    public void setTrackResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = p000.ln0.m3603(r0, r2)
            r1.setTrackDrawable(r2)
            return
    }

    public void setTrackTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f722 = r1
            r1 = 1
            r0.f724 = r1
            r0.m293()
            return
    }

    public void setTrackTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f723 = r1
            r1 = 1
            r0.f725 = r1
            r0.m293()
            return
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
            r1 = this;
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.f716
            if (r2 == r0) goto L11
            android.graphics.drawable.Drawable r1 = r1.f721
            if (r2 != r1) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: α */
    public final void m292() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f716
            if (r0 == 0) goto L37
            boolean r1 = r2.f719
            if (r1 != 0) goto Lc
            boolean r1 = r2.f720
            if (r1 == 0) goto L37
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f716 = r0
            boolean r1 = r2.f719
            if (r1 == 0) goto L1b
            android.content.res.ColorStateList r1 = r2.f717
            r0.setTintList(r1)
        L1b:
            boolean r0 = r2.f720
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r2.f716
            android.graphics.PorterDuff$Mode r1 = r2.f718
            r0.setTintMode(r1)
        L26:
            android.graphics.drawable.Drawable r0 = r2.f716
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r0 = r2.f716
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L37:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m293() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f721
            if (r0 == 0) goto L37
            boolean r1 = r2.f724
            if (r1 != 0) goto Lc
            boolean r1 = r2.f725
            if (r1 == 0) goto L37
        Lc:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f721 = r0
            boolean r1 = r2.f724
            if (r1 == 0) goto L1b
            android.content.res.ColorStateList r1 = r2.f722
            r0.setTintList(r1)
        L1b:
            boolean r0 = r2.f725
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r2.f721
            android.graphics.PorterDuff$Mode r1 = r2.f723
            r0.setTintMode(r1)
        L26:
            android.graphics.drawable.Drawable r0 = r2.f721
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r0 = r2.f721
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L37:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m294() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f730
            r1.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r1.f732
            r1.setTextOffInternal(r0)
            r1.requestLayout()
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m295() {
            r3 = this;
            g22 r0 = r3.f714
            if (r0 != 0) goto L30
            l5 r0 = r3.f713
            n r0 = r0.f6423
            java.lang.Object r0 = r0.f7336
            bd r0 = (p000.AbstractC0073bd) r0
            boolean r0 = r0.mo902()
            if (r0 != 0) goto L13
            goto L30
        L13:
            boolean r0 = p000.C0449jy.m3072()
            if (r0 == 0) goto L30
            jy r0 = p000.C0449jy.m3071()
            int r1 = r0.m3073()
            r2 = 3
            if (r1 == r2) goto L26
            if (r1 != 0) goto L30
        L26:
            g22 r1 = new g22
            r1.<init>(r3)
            r3.f714 = r1
            r0.m3077(r1)
        L30:
            return
    }
}
