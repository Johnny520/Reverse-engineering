package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲈᛶᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2676 extends C0430 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public PorterDuff.Mode f13126;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f13127;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public ColorStateList f13128;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f13129;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f13130;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f13131;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Drawable f13132;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0549 f13133;

    public C2676(Context context, AttributeSet attributeSet) {
        int resourceId;
        Drawable drawableM2767;
        super(context, attributeSet, R.attr.materialButtonStyle);
        int[] iArr = AbstractC1165.f5361;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.materialButtonStyle, R.style.Widget_MaterialComponents_Button);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            AbstractC0427.m1196(context, AbstractC0427.f2180, "Theme.MaterialComponents");
        }
        AbstractC0427.m1196(context, AbstractC0427.f2179, "Theme.AppCompat");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, R.attr.materialButtonStyle, R.style.Widget_MaterialComponents_Button);
        if (typedArrayObtainStyledAttributes2.getBoolean(2, false)) {
            boolean z2 = typedArrayObtainStyledAttributes2.getResourceId(0, -1) != -1;
            typedArrayObtainStyledAttributes2.recycle();
            if (!z2) {
                C0188.m798("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
                throw null;
            }
        } else {
            typedArrayObtainStyledAttributes2.recycle();
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, AbstractC1165.f5364, R.attr.materialButtonStyle, R.style.Widget_MaterialComponents_Button);
        this.f13129 = typedArrayObtainStyledAttributes3.getDimensionPixelSize(9, 0);
        int i = typedArrayObtainStyledAttributes3.getInt(12, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f13126 = AbstractC1367.m2766(i);
        this.f13128 = AbstractC0902.m2011(getContext(), typedArrayObtainStyledAttributes3, 11);
        this.f13132 = (!typedArrayObtainStyledAttributes3.hasValue(7) || (resourceId = typedArrayObtainStyledAttributes3.getResourceId(7, 0)) == 0 || (drawableM2767 = AbstractC1367.m2767(getContext(), resourceId)) == null) ? typedArrayObtainStyledAttributes3.getDrawable(7) : drawableM2767;
        this.f13127 = typedArrayObtainStyledAttributes3.getInteger(8, 1);
        this.f13130 = typedArrayObtainStyledAttributes3.getDimensionPixelSize(10, 0);
        C0549 c0549 = new C0549(this);
        this.f13133 = c0549;
        c0549.f2632 = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(0, 0);
        c0549.f2637 = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(1, 0);
        c0549.f2640 = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(2, 0);
        c0549.f2629 = typedArrayObtainStyledAttributes3.getDimensionPixelOffset(3, 0);
        c0549.f2639 = typedArrayObtainStyledAttributes3.getDimensionPixelSize(6, 0);
        c0549.f2633 = typedArrayObtainStyledAttributes3.getDimensionPixelSize(15, 0);
        c0549.f2626 = AbstractC1367.m2766(typedArrayObtainStyledAttributes3.getInt(5, -1));
        C2676 c2676 = c0549.f2630;
        c0549.f2628 = AbstractC0902.m2011(c2676.getContext(), typedArrayObtainStyledAttributes3, 4);
        c0549.f2636 = AbstractC0902.m2011(c2676.getContext(), typedArrayObtainStyledAttributes3, 14);
        c0549.f2634 = AbstractC0902.m2011(c2676.getContext(), typedArrayObtainStyledAttributes3, 13);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = c0549.f2635;
        paint.setStyle(style);
        paint.setStrokeWidth(c0549.f2633);
        ColorStateList colorStateList = c0549.f2636;
        paint.setColor(colorStateList != null ? colorStateList.getColorForState(c2676.getDrawableState(), 0) : 0);
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        int paddingStart = c2676.getPaddingStart();
        int paddingTop = c2676.getPaddingTop();
        int paddingEnd = c2676.getPaddingEnd();
        int paddingBottom = c2676.getPaddingBottom();
        c2676.setInternalBackground(c0549.m1390());
        c2676.setPaddingRelative(paddingStart + c0549.f2632, paddingTop + c0549.f2640, paddingEnd + c0549.f2637, paddingBottom + c0549.f2629);
        typedArrayObtainStyledAttributes3.recycle();
        setCompoundDrawablePadding(this.f13129);
        m4771();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m4770()) {
            return this.f13133.f2639;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f13132;
    }

    public int getIconGravity() {
        return this.f13127;
    }

    public int getIconPadding() {
        return this.f13129;
    }

    public int getIconSize() {
        return this.f13130;
    }

    public ColorStateList getIconTint() {
        return this.f13128;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f13126;
    }

    public ColorStateList getRippleColor() {
        if (m4770()) {
            return this.f13133.f2634;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m4770()) {
            return this.f13133.f2636;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m4770()) {
            return this.f13133.f2633;
        }
        return 0;
    }

    @Override // yyds.C0430
    public ColorStateList getSupportBackgroundTintList() {
        return m4770() ? this.f13133.f2628 : super.getSupportBackgroundTintList();
    }

    @Override // yyds.C0430
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m4770() ? this.f13133.f2626 : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f13132 == null || this.f13127 != 2) {
            return;
        }
        int iMeasureText = (int) getPaint().measureText(getText().toString());
        int intrinsicWidth = this.f13130;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f13132.getIntrinsicWidth();
        }
        int measuredWidth = getMeasuredWidth() - iMeasureText;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        int paddingEnd = ((((measuredWidth - getPaddingEnd()) - intrinsicWidth) - this.f13129) - getPaddingStart()) / 2;
        if (getLayoutDirection() == 1) {
            paddingEnd = -paddingEnd;
        }
        if (this.f13131 != paddingEnd) {
            this.f13131 = paddingEnd;
            m4771();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m4770()) {
            super.setBackgroundColor(i);
            return;
        }
        GradientDrawable gradientDrawable = this.f13133.f2627;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
    }

    @Override // yyds.C0430, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m4770()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.i("MaterialButton", "Setting a custom background is not supported.");
        C0549 c0549 = this.f13133;
        c0549.f2638 = true;
        C2676 c2676 = c0549.f2630;
        c2676.setSupportBackgroundTintList(c0549.f2628);
        c2676.setSupportBackgroundTintMode(c0549.f2626);
        super.setBackgroundDrawable(drawable);
    }

    @Override // yyds.C0430, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC1367.m2767(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i) {
        if (m4770()) {
            C0549 c0549 = this.f13133;
            if (c0549.f2639 != i) {
                c0549.f2639 = i;
                GradientDrawable gradientDrawable = c0549.f2627;
                if (gradientDrawable == null || c0549.f2625 == null || c0549.f2631 == null) {
                    return;
                }
                float f = i + 1.0E-5f;
                gradientDrawable.setCornerRadius(f);
                c0549.f2625.setCornerRadius(f);
                c0549.f2631.setCornerRadius(f);
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m4770()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f13132 != drawable) {
            this.f13132 = drawable;
            m4771();
        }
    }

    public void setIconGravity(int i) {
        this.f13127 = i;
    }

    public void setIconPadding(int i) {
        if (this.f13129 != i) {
            this.f13129 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC1367.m2767(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            C0188.m798("iconSize cannot be less than 0");
        } else if (this.f13130 != i) {
            this.f13130 = i;
            m4771();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f13128 != colorStateList) {
            this.f13128 = colorStateList;
            m4771();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f13126 != mode) {
            this.f13126 = mode;
            m4771();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C2810.m4942(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m4770()) {
            C0549 c0549 = this.f13133;
            C2676 c2676 = c0549.f2630;
            if (c0549.f2634 != colorStateList) {
                c0549.f2634 = colorStateList;
                if (c2676.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) c2676.getBackground()).setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m4770()) {
            setRippleColor(C2810.m4942(getContext(), i));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m4770()) {
            C0549 c0549 = this.f13133;
            ColorStateList colorStateList2 = c0549.f2636;
            C2676 c2676 = c0549.f2630;
            if (colorStateList2 != colorStateList) {
                c0549.f2636 = colorStateList;
                c0549.f2635.setColor(colorStateList != null ? colorStateList.getColorForState(c2676.getDrawableState(), 0) : 0);
                if (c0549.f2625 != null) {
                    c2676.setInternalBackground(c0549.m1390());
                }
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m4770()) {
            setStrokeColor(C2810.m4942(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m4770()) {
            C0549 c0549 = this.f13133;
            if (c0549.f2633 != i) {
                c0549.f2633 = i;
                c0549.f2635.setStrokeWidth(i);
                if (c0549.f2625 != null) {
                    c0549.f2630.setInternalBackground(c0549.m1390());
                }
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m4770()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // yyds.C0430
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        boolean zM4770 = m4770();
        C0549 c0549 = this.f13133;
        if (!zM4770) {
            if (c0549 != null) {
                super.setSupportBackgroundTintList(colorStateList);
            }
        } else if (c0549.f2628 != colorStateList) {
            c0549.f2628 = colorStateList;
            c0549.m1391();
        }
    }

    @Override // yyds.C0430
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        boolean zM4770 = m4770();
        C0549 c0549 = this.f13133;
        if (!zM4770) {
            if (c0549 != null) {
                super.setSupportBackgroundTintMode(mode);
            }
        } else if (c0549.f2626 != mode) {
            c0549.f2626 = mode;
            c0549.m1391();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m4770() {
        C0549 c0549 = this.f13133;
        return (c0549 == null || c0549.f2638) ? false : true;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4771() {
        Drawable drawable = this.f13132;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f13132 = drawableMutate;
            drawableMutate.setTintList(this.f13128);
            PorterDuff.Mode mode = this.f13126;
            if (mode != null) {
                this.f13132.setTintMode(mode);
            }
            int intrinsicWidth = this.f13130;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f13132.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f13130;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f13132.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f13132;
            int i = this.f13131;
            drawable2.setBounds(i, 0, intrinsicWidth + i, intrinsicHeight);
        }
        setCompoundDrawablesRelative(this.f13132, null, null, null);
    }
}
