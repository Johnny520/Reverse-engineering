package androidx.viewpager.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
@p000.s92
public class PagerTitleStrip extends android.view.ViewGroup {

    /* JADX INFO: renamed from: σ */
    public static final int[] f1217 = null;

    /* JADX INFO: renamed from: τ */
    public static final int[] f1218 = null;

    /* JADX INFO: renamed from: ε */
    public androidx.viewpager.widget.ViewPager f1219;

    /* JADX INFO: renamed from: ζ */
    public final android.widget.TextView f1220;

    /* JADX INFO: renamed from: η */
    public final android.widget.TextView f1221;

    /* JADX INFO: renamed from: θ */
    public final android.widget.TextView f1222;

    /* JADX INFO: renamed from: ι */
    public int f1223;

    /* JADX INFO: renamed from: κ */
    public float f1224;

    /* JADX INFO: renamed from: λ */
    public int f1225;

    /* JADX INFO: renamed from: μ */
    public int f1226;

    /* JADX INFO: renamed from: ν */
    public boolean f1227;

    /* JADX INFO: renamed from: ξ */
    public boolean f1228;

    /* JADX INFO: renamed from: ο */
    public final p000.f91 f1229;

    /* JADX INFO: renamed from: π */
    public int f1230;

    /* JADX INFO: renamed from: ρ */
    public int f1231;

    static {
            r0 = 16842904(0x1010098, float:2.3693984E-38)
            r1 = 16842927(0x10100af, float:2.3694048E-38)
            r2 = 16842804(0x1010034, float:2.3693704E-38)
            r3 = 16842901(0x1010095, float:2.3693976E-38)
            int[] r0 = new int[]{r2, r3, r0, r1}
            androidx.viewpager.widget.PagerTitleStrip.f1217 = r0
            r0 = 16843660(0x101038c, float:2.3696103E-38)
            int[] r0 = new int[]{r0}
            androidx.viewpager.widget.PagerTitleStrip.f1218 = r0
            return
    }

