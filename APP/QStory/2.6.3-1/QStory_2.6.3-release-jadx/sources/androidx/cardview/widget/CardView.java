package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bumptech.glide.AbstractC3898;
import com.davemorrissey.labs.subscaleview.C0328R;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p198.AbstractC8590;
import p202.C8600;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final int[] f1213 = {R.attr.colorBackground};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5703 f1214;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Rect f1215;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f1216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Rect f1217;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f1218;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.f1217 = rect;
        this.f1215 = new Rect();
        C5703 c5703 = new C5703(this, 22);
        this.f1214 = c5703;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8590.f21395, i, C0328R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1213);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(C0328R.color.cardview_light_background) : getResources().getColor(C0328R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f1218 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f1216 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C8600 c8600 = new C8600(colorStateListValueOf, dimension);
        c5703.f14509 = c8600;
        setBackgroundDrawable(c8600);
        setClipToOutline(true);
        setElevation(dimension2);
        AbstractC3898.m7406(c5703, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C8600) this.f1214.f14509).f21419;
    }

    public float getCardElevation() {
        return ((CardView) this.f1214.f14510).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1217.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1217.left;
    }

    public int getContentPaddingRight() {
        return this.f1217.right;
    }

    public int getContentPaddingTop() {
        return this.f1217.top;
    }

    public float getMaxCardElevation() {
        return ((C8600) this.f1214.f14509).f21414;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1216;
    }

    public float getRadius() {
        return ((C8600) this.f1214.f14509).f21418;
    }

    public boolean getUseCompatPadding() {
        return this.f1218;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C8600 c8600 = (C8600) this.f1214.f14509;
        if (colorStateListValueOf == null) {
            c8600.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c8600.f21419 = colorStateListValueOf;
        c8600.f21417.setColor(colorStateListValueOf.getColorForState(c8600.getState(), c8600.f21419.getDefaultColor()));
        c8600.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.f1214.f14510).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        AbstractC3898.m7406(this.f1214, f);
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
        if (z != this.f1216) {
            this.f1216 = z;
            C5703 c5703 = this.f1214;
            AbstractC3898.m7406(c5703, ((C8600) c5703.f14509).f21414);
        }
    }

    public void setRadius(float f) {
        C8600 c8600 = (C8600) this.f1214.f14509;
        if (f == c8600.f21418) {
            return;
        }
        c8600.f21418 = f;
        c8600.m13680(null);
        c8600.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1218 != z) {
            this.f1218 = z;
            C5703 c5703 = this.f1214;
            AbstractC3898.m7406(c5703, ((C8600) c5703.f14509).f21414);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C8600 c8600 = (C8600) this.f1214.f14509;
        if (colorStateList == null) {
            c8600.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c8600.f21419 = colorStateList;
        c8600.f21417.setColor(colorStateList.getColorForState(c8600.getState(), c8600.f21419.getDefaultColor()));
        c8600.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0328R.attr.cardViewStyle);
    }
}
