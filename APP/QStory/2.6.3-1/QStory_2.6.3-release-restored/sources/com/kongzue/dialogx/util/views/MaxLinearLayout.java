package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p277.AbstractC9076;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaxLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11986;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f11987;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f11988;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11989;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f11990;

    public MaxLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11986 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9076.f23161);
            this.f11990 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f11988 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f11989 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f11987 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i = this.f11989;
        this.f11989 = i == 0 ? getMinimumWidth() : i;
        int i2 = this.f11987;
        this.f11987 = i2 == 0 ? getMinimumHeight() : i2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f11986 == -1 && size2 != 0) {
            this.f11986 = size2;
        }
        int i3 = this.f11988;
        if (size > i3 && i3 != 0) {
            size = i3;
        }
        int i4 = this.f11990;
        if (size2 > i4 && i4 != 0) {
            size2 = i4;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f11987 = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f11989 = i;
        super.setMinimumWidth(i);
    }
}
