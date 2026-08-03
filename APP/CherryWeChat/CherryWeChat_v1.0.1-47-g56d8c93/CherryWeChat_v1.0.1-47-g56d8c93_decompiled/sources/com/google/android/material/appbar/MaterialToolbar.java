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
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Collections;
import p000.AbstractC0148Dc;
import p000.AbstractC0585Nj;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC1293cr;
import p000.AbstractC1406fG;
import p000.C0963Wb;
import p000.C1021Xq;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: c0 */
    public static final ImageView.ScaleType[] f4374c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: U */
    public Integer f4375U;

    /* JADX INFO: renamed from: V */
    public boolean f4376V;

    /* JADX INFO: renamed from: W */
    public boolean f4377W;

    /* JADX INFO: renamed from: a0 */
    public ImageView.ScaleType f4378a0;

    /* JADX INFO: renamed from: b0 */
    public Boolean f4379b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0148Dc.m291y(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM2534G = AbstractC1293cr.m2534G(context2, attributeSet, AbstractC0939Vu.f2953v, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM2534G.hasValue(2)) {
            setNavigationIconTint(typedArrayM2534G.getColor(2, -1));
        }
        this.f4376V = typedArrayM2534G.getBoolean(4, false);
        this.f4377W = typedArrayM2534G.getBoolean(3, false);
        int i = typedArrayM2534G.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f4374c0;
            if (i < scaleTypeArr.length) {
                this.f4378a0 = scaleTypeArr[i];
            }
        }
        if (typedArrayM2534G.hasValue(0)) {
            this.f4379b0 = Boolean.valueOf(typedArrayM2534G.getBoolean(0, false));
        }
        typedArrayM2534G.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0585Nj.m1158z(background);
        if (colorStateListValueOf != null) {
            C1021Xq c1021Xq = new C1021Xq();
            c1021Xq.m1928n(colorStateListValueOf);
            c1021Xq.m1925k(context2);
            c1021Xq.m1927m(getElevation());
            setBackground(c1021Xq);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f4378a0;
    }

    public Integer getNavigationIconTint() {
        return this.f4375U;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1021Xq) {
            AbstractC1406fG.m2714n0(this, (C1021Xq) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        C0963Wb c0963Wb = AbstractC0828TB.f2612d;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f4376V || this.f4377W) {
            ArrayList arrayListM1646o = AbstractC0828TB.m1646o(this, getTitle());
            TextView textView = arrayListM1646o.isEmpty() ? null : (TextView) Collections.min(arrayListM1646o, c0963Wb);
            ArrayList arrayListM1646o2 = AbstractC0828TB.m1646o(this, getSubtitle());
            TextView textView2 = arrayListM1646o2.isEmpty() ? null : (TextView) Collections.max(arrayListM1646o2, c0963Wb);
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
                if (this.f4376V && textView != null) {
                    m2422w(textView, pair);
                }
                if (this.f4377W && textView2 != null) {
                    m2422w(textView2, pair);
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
            Boolean bool = this.f4379b0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f4378a0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C1021Xq) {
            ((C1021Xq) background).m1927m(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f4379b0;
        if (bool == null || bool.booleanValue() != z) {
            this.f4379b0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f4378a0 != scaleType) {
            this.f4378a0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f4375U != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f4375U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f4375U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f4377W != z) {
            this.f4377W = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f4376V != z) {
            this.f4376V = z;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2422w(TextView textView, Pair pair) {
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
