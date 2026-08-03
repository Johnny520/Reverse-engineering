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
    public static final ImageView.ScaleType[] f2259V = null;

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

    static {
        f2259V = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    }

    public MaterialToolbar(Context r11, AttributeSet r12) {
        super(AbstractC0059a.m197a(r11, r12, C1031R.attr.toolbarStyle, C1031R.style.Widget_MaterialComponents_Toolbar), r12, 0);
        Context r112 = getContext();
        int[] r8 = AbstractC0942a.f3341m;
        AbstractC1077k.m2553a(r112, r12, C1031R.attr.toolbarStyle, C1031R.style.Widget_MaterialComponents_Toolbar);
        AbstractC1077k.m2554b(r112, r12, r8, C1031R.attr.toolbarStyle, C1031R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        TypedArray r122 = r112.obtainStyledAttributes(r12, r8, C1031R.attr.toolbarStyle, C1031R.style.Widget_MaterialComponents_Toolbar);
        if (r122.hasValue(2) == false) goto L5;
        setNavigationIconTint(r122.getColor(2, -1));
    L5:
        this.f2261R = r122.getBoolean(4, false);
        this.f2262S = r122.getBoolean(3, false);
        int r02 = r122.getInt(1, -1);
        if (r02 < 0) goto L11;
        ImageView.ScaleType[] r1 = f2259V;
        if (r02 >= r1.length) goto L11;
        this.f2263T = r1[r02];
    L11:
        if (r122.hasValue(0) == false) goto L13;
        this.f2264U = Boolean.valueOf(r122.getBoolean(0, false));
    L13:
        r122.recycle();
        Drawable r123 = getBackground();
        if (r123 != null) goto L17;
        ColorStateList r124 = ColorStateList.valueOf(0);
    L25:
        if (r124 == null) goto L28;
        C1123g r03 = new C1123g();
        r03.m2651k(r124);
        r03.m2649i(r112);
        Field r113 = AbstractC0080Q.f219a;
        r03.m2650j(AbstractC0070G.m219i(this));
        setBackground(r03);
        return;
    L28:
        return;
    L17:
        if ((r123 instanceof ColorDrawable) == false) goto L20;
        r124 = ColorStateList.valueOf(((ColorDrawable) r123).getColor());
        goto L25
    L20:
        if (Build.VERSION.SDK_INT >= 29) goto L22;
    L24:
        r124 = null;
        goto L25
    L22:
        if (AbstractC0883T.m2215e(r123) == false) goto L24;
        r124 = AbstractC0883T.m2212b(AbstractC0883T.m2213c(r123));
        goto L25
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2263T;
    }

    public Integer getNavigationIconTint() {
        return this.f2260Q;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: l */
    public final void mo1146l(int r4) {
        Menu r02 = getMenu();
        boolean r1 = r02 instanceof MenuC0779j;
        if (r1 == false) goto L5;
        ((MenuC0779j) r02).m2013s();
    L5:
        super.mo1146l(r4);
        if (r1 == false) goto L9;
        ((MenuC0779j) r02).m2012r();
        return;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable r02 = getBackground();
        if ((r02 instanceof C1123g) == false) goto L6;
        AbstractC0805P.m2042V(this, (C1123g) r02);
        return;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        super.onLayout(r7, r8, r9, r10, r11);
        int r82 = 0;
        ImageView r92 = null;
        if (this.f2261R == false) goto L5;
    L7:
        ArrayList r72 = AbstractC1077k.m2556d(this, getTitle());
        boolean r102 = r72.isEmpty();
        C0375k r112 = AbstractC1077k.f4180c;
        if (r102 == false) goto L10;
        TextView r73 = null;
    L11:
        ArrayList r103 = AbstractC1077k.m2556d(this, getSubtitle());
        if (r103.isEmpty() == false) goto L14;
        TextView r104 = null;
    L15:
        if (r73 != null) goto L18;
        if (r104 != null) goto L18;
    L44:
        Drawable r74 = getLogo();
        if (r74 != null) goto L48;
    L59:
        if (r92 == null) goto L80;
        Boolean r75 = this.f2264U;
        if (r75 == null) goto L63;
        r92.setAdjustViewBounds(r75.booleanValue());
    L63:
        ImageView.ScaleType r76 = this.f2263T;
        if (r76 == null) goto L81;
        r92.setScaleType(r76);
        return;
    L81:
        return;
    L80:
        return;
    L48:
        if (r82 >= getChildCount()) goto L59;
        View r105 = getChildAt(r82);
        if ((r105 instanceof ImageView) == false) goto L58;
        ImageView r106 = (ImageView) r105;
        Drawable r113 = r106.getDrawable();
        if (r113 == null) goto L58;
        if (r113.getConstantState() == null) goto L58;
        if (r113.getConstantState().equals(r74.getConstantState()) == false) goto L58;
        r92 = r106;
    L58:
        r82 = r82 + 1;
    L18:
        int r114 = getMeasuredWidth();
        int r02 = r114 / 2;
        int r1 = getPaddingLeft();
        int r115 = r114 - getPaddingRight();
        int r2 = 0;
    L20:
        if (r2 >= getChildCount()) goto L36;
        View r3 = getChildAt(r2);
        if (r3.getVisibility() == 8) goto L35;
        if (r3 == r73) goto L35;
        if (r3 == r104) goto L35;
        if (r3.getRight() >= r02) goto L31;
        if (r3.getRight() <= r1) goto L31;
        r1 = r3.getRight();
    L31:
        if (r3.getLeft() <= r02) goto L35;
        if (r3.getLeft() >= r115) goto L35;
        r115 = r3.getLeft();
    L35:
        r2 = r2 + 1;
        goto L20
    L36:
        Pair r03 = new Pair(Integer.valueOf(r1), Integer.valueOf(r115));
        if (this.f2261R == false) goto L41;
        if (r73 == null) goto L41;
        m1830u(r73, r03);
    L41:
        if (this.f2262S == false) goto L44;
        if (r104 == null) goto L44;
        m1830u(r104, r03);
        goto L44
    L14:
        r104 = (TextView) Collections.max(r103, r112);
        goto L15
    L10:
        r73 = (TextView) Collections.min(r72, r112);
        goto L11
    L5:
        if (this.f2262S == true) goto L7;
        goto L7
    }

    @Override // android.view.View
    public void setElevation(float r3) {
        super.setElevation(r3);
        Drawable r02 = getBackground();
        if ((r02 instanceof C1123g) == false) goto L6;
        ((C1123g) r02).m2650j(r3);
        return;
    }

    public void setLogoAdjustViewBounds(boolean r2) {
        Boolean r02 = this.f2264U;
        if (r02 != null) goto L5;
    L6:
        this.f2264U = Boolean.valueOf(r2);
        requestLayout();
        return;
    L5:
        if (r02.booleanValue() != r2) goto L6;
    }

    public void setLogoScaleType(ImageView.ScaleType r2) {
        if (this.f2263T == r2) goto L6;
        this.f2263T = r2;
        requestLayout();
        return;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable r2) {
        if (r2 != null) goto L4;
    L6:
        super.setNavigationIcon(r2);
        return;
    L4:
        if (this.f2260Q == null) goto L6;
        r2 = r2.mutate();
        AbstractC1111a.m2625g(r2, this.f2260Q.intValue());
        goto L6
    }

    public void setNavigationIconTint(int r1) {
        this.f2260Q = Integer.valueOf(r1);
        Drawable r12 = getNavigationIcon();
        if (r12 == null) goto L6;
        setNavigationIcon(r12);
        return;
    }

    public void setSubtitleCentered(boolean r2) {
        if (this.f2262S == r2) goto L6;
        this.f2262S = r2;
        requestLayout();
        return;
    }

    public void setTitleCentered(boolean r2) {
        if (this.f2261R == r2) goto L6;
        this.f2261R = r2;
        requestLayout();
        return;
    }

    /* JADX INFO: renamed from: u */
    public final void m1830u(TextView r5, Pair r6) {
        int r02 = getMeasuredWidth();
        int r1 = r5.getMeasuredWidth();
        int r03 = (r02 / 2) - (r1 / 2);
        int r12 = r1 + r03;
        int r62 = Math.max(Math.max(((Integer) r6.first).intValue() - r03, 0), Math.max(r12 - ((Integer) r6.second).intValue(), 0));
        if (r62 <= 0) goto L5;
        r03 = r03 + r62;
        r12 = r12 - r62;
        r5.measure(View.MeasureSpec.makeMeasureSpec(r12 - r03, 1073741824), r5.getMeasuredHeightAndState());
    L5:
        r5.layout(r03, r5.getTop(), r12, r5.getBottom());
    }
}
