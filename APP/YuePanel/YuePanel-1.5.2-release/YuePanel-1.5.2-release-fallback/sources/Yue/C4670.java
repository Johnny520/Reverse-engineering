package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.C6857.InterfaceC6862
public class C4670 extends android.view.ViewGroup {

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int[] f14870 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int[] f14871 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final float f14872 = 0.6f;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f14873 = 16;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C6857 f14874;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.widget.TextView f14875;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.widget.TextView f14876;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.widget.TextView f14877;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f14878;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public float f14879;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f14880;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f14881;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f14882;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f14883;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final Yue.C4670.C4671 f14884;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public java.lang.ref.WeakReference<Yue.AbstractC4666> f14885;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int f14886;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public int f14887;

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۨ$ۥ, reason: contains not printable characters */
    public class C4671 extends android.database.DataSetObserver implements Yue.C6857.InterfaceC6867, Yue.C6857.InterfaceC6866 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f14888;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4670 f14889;

        public C4671(Yue.C4670 r1) {
                r0 = this;
                r0.f14889 = r1
                r0.<init>()
                return
        }

        @Override // Yue.C6857.InterfaceC6866
        public void onAdapterChanged(Yue.C6857 r1, Yue.AbstractC4666 r2, Yue.AbstractC4666 r3) {
                r0 = this;
                Yue.ۥۣۡۥۨ r1 = r0.f14889
                r1.m18528(r2, r3)
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r4 = this;
                Yue.ۥۣۡۥۨ r0 = r4.f14889
                Yue.ۥۢۤۦ۠ r1 = r0.f14874
                int r1 = r1.getCurrentItem()
                Yue.ۥۣۡۥۨ r2 = r4.f14889
                Yue.ۥۢۤۦ۠ r2 = r2.f14874
                Yue.ۥۣۡۥۦ r2 = r2.getAdapter()
                r0.m18529(r1, r2)
                Yue.ۥۣۡۥۨ r0 = r4.f14889
                float r1 = r0.f14879
                r2 = 0
                int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r3 < 0) goto L1d
                goto L1e
            L1d:
                r1 = r2
            L1e:
                Yue.ۥۢۤۦ۠ r2 = r0.f14874
                int r2 = r2.getCurrentItem()
                r3 = 1
                r0.mo18526(r2, r1, r3)
                return
        }

        @Override // Yue.C6857.InterfaceC6867
        public void onPageScrollStateChanged(int r1) {
                r0 = this;
                r0.f14888 = r1
                return
        }

        @Override // Yue.C6857.InterfaceC6867
        public void onPageScrolled(int r2, float r3, int r4) {
                r1 = this;
                r4 = 1056964608(0x3f000000, float:0.5)
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 <= 0) goto L8
                int r2 = r2 + 1
            L8:
                Yue.ۥۣۡۥۨ r4 = r1.f14889
                r0 = 0
                r4.mo18526(r2, r3, r0)
                return
        }

        @Override // Yue.C6857.InterfaceC6867
        public void onPageSelected(int r4) {
                r3 = this;
                int r4 = r3.f14888
                if (r4 != 0) goto L2c
                Yue.ۥۣۡۥۨ r4 = r3.f14889
                Yue.ۥۢۤۦ۠ r0 = r4.f14874
                int r0 = r0.getCurrentItem()
                Yue.ۥۣۡۥۨ r1 = r3.f14889
                Yue.ۥۢۤۦ۠ r1 = r1.f14874
                Yue.ۥۣۡۥۦ r1 = r1.getAdapter()
                r4.m18529(r0, r1)
                Yue.ۥۣۡۥۨ r4 = r3.f14889
                float r0 = r4.f14879
                r1 = 0
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 < 0) goto L21
                goto L22
            L21:
                r0 = r1
            L22:
                Yue.ۥۢۤۦ۠ r1 = r4.f14874
                int r1 = r1.getCurrentItem()
                r2 = 1
                r4.mo18526(r1, r0, r2)
            L2c:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۨ$ۥ۟, reason: contains not printable characters */
    public static class C4672 extends android.text.method.SingleLineTransformationMethod {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.util.Locale f14890;

        public C4672(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                android.content.res.Resources r1 = r1.getResources()
                android.content.res.Configuration r1 = r1.getConfiguration()
                java.util.Locale r1 = r1.locale
                r0.f14890 = r1
                return
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public java.lang.CharSequence getTransformation(java.lang.CharSequence r1, android.view.View r2) {
                r0 = this;
                java.lang.CharSequence r1 = super.getTransformation(r1, r2)
                if (r1 == 0) goto L11
                java.lang.String r1 = r1.toString()
                java.util.Locale r2 = r0.f14890
                java.lang.String r1 = r1.toUpperCase(r2)
                goto L12
            L11:
                r1 = 0
            L12:
                return r1
        }
    }

    static {
            r0 = 16842904(0x1010098, float:2.3693984E-38)
            r1 = 16842927(0x10100af, float:2.3694048E-38)
            r2 = 16842804(0x1010034, float:2.3693704E-38)
            r3 = 16842901(0x1010095, float:2.3693976E-38)
            int[] r0 = new int[]{r2, r3, r0, r1}
            Yue.C4670.f14870 = r0
            r0 = 16843660(0x101038c, float:2.3696103E-38)
            int[] r0 = new int[]{r0}
            Yue.C4670.f14871 = r0
            return
    }

    public C4670(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C4670(@Yue.InterfaceC4410 android.content.Context r5, @Yue.InterfaceC4544 android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            r0 = -1
            r4.f14878 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.f14879 = r0
            Yue.ۥۣۡۥۨ$ۥ r0 = new Yue.ۥۣۡۥۨ$ۥ
            r0.<init>(r4)
            r4.f14884 = r0
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            r4.f14875 = r0
            r4.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            r4.f14876 = r0
            r4.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            r4.f14877 = r0
            r4.addView(r0)
            int[] r0 = Yue.C4670.f14870
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r0)
            r0 = 0
            int r1 = r6.getResourceId(r0, r0)
            if (r1 == 0) goto L4b
            android.widget.TextView r2 = r4.f14875
            Yue.C6156.m23066(r2, r1)
            android.widget.TextView r2 = r4.f14876
            Yue.C6156.m23066(r2, r1)
            android.widget.TextView r2 = r4.f14877
            Yue.C6156.m23066(r2, r1)
        L4b:
            r2 = 1
            int r2 = r6.getDimensionPixelSize(r2, r0)
            if (r2 == 0) goto L56
            float r2 = (float) r2
            r4.m18527(r0, r2)
        L56:
            r2 = 2
            boolean r3 = r6.hasValue(r2)
            if (r3 == 0) goto L70
            int r2 = r6.getColor(r2, r0)
            android.widget.TextView r3 = r4.f14875
            r3.setTextColor(r2)
            android.widget.TextView r3 = r4.f14876
            r3.setTextColor(r2)
            android.widget.TextView r3 = r4.f14877
            r3.setTextColor(r2)
        L70:
            r2 = 3
            r3 = 80
            int r2 = r6.getInteger(r2, r3)
            r4.f14881 = r2
            r6.recycle()
            android.widget.TextView r6 = r4.f14876
            android.content.res.ColorStateList r6 = r6.getTextColors()
            int r6 = r6.getDefaultColor()
            r4.f14887 = r6
            r6 = 1058642330(0x3f19999a, float:0.6)
            r4.setNonPrimaryAlpha(r6)
            android.widget.TextView r6 = r4.f14875
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r6.setEllipsize(r2)
            android.widget.TextView r6 = r4.f14876
            r6.setEllipsize(r2)
            android.widget.TextView r6 = r4.f14877
            r6.setEllipsize(r2)
            if (r1 == 0) goto Lae
            int[] r6 = Yue.C4670.f14871
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r1, r6)
            boolean r0 = r6.getBoolean(r0, r0)
            r6.recycle()
        Lae:
            if (r0 == 0) goto Lc0
            android.widget.TextView r6 = r4.f14875
            setSingleLineAllCaps(r6)
            android.widget.TextView r6 = r4.f14876
            setSingleLineAllCaps(r6)
            android.widget.TextView r6 = r4.f14877
            setSingleLineAllCaps(r6)
            goto Lcf
        Lc0:
            android.widget.TextView r6 = r4.f14875
            r6.setSingleLine()
            android.widget.TextView r6 = r4.f14876
            r6.setSingleLine()
            android.widget.TextView r6 = r4.f14877
            r6.setSingleLine()
        Lcf:
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r6 = 1098907648(0x41800000, float:16.0)
            float r5 = r5 * r6
            int r5 = (int) r5
            r4.f14880 = r5
            return
    }

    private static void setSingleLineAllCaps(android.widget.TextView r2) {
            Yue.ۥۣۡۥۨ$ۥ۟ r0 = new Yue.ۥۣۡۥۨ$ۥ۟
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.setTransformationMethod(r0)
            return
    }

    public int getMinHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 == 0) goto Lb
            int r0 = r0.getIntrinsicHeight()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getTextSpacing() {
            r1 = this;
            int r0 = r1.f14880
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof Yue.C6857
            if (r1 == 0) goto L2d
            Yue.ۥۢۤۦ۠ r0 = (Yue.C6857) r0
            Yue.ۥۣۡۥۦ r1 = r0.getAdapter()
            Yue.ۥۣۡۥۨ$ۥ r2 = r3.f14884
            r0.m26619(r2)
            Yue.ۥۣۡۥۨ$ۥ r2 = r3.f14884
            r0.m26574(r2)
            r3.f14874 = r0
            java.lang.ref.WeakReference<Yue.ۥۣۡۥۦ> r0 = r3.f14885
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.get()
            Yue.ۥۣۡۥۦ r0 = (Yue.AbstractC4666) r0
            goto L29
        L28:
            r0 = 0
        L29:
            r3.m18528(r0, r1)
            return
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "PagerTitleStrip must be a direct child of a ViewPager."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            Yue.ۥۢۤۦ۠ r0 = r3.f14874
            if (r0 == 0) goto L1d
            Yue.ۥۣۡۥۦ r0 = r0.getAdapter()
            r1 = 0
            r3.m18528(r0, r1)
            Yue.ۥۢۤۦ۠ r0 = r3.f14874
            r0.m26619(r1)
            Yue.ۥۢۤۦ۠ r0 = r3.f14874
            Yue.ۥۣۡۥۨ$ۥ r2 = r3.f14884
            r0.m26611(r2)
            r3.f14874 = r1
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            Yue.ۥۢۤۦ۠ r1 = r0.f14874
            if (r1 == 0) goto L13
            float r1 = r0.f14879
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 < 0) goto Lc
            goto Ld
        Lc:
            r1 = r2
        Ld:
            int r2 = r0.f14878
            r3 = 1
            r0.mo18526(r2, r1, r3)
        L13:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r8, int r9) {
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L5d
            int r0 = r7.getPaddingTop()
            int r2 = r7.getPaddingBottom()
            int r0 = r0 + r2
            r2 = -2
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r9, r0, r2)
            int r4 = android.view.View.MeasureSpec.getSize(r8)
            float r5 = (float) r4
            r6 = 1045220557(0x3e4ccccd, float:0.2)
            float r5 = r5 * r6
            int r5 = (int) r5
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r5, r2)
            android.widget.TextView r2 = r7.f14875
            r2.measure(r8, r3)
            android.widget.TextView r2 = r7.f14876
            r2.measure(r8, r3)
            android.widget.TextView r2 = r7.f14877
            r2.measure(r8, r3)
            int r8 = android.view.View.MeasureSpec.getMode(r9)
            if (r8 != r1) goto L3e
            int r8 = android.view.View.MeasureSpec.getSize(r9)
            goto L4d
        L3e:
            android.widget.TextView r8 = r7.f14876
            int r8 = r8.getMeasuredHeight()
            int r1 = r7.getMinHeight()
            int r8 = r8 + r0
            int r8 = java.lang.Math.max(r1, r8)
        L4d:
            android.widget.TextView r0 = r7.f14876
            int r0 = r0.getMeasuredState()
            int r0 = r0 << 16
            int r8 = android.view.View.resolveSizeAndState(r8, r9, r0)
            r7.setMeasuredDimension(r4, r8)
            return
        L5d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Must measure with an exact width"
            r8.<init>(r9)
            throw r8
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            boolean r0 = r1.f14882
            if (r0 != 0) goto L7
            super.requestLayout()
        L7:
            return
    }

    public void setGravity(int r1) {
            r0 = this;
            r0.f14881 = r1
            r0.requestLayout()
            return
    }

    public void setNonPrimaryAlpha(@Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r3) {
            r2 = this;
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            int r3 = (int) r3
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2.f14886 = r3
            int r3 = r3 << 24
            int r0 = r2.f14887
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            r3 = r3 | r0
            android.widget.TextView r0 = r2.f14875
            r0.setTextColor(r3)
            android.widget.TextView r0 = r2.f14877
            r0.setTextColor(r3)
            return
    }

    public void setTextColor(@Yue.InterfaceC1230 int r3) {
            r2 = this;
            r2.f14887 = r3
            android.widget.TextView r0 = r2.f14876
            r0.setTextColor(r3)
            int r3 = r2.f14886
            int r3 = r3 << 24
            int r0 = r2.f14887
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            r3 = r3 | r0
            android.widget.TextView r0 = r2.f14875
            r0.setTextColor(r3)
            android.widget.TextView r0 = r2.f14877
            r0.setTextColor(r3)
            return
    }

    public void setTextSpacing(int r1) {
            r0 = this;
            r0.f14880 = r1
            r0.requestLayout()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m18527(int r2, float r3) {
            r1 = this;
            android.widget.TextView r0 = r1.f14875
            r0.setTextSize(r2, r3)
            android.widget.TextView r0 = r1.f14876
            r0.setTextSize(r2, r3)
            android.widget.TextView r0 = r1.f14877
            r0.setTextSize(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m18528(Yue.AbstractC4666 r2, Yue.AbstractC4666 r3) {
            r1 = this;
            if (r2 == 0) goto La
            Yue.ۥۣۡۥۨ$ۥ r0 = r1.f14884
            r2.m18525(r0)
            r2 = 0
            r1.f14885 = r2
        La:
            if (r3 == 0) goto L18
            Yue.ۥۣۡۥۨ$ۥ r2 = r1.f14884
            r3.m18521(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.f14885 = r2
        L18:
            Yue.ۥۢۤۦ۠ r2 = r1.f14874
            if (r2 == 0) goto L2d
            r0 = -1
            r1.f14878 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.f14879 = r0
            int r2 = r2.getCurrentItem()
            r1.m18529(r2, r3)
            r1.requestLayout()
        L2d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m18529(int r6, Yue.AbstractC4666 r7) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L8
            int r1 = r7.m18515()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = 1
            r5.f14882 = r2
            r3 = 0
            if (r6 < r2) goto L18
            if (r7 == 0) goto L18
            int r2 = r6 + (-1)
            java.lang.CharSequence r2 = r7.m18517(r2)
            goto L19
        L18:
            r2 = r3
        L19:
            android.widget.TextView r4 = r5.f14875
            r4.setText(r2)
            android.widget.TextView r2 = r5.f14876
            if (r7 == 0) goto L29
            if (r6 >= r1) goto L29
            java.lang.CharSequence r4 = r7.m18517(r6)
            goto L2a
        L29:
            r4 = r3
        L2a:
            r2.setText(r4)
            int r2 = r6 + 1
            if (r2 >= r1) goto L37
            if (r7 == 0) goto L37
            java.lang.CharSequence r3 = r7.m18517(r2)
        L37:
            android.widget.TextView r7 = r5.f14877
            r7.setText(r3)
            int r7 = r5.getWidth()
            int r1 = r5.getPaddingLeft()
            int r7 = r7 - r1
            int r1 = r5.getPaddingRight()
            int r7 = r7 - r1
            float r7 = (float) r7
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r7 = r7 * r1
            int r7 = (int) r7
            int r7 = java.lang.Math.max(r0, r7)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r2 = r5.getHeight()
            int r3 = r5.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r5.getPaddingBottom()
            int r2 = r2 - r3
            int r2 = java.lang.Math.max(r0, r2)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            android.widget.TextView r2 = r5.f14875
            r2.measure(r7, r1)
            android.widget.TextView r2 = r5.f14876
            r2.measure(r7, r1)
            android.widget.TextView r2 = r5.f14877
            r2.measure(r7, r1)
            r5.f14878 = r6
            boolean r7 = r5.f14883
            if (r7 != 0) goto L8a
            float r7 = r5.f14879
            r5.mo18526(r6, r7, r0)
        L8a:
            r5.f14882 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo18526(int r18, float r19, boolean r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.f14878
            if (r1 == r3) goto L14
            Yue.ۥۢۤۦ۠ r3 = r0.f14874
            Yue.ۥۣۡۥۦ r3 = r3.getAdapter()
            r0.m18529(r1, r3)
            goto L1d
        L14:
            if (r20 != 0) goto L1d
            float r1 = r0.f14879
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L1d
            return
        L1d:
            r1 = 1
            r0.f14883 = r1
            android.widget.TextView r1 = r0.f14875
            int r1 = r1.getMeasuredWidth()
            android.widget.TextView r3 = r0.f14876
            int r3 = r3.getMeasuredWidth()
            android.widget.TextView r4 = r0.f14877
            int r4 = r4.getMeasuredWidth()
            int r5 = r3 / 2
            int r6 = r17.getWidth()
            int r7 = r17.getHeight()
            int r8 = r17.getPaddingLeft()
            int r9 = r17.getPaddingRight()
            int r10 = r17.getPaddingTop()
            int r11 = r17.getPaddingBottom()
            int r12 = r8 + r5
            int r13 = r9 + r5
            int r12 = r6 - r12
            int r12 = r12 - r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 + r2
            r15 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r16 <= 0) goto L5d
            float r14 = r14 - r15
        L5d:
            int r13 = r6 - r13
            float r12 = (float) r12
            float r12 = r12 * r14
            int r12 = (int) r12
            int r13 = r13 - r12
            int r13 = r13 - r5
            int r3 = r3 + r13
            android.widget.TextView r5 = r0.f14875
            int r5 = r5.getBaseline()
            android.widget.TextView r12 = r0.f14876
            int r12 = r12.getBaseline()
            android.widget.TextView r14 = r0.f14877
            int r14 = r14.getBaseline()
            int r15 = java.lang.Math.max(r5, r12)
            int r15 = java.lang.Math.max(r15, r14)
            int r5 = r15 - r5
            int r12 = r15 - r12
            int r15 = r15 - r14
            android.widget.TextView r14 = r0.f14875
            int r14 = r14.getMeasuredHeight()
            int r14 = r14 + r5
            android.widget.TextView r2 = r0.f14876
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r12
            r18 = r4
            android.widget.TextView r4 = r0.f14877
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r2 = java.lang.Math.max(r14, r2)
            int r2 = java.lang.Math.max(r2, r4)
            int r4 = r0.f14881
            r4 = r4 & 112(0x70, float:1.57E-43)
            r14 = 16
            if (r4 == r14) goto Lba
            r14 = 80
            if (r4 == r14) goto Lb3
            int r5 = r5 + r10
            int r12 = r12 + r10
            int r10 = r10 + r15
            goto Lc0
        Lb3:
            int r7 = r7 - r11
            int r7 = r7 - r2
        Lb5:
            int r5 = r5 + r7
            int r12 = r12 + r7
            int r10 = r7 + r15
            goto Lc0
        Lba:
            int r7 = r7 - r10
            int r7 = r7 - r11
            int r7 = r7 - r2
            int r7 = r7 / 2
            goto Lb5
        Lc0:
            android.widget.TextView r2 = r0.f14876
            int r4 = r2.getMeasuredHeight()
            int r4 = r4 + r12
            r2.layout(r13, r12, r3, r4)
            int r2 = r0.f14880
            int r13 = r13 - r2
            int r13 = r13 - r1
            int r2 = java.lang.Math.min(r8, r13)
            android.widget.TextView r4 = r0.f14875
            int r1 = r1 + r2
            int r7 = r4.getMeasuredHeight()
            int r7 = r7 + r5
            r4.layout(r2, r5, r1, r7)
            int r6 = r6 - r9
            int r6 = r6 - r18
            int r1 = r0.f14880
            int r3 = r3 + r1
            int r1 = java.lang.Math.max(r6, r3)
            android.widget.TextView r2 = r0.f14877
            int r4 = r1 + r18
            int r3 = r2.getMeasuredHeight()
            int r3 = r3 + r10
            r2.layout(r1, r10, r4, r3)
            r1 = r19
            r0.f14879 = r1
            r1 = 0
            r0.f14883 = r1
            return
    }
}
