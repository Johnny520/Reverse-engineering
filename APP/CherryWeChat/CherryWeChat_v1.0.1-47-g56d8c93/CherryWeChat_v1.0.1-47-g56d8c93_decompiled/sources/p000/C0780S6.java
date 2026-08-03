package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: S6 */
/* JADX INFO: loaded from: classes.dex */
public class C0780S6 extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int[] f2460f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: g */
    public static final C2220m6 f2461g = new C2220m6(5);

    /* JADX INFO: renamed from: a */
    public boolean f2462a;

    /* JADX INFO: renamed from: b */
    public boolean f2463b;

    /* JADX INFO: renamed from: c */
    public final Rect f2464c;

    /* JADX INFO: renamed from: d */
    public final Rect f2465d;

    /* JADX INFO: renamed from: e */
    public final C0649P3 f2466e;

    public C0780S6(Context context) {
        ColorStateList colorStateListValueOf;
        super(context, null, io.github.cherrywechat.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f2464c = rect;
        this.f2465d = new Rect();
        C0649P3 c0649p3 = new C0649P3(10, this);
        this.f2466e = c0649p3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0596Nu.f1927a, io.github.cherrywechat.R.attr.cardViewStyle, io.github.cherrywechat.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f2460f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(io.github.cherrywechat.R.color.cardview_light_background) : getResources().getColor(io.github.cherrywechat.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f2462a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f2463b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C0598Nw c0598Nw = new C0598Nw(colorStateListValueOf, dimension);
        c0649p3.f2089b = c0598Nw;
        setBackgroundDrawable(c0598Nw);
        setClipToOutline(true);
        setElevation(dimension2);
        f2461g.m4471n(c0649p3, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C0598Nw) ((Drawable) this.f2466e.f2089b)).f1935h;
    }

    public float getCardElevation() {
        return ((C0780S6) this.f2466e.f2090c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f2464c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2464c.left;
    }

    public int getContentPaddingRight() {
        return this.f2464c.right;
    }

    public int getContentPaddingTop() {
        return this.f2464c.top;
    }

    public float getMaxCardElevation() {
        return ((C0598Nw) ((Drawable) this.f2466e.f2089b)).f1932e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2463b;
    }

    public float getRadius() {
        return ((C0598Nw) ((Drawable) this.f2466e.f2089b)).f1928a;
    }

    public boolean getUseCompatPadding() {
        return this.f2462a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        C0598Nw c0598Nw = (C0598Nw) ((Drawable) this.f2466e.f2089b);
        if (colorStateListValueOf == null) {
            c0598Nw.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c0598Nw.f1935h = colorStateListValueOf;
        c0598Nw.f1929b.setColor(colorStateListValueOf.getColorForState(c0598Nw.getState(), c0598Nw.f1935h.getDefaultColor()));
        c0598Nw.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((C0780S6) this.f2466e.f2090c).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        f2461g.m4471n(this.f2466e, f);
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
        if (z != this.f2463b) {
            this.f2463b = z;
            C0649P3 c0649p3 = this.f2466e;
            f2461g.m4471n(c0649p3, ((C0598Nw) ((Drawable) c0649p3.f2089b)).f1932e);
        }
    }

    public void setRadius(float f) {
        C0598Nw c0598Nw = (C0598Nw) ((Drawable) this.f2466e.f2089b);
        if (f == c0598Nw.f1928a) {
            return;
        }
        c0598Nw.f1928a = f;
        c0598Nw.m1171b(null);
        c0598Nw.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2462a != z) {
            this.f2462a = z;
            C0649P3 c0649p3 = this.f2466e;
            f2461g.m4471n(c0649p3, ((C0598Nw) ((Drawable) c0649p3.f2089b)).f1932e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C0598Nw c0598Nw = (C0598Nw) ((Drawable) this.f2466e.f2089b);
        if (colorStateList == null) {
            c0598Nw.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c0598Nw.f1935h = colorStateList;
        c0598Nw.f1929b.setColor(colorStateList.getColorForState(c0598Nw.getState(), c0598Nw.f1935h.getDefaultColor()));
        c0598Nw.invalidateSelf();
    }
}
