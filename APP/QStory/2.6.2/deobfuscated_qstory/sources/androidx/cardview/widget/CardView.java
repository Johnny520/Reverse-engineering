package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bumptech.glide.AbstractC3056;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p182.AbstractC7760;
import p186.C7770;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final int[] f868 = {R.attr.colorBackground};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4870 f869;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Rect f870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Rect f872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f873;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.f872 = rect;
        this.f870 = new Rect();
        C4870 c4870 = new C4870(this, 22);
        this.f869 = c4870;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7760.f21053, i, com.davemorrissey.labs.subscaleview.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f868);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.davemorrissey.labs.subscaleview.R.color.cardview_light_background) : getResources().getColor(com.davemorrissey.labs.subscaleview.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f873 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f871 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C7770 c7770 = new C7770(colorStateListValueOf, dimension);
        c4870.f14160 = c7770;
        setBackgroundDrawable(c7770);
        setClipToOutline(true);
        setElevation(dimension2);
        AbstractC3056.m6702(c4870, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C7770) this.f869.f14160).f21077;
    }

    public float getCardElevation() {
        return ((CardView) this.f869.f14161).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f872.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f872.left;
    }

    public int getContentPaddingRight() {
        return this.f872.right;
    }

    public int getContentPaddingTop() {
        return this.f872.top;
    }

    public float getMaxCardElevation() {
        return ((C7770) this.f869.f14160).f21072;
    }

    public boolean getPreventCornerOverlap() {
        return this.f871;
    }

    public float getRadius() {
        return ((C7770) this.f869.f14160).f21076;
    }

    public boolean getUseCompatPadding() {
        return this.f873;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C7770 c7770 = (C7770) this.f869.f14160;
        if (colorStateListValueOf == null) {
            c7770.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c7770.f21077 = colorStateListValueOf;
        c7770.f21075.setColor(colorStateListValueOf.getColorForState(c7770.getState(), c7770.f21077.getDefaultColor()));
        c7770.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.f869.f14161).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        AbstractC3056.m6702(this.f869, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f871) {
            this.f871 = z;
            C4870 c4870 = this.f869;
            AbstractC3056.m6702(c4870, ((C7770) c4870.f14160).f21072);
        }
    }

    public void setRadius(float f) {
        C7770 c7770 = (C7770) this.f869.f14160;
        if (f == c7770.f21076) {
            return;
        }
        c7770.f21076 = f;
        c7770.m13093(null);
        c7770.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f873 != z) {
            this.f873 = z;
            C4870 c4870 = this.f869;
            AbstractC3056.m6702(c4870, ((C7770) c4870.f14160).f21072);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C7770 c7770 = (C7770) this.f869.f14160;
        if (colorStateList == null) {
            c7770.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c7770.f21077 = colorStateList;
        c7770.f21075.setColor(colorStateList.getColorForState(c7770.getState(), c7770.f21077.getDefaultColor()));
        c7770.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.davemorrissey.labs.subscaleview.R.attr.cardViewStyle);
    }
}
