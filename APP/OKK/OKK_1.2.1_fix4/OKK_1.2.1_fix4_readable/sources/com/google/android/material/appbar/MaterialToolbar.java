package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.abc.core.runtime.AbstractC0805P;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import org.luckypray.dexkit.C1031R;
import p003B0.AbstractC0059a;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p037U.C0375k;
import p055f.MenuC0779j;
import p057g.AbstractC0883T;
import p058g0.AbstractC0942a;
import p081s0.AbstractC1077k;
import p087w.AbstractC1111a;
import p089x0.C1123g;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: V */
    public static final ImageView.ScaleType[] f2259V = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: Q */
    public Integer f2260Q;

    /* JADX INFO: renamed from: R */
    public boolean f2261R;

    /* JADX INFO: renamed from: S */
    public boolean f2262S;

    /* JADX INFO: renamed from: T */
    public ImageView.ScaleType f2263T;

    /* JADX INFO: renamed from: U */
    public Boolean f2264U;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0059a.m197a(context, attributeSet, C1031R.attr.toolbarStyle, C1031R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        int[] iArr = AbstractC0942a.f3341m;
        AbstractC1077k.m2553a(context2, attributeSet, C1031R.attr.toolbarStyle, C1031R.style.Widget_MaterialComponents_Toolbar);
        AbstractC1077k.m2554b(context2, attributeSet, iArr, C1031R.attr.toolbarStyle, C1031R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C1031R.attr.toolbarStyle, C1031R.style.Widget_MaterialComponents_Toolbar);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(2, -1));
        }
        this.f2261R = typedArrayObtainStyledAttributes.getBoolean(4, false);
        this.f2262S = typedArrayObtainStyledAttributes.getBoolean(3, false);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2259V;
            if (i2 < scaleTypeArr.length) {
                this.f2263T = scaleTypeArr[i2];
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f2264U = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : background instanceof ColorDrawable ? ColorStateList.valueOf(((ColorDrawable) background).getColor()) : (Build.VERSION.SDK_INT < 29 || !AbstractC0883T.m2215e(background)) ? null : AbstractC0883T.m2213c(background).getColorStateList();
        if (colorStateListValueOf != null) {
            C1123g c1123g = new C1123g();
            c1123g.m2651k(colorStateListValueOf);
            c1123g.m2649i(context2);
            Field field = AbstractC0080Q.f219a;
            c1123g.m2650j(AbstractC0070G.m219i(this));
            setBackground(c1123g);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2263T;
    }

    public Integer getNavigationIconTint() {
        return this.f2260Q;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: l */
    public final void mo1146l(int i2) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof MenuC0779j;
        if (z2) {
            ((MenuC0779j) menu).m2013s();
        }
        super.mo1146l(i2);
        if (z2) {
            ((MenuC0779j) menu).m2012r();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1123g) {
            AbstractC0805P.m2042V(this, (C1123g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        ImageView imageView2 = null;
        if (this.f2261R || this.f2262S) {
            ArrayList arrayListM2556d = AbstractC1077k.m2556d(this, getTitle());
            boolean zIsEmpty = arrayListM2556d.isEmpty();
            C0375k c0375k = AbstractC1077k.f4180c;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListM2556d, c0375k);
            ArrayList arrayListM2556d2 = AbstractC1077k.m2556d(this, getSubtitle());
            TextView textView2 = arrayListM2556d2.isEmpty() ? null : (TextView) Collections.max(arrayListM2556d2, c0375k);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i7 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2261R && textView != null) {
                    m1830u(textView, pair);
                }
                if (this.f2262S && textView2 != null) {
                    m1830u(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i6 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i6);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i6++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2264U;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2263T;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof C1123g) {
            ((C1123g) background).m2650j(f2);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f2264U;
        if (bool == null || bool.booleanValue() != z2) {
            this.f2264U = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2263T != scaleType) {
            this.f2263T = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f2260Q != null) {
            drawable = drawable.mutate();
            AbstractC1111a.m2625g(drawable, this.f2260Q.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.f2260Q = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f2262S != z2) {
            this.f2262S = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f2261R != z2) {
            this.f2261R = z2;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1830u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i2 += iMax;
            i3 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i2, textView.getTop(), i3, textView.getBottom());
    }
}
