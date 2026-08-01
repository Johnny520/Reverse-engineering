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
import androidx.appcompat.widget.Toolbar;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p000.AbstractC0104ch;
import p000.AbstractC0222ff;
import p000.AbstractC0273gt;
import p000.AbstractC0346ip;
import p000.AbstractC0873wy;
import p000.C0101ce;
import p000.C0200eu;
import p000.MenuC0424ku;
import p000.a80;
import p000.ja0;
import p000.s90;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: W */
    public static final ImageView.ScaleType[] f992W = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: R */
    public Integer f993R;

    /* JADX INFO: renamed from: S */
    public boolean f994S;

    /* JADX INFO: renamed from: T */
    public boolean f995T;

    /* JADX INFO: renamed from: U */
    public ImageView.ScaleType f996U;

    /* JADX INFO: renamed from: V */
    public Boolean f997V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0222ff.m1177W(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM56u = a80.m56u(context2, attributeSet, AbstractC0873wy.f5060s, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM56u.hasValue(2)) {
            setNavigationIconTint(typedArrayM56u.getColor(2, -1));
        }
        this.f994S = typedArrayM56u.getBoolean(4, false);
        this.f995T = typedArrayM56u.getBoolean(3, false);
        int i = typedArrayM56u.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f992W;
            if (i < scaleTypeArr.length) {
                this.f996U = scaleTypeArr[i];
            }
        }
        if (typedArrayM56u.hasValue(0)) {
            this.f997V = Boolean.valueOf(typedArrayM56u.getBoolean(0, false));
        }
        typedArrayM56u.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0222ff.m1193o(background);
        if (colorStateListValueOf != null) {
            C0200eu c0200eu = new C0200eu();
            c0200eu.m1085j(colorStateListValueOf);
            c0200eu.m1083h(context2);
            WeakHashMap weakHashMap = ja0.f2600a;
            c0200eu.m1084i(y90.m2663i(this));
            s90.m2325q(this, c0200eu);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f996U;
    }

    public Integer getNavigationIconTint() {
        return this.f993R;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: m */
    public final void mo194m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuC0424ku;
        if (z) {
            ((MenuC0424ku) menu).m1730w();
        }
        super.mo194m(i);
        if (z) {
            ((MenuC0424ku) menu).m1729v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0200eu) {
            AbstractC0273gt.m1298D(this, (C0200eu) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        C0101ce c0101ce = AbstractC0346ip.f2491t;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f994S || this.f995T) {
            ArrayList arrayListM1511x = AbstractC0346ip.m1511x(this, getTitle());
            TextView textView = arrayListM1511x.isEmpty() ? null : (TextView) Collections.min(arrayListM1511x, c0101ce);
            ArrayList arrayListM1511x2 = AbstractC0346ip.m1511x(this, getSubtitle());
            TextView textView2 = arrayListM1511x2.isEmpty() ? null : (TextView) Collections.max(arrayListM1511x2, c0101ce);
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
                if (this.f994S && textView != null) {
                    m711v(textView, pair);
                }
                if (this.f995T && textView2 != null) {
                    m711v(textView2, pair);
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
            Boolean bool = this.f997V;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f996U;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0200eu) {
            ((C0200eu) background).m1084i(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f997V;
        if (bool == null || bool.booleanValue() != z) {
            this.f997V = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f996U != scaleType) {
            this.f996U = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f993R != null) {
            drawable = drawable.mutate();
            AbstractC0104ch.m687g(drawable, this.f993R.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f993R = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f995T != z) {
            this.f995T = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f994S != z) {
            this.f994S = z;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m711v(TextView textView, Pair pair) {
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
