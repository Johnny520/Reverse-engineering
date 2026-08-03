package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import io.github.cherrywechat.R;
import p000.AbstractC0148Dc;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC1293cr;
import p000.C1021Xq;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: a */
    public final C1021Xq f4537a;

    /* JADX INFO: renamed from: b */
    public int f4538b;

    /* JADX INFO: renamed from: c */
    public int f4539c;

    /* JADX INFO: renamed from: d */
    public int f4540d;

    /* JADX INFO: renamed from: e */
    public int f4541e;

    public MaterialDivider(Context r8, AttributeSet r9) {
        super(AbstractC0148Dc.m291y(r8, r9, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), r9, R.attr.materialDividerStyle);
        Context r1 = getContext();
        this.f4537a = new C1021Xq();
        int[] r3 = AbstractC0939Vu.f2947p;
        TypedArray r92 = AbstractC1293cr.m2534G(r1, r9, r3, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f4538b = r92.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f4540d = r92.getDimensionPixelOffset(2, 0);
        this.f4541e = r92.getDimensionPixelOffset(1, 0);
        setDividerColor(AbstractC0828TB.m1643j(r1, r92, 0).getDefaultColor());
        r92.recycle();
    }

    public int getDividerColor() {
        return this.f4539c;
    }

    public int getDividerInsetEnd() {
        return this.f4541e;
    }

    public int getDividerInsetStart() {
        return this.f4540d;
    }

    public int getDividerThickness() {
        return this.f4538b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r6) {
        super.onDraw(r6);
        boolean r2 = true;
        if (getLayoutDirection() == 1) goto L6;
        r2 = false;
    L6:
        if (r2 == false) goto L8;
        int r0 = this.f4541e;
    L9:
        if (r2 == false) goto L12;
        int r22 = getWidth();
        int r3 = this.f4540d;
    L11:
        int r23 = r22 - r3;
        int r32 = getBottom() - getTop();
        C1021Xq r4 = this.f4537a;
        r4.setBounds(r0, 0, r23, r32);
        r4.draw(r6);
        return;
    L12:
        r22 = getWidth();
        r3 = this.f4541e;
        goto L11
    L8:
        r0 = this.f4540d;
        goto L9
    }

    @Override // android.view.View
    public final void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int r22 = View.MeasureSpec.getMode(r3);
        int r32 = getMeasuredHeight();
        if (r22 == Integer.MIN_VALUE) goto L7;
        if (r22 == 0) goto L7;
        return;
    L7:
        int r23 = this.f4538b;
        if (r23 <= 0) goto L11;
        if (r32 == r23) goto L11;
        r32 = r23;
    L11:
        setMeasuredDimension(getMeasuredWidth(), r32);
    }

    public void setDividerColor(int r2) {
        if (this.f4539c == r2) goto L6;
        this.f4539c = r2;
        this.f4537a.m1928n(ColorStateList.valueOf(r2));
        invalidate();
        return;
    }

    public void setDividerColorResource(int r2) {
        setDividerColor(getContext().getColor(r2));
    }

    public void setDividerInsetEnd(int r1) {
        this.f4541e = r1;
    }

    public void setDividerInsetEndResource(int r2) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(r2));
    }

    public void setDividerInsetStart(int r1) {
        this.f4540d = r1;
    }

    public void setDividerInsetStartResource(int r2) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(r2));
    }

    public void setDividerThickness(int r2) {
        if (this.f4538b == r2) goto L6;
        this.f4538b = r2;
        requestLayout();
        return;
    }

    public void setDividerThicknessResource(int r2) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(r2));
    }
}
