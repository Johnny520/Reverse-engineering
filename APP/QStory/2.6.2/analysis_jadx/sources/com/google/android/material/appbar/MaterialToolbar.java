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
import com.google.android.material.internal.AbstractC3159;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p053.AbstractC6560;
import p268.AbstractC8266;
import p305.C8648;
import p305.C8651;
import p314.AbstractC8669;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static final ImageView.ScaleType[] f9942 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public boolean f9943;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean f9944;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public Boolean f9945;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public ImageView.ScaleType f9946;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public Integer f9947;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC8266.m13812(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM7195 = AbstractC3159.m7195(context2, attributeSet, AbstractC8669.f24423, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM7195.hasValue(2)) {
            setNavigationIconTint(typedArrayM7195.getColor(2, -1));
        }
        this.f9944 = typedArrayM7195.getBoolean(6, false);
        this.f9943 = typedArrayM7195.getBoolean(5, false);
        int i = typedArrayM7195.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f9942;
            if (i < scaleTypeArr.length) {
                this.f9946 = scaleTypeArr[i];
            }
        }
        if (typedArrayM7195.hasValue(0)) {
            this.f9945 = Boolean.valueOf(typedArrayM7195.getBoolean(0, false));
        }
        typedArrayM7195.recycle();
        C8648 c8648M14301 = C8648.m14303(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar).m14301();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC5061.m10038(background);
        if (colorStateListValueOf != null) {
            C8651 c8651 = new C8651(c8648M14301);
            c8651.m14323(colorStateListValueOf);
            c8651.m14320(context2);
            c8651.m14322(getElevation());
            setBackground(c8651);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f9946;
    }

    public Integer getNavigationIconTint() {
        return this.f9947;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C8651) {
            AbstractC6560.m12000(this, (C8651) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        C0426 c0426 = AbstractC3159.f10508;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f9944 || this.f9943) {
            ArrayList arrayListM7196 = AbstractC3159.m7196(this, getTitle());
            TextView textView = arrayListM7196.isEmpty() ? null : (TextView) Collections.min(arrayListM7196, c0426);
            ArrayList arrayListM71962 = AbstractC3159.m7196(this, getSubtitle());
            TextView textView2 = arrayListM71962.isEmpty() ? null : (TextView) Collections.max(arrayListM71962, c0426);
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
                if (this.f9944 && textView != null) {
                    m7014(textView, pair);
                }
                if (this.f9943 && textView2 != null) {
                    m7014(textView2, pair);
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
            Boolean bool = this.f9945;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f9946;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C8651) {
            ((C8651) background).m14322(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f9945;
        if (bool == null || bool.booleanValue() != z) {
            this.f9945 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f9946 != scaleType) {
            this.f9946 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f9947 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f9947.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f9947 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f9943 != z) {
            this.f9943 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f9944 != z) {
            this.f9944 = z;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m7014(TextView textView, Pair pair) {
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
