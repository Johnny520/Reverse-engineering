package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: r7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0660r7 extends FrameLayout {

    /* JADX INFO: renamed from: i */
    public static final ViewOnTouchListenerC0623q7 f4073i = new ViewOnTouchListenerC0623q7();

    /* JADX INFO: renamed from: a */
    public final m30 f4074a;

    /* JADX INFO: renamed from: b */
    public int f4075b;

    /* JADX INFO: renamed from: c */
    public final float f4076c;

    /* JADX INFO: renamed from: d */
    public final float f4077d;

    /* JADX INFO: renamed from: e */
    public final int f4078e;

    /* JADX INFO: renamed from: f */
    public final int f4079f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f4080g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f4081h;

    public AbstractC0660r7(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(AbstractC0259gf.m1245c0(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1461x);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = oa0.f3426a;
            da0.m901s(this, dimensionPixelSize);
        }
        this.f4075b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f4074a = m30.m1799b(context2, attributeSet, 0, 0).m1731a();
        }
        this.f4076c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0274gu.m1315i(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC0498mu.m1881C(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f4077d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f4078e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f4079f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f4073i);
        setFocusable(true);
        if (getBackground() == null) {
            int iM1207v = g80.m1207v(getBackgroundOverlayColorAlpha(), g80.m1198m(this, R.attr.colorSurface), g80.m1198m(this, R.attr.colorOnSurface));
            m30 m30Var = this.f4074a;
            if (m30Var != null) {
                int i = AbstractC0697s7.f4212a;
                C0350iu c0350iu = new C0350iu(m30Var);
                c0350iu.m1537j(ColorStateList.valueOf(iM1207v));
                drawable = c0350iu;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC0697s7.f4212a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM1207v);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f4080g;
            if (colorStateList != null) {
                AbstractC0187eh.m995h(drawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = oa0.f3426a;
            x90.m2669q(this, drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f4077d;
    }

    public int getAnimationMode() {
        return this.f4075b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f4076c;
    }

    public int getMaxInlineActionWidth() {
        return this.f4079f;
    }

    public int getMaxWidth() {
        return this.f4078e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = oa0.f3426a;
        ba0.m506c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f4078e;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f4075b = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f4080g != null) {
            drawable = drawable.mutate();
            AbstractC0187eh.m995h(drawable, this.f4080g);
            AbstractC0187eh.m996i(drawable, this.f4081h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f4080g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC0187eh.m995h(drawableMutate, colorStateList);
            AbstractC0187eh.m996i(drawableMutate, this.f4081h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f4081h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC0187eh.m996i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f4073i);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC0697s7 abstractC0697s7) {
    }
}
