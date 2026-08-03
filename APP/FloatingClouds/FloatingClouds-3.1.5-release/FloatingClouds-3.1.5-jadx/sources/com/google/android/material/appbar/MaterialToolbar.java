package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.C1247R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0354Ta;
import p000a.C0408Wa;
import p000a.C0523cf;
import p000a.C0726n9;
import p000a.C0866ug;
import p000a.C0884vf;
import p000a.C0893w5;
import p000a.C0931y5;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: c0 */
    public static final int f5372c0 = C1247R.style.Widget_MaterialComponents_Toolbar;

    /* JADX INFO: renamed from: d0 */
    public static final ImageView.ScaleType[] f5373d0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: U */
    public Integer f5374U;

    /* JADX INFO: renamed from: V */
    public boolean f5375V;

    /* JADX INFO: renamed from: W */
    public boolean f5376W;

    /* JADX INFO: renamed from: a0 */
    public ImageView.ScaleType f5377a0;

    /* JADX INFO: renamed from: b0 */
    public Boolean f5378b0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        int i = C1247R.attr.toolbarStyle;
        int i2 = f5372c0;
        super(C0408Wa.m1054a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayM1301d = C0523cf.m1301d(context2, attributeSet, C1247R.styleable.MaterialToolbar, i, i2, new int[0]);
        if (typedArrayM1301d.hasValue(C1247R.styleable.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayM1301d.getColor(C1247R.styleable.MaterialToolbar_navigationIconTint, -1));
        }
        this.f5375V = typedArrayM1301d.getBoolean(C1247R.styleable.MaterialToolbar_titleCentered, false);
        this.f5376W = typedArrayM1301d.getBoolean(C1247R.styleable.MaterialToolbar_subtitleCentered, false);
        int i3 = typedArrayM1301d.getInt(C1247R.styleable.MaterialToolbar_logoScaleType, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f5373d0;
            if (i3 < scaleTypeArr.length) {
                this.f5377a0 = scaleTypeArr[i3];
            }
        }
        if (typedArrayM1301d.hasValue(C1247R.styleable.MaterialToolbar_logoAdjustViewBounds)) {
            this.f5378b0 = Boolean.valueOf(typedArrayM1301d.getBoolean(C1247R.styleable.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayM1301d.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : C0931y5.m2216a(background);
        if (colorStateListValueOf != null) {
            C0354Ta c0354Ta = new C0354Ta();
            c0354Ta.m967k(colorStateListValueOf);
            c0354Ta.m965i(context2);
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            c0354Ta.m966j(C0866ug.d.m2017i(this));
            setBackground(c0354Ta);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f5377a0;
    }

    public Integer getNavigationIconTint() {
        return this.f5374U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: m */
    public final void mo2382m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof C0998f;
        if (z) {
            ((C0998f) menu).m2338w();
        }
        super.mo2382m(i);
        if (z) {
            ((C0998f) menu).m2337v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0354Ta) {
            C0726n9.m1659A(this, (C0354Ta) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f5375V || this.f5376W) {
            ArrayList arrayListM2108b = C0884vf.m2108b(this, getTitle());
            boolean zIsEmpty = arrayListM2108b.isEmpty();
            C0884vf.a aVar = C0884vf.f3461a;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListM2108b, aVar);
            ArrayList arrayListM2108b2 = C0884vf.m2108b(this, getSubtitle());
            TextView textView2 = arrayListM2108b2.isEmpty() ? null : (TextView) Collections.max(arrayListM2108b2, aVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f5375V && textView != null) {
                    m3083w(textView, pair);
                }
                if (this.f5376W && textView2 != null) {
                    m3083w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f5378b0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f5377a0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0354Ta) {
            ((C0354Ta) background).m966j(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f5378b0;
        if (bool == null || bool.booleanValue() != z) {
            this.f5378b0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f5377a0 != scaleType) {
            this.f5377a0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f5374U != null) {
            drawable = drawable.mutate();
            C0893w5.a.m2175g(drawable, this.f5374U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f5374U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f5376W != z) {
            this.f5376W = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f5375V != z) {
            this.f5375V = z;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m3083w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
