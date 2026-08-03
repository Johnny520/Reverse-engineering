package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4667 extends Yue.C4670 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f14844 = "PagerTabStrip";

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final int f14845 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final int f14846 = 6;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final int f14847 = 16;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final int f14848 = 32;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final int f14849 = 64;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final int f14850 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final int f14851 = 32;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public int f14852;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int f14853;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int f14854;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int f14855;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int f14856;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public int f14857;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final android.graphics.Paint f14858;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final android.graphics.Rect f14859;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public int f14860;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public boolean f14861;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public boolean f14862;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f14863;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f14864;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f14865;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public float f14866;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public int f14867;

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۧ$ۥ, reason: contains not printable characters */
    public class ViewOnClickListenerC4668 implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4667 f14868;

        public ViewOnClickListenerC4668(Yue.C4667 r1) {
                r0 = this;
                r0.f14868 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                Yue.ۥۣۡۥۧ r2 = r1.f14868
                Yue.ۥۢۤۦ۠ r2 = r2.f14874
                int r0 = r2.getCurrentItem()
                int r0 = r0 + (-1)
                r2.setCurrentItem(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۧ$ۥ۟, reason: contains not printable characters */
    public class ViewOnClickListenerC4669 implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4667 f14869;

        public ViewOnClickListenerC4669(Yue.C4667 r1) {
                r0 = this;
                r0.f14869 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                Yue.ۥۣۡۥۧ r2 = r1.f14869
                Yue.ۥۢۤۦ۠ r2 = r2.f14874
                int r0 = r2.getCurrentItem()
                int r0 = r0 + 1
                r2.setCurrentItem(r0)
                return
        }
    }

    public C4667(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C4667(@Yue.InterfaceC4410 android.content.Context r4, @Yue.InterfaceC4544 android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r3.f14858 = r5
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f14859 = r0
            r0 = 255(0xff, float:3.57E-43)
            r3.f14860 = r0
            r0 = 0
            r3.f14861 = r0
            r3.f14862 = r0
            int r1 = r3.f14887
            r3.f14852 = r1
            r5.setColor(r1)
            android.content.res.Resources r5 = r4.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r5
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.f14853 = r1
            r1 = 1086324736(0x40c00000, float:6.0)
            float r1 = r1 * r5
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.f14854 = r1
            r1 = 1115684864(0x42800000, float:64.0)
            float r1 = r1 * r5
            int r1 = (int) r1
            r3.f14855 = r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r5
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.f14857 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r5
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.f14863 = r1
            r1 = 1107296256(0x42000000, float:32.0)
            float r5 = r5 * r1
            float r5 = r5 + r2
            int r5 = (int) r5
            r3.f14856 = r5
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            int r4 = r4.getScaledTouchSlop()
            r3.f14867 = r4
            int r4 = r3.getPaddingLeft()
            int r5 = r3.getPaddingTop()
            int r1 = r3.getPaddingRight()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r4, r5, r1, r2)
            int r4 = r3.getTextSpacing()
            r3.setTextSpacing(r4)
            r3.setWillNotDraw(r0)
            android.widget.TextView r4 = r3.f14875
            r5 = 1
            r4.setFocusable(r5)
            android.widget.TextView r4 = r3.f14875
            Yue.ۥۣۡۥۧ$ۥ r0 = new Yue.ۥۣۡۥۧ$ۥ
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            android.widget.TextView r4 = r3.f14877
            r4.setFocusable(r5)
            android.widget.TextView r4 = r3.f14877
            Yue.ۥۣۡۥۧ$ۥ۟ r0 = new Yue.ۥۣۡۥۧ$ۥ۟
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto La4
            r3.f14861 = r5
        La4:
            return
    }

    public boolean getDrawFullUnderline() {
            r1 = this;
            boolean r0 = r1.f14861
            return r0
    }

    @Override // Yue.C4670
    public int getMinHeight() {
            r2 = this;
            int r0 = super.getMinHeight()
            int r1 = r2.f14856
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Yue.InterfaceC1230
    public int getTabIndicatorColor() {
            r1 = this;
            int r0 = r1.f14852
            return r0
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r15) {
            r14 = this;
            super.onDraw(r15)
            int r0 = r14.getHeight()
            android.widget.TextView r1 = r14.f14876
            int r1 = r1.getLeft()
            int r2 = r14.f14857
            int r1 = r1 - r2
            android.widget.TextView r2 = r14.f14876
            int r2 = r2.getRight()
            int r3 = r14.f14857
            int r2 = r2 + r3
            int r3 = r14.f14853
            int r3 = r0 - r3
            android.graphics.Paint r4 = r14.f14858
            int r5 = r14.f14860
            int r5 = r5 << 24
            int r6 = r14.f14852
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r7
            r5 = r5 | r6
            r4.setColor(r5)
            float r9 = (float) r1
            float r10 = (float) r3
            float r11 = (float) r2
            float r5 = (float) r0
            android.graphics.Paint r13 = r14.f14858
            r8 = r15
            r12 = r5
            r8.drawRect(r9, r10, r11, r12, r13)
            boolean r1 = r14.f14861
            if (r1 == 0) goto L60
            android.graphics.Paint r1 = r14.f14858
            int r2 = r14.f14852
            r2 = r2 & r7
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 | r3
            r1.setColor(r2)
            int r1 = r14.getPaddingLeft()
            float r2 = (float) r1
            int r1 = r14.f14863
            int r0 = r0 - r1
            float r3 = (float) r0
            int r0 = r14.getWidth()
            int r1 = r14.getPaddingRight()
            int r0 = r0 - r1
            float r4 = (float) r0
            android.graphics.Paint r6 = r14.f14858
            r1 = r15
            r1.drawRect(r2, r3, r4, r5, r6)
        L60:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getAction()
            r1 = 0
            if (r0 == 0) goto Lc
            boolean r2 = r4.f14864
            if (r2 == 0) goto Lc
            return r1
        Lc:
            float r2 = r5.getX()
            float r5 = r5.getY()
            r3 = 1
            if (r0 == 0) goto L6e
            if (r0 == r3) goto L3c
            r1 = 2
            if (r0 == r1) goto L1d
            goto L74
        L1d:
            float r0 = r4.f14865
            float r2 = r2 - r0
            float r0 = java.lang.Math.abs(r2)
            int r1 = r4.f14867
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L39
            float r0 = r4.f14866
            float r5 = r5 - r0
            float r5 = java.lang.Math.abs(r5)
            int r0 = r4.f14867
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L74
        L39:
            r4.f14864 = r3
            goto L74
        L3c:
            android.widget.TextView r5 = r4.f14876
            int r5 = r5.getLeft()
            int r0 = r4.f14857
            int r5 = r5 - r0
            float r5 = (float) r5
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L55
            Yue.ۥۢۤۦ۠ r5 = r4.f14874
            int r0 = r5.getCurrentItem()
            int r0 = r0 - r3
            r5.setCurrentItem(r0)
            goto L74
        L55:
            android.widget.TextView r5 = r4.f14876
            int r5 = r5.getRight()
            int r0 = r4.f14857
            int r5 = r5 + r0
            float r5 = (float) r5
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L74
            Yue.ۥۢۤۦ۠ r5 = r4.f14874
            int r0 = r5.getCurrentItem()
            int r0 = r0 + r3
            r5.setCurrentItem(r0)
            goto L74
        L6e:
            r4.f14865 = r2
            r4.f14866 = r5
            r4.f14864 = r1
        L74:
            return r3
    }

    @Override // android.view.View
    public void setBackgroundColor(@Yue.InterfaceC1230 int r2) {
            r1 = this;
            super.setBackgroundColor(r2)
            boolean r0 = r1.f14862
            if (r0 != 0) goto L11
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r0
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            r1.f14861 = r2
        L11:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            boolean r0 = r1.f14862
            if (r0 != 0) goto Le
            if (r2 != 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.f14861 = r2
        Le:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            boolean r0 = r1.f14862
            if (r0 != 0) goto Le
            if (r2 != 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.f14861 = r2
        Le:
            return
    }

    public void setDrawFullUnderline(boolean r1) {
            r0 = this;
            r0.f14861 = r1
            r1 = 1
            r0.f14862 = r1
            r0.invalidate()
            return
    }

    @Override // android.view.View
    public void setPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r0 = r1.f14854
            if (r5 >= r0) goto L5
            r5 = r0
        L5:
            super.setPadding(r2, r3, r4, r5)
            return
    }

    public void setTabIndicatorColor(@Yue.InterfaceC1230 int r2) {
            r1 = this;
            r1.f14852 = r2
            android.graphics.Paint r0 = r1.f14858
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setTabIndicatorColorResource(@Yue.InterfaceC1241 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = Yue.C1584.m7761(r0, r2)
            r1.setTabIndicatorColor(r2)
            return
    }

    @Override // Yue.C4670
    public void setTextSpacing(int r2) {
            r1 = this;
            int r0 = r1.f14855
            if (r2 >= r0) goto L5
            r2 = r0
        L5:
            super.setTextSpacing(r2)
            return
    }

    @Override // Yue.C4670
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo18526(int r6, float r7, boolean r8) {
            r5 = this;
            android.graphics.Rect r0 = r5.f14859
            int r1 = r5.getHeight()
            android.widget.TextView r2 = r5.f14876
            int r2 = r2.getLeft()
            int r3 = r5.f14857
            int r2 = r2 - r3
            android.widget.TextView r3 = r5.f14876
            int r3 = r3.getRight()
            int r4 = r5.f14857
            int r3 = r3 + r4
            int r4 = r5.f14853
            int r4 = r1 - r4
            r0.set(r2, r4, r3, r1)
            super.mo18526(r6, r7, r8)
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 - r6
            float r6 = java.lang.Math.abs(r7)
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r7
            r7 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.f14860 = r6
            android.widget.TextView r6 = r5.f14876
            int r6 = r6.getLeft()
            int r7 = r5.f14857
            int r6 = r6 - r7
            android.widget.TextView r7 = r5.f14876
            int r7 = r7.getRight()
            int r8 = r5.f14857
            int r7 = r7 + r8
            r0.union(r6, r4, r7, r1)
            r5.invalidate(r0)
            return
    }
}
