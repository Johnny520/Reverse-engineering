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

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(AbstractC0148Dc.m291y(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f4537a = new C1021Xq();
        TypedArray typedArrayM2534G = AbstractC1293cr.m2534G(context2, attributeSet, AbstractC0939Vu.f2947p, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f4538b = typedArrayM2534G.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f4540d = typedArrayM2534G.getDimensionPixelOffset(2, 0);
        this.f4541e = typedArrayM2534G.getDimensionPixelOffset(1, 0);
        setDividerColor(AbstractC0828TB.m1643j(context2, typedArrayM2534G, 0).getDefaultColor());
        typedArrayM2534G.recycle();
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
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.f4541e : this.f4540d;
        if (z) {
            width = getWidth();
            i = this.f4540d;
        } else {
            width = getWidth();
            i = this.f4541e;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        C1021Xq c1021Xq = this.f4537a;
        c1021Xq.setBounds(i2, 0, i3, bottom);
        c1021Xq.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f4538b;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f4539c != i) {
            this.f4539c = i;
            this.f4537a.m1928n(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.f4541e = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f4540d = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f4538b != i) {
            this.f4538b = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
