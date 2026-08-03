package p092z0;

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
import com.abc.core.runtime.AbstractC0805P;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p003B0.AbstractC0059a;
import p006D.AbstractC0068E;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p058g0.AbstractC0942a;
import p081s0.AbstractC1077k;
import p087w.AbstractC1111a;
import p089x0.C1123g;
import p089x0.C1127k;

/* JADX INFO: renamed from: z0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1145c extends FrameLayout {

    /* JADX INFO: renamed from: i */
    public static final ViewOnTouchListenerC1144b f4404i = new ViewOnTouchListenerC1144b();

    /* JADX INFO: renamed from: a */
    public final C1127k f4405a;

    /* JADX INFO: renamed from: b */
    public int f4406b;

    /* JADX INFO: renamed from: c */
    public final float f4407c;

    /* JADX INFO: renamed from: d */
    public final float f4408d;

    /* JADX INFO: renamed from: e */
    public final int f4409e;

    /* JADX INFO: renamed from: f */
    public final int f4410f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f4411g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f4412h;

    public AbstractC1145c(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(AbstractC0059a.m197a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0942a.f3346r);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            Field field = AbstractC0080Q.f219a;
            AbstractC0070G.m229s(this, dimensionPixelSize);
        }
        this.f4406b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f4405a = C1127k.m2657a(context2, attributeSet, 0, 0).m2656a();
        }
        this.f4407c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0805P.m2051r(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC1077k.m2558f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f4408d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f4409e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f4410f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f4404i);
        setFocusable(true);
        if (getBackground() == null) {
            int iM2033I = AbstractC0805P.m2033I(AbstractC0805P.m2048o(this, C1031R.attr.colorSurface), AbstractC0805P.m2048o(this, C1031R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            C1127k c1127k = this.f4405a;
            if (c1127k != null) {
                int i2 = AbstractC1146d.f4413a;
                C1123g c1123g = new C1123g(c1127k);
                c1123g.m2651k(ColorStateList.valueOf(iM2033I));
                drawable = c1123g;
            } else {
                Resources resources = getResources();
                int i3 = AbstractC1146d.f4413a;
                float dimension = resources.getDimension(C1031R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM2033I);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f4411g;
            if (colorStateList != null) {
                AbstractC1111a.m2626h(drawable, colorStateList);
            }
            Field field2 = AbstractC0080Q.f219a;
            setBackground(drawable);
        }
    }

    private void setBaseTransientBottomBar(AbstractC1146d abstractC1146d) {
    }

    public float getActionTextColorAlpha() {
        return this.f4408d;
    }

    public int getAnimationMode() {
        return this.f4406b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f4407c;
    }

    public int getMaxInlineActionWidth() {
        return this.f4410f;
    }

    public int getMaxWidth() {
        return this.f4409e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Field field = AbstractC0080Q.f219a;
        AbstractC0068E.m210c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f4409e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f4406b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f4411g != null) {
            drawable = drawable.mutate();
            AbstractC1111a.m2626h(drawable, this.f4411g);
            AbstractC1111a.m2627i(drawable, this.f4412h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f4411g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC1111a.m2626h(drawableMutate, colorStateList);
            AbstractC1111a.m2627i(drawableMutate, this.f4412h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f4412h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC1111a.m2627i(drawableMutate, mode);
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
        setOnTouchListener(onClickListener != null ? null : f4404i);
        super.setOnClickListener(onClickListener);
    }
}
