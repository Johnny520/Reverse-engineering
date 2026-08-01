package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3992;
import p191.AbstractC8568;
import p284.AbstractC9096;
import p321.C9472;
import p330.AbstractC9490;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f10731;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f10732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10733;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f10734;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9472 f10735;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(AbstractC9096.m14388(context, attributeSet, C0328R.attr.materialDividerStyle, C0328R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, C0328R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f10735 = new C9472();
        TypedArray typedArrayM7741 = AbstractC3992.m7741(context2, attributeSet, AbstractC9490.f24778, C0328R.attr.materialDividerStyle, C0328R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f10733 = typedArrayM7741.getDimensionPixelSize(3, getResources().getDimensionPixelSize(C0328R.dimen.material_divider_thickness));
        this.f10732 = typedArrayM7741.getDimensionPixelOffset(2, 0);
        this.f10731 = typedArrayM7741.getDimensionPixelOffset(1, 0);
        setDividerColor(AbstractC8568.m13632(context2, typedArrayM7741, 0).getDefaultColor());
        typedArrayM7741.recycle();
    }

    public int getDividerColor() {
        return this.f10734;
    }

    public int getDividerInsetEnd() {
        return this.f10731;
    }

    public int getDividerInsetStart() {
        return this.f10732;
    }

    public int getDividerThickness() {
        return this.f10733;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.f10731 : this.f10732;
        if (z) {
            width = getWidth();
            i = this.f10732;
        } else {
            width = getWidth();
            i = this.f10731;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        C9472 c9472 = this.f10735;
        c9472.setBounds(i2, 0, i3, bottom);
        c9472.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f10733;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f10734 != i) {
            this.f10734 = i;
            this.f10735.m14900(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.f10731 = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f10732 = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f10733 != i) {
            this.f10733 = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
