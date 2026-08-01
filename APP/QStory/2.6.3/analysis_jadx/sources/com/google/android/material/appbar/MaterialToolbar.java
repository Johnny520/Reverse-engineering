package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.animation.C0426;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3160;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import java.util.Collections;
import p034.AbstractC6344;
import p268.AbstractC8267;
import p305.C8640;
import p305.C8643;
import p314.AbstractC8661;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static final ImageView.ScaleType[] f9947 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public boolean f9948;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean f9949;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public Boolean f9950;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public ImageView.ScaleType f9951;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public Integer f9952;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC8267.m13829(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM7182 = AbstractC3160.m7182(context2, attributeSet, AbstractC8661.f24414, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM7182.hasValue(2)) {
            setNavigationIconTint(typedArrayM7182.getColor(2, -1));
        }
        this.f9949 = typedArrayM7182.getBoolean(6, false);
        this.f9948 = typedArrayM7182.getBoolean(5, false);
        int i = typedArrayM7182.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f9947;
            if (i < scaleTypeArr.length) {
                this.f9951 = scaleTypeArr[i];
            }
        }
        if (typedArrayM7182.hasValue(0)) {
            this.f9950 = Boolean.valueOf(typedArrayM7182.getBoolean(0, false));
        }
        typedArrayM7182.recycle();
        C8640 c8640M14319 = C8640.m14321(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar).m14319();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC3933.m8320(background);
        if (colorStateListValueOf != null) {
            C8643 c8643 = new C8643(c8640M14319);
            c8643.m14341(colorStateListValueOf);
            c8643.m14338(context2);
            c8643.m14340(getElevation());
            setBackground(c8643);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f9951;
    }

    public Integer getNavigationIconTint() {
        return this.f9952;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C8643) {
            AbstractC6344.m11869(this, (C8643) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        C0426 c0426 = AbstractC3160.f10513;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f9949 || this.f9948) {
            ArrayList arrayListM7183 = AbstractC3160.m7183(this, getTitle());
            TextView textView = arrayListM7183.isEmpty() ? null : (TextView) Collections.min(arrayListM7183, c0426);
            ArrayList arrayListM71832 = AbstractC3160.m7183(this, getSubtitle());
            TextView textView2 = arrayListM71832.isEmpty() ? null : (TextView) Collections.max(arrayListM71832, c0426);
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
                if (this.f9949 && textView != null) {
                    m7001(textView, pair);
                }
                if (this.f9948 && textView2 != null) {
                    m7001(textView2, pair);
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
            Boolean bool = this.f9950;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f9951;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C8643) {
            ((C8643) background).m14340(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f9950;
        if (bool == null || bool.booleanValue() != z) {
            this.f9950 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f9951 != scaleType) {
            this.f9951 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f9952 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f9952.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f9952 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f9948 != z) {
            this.f9948 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f9949 != z) {
            this.f9949 = z;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m7001(TextView textView, Pair pair) {
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
