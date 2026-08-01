package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3159;
import p253.AbstractC8189;
import p268.AbstractC8266;
import p305.C8651;
import p314.AbstractC8669;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10381;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f10382;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10383;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f10384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8651 f10385;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(AbstractC8266.m13812(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f10385 = new C8651();
        TypedArray typedArrayM7195 = AbstractC3159.m7195(context2, attributeSet, AbstractC8669.f24442, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f10383 = typedArrayM7195.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f10382 = typedArrayM7195.getDimensionPixelOffset(2, 0);
        this.f10381 = typedArrayM7195.getDimensionPixelOffset(1, 0);
        setDividerColor(AbstractC8189.m13678(context2, typedArrayM7195, 0).getDefaultColor());
        typedArrayM7195.recycle();
    }

    public int getDividerColor() {
        return this.f10384;
    }

    public int getDividerInsetEnd() {
        return this.f10381;
    }

    public int getDividerInsetStart() {
        return this.f10382;
    }

    public int getDividerThickness() {
        return this.f10383;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.f10381 : this.f10382;
        if (z) {
            width = getWidth();
            i = this.f10382;
        } else {
            width = getWidth();
            i = this.f10381;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        C8651 c8651 = this.f10385;
        c8651.setBounds(i2, 0, i3, bottom);
        c8651.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f10383;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f10384 != i) {
            this.f10384 = i;
            this.f10385.m14323(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.f10381 = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f10382 = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f10383 != i) {
            this.f10383 = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
