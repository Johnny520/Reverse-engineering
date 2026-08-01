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
import defpackage.a80;
import defpackage.ce;
import defpackage.ch;
import defpackage.eu;
import defpackage.ff;
import defpackage.gt;
import defpackage.ip;
import defpackage.ja0;
import defpackage.ku;
import defpackage.s90;
import defpackage.wy;
import defpackage.y90;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] W = null;
    public Integer R;
    public boolean S;
    public boolean T;
    public ImageView.ScaleType U;
    public Boolean V;

    static {
        W = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    }

    public MaterialToolbar(Context r8, AttributeSet r9) {
        super(ff.W(r8, r9, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), r9, 0);
        Context r1 = getContext();
        int[] r3 = wy.s;
        TypedArray r82 = a80.u(r1, r9, r3, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (r82.hasValue(2) == false) goto L5;
        setNavigationIconTint(r82.getColor(2, -1));
    L5:
        this.S = r82.getBoolean(4, false);
        this.T = r82.getBoolean(3, false);
        int r92 = r82.getInt(1, -1);
        if (r92 < 0) goto L11;
        ImageView.ScaleType[] r2 = W;
        if (r92 >= r2.length) goto L11;
        this.U = r2[r92];
    L11:
        if (r82.hasValue(0) == false) goto L13;
        this.V = Boolean.valueOf(r82.getBoolean(0, false));
    L13:
        r82.recycle();
        Drawable r83 = getBackground();
        if (r83 != null) goto L16;
        ColorStateList r84 = ColorStateList.valueOf(0);
    L17:
        if (r84 == null) goto L20;
        eu r93 = new eu();
        r93.j(r84);
        r93.h(r1);
        WeakHashMap r85 = ja0.a;
        r93.i(y90.i(this));
        s90.q(this, r93);
        return;
    L20:
        return;
    L16:
        r84 = ff.o(r83);
        goto L17
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.U;
    }

    public Integer getNavigationIconTint() {
        return this.R;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int r4) {
        Menu r0 = getMenu();
        boolean r1 = r0 instanceof ku;
        if (r1 == false) goto L5;
        ((ku) r0).w();
    L5:
        super.m(r4);
        if (r1 == false) goto L9;
        ((ku) r0).v();
        return;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable r0 = getBackground();
        if ((r0 instanceof eu) == false) goto L6;
        gt.D(this, (eu) r0);
        return;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        super.onLayout(r8, r9, r10, r11, r12);
        ce r92 = ip.t;
        int r112 = 0;
        ImageView r122 = null;
        if (this.S == false) goto L5;
    L7:
        ArrayList r102 = ip.x(this, getTitle());
        if (r102.isEmpty() == false) goto L10;
        TextView r103 = null;
    L11:
        ArrayList r0 = ip.x(this, getSubtitle());
        if (r0.isEmpty() == false) goto L14;
        TextView r93 = null;
    L15:
        if (r103 != null) goto L18;
        if (r93 != null) goto L18;
    L44:
        Drawable r94 = getLogo();
        if (r94 != null) goto L48;
    L59:
        if (r122 == null) goto L80;
        Boolean r95 = this.V;
        if (r95 == null) goto L63;
        r122.setAdjustViewBounds(r95.booleanValue());
    L63:
        ImageView.ScaleType r96 = this.U;
        if (r96 == null) goto L81;
        r122.setScaleType(r96);
        return;
    L81:
        return;
    L80:
        return;
    L48:
        if (r112 >= getChildCount()) goto L59;
        View r104 = getChildAt(r112);
        if ((r104 instanceof ImageView) == false) goto L58;
        ImageView r105 = (ImageView) r104;
        Drawable r02 = r105.getDrawable();
        if (r02 == null) goto L58;
        if (r02.getConstantState() == null) goto L58;
        if (r02.getConstantState().equals(r94.getConstantState()) == false) goto L58;
        r122 = r105;
    L58:
        r112 = r112 + 1;
    L18:
        int r03 = getMeasuredWidth();
        int r1 = r03 / 2;
        int r2 = getPaddingLeft();
        int r04 = r03 - getPaddingRight();
        int r3 = 0;
    L20:
        if (r3 >= getChildCount()) goto L36;
        View r4 = getChildAt(r3);
        if (r4.getVisibility() == 8) goto L35;
        if (r4 == r103) goto L35;
        if (r4 == r93) goto L35;
        if (r4.getRight() >= r1) goto L31;
        if (r4.getRight() <= r2) goto L31;
        r2 = r4.getRight();
    L31:
        if (r4.getLeft() <= r1) goto L35;
        if (r4.getLeft() >= r04) goto L35;
        r04 = r4.getLeft();
    L35:
        r3 = r3 + 1;
        goto L20
    L36:
        Pair r13 = new Pair(Integer.valueOf(r2), Integer.valueOf(r04));
        if (this.S == false) goto L41;
        if (r103 == null) goto L41;
        v(r103, r13);
    L41:
        if (this.T == false) goto L44;
        if (r93 == null) goto L44;
        v(r93, r13);
        goto L44
    L14:
        r93 = (TextView) Collections.max(r0, r92);
        goto L15
    L10:
        r103 = (TextView) Collections.min(r102, r92);
        goto L11
    L5:
        if (this.T == true) goto L7;
        goto L7
    }

    @Override // android.view.View
    public void setElevation(float r3) {
        super.setElevation(r3);
        Drawable r0 = getBackground();
        if ((r0 instanceof eu) == false) goto L6;
        ((eu) r0).i(r3);
        return;
    }

    public void setLogoAdjustViewBounds(boolean r2) {
        Boolean r0 = this.V;
        if (r0 != null) goto L5;
    L8:
        this.V = Boolean.valueOf(r2);
        requestLayout();
        return;
    L5:
        if (r0.booleanValue() != r2) goto L8;
    }

    public void setLogoScaleType(ImageView.ScaleType r2) {
        if (this.U == r2) goto L6;
        this.U = r2;
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
        if (this.R == null) goto L6;
        r2 = r2.mutate();
        ch.g(r2, this.R.intValue());
        goto L6
    }

    public void setNavigationIconTint(int r1) {
        this.R = Integer.valueOf(r1);
        Drawable r12 = getNavigationIcon();
        if (r12 == null) goto L6;
        setNavigationIcon(r12);
        return;
    }

    public void setSubtitleCentered(boolean r2) {
        if (this.T == r2) goto L6;
        this.T = r2;
        requestLayout();
        return;
    }

    public void setTitleCentered(boolean r2) {
        if (this.S == r2) goto L6;
        this.S = r2;
        requestLayout();
        return;
    }

    public final void v(TextView r5, Pair r6) {
        int r0 = getMeasuredWidth();
        int r1 = r5.getMeasuredWidth();
        int r02 = (r0 / 2) - (r1 / 2);
        int r12 = r1 + r02;
        int r62 = Math.max(Math.max(((Integer) r6.first).intValue() - r02, 0), Math.max(r12 - ((Integer) r6.second).intValue(), 0));
        if (r62 <= 0) goto L5;
        r02 = r02 + r62;
        r12 = r12 - r62;
        r5.measure(View.MeasureSpec.makeMeasureSpec(r12 - r02, 1073741824), r5.getMeasuredHeightAndState());
    L5:
        r5.layout(r02, r5.getTop(), r12, r5.getBottom());
    }
}