    public PagerTitleStrip(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public PagerTitleStrip(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r7.<init>(r8, r9)
            r0 = -1
            r7.f1223 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.f1224 = r0
            f91 r0 = new f91
            r0.<init>(r7)
            r7.f1229 = r0
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r8)
            r7.f1220 = r0
            r7.addView(r0)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r8)
            r7.f1221 = r1
            r7.addView(r1)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r8)
            r7.f1222 = r2
            r7.addView(r2)
            int[] r3 = androidx.viewpager.widget.PagerTitleStrip.f1217
            android.content.res.TypedArray r9 = r8.obtainStyledAttributes(r9, r3)
            r3 = 0
            int r4 = r9.getResourceId(r3, r3)
            if (r4 == 0) goto L45
            r0.setTextAppearance(r4)
            r1.setTextAppearance(r4)
            r2.setTextAppearance(r4)
        L45:
            r5 = 1
            int r5 = r9.getDimensionPixelSize(r5, r3)
            if (r5 == 0) goto L56
            float r5 = (float) r5
            r0.setTextSize(r3, r5)
            r1.setTextSize(r3, r5)
            r2.setTextSize(r3, r5)
        L56:
            r5 = 2
            boolean r6 = r9.hasValue(r5)
            if (r6 == 0) goto L6a
            int r5 = r9.getColor(r5, r3)
            r0.setTextColor(r5)
            r1.setTextColor(r5)
            r2.setTextColor(r5)
        L6a:
            r5 = 3
            r6 = 80
            int r5 = r9.getInteger(r5, r6)
            r7.f1226 = r5
            r9.recycle()
            android.content.res.ColorStateList r9 = r1.getTextColors()
            int r9 = r9.getDefaultColor()
            r7.f1231 = r9
            r9 = 1058642330(0x3f19999a, float:0.6)
            r7.setNonPrimaryAlpha(r9)
            android.text.TextUtils$TruncateAt r9 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r9)
            r1.setEllipsize(r9)
            r2.setEllipsize(r9)
            if (r4 == 0) goto La0
            int[] r9 = androidx.viewpager.widget.PagerTitleStrip.f1218
            android.content.res.TypedArray r9 = r8.obtainStyledAttributes(r4, r9)
            boolean r3 = r9.getBoolean(r3, r3)
            r9.recycle()
        La0:
            if (r3 == 0) goto Lac
            setSingleLineAllCaps(r0)
            setSingleLineAllCaps(r1)
            setSingleLineAllCaps(r2)
            goto Lb5
        Lac:
            r0.setSingleLine()
            r1.setSingleLine()
            r2.setSingleLine()
        Lb5:
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            r9 = 1098907648(0x41800000, float:16.0)
            float r8 = r8 * r9
            int r8 = (int) r8
            r7.f1225 = r8
            return
    }

    private static void setSingleLineAllCaps(android.widget.TextView r2) {
            g91 r0 = new g91
            android.content.Context r1 = r2.getContext()
            r0.<init>()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            java.util.Locale r1 = r1.locale
            r0.f4289 = r1
            r2.setTransformationMethod(r0)
            return
    }

    public int getMinHeight() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto Lb
            int r0 = r0.getIntrinsicHeight()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public int getTextSpacing() {
            r0 = this;
            int r0 = r0.f1225
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof androidx.viewpager.widget.ViewPager
            if (r1 == 0) goto L2a
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r0.getAdapter()
            f91 r1 = r3.f1229
            r0.f1242 = r1
            java.util.ArrayList r2 = r0.f1243
            if (r2 != 0) goto L1f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f1243 = r2
        L1f:
            java.util.ArrayList r2 = r0.f1243
            r2.add(r1)
            r3.f1219 = r0
            r3.m554()
            return
        L2a:
            java.lang.String r3 = "PagerTitleStrip must be a direct child of a ViewPager."
            p000.C1080.m7279(r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            androidx.viewpager.widget.ViewPager r0 = r3.f1219
            if (r0 == 0) goto L1f
            r0.getAdapter()
            r3.m554()
            androidx.viewpager.widget.ViewPager r0 = r3.f1219
            v92 r1 = r0.f1242
            r1 = 0
            r0.f1242 = r1
            java.util.ArrayList r0 = r0.f1243
            if (r0 == 0) goto L1d
            f91 r2 = r3.f1229
            r0.remove(r2)
        L1d:
            r3.f1219 = r1
        L1f:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            androidx.viewpager.widget.ViewPager r1 = r0.f1219
            if (r1 == 0) goto L13
            float r1 = r0.f1224
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 < 0) goto Lc
            goto Ld
        Lc:
            r1 = r2
        Ld:
            int r2 = r0.f1223
            r3 = 1
            r0.mo553(r2, r1, r3)
        L13:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r8, int r9) {
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L59
            int r0 = r7.getPaddingTop()
            int r2 = r7.getPaddingBottom()
            int r2 = r2 + r0
            r0 = -2
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r9, r2, r0)
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            float r5 = (float) r4
            r6 = 1045220557(0x3e4ccccd, float:0.2)
            float r5 = r5 * r6
            int r5 = (int) r5
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r5, r0)
            android.widget.TextView r0 = r7.f1220
            r0.measure(r8, r3)
            android.widget.TextView r0 = r7.f1221
            r0.measure(r8, r3)
            android.widget.TextView r5 = r7.f1222
            r5.measure(r8, r3)
            int r8 = android.view.View.MeasureSpec.getMode(r9)
            if (r8 != r1) goto L3e
            int r8 = android.view.View.MeasureSpec.getSize(r9)
            goto L4b
        L3e:
            int r8 = r0.getMeasuredHeight()
            int r1 = r7.getMinHeight()
            int r8 = r8 + r2
            int r8 = java.lang.Math.max(r1, r8)
        L4b:
            int r0 = r0.getMeasuredState()
            int r0 = r0 << 16
            int r8 = android.view.View.resolveSizeAndState(r8, r9, r0)
            r7.setMeasuredDimension(r4, r8)
            return
        L59:
            java.lang.String r7 = "Must measure with an exact width"
            p000.C1080.m7279(r7)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r1 = this;
            boolean r0 = r1.f1227
            if (r0 != 0) goto L7
            super.requestLayout()
        L7:
            return
    }

    public void setGravity(int r1) {
            r0 = this;
            r0.f1226 = r1
            r0.requestLayout()
            return
    }

    public void setNonPrimaryAlpha(float r3) {
            r2 = this;
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            int r3 = (int) r3
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2.f1230 = r3
            int r3 = r3 << 24
            int r0 = r2.f1231
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            r3 = r3 | r0
            android.widget.TextView r0 = r2.f1220
            r0.setTextColor(r3)
            android.widget.TextView r2 = r2.f1222
            r2.setTextColor(r3)
            return
    }

    public void setTextColor(int r3) {
            r2 = this;
            r2.f1231 = r3
            android.widget.TextView r0 = r2.f1221
            r0.setTextColor(r3)
            int r3 = r2.f1230
            int r3 = r3 << 24
            int r0 = r2.f1231
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            r3 = r3 | r0
            android.widget.TextView r0 = r2.f1220
            r0.setTextColor(r3)
            android.widget.TextView r2 = r2.f1222
            r2.setTextColor(r3)
            return
    }

    public void setTextSpacing(int r1) {
            r0 = this;
            r0.f1225 = r1
            r0.requestLayout()
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m554() {
            r2 = this;
            androidx.viewpager.widget.ViewPager r0 = r2.f1219
            if (r0 == 0) goto L15
            r1 = -1
            r2.f1223 = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f1224 = r1
            int r0 = r0.getCurrentItem()
            r2.m555(r0)
            r2.requestLayout()
        L15:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m555(int r9) {
            r8 = this;
            r0 = 1
            r8.f1227 = r0
            android.widget.TextView r0 = r8.f1220
            r1 = 0
            r0.setText(r1)
            android.widget.TextView r2 = r8.f1221
            r2.setText(r1)
            android.widget.TextView r3 = r8.f1222
            r3.setText(r1)
            int r1 = r8.getWidth()
            int r4 = r8.getPaddingLeft()
            int r1 = r1 - r4
            int r4 = r8.getPaddingRight()
            int r1 = r1 - r4
            float r1 = (float) r1
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 * r4
            int r1 = (int) r1
            r4 = 0
            int r1 = java.lang.Math.max(r4, r1)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r6 = r8.getHeight()
            int r7 = r8.getPaddingTop()
            int r6 = r6 - r7
            int r7 = r8.getPaddingBottom()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r4, r6)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r5)
            r0.measure(r1, r5)
            r2.measure(r1, r5)
            r3.measure(r1, r5)
            r8.f1223 = r9
            boolean r0 = r8.f1228
            if (r0 != 0) goto L5c
            float r0 = r8.f1224
            r8.mo553(r9, r0, r4)
        L5c:
            r8.f1227 = r4
            return
    }

    /* JADX INFO: renamed from: γ */
    public void mo553(int r21, float r22, boolean r23) {
            r20 = this;
            r0 = r20
            r1 = r22
            int r2 = r0.f1223
            r3 = r21
            if (r3 == r2) goto L13
            androidx.viewpager.widget.ViewPager r2 = r0.f1219
            r2.getAdapter()
            r20.m555(r21)
            goto L1c
        L13:
            if (r23 != 0) goto L1c
            float r2 = r0.f1224
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L1c
            return
        L1c:
            r2 = 1
            r0.f1228 = r2
            android.widget.TextView r2 = r0.f1220
            int r3 = r2.getMeasuredWidth()
            android.widget.TextView r4 = r0.f1221
            int r5 = r4.getMeasuredWidth()
            android.widget.TextView r6 = r0.f1222
            int r7 = r6.getMeasuredWidth()
            int r8 = r5 / 2
            int r9 = r0.getWidth()
            int r10 = r0.getHeight()
            int r11 = r0.getPaddingLeft()
            int r12 = r0.getPaddingRight()
            int r13 = r0.getPaddingTop()
            int r14 = r0.getPaddingBottom()
            int r15 = r11 + r8
            int r16 = r12 + r8
            int r15 = r9 - r15
            int r15 = r15 - r16
            r17 = 1056964608(0x3f000000, float:0.5)
            float r17 = r1 + r17
            r18 = 1065353216(0x3f800000, float:1.0)
            int r19 = (r17 > r18 ? 1 : (r17 == r18 ? 0 : -1))
            if (r19 <= 0) goto L5f
            float r17 = r17 - r18
        L5f:
            int r16 = r9 - r16
            float r15 = (float) r15
            float r15 = r15 * r17
            int r15 = (int) r15
            int r16 = r16 - r15
            int r8 = r16 - r8
            int r5 = r5 + r8
            int r15 = r2.getBaseline()
            r21 = r3
            int r3 = r4.getBaseline()
            r23 = r7
            int r7 = r6.getBaseline()
            r16 = r9
            int r9 = java.lang.Math.max(r15, r3)
            int r9 = java.lang.Math.max(r9, r7)
            int r15 = r9 - r15
            int r3 = r9 - r3
            int r9 = r9 - r7
            int r7 = r2.getMeasuredHeight()
            int r7 = r7 + r15
            int r17 = r4.getMeasuredHeight()
            r18 = r3
            int r3 = r17 + r18
            int r17 = r6.getMeasuredHeight()
            r19 = r9
            int r9 = r17 + r19
            int r3 = java.lang.Math.max(r7, r3)
            int r3 = java.lang.Math.max(r3, r9)
            int r7 = r0.f1226
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 16
            if (r7 == r9) goto Lc0
            r9 = 80
            if (r7 == r9) goto Lb8
            int r15 = r15 + r13
            int r3 = r13 + r18
            int r13 = r13 + r19
            goto Lc6
        Lb8:
            int r10 = r10 - r14
            int r10 = r10 - r3
        Lba:
            int r15 = r15 + r10
            int r3 = r10 + r18
            int r13 = r10 + r19
            goto Lc6
        Lc0:
            int r10 = r10 - r13
            int r10 = r10 - r14
            int r10 = r10 - r3
            int r10 = r10 / 2
            goto Lba
        Lc6:
            int r7 = r4.getMeasuredHeight()
            int r7 = r7 + r3
            r4.layout(r8, r3, r5, r7)
            int r3 = r0.f1225
            int r8 = r8 - r3
            int r8 = r8 - r21
            int r3 = java.lang.Math.min(r11, r8)
            int r4 = r3 + r21
            int r7 = r2.getMeasuredHeight()
            int r7 = r7 + r15
            r2.layout(r3, r15, r4, r7)
            int r9 = r16 - r12
            int r9 = r9 - r23
            int r2 = r0.f1225
            int r5 = r5 + r2
            int r2 = java.lang.Math.max(r9, r5)
            int r7 = r2 + r23
            int r3 = r6.getMeasuredHeight()
            int r3 = r3 + r13
            r6.layout(r2, r13, r7, r3)
            r0.f1224 = r1
            r1 = 0
            r0.f1228 = r1
            return
    }
}
