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
import p000.AbstractC0168dz;
import p000.AbstractC0187eh;
import p000.AbstractC0259gf;
import p000.AbstractC0387ju;
import p000.AbstractC0493mp;
import p000.C0148de;
import p000.C0350iu;
import p000.MenuC0646qu;
import p000.da0;
import p000.g80;
import p000.oa0;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: W */
    public static final ImageView.ScaleType[] f917W = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: R */
    public Integer f918R;

    /* JADX INFO: renamed from: S */
    public boolean f919S;

    /* JADX INFO: renamed from: T */
    public boolean f920T;

    /* JADX INFO: renamed from: U */
    public ImageView.ScaleType f921U;

    /* JADX INFO: renamed from: V */
    public Boolean f922V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0259gf.m1245c0(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM1170A = g80.m1170A(context2, attributeSet, AbstractC0168dz.f1456s, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM1170A.hasValue(2)) {
            setNavigationIconTint(typedArrayM1170A.getColor(2, -1));
        }
        this.f919S = typedArrayM1170A.getBoolean(4, false);
        this.f920T = typedArrayM1170A.getBoolean(3, false);
        int i = typedArrayM1170A.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f917W;
            if (i < scaleTypeArr.length) {
                this.f921U = scaleTypeArr[i];
            }
        }
        if (typedArrayM1170A.hasValue(0)) {
            this.f922V = Boolean.valueOf(typedArrayM1170A.getBoolean(0, false));
        }
        typedArrayM1170A.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : g80.m1199n(background);
        if (colorStateListValueOf != null) {
            C0350iu c0350iu = new C0350iu();
            c0350iu.m1537j(colorStateListValueOf);
            c0350iu.m1535h(context2);
            WeakHashMap weakHashMap = oa0.f3426a;
            c0350iu.m1536i(da0.m891i(this));
            x90.m2669q(this, c0350iu);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f921U;
    }

    public Integer getNavigationIconTint() {
        return this.f918R;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: m */
    public final void mo179m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuC0646qu;
        if (z) {
            ((MenuC0646qu) menu).m2179w();
        }
        super.mo179m(i);
        if (z) {
            ((MenuC0646qu) menu).m2178v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0350iu) {
            AbstractC0387ju.m1631v(this, (C0350iu) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        C0148de c0148de = AbstractC0493mp.f3182t;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f919S || this.f920T) {
            ArrayList arrayListM1868s = AbstractC0493mp.m1868s(this, getTitle());
            TextView textView = arrayListM1868s.isEmpty() ? null : (TextView) Collections.min(arrayListM1868s, c0148de);
            ArrayList arrayListM1868s2 = AbstractC0493mp.m1868s(this, getSubtitle());
            TextView textView2 = arrayListM1868s2.isEmpty() ? null : (TextView) Collections.max(arrayListM1868s2, c0148de);
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
                if (this.f919S && textView != null) {
                    m669v(textView, pair);
                }
                if (this.f920T && textView2 != null) {
                    m669v(textView2, pair);
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
            Boolean bool = this.f922V;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f921U;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0350iu) {
            ((C0350iu) background).m1536i(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f922V;
        if (bool == null || bool.booleanValue() != z) {
            this.f922V = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f921U != scaleType) {
            this.f921U = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f918R != null) {
            drawable = drawable.mutate();
            AbstractC0187eh.m994g(drawable, this.f918R.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f918R = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f920T != z) {
            this.f920T = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f919S != z) {
            this.f919S = z;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m669v(TextView textView, Pair pair) {
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
