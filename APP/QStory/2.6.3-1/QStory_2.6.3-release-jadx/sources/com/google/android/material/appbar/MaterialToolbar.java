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
import androidx.compose.animation.C1272;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3992;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.Collections;
import p050.AbstractC7173;
import p284.AbstractC9096;
import p321.C9469;
import p321.C9472;
import p330.AbstractC9490;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static final ImageView.ScaleType[] f10292 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public boolean f10293;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean f10294;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public Boolean f10295;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public ImageView.ScaleType f10296;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public Integer f10297;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC9096.m14388(context, attributeSet, C0328R.attr.toolbarStyle, C0328R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM7741 = AbstractC3992.m7741(context2, attributeSet, AbstractC9490.f24759, C0328R.attr.toolbarStyle, C0328R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM7741.hasValue(2)) {
            setNavigationIconTint(typedArrayM7741.getColor(2, -1));
        }
        this.f10294 = typedArrayM7741.getBoolean(6, false);
        this.f10293 = typedArrayM7741.getBoolean(5, false);
        int i = typedArrayM7741.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f10292;
            if (i < scaleTypeArr.length) {
                this.f10296 = scaleTypeArr[i];
            }
        }
        if (typedArrayM7741.hasValue(0)) {
            this.f10295 = Boolean.valueOf(typedArrayM7741.getBoolean(0, false));
        }
        typedArrayM7741.recycle();
        C9469 c9469M14878 = C9469.m14880(context2, attributeSet, C0328R.attr.toolbarStyle, C0328R.style.Widget_MaterialComponents_Toolbar).m14878();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC4765.m8879(background);
        if (colorStateListValueOf != null) {
            C9472 c9472 = new C9472(c9469M14878);
            c9472.m14900(colorStateListValueOf);
            c9472.m14897(context2);
            c9472.m14899(getElevation());
            setBackground(c9472);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f10296;
    }

    public Integer getNavigationIconTint() {
        return this.f10297;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C9472) {
            AbstractC7173.m12428(this, (C9472) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        C1272 c1272 = AbstractC3992.f10858;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f10294 || this.f10293) {
            ArrayList arrayListM7742 = AbstractC3992.m7742(this, getTitle());
            TextView textView = arrayListM7742.isEmpty() ? null : (TextView) Collections.min(arrayListM7742, c1272);
            ArrayList arrayListM77422 = AbstractC3992.m7742(this, getSubtitle());
            TextView textView2 = arrayListM77422.isEmpty() ? null : (TextView) Collections.max(arrayListM77422, c1272);
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
                if (this.f10294 && textView != null) {
                    m7560(textView, pair);
                }
                if (this.f10293 && textView2 != null) {
                    m7560(textView2, pair);
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
            Boolean bool = this.f10295;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f10296;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C9472) {
            ((C9472) background).m14899(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f10295;
        if (bool == null || bool.booleanValue() != z) {
            this.f10295 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f10296 != scaleType) {
            this.f10296 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f10297 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f10297.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f10297 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f10293 != z) {
            this.f10293 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f10294 != z) {
            this.f10294 = z;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m7560(TextView textView, Pair pair) {
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
