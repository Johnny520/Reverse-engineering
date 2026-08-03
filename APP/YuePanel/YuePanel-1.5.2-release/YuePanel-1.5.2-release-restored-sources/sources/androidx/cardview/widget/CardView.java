package androidx.cardview.widget;

import Yue.C3679;
import Yue.C6976;
import Yue.InterfaceC3681;
import Yue.InterfaceC3682;
import Yue.InterfaceC3897;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final InterfaceC3682 IMPL;
    private final InterfaceC3681 mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$ۥ */
    public class C1639 implements InterfaceC3681 {

        /* JADX INFO: renamed from: ۥ */
        public Drawable f3682;

        public C1639() {
        }

        @Override // Yue.InterfaceC3681
        public void setShadowPadding(int i, int i2, int i3, int i4) {
            CardView.this.mShadowBounds.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // Yue.InterfaceC3681
        /* JADX INFO: renamed from: ۥ */
        public void mo751(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.mUserSetMinWidth) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.mUserSetMinHeight) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        @Override // Yue.InterfaceC3681
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo752(Drawable drawable) {
            this.f3682 = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // Yue.InterfaceC3681
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo10100() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // Yue.InterfaceC3681
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo10101() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // Yue.InterfaceC3681
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Drawable mo10102() {
            return this.f3682;
        }

        @Override // Yue.InterfaceC3681
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public View mo10103() {
            return CardView.this;
        }
    }

    static {
        C3679 c3679 = new C3679();
        IMPL = c3679;
        c3679.mo10084();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CardView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC6391
    public ColorStateList getCardBackgroundColor() {
        return IMPL.mo10091(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.mo10086(this.mCardViewDelegate);
    }

    @InterfaceC6844
    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    @InterfaceC6844
    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    @InterfaceC6844
    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    @InterfaceC6844
    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.mo750(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.mo10095(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (IMPL instanceof C3679) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo10093(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo10085(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
        }
        super.onMeasure(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCardBackgroundColor(@InterfaceC3897 int i) {
        IMPL.mo10090(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        IMPL.mo10096(this.mCardViewDelegate, f);
    }

    public void setContentPadding(@InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6844 int i3, @InterfaceC6844 int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.mo10088(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.mo10089(this.mCardViewDelegate, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.mo10087(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f) {
        IMPL.mo749(this.mCardViewDelegate, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.mo10092(this.mCardViewDelegate);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CardView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6976.C1128.f20746);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCardBackgroundColor(@InterfaceC6490 ColorStateList colorStateList) {
        IMPL.mo10090(this.mCardViewDelegate, colorStateList);
    }

    public CardView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        C1639 c1639 = new C1639();
        this.mCardViewDelegate = c1639;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6976.C6979.f2585, i, C6976.C6978.f2584);
        if (typedArrayObtainStyledAttributes.hasValue(C6976.C6979.f20758)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(C6976.C6979.f20758);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(C6976.C1129.f2580);
            } else {
                color = getResources().getColor(C6976.C1129.f2579);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(C6976.C6979.f20759, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C6976.C6979.f20760, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C6976.C6979.f20761, 0.0f);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(C6976.C6979.f20763, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(C6976.C6979.f20762, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6976.C6979.f20764, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6976.C6979.f20766, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6976.C6979.f20768, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6976.C6979.f20767, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6976.C6979.f20765, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6976.C6979.f2586, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6976.C6979.f20757, 0);
        typedArrayObtainStyledAttributes.recycle();
        IMPL.mo10094(c1639, context, colorStateList, dimension, dimension2, f);
    }
}
