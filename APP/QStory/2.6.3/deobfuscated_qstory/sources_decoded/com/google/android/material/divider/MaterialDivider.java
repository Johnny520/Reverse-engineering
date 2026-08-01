package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3160;
import p175.AbstractC7739;
import p268.AbstractC8267;
import p305.C8643;
import p314.AbstractC8661;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10386;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f10387;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10388;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f10389;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8643 f10390;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(AbstractC8267.m13829(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f10390 = new C8643();
        TypedArray typedArrayM7182 = AbstractC3160.m7182(context2, attributeSet, AbstractC8661.f24433, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f10388 = typedArrayM7182.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f10387 = typedArrayM7182.getDimensionPixelOffset(2, 0);
        this.f10386 = typedArrayM7182.getDimensionPixelOffset(1, 0);
        setDividerColor(AbstractC7739.m13073(context2, typedArrayM7182, 0).getDefaultColor());
        typedArrayM7182.recycle();
    }

    public int getDividerColor() {
        return this.f10389;
    }

    public int getDividerInsetEnd() {
        return this.f10386;
    }

    public int getDividerInsetStart() {
        return this.f10387;
    }

    public int getDividerThickness() {
        return this.f10388;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.f10386 : this.f10387;
        if (z) {
            width = getWidth();
            i = this.f10387;
        } else {
            width = getWidth();
            i = this.f10386;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        C8643 c8643 = this.f10390;
        c8643.setBounds(i2, 0, i3, bottom);
        c8643.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f10388;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f10389 != i) {
            this.f10389 = i;
            this.f10390.m14341(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.f10386 = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f10387 = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f10388 != i) {
            this.f10388 = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
