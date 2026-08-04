package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import yyds.AbstractC0902;
import yyds.AbstractC2734;
import yyds.C1079;
import yyds.C2133;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final int[] f249 = {R.attr.colorBackground};

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Rect f250;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2133 f251;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f252;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Rect f253;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f254;

    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.p000ss.android.ugc.aweme.yyds.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f250 = rect;
        this.f253 = new Rect();
        C2133 c2133 = new C2133(this);
        this.f251 = c2133;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2734.f13438, com.p000ss.android.ugc.aweme.yyds.R.attr.cardViewStyle, com.p000ss.android.ugc.aweme.yyds.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f249);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.p000ss.android.ugc.aweme.yyds.R.color.cardview_light_background) : getResources().getColor(com.p000ss.android.ugc.aweme.yyds.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f252 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f254 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C1079 c1079 = new C1079(colorStateListValueOf, dimension);
        c2133.f10555 = c1079;
        setBackgroundDrawable(c1079);
        setClipToOutline(true);
        setElevation(dimension2);
        AbstractC0902.m2015(c2133, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C1079) this.f251.f10555).f4967;
    }

    public float getCardElevation() {
        return ((CardView) this.f251.f10553).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f250.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f250.left;
    }

    public int getContentPaddingRight() {
        return this.f250.right;
    }

    public int getContentPaddingTop() {
        return this.f250.top;
    }

    public float getMaxCardElevation() {
        return ((C1079) this.f251.f10555).f4969;
    }

    public boolean getPreventCornerOverlap() {
        return this.f254;
    }

    public float getRadius() {
        return ((C1079) this.f251.f10555).f4970;
    }

    public boolean getUseCompatPadding() {
        return this.f252;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C1079 c1079 = (C1079) this.f251.f10555;
        if (colorStateListValueOf == null) {
            c1079.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c1079.f4967 = colorStateListValueOf;
        c1079.f4971.setColor(colorStateListValueOf.getColorForState(c1079.getState(), c1079.f4967.getDefaultColor()));
        c1079.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.f251.f10553).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        AbstractC0902.m2015(this.f251, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f254) {
            this.f254 = z;
            C2133 c2133 = this.f251;
            AbstractC0902.m2015(c2133, ((C1079) c2133.f10555).f4969);
        }
    }

    public void setRadius(float f) {
        C1079 c1079 = (C1079) this.f251.f10555;
        if (f == c1079.f4970) {
            return;
        }
        c1079.f4970 = f;
        c1079.m2284(null);
        c1079.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f252 != z) {
            this.f252 = z;
            C2133 c2133 = this.f251;
            AbstractC0902.m2015(c2133, ((C1079) c2133.f10555).f4969);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C1079 c1079 = (C1079) this.f251.f10555;
        if (colorStateList == null) {
            c1079.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c1079.f4967 = colorStateList;
        c1079.f4971.setColor(colorStateList.getColorForState(c1079.getState(), c1079.f4967.getDefaultColor()));
        c1079.invalidateSelf();
    }

    public CardView(Context context) {
        this(context, null);
    }
}
