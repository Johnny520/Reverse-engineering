package androidx.cardview.widget;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends android.widget.FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = null;
    private static final Yue.InterfaceC0955 IMPL = null;
    private final Yue.InterfaceC0954 mCardViewDelegate;
    private boolean mCompatPadding;
    final android.graphics.Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final android.graphics.Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$ۥ, reason: contains not printable characters */
    public class C7448 implements Yue.InterfaceC0954 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.graphics.drawable.Drawable f25885;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.cardview.widget.CardView f25886;

        public C7448(androidx.cardview.widget.CardView r1) {
                r0 = this;
                r0.f25886 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC0954
        public void setShadowPadding(int r4, int r5, int r6, int r7) {
                r3 = this;
                androidx.cardview.widget.CardView r0 = r3.f25886
                android.graphics.Rect r0 = r0.mShadowBounds
                r0.set(r4, r5, r6, r7)
                androidx.cardview.widget.CardView r0 = r3.f25886
                android.graphics.Rect r1 = r0.mContentPadding
                int r2 = r1.left
                int r4 = r4 + r2
                int r2 = r1.top
                int r5 = r5 + r2
                int r2 = r1.right
                int r6 = r6 + r2
                int r1 = r1.bottom
                int r7 = r7 + r1
                androidx.cardview.widget.CardView.access$001(r0, r4, r5, r6, r7)
                return
        }

        @Override // Yue.InterfaceC0954
        /* JADX INFO: renamed from: ۥ */
        public void mo5407(int r3, int r4) {
                r2 = this;
                androidx.cardview.widget.CardView r0 = r2.f25886
                int r1 = r0.mUserSetMinWidth
                if (r3 <= r1) goto L9
                androidx.cardview.widget.CardView.access$101(r0, r3)
            L9:
                androidx.cardview.widget.CardView r3 = r2.f25886
                int r0 = r3.mUserSetMinHeight
                if (r4 <= r0) goto L12
                androidx.cardview.widget.CardView.access$201(r3, r4)
            L12:
                return
        }

        @Override // Yue.InterfaceC0954
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo5408(android.graphics.drawable.Drawable r2) {
                r1 = this;
                r1.f25885 = r2
                androidx.cardview.widget.CardView r0 = r1.f25886
                r0.setBackgroundDrawable(r2)
                return
        }

        @Override // Yue.InterfaceC0954
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo5409() {
                r1 = this;
                androidx.cardview.widget.CardView r0 = r1.f25886
                boolean r0 = r0.getPreventCornerOverlap()
                return r0
        }

        @Override // Yue.InterfaceC0954
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo5410() {
                r1 = this;
                androidx.cardview.widget.CardView r0 = r1.f25886
                boolean r0 = r0.getUseCompatPadding()
                return r0
        }

        @Override // Yue.InterfaceC0954
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public android.graphics.drawable.Drawable mo5411() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.f25885
                return r0
        }

        @Override // Yue.InterfaceC0954
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public android.view.View mo5412() {
                r1 = this;
                androidx.cardview.widget.CardView r0 = r1.f25886
                return r0
        }
    }

    static {
            r0 = 16842801(0x1010031, float:2.3693695E-38)
            int[] r0 = new int[]{r0}
            androidx.cardview.widget.CardView.COLOR_BACKGROUND_ATTR = r0
            Yue.ۥ۟ۤ۟۠ r0 = new Yue.ۥ۟ۤ۟۠
            r0.<init>()
            androidx.cardview.widget.CardView.IMPL = r0
            r0.mo5388()
            return
    }

    public CardView(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CardView(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5155.C5156.f19087
            r1.<init>(r2, r3, r0)
            return
    }

    public CardView(@Yue.InterfaceC4410 android.content.Context r10, @Yue.InterfaceC4544 android.util.AttributeSet r11, int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.mContentPadding = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r9.mShadowBounds = r1
            androidx.cardview.widget.CardView$ۥ r3 = new androidx.cardview.widget.CardView$ۥ
            r3.<init>(r9)
            r9.mCardViewDelegate = r3
            int[] r1 = Yue.C5155.C5160.f19104
            int r2 = Yue.C5155.C5159.f19101
            android.content.res.TypedArray r11 = r10.obtainStyledAttributes(r11, r1, r12, r2)
            int r12 = Yue.C5155.C5160.f19107
            boolean r12 = r11.hasValue(r12)
            r1 = 0
            if (r12 == 0) goto L31
            int r12 = Yue.C5155.C5160.f19107
            android.content.res.ColorStateList r12 = r11.getColorStateList(r12)
        L2f:
            r5 = r12
            goto L6b
        L31:
            android.content.Context r12 = r9.getContext()
            int[] r2 = androidx.cardview.widget.CardView.COLOR_BACKGROUND_ATTR
            android.content.res.TypedArray r12 = r12.obtainStyledAttributes(r2)
            int r2 = r12.getColor(r1, r1)
            r12.recycle()
            r12 = 3
            float[] r12 = new float[r12]
            android.graphics.Color.colorToHSV(r2, r12)
            r2 = 2
            r12 = r12[r2]
            r2 = 1056964608(0x3f000000, float:0.5)
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto L5c
            android.content.res.Resources r12 = r9.getResources()
            int r2 = Yue.C5155.C5157.f19094
            int r12 = r12.getColor(r2)
            goto L66
        L5c:
            android.content.res.Resources r12 = r9.getResources()
            int r2 = Yue.C5155.C5157.f19093
            int r12 = r12.getColor(r2)
        L66:
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            goto L2f
        L6b:
            int r12 = Yue.C5155.C5160.f19108
            r2 = 0
            float r6 = r11.getDimension(r12, r2)
            int r12 = Yue.C5155.C5160.f19109
            float r7 = r11.getDimension(r12, r2)
            int r12 = Yue.C5155.C5160.f19110
            float r12 = r11.getDimension(r12, r2)
            int r2 = Yue.C5155.C5160.f19112
            boolean r2 = r11.getBoolean(r2, r1)
            r9.mCompatPadding = r2
            int r2 = Yue.C5155.C5160.f19111
            r4 = 1
            boolean r2 = r11.getBoolean(r2, r4)
            r9.mPreventCornerOverlap = r2
            int r2 = Yue.C5155.C5160.f19113
            int r2 = r11.getDimensionPixelSize(r2, r1)
            int r4 = Yue.C5155.C5160.f19115
            int r4 = r11.getDimensionPixelSize(r4, r2)
            r0.left = r4
            int r4 = Yue.C5155.C5160.f19117
            int r4 = r11.getDimensionPixelSize(r4, r2)
            r0.top = r4
            int r4 = Yue.C5155.C5160.f19116
            int r4 = r11.getDimensionPixelSize(r4, r2)
            r0.right = r4
            int r4 = Yue.C5155.C5160.f19114
            int r2 = r11.getDimensionPixelSize(r4, r2)
            r0.bottom = r2
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 <= 0) goto Lbb
            r8 = r7
            goto Lbc
        Lbb:
            r8 = r12
        Lbc:
            int r12 = Yue.C5155.C5160.f19105
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r9.mUserSetMinWidth = r12
            int r12 = Yue.C5155.C5160.f19106
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r9.mUserSetMinHeight = r12
            r11.recycle()
            Yue.ۥۣ۟ۤ۟ r2 = androidx.cardview.widget.CardView.IMPL
            r4 = r10
            r2.mo5401(r3, r4, r5, r6, r7, r8)
            return
    }

    public static /* synthetic */ void access$001(androidx.cardview.widget.CardView r0, int r1, int r2, int r3, int r4) {
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void access$101(androidx.cardview.widget.CardView r0, int r1) {
            super.setMinimumWidth(r1)
            return
    }

    public static /* synthetic */ void access$201(androidx.cardview.widget.CardView r0, int r1) {
            super.setMinimumHeight(r1)
            return
    }

    @Yue.InterfaceC4410
    public android.content.res.ColorStateList getCardBackgroundColor() {
            r2 = this;
            Yue.ۥۣ۟ۤ۟ r0 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r1 = r2.mCardViewDelegate
            android.content.res.ColorStateList r0 = r0.mo5398(r1)
            return r0
    }

    public float getCardElevation() {
            r2 = this;
            Yue.ۥۣ۟ۤ۟ r0 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r1 = r2.mCardViewDelegate
            float r0 = r0.mo5393(r1)
            return r0
    }

    @Yue.InterfaceC4992
    public int getContentPaddingBottom() {
            r1 = this;
            android.graphics.Rect r0 = r1.mContentPadding
            int r0 = r0.bottom
            return r0
    }

    @Yue.InterfaceC4992
    public int getContentPaddingLeft() {
            r1 = this;
            android.graphics.Rect r0 = r1.mContentPadding
            int r0 = r0.left
            return r0
    }

    @Yue.InterfaceC4992
    public int getContentPaddingRight() {
            r1 = this;
            android.graphics.Rect r0 = r1.mContentPadding
            int r0 = r0.right
            return r0
    }

    @Yue.InterfaceC4992
    public int getContentPaddingTop() {
            r1 = this;
            android.graphics.Rect r0 = r1.mContentPadding
            int r0 = r0.top
            return r0
    }

    public float getMaxCardElevation() {
            r2 = this;
            Yue.ۥۣ۟ۤ۟ r0 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r1 = r2.mCardViewDelegate
            float r0 = r0.mo5391(r1)
            return r0
    }

    public boolean getPreventCornerOverlap() {
            r1 = this;
            boolean r0 = r1.mPreventCornerOverlap
            return r0
    }

    public float getRadius() {
            r2 = this;
            Yue.ۥۣ۟ۤ۟ r0 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r1 = r2.mCardViewDelegate
            float r0 = r0.mo5402(r1)
            return r0
    }

    public boolean getUseCompatPadding() {
            r1 = this;
            boolean r0 = r1.mCompatPadding
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            Yue.ۥۣ۟ۤ۟ r0 = androidx.cardview.widget.CardView.IMPL
            boolean r1 = r0 instanceof Yue.C0951
            if (r1 != 0) goto L50
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L13
            if (r1 == r2) goto L13
            goto L2b
        L13:
            Yue.ۥ۟ۤ۟ۢ r4 = r6.mCardViewDelegate
            float r4 = r0.mo5400(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.max(r4, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
        L2b:
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r1 == r3) goto L34
            if (r1 == r2) goto L34
            goto L4c
        L34:
            Yue.ۥ۟ۤ۟ۢ r2 = r6.mCardViewDelegate
            float r0 = r0.mo5392(r2)
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.max(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L4c:
            super.onMeasure(r7, r8)
            goto L53
        L50:
            super.onMeasure(r7, r8)
        L53:
            return
    }

    public void setCardBackgroundColor(@Yue.InterfaceC1230 int r3) {
            r2 = this;
            Yue.ۥۣ۟ۤ۟ r0 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r1 = r2.mCardViewDelegate
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r0.mo5397(r1, r3)
            return
    }

    public void setCardBackgroundColor(@Yue.InterfaceC4544 android.content.res.ColorStateList r3) {
            r2 = this;
            Yue.ۥۣ۟ۤ۟ r0 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r1 = r2.mCardViewDelegate
            r0.mo5397(r1, r3)
            return
    }

    public void setCardElevation(float r3) {
            r2 = this;
            Yue.ۥۣ۟ۤ۟ r0 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r1 = r2.mCardViewDelegate
            r0.mo5403(r1, r3)
            return
    }

    public void setContentPadding(@Yue.InterfaceC4992 int r2, @Yue.InterfaceC4992 int r3, @Yue.InterfaceC4992 int r4, @Yue.InterfaceC4992 int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.mContentPadding
            r0.set(r2, r3, r4, r5)
            Yue.ۥۣ۟ۤ۟ r2 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r3 = r1.mCardViewDelegate
            r2.mo5395(r3)
            return
    }

    public void setMaxCardElevation(float r3) {
            r2 = this;
            Yue.ۥۣ۟ۤ۟ r0 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r1 = r2.mCardViewDelegate
            r0.mo5396(r1, r3)
            return
    }

    @Override // android.view.View
    public void setMinimumHeight(int r1) {
            r0 = this;
            r0.mUserSetMinHeight = r1
            super.setMinimumHeight(r1)
            return
    }

    @Override // android.view.View
    public void setMinimumWidth(int r1) {
            r0 = this;
            r0.mUserSetMinWidth = r1
            super.setMinimumWidth(r1)
            return
    }

    @Override // android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setPaddingRelative(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public void setPreventCornerOverlap(boolean r2) {
            r1 = this;
            boolean r0 = r1.mPreventCornerOverlap
            if (r2 == r0) goto Ld
            r1.mPreventCornerOverlap = r2
            Yue.ۥۣ۟ۤ۟ r2 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r0 = r1.mCardViewDelegate
            r2.mo5394(r0)
        Ld:
            return
    }

    public void setRadius(float r3) {
            r2 = this;
            Yue.ۥۣ۟ۤ۟ r0 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r1 = r2.mCardViewDelegate
            r0.mo5390(r1, r3)
            return
    }

    public void setUseCompatPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.mCompatPadding
            if (r0 == r2) goto Ld
            r1.mCompatPadding = r2
            Yue.ۥۣ۟ۤ۟ r2 = androidx.cardview.widget.CardView.IMPL
            Yue.ۥ۟ۤ۟ۢ r0 = r1.mCardViewDelegate
            r2.mo5399(r0)
        Ld:
            return
    }
}
